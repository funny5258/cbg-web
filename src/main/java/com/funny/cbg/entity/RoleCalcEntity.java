package com.funny.cbg.entity;


public class RoleCalcEntity {
    private Long id;
    /**
    * 
    */
    private String roleId;

    /**
    * 炼护
    */
    private Integer lianhu;

    /**
    * 孩子最大等级
    */
    private Integer haiziLv;

    /**
    * 孩子最大资质
    */
    private Integer haiziZizhi;

    /**
    * 孩子最大武学
    */
    private Integer haiziWuxue;

    /**
    * 御风行等级
    */
    private Integer ligntMenpai;

    /**
    * 觉醒等级
    */
    private Integer awakeLv;

    /**
    * 封禁之力等级
    */
    private Integer releaseLv;

    /**
    * 觉醒度
    */
    private Integer awakeValue;

    /**
    * 溟炼值
    */
    private Integer minglian;

    /**
    * 黛染青花
    */
    private Integer qinghua;

    /**
    * 玄素天成
    */
    private Integer xuansu;

    /**
    * 孤鸿月影
    */
    private Integer guhong;

    /**
    * 降云思暖
    */
    private Integer xiangyun;

    /**
    * 岸芷汀兰
    */
    private Integer tinglan;

    /**
    * 海棠未雨
    */
    private Integer haitang;

    /**
    * 飞天华裘
    */
    private Integer feihuhuaqiu;

    /**
    * 天狐霓裳
    */
    private Integer tianhulishang;

    /**
    * 仙狐彩诀
    */
    private Integer xianhucaijue;

    /**
    * 沧海桑田
    */
    private Integer canghaisangtian;

    /**
    * 夜雨江南
    */
    private Integer yeyujiangnan;

    /**
    * 挥砍防护
    */
    private Integer huikanfanghu;

    /**
    * 盾刺防护
    */
    private Integer duncifanghu;

    /**
    * 火元防护
    */
    private Integer huoyuanfanghu;

    /**
    * 水风毒防护
    */
    private Integer shuifengdufanghu;

    /**
    * 完封
    */
    private Integer wanfeng;

    /**
    * 护心
    */
    private Integer huxin;

    /**
    * 斗转变
    */
    private Integer douzhuanbian;

    /**
    * 移形换影
    */
    private Integer yixinghuanying;

    /**
    * 是否有太初
    */
    private Integer taichu;

    /**
    * 是否有势力副手
    */
    private Integer shilifushou;

    /**
    * 喜洋洋
    */
    private Integer xiyangyang;

    /**
    * 马王爷
    */
    private Integer mawangye;

    /**
    * 万胜天尊
    */
    private Integer wangshengtianzun;

    /**
    * 业火
    */
    private Integer yehuo;

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

    public void setLianhu(Integer lianhu) {
        this.lianhu = lianhu;
    }

    public Integer getLianhu() {
        return lianhu;
    }

    public void setHaiziLv(Integer haiziLv) {
        this.haiziLv = haiziLv;
    }

    public Integer getHaiziLv() {
        return haiziLv;
    }

    public void setHaiziZizhi(Integer haiziZizhi) {
        this.haiziZizhi = haiziZizhi;
    }

    public Integer getHaiziZizhi() {
        return haiziZizhi;
    }

    public void setHaiziWuxue(Integer haiziWuxue) {
        this.haiziWuxue = haiziWuxue;
    }

    public Integer getHaiziWuxue() {
        return haiziWuxue;
    }

    public void setLigntMenpai(Integer ligntMenpai) {
        this.ligntMenpai = ligntMenpai;
    }

    public Integer getLigntMenpai() {
        return ligntMenpai;
    }

    public void setAwakeLv(Integer awakeLv) {
        this.awakeLv = awakeLv;
    }

    public Integer getAwakeLv() {
        return awakeLv;
    }

    public void setReleaseLv(Integer releaseLv) {
        this.releaseLv = releaseLv;
    }

    public Integer getReleaseLv() {
        return releaseLv;
    }

    public void setAwakeValue(Integer awakeValue) {
        this.awakeValue = awakeValue;
    }

    public Integer getAwakeValue() {
        return awakeValue;
    }

    public void setMinglian(Integer minglian) {
        this.minglian = minglian;
    }

    public Integer getMinglian() {
        return minglian;
    }

    public void setQinghua(Integer qinghua) {
        this.qinghua = qinghua;
    }

