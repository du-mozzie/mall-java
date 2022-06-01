package com.du.mall.order.dao;

import com.du.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [支付信息表]
 * @Version : [v1.1]
 * @Date : [2022-06-02 00:41:04]
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
