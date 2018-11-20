package com.funny.txstack.model.entity;


import java.util.List;

/**
 */
public class CbgSearch {
    private Integer pageNo = 1;
    private Integer pageSize = 20;

    private Integer showDelBtn = 0;
    /**
     * 门派
     */
    private String school;

    /**
     * 生命值
     */
    private Integer mhp;
    /**
     * 技力值
     */
    private Integer msp;
    /**
     * 修为
     */
    private Integer xiuwei;

    /**
     * 装备评价
     */
    private Integer equXiuwei;
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
     * 附伤
     */
    private Integer attadd;
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

    /**
     * 化解
     */
    private Integer attdef;
    /**
     * 身法
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
     * 知彼
     */
    private Integer defhuman;
    /**
     * 人祸
     */
    private Integer attackhuman;
    /**
     * 诛心
     */
    private Integer criAddP;

    /**
     * 御心
     */
    private Integer criSubP;
    /**
     * 万钧
     */
    private Integer thumpAddP;

    /**
     * 铁壁
     */
    private Integer thumpSubP;

    /**
     * 小攻
     */
    private Integer xiaogong;

    /**
     * 小法
     */
    private Integer xiaofa;

    /**
     * 最小等级
     */
    private Integer lvmin;
    /**
     * 最大等级
     */
    private Integer lvmax;
    /**
     * 最低价钱
     */
    private Integer pricemin;
    /**
     * 最高价钱
     */
    private Integer pricemax;

    /**
     * 加护
     */
    private Integer jiahu;

    /**
     * 炼护
     */
    private Integer lianhu;
    /**
     * 孩子天域
     */
    private Integer haiziTianyu;
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
     * 御风行等级
     */
    private Integer ligntMenpai;

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
    private Integer wanshengtianzun;

    /**
     * 业火
     */
    private Integer yehuo;
    /**
     * 毒浪鬼
     */
    private Integer dulanggui;
    /**
     * 是否vip9
     */
    private Integer vip9;
    /**
     * 碧海惊涛
     */
    private Integer bihai;
    /**
     * 鹰击长空
     */
    private Integer changkong;
    /**
     * 蟾宫折桂
     */
    private Integer changong;
    /**
     * 凤羽紫凰
     */
    private Integer fengyuzihuang;

    /**
     * 门派
     */
    private List<Integer> schoolList;
    /**
     * 1(时间),2(价钱)
     */
    private Integer price_des;
    /**
     * 1：69战场 2：74战场 3：79战场 4：地魂 5：天魂
     */
    private Integer lv_level;

    private Integer shuyinghengxie;
    private Integer tianyu;
    private Integer jinbi;
    private Integer junzi;
    private Integer dayu;
    private Integer yuanbao;

    private Integer haiziJiahu;
    private Integer renwuTianyu;
    private Integer maorixingguan;
    private Integer zhanying;


    private Integer qianyang;
    private Integer moyinli;
    private Integer mudanyuan;
    private Integer yinglongya;
    private Integer xuelongya;

    private Integer qihui;
    private Integer tianling;

    public Integer getQihui() {
        return qihui;
    }

    public void setQihui(Integer qihui) {
        this.qihui = qihui;
    }

    public Integer getTianling() {
        return tianling;
    }

