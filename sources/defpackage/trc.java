package defpackage;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: trc  reason: default package */
/* loaded from: classes2.dex */
public final class trc {
    public static Looper a(Looper looper) {
        if (looper != null) {
            return looper;
        }
        return b();
    }

    public static Looper b() {
        boolean z;
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        gh8.n(z, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
