package com.facebook.flipper.core;

import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class FlipperDynamic {
    private final Object mObject;

    public FlipperDynamic(Object obj) {
        this.mObject = obj;
    }

    public FlipperArray asArray() {
        Object obj = this.mObject;
        if (obj instanceof JSONArray) {
            return new FlipperArray((JSONArray) obj);
        }
        return (FlipperArray) obj;
    }

    public boolean asBoolean() {
        Object obj = this.mObject;
        if (obj == null) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public double asDouble() {
        Object obj = this.mObject;
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (!(obj instanceof Double)) {
            return 0.0d;
        }
        return ((Double) obj).doubleValue();
    }

    public float asFloat() {
        Object obj = this.mObject;
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (float) ((Long) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (!(obj instanceof Double)) {
            return 0.0f;
        }
        return ((Double) obj).floatValue();
    }

    public int asInt() {
        Object obj = this.mObject;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (!(obj instanceof Double)) {
            return 0;
        }
        return ((Double) obj).intValue();
    }

    public long asLong() {
        Object obj = this.mObject;
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).longValue();
        }
        if (!(obj instanceof Double)) {
            return 0L;
        }
        return ((Double) obj).longValue();
    }

    public FlipperObject asObject() {
        Object obj = this.mObject;
        if (obj instanceof JSONObject) {
            return new FlipperObject((JSONObject) obj);
        }
        return (FlipperObject) obj;
    }

    public String asString() {
        Object obj = this.mObject;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public Object raw() {
        return this.mObject;
    }
}
