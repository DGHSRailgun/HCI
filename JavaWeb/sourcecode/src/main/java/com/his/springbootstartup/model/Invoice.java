package com.his.springbootstartup.model;

public class Invoice {
    private int id;
    private int invNum;
    private float invAmount;
    private int invStatus;
    private String time;
    private int charefEmployeeId;
    private int regId;
    private int chaTypeId;
    private int reftochaInvoiceNo;
    private int invproStatus;
    private int delete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public float getInvAmount() {
        return invAmount;
    }

    public void setInvAmount(float invAmount) {
        this.invAmount = invAmount;
    }

    public int getInvStatus() {
        return invStatus;
    }

    public void setInvStatus(int invStatus) {
        this.invStatus = invStatus;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCharefEmployeeId() {
        return charefEmployeeId;
    }

    public void setCharefEmployeeId(int charefEmployeeId) {
        this.charefEmployeeId = charefEmployeeId;
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public int getChaTypeId() {
        return chaTypeId;
    }

    public void setChaTypeId(int chaTypeId) {
        this.chaTypeId = chaTypeId;
    }

    public int getReftochaInvoiceNo() {
        return reftochaInvoiceNo;
    }

    public void setReftochaInvoiceNo(int reftochaInvoiceNo) {
        this.reftochaInvoiceNo = reftochaInvoiceNo;
    }

    public int getInvproStatus() {
        return invproStatus;
    }

    public void setInvproStatus(int invproStatus) {
        this.invproStatus = invproStatus;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
