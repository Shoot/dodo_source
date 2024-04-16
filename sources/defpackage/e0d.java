package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: e0d  reason: default package */
/* loaded from: classes2.dex */
public final class e0d {
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    private final boolean g;
    final boolean h;
    final x84<Context, Boolean> i;

    public e0d(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final izc<Double> a(String str, double d) {
        return izc.g(this, str, Double.valueOf(-3.0d), true);
    }

    public final izc<Long> b(String str, long j) {
        return izc.h(this, str, Long.valueOf(j), true);
    }

    public final izc<String> c(String str, String str2) {
        return izc.i(this, str, str2, true);
    }

    public final izc<Boolean> d(String str, boolean z) {
        return izc.f(this, str, Boolean.valueOf(z), true);
    }

    public final e0d e() {
        return new e0d(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }

    public final e0d f() {
        if (this.c.isEmpty()) {
            x84<Context, Boolean> x84Var = this.i;
            if (x84Var == null) {
                return new e0d(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, x84Var);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private e0d(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, x84<Context, Boolean> x84Var) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = x84Var;
    }
}
