package com.his.springbootstartup.service.impl;


import com.his.springbootstartup.dao.RegistrationMapper;
import com.his.springbootstartup.model.*;
import com.his.springbootstartup.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Resource
    private RegistrationMapper registrationMapper;

    public int generateMediNum(){
        return registrationMapper.generateMediNum();
    }
    public int generateInvNum(){
        return registrationMapper.generateInvNum();
    }
    public List<Contant> getSex(){
        return registrationMapper.getSex();
    }
    public List<Department> getDept(){
        return registrationMapper.getDept();
    }
    public List<Users> getInitDoc(){
        return registrationMapper.getInitDoc();
    }
    public List<RegLevel> getRegLevel(){
        return registrationMapper.getRegLevel();
    }
    public List<Contant> getChaType() {
        return registrationMapper.getChaType();
    }
    public String getRegFee(String regisId){
        return registrationMapper.getRegFee(regisId);
    }
    public List<Users> getDoc(String deptId,String reglevelId){
        return registrationMapper.getDoc(deptId,reglevelId);
    }
    public List<SettlementType> getSettType(){
        return registrationMapper.getSettType();
    }
    public RegistrationInfo getInfoFromMediNum(int mediBookNum) {
        return registrationMapper.getInfoFromMediNum(mediBookNum);
    }
    public void Registration(int medirecordNum,
                            String name,
                            String sex,
                            String idNum,
                            String birthDate,
                            int age,
                            String ageType,
                            String address,
                            String date,
                            String wuBie,
                            int regDeptId,
                            int regDocId,
                            int regLevelId,
                            int settlementTypeId,
                            String whetherMediBook){
        registrationMapper.Registration(medirecordNum,
                                        name,
                                        sex,
                                        idNum,
                                        birthDate,
                                        age,
                                        ageType,
                                        address,
                                        date,
                                        wuBie,
                                        regDeptId,
                                        regDocId,
                                        regLevelId,
                                        settlementTypeId,
                                        whetherMediBook);
    }

    public int getId(){
        return registrationMapper.getId();
    }



}
