package com.funny.txstack.web.controller;

import java.util.List;

import com.funny.txstack.common.JsonResult;
import com.funny.txstack.common.TXConstant;
import com.funny.txstack.service.BangRoleService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.funny.txstack.entity.cbg.BangRoleEntity;
import com.funny.txstack.entity.cbg.BangSearch;
import com.funny.txstack.service.CbgRoleService;
import com.github.pagehelper.PageInfo;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class BangController {
    private static final Logger logger = LoggerFactory.getLogger(BangController.class);
    @Autowired
    private BangRoleService bangRoleService;

    @RequestMapping("/bang")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/bang/bang-list");
        return modelAndView;
    }


    @RequestMapping("/getBangPage")
    public ModelAndView page(BangSearch bangSearch) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/bang/bang-page");
        PageInfo<BangRoleEntity> pageInfo = bangRoleService.findByCondition(bangSearch);
        modelAndView.addObject("pageBean", pageInfo);
        List<BangRoleEntity> roleList = pageInfo.getList();
        if(CollectionUtils.isEmpty(roleList)){
            return modelAndView;
        }
        for(BangRoleEntity entity:roleList){
            entity.setSchoolText(TXConstant.schoolMap.get(entity.getSchool()));
        }
        modelAndView.addObject("roleList", roleList);
        return modelAndView;
    }

    @RequestMapping("/bang/add")
    @ResponseBody
    public JsonResult add(String bang_url) {
        JsonResult jsonResult = new JsonResult();
        try {
            String roleId = "";
            // http://bang.tx3.163.com/bang/role/37_55540
            if(bang_url.startsWith("http://bang.tx3.163.com/bang/role")){
                String[] url_array = bang_url.split("/");
                roleId=url_array[5];
            }



            jsonResult.setSuccess();
        } catch (Exception e) {
            logger.error("添加英雄榜异常,url={}", bang_url, e);
            jsonResult.setFail("添加英雄榜异常");
        }
        return jsonResult;
    }
}
