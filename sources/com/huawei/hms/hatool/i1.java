package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class i1 {
    public static i1 c;
    public Context a;
    public final Object b = new Object();

    public static i1 a() {
        if (c == null) {
            b();
        }
        return c;
    }

    public static synchronized void b() {
        synchronized (i1.class) {
            if (c == null) {
                c = new i1();
            }
        }
    }

    public final JSONObject a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                y.b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    public void a(Context context) {
        synchronized (this.b) {
            try {
                if (this.a != null) {
                    return;
                }
                this.a = context;
                h0.a().a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, int i) {
        h0.a().a(str, i);
    }

    public void a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        h0.a().a(str, i, str2, a(linkedHashMap));
    }

    public void a(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            h0.a().a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            y.f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }
}
