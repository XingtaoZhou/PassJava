package com.zxt.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxt.common.utils.PageUtils;
import com.zxt.passjava.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 10:03:45
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

