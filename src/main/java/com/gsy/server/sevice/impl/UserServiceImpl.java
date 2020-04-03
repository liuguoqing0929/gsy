package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.UserMapper;
import com.gsy.server.model.WechatUser;
import com.gsy.server.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public WechatUser getUserByOpenId(String openId) {

        return userMapper.getUserByOpenId(openId);
    }

    @Override
    public int addWechatUser(WechatUser wechatUser) {

        // 生成ID
        wechatUser.setId(UUID.randomUUID().toString());
        return userMapper.addWechatUser(wechatUser);
    }

    @Override
    public int editWechatUserByOpenId(WechatUser wechatUser) {

        return userMapper.editWechatUserByOpenId(wechatUser);
    }
}
