package com.du.mall.coupon.dao;

import com.du.mall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [优惠券领取历史记录]
 * @Version : [v1.1]
 * @Date : [2022-06-02 00:46:25]
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
