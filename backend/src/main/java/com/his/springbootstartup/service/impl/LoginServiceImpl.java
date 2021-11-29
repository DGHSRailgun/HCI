package com.his.springbootstartup.service.impl;

import com.his.springbootstartup.dao.LoginMapper;
import com.his.springbootstartup.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    public String login(String loginName,String passWord){
        return loginMapper.login(loginName,passWord);
    }

    public String docLogin(String loginName,String passWord){
        return loginMapper.docLogin(loginName,passWord);
    }

}
