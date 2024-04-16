package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public class g2 {
    private static final s1 d = s1.c;
    private d1 a;
    private volatile h3d b;
    private volatile d1 c;

    private final h3d c(h3d h3dVar) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = h3dVar;
                        this.c = d1.b;
                    } catch (zzjq unused) {
                        this.b = h3dVar;
                        this.c = d1.b;
                    }
                }
            }
        }
        return this.b;
    }

    public final h3d a(h3d h3dVar) {
        h3d h3dVar2 = this.b;
        this.a = null;
        this.c = null;
        this.b = h3dVar;
        return h3dVar2;
    }

    public final int b() {
        if (this.c != null) {
            return this.c.P();
        }
        if (this.b != null) {
            return this.b.f();
        }
        return 0;
    }

    public final d1 d() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c != null) {
                    return this.c;
                }
                if (this.b == null) {
                    this.c = d1.b;
                } else {
                    this.c = this.b.h();
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        h3d h3dVar = this.b;
        h3d h3dVar2 = g2Var.b;
        if (h3dVar == null && h3dVar2 == null) {
            return d().equals(g2Var.d());
        }
        if (h3dVar != null && h3dVar2 != null) {
            return h3dVar.equals(h3dVar2);
        }
        if (h3dVar != null) {
            return h3dVar.equals(g2Var.c(h3dVar.d()));
        }
        return c(h3dVar2.d()).equals(h3dVar2);
    }

    public int hashCode() {
        return 1;
    }
}
