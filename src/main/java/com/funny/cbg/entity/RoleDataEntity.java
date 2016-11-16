package com.funny.cbg.entity;


public class RoleDataEntity {
    private Long id;
    /**
    * 编号
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
     * 会心
     */
    private Integer critical;
    /**
     * 生命值
     */
    private Integer mhp;
    /**
     * 技力值
     */
    private Integer msp;
    /**
     * 性别
     */
    private Integer sex;

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
    /**
     * 毒浪鬼
     */
    private Integer dulanggui;

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

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
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

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getMhp() {
        return mhp;
    }

    public void setMhp(Integer mhp) {
        this.mhp = mhp;
    }

    public Integer getMsp() {
        return msp;
    }

    public void setMsp(Integer msp) {
        this.msp = msp;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLianhu() {
        return lianhu;
    }

    public void setLianhu(Integer lianhu) {
        this.lianhu = lianhu;
    }

    public Integer getHaiziLv() {
        return haiziLv;
    }

    public void setHaiziLv(Integer haiziLv) {
        this.haiziLv = haiziLv;
    }

    public Integer getHaiziZizhi() {
        return haiziZizhi;
    }

    public void setHaiziZizhi(Integer haiziZizhi) {
        this.haiziZizhi = haiziZizhi;
    }

    public Integer getHaiziWuxue() {
        return haiziWuxue;
    }

    public void setHaiziWuxue(Integer haiziWuxue) {
        this.haiziWuxue = haiziWuxue;
    }

    public Integer getLigntMenpai() {
        return ligntMenpai;
    }

    public void setLigntMenpai(Integer ligntMenpai) {
        this.ligntMenpai = ligntMenpai;
    }

    public Integer getAwakeLv() {
        return awakeLv;
    }

    public void setAwakeLv(Integer awakeLv) {
        this.awakeLv = awakeLv;
    }

    public Integer getReleaseLv() {
        return releaseLv;
    }

    public void setReleaseLv(Integer releaseLv) {
        this.releaseLv = releaseLv;
    }

    public Integer getAwakeValue() {
        return awakeValue;
    }

    public void setAwakeValue(Integer awakeValue) {
        this.awakeValue = awakeValue;
    }

    public Integer getMinglian() {
        return minglian;
    }

    public void setMinglian(Integer minglian) {
        this.minglian = minglian;
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

    public Integer getDouzhuanbian() {
        return douzhuanbian;
    }

    public void setDouzhuanbian(Integer douzhuanbian) {
        this.douzhuanbian = douzhuanbian;
    }

    public Integer getYixinghuanying() {
        return yixinghuanying;
    }

    public void setYixinghuanying(Integer yixinghuanying) {
        this.yixinghuanying = yixinghuanying;
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

    public Integer getWangshengtianzun() {
        return wangshengtianzun;
    }

    public void setWangshengtianzun(Integer wangshengtianzun) {
        this.wangshengtianzun = wangshengtianzun;
    }

    public Integer getYehuo() {
        return yehuo;
    }

    public void setYehuo(Integer yehuo) {
        this.yehuo = yehuo;
    }

    public Integer getDulanggui() {
        return dulanggui;
    }

    public void setDulanggui(Integer dulanggui) {
        this.dulanggui = dulanggui;
    }
}