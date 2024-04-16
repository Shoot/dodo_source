package defpackage;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import defpackage.jc;
import defpackage.ww4;
import im.threads.business.transport.PushMessageAttributes;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* renamed from: pqc  reason: default package */
/* loaded from: classes2.dex */
public final class pqc {
    private static final zw4<String> a = zw4.m0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final ww4<String> b = ww4.e0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final ww4<String> c = ww4.Z("auto", "app", "am");
    private static final ww4<String> d = ww4.W("_r", "_dbg");
    private static final ww4<String> e = new ww4.a().f(f1d.a).f(f1d.b).g();
    private static final ww4<String> f = ww4.W("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static jc.c a(Bundle bundle) {
        gh8.j(bundle);
        jc.c cVar = new jc.c();
        cVar.a = (String) gh8.j((String) b1d.a(bundle, PushMessageAttributes.ORIGIN, String.class, null));
        cVar.b = (String) gh8.j((String) b1d.a(bundle, Action.NAME_ATTRIBUTE, String.class, null));
        cVar.c = b1d.a(bundle, "value", Object.class, null);
        cVar.d = (String) b1d.a(bundle, "trigger_event_name", String.class, null);
        cVar.e = ((Long) b1d.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f = (String) b1d.a(bundle, "timed_out_event_name", String.class, null);
        cVar.g = (Bundle) b1d.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.h = (String) b1d.a(bundle, "triggered_event_name", String.class, null);
        cVar.i = (Bundle) b1d.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.j = ((Long) b1d.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.k = (String) b1d.a(bundle, "expired_event_name", String.class, null);
        cVar.l = (Bundle) b1d.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.n = ((Boolean) b1d.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.m = ((Long) b1d.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.o = ((Long) b1d.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static Bundle b(jc.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.a;
        if (str != null) {
            bundle.putString(PushMessageAttributes.ORIGIN, str);
        }
        String str2 = cVar.b;
        if (str2 != null) {
            bundle.putString(Action.NAME_ATTRIBUTE, str2);
        }
        Object obj = cVar.c;
        if (obj != null) {
            b1d.b(bundle, obj);
        }
        String str3 = cVar.d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.e);
        String str4 = cVar.f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.j);
        String str6 = cVar.k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.m);
        bundle.putBoolean("active", cVar.n);
        bundle.putLong("triggered_timestamp", cVar.o);
        return bundle;
    }

    public static String c(String str) {
        String a2 = d1d.a(str);
        if (a2 != null) {
            return a2;
        }
        return str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            ww4<String> ww4Var = d;
            int size = ww4Var.size();
            int i = 0;
            while (i < size) {
                String str2 = ww4Var.get(i);
                i++;
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            } else if (e.contains(str2)) {
                return false;
            } else {
                ww4<String> ww4Var = f;
                int size = ww4Var.size();
                int i = 0;
                while (i < size) {
                    String str3 = ww4Var.get(i);
                    i++;
                    if (str2.matches(str3)) {
                        return false;
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean g(jc.c cVar) {
        String str;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.c;
        if ((obj != null && g3d.a(obj) == null) || !j(str) || !f(str, cVar.b)) {
            return false;
        }
        String str2 = cVar.k;
        if (str2 != null && (!e(str2, cVar.l) || !h(str, cVar.k, cVar.l))) {
            return false;
        }
        String str3 = cVar.h;
        if (str3 != null && (!e(str3, cVar.i) || !h(str, cVar.h, cVar.i))) {
            return false;
        }
        String str4 = cVar.f;
        if (str4 != null) {
            if (!e(str4, cVar.g) || !h(str, cVar.f, cVar.g)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean h(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        ww4<String> ww4Var = d;
        int size = ww4Var.size();
        int i = 0;
        while (i < size) {
            String str3 = ww4Var.get(i);
            i++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c2 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean i(String str) {
        if (!a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        if (!c.contains(str)) {
            return true;
        }
        return false;
    }
}
