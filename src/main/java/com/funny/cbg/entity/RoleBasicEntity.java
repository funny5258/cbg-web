package com.funny.cbg.entity;


public class RoleBasicEntity {
    private Long id;
    /**
    * 编号
    */
    private String roleId;

    /**
    * 等级
    */
    private Integer lv;

    /**
    * 神启境界
    */
    private Integer flySoulPhase;

    /**
    * 神启等级
    */
    private String flySoulLv;

    /**
    * 修为
    */
    private Integer xiuwei;

    /**
    * 装备评价
    */
    private Integer equXiuwei;

    /**
    * 门派
    */
    private Integer sch;

    /**
    * 最大物攻
    */
    private Integer pattackMax;

    /**
    * 最大法攻
    */
    private Integer mattackMax;

    /**
    * 最小物攻
    */
    private Integer pattackMin;

    /**
    * 最小法攻
    */
    private Integer mattackMin;

    /**
    * 命中
    */
    private Integer hit;

    /**
    * 重击
    */
    private Integer modadd;

    /**
    * 附伤
    */
    private Integer attadd;

    /**
    * 诛心
    */
    private Integer criAddP;

    /**
    * 御心
    */
    private Integer criSubP;

    /**
    * 法防
    */
    private Integer mdef;

    /**
    * 物防
    */
    private Integer pdef;

    /**
    * 破阵
    */
    private Integer absolutelyAttack;

    /**
    * 磐石
    */
    private Integer absolutelyDefence;

    /**
    * 神明
    */
    private Integer inprotect;

    /**
    * 回避
    */
    private Integer avoid;

    /**
    * 化解
    */
    private Integer attdef;

    /**
    * 知彼
    */
    private Integer defhuman;

    /**
    * 人祸
    */
    private Integer attackhuman;

    /**
    * 身份
    */
    private Integer sract;

    /**
    * 坚韧
    */
    private Integer srbody;

    /**
    * 定力
    */
    private Integer srmind;

    /**
    * 追电
    */
    private Integer movespeed;

    /**
    * 疾语
    */
    private Integer castspeed;

    /**
    * 骤雨
    */
    private Integer attackspeed;

    /**
    * 万钧
    */
    private Integer thumpAddP;

    /**
    * 铁壁
    */
    private Integer thumpSubP;

    /**
    * 力
    */
    private Integer strong;

    /**
    * 体
    */
    private Integer body;

    /**
    * 敏
    */
    private Integer quick;

    /**
    * 疾
    */
    private Integer dodge;

    /**
    * 魂
    */
    private Integer soul;

    /**
    * 念
    */
    private Integer mind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getLv() {
        return lv;
    }

    public void setFlySoulPhase(Integer flySoulPhase) {
        this.flySoulPhase = flySoulPhase;
    }

    public Integer getFlySoulPhase() {
        return flySoulPhase;
    }

    public void setFlySoulLv(String flySoulLv) {
        this.flySoulLv = flySoulLv == null ? null : flySoulLv.trim();
    }

    public String getFlySoulLv() {
        return flySoulLv;
    }

    public void setXiuwei(Integer xiuwei) {
        this.xiuwei = xiuwei;
    }

    public Integer getXiuwei() {
        return xiuwei;
    }

    public void setEquXiuwei(Integer equXiuwei) {
        this.equXiuwei = equXiuwei;
    }

    public Integer getEquXiuwei() {
        return equXiuwei;
    }

    public void setSch(Integer sch) {
        this.sch = sch;
    }

    public Integer getSch() {
        return sch;
    }

    public void setPattackMax(Integer pattackMax) {
        this.pattackMax = pattackMax;
    }

    public Integer getPattackMax() {
        return pattackMax;
    }

    public void setMattackMax(Integer mattackMax) {
        this.mattackMax = mattackMax;
    }

    public Integer getMattackMax() {
        return mattackMax;
    }

    public void setPattackMin(Integer pattackMin) {
        this.pattackMin = pattackMin;
    }

    public Integer getPattackMin() {
        return pattackMin;
    }

    public void setMattackMin(Integer mattackMin) {
        this.mattackMin = mattackMin;
    }

