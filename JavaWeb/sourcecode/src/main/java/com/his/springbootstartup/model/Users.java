package com.his.springbootstartup.model;


public class Users {

    private int id;
    private String loginName;
    private String passWord;
    private String trueName;
    private int userTypeID;
    private int doctorTitleID;
    private String whetherSchedule;
    private int departmentID;
    private int registrationLevelID;
    private int delete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }

    public int getDoctorTitleID() {
        return doctorTitleID;
    }

    public void setDoctorTitleID(int doctorTitleID) {
        this.doctorTitleID = doctorTitleID;
    }

    public String getWhetherSchedule() {
        return whetherSchedule;
    }

    public void setWhetherSchedule(String whetherSchedule) {
        this.whetherSchedule = whetherSchedule;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getRegistrationLevelID() {
        return registrationLevelID;
    }

    public void setRegistrationLevelID(int registrationLevelID) {
        this.registrationLevelID = registrationLevelID;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
