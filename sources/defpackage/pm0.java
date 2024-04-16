package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
/* compiled from: CalleeHandler.java */
/* renamed from: pm0  reason: default package */
/* loaded from: classes.dex */
class pm0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
