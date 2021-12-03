package com.zxt.passjava.content.dao;

import com.zxt.passjava.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 11:49:49
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
