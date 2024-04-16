package com.huawei.hms.push;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: SelfShowType.java */
/* loaded from: classes3.dex */
public class j {
    public static final String[] a = {RemoteMessageConst.Notification.URL, "app", "cosa", "rp"};
    public Context b;
    public k c;

    public j(Context context, k kVar) {
        this.b = context;
        this.c = kVar;
    }

    public static boolean a(String str) {
        for (String str2 : a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
        if (com.huawei.hms.push.q.a(r6.b, r6.c.d(), r2).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:3:0x0007, B:5:0x000e, B:7:0x001c, B:28:0x00c4, B:30:0x00c8, B:32:0x00d3, B:34:0x00de, B:33:0x00d9, B:21:0x009a, B:23:0x00a2, B:16:0x007f, B:18:0x0086, B:10:0x0044, B:12:0x0059), top: B:40:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            java.lang.String r0 = "run into launchCosaApp"
            java.lang.String r1 = "PushSelfShowLog"
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = "enter launchExistApp cosa, appPackageName ="
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L98
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = ",and msg.intentUri is "
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.n()     // Catch: java.lang.Exception -> L98
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L98
            com.huawei.hms.support.log.HMSLog.i(r1, r0)     // Catch: java.lang.Exception -> L98
            android.content.Context r0 = r6.b     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L98
            android.content.Intent r0 = com.huawei.hms.push.q.b(r0, r2)     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.n()     // Catch: java.lang.Exception -> L98
            r3 = 0
            if (r2 == 0) goto L9a
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = r2.n()     // Catch: java.lang.Exception -> L7e
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)     // Catch: java.lang.Exception -> L7e
            r4 = 0
            r2.setSelector(r4)     // Catch: java.lang.Exception -> L7e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e
            r4.<init>()     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = "Intent.parseUri(msg.intentUri, 0), action:"
            r4.append(r5)     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = r2.getAction()     // Catch: java.lang.Exception -> L7e
            r4.append(r5)     // Catch: java.lang.Exception -> L7e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L7e
            com.huawei.hms.support.log.HMSLog.i(r1, r4)     // Catch: java.lang.Exception -> L7e
            android.content.Context r4 = r6.b     // Catch: java.lang.Exception -> L7e
            com.huawei.hms.push.k r5 = r6.c     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L7e
            java.lang.Boolean r4 = com.huawei.hms.push.q.a(r4, r5, r2)     // Catch: java.lang.Exception -> L7e
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Exception -> L7e
            if (r3 == 0) goto Lc0
        L7c:
            r0 = r2
            goto Lc0
        L7e:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r4.<init>()     // Catch: java.lang.Exception -> L98
            java.lang.String r5 = "intentUri error."
            r4.append(r5)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L98
            r4.append(r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L98
            com.huawei.hms.support.log.HMSLog.w(r1, r2)     // Catch: java.lang.Exception -> L98
            goto Lc0
        L98:
            r0 = move-exception
            goto Le4
        L9a:
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L98
            if (r2 == 0) goto Lc0
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r4 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r4 = r4.a()     // Catch: java.lang.Exception -> L98
            r2.<init>(r4)     // Catch: java.lang.Exception -> L98
            android.content.Context r4 = r6.b     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r5 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L98
            java.lang.Boolean r4 = com.huawei.hms.push.q.a(r4, r5, r2)     // Catch: java.lang.Exception -> L98
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L98
            if (r4 == 0) goto Lc0
            goto L7c
        Lc0:
            if (r0 != 0) goto Lc8
            java.lang.String r0 = "launchCosaApp,intent == null"
            com.huawei.hms.support.log.HMSLog.i(r1, r0)     // Catch: java.lang.Exception -> L98
            return
        Lc8:
            com.huawei.hms.push.k r2 = r6.c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L98
            r0.setPackage(r2)     // Catch: java.lang.Exception -> L98
            if (r3 == 0) goto Ld9
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)     // Catch: java.lang.Exception -> L98
            goto Lde
        Ld9:
            r2 = 805437440(0x30020000, float:4.7293724E-10)
            r0.setFlags(r2)     // Catch: java.lang.Exception -> L98
        Lde:
            android.content.Context r2 = r6.b     // Catch: java.lang.Exception -> L98
            r2.startActivity(r0)     // Catch: java.lang.Exception -> L98
            goto Lfc
        Le4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "launch Cosa App exception."
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r0)
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.push.j.b():void");
    }

    public void c() {
        k kVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.b != null && (kVar = this.c) != null) {
            if ("app".equals(kVar.i())) {
                a();
                return;
            } else if ("cosa".equals(this.c.i())) {
                b();
                return;
            } else if ("rp".equals(this.c.i())) {
                HMSLog.w("PushSelfShowLog", this.c.i() + " not support rich message.");
                return;
            } else if (RemoteMessageConst.Notification.URL.equals(this.c.i())) {
                HMSLog.w("PushSelfShowLog", this.c.i() + " not support URL.");
                return;
            } else {
                HMSLog.d("PushSelfShowLog", this.c.i() + " is not exist in hShowType");
                return;
            }
        }
        HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
    }

    public final void a() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("enter launchApp, appPackageName =");
            sb.append(this.c.d());
            HMSLog.i("PushSelfShowLog", sb.toString());
            if (q.c(this.b, this.c.d())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }
}
