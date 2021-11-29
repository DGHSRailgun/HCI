package com.his.springbootstartup.model;

public class SettlementType {
    private int id;
    private String typeCodeId;
    private String typeName;
    private int preSeqNo;
    private int delete;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeCodeId() {
        return typeCodeId;
    }

    public void setTypeCodeId(String typeCodeId) {
        this.typeCodeId = typeCodeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getPreSeqNo() {
        return preSeqNo;
    }

    public void setPreSeqNo(int preSeqNo) {
        this.preSeqNo = preSeqNo;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

}
