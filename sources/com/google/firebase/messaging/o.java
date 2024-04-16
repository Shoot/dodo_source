package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.ei6;
import java.util.concurrent.ExecutionException;
/* compiled from: MessagingAnalytics.java */
/* loaded from: classes2.dex */
public class o {
    public static boolean A(Intent intent) {
        if (intent != null && !r(intent)) {
            return B(intent.getExtras());
        }
        return false;
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            qv3.l();
            Context k = qv3.l().k();
            SharedPreferences sharedPreferences = k.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = k.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static ei6 b(ei6.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        ei6.a h = ei6.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(ei6.d.ANDROID).h(k(extras));
        String h2 = h(extras);
        if (h2 != null) {
            h.g(h2);
        }
        String o = o(extras);
        if (o != null) {
            h.l(o);
        }
        String c = c(extras);
        if (c != null) {
            h.c(c);
        }
        String i = i(extras);
        if (i != null) {
            h.b(i);
        }
        String e = e(extras);
        if (e != null) {
            h.d(e);
        }
        long n = n(extras);
        if (n > 0) {
            h.j(n);
        }
        return h.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    @NonNull
    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) o7b.a(com.google.firebase.installations.c.q(qv3.l()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    @NonNull
    static ei6.c k(Bundle bundle) {
        if (bundle != null && q.t(bundle)) {
            return ei6.c.DISPLAY_NOTIFICATION;
        }
        return ei6.c.DATA_MESSAGE;
    }

    @NonNull
    static String l(Bundle bundle) {
        if (bundle != null && q.t(bundle)) {
            return "display";
        }
        return "data";
    }

    @NonNull
    static String m() {
        return qv3.l().k().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        qv3 l = qv3.l();
        String d = l.n().d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = l.n().c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    static String o(Bundle bundle) {
        String string = bundle.getString(RemoteMessageConst.FROM);
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(ei6.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.q());
        }
    }

    private static void w(ei6.b bVar, Intent intent, xlb xlbVar) {
        if (xlbVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        ei6 b = b(bVar, intent);
        if (b == null) {
            return;
        }
        try {
            xlbVar.a("FCM_CLIENT_EVENT_LOGGING", fi6.class, eh3.b("proto"), new zkb() { // from class: di6
                @Override // defpackage.zkb
                public final Object apply(Object obj) {
                    return ((fi6) obj).c();
                }
            }).a(pk3.f(fi6.b().b(b).a(), ol8.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            qv3.l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String q = q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String l = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            jc jcVar = (jc) qv3.l().j(jc.class);
            if (jcVar != null) {
                jcVar.b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            jc jcVar = (jc) qv3.l().j(jc.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (jcVar != null) {
                String string = bundle.getString("google.c.a.c_id");
                jcVar.c("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString(KustoStorage.KustoTable.COLUMN_SOURCE, "Firebase");
                bundle2.putString("medium", RemoteMessageConst.NOTIFICATION);
                bundle2.putString("campaign", string);
                jcVar.b("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean z(Intent intent) {
        if (intent != null && !r(intent)) {
            return a();
        }
        return false;
    }
}
