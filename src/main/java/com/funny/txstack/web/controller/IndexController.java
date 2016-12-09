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
import com.funny.txstack.entity.cbg.RoleDataEntity;
import com.funny.txstack.entity.cbg.RoleSearch;
import com.funny.txstack.service.RoleService;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private RoleService roleService;

    @RequestMapping("/cbg")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/cbg");

        return modelAndView;
    }

    @RequestMapping("/api/query")
    @ResponseBody
    public JsonResult query(RoleSearch roleSearch) {
        JsonResult jsonResult = new JsonResult();
        try {
            makeSearch(roleSearch);
            PageInfo<RoleDataEntity> pageInfo = roleService.findByCondition(roleSearch);
            List<RoleDataEntity> roleList = pageInfo.getList();
            makeResult(roleList);
            pageInfo.setList(roleList);
            jsonResult.setSuccess(pageInfo);
        } catch (Exception e) {
            logger.error("查询异常,roleSearch={}", JSON.toJSONString(roleSearch), e);
            jsonResult.setFail("查询异常");
        }
        return jsonResult;
    }

    @RequestMapping("/page")
    public ModelAndView page(RoleSearch roleSearch) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/page");
        makeSearch(roleSearch);
        PageInfo<RoleDataEntity> pageInfo = roleService.findByCondition(roleSearch);
        modelAndView.addObject("pageBean", pageInfo);
        List<RoleDataEntity> roleList = pageInfo.getList();
        makeResult(roleList);
        modelAndView.addObject("roleList", roleList);
        return modelAndView;
    }

    private void makeSearch(RoleSearch roleSearch) {
        if (Strings.isNotBlank(roleSearch.getSchool())) {
            List<Integer> sch = Lists.newArrayList();
            String[] schArray = roleSearch.getSchool().split(",");
            for (String id : schArray) {
                sch.add(Integer.parseInt(id));
            }
            roleSearch.setSchoolList(sch);
        }
        if (roleSearch.getLvmin() == null) {
            roleSearch.setLvmin(69);
        }
    }

    private void makeResult(List<RoleDataEntity> roleList) {
        if (CollectionUtils.isNotEmpty(roleList)) {
            for (RoleDataEntity entity : roleList) {
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

    @RequestMapping("/404")
    public ModelAndView handle404() {
        ModelAndView modelAndView = new ModelAndView("/error/404");
        return modelAndView;
    }

    @RequestMapping("/500")
    public ModelAndView handle500() {
        ModelAndView modelAndView = new ModelAndView("/error/500");
        return modelAndView;
    }

}
