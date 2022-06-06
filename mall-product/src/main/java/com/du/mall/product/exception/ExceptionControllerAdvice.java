package com.du.mall.product.exception;

import com.du.common.exception.BizExceptionEnum;
import com.du.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [统一异常拦截器]
 * @Version : [v1.1]
 * @Date : [2022/6/6 18:54]
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.du.mall.product.controller")
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("参数校验异常：{}", e.getMessage());
        BindingResult result = e.getBindingResult();
        Map<String, String> errorMap = new HashMap<>();
        result.getFieldErrors().forEach(fieldError -> errorMap.put(fieldError.getField(), fieldError.getDefaultMessage()));
        return R.error(BizExceptionEnum.ILLEGAL_FIELD_EXCEPTION.getCode(), "参数校验异常").put("data", errorMap);
    }

}
