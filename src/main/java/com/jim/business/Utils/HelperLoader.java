package com.jim.business.Utils;

import com.jim.business.anotation.Controller;

/**
 * Created by zengjin on 2015/11/29.
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                Controller.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.locdClass(cls.getName(), true);
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(ClassHelper.getClassSet());
    }
}
