package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ConfigContainer.java */
/* loaded from: classes2.dex */
public class c {
    private static final Date h = new Date(0);
    private JSONObject a;
    private JSONObject b;
    private Date c;
    private JSONArray d;
    private JSONObject e;
    private long f;
    private JSONArray g;

    /* compiled from: ConfigContainer.java */
    /* loaded from: classes2.dex */
    public static class b {
        private JSONObject a;
        private Date b;
        private JSONArray c;
        private JSONObject d;
        private long e;
        private JSONArray f;

        public c a() throws JSONException {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public b b(Map<String, String> map) {
            this.a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(JSONArray jSONArray) {
            try {
                this.f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b h(long j) {
            this.e = j;
            return this;
        }

        private b() {
            this.a = new JSONObject();
            this.b = c.h;
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.e = 0L;
            this.f = new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < j().length(); i++) {
            JSONObject jSONObject = j().getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string3 = jSONArray.getString(i2);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    private static c d(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.a.toString().equals(((c) obj).toString());
    }

    public Set<String> f(c cVar) throws JSONException {
        JSONObject g = d(cVar.a).g();
        Map<String, Map<String, String>> c = c();
        Map<String, Map<String, String>> c2 = cVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!cVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(cVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !cVar.i().has(next)) || (!i().has(next) && cVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && cVar.i().has(next) && !i().getJSONObject(next).toString().equals(cVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (c.containsKey(next) != c2.containsKey(next)) {
                hashSet.add(next);
            } else if (c.containsKey(next) && c2.containsKey(next) && !c.get(next).equals(c2.get(next))) {
                hashSet.add(next);
            } else {
                g.remove(next);
            }
        }
        Iterator<String> keys2 = g.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.b;
    }

    public Date h() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public JSONObject i() {
        return this.e;
    }

    public JSONArray j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public String toString() {
        return this.a.toString();
    }

    private c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }
}
