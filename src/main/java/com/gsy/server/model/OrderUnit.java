package com.gsy.server.model;

import java.io.Serializable;

/**
 * 订单单位
 */
public class OrderUnit implements Serializable {


    /**
     * 主键
     */
    private String id;

    /**
     *名称
     */
    private String unitName;

    /**
     * 编码
     */
    private String unitCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
}
