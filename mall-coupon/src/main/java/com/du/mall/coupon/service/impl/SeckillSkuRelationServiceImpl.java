package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.SeckillSkuRelationDao;
import com.du.mall.coupon.entity.SeckillSkuRelationEntity;
import com.du.mall.coupon.service.SeckillSkuRelationService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [秒杀活动商品关联]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity> implements SeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuRelationEntity> page = this.page(
                new Query<SeckillSkuRelationEntity>().getPage(params),
                new QueryWrapper<SeckillSkuRelationEntity>()
        );

        return new PageUtils(page);
    }

}