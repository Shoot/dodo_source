package defpackage;

import java.lang.reflect.Member;
/* compiled from: AnnotatedParameter.java */
/* renamed from: ll  reason: default package */
/* loaded from: classes2.dex */
public final class ll extends hl {
    protected final ol c;
    protected final y85 d;
    protected final int e;

    public ll(ol olVar, y85 y85Var, znb znbVar, rl rlVar, int i) {
        super(znbVar, rlVar);
        this.c = olVar;
        this.d = y85Var;
        this.e = i;
    }

    @Override // defpackage.al
    public Class<?> c() {
        return this.d.u();
    }

    @Override // defpackage.al
    public y85 d() {
        return this.d;
    }

    @Override // defpackage.al
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!q81.E(obj, ll.class)) {
            return false;
        }
        ll llVar = (ll) obj;
        if (llVar.c.equals(this.c) && llVar.e == this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.al
    public String getName() {
        return "";
    }

    @Override // defpackage.al
    public int hashCode() {
        return this.c.hashCode() + this.e;
    }

    @Override // defpackage.hl
    public Class<?> k() {
        return this.c.k();
    }

    @Override // defpackage.hl
    public Member m() {
        return this.c.m();
    }

    @Override // defpackage.hl
    public Object n(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + k().getName());
    }

    public int q() {
        return this.e;
    }

    public ol r() {
        return this.c;
    }

    @Override // defpackage.hl
    /* renamed from: s */
    public ll o(rl rlVar) {
        if (rlVar == this.b) {
            return this;
        }
        return this.c.u(this.e, rlVar);
    }

    public String toString() {
        return "[parameter #" + q() + ", annotations: " + this.b + "]";
    }
}
