package com.drips.mybatis.dao;

import com.drips.mybatis.entity.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lijb
 */
public interface UserDao {

    @Select("SELECT * FROM USER")
    @ResultType(value = User.class)
    List<User> findAll();

}
