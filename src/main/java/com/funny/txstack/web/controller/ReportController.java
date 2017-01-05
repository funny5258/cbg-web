package com.funny.txstack.web.controller;

import com.funny.txstack.common.JsonResult;
import com.funny.txstack.entity.cbg.ReportEntity;
import com.funny.txstack.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.funny.txstack.service.BangRoleService;

import java.util.List;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class ReportController {
    private static final Logger logger = LoggerFactory.getLogger(ReportController.class);
    @Autowired
    private ReportService reportService;

    @RequestMapping("/report")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/report/list");
        return modelAndView;
    }


    @RequestMapping("/report/school")
    @ResponseBody
    public JsonResult school() {
        JsonResult jsonResult = new JsonResult();
        List<ReportEntity>  reportEntityList =  reportService.getSchoolCount();
        jsonResult.setSuccess(reportEntityList);
        return jsonResult;
    }
    @RequestMapping("/report/equxiuwei")
    @ResponseBody
    public JsonResult equxiuwei() {
        JsonResult jsonResult = new JsonResult();
        List<ReportEntity>  reportEntityList =  reportService.getEquXiuweiCount();
        jsonResult.setSuccess(reportEntityList);
        return jsonResult;
    }
    @RequestMapping("/report/equ")
    @ResponseBody
    public JsonResult equ() {
        JsonResult jsonResult = new JsonResult();
        List<ReportEntity>  reportEntityList =  reportService.getEquCount();
        jsonResult.setSuccess(reportEntityList);
        return jsonResult;
    }
    @RequestMapping("/report/xiuwei")
    @ResponseBody
    public JsonResult xiuwei() {
        JsonResult jsonResult = new JsonResult();
        List<ReportEntity>  reportEntityList =  reportService.getXiuweiCount();
        jsonResult.setSuccess(reportEntityList);
        return jsonResult;
    }

    @RequestMapping("/report/server")
    @ResponseBody
    public JsonResult server() {
        JsonResult jsonResult = new JsonResult();
        List<ReportEntity>  reportEntityList =  reportService.getServerCount();
        jsonResult.setSuccess(reportEntityList);
        return jsonResult;
    }

    @RequestMapping("/report/family")
    @ResponseBody
    public JsonResult family() {
        JsonResult jsonResult = new JsonResult();
        List<ReportEntity>  reportEntityList =  reportService.getFamilyCount();
        jsonResult.setSuccess(reportEntityList);
        return jsonResult;
    }
}
