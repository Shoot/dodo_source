package defpackage;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.NonNull;
/* compiled from: NotificationChannelCompat.java */
/* renamed from: h17  reason: default package */
/* loaded from: classes.dex */
public class h17 {
    @NonNull
    final String a;
    CharSequence b;
    int c;
    String d;
    String e;
    boolean f;
    Uri g;
    AudioAttributes h;
    boolean i;
    int j;
    boolean k;
    long[] l;
    String m;
    String n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;

    h17(@NonNull String str, int i) {
        this.f = true;
        this.g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        this.a = (String) kh8.f(str);
        this.c = i;
        this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h17(@androidx.annotation.NonNull android.app.NotificationChannel r4) {
        /*
            r3 = this;
            java.lang.String r0 = defpackage.p07.a(r4)
            int r1 = defpackage.g17.a(r4)
            r3.<init>(r0, r1)
            java.lang.CharSequence r0 = defpackage.q07.a(r4)
            r3.b = r0
            java.lang.String r0 = defpackage.r07.a(r4)
            r3.d = r0
            java.lang.String r0 = defpackage.s07.a(r4)
            r3.e = r0
            boolean r0 = defpackage.t07.a(r4)
            r3.f = r0
            android.net.Uri r0 = defpackage.u07.a(r4)
            r3.g = r0
            android.media.AudioAttributes r0 = defpackage.v07.a(r4)
            r3.h = r0
            boolean r0 = defpackage.w07.a(r4)
            r3.i = r0
            int r0 = defpackage.x07.a(r4)
            r3.j = r0
            boolean r0 = defpackage.y07.a(r4)
            r3.k = r0
            long[] r0 = defpackage.z07.a(r4)
            r3.l = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L59
            java.lang.String r2 = defpackage.a17.a(r4)
            r3.m = r2
            java.lang.String r2 = defpackage.b17.a(r4)
            r3.n = r2
        L59:
            boolean r2 = defpackage.c17.a(r4)
            r3.o = r2
            int r2 = defpackage.d17.a(r4)
            r3.p = r2
            r2 = 29
            if (r0 < r2) goto L6f
            boolean r2 = defpackage.e17.a(r4)
            r3.q = r2
        L6f:
            if (r0 < r1) goto L77
            boolean r4 = defpackage.f17.a(r4)
            r3.r = r4
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h17.<init>(android.app.NotificationChannel):void");
    }
}
