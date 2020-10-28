package com.his.springbootstartup.model;

public class Contant {
    private int id;
    private int contantTypeId;
    private String contantCode;
    private String contantName;
    private int delete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContantTypeId() {
        return contantTypeId;
    }

    public void setContantTypeId(int contantTypeId) {
        this.contantTypeId = contantTypeId;
    }

    public String getContantCode() {
        return contantCode;
    }

    public void setContantCode(String contantCode) {
        this.contantCode = contantCode;
    }

    public String getContantName() {
        return contantName;
    }

    public void setContantName(String contantName) {
        this.contantName = contantName;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}
