package com.funny.txstack.consts;

import com.google.common.collect.Maps;
import com.google.common.util.concurrent.AbstractScheduledService;

import java.util.Map;

/**
 * Created by funny on 2016/12/14.
 */
public class TXConstant {
    public static final Map<Integer,String> schoolMap = Maps.newHashMap();

    static {
        schoolMap.put(1,"荒火教");
        schoolMap.put(2,"天机营");
        schoolMap.put(3,"翎羽山庄");
        schoolMap.put(4,"魍魉");
        schoolMap.put(5,"太虚观");
        schoolMap.put(6,"云麓仙居");
        schoolMap.put(7,"冰心堂");
        schoolMap.put(8,"弈剑听雨阁");
        schoolMap.put(9,"鬼墨");
        schoolMap.put(10,"龙巫宫");
        schoolMap.put(11,"幽篁国");
    }
}
