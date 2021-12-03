package com.zxt.passjava.question.dao;

import com.zxt.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 10:03:45
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
