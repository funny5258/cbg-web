package com.funny.txstack.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class IndexController {
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
