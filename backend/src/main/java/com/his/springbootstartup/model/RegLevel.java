package com.his.springbootstartup.model;

public class RegLevel {
    private int id;
    private String regCode;
    private String regName;
    private int preSeqNo;
    private int regFee;
    private int regLimitSize;
    private int delete;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public int getPreSeqNo() {
        return preSeqNo;
    }

    public void setPreSeqNo(int preSeqNo) {
        this.preSeqNo = preSeqNo;
    }

    public int getRegFee() {
        return regFee;
    }

    public void setRegFee(int regFee) {
        this.regFee = regFee;
    }

    public int getRegLimitSize() {
        return regLimitSize;
    }

    public void setRegLimitSize(int regLimitSize) {
        this.regLimitSize = regLimitSize;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }


}
