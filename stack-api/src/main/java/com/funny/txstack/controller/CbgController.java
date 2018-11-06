package com.funny.txstack.controller;

import java.util.List;

import com.funny.txstack.base.JsonResult;
import com.funny.txstack.model.entity.CbgDataEntity;
import com.funny.txstack.model.entity.CbgSearch;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.funny.txstack.service.CbgRoleService;
import com.github.pagehelper.PageInfo;

/**
 */
@Controller
@RequestMapping("/api")
public class CbgController {
    private static final Logger logger = LoggerFactory.getLogger(CbgController.class);
    @Autowired
    private CbgRoleService cbgRoleService;


    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Long id) {
        JsonResult jsonResult = new JsonResult();
        try {
            cbgRoleService.deleteRole(id);
            jsonResult.success();
        } catch (Exception e) {
            logger.error("删除异常,id={}", id, e);
            jsonResult.failMsg("删除异常");
        }
        return jsonResult;
    }

    @RequestMapping("/update")
    @ResponseBody
    public JsonResult update(Long id) {
        JsonResult jsonResult = new JsonResult();
        try {
            cbgRoleService.updateStatus(id);
            jsonResult.success();
        } catch (Exception e) {
            logger.error("更新角色状态失败,id={}", id, e);
            jsonResult.failMsg("更新角色状态失败");
        }
        return jsonResult;
    }

    @RequestMapping("/getLastDate")
    @ResponseBody
    public JsonResult getLastDate() {
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.successBody(cbgRoleService.findLatestUpdate());
        } catch (Exception e) {
            logger.error("获取最新日期失败", e);
            jsonResult.failMsg("获取最新日期失败");
        }
        return jsonResult;
    }

    @RequestMapping("/getCbgPage")
    @ResponseBody
    public JsonResult page(CbgSearch cbgSearch) throws Exception {
        JsonResult jsonResult = new JsonResult();
        try {
            makeSearch(cbgSearch);
            long start = System.currentTimeMillis();
            PageInfo<CbgDataEntity> pageInfo = cbgRoleService.findByCondition(cbgSearch);
            logger.info("query used time %s s", (System.currentTimeMillis() - start));
            makeResult(pageInfo.getList());
            jsonResult.successBody(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询角色异常,cbgSearch={}", JSON.toJSONString(cbgSearch), e);
        }
        return jsonResult;
    }

    private void makeSearch(CbgSearch cbgSearch) {
        if (Strings.isNotBlank(cbgSearch.getSchool())) {
            List<Integer> sch = Lists.newArrayList();
            String[] schArray = cbgSearch.getSchool().split(",");
            for (String id : schArray) {
                sch.add(Integer.parseInt(id));
            }
            cbgSearch.setSchoolList(sch);
        }
        if (cbgSearch.getLvmin() == null) {
            cbgSearch.setLvmin(69);
        }
    }

    private void makeResult(List<CbgDataEntity> roleList) {
        if (CollectionUtils.isEmpty(roleList)) {
            return;
        }
        for (CbgDataEntity entity : roleList) {
            StringBuffer shizhuang = new StringBuffer();
            if (entity.getLv() == null) {
                continue;
            }
            if (entity.getQinghua() != null && entity.getQinghua() == 1) {
                shizhuang.append("<font color='red'>青花;</font>");
            }
            if (entity.getXuansu() != null && entity.getXuansu() == 1) {
                shizhuang.append("<font color='red'>玄素;</font>");
            }
            if (entity.getHaitang() != null && entity.getHaitang() == 1) {
                shizhuang.append("<font color='red'>海棠;</font>");
            }
            if (entity.getGuhong() != null && entity.getGuhong() == 1) {
                shizhuang.append("孤鸿;");
            }
            if (entity.getXiangyun() != null && entity.getXiangyun() == 1) {
                shizhuang.append("绛云思暖;");
            }
            if (entity.getTinglan() != null && entity.getTinglan() == 1) {
                shizhuang.append("岸芷汀兰;");
            }
            if (entity.getTianhulishang() == 1) {
                shizhuang.append("天狐霓裳;");
            }
            if (entity.getFeihuhuaqiu() == 1) {
                shizhuang.append("飞狐华裘;");
            }
            if (entity.getXianhucaijue() == 1) {
                shizhuang.append("仙狐彩袂;");
            }
            if (entity.getCanghaisangtian() == 1) {
                shizhuang.append("沧海桑田;");
            }
            if (entity.getYeyujiangnan() == 1) {
                shizhuang.append("夜雨江南;");
            }
            if (entity.getBihai() == 1) {
                shizhuang.append("碧海惊涛;");
            }
            if (entity.getChangong() == 1) {
                shizhuang.append("蟾宫折桂;");
            }
            if (entity.getChangkong() == 1) {
                shizhuang.append("鹰击长空;");
            }
            if (entity.getFengyuzihuang() == 1) {
                shizhuang.append("凤羽紫凰;");
            }
            if (entity.getShuyinghengxie() == 1) {
                shizhuang.append("疏影横斜;");
            }
            StringBuffer teji = new StringBuffer();
            if (entity.getHuxin() == 1) {
                teji.append("<font color='red'>护心;</font>");
            }
            if (entity.getWanfeng() == 1) {
                teji.append("<font color='red'>完封;</font>");
            }
            if (entity.getHuikanfanghu() == 1) {
                teji.append("挥砍防护;");
            }
            if (entity.getDuncifanghu() == 1) {
                teji.append("钝刺防护;");
            }
            if (entity.getHuoyuanfanghu() == 1) {
                teji.append("火元防护;");
            }
            if (entity.getShuifengdufanghu() == 1) {
                teji.append("水风毒防护;");
            }
            StringBuffer other = new StringBuffer();
            if (entity.getTaichu() == 1) {
                other.append("太初;");
            }
            if (entity.getShilifushou() == 1) {
                other.append("<font color='red'>势力副手;</font>");
            }
            if (entity.getRenwuTianyu() == 1) {
                other.append("天域四代;");
            }
            if (entity.getLightMenpai() != null && entity.getLightMenpai() == 1) {
                other.append("<font color='red'>门派轻功;</font>");
            }
            if (entity.getVip9() == 1) {
                other.append("vip9;");
            }
            if (entity.getHaiziTiayu() == 1) {
                other.append("孩子天域;");
            }
            StringBuffer yuanhun = new StringBuffer();
            if (entity.getMawangye() == 1) {
                yuanhun.append("马王爷;");
            }
            if (entity.getXiyangyang() == 1) {
                yuanhun.append("喜洋洋;");
            }
            if (entity.getWanshengtianzun() == 1) {
                yuanhun.append("万圣天尊;");
            }
            if (entity.getYehuo() == 1) {
                yuanhun.append("业火;");
            }
            if (entity.getDulanggui() == 1) {
                yuanhun.append("毒浪鬼;");
            }
            if (entity.getMaorixingguan() == 1) {
                yuanhun.append("昴日星官;");
            }

            if (entity.getLeizuan() != null && entity.getLeizuan() > 1) {
                yuanhun.append("雷钻" + entity.getLeizuan() + ";");
            }

            if (entity.getHonglian() != null && entity.getHonglian() > 1) {
                yuanhun.append("红莲" + entity.getHonglian() + ";");
            }
            entity.setShizhuang(shizhuang.toString());
            entity.setTeji(teji.toString());
            entity.setOther(other.toString());
            entity.setYuanhun(yuanhun.toString());
        }
    }
}