    public Integer getQinghua() {
        return qinghua;
    }

    public void setXuansu(Integer xuansu) {
        this.xuansu = xuansu;
    }

    public Integer getXuansu() {
        return xuansu;
    }

    public void setGuhong(Integer guhong) {
        this.guhong = guhong;
    }

    public Integer getGuhong() {
        return guhong;
    }

    public void setXiangyun(Integer xiangyun) {
        this.xiangyun = xiangyun;
    }

    public Integer getXiangyun() {
        return xiangyun;
    }

    public void setTinglan(Integer tinglan) {
        this.tinglan = tinglan;
    }

    public Integer getTinglan() {
        return tinglan;
    }

    public void setHaitang(Integer haitang) {
        this.haitang = haitang;
    }

    public Integer getHaitang() {
        return haitang;
    }

    public void setFeihuhuaqiu(Integer feihuhuaqiu) {
        this.feihuhuaqiu = feihuhuaqiu;
    }

    public Integer getFeihuhuaqiu() {
        return feihuhuaqiu;
    }

    public void setTianhulishang(Integer tianhulishang) {
        this.tianhulishang = tianhulishang;
    }

    public Integer getTianhulishang() {
        return tianhulishang;
    }

    public void setXianhucaijue(Integer xianhucaijue) {
        this.xianhucaijue = xianhucaijue;
    }

    public Integer getXianhucaijue() {
        return xianhucaijue;
    }

    public void setCanghaisangtian(Integer canghaisangtian) {
        this.canghaisangtian = canghaisangtian;
    }

    public Integer getCanghaisangtian() {
        return canghaisangtian;
    }

    public void setYeyujiangnan(Integer yeyujiangnan) {
        this.yeyujiangnan = yeyujiangnan;
    }

    public Integer getYeyujiangnan() {
        return yeyujiangnan;
    }

    public void setHuikanfanghu(Integer huikanfanghu) {
        this.huikanfanghu = huikanfanghu;
    }

    public Integer getHuikanfanghu() {
        return huikanfanghu;
    }

    public void setDuncifanghu(Integer duncifanghu) {
        this.duncifanghu = duncifanghu;
    }

    public Integer getDuncifanghu() {
        return duncifanghu;
    }

    public void setHuoyuanfanghu(Integer huoyuanfanghu) {
        this.huoyuanfanghu = huoyuanfanghu;
    }

    public Integer getHuoyuanfanghu() {
        return huoyuanfanghu;
    }

    public void setShuifengdufanghu(Integer shuifengdufanghu) {
        this.shuifengdufanghu = shuifengdufanghu;
    }

    public Integer getShuifengdufanghu() {
        return shuifengdufanghu;
    }

    public void setWanfeng(Integer wanfeng) {
        this.wanfeng = wanfeng;
    }

    public Integer getWanfeng() {
        return wanfeng;
    }

    public void setHuxin(Integer huxin) {
        this.huxin = huxin;
    }

    public Integer getHuxin() {
        return huxin;
    }

    public void setDouzhuanbian(Integer douzhuanbian) {
        this.douzhuanbian = douzhuanbian;
    }

    public Integer getDouzhuanbian() {
        return douzhuanbian;
    }

    public void setYixinghuanying(Integer yixinghuanying) {
        this.yixinghuanying = yixinghuanying;
    }

    public Integer getYixinghuanying() {
        return yixinghuanying;
    }

    public void setTaichu(Integer taichu) {
        this.taichu = taichu;
    }

    public Integer getTaichu() {
        return taichu;
    }

    public void setShilifushou(Integer shilifushou) {
        this.shilifushou = shilifushou;
    }

    public Integer getShilifushou() {
        return shilifushou;
    }

    public void setXiyangyang(Integer xiyangyang) {
        this.xiyangyang = xiyangyang;
    }

    public Integer getXiyangyang() {
        return xiyangyang;
    }

    public void setMawangye(Integer mawangye) {
        this.mawangye = mawangye;
    }

    public Integer getMawangye() {
        return mawangye;
    }

    public void setWangshengtianzun(Integer wangshengtianzun) {
        this.wangshengtianzun = wangshengtianzun;
    }

    public Integer getWangshengtianzun() {
        return wangshengtianzun;
    }

    public void setYehuo(Integer yehuo) {
        this.yehuo = yehuo;
    }

    public Integer getYehuo() {
        return yehuo;
    }
}