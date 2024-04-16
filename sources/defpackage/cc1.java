package defpackage;
/* compiled from: CollectionLikeType.java */
/* renamed from: cc1  reason: default package */
/* loaded from: classes2.dex */
public class cc1 extends pnb {
    protected final y85 l;

    /* JADX INFO: Access modifiers changed from: protected */
    public cc1(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, y85Var2.hashCode(), obj, obj2, z);
        this.l = y85Var2;
    }

    @Override // defpackage.pnb
    protected String E0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getName());
        if (this.l != null && z0(1)) {
            sb.append('<');
            sb.append(this.l.e());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.y85
    /* renamed from: F0 */
    public cc1 n0(Object obj) {
        return new cc1(this.a, this.h, this.f, this.g, this.l.q0(obj), this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public boolean H() {
        if (!super.H() && !this.l.H()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.y85
    /* renamed from: I0 */
    public cc1 p0() {
        if (this.e) {
            return this;
        }
        return new cc1(this.a, this.h, this.f, this.g, this.l.p0(), this.c, this.d, true);
    }

    @Override // defpackage.y85
    /* renamed from: J0 */
    public cc1 q0(Object obj) {
        return new cc1(this.a, this.h, this.f, this.g, this.l, this.c, obj, this.e);
    }

    @Override // defpackage.y85
    /* renamed from: K0 */
    public cc1 r0(Object obj) {
        return new cc1(this.a, this.h, this.f, this.g, this.l, obj, this.d, this.e);
    }

    @Override // defpackage.y85
    public boolean M() {
        return true;
    }

    @Override // defpackage.y85
    public boolean N() {
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
        cc1 cc1Var = (cc1) obj;
        if (this.a == cc1Var.a && this.l.equals(cc1Var.l)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return new cc1(cls, qnbVar, y85Var, y85VarArr, this.l, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public y85 m() {
        return this.l;
    }

    @Override // defpackage.y85
    public y85 m0(y85 y85Var) {
        if (this.l == y85Var) {
            return this;
        }
        return new cc1(this.a, this.h, this.f, this.g, y85Var, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        return pnb.x0(this.a, sb, true);
    }

    @Override // defpackage.y85
    public y85 o0(y85 y85Var) {
        y85 o0;
        y85 o02 = super.o0(y85Var);
        y85 m = y85Var.m();
        if (m != null && (o0 = this.l.o0(m)) != this.l) {
            return o02.m0(o0);
        }
        return o02;
    }

    @Override // defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        pnb.x0(this.a, sb, false);
        sb.append('<');
        this.l.q(sb);
        sb.append(">;");
        return sb;
    }

    public String toString() {
        return "[collection-like type; class " + this.a.getName() + ", contains " + this.l + "]";
    }
}
