package com.du.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.coupon.dao.HomeSubjectDao;
import com.du.mall.coupon.entity.HomeSubjectEntity;
import com.du.mall.coupon.service.HomeSubjectService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】]
 * @Version : [v1.1]
 * @Date : [2022-06-02 00:46:25]
 */
@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubjectEntity> implements HomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectEntity> page = this.page(
                new Query<HomeSubjectEntity>().getPage(params),
                new QueryWrapper<HomeSubjectEntity>()
        );

        return new PageUtils(page);
    }

}