    public Integer getMattackMin() {
        return mattackMin;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Integer getHit() {
        return hit;
    }

    public void setModadd(Integer modadd) {
        this.modadd = modadd;
    }

    public Integer getModadd() {
        return modadd;
    }

    public void setAttadd(Integer attadd) {
        this.attadd = attadd;
    }

    public Integer getAttadd() {
        return attadd;
    }

    public void setCriAddP(Integer criAddP) {
        this.criAddP = criAddP;
    }

    public Integer getCriAddP() {
        return criAddP;
    }

    public void setCriSubP(Integer criSubP) {
        this.criSubP = criSubP;
    }

    public Integer getCriSubP() {
        return criSubP;
    }

    public void setMdef(Integer mdef) {
        this.mdef = mdef;
    }

    public Integer getMdef() {
        return mdef;
    }

    public void setPdef(Integer pdef) {
        this.pdef = pdef;
    }

    public Integer getPdef() {
        return pdef;
    }

    public void setAbsolutelyAttack(Integer absolutelyAttack) {
        this.absolutelyAttack = absolutelyAttack;
    }

    public Integer getAbsolutelyAttack() {
        return absolutelyAttack;
    }

    public void setAbsolutelyDefence(Integer absolutelyDefence) {
        this.absolutelyDefence = absolutelyDefence;
    }

    public Integer getAbsolutelyDefence() {
        return absolutelyDefence;
    }

    public void setInprotect(Integer inprotect) {
        this.inprotect = inprotect;
    }

    public Integer getInprotect() {
        return inprotect;
    }

    public void setAvoid(Integer avoid) {
        this.avoid = avoid;
    }

    public Integer getAvoid() {
        return avoid;
    }

    public void setAttdef(Integer attdef) {
        this.attdef = attdef;
    }

    public Integer getAttdef() {
        return attdef;
    }

    public void setDefhuman(Integer defhuman) {
        this.defhuman = defhuman;
    }

    public Integer getDefhuman() {
        return defhuman;
    }

    public void setAttackhuman(Integer attackhuman) {
        this.attackhuman = attackhuman;
    }

    public Integer getAttackhuman() {
        return attackhuman;
    }

    public void setSract(Integer sract) {
        this.sract = sract;
    }

    public Integer getSract() {
        return sract;
    }

    public void setSrbody(Integer srbody) {
        this.srbody = srbody;
    }

    public Integer getSrbody() {
        return srbody;
    }

    public void setSrmind(Integer srmind) {
        this.srmind = srmind;
    }

    public Integer getSrmind() {
        return srmind;
    }

    public void setMovespeed(Integer movespeed) {
        this.movespeed = movespeed;
    }

    public Integer getMovespeed() {
        return movespeed;
    }

    public void setCastspeed(Integer castspeed) {
        this.castspeed = castspeed;
    }

    public Integer getCastspeed() {
        return castspeed;
    }

    public void setAttackspeed(Integer attackspeed) {
        this.attackspeed = attackspeed;
    }

    public Integer getAttackspeed() {
        return attackspeed;
    }

    public void setThumpAddP(Integer thumpAddP) {
        this.thumpAddP = thumpAddP;
    }

    public Integer getThumpAddP() {
        return thumpAddP;
    }

    public void setThumpSubP(Integer thumpSubP) {
        this.thumpSubP = thumpSubP;
    }

    public Integer getThumpSubP() {
        return thumpSubP;
    }

    public void setStrong(Integer strong) {
        this.strong = strong;
    }

    public Integer getStrong() {
        return strong;
    }

    public void setBody(Integer body) {
        this.body = body;
    }

    public Integer getBody() {
        return body;
    }

    public void setQuick(Integer quick) {
        this.quick = quick;
    }

    public Integer getQuick() {
        return quick;
    }

    public void setDodge(Integer dodge) {
        this.dodge = dodge;
    }

    public Integer getDodge() {
        return dodge;
    }

    public void setSoul(Integer soul) {
        this.soul = soul;
    }

    public Integer getSoul() {
        return soul;
    }

    public void setMind(Integer mind) {
        this.mind = mind;
    }

    public Integer getMind() {
        return mind;
    }
}