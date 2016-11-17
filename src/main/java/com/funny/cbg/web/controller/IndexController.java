package com.funny.cbg.web.controller;

import com.funny.cbg.entity.RoleDataEntity;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.funny.cbg.entity.RoleSearch;
import com.funny.cbg.service.RoleService;

import java.util.List;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class IndexController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");

        return modelAndView;
    }

    @RequestMapping("/page")
    public ModelAndView page(RoleSearch roleSearch) {
        ModelAndView modelAndView = new ModelAndView("/page");
        PageInfo<RoleDataEntity> pageInfo = roleService.findByCondition(roleSearch);
        modelAndView.addObject("pageBean", pageInfo);
        List<RoleDataEntity> roleList = pageInfo.getList();
        if (CollectionUtils.isNotEmpty(roleList)) {
            for (RoleDataEntity entity : roleList) {
                StringBuffer shizhuang = new StringBuffer();
                if (entity.getQinghua() == 1) {
                    shizhuang.append("青花;");
                }
                if (entity.getXuansu() == 1) {
                    shizhuang.append("玄素;");
                }
                if (entity.getHaitang() == 1) {
                    shizhuang.append("海棠;");
                }
                if (entity.getGuhong() == 1) {
                    shizhuang.append("孤鸿;");
                }
                if (entity.getXiangyun() == 1) {
                    shizhuang.append("绛云;");
                }
                if (entity.getTinglan() == 1) {
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
                StringBuffer teji = new StringBuffer();
                if (entity.getHuxin() == 1) {
                    teji.append("护心;");
                }
                if (entity.getFeihuhuaqiu() == 1) {
                    teji.append("完封;");
                }
                if (entity.getFeihuhuaqiu() == 1) {
                    teji.append("挥砍防护;");
                }
                if (entity.getFeihuhuaqiu() == 1) {
                    teji.append("钝刺防护;");
                }
                if (entity.getFeihuhuaqiu() == 1) {
                    teji.append("火元防护;");
                }
                if (entity.getFeihuhuaqiu() == 1) {
                    teji.append("水风毒防护;");
                }
                if (entity.getFeihuhuaqiu() == 1) {
                    teji.append("飞狐华裘;");
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

        modelAndView.addObject("roleList", roleList);
        return modelAndView;
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
