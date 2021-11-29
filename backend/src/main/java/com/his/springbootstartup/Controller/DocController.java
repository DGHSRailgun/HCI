package com.his.springbootstartup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/docoperate")
public class DocController {

    @RequestMapping(value = "/",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(){
        return "system-base-test";
    }

}
