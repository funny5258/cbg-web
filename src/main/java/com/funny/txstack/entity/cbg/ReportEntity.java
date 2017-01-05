package com.funny.txstack.entity.cbg;

import com.funny.txstack.common.BaseEntity;

public class ReportEntity extends BaseEntity {
    private static final long serialVersionUID = 1480294573373L;
    private Integer count;
    private Integer school;

    private Integer xiuwei;
    private Integer equ;

    private Integer equXiuwei;

    private String server;
    private String area;
    private String family;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public Integer getXiuwei() {
        return xiuwei;
    }

    public void setXiuwei(Integer xiuwei) {
        this.xiuwei = xiuwei;
    }

    public Integer getEqu() {
        return equ;
    }

    public void setEqu(Integer equ) {
        this.equ = equ;
    }

    public Integer getEquXiuwei() {
        return equXiuwei;
    }

    public void setEquXiuwei(Integer equXiuwei) {
        this.equXiuwei = equXiuwei;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}