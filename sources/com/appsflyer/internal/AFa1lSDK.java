package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1lSDK {
    final AFc1ySDK AFInAppEventType;

    public AFa1lSDK() {
    }

    public AFa1lSDK(AFc1ySDK aFc1ySDK) {
        this.AFInAppEventType = aFc1ySDK;
    }

    public static JSONObject AFInAppEventParameterName(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventParameterName(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> AFInAppEventType(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = values((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventType((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0027: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x0027 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.appsflyer.internal.AFc1rSDK valueOf(java.io.File r5) {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            long r3 = r5.length()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            char[] r3 = new char[r4]     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r2.read(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            com.appsflyer.internal.AFc1rSDK r4 = new com.appsflyer.internal.AFc1rSDK     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r4.values = r5     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r2.close()     // Catch: java.io.IOException -> L21
            goto L25
        L21:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L25:
            return r4
        L26:
            r5 = move-exception
            r1 = r2
            goto L3f
        L29:
            r5 = move-exception
            goto L2f
        L2b:
            r5 = move-exception
            goto L3f
        L2d:
            r5 = move-exception
            r2 = r1
        L2f:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L3e
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L3e:
            return r1
        L3f:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1lSDK.valueOf(java.io.File):com.appsflyer.internal.AFc1rSDK");
    }

    private static List<Object> values(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = values((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventType((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    public final List<AFc1rSDK> AFKeystoreWrapper() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFInAppEventType.values.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            StringBuilder sb = new StringBuilder("CACHE: Found cached request");
            sb.append(file2.getName());
            AFLogger.afInfoLog(sb.toString());
            arrayList.add(valueOf(file2));
        }
        return arrayList;
    }

    private static Object AFInAppEventParameterName(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(AFInAppEventParameterName(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(AFInAppEventParameterName(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return AFInAppEventParameterName((Map<String, ?>) obj);
            } else {
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.support.annotation.WorkerThread
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String values(com.appsflyer.internal.AFc1rSDK r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1lSDK.values(com.appsflyer.internal.AFc1rSDK):java.lang.String");
    }

    @WorkerThread
    public final boolean AFInAppEventType(String str) {
        File file = new File(new File(this.AFInAppEventType.values.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (file.exists()) {
            try {
                return file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.afErrorLog(sb2.toString(), e);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AFe1oSDK AFInAppEventParameterName(Context context) {
        if (context instanceof Activity) {
            return AFe1oSDK.activity;
        }
        if (context instanceof Application) {
            return AFe1oSDK.application;
        }
        return AFe1oSDK.other;
    }
}
