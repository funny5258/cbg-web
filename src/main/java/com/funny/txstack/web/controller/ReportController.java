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
}
