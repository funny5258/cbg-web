package com.funny.txstack.filter;

import org.springframework.cglib.beans.BeanCopier;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangxuexiang
 * @desc
 * @date 16/9/19 下午3:41
 */
public class CachedBeanCopier {

    static final Map<String, BeanCopier> BEAN_COPIERS = new ConcurrentHashMap<String, BeanCopier>(15000);

    public static void copy(Object srcObj, Object destObj) {
        String key = genKey(srcObj.getClass(), destObj.getClass());
        BeanCopier copier = null;
        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(srcObj.getClass(), destObj.getClass(), false);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }
        copier.copy(srcObj, destObj, null);
    }

    private static String genKey(Class<?> srcClazz, Class<?> destClazz) {
        return srcClazz.getName() + "_" + destClazz.getName();
    }

}
