package com.funny.txstack.utils;


import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @author fangli
 */
public class VerifyUtil {
    private static final Pattern mobilePattern = Pattern.compile("^((13[0-9])|(14[0-9])|(15[0-9])|(18[0-9])|(16[0-9])|(19[0-9])|(17[0-9]))\\d{8}$");

    /**
     * @param str
     * @return boolean
     * true:格式正确时返回
     * false:格式错误时返回
     * @throws
     * @Description:检测手机号码 <br>
     * @Author: wangwenbin <br>
     * @Date: 2015年9月10日 <br>
     * @Time: 上午11:13:32 <br>
     */
    public static boolean isPhoneFormat(String str) {
        if (StringUtils.isBlank(str)) {
            return Boolean.FALSE;
        }
        if (mobilePattern.matcher(str).find()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * 检测手机号码，支持扩展号段
     *
     * @param phoneStr     校验的手机号
     * @param extendPhones 扩展号段，格式2位字符串数组，例如：增加16号段和19号段校验
     * @return true:格式正确时返回 false:格式错误时返回
     */
    public static boolean isPhoneFormatAndExtend(String phoneStr, String[] extendPhones) {
        boolean isPhone = false;
        try {
            isPhone = isPhoneFormat(phoneStr);
            if (!isPhone && extendPhones.length > 0) {
                String p = "";
                for (String extendPhone : extendPhones) {
                    if (extendPhone.length() == 2) {
                        p += "(" + extendPhone + "[0-9])|";
                    }
                }
                if (StringUtils.isNotBlank(p)) {
                    p = p.substring(0, p.length() - 1);
                    Pattern pattern = Pattern.compile("^(" + p + ")\\d{8}$");
                    if (pattern.matcher(phoneStr).find()) {
                        isPhone = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            isPhone = false;
        }
        return isPhone;
    }

    /**
     * 校验邮箱格式
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {
        System.out.println(isPhoneFormat("19915803922"));
    }

}
