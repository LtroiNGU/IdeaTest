package com.oliver.cheaterCounter.utils.methods;

import java.util.Map;

public class UtilsMap {
    private Object value;
    private int  respId;
    private Map mapData;

    public UtilsMap( Object value, int respId) {
        this.value = value;
        this.respId = respId;
    }

    public UtilsMap() {
    }

    public Object getValue() {
        return value;
    }

    public int getRespId() {
        return respId;
    }

    public Map successInfo(Object value ){
        this.respId=800;
        this.value=value;
        mapData.put("data",value);
        mapData.put("respId",respId);
        return  mapData;
    }
    public Map failInfo(Object value ){
        this.respId=801;
        this.value=value;
        mapData.put("data",value);
        mapData.put("respId",respId);
        return  mapData;
    }
}
