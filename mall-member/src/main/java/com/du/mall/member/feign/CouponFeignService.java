package com.du.mall.member.feign;

import com.du.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [一句话描述这个类的作用]
 * @Version : [v1.1]
 * @Date : [2022/6/2 22:12]
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/member/list")
    R memberCoupon();

}
