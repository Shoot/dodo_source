package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class w {
    private static final w e = new w(true, 3, 1, null, null);
    final boolean a;
    final String b;
    final Throwable c;
    final int d;

    private w(boolean z, int i, int i2, String str, Throwable th) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static w b() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w c(@NonNull String str) {
        return new w(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w d(@NonNull String str, @NonNull Throwable th) {
        return new w(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w f(int i) {
        return new w(true, i, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w g(int i, int i2, @NonNull String str, Throwable th) {
        return new w(false, i, i2, str, th);
    }

    String a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
