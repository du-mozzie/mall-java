package com.du.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.du.common.utils.PageUtils;
import com.du.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [订单操作历史记录]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:14:37]
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

