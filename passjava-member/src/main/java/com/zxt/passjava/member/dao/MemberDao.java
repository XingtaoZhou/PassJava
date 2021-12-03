package com.zxt.passjava.member.dao;

import com.zxt.passjava.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 11:55:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
