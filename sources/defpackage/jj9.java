package defpackage;

import ch.qos.logback.classic.spi.CallerData;
/* compiled from: ResolvedRecursiveType.java */
/* renamed from: jj9  reason: default package */
/* loaded from: classes2.dex */
public class jj9 extends pnb {
    protected y85 l;

    public jj9(Class<?> cls, qnb qnbVar) {
        super(cls, qnbVar, null, null, 0, null, null, false);
    }

    public y85 F0() {
        return this.l;
    }

    public void I0(y85 y85Var) {
        if (this.l == null) {
            this.l = y85Var;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this.l + ", new = " + y85Var);
    }

    @Override // defpackage.y85
    public boolean N() {
        return false;
    }

    @Override // defpackage.y85
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return null;
    }

    @Override // defpackage.pnb, defpackage.y85
    public qnb l() {
        y85 y85Var = this.l;
        if (y85Var != null) {
            return y85Var.l();
        }
        return super.l();
    }

    @Override // defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        y85 y85Var = this.l;
        if (y85Var != null) {
            return y85Var.n(sb);
        }
        return sb;
    }

    @Override // defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        y85 y85Var = this.l;
        if (y85Var != null) {
            return y85Var.n(sb);
        }
        sb.append(CallerData.NA);
        return sb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        y85 y85Var = this.l;
        if (y85Var == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(y85Var.u().getName());
        }
        return sb.toString();
    }

    @Override // defpackage.pnb, defpackage.y85
    public y85 x() {
        y85 y85Var = this.l;
        if (y85Var != null) {
            return y85Var.x();
        }
        return super.x();
    }

    @Override // defpackage.y85
    public y85 p0() {
        return this;
    }

    @Override // defpackage.y85
    public y85 m0(y85 y85Var) {
        return this;
    }

    @Override // defpackage.y85
    public y85 n0(Object obj) {
        return this;
    }

    @Override // defpackage.y85
    public y85 q0(Object obj) {
        return this;
    }

    @Override // defpackage.y85
    public y85 r0(Object obj) {
        return this;
    }
}
