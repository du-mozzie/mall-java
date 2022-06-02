package com.du.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.du.common.utils.PageUtils;
import com.du.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品满减信息]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

