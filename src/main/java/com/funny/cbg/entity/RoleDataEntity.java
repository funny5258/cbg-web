package com.funny.cbg.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class RoleDataEntity {
    /**
     * 门派
     */
    private Integer sch;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 加护
     */
    private Integer jiahu;
    private Integer lianhu;

    /**
     * 角色名
     */
    private String name;

    /**
     * 价钱
     */
    private Integer price;

    /**
     * cbg链接
     */
    private String url;

    /**
     * 等级
     */
    private Integer lv;

    /**
     * 修为
     */
    private Integer xiuwei;

    /**
     * 装备评价
     */
    private Integer equXiuwei;

    /**
     * 追电
     */
    private Integer movespeed;

    /**
     * 疾语
     */
    private Integer castspeed;

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
     * 会心
     */
    private Integer critical;
    /**
     * 人祸
     */
    private Integer attackhuman;

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
     * 神明
     */
    private Integer inprotect;

    /**
     * 回避
     */
    private Integer avoid;

    private String shizhuang;

    private String teji;

    private String other;

    private String expTime;

    private Integer lightMenpai;

    private Integer qinghua;
    private Integer xuansu;
    private Integer guhong;
    private Integer xiangyun;
    private Integer tinglan;
    private Integer haitang;
    private Integer feihuhuaqiu;
    private Integer tianhulishang;
    private Integer xianhucaijue;
    private Integer canghaisangtian;
    private Integer yeyujiangnan;
    private Integer huikanfanghu;
    private Integer duncifanghu;
    private Integer huoyuanfanghu;
    private Integer shuifengdufanghu;
    private Integer wanfeng;
    private Integer huxin;
    private Integer taichu;
    private Integer shilifushou;
    private Integer xiyangyang;
    private Integer mawangye;
    private Integer wanshengtianzun;
    private Integer yehuo;
    private Integer dulanggui;
    private String yuanhun;
    private Integer bihai;

    private Integer changkong;

    private Integer changong;
    private Integer vip9;
    private Integer haiziTianyu;

    public Integer getVip9() {
        return vip9;
    }

    public void setVip9(Integer vip9) {
        this.vip9 = vip9;
    }

    public Integer getHaiziTianyu() {
        return haiziTianyu;
    }

    public void setHaiziTianyu(Integer haiziTianyu) {
        this.haiziTianyu = haiziTianyu;
    }

    public Integer getBihai() {
        return bihai;
    }

    public void setBihai(Integer bihai) {
        this.bihai = bihai;
    }

    public Integer getChangkong() {
        return changkong;
    }

    public void setChangkong(Integer changkong) {
        this.changkong = changkong;
    }

    public Integer getChangong() {
        return changong;
    }

    public void setChangong(Integer changong) {
        this.changong = changong;
    }

    public String getYuanhun() {
        return yuanhun;
    }

    public void setYuanhun(String yuanhun) {
        this.yuanhun = yuanhun;
    }

    public Integer getDulanggui() {
        return dulanggui;
    }

    public void setDulanggui(Integer dulanggui) {
        this.dulanggui = dulanggui;
    }

    public Integer getLightMenpai() {
        return lightMenpai;
    }

    public void setLightMenpai(Integer lightMenpai) {
        this.lightMenpai = lightMenpai;
    }

    public Integer getLianhu() {
        return lianhu;
    }

    public void setLianhu(Integer lianhu) {
        this.lianhu = lianhu;
    }

    public Integer getSch() {
        return sch;
    }

    public void setSch(Integer sch) {
        this.sch = sch;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getJiahu() {
        return jiahu;
    }

    public void setJiahu(Integer jiahu) {
        this.jiahu = jiahu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
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

    public Integer getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(Integer movespeed) {
        this.movespeed = movespeed;
    }

    public Integer getCastspeed() {
        return castspeed;
    }

    public void setCastspeed(Integer castspeed) {
        this.castspeed = castspeed;
    }

    public Integer getPattackMax() {
        return pattackMax;
    }

    public void setPattackMax(Integer pattackMax) {
        this.pattackMax = pattackMax;
    }

    public Integer getMattackMax() {
        return mattackMax;
    }

    public void setMattackMax(Integer mattackMax) {
        this.mattackMax = mattackMax;
    }

    public Integer getPattackMin() {
        return pattackMin;
    }

    public void setPattackMin(Integer pattackMin) {
        this.pattackMin = pattackMin;
    }

    public Integer getMattackMin() {
        return mattackMin;
    }

    public void setMattackMin(Integer mattackMin) {
        this.mattackMin = mattackMin;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Integer getModadd() {
        return modadd;
    }

    public void setModadd(Integer modadd) {
        this.modadd = modadd;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getAttackhuman() {
        return attackhuman;
    }

    public void setAttackhuman(Integer attackhuman) {
        this.attackhuman = attackhuman;
    }

    public Integer getAttadd() {
        return attadd;
    }

    public void setAttadd(Integer attadd) {
        this.attadd = attadd;
    }

    public Integer getCriAddP() {
        return criAddP;
    }

    public void setCriAddP(Integer criAddP) {
        this.criAddP = criAddP;
    }

    public Integer getCriSubP() {
        return criSubP;
    }

    public void setCriSubP(Integer criSubP) {
        this.criSubP = criSubP;
    }

    public Integer getMdef() {
        return mdef;
    }

    public void setMdef(Integer mdef) {
        this.mdef = mdef;
    }

    public Integer getPdef() {
        return pdef;
    }

    public void setPdef(Integer pdef) {
        this.pdef = pdef;
    }

    public Integer getInprotect() {
        return inprotect;
    }

    public void setInprotect(Integer inprotect) {
        this.inprotect = inprotect;
    }

    public Integer getAvoid() {
        return avoid;
    }

    public void setAvoid(Integer avoid) {
        this.avoid = avoid;
    }

    public String getShizhuang() {
        return shizhuang;
    }

    public void setShizhuang(String shizhuang) {
        this.shizhuang = shizhuang;
    }

    public String getTeji() {
        return teji;
    }

    public void setTeji(String teji) {
        this.teji = teji;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }


    public String getExpTime() {
        return expTime;
    }

    public void setExpTime(String expTime) {
        this.expTime = expTime;
    }

    public Integer getQinghua() {
        return qinghua;
    }

    public void setQinghua(Integer qinghua) {
        this.qinghua = qinghua;
    }

    public Integer getXuansu() {
        return xuansu;
    }

    public void setXuansu(Integer xuansu) {
        this.xuansu = xuansu;
    }

    public Integer getGuhong() {
        return guhong;
    }

    public void setGuhong(Integer guhong) {
        this.guhong = guhong;
    }

    public Integer getXiangyun() {
        return xiangyun;
    }

    public void setXiangyun(Integer xiangyun) {
        this.xiangyun = xiangyun;
    }

    public Integer getTinglan() {
        return tinglan;
    }

    public void setTinglan(Integer tinglan) {
        this.tinglan = tinglan;
    }

    public Integer getHaitang() {
        return haitang;
    }

    public void setHaitang(Integer haitang) {
        this.haitang = haitang;
    }

    public Integer getFeihuhuaqiu() {
        return feihuhuaqiu;
    }

    public void setFeihuhuaqiu(Integer feihuhuaqiu) {
        this.feihuhuaqiu = feihuhuaqiu;
    }

    public Integer getTianhulishang() {
        return tianhulishang;
    }

    public void setTianhulishang(Integer tianhulishang) {
        this.tianhulishang = tianhulishang;
    }

    public Integer getXianhucaijue() {
        return xianhucaijue;
    }

    public void setXianhucaijue(Integer xianhucaijue) {
        this.xianhucaijue = xianhucaijue;
    }

    public Integer getCanghaisangtian() {
        return canghaisangtian;
    }

    public void setCanghaisangtian(Integer canghaisangtian) {
        this.canghaisangtian = canghaisangtian;
    }

    public Integer getYeyujiangnan() {
        return yeyujiangnan;
    }

    public void setYeyujiangnan(Integer yeyujiangnan) {
        this.yeyujiangnan = yeyujiangnan;
    }

    public Integer getHuikanfanghu() {
        return huikanfanghu;
    }

    public void setHuikanfanghu(Integer huikanfanghu) {
        this.huikanfanghu = huikanfanghu;
    }

    public Integer getDuncifanghu() {
        return duncifanghu;
    }

    public void setDuncifanghu(Integer duncifanghu) {
        this.duncifanghu = duncifanghu;
    }

    public Integer getHuoyuanfanghu() {
        return huoyuanfanghu;
    }

    public void setHuoyuanfanghu(Integer huoyuanfanghu) {
        this.huoyuanfanghu = huoyuanfanghu;
    }

    public Integer getShuifengdufanghu() {
        return shuifengdufanghu;
    }

    public void setShuifengdufanghu(Integer shuifengdufanghu) {
        this.shuifengdufanghu = shuifengdufanghu;
    }

    public Integer getWanfeng() {
        return wanfeng;
    }

    public void setWanfeng(Integer wanfeng) {
        this.wanfeng = wanfeng;
    }

    public Integer getHuxin() {
        return huxin;
    }

    public void setHuxin(Integer huxin) {
        this.huxin = huxin;
    }

    public Integer getTaichu() {
        return taichu;
    }

    public void setTaichu(Integer taichu) {
        this.taichu = taichu;
    }

    public Integer getShilifushou() {
        return shilifushou;
    }

    public void setShilifushou(Integer shilifushou) {
        this.shilifushou = shilifushou;
    }

    public Integer getXiyangyang() {
        return xiyangyang;
    }

    public void setXiyangyang(Integer xiyangyang) {
        this.xiyangyang = xiyangyang;
    }

    public Integer getMawangye() {
        return mawangye;
    }

    public void setMawangye(Integer mawangye) {
        this.mawangye = mawangye;
    }

    public Integer getWanshengtianzun() {
        return wanshengtianzun;
    }

    public void setWanshengtianzun(Integer wanshengtianzun) {
        this.wanshengtianzun = wanshengtianzun;
    }

    public Integer getYehuo() {
        return yehuo;
    }

    public void setYehuo(Integer yehuo) {
        this.yehuo = yehuo;
    }
}