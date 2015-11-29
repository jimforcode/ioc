package com.jim.business.Utils;

import org.apache.commons.lang.ArrayUtils;

/**
 * Created by zengjin on 2015/11/28.
 */
public final class ArrayUtil {

    public static boolean isNotEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return ArrayUtil.isEmpty(array);
    }
}
