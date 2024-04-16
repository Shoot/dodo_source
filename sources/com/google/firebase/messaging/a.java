package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import defpackage.k17;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes2.dex */
public final class a {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0243a {
        public final k17.e a;
        public final String b;
        public final int c;

        C0243a(k17.e eVar, String str, int i) {
            this.a = eVar;
            this.b = str;
            this.c = i;
        }
    }

    private static PendingIntent a(Context context, q qVar, String str, PackageManager packageManager) {
        Intent f = f(str, qVar, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(qVar.y());
        if (q(qVar)) {
            f.putExtra("gcm.n.analytics_data", qVar.x());
        }
        return PendingIntent.getActivity(context, g(), f, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, q qVar) {
        if (!q(qVar)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(qVar.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static C0243a d(Context context, Context context2, q qVar, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        k17.e eVar = new k17.e(context2, str);
        String n = qVar.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.r(n);
        }
        String n2 = qVar.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.q(n2);
            eVar.J(new k17.c().q(n2));
        }
        eVar.H(m(packageManager, resources, packageName, qVar.p("gcm.n.icon"), bundle));
        Uri n3 = n(packageName, qVar, resources);
        if (n3 != null) {
            eVar.I(n3);
        }
        eVar.p(a(context, qVar, packageName, packageManager));
        PendingIntent b = b(context, context2, qVar);
        if (b != null) {
            eVar.v(b);
        }
        Integer h = h(context2, qVar.p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.n(h.intValue());
        }
        eVar.l(!qVar.a("gcm.n.sticky"));
        eVar.B(qVar.a("gcm.n.local_only"));
        String p = qVar.p("gcm.n.ticker");
        if (p != null) {
            eVar.K(p);
        }
        Integer m = qVar.m();
        if (m != null) {
            eVar.E(m.intValue());
        }
        Integer r = qVar.r();
        if (r != null) {
            eVar.M(r.intValue());
        }
        Integer l = qVar.l();
        if (l != null) {
            eVar.C(l.intValue());
        }
        Long j = qVar.j("gcm.n.event_time");
        if (j != null) {
            eVar.F(true);
            eVar.N(j.longValue());
        }
        long[] q = qVar.q();
        if (q != null) {
            eVar.L(q);
        }
        int[] e = qVar.e();
        if (e != null) {
            eVar.A(e[0], e[1], e[2]);
        }
        eVar.u(i(qVar));
        return new C0243a(eVar, o(qVar), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0243a e(Context context, q qVar) {
        Bundle j = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, qVar, k(context, qVar.k(), j), j);
    }

    private static Intent f(String str, q qVar, PackageManager packageManager) {
        String p = qVar.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = qVar.f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(iu1.c(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int i(q qVar) {
        boolean a2 = qVar.a("gcm.n.default_sound");
        ?? r0 = a2;
        if (qVar.a("gcm.n.default_vibrate_timings")) {
            r0 = (a2 ? 1 : 0) | true;
        }
        if (qVar.a("gcm.n.default_light_settings")) {
            return r0 | 4;
        }
        return r0;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        Object systemService;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                systemService = context.getSystemService(NotificationManager.class);
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (!TextUtils.isEmpty(str)) {
                    notificationChannel3 = notificationManager.getNotificationChannel(str);
                    if (notificationChannel3 != null) {
                        return str;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    notificationChannel2 = notificationManager.getNotificationChannel(string2);
                    if (notificationChannel2 != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                if (notificationChannel == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(it8.a("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i | 67108864;
        }
        return i;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    private static Uri n(String str, q qVar, Resources resources) {
        String o = qVar.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if (!"default".equals(o) && resources.getIdentifier(o, DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_RAW, str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String o(q qVar) {
        String p = qVar.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!ak1.a(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(@NonNull q qVar) {
        return qVar.a("google.c.a.e");
    }
}
