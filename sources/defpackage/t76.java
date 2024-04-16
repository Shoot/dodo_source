package defpackage;
/* compiled from: MapType.java */
/* renamed from: t76  reason: default package */
/* loaded from: classes2.dex */
public final class t76 extends q66 {
    private t76(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2, y85 y85Var3, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, y85Var2, y85Var3, obj, obj2, z);
    }

    public static t76 M0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2, y85 y85Var3) {
        return new t76(cls, qnbVar, y85Var, y85VarArr, y85Var2, y85Var3, null, null, false);
    }

    @Override // defpackage.q66, defpackage.y85
    /* renamed from: N0 */
    public t76 n0(Object obj) {
        return new t76(this.a, this.h, this.f, this.g, this.l, this.m.q0(obj), this.c, this.d, this.e);
    }

    @Override // defpackage.q66
    /* renamed from: O0 */
    public t76 I0(y85 y85Var) {
        if (y85Var == this.l) {
            return this;
        }
        return new t76(this.a, this.h, this.f, this.g, y85Var, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.q66, defpackage.y85
    /* renamed from: P0 */
    public t76 p0() {
        if (this.e) {
            return this;
        }
        return new t76(this.a, this.h, this.f, this.g, this.l.p0(), this.m.p0(), this.c, this.d, true);
    }

    @Override // defpackage.q66, defpackage.y85
    /* renamed from: Q0 */
    public t76 q0(Object obj) {
        return new t76(this.a, this.h, this.f, this.g, this.l, this.m, this.c, obj, this.e);
    }

    @Override // defpackage.q66, defpackage.y85
    /* renamed from: R0 */
    public t76 r0(Object obj) {
        return new t76(this.a, this.h, this.f, this.g, this.l, this.m, obj, this.d, this.e);
    }

    @Override // defpackage.q66, defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return new t76(cls, qnbVar, y85Var, y85VarArr, this.l, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.q66, defpackage.y85
    public y85 m0(y85 y85Var) {
        if (this.m == y85Var) {
            return this;
        }
        return new t76(this.a, this.h, this.f, this.g, this.l, y85Var, this.c, this.d, this.e);
    }

    @Override // defpackage.q66
    public String toString() {
        return "[map type; class " + this.a.getName() + ", " + this.l + " -> " + this.m + "]";
    }
}
