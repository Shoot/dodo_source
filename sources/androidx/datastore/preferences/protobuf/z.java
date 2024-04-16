package androidx.datastore.preferences.protobuf;
/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class z {
    private static final n e = n.b();
    private g a;
    private n b;
    protected volatile l0 c;
    private volatile g d;

    protected void a(l0 l0Var) {
        if (this.c != null) {
            return;
        }
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.c = l0Var.g().a(this.a, this.b);
                    this.d = this.a;
                } else {
                    this.c = l0Var;
                    this.d = g.b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.c = l0Var;
                this.d = g.b;
            }
        }
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        g gVar = this.a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0;
    }

    public l0 c(l0 l0Var) {
        a(l0Var);
        return this.c;
    }

    public l0 d(l0 l0Var) {
        l0 l0Var2 = this.c;
        this.a = null;
        this.d = null;
        this.c = l0Var;
        return l0Var2;
    }

    public g e() {
        if (this.d != null) {
            return this.d;
        }
        g gVar = this.a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.d != null) {
                    return this.d;
                }
                if (this.c == null) {
                    this.d = g.b;
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
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        l0 l0Var = this.c;
        l0 l0Var2 = zVar.c;
        if (l0Var == null && l0Var2 == null) {
            return e().equals(zVar.e());
        }
        if (l0Var != null && l0Var2 != null) {
            return l0Var.equals(l0Var2);
        }
        if (l0Var != null) {
            return l0Var.equals(zVar.c(l0Var.f()));
        }
        return c(l0Var2.f()).equals(l0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
