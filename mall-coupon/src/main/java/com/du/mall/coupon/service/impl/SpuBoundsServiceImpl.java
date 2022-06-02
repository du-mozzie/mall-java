package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.SpuBoundsDao;
import com.du.mall.coupon.entity.SpuBoundsEntity;
import com.du.mall.coupon.service.SpuBoundsService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品spu积分设置]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}