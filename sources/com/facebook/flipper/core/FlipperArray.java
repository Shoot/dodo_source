package com.facebook.flipper.core;

import com.facebook.flipper.core.FlipperObject;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class FlipperArray {
    final JSONArray mJson;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final JSONArray mJson = new JSONArray();

        public FlipperArray build() {
            return new FlipperArray(this.mJson);
        }

        public Builder put(String str) {
            this.mJson.put(str);
            return this;
        }

        public Builder put(Integer num) {
            this.mJson.put(num);
            return this;
        }

        public Builder put(Long l) {
            this.mJson.put(l);
            return this;
        }

        public Builder put(Float f) {
            JSONArray jSONArray = this.mJson;
            if (Float.isNaN(f.floatValue())) {
                f = null;
            }
            jSONArray.put(f);
            return this;
        }

        public Builder put(Double d) {
            JSONArray jSONArray = this.mJson;
            if (Double.isNaN(d.doubleValue())) {
                d = null;
            }
            jSONArray.put(d);
            return this;
        }

        public Builder put(Boolean bool) {
            this.mJson.put(bool);
            return this;
        }

        public Builder put(FlipperValue flipperValue) {
            return put(flipperValue.toFlipperObject());
        }

        public Builder put(FlipperArray flipperArray) {
            this.mJson.put(flipperArray == null ? null : flipperArray.mJson);
            return this;
        }

        public Builder put(Builder builder) {
            return put(builder.build());
        }

        public Builder put(FlipperObject flipperObject) {
            this.mJson.put(flipperObject == null ? null : flipperObject.mJson);
            return this;
        }

        public Builder put(FlipperObject.Builder builder) {
            return put(builder.build());
        }
    }

    public FlipperArray(JSONArray jSONArray) {
        this.mJson = jSONArray == null ? new JSONArray() : jSONArray;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.mJson.toString().equals(obj.toString());
    }

    public Object get(int i) {
        Object opt = this.mJson.opt(i);
        if (opt instanceof JSONObject) {
            return new FlipperObject((JSONObject) opt);
        }
        if (opt instanceof JSONArray) {
            return new FlipperArray((JSONArray) opt);
        }
        return opt;
    }

    public FlipperArray getArray(int i) {
        return new FlipperArray((JSONArray) this.mJson.opt(i));
    }

    public boolean getBoolean(int i) {
        return this.mJson.optBoolean(i);
    }

    public double getDouble(int i) {
        return this.mJson.optDouble(i);
    }

    public FlipperDynamic getDynamic(int i) {
        return new FlipperDynamic(this.mJson.opt(i));
    }

    public float getFloat(int i) {
        return (float) this.mJson.optDouble(i);
    }

    public int getInt(int i) {
        return this.mJson.optInt(i);
    }

    public long getLong(int i) {
        return this.mJson.optLong(i);
    }

    public FlipperObject getObject(int i) {
        return new FlipperObject((JSONObject) this.mJson.opt(i));
    }

    public String getString(int i) {
        return this.mJson.optString(i);
    }

    public int hashCode() {
        return this.mJson.hashCode();
    }

    public int length() {
        return this.mJson.length();
    }

    public String toJsonString() {
        return toString();
    }

    public String toString() {
        return this.mJson.toString();
    }

    public List<String> toStringList() {
        int length = length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(getString(i));
        }
        return arrayList;
    }

    public FlipperArray(String str) {
        try {
            this.mJson = new JSONArray(str);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
