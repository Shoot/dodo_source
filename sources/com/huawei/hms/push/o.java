package com.huawei.hms.push;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
/* compiled from: PushNotification.java */
/* loaded from: classes3.dex */
public class o {
    public static int a;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static PendingIntent b(Context context, k kVar, int[] iArr) {
        Intent a2 = a(context, kVar, iArr, "2", 268435456);
        if (a()) {
            a2.setClass(context, TransActivity.class);
            a2.setFlags(268468224);
            return PendingIntent.getActivity(context, iArr[2], a2, q.b());
        }
        return PendingIntent.getBroadcast(context, iArr[2], a2, q.b());
    }

    public static PendingIntent c(Context context, k kVar, int[] iArr) {
        Intent a2 = a(context, kVar, iArr, "1", 268435456);
        if (a()) {
            a2.setClass(context, TransActivity.class);
            a2.setFlags(268468224);
            return PendingIntent.getActivity(context, iArr[1], a2, q.b());
        }
        return PendingIntent.getBroadcast(context, iArr[1], a2, q.b());
    }

    public static void d(Context context, k kVar, int[] iArr) {
        HMSLog.i("PushSelfShowLog", "setAutoClear time is: " + kVar.f());
        if (kVar.f() <= 0) {
            return;
        }
        a(context, a(context, kVar, iArr, "-1", 32), kVar.f(), iArr[3]);
    }

    public static synchronized void a(Context context, k kVar) {
        int hashCode;
        int hashCode2;
        int i;
        int i2;
        synchronized (o.class) {
            if (context != null) {
                try {
                    if (!a(kVar)) {
                        HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + kVar.p());
                        if (a == 0) {
                            a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                        }
                        if (TextUtils.isEmpty(kVar.l())) {
                            String q = kVar.q();
                            if (!TextUtils.isEmpty(q)) {
                                int hashCode3 = q.hashCode();
                                kVar.a(hashCode3);
                                HMSLog.d("PushSelfShowLog", "notification msgTag = " + hashCode3);
                            }
                            if (kVar.s() != -1) {
                                hashCode = kVar.s();
                                i2 = (kVar.k() + System.currentTimeMillis()).hashCode();
                                i = i2 + 1;
                                hashCode2 = (kVar.s() + kVar.k() + context.getPackageName()).hashCode();
                            } else {
                                int i3 = a;
                                int i4 = i3 + 1;
                                int i5 = i3 + 2;
                                int i6 = i3 + 3;
                                int i7 = i3 + 4;
                                a = i7;
                                hashCode2 = i7;
                                hashCode = i4;
                                i2 = i5;
                                i = i6;
                            }
                        } else {
                            hashCode = (kVar.l() + kVar.k()).hashCode();
                            int i8 = a;
                            int i9 = i8 + 1;
                            int i10 = i8 + 2;
                            a = i10;
                            hashCode2 = (kVar.l() + kVar.k() + context.getPackageName()).hashCode();
                            i = i10;
                            i2 = i9;
                        }
                        HMSLog.d("PushSelfShowLog", "notifyId:" + hashCode + ",openNotifyId:" + i2 + ",delNotifyId:" + i + ",alarmNotifyId:" + hashCode2);
                        int[] iArr = new int[4];
                        iArr[0] = hashCode;
                        iArr[1] = i2;
                        iArr[2] = i;
                        if (kVar.f() <= 0) {
                            hashCode2 = 0;
                        }
                        iArr[3] = hashCode2;
                        Notification a2 = q.e() ? a(context, kVar, iArr) : null;
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
                        if (notificationManager != null && a2 != null) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                String string = context.getString(ResourceLoaderUtil.getStringId("hms_push_channel"));
                                jt8.a();
                                notificationManager.createNotificationChannel(it8.a("HwPushChannelID", string, 3));
                            }
                            notificationManager.notify(hashCode, a2);
                            d(context, kVar, iArr);
                            e.a(context, kVar.p(), kVar.b(), "100");
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void d(k kVar, Notification.Builder builder) {
        String u = kVar.u();
        String j = kVar.j();
        if (TextUtils.isEmpty(j)) {
            builder.setContentText(u);
            return;
        }
        builder.setContentText(j);
        if (TextUtils.isEmpty(u)) {
            return;
        }
        builder.setContentTitle(u);
    }

    public static void c(k kVar, Notification.Builder builder) {
        builder.setTicker(kVar.x());
    }

    @SuppressLint({"NewApi"})
    public static void b(Context context, Notification.Builder builder, k kVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String k = kVar.k();
            if (TextUtils.isEmpty(k)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", k);
            builder.setExtras(bundle);
        }
    }

    public static void b(k kVar, Notification.Builder builder) {
        String t = kVar.t();
        if (TextUtils.isEmpty(t)) {
            return;
        }
        builder.setSubText(t);
    }

    public static Intent a(Context context, k kVar, int[] iArr, String str, int i) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", kVar.o()).putExtra("selfshow_token", kVar.y()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i);
        return intent;
    }

    public static Notification a(Context context, k kVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (m.a(kVar) == n.STYLE_BIGTEXT) {
            m.a(builder, kVar.g(), kVar);
        }
        l.a(context, builder, kVar);
        b(kVar, builder);
        d(kVar, builder);
        a(context, kVar, builder);
        a(builder);
        a(kVar, builder);
        c(kVar, builder);
        builder.setContentIntent(c(context, kVar, iArr));
        builder.setDeleteIntent(b(context, kVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, kVar);
        a(context, builder, kVar);
        return builder.build();
    }

    @SuppressLint({"NewApi"})
    public static void a(Context context, Notification.Builder builder, k kVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !q.a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String k = kVar.k();
        HMSLog.i("PushSelfShowLog", "the package name of notification is:" + k);
        if (!TextUtils.isEmpty(k)) {
            String a2 = q.a(context, k);
            HMSLog.i("PushSelfShowLog", "the app name is:" + a2);
            if (a2 != null) {
                bundle.putCharSequence("android.extraAppName", a2);
            }
        }
        builder.setExtras(bundle);
    }

    public static void a(Context context, Intent intent, long j, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("enter setDelayAlarm(interval:");
            sb.append(j);
            sb.append("ms.");
            HMSLog.d("PushSelfShowLog", sb.toString());
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, i, intent, q.b()));
            }
        } catch (Exception e) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error." + e.toString());
        }
    }

    public static void a(Context context, k kVar, Notification.Builder builder) {
        Bitmap a2 = l.a(context, kVar);
        if (a2 != null) {
            builder.setLargeIcon(a2);
        }
    }

    public static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    public static void a(k kVar, Notification.Builder builder) {
        builder.setAutoCancel(kVar.e() == 1);
        builder.setOngoing(false);
    }

    public static boolean a(k kVar) {
        return kVar == null || (TextUtils.isEmpty(kVar.u()) && TextUtils.isEmpty(kVar.j()));
    }
}
