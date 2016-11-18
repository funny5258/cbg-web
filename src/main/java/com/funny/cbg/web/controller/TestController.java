package com.funny.cbg.web.controller;

import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Controller;

/**
 * Created by fangli@autohome.com.cn on 2016/6/17.
 */
@Controller
public class TestController {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();

        interpreter.execfile("D:\\pywork\\txspider\\test.py");
    }
}
