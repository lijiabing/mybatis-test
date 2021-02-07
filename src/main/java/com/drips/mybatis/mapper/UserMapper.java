package com.drips.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.drips.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lijb
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getUser(@Param("id") long id);
}
