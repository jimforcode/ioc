package com.jim.business.bean;

import com.jim.business.Utils.CastUtil;

import java.util.Map;

/**
 * Created by zengjin on 2015/11/29.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(name);
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }


}
