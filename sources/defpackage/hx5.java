package defpackage;

import android.annotation.TargetApi;
import android.os.SystemClock;
/* compiled from: LogTime.java */
/* renamed from: hx5  reason: default package */
/* loaded from: classes.dex */
public final class hx5 {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        return (b() - j) * a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
