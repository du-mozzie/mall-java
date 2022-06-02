package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.SkuLadderDao;
import com.du.mall.coupon.entity.SkuLadderEntity;
import com.du.mall.coupon.service.SkuLadderService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品阶梯价格]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements SkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuLadderEntity> page = this.page(
                new Query<SkuLadderEntity>().getPage(params),
                new QueryWrapper<SkuLadderEntity>()
        );

        return new PageUtils(page);
    }

}