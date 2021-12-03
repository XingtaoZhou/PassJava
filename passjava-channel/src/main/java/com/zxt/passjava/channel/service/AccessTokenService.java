package com.zxt.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxt.common.utils.PageUtils;
import com.zxt.passjava.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author zxt
 * @email 1632561836@qq.com
 * @date 2021-12-03 11:40:36
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

