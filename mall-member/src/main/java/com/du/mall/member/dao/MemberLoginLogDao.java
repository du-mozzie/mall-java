package com.du.mall.member.dao;

import com.du.mall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @Author : Du YingJie (2548425238@qq.com)
 * @Description : [会员登录记录]
 * @Version : [v1.1]
 * @Date : [2022-06-02 20:12:59]
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
