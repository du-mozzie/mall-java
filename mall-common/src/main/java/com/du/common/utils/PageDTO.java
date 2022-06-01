package com.du.common.utils;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;

import java.util.Map;


@Data
public class PageDTO {

    private String page;

    private String limit;

    private String order;

    public Map toMap() {
        return BeanUtil.beanToMap(this);
    }

}
