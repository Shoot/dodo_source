package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: MapLikeType.java */
/* renamed from: q66  reason: default package */
/* loaded from: classes2.dex */
public class q66 extends pnb {
    protected final y85 l;
    protected final y85 m;

    /* JADX INFO: Access modifiers changed from: protected */
    public q66(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2, y85 y85Var3, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, y85Var2.hashCode() ^ y85Var3.hashCode(), obj, obj2, z);
        this.l = y85Var2;
        this.m = y85Var3;
    }

    @Override // defpackage.pnb
    protected String E0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getName());
        if (this.l != null && z0(2)) {
            sb.append('<');
            sb.append(this.l.e());
            sb.append(CoreConstants.COMMA_CHAR);
            sb.append(this.m.e());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.y85
    /* renamed from: F0 */
    public q66 n0(Object obj) {
        return new q66(this.a, this.h, this.f, this.g, this.l, this.m.q0(obj), this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public boolean H() {
        if (!super.H() && !this.m.H() && !this.l.H()) {
            return false;
        }
        return true;
    }

    public q66 I0(y85 y85Var) {
        if (y85Var == this.l) {
            return this;
        }
        return new q66(this.a, this.h, this.f, this.g, y85Var, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    /* renamed from: J0 */
    public q66 p0() {
        if (this.e) {
            return this;
        }
        return new q66(this.a, this.h, this.f, this.g, this.l, this.m.p0(), this.c, this.d, true);
    }

    @Override // defpackage.y85
    /* renamed from: K0 */
    public q66 q0(Object obj) {
        return new q66(this.a, this.h, this.f, this.g, this.l, this.m, this.c, obj, this.e);
    }

    @Override // defpackage.y85
    /* renamed from: L0 */
    public q66 r0(Object obj) {
        return new q66(this.a, this.h, this.f, this.g, this.l, this.m, obj, this.d, this.e);
    }

    @Override // defpackage.y85
    public boolean N() {
        return true;
    }

    @Override // defpackage.y85
    public boolean Z() {
        return true;
    }

    @Override // defpackage.y85
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        q66 q66Var = (q66) obj;
        if (this.a == q66Var.a && this.l.equals(q66Var.l) && this.m.equals(q66Var.m)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return new q66(cls, qnbVar, y85Var, y85VarArr, this.l, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public y85 m() {
        return this.m;
    }

    @Override // defpackage.y85
    public y85 m0(y85 y85Var) {
        if (this.m == y85Var) {
            return this;
        }
        return new q66(this.a, this.h, this.f, this.g, this.l, y85Var, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        return pnb.x0(this.a, sb, true);
    }

    @Override // defpackage.y85
    public y85 o0(y85 y85Var) {
        y85 o0;
        y85 o02;
        y85 o03 = super.o0(y85Var);
        y85 s = y85Var.s();
        if ((o03 instanceof q66) && s != null && (o02 = this.l.o0(s)) != this.l) {
            o03 = ((q66) o03).I0(o02);
        }
        y85 m = y85Var.m();
        if (m != null && (o0 = this.m.o0(m)) != this.m) {
            return o03.m0(o0);
        }
        return o03;
    }

    @Override // defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        pnb.x0(this.a, sb, false);
        sb.append('<');
        this.l.q(sb);
        this.m.q(sb);
        sb.append(">;");
        return sb;
    }

    @Override // defpackage.y85
    public y85 s() {
        return this.l;
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.a.getName(), this.l, this.m);
    }
}
