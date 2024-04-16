package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* renamed from: dxc  reason: default package */
/* loaded from: classes2.dex */
public class dxc extends Handler {
    private final Looper a;

    public dxc(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public dxc(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
