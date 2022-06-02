package com.du.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.member.dao.MemberLoginLogDao;
import com.du.mall.member.entity.MemberLoginLogEntity;
import com.du.mall.member.service.MemberLoginLogService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [会员登录记录]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:12:59]
 */
@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLogEntity> implements MemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLoginLogEntity> page = this.page(
                new Query<MemberLoginLogEntity>().getPage(params),
                new QueryWrapper<MemberLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}