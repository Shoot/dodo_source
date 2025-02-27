package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes3.dex */
public class w {
    public static Map<String, List<q>> a(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map<String, ?> a = g0.a(context, str);
        b(a);
        return a(a);
    }

    public static Map<String, List<q>> b(Context context, String str, String str2) {
        String a = g0.a(context, str, str2, "");
        HashMap hashMap = new HashMap();
        a(str2, a, hashMap);
        return hashMap;
    }

    public static Map<String, List<q>> a(Context context, String str, String str2) {
        Map<String, List<q>> a;
        Map<String, List<q>> a2;
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            y.c("hmsSdk", "read all event records");
            a = a(context, "stat_v2_1");
            a2 = a(context, "cached_v2_1");
        } else {
            String a3 = u0.a(str, str2);
            a = b(context, "stat_v2_1", a3);
            a2 = b(context, "cached_v2_1", a3);
        }
        return a(a, a2);
    }

    public static void b(Map<String, ?> map) {
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        Set<String> a = u0.a(b.b());
        while (it.hasNext()) {
            if (!a.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    public static Map<String, List<q>> a(Map<String, ?> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                a(key, (String) entry.getValue(), hashMap);
            }
        }
        return hashMap;
    }

    public static Map<String, List<q>> a(Map<String, List<q>> map, Map<String, List<q>> map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map2);
        return hashMap;
    }

    public static void a(String str, String str2, Map<String, List<q>> map) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                q qVar = new q();
                try {
                    qVar.a(jSONArray.getJSONObject(i));
                    arrayList.add(qVar);
                } catch (JSONException unused) {
                    y.e("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList);
        } catch (JSONException unused2) {
            y.e("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }
}
