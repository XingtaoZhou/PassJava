package com.zxt.passjava.channel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxt.common.utils.PageUtils;
import com.zxt.common.utils.Query;

import com.zxt.passjava.channel.dao.AccessTokenDao;
import com.zxt.passjava.channel.entity.AccessTokenEntity;
import com.zxt.passjava.channel.service.AccessTokenService;


@Service("accessTokenService")
public class AccessTokenServiceImpl extends ServiceImpl<AccessTokenDao, AccessTokenEntity> implements AccessTokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AccessTokenEntity> page = this.page(
                new Query<AccessTokenEntity>().getPage(params),
                new QueryWrapper<AccessTokenEntity>()
        );

        return new PageUtils(page);
    }

}