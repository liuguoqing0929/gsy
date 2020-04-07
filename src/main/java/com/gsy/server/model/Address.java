package com.gsy.server.model;

import java.io.Serializable;

public class Address implements Serializable {
    // 主键
    private String id;
    // 关联wx_user的openId
    private String openId;
    // 收货人
    private String consignee;
    // 手机号
    private String phone;
    // 省份
    private String province;
    // 城市
    private String city;
    // 区
    private String district;
    // 街道
    private String street;
    // 详细地址
    private String detail_street;
    // 是否是默认地址（1：是；0：否）只能有一个默认地址
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDetail_street() {
        return detail_street;
    }

    public void setDetail_street(String detail_street) {
        this.detail_street = detail_street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
