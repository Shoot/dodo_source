package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
/* compiled from: BundleCompat.java */
/* renamed from: yh0  reason: default package */
/* loaded from: classes.dex */
public final class yh0 {

    /* compiled from: BundleCompat.java */
    /* renamed from: yh0$a */
    /* loaded from: classes.dex */
    static class a {
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    public static void a(@NonNull Bundle bundle, String str, IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
