package com.zxt.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxt.common.utils.PageUtils;
import com.zxt.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 10:03:45
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

