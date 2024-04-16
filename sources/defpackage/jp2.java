package defpackage;

import android.os.SystemClock;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: jp2  reason: default package */
/* loaded from: classes2.dex */
public class jp2 implements t91 {
    private static final jp2 a = new jp2();

    private jp2() {
    }

    @NonNull
    public static t91 c() {
        return a;
    }

    @Override // defpackage.t91
    public final long a() {
        return System.nanoTime();
    }

    @Override // defpackage.t91
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.t91
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
