package com.du.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.du.common.utils.PageUtils;
import com.du.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:10:49]
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

