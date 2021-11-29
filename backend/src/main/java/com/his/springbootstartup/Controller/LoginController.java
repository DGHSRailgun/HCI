package com.his.springbootstartup.Controller;

import com.his.springbootstartup.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/loginPage",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String loginCon(HttpServletRequest requset, HttpSession session){
        String loginName = requset.getParameter("loginName");
        String passWord = requset.getParameter("passWord");
        String tname = loginService.login(loginName,passWord);
        session.setAttribute("tname",passWord);
        if (tname == null){
            return "failure";
        }else{
            return "success";
        }
    }

    @RequestMapping(value = "/doclogin",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String docLoginCon(HttpServletRequest requset, HttpSession session){
        String loginName = requset.getParameter("loginName");
        String passWord = requset.getParameter("passWord");
        String tname = loginService.docLogin(loginName,passWord);
        session.setAttribute("tname",passWord);
        if (tname == null){
            return "Failure";
        }else{
            return "Success";
        }
    }

}
