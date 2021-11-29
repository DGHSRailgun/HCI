package com.his.springbootstartup.model;

public class Department {
    private int id;
    private String deptCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptCategoryId() {
        return deptCategoryId;
    }

    public void setDeptCategoryId(int deptCategoryId) {
        this.deptCategoryId = deptCategoryId;
    }

    public int getDeptType() {
        return deptType;
    }

    public void setDeptType(int deptType) {
        this.deptType = deptType;
    }

    private String deptName;
    private int deptCategoryId;
    private int deptType;
}
