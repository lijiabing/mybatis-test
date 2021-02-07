package com.drips.mybatis.service;

import com.drips.mybatis.entity.User;

import java.util.List;

/**
 * @author lijb
 */
public interface UserService {

    List<User> findAll();
}
