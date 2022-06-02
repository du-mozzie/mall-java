package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.MemberPriceDao;
import com.du.mall.coupon.entity.MemberPriceEntity;
import com.du.mall.coupon.service.MemberPriceService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [商品会员价格]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}