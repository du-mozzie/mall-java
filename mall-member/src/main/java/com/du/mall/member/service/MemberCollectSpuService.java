package com.du.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.du.common.utils.PageUtils;
import com.du.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [会员收藏的商品]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:12:59]
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

