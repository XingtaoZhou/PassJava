package com.zxt.passjava.study.dao;

import com.zxt.passjava.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 13:56:34
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
