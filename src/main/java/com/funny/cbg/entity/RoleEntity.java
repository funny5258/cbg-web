package com.funny.cbg.entity;


public class RoleEntity {
    private Long id;
    /**
    * 角色id
    */
    private String equipId;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId == null ? null : equipId.trim();
    }

    public String getEquipId() {
        return equipId;
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
}