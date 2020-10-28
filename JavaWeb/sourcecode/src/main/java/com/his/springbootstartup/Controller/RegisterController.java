package com.his.springbootstartup.Controller;

import com.his.springbootstartup.model.RegistrationInfo;
import com.his.springbootstartup.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;


@Controller
@RequestMapping("/registration")
public class RegisterController {
    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(value = "/",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(){
        return "index";
    }

    @GetMapping("/initpage")
    @ResponseBody
    public HashMap<String,Object> returninfo(){
        HashMap m = new HashMap();
        m.put("invNum",registrationService.generateInvNum());
        m.put("meidRecordNum",registrationService.generateMediNum());
        m.put("sex",registrationService.getSex());
        m.put("department",registrationService.getDept());
        m.put("doctor",registrationService.getInitDoc());
        m.put("settlementType",registrationService.getSettType());
        m.put("reglevel",registrationService.getRegLevel());
        m.put("chatype",registrationService.getChaType());
        return  m;
    }


    @GetMapping("/reregfee")
    @ResponseBody
    public String returnRegFee(HttpServletRequest hsr){
        Integer fee = new Integer(registrationService.getRegFee(hsr.getParameter("regisId")));
        return fee.toString();
    }

    @GetMapping("/redoc")
    @ResponseBody
    public HashMap<String,Object> returnDoc(HttpServletRequest hsr){
        HashMap m = new HashMap();
        m.put("doc",registrationService.getDoc(hsr.getParameter("deptId"),hsr.getParameter("reglevelId")));
        return m;
    }

    @GetMapping("/getoldinfo")
    @ResponseBody
    public HashMap<String,Object> returnInfo(HttpServletRequest hsr){
        RegistrationInfo registrationInfo = registrationService.getInfoFromMediNum(Integer.parseInt(hsr.getParameter("mediBookNum")));
        if (registrationInfo != null){
            String name = registrationInfo.getName();
            String sex = registrationInfo.getSex();
            String birthDate = registrationInfo.getBirthDate();
            String idNum = registrationInfo.getIdCardNo();
            HashMap m = new HashMap();
            m.put("name",name);
            m.put("sex",sex);
            m.put("birthDate",birthDate);
            m.put("idNum",idNum);
            return m;
        }else{
            HashMap m = new HashMap();
            m.put("messg","查无此人");
            return m;//查无此人的话就返回一个信息
        }
    }

    @GetMapping("/reg")
    @ResponseBody
    public String reg(HttpServletRequest hsr){
        int medirecordNum = Integer.parseInt(hsr.getParameter("medirecordNum"));
        String name = hsr.getParameter("name");
        String sex = hsr.getParameter("sex");
        String idNum = hsr.getParameter("idNum");
        String birthDate = hsr.getParameter("birthDate");
        int age = Integer.parseInt(hsr.getParameter("age"));
        String ageType = hsr.getParameter("ageType");
        String address = hsr.getParameter("address");
        String date = hsr.getParameter("date");
        String wuBie = hsr.getParameter("wuBie");
        int regDeptId = Integer.parseInt(hsr.getParameter("regDeptId"));
        int regDocId = Integer.parseInt(hsr.getParameter("regDocId"));
        int regLevelId = Integer.parseInt(hsr.getParameter("regLevelId"));
        int settlementTypeId = Integer.parseInt(hsr.getParameter("settlementTypeId"));
        String whetherMediBook = hsr.getParameter("whetherMediBook");

        registrationService.Registration(medirecordNum, name, sex, idNum, birthDate, age, ageType, address, date, wuBie,
                                         regDeptId, regDocId, regLevelId, settlementTypeId, whetherMediBook);
        return "aloha!";
    }

    @GetMapping("/getid")
    @ResponseBody
    public int getFinalId(){
        return registrationService.getId();
    }


}
