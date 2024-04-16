package defpackage;

import android.text.TextUtils;
import com.dodopizza.kustoworker.KustoStorage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultSettingsSpiCall.java */
/* renamed from: ur2  reason: default package */
/* loaded from: classes2.dex */
public class ur2 implements iga {
    private final String a;
    private final oq4 b;
    private final rx5 c;

    public ur2(String str, oq4 oq4Var) {
        this(str, oq4Var, rx5.f());
    }

    private iq4 b(iq4 iq4Var, hga hgaVar) {
        c(iq4Var, "X-CRASHLYTICS-GOOGLE-APP-ID", hgaVar.a);
        c(iq4Var, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(iq4Var, "X-CRASHLYTICS-API-CLIENT-VERSION", a12.i());
        c(iq4Var, "Accept", "application/json");
        c(iq4Var, "X-CRASHLYTICS-DEVICE-MODEL", hgaVar.b);
        c(iq4Var, "X-CRASHLYTICS-OS-BUILD-VERSION", hgaVar.c);
        c(iq4Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", hgaVar.d);
        c(iq4Var, "X-CRASHLYTICS-INSTALLATION-ID", hgaVar.e.a().c());
        return iq4Var;
    }

    private void c(iq4 iq4Var, String str, String str2) {
        if (str2 != null) {
            iq4Var.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            rx5 rx5Var = this.c;
            rx5Var.l("Failed to parse settings JSON from " + this.a, e);
            rx5 rx5Var2 = this.c;
            rx5Var2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(hga hgaVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", hgaVar.h);
        hashMap.put("display_version", hgaVar.g);
        hashMap.put(KustoStorage.KustoTable.COLUMN_SOURCE, Integer.toString(hgaVar.i));
        String str = hgaVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // defpackage.iga
    public JSONObject a(hga hgaVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f = f(hgaVar);
                iq4 b = b(d(f), hgaVar);
                rx5 rx5Var = this.c;
                rx5Var.b("Requesting settings from " + this.a);
                rx5 rx5Var2 = this.c;
                rx5Var2.i("Settings query params were: " + f);
                return g(b.c());
            } catch (IOException e) {
                this.c.e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected iq4 d(Map<String, String> map) {
        iq4 a = this.b.a(this.a, map);
        return a.d("User-Agent", "Crashlytics Android SDK/" + a12.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(pq4 pq4Var) {
        int b = pq4Var.b();
        rx5 rx5Var = this.c;
        rx5Var.i("Settings response code was: " + b);
        if (h(b)) {
            return e(pq4Var.a());
        }
        rx5 rx5Var2 = this.c;
        rx5Var2.d("Settings request failed; (status: " + b + ") from " + this.a);
        return null;
    }

    boolean h(int i) {
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            return false;
        }
        return true;
    }

    ur2(String str, oq4 oq4Var, rx5 rx5Var) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = rx5Var;
        this.b = oq4Var;
        this.a = str;
    }
}
