package com.funny.txstack.entity.cbg;

import com.funny.txstack.common.BaseEntity;

public class BangRoleEntity extends BaseEntity {
    private static final long serialVersionUID = 1480294573373L;
    private String roleId;
    private String server;
    private String name;
    private Integer level;
    private Integer school;
    private Integer xiuwei;
    private Integer equXiuwei;

    private String schoolText;

    public String getSchoolText() {
        return schoolText;
    }

    public void setSchoolText(String schoolText) {
        this.schoolText = schoolText;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getEquXiuwei() {
        return equXiuwei;
    }

    public void setEquXiuwei(Integer equXiuwei) {
        this.equXiuwei = equXiuwei;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}