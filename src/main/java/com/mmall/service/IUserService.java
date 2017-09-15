package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by xiongpc on 2017/9/16.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
