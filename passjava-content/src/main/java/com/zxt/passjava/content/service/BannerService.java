package com.zxt.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxt.common.utils.PageUtils;
import com.zxt.passjava.content.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 11:49:49
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

