package com.du.mall.coupon.dao;

import com.du.mall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】]
 * @Version : [v1.1]
 * @Date : [2022-06-02 00:46:25]
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
