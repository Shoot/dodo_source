package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import defpackage.rb5;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: lec  reason: default package */
/* loaded from: classes.dex */
public class lec implements x {
    private final String a;
    private final Context b;
    private final String c;
    private final u d;
    private final shc e;
    private final thc f;
    private final Map<String, String> g;
    private final List<wda> h;
    private final Map<String, String> i = new HashMap();

    public lec(Context context, String str, u uVar, InputStream inputStream, Map<String, String> map, List<wda> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        str = str == null ? context.getPackageName() : str;
        this.c = str;
        if (inputStream != null) {
            this.e = new bic(inputStream, str);
            ivb.a(inputStream);
        } else {
            this.e = new hic(context, str);
        }
        this.f = new thc(this.e);
        u uVar2 = u.b;
        if (uVar != uVar2 && "1.0".equals(this.e.a("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.d = (uVar == null || uVar == uVar2) ? ivb.f(this.e.a("/region", null), this.e.a("/agcgw/url", null)) : uVar;
        this.g = ivb.d(map);
        this.h = list;
        this.a = str2 == null ? f() : str2;
    }

    private String d(String str) {
        Map<String, rb5.a> a = rb5.a();
        if (!a.containsKey(str)) {
            return null;
        }
        if (this.i.containsKey(str)) {
            return this.i.get(str);
        }
        rb5.a aVar = a.get(str);
        if (aVar == null) {
            return null;
        }
        String a2 = aVar.a(this);
        this.i.put(str, a2);
        return a2;
    }

    private String f() {
        return String.valueOf(("{packageName='" + this.c + CoreConstants.SINGLE_QUOTE_CHAR + ", routePolicy=" + this.d + ", reader=" + this.e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.g).toString().hashCode() + CoreConstants.CURLY_RIGHT).hashCode());
    }

    @Override // defpackage.x
    public String a(String str) {
        return g(str, null);
    }

    @Override // defpackage.x
    public String b() {
        return this.a;
    }

    @Override // defpackage.x
    public u c() {
        u uVar = this.d;
        if (uVar == null) {
            return u.b;
        }
        return uVar;
    }

    public List<wda> e() {
        return this.h;
    }

    public String g(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String e = ivb.e(str);
        String str3 = this.g.get(e);
        if (str3 != null) {
            return str3;
        }
        String d = d(e);
        if (d != null) {
            return d;
        }
        String a = this.e.a(e, str2);
        if (thc.c(a)) {
            return this.f.a(a, str2);
        }
        return a;
    }

    @Override // defpackage.x
    public Context getContext() {
        return this.b;
    }
}
