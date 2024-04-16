package defpackage;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
/* compiled from: StartupTime.java */
@AutoValue
/* renamed from: xta  reason: default package */
/* loaded from: classes2.dex */
public abstract class xta {
    @NonNull
    public static xta a(long j, long j2, long j3) {
        return new h30(j, j2, j3);
    }

    @NonNull
    public static xta e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
