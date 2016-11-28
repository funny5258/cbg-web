package com.funny.txstack.service;

import com.google.common.collect.Lists;
import org.python.util.PythonInterpreter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

/**
 * Created by funny on 2016/11/28.
 */
public class SpiderService {
    private static final Logger logger = LoggerFactory.getLogger(SpiderService.class);

    public void spider() {
        logger.error("begin");
        Properties props = new Properties();
        props.put("python.home","/Library/Frameworks/Python.framework/Versions/3.5/lib");
        props.put("python.console.encoding", "UTF-8"); // Used to prevent: console: Failed to install '': java.nio.charset.UnsupportedCharsetException: cp0.
        props.put("python.security.respectJavaAccessibility", "false"); //don't respect java accessibility, so that we can access protected members on subclasses
        props.put("python.import.site","false");
        Properties preprops = System.getProperties();
        PythonInterpreter.initialize(preprops, props, new String[0]);

        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("/Users/funny/PycharmProjects/txspider/bang_role.py");
    }
}
