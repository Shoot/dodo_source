package defpackage;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: rqc  reason: default package */
/* loaded from: classes2.dex */
public final class rqc {
    public static boolean a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
