package com.google.crypto.tink.shaded.protobuf;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes2.dex */
public class a0 {
    private static final o e = o.b();
    private h a;
    private o b;
    protected volatile m0 c;
    private volatile h d;

    protected void a(m0 m0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.c = m0Var.g().b(this.a, this.b);
                    this.d = this.a;
                } else {
                    this.c = m0Var;
                    this.d = h.b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = m0Var;
                this.d = h.b;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        h hVar = this.a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0;
    }

    public m0 c(m0 m0Var) {
        a(m0Var);
        return this.c;
    }

    public m0 d(m0 m0Var) {
        m0 m0Var2 = this.c;
        this.a = null;
        this.d = null;
        this.c = m0Var;
        return m0Var2;
    }

    public h e() {
        if (this.d != null) {
            return this.d;
        }
        h hVar = this.a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = h.b;
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
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        m0 m0Var = this.c;
        m0 m0Var2 = a0Var.c;
        if (m0Var == null && m0Var2 == null) {
            return e().equals(a0Var.e());
        }
        if (m0Var != null && m0Var2 != null) {
            return m0Var.equals(m0Var2);
        }
        if (m0Var != null) {
            return m0Var.equals(a0Var.c(m0Var.f()));
        }
        return c(m0Var2.f()).equals(m0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
