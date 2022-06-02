package com.du.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.du.common.utils.PageUtils;
import com.du.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [成长值变化历史记录]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:12:59]
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

