package com.his.springbootstartup.Controller;

import com.his.springbootstartup.model.Users;
import com.his.springbootstartup.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("index")
public class SelectController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("loginsuccess")
    public String ss(){
        return "success!";
    }

    @RequestMapping("loginfailure")
    public String ff(){
        return "failure!";
    }

    @RequestMapping("test")
    public String test(){
        Users users = usersService.selectById(1);
        System.out.println(users.getId());
        return users.getId() + " " + users.getLoginName() + "" + users.getPassWord();
    }
}
