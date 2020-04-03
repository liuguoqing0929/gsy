package com.gsy.server.mapper;

import com.gsy.server.model.WechatUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 根据 code 获取用户的唯一编码 openId
     * @param openId
     * @return
     */
    public WechatUser getUserByOpenId(String openId);

    /**
     * 添加 wechatUser 用户
     * @param wechatUser
     * @return
     */
    public int addWechatUser(WechatUser wechatUser);

    /**
     * 根据 openId 修改用户信息
     * @param wechatUser
     * @return
     */
    public int editWechatUserByOpenId(WechatUser wechatUser);
}
