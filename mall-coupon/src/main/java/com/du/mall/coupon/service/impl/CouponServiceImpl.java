package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.CouponDao;
import com.du.mall.coupon.entity.CouponEntity;
import com.du.mall.coupon.service.CouponService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [优惠券信息]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity> implements CouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponEntity> page = this.page(
                new Query<CouponEntity>().getPage(params),
                new QueryWrapper<CouponEntity>()
        );

        return new PageUtils(page);
    }

}