    public void setTianling(Integer tianling) {
        this.tianling = tianling;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getLv_level() {
        return lv_level;
    }

    public void setLv_level(Integer lv_level) {
        this.lv_level = lv_level;
    }

    public Integer getPrice_des() {
        return price_des;
    }

    public void setPrice_des(Integer price_des) {
        this.price_des = price_des;
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

    public Integer getHaiziTianyu() {
        return haiziTianyu;
    }

    public void setHaiziTianyu(Integer haiziTianyu) {
        this.haiziTianyu = haiziTianyu;
    }

    public Integer getVip9() {
        return vip9;
    }

    public void setVip9(Integer vip9) {
        this.vip9 = vip9;
    }

    public List<Integer> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<Integer> schoolList) {
        this.schoolList = schoolList;
    }

    public Integer getJiahu() {
        return jiahu;
    }

    public void setJiahu(Integer jiahu) {
        this.jiahu = jiahu;
    }

    public Integer getPricemin() {
        return pricemin;
    }

    public void setPricemin(Integer pricemin) {
        this.pricemin = pricemin;
    }

    public Integer getPricemax() {
        return pricemax;
    }

    public void setPricemax(Integer pricemax) {
        this.pricemax = pricemax;
    }

    public Integer getLvmin() {
        return lvmin;
    }

    public void setLvmin(Integer lvmin) {
        this.lvmin = lvmin;
    }

    public Integer getLvmax() {
        return lvmax;
    }

    public void setLvmax(Integer lvmax) {
        this.lvmax = lvmax;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public Integer getXiaogong() {
        return xiaogong;
    }

    public void setXiaogong(Integer xiaogong) {
        this.xiaogong = xiaogong;
    }

    public Integer getXiaofa() {
        return xiaofa;
    }

    public void setXiaofa(Integer xiaofa) {
        this.xiaofa = xiaofa;
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

    public Integer getAttdef() {
        return attdef;
    }

    public void setAttdef(Integer attdef) {
        this.attdef = attdef;
    }

    public Integer getDefhuman() {
        return defhuman;
    }

    public void setDefhuman(Integer defhuman) {
        this.defhuman = defhuman;
    }

    public Integer getAttackhuman() {
        return attackhuman;
    }

    public void setAttackhuman(Integer attackhuman) {
        this.attackhuman = attackhuman;
    }

    public Integer getSract() {
        return sract;
    }

    public void setSract(Integer sract) {
        this.sract = sract;
    }

    public Integer getSrbody() {
        return srbody;
    }

    public void setSrbody(Integer srbody) {
        this.srbody = srbody;
    }

    public Integer getSrmind() {
        return srmind;
    }

    public void setSrmind(Integer srmind) {
        this.srmind = srmind;
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

    public Integer getAttackspeed() {
        return attackspeed;
    }

    public void setAttackspeed(Integer attackspeed) {
        this.attackspeed = attackspeed;
    }

    public Integer getThumpAddP() {
        return thumpAddP;
    }

    public void setThumpAddP(Integer thumpAddP) {
        this.thumpAddP = thumpAddP;
    }

    public Integer getThumpSubP() {
        return thumpSubP;
    }

    public void setThumpSubP(Integer thumpSubP) {
        this.thumpSubP = thumpSubP;
    }

    public Integer getStrong() {
        return strong;
    }

    public void setStrong(Integer strong) {
        this.strong = strong;
    }

    public Integer getBody() {
        return body;
    }

    public void setBody(Integer body) {
        this.body = body;
    }

    public Integer getQuick() {
        return quick;
    }

    public void setQuick(Integer quick) {
        this.quick = quick;
    }

    public Integer getDodge() {
        return dodge;
    }

    public void setDodge(Integer dodge) {
        this.dodge = dodge;
    }

    public Integer getSoul() {
        return soul;
    }

    public void setSoul(Integer soul) {
        this.soul = soul;
    }

    public Integer getMind() {
        return mind;
    }

    public void setMind(Integer mind) {
        this.mind = mind;
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

    public Integer getDulanggui() {
        return dulanggui;
    }

    public void setDulanggui(Integer dulanggui) {
        this.dulanggui = dulanggui;
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

    public Integer getFengyuzihuang() {
        return fengyuzihuang;
    }

    public void setFengyuzihuang(Integer fengyuzihuang) {
        this.fengyuzihuang = fengyuzihuang;
    }

    public Integer getShowDelBtn() {
        return showDelBtn;
    }

    public void setShowDelBtn(Integer showDelBtn) {
        this.showDelBtn = showDelBtn;
    }

    public Integer getShuyinghengxie() {
        return shuyinghengxie;
    }

    public void setShuyinghengxie(Integer shuyinghengxie) {
        this.shuyinghengxie = shuyinghengxie;
    }

    public Integer getTianyu() {
        return tianyu;
    }

    public void setTianyu(Integer tianyu) {
        this.tianyu = tianyu;
    }

    public Integer getJinbi() {
        return jinbi;
    }

    public void setJinbi(Integer jinbi) {
        this.jinbi = jinbi;
    }

    public Integer getJunzi() {
        return junzi;
    }

    public void setJunzi(Integer junzi) {
        this.junzi = junzi;
    }

    public Integer getDayu() {
        return dayu;
    }

    public void setDayu(Integer dayu) {
        this.dayu = dayu;
    }

    public Integer getYuanbao() {
        return yuanbao;
    }

    public void setYuanbao(Integer yuanbao) {
        this.yuanbao = yuanbao;
    }

    public Integer getHaiziJiahu() {
        return haiziJiahu;
    }

    public void setHaiziJiahu(Integer haiziJiahu) {
        this.haiziJiahu = haiziJiahu;
    }

    public Integer getRenwuTianyu() {
        return renwuTianyu;
    }

    public void setRenwuTianyu(Integer renwuTianyu) {
        this.renwuTianyu = renwuTianyu;
    }

    public Integer getMaorixingguan() {
        return maorixingguan;
    }

    public void setMaorixingguan(Integer maorixingguan) {
        this.maorixingguan = maorixingguan;
    }

    public Integer getZhanying() {
        return zhanying;
    }

    public void setZhanying(Integer zhanying) {
        this.zhanying = zhanying;
    }

    public Integer getQianyang() {
        return qianyang;
    }

    public void setQianyang(Integer qianyang) {
        this.qianyang = qianyang;
    }

    public Integer getMoyinli() {
        return moyinli;
    }

    public void setMoyinli(Integer moyinli) {
        this.moyinli = moyinli;
    }

    public Integer getMudanyuan() {
        return mudanyuan;
    }

    public void setMudanyuan(Integer mudanyuan) {
        this.mudanyuan = mudanyuan;
    }

    public Integer getYinglongya() {
        return yinglongya;
    }

    public void setYinglongya(Integer yinglongya) {
        this.yinglongya = yinglongya;
    }

    public Integer getXuelongya() {
        return xuelongya;
    }

    public void setXuelongya(Integer xuelongya) {
        this.xuelongya = xuelongya;
    }
}
