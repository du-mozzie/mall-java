package com.du.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.common.utils.PageUtils;
import com.du.common.utils.Query;

import com.du.mall.member.dao.MemberReceiveAddressDao;
import com.du.mall.member.entity.MemberReceiveAddressEntity;
import com.du.mall.member.service.MemberReceiveAddressService;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [会员收货地址]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:12:59]
 */
@Service("memberReceiveAddressService")
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressDao, MemberReceiveAddressEntity> implements MemberReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberReceiveAddressEntity> page = this.page(
                new Query<MemberReceiveAddressEntity>().getPage(params),
                new QueryWrapper<MemberReceiveAddressEntity>()
        );

        return new PageUtils(page);
    }

}