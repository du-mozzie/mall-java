package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.CouponHistoryDao;
import com.du.mall.coupon.entity.CouponHistoryEntity;
import com.du.mall.coupon.service.CouponHistoryService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [优惠券领取历史记录]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponHistoryEntity> page = this.page(
                new Query<CouponHistoryEntity>().getPage(params),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}