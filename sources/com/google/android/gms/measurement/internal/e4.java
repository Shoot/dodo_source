package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class e4<V> {
    private static final Object h = new Object();
    private final String a;
    private final d4<V> b;
    private final V c;
    private final V d;
    private final Object e;
    private volatile V f;
    private volatile V g;

    public final V a(V v) {
        V v2;
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (c4.a == null) {
            return this.c;
        }
        synchronized (h) {
            try {
                if (c.a()) {
                    if (this.g == null) {
                        v2 = this.c;
                    } else {
                        v2 = this.g;
                    }
                    return v2;
                }
                try {
                    for (e4 e4Var : b0.z0()) {
                        if (!c.a()) {
                            V v3 = null;
                            try {
                                d4<V> d4Var = e4Var.b;
                                if (d4Var != null) {
                                    v3 = d4Var.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (h) {
                                e4Var.g = v3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                d4<V> d4Var2 = this.b;
                if (d4Var2 == null) {
                    return this.c;
                }
                try {
                    return d4Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.a;
    }

    private e4(String str, V v, V v2, d4<V> d4Var) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = str;
        this.c = v;
        this.d = v2;
        this.b = d4Var;
    }
}
