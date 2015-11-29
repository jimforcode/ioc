package com.jim.business.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by zengjin on 2015/11/28.
 */
public final class BeanHelper {

    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> beanClass : beanClassSet) {
            Object obj = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass, obj);
        }

    }

    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    public static <T> T getBean(Class<?> cls) {

        if (!BEAN_MAP.containsKey(cls)) {
            throw new RuntimeException("can not get bean by class!");
        }
        return (T) BEAN_MAP.get(cls);
    }
}
