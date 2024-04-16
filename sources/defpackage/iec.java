package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.rb5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: iec  reason: default package */
/* loaded from: classes.dex */
public class iec extends w {
    private static List<wda> d;
    private static final Object e = new Object();
    private static final Map<String, w> f = new HashMap();
    private static String g;
    private final x a;
    private final qhc b;
    private final qhc c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iec$a */
    /* loaded from: classes.dex */
    public static class a implements rb5.a {
        a() {
        }

        @Override // defpackage.rb5.a
        public String a(x xVar) {
            String str;
            if (xVar.c().equals(u.c)) {
                str = "/agcgw_all/CN";
            } else if (xVar.c().equals(u.e)) {
                str = "/agcgw_all/RU";
            } else if (xVar.c().equals(u.d)) {
                str = "/agcgw_all/DE";
            } else if (xVar.c().equals(u.f)) {
                str = "/agcgw_all/SG";
            } else {
                return null;
            }
            return xVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iec$b */
    /* loaded from: classes.dex */
    public static class b implements rb5.a {
        b() {
        }

        @Override // defpackage.rb5.a
        public String a(x xVar) {
            String str;
            if (xVar.c().equals(u.c)) {
                str = "/agcgw_all/CN_back";
            } else if (xVar.c().equals(u.e)) {
                str = "/agcgw_all/RU_back";
            } else if (xVar.c().equals(u.d)) {
                str = "/agcgw_all/DE_back";
            } else if (xVar.c().equals(u.f)) {
                str = "/agcgw_all/SG_back";
            } else {
                return null;
            }
            return xVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iec$c */
    /* loaded from: classes.dex */
    public static class c implements rb5.a {
        c() {
        }

        @Override // defpackage.rb5.a
        public String a(x xVar) {
            String str;
            if (xVar.c().equals(u.c)) {
                str = "/service/analytics/collector_url_cn";
            } else if (xVar.c().equals(u.e)) {
                str = "/service/analytics/collector_url_ru";
            } else if (xVar.c().equals(u.d)) {
                str = "/service/analytics/collector_url_de";
            } else if (xVar.c().equals(u.f)) {
                str = "/service/analytics/collector_url_sg";
            } else {
                return null;
            }
            return xVar.a(str);
        }
    }

    public iec(x xVar) {
        this.a = xVar;
        if (d == null) {
            Log.e("AGConnectInstance", "please call `initialize()` first");
        }
        this.b = new qhc(d, xVar.getContext());
        qhc qhcVar = new qhc(null, xVar.getContext());
        this.c = qhcVar;
        if (xVar instanceof lec) {
            qhcVar.c(((lec) xVar).e(), xVar.getContext());
        }
    }

    public static w f() {
        String str = g;
        if (str == null) {
            str = "DEFAULT_INSTANCE";
        }
        return i(str);
    }

    public static w g(x xVar) {
        return h(xVar, false);
    }

    private static w h(x xVar, boolean z) {
        w wVar;
        synchronized (e) {
            Map<String, w> map = f;
            wVar = map.get(xVar.b());
            if (wVar == null || z) {
                wVar = new iec(xVar);
                map.put(xVar.b(), wVar);
            }
        }
        return wVar;
    }

    public static w i(String str) {
        w wVar;
        synchronized (e) {
            try {
                wVar = f.get(str);
                if (wVar == null) {
                    if ("DEFAULT_INSTANCE".equals(str)) {
                        Log.w("AGC_Instance", "please call `initialize()` first");
                    } else {
                        Log.w("AGC_Instance", "not find instance for : " + str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public static synchronized void j(Context context) {
        synchronized (iec.class) {
            if (f.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                k(context, z.d(context));
            }
        }
    }

    private static synchronized void k(Context context, x xVar) {
        synchronized (iec.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("AGC_Instance", "context.getApplicationContext null");
                } else {
                    context = applicationContext;
                }
                l();
                m();
                hec.a(context);
                if (d == null) {
                    d = new mec(context).b();
                }
                h(xVar, true);
                g = xVar.b();
                Log.i("AGC_Instance", "AGC SDK initialize end, default route:" + xVar.c().a());
                dec.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void l() {
        rb5.b("/agcgw/url", new a());
        rb5.b("/agcgw/backurl", new b());
    }

    private static void m() {
        rb5.b("/service/analytics/collector_url", new c());
    }

    @Override // defpackage.w
    public Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.w
    public x d() {
        return this.a;
    }
}
