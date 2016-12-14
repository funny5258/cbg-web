package com.funny.txstack.web.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.funny.txstack.common.JsonResult;
import com.funny.txstack.entity.cbg.CbgDataEntity;
import com.funny.txstack.entity.cbg.CbgSearch;
import com.funny.txstack.service.CbgRoleService;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class CbgController {
    private static final Logger logger = LoggerFactory.getLogger(CbgController.class);
    @Autowired
    private CbgRoleService cbgRoleService;

    @RequestMapping("/cbg")
    public ModelAndView index(Integer showDelBtn) {
        ModelAndView modelAndView = new ModelAndView("/cbg/cbg-list");
        modelAndView.addObject("showDelBtn", showDelBtn == null ? 0 : showDelBtn);
        return modelAndView;
    }

    @RequestMapping("/api/query")
    @ResponseBody
    public JsonResult query(CbgSearch cbgSearch) {
        JsonResult jsonResult = new JsonResult();
        try {
            makeSearch(cbgSearch);
            PageInfo<CbgDataEntity> pageInfo = cbgRoleService.findByCondition(cbgSearch);
            List<CbgDataEntity> roleList = pageInfo.getList();
            makeResult(roleList);
            pageInfo.setList(roleList);
            jsonResult.setSuccess(pageInfo);
        } catch (Exception e) {
            logger.error("查询异常,cbgSearch={}", JSON.toJSONString(cbgSearch), e);
            jsonResult.setFail("查询异常");
        }
        return jsonResult;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Long id) {
        JsonResult jsonResult = new JsonResult();
        try {
            cbgRoleService.deleteRole(id);
            jsonResult.setSuccess();
        } catch (Exception e) {
            logger.error("删除异常,id={}", id, e);
            jsonResult.setFail("删除异常");
        }
        return jsonResult;
    }

    @RequestMapping("/getCbgPage")
    public ModelAndView page(CbgSearch cbgSearch) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/cbg/cbg-page");
        makeSearch(cbgSearch);
        PageInfo<CbgDataEntity> pageInfo = cbgRoleService.findByCondition(cbgSearch);
        modelAndView.addObject("pageBean", pageInfo);
        List<CbgDataEntity> roleList = pageInfo.getList();
        makeResult(roleList);
        modelAndView.addObject("roleList", roleList);
        modelAndView.addObject("showDelBtn", cbgSearch.getShowDelBtn());
        return modelAndView;
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
        if (CollectionUtils.isNotEmpty(roleList)) {
            for (CbgDataEntity entity : roleList) {
                StringBuffer shizhuang = new StringBuffer();
                if (entity.getQinghua() != null && entity.getQinghua() == 1) {
                    shizhuang.append("青花;");
                }
                if (entity.getXuansu() != null && entity.getXuansu() == 1) {
                    shizhuang.append("玄素;");
                }
                if (entity.getHaitang() != null && entity.getHaitang() == 1) {
                    shizhuang.append("海棠;");
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
                StringBuffer teji = new StringBuffer();
                if (entity.getHuxin() == 1) {
                    teji.append("护心;");
                }
                if (entity.getWanfeng() == 1) {
                    teji.append("完封;");
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
                    other.append("势力副手;");
                }
                if (entity.getLightMenpai() != null && entity.getLightMenpai() == 1) {
                    other.append("门派轻功;");
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
                entity.setShizhuang(shizhuang.toString());
                entity.setTeji(teji.toString());
                entity.setOther(other.toString());
                entity.setYuanhun(yuanhun.toString());
            }
        }
    }
}
