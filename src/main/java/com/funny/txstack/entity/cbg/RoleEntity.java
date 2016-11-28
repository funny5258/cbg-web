package com.funny.txstack.entity.cbg;

import com.funny.txstack.common.BaseEntity;

import java.util.Date;

public class RoleEntity extends BaseEntity {
    private static final long serialVersionUID = 1480294569860L;

    /**
    * 角色id
    */
    private String roleId;

    /**
    * 加护
    */
    private Integer jiahu;

    /**
    * 角色名
    */
    private String name;

    /**
    * 服务器
    */
    private String serverId;

    /**
    * 价钱
    */
    private Integer price;

    /**
    * cbg链接
    */
    private String url;

    /**
    * 
    */
    private Date expTime;

    /**
    * 
    */
    private Integer craw;

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setJiahu(Integer jiahu) {
        this.jiahu = jiahu;
    }

    public Integer getJiahu() {
        return jiahu;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getName() {
        return name;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }

    public String getServerId() {
        return serverId;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    public Date getExpTime() {
        return expTime;
    }

    public void setCraw(Integer craw) {
        this.craw = craw;
    }

    public Integer getCraw() {
        return craw;
    }
}