package com.his.springbootstartup.service;

import com.his.springbootstartup.model.*;

import java.util.List;

public interface RegistrationService {
    int generateMediNum();
    int generateInvNum();
    List<Contant> getSex();
    List<Department> getDept();
    List<Users> getInitDoc();
    String getRegFee(String regisId);
    List<Users> getDoc(String deptId,String reglevelId);
    RegistrationInfo getInfoFromMediNum(int mediBookNum);
    List<SettlementType> getSettType();
    List<RegLevel> getRegLevel();
    List<Contant> getChaType();
    void Registration(int medirecordNum, String name, String sex, String idNum, String birthDate, int age, String ageType, String address,
                      String date, String wuBie, int regDeptId, int regDocId, int regLevelId, int settlementTypeId, String whetherMediBook);
    int getId();
}
