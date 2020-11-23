package com.itdfq.houtai.model;

/**
 * Created by DFQ on 2020/10/11 16:05
 */
public class Equipment {
    private Integer id;
    private  String equipNo;  //设备名称
    private  String  equipName;//省份
    private String address; //县区
    private  String remark; //具体位置
    private String delFlag;


    public Integer getId() {
        return id;
    }

    public String getEquipNo() {
        return equipNo;
    }

    public String getEquipName() {
        return equipName;
    }

    public String getAddress() {
        return address;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
