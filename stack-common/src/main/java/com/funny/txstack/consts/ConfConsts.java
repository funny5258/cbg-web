package com.funny.txstack.consts;

import java.util.ArrayList;
import java.util.List;

/**
 * * 配置中心  常量类
 *
 * @author fangli
 */
public class ConfConsts {
    /**
     * 配置中心 线索是否需要评分
     */
    public static final String SWITCH_DATA_SCORE = "switch_data_score";

    public static final String SWITCH_USE_REDIS = "switch_use_redis";

    public static final String SWITCH_DING_ALARM = "switch_ding_alarm";

    /**
     * 分配算法：1平均分配算法 2 量大优先算法 3 最快满足算法
     * 默认1
     */
    public static final String CONF_ALLOT_RULE = "conf_allot_rule";


    public static final String CONF_PHONE_ALLOT_DAYS = "conf_phone_allot_days";


    public static List<String> alarmList = new ArrayList<String>();

    public static String profile = "dev";
}
