package com.his.springbootstartup.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.his.springbootstartup.model.Users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    Users selectById(@Param("id") Integer id);

}
