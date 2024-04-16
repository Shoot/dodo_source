package com.facebook.flipper.core;

import com.facebook.flipper.core.FlipperArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class FlipperObject {
    final JSONObject mJson;

    public FlipperObject(JSONObject jSONObject) {
        this.mJson = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean contains(String str) {
        return this.mJson.has(str);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.mJson.toString().equals(obj.toString());
    }

    public Object get(String str) {
        Object opt = this.mJson.opt(str);
        if (opt instanceof JSONObject) {
            return new FlipperObject((JSONObject) opt);
        }
        if (opt instanceof JSONArray) {
            return new FlipperArray((JSONArray) opt);
        }
        return opt;
    }

    public FlipperArray getArray(String str) {
        return new FlipperArray((JSONArray) this.mJson.opt(str));
    }

    public boolean getBoolean(String str) {
        return this.mJson.optBoolean(str);
    }

    public double getDouble(String str) {
        return this.mJson.optDouble(str);
    }

    public FlipperDynamic getDynamic(String str) {
        return new FlipperDynamic(this.mJson.opt(str));
    }

    public float getFloat(String str) {
        return (float) this.mJson.optDouble(str);
    }

    public int getInt(String str) {
        return this.mJson.optInt(str);
    }

    public long getLong(String str) {
        return this.mJson.optLong(str);
    }

    public FlipperObject getObject(String str) {
        return new FlipperObject((JSONObject) this.mJson.opt(str));
    }

    public String getString(String str) {
        if (this.mJson.isNull(str)) {
            return null;
        }
        return this.mJson.optString(str);
    }

    public int hashCode() {
        return this.mJson.hashCode();
    }

    public Iterator<String> keys() {
        return this.mJson.keys();
    }

    public String toJsonString() {
        return toString();
    }

    public String toString() {
        return this.mJson.toString();
    }

    public FlipperObject(String str) {
        try {
            this.mJson = new JSONObject(str);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private final JSONObject mJson = new JSONObject();

        public FlipperObject build() {
            return new FlipperObject(this.mJson);
        }

        public Builder put(String str, Object obj) {
            if (obj == null) {
                return put(str, (String) null);
            }
            if (obj instanceof Integer) {
                return put(str, (Integer) obj);
            }
            if (obj instanceof Long) {
                return put(str, (Long) obj);
            }
            if (obj instanceof Float) {
                return put(str, (Float) obj);
            }
            if (obj instanceof Double) {
                return put(str, (Double) obj);
            }
            if (obj instanceof String) {
                return put(str, (String) obj);
            }
            if (obj instanceof Boolean) {
                return put(str, (Boolean) obj);
            }
            if (obj instanceof Object[]) {
                return put(str, Arrays.deepToString((Object[]) obj));
            }
            if (obj instanceof FlipperObject) {
                return put(str, (FlipperObject) obj);
            }
            if (obj instanceof Builder) {
                return put(str, (Builder) obj);
            }
            if (obj instanceof FlipperArray) {
                return put(str, (FlipperArray) obj);
            }
            if (obj instanceof FlipperArray.Builder) {
                return put(str, (FlipperArray.Builder) obj);
            }
            if (obj instanceof FlipperValue) {
                return put(str, ((FlipperValue) obj).toFlipperObject());
            }
            return put(str, obj.toString());
        }

        public Builder put(String str, String str2) {
            try {
                this.mJson.put(str, str2);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, Integer num) {
            try {
                this.mJson.put(str, num);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, Long l) {
            try {
                this.mJson.put(str, l);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, Float f) {
            try {
                JSONObject jSONObject = this.mJson;
                if (Float.isNaN(f.floatValue())) {
                    f = null;
                }
                jSONObject.put(str, f);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, Double d) {
            try {
                JSONObject jSONObject = this.mJson;
                if (Double.isNaN(d.doubleValue())) {
                    d = null;
                }
                jSONObject.put(str, d);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, Boolean bool) {
            try {
                this.mJson.put(str, bool);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, FlipperValue flipperValue) {
            return put(str, flipperValue.toFlipperObject());
        }

        public Builder put(String str, FlipperArray flipperArray) {
            try {
                this.mJson.put(str, flipperArray == null ? null : flipperArray.mJson);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, FlipperArray.Builder builder) {
            return put(str, builder.build());
        }

        public Builder put(String str, FlipperObject flipperObject) {
            try {
                this.mJson.put(str, flipperObject == null ? null : flipperObject.mJson);
                return this;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder put(String str, Builder builder) {
            return put(str, builder.build());
        }
    }
}
