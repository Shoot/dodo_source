package defpackage;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bic  reason: default package */
/* loaded from: classes.dex */
class bic implements shc {
    private final JSONObject a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bic(InputStream inputStream, String str) {
        this.a = b(inputStream);
        c(str);
    }

    private JSONObject b(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(ivb.g(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private void c(String str) {
        try {
            JSONObject e = e(str);
            if (e == null) {
                return;
            }
            String a = a("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal("0.0");
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(a));
            } catch (NumberFormatException unused) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                this.a.getJSONObject("client").put(HiAnalyticsConstant.BI_KEY_APP_ID, e.getString(HiAnalyticsConstant.BI_KEY_APP_ID));
            } else if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> keys = e.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"package_name".equals(next)) {
                        d(next, e.get(next), this.a);
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    private void d(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str != null && obj != null && jSONObject != null) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    d(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
                }
                return;
            }
            jSONObject.put(str, obj);
        }
    }

    private JSONObject e(String str) throws JSONException {
        JSONArray jSONArray = this.a.getJSONArray("appInfos");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.getString("package_name").equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // defpackage.shc
    public String a(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] split = str.split("/");
        try {
            JSONObject jSONObject = this.a;
            for (int i = 1; i < split.length; i++) {
                if (i == split.length - 1) {
                    str = jSONObject.get(split[i]).toString();
                    return str;
                }
                jSONObject = jSONObject.getJSONObject(split[i]);
            }
        } catch (JSONException unused) {
            Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.a.toString().hashCode() + CoreConstants.CURLY_RIGHT;
    }
}
