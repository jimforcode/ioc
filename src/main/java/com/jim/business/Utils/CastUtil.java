package com.jim.business.Utils;

import java.util.Objects;

/**
 * Created by zengjin on 2015/11/25.
 */
public final class CastUtil {
    public static String castString(Object object) {
        return CastUtil.castString(object, "");
    }

    public static String castString(Object object, String defaultValue) {
        return object != null ? String.valueOf(object) : defaultValue;
    }

    public static int castInt(Object object) {
        return CastUtil.castInt(object, 0);
    }

    public static int castInt(Object object, int defaultValue) {
        int intValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            try {
                intValue = Integer.parseInt(strValue);
            } catch (NumberFormatException e) {
                intValue = defaultValue;
            }
        }

        return intValue;
    }

    public static Long castLong(Object object) {
        return CastUtil.castLong(object, 0L);
    }

    public static Long castLong(Object object, Long defaultValue) {
        Long longValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            try {
                longValue = Long.parseLong(strValue);
            } catch (NumberFormatException e) {
                longValue = defaultValue;
            }
        }

        return longValue;
    }


}
