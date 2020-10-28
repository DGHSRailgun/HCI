package com.his.springbootstartup.dao;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.his.springbootstartup.model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Mapper
public interface RegistrationMapper extends BaseMapper<RegistrationInfo> {
    @Select("select max(MedicalRecord_Num)+1 from registration_info")
    public int generateMediNum();

    @Select("select max(Inv_Num)+1 from invoice")
    public int generateInvNum();

    @Select("select * from contant C where C.id >= 71 and C.id <= 72")
    public List<Contant> getSex();

    @Select("select * from department")
    public List<Department> getDept();

    @Select("select * from users where DoctorTitle_ID != 0 and RegistrationLevel_ID != 0")
    public List<Users> getInitDoc();

    @Select("select * from settlement_type")
    public List<SettlementType> getSettType();

    @Select("select * from reg_level")
    public List<RegLevel> getRegLevel();

    @Select("select * from contant where id >= 51 and id <= 58")
    public List<Contant> getChaType();

    @Select("select Reg_Fee from reg_level where id = #{regisId}")
    public String getRegFee(@Param("regisId") String regisId);

    @Select("select * from users US join department D where US.Department_ID = D.id and " +
                                                                   "D.id = #{deptId} and " +
                                                                   "US.DoctorTitle_ID != 0 and " +
                                                                   "US.RegistrationLevel_ID = #{reglevelId}")
    public List<Users> getDoc(@Param("deptId") String deptId,@Param("reglevelId") String reglevelId);

    @Select("select * from registration_info where MedicalRecord_Num = #{mediBookNum} limit 1")
    public RegistrationInfo getInfoFromMediNum(@Param("mediBookNum") int mediBookNum);

    @Insert("insert into registration_info (MedicalRecord_Num,Name,Sex,IDCard_NO,Birth_Date,Age,Age_Type,Address," +
            "Date,Wubie,RegDepart_ID,RegDoc_ID,RegLevel_ID,SettlementType_ID,WhetherMedical_Book,Reg_Time,Registrar_ID,Visit_State,`Delete`) " +
            "values (#{medirecordNum},#{name},#{sex},#{idNum},#{birthDate},#{age},#{ageType},#{address}," +
            "#{date},#{wuBie},#{regDeptId},#{regDocId},#{regLevelId},#{settlementTypeId},#{whetherMediBook},now(),9,171,1)")
    public void Registration(@Param("medirecordNum") int medirecordNum,
                             @Param("name") String name,
                             @Param("sex") String sex,
                             @Param("idNum") String idNum,
                             @Param("birthDate") String birthDate,
                             @Param("age") int age,
                             @Param("ageType") String ageType,
                             @Param("address") String address,
                             @Param("date") String date,
                             @Param("wuBie") String wuBie,
                             @Param("regDeptId") int regDeptId,
                             @Param("regDocId") int regDocId,
                             @Param("regLevelId") int regLevelId,
                             @Param("settlementTypeId") int settlementTypeId,
                             @Param("whetherMediBook") String whetherMediBook);

    @Select("select max(id) from registration_info")
    public int getId();

}
