package com.zxt.passjava.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxt.common.utils.PageUtils;
import com.zxt.passjava.study.entity.ViewLogEntity;

import java.util.Map;

/**
 * 学习-用户学习浏览记录表
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 13:56:34
 */
public interface ViewLogService extends IService<ViewLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

