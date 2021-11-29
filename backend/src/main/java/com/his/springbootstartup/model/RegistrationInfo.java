package com.his.springbootstartup.model;

import java.util.Date;

public class RegistrationInfo {
    private int id;
    private int medicalRecordNum;
    private String name;
    private String sex;
    private String idCardNo;
    private String birthDate;
    private int age;
    private String ageType;
    private String address;
    private Date date;
    private String wuBie;
    private int regDepartId;
    private int regDocId;
    private int regLevelId;
    private int settlementTypeId;
    private String whetherMediBook;
    private String regTime;
    private int registrarId;
    private int visitState;
    private int delete;

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(int medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWuBie() {
        return wuBie;
    }

    public void setWuBie(String wuBie) {
        this.wuBie = wuBie;
    }

    public int getRegDepartId() {
        return regDepartId;
    }

    public void setRegDepartId(int regDepartId) {
        this.regDepartId = regDepartId;
    }

    public int getRegDocId() {
        return regDocId;
    }

    public void setRegDocId(int regDocId) {
        this.regDocId = regDocId;
    }

    public int getRegLevelId() {
        return regLevelId;
    }

    public void setRegLevelId(int regLevelId) {
        this.regLevelId = regLevelId;
    }

    public int getSettlementTypeId() {
        return settlementTypeId;
    }

    public void setSettlementTypeId(int settlementTypeId) {
        this.settlementTypeId = settlementTypeId;
    }

    public String getWhetherMediBook() {
        return whetherMediBook;
    }

    public void setWhetherMediBook(String whetherMediBook) {
        this.whetherMediBook = whetherMediBook;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public int getRegistrarId() {
        return registrarId;
    }

    public void setRegistrarId(int registrarId) {
        this.registrarId = registrarId;
    }

    public int getVisitState() {
        return visitState;
    }

    public void setVisitState(int visitState) {
        this.visitState = visitState;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
