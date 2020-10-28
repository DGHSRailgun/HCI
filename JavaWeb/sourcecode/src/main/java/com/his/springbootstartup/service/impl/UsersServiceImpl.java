package com.his.springbootstartup.service.impl;

import com.his.springbootstartup.dao.UsersMapper;
import com.his.springbootstartup.model.Users;
import com.his.springbootstartup.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;
    public Users selectById(Integer id){
        return usersMapper.selectById(id);
    }
}
