package com.du.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.member.dao.MemberCollectSubjectDao;
import com.du.mall.member.entity.MemberCollectSubjectEntity;
import com.du.mall.member.service.MemberCollectSubjectService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [会员收藏的专题活动]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:12:59]
 */
@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity> implements MemberCollectSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSubjectEntity> page = this.page(
                new Query<MemberCollectSubjectEntity>().getPage(params),
                new QueryWrapper<MemberCollectSubjectEntity>()
        );

        return new PageUtils(page);
    }

}