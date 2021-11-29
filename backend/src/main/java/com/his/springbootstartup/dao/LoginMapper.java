package com.his.springbootstartup.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.his.springbootstartup.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper extends BaseMapper<Users> {
    @Select("select Login_Name from users where Login_Name = #{loginName} and Password = #{passWord} and DoctorTitle_ID = 0 and RegistrationLevel_ID = 0")
    public String login(@Param("loginName") String loginName,@Param("passWord") String passWord);

    @Select("select Login_Name from users where Login_Name = #{loginName} and Password = #{passWord} and DoctorTitle_ID != 0 and RegistrationLevel_ID != 0")
    public String docLogin(@Param("loginName") String loginName,@Param("passWord") String passWord);
}
