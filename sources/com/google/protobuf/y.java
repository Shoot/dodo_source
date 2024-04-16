package com.google.protobuf;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class y {
    private static final m e = m.b();
    private f a;
    private m b;
    protected volatile k0 c;
    private volatile f d;

    protected void a(k0 k0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.c = k0Var.g().a(this.a, this.b);
                    this.d = this.a;
                } else {
                    this.c = k0Var;
                    this.d = f.b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = k0Var;
                this.d = f.b;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        f fVar = this.a;
        if (fVar != null) {
            return fVar.size();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0;
    }

    public k0 c(k0 k0Var) {
        a(k0Var);
        return this.c;
    }

    public k0 d(k0 k0Var) {
        k0 k0Var2 = this.c;
        this.a = null;
        this.d = null;
        this.c = k0Var;
        return k0Var2;
    }

    public f e() {
        if (this.d != null) {
            return this.d;
        }
        f fVar = this.a;
        if (fVar != null) {
            return fVar;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = f.b;
                } else {
                    this.d = this.c.c();
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        k0 k0Var = this.c;
        k0 k0Var2 = yVar.c;
        if (k0Var == null && k0Var2 == null) {
            return e().equals(yVar.e());
        }
        if (k0Var != null && k0Var2 != null) {
            return k0Var.equals(k0Var2);
        }
        if (k0Var != null) {
            return k0Var.equals(yVar.c(k0Var.f()));
        }
        return c(k0Var2.f()).equals(k0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
