package com.zxt.passjava.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxt.common.utils.PageUtils;
import com.zxt.passjava.study.entity.StudyTimeEntity;

import java.util.Map;

/**
 * 学习-用户学习时常表
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 13:56:34
 */
public interface StudyTimeService extends IService<StudyTimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

