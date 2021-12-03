package com.zxt.passjava.channel.dao;

import com.zxt.passjava.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 11:40:36
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
