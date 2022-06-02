package com.du.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.order.dao.OrderReturnReasonDao;
import com.du.mall.order.entity.OrderReturnReasonEntity;
import com.du.mall.order.service.OrderReturnReasonService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [退货原因]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:14:37]
 */
@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReasonEntity> page = this.page(
                new Query<OrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}