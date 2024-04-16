package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: cuc  reason: default package */
/* loaded from: classes2.dex */
public final class cuc extends Handler {
    private final Looper a;

    public cuc(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
}
