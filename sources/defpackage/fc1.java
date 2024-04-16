package defpackage;
/* compiled from: CollectionType.java */
/* renamed from: fc1  reason: default package */
/* loaded from: classes2.dex */
public final class fc1 extends cc1 {
    private fc1(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, y85Var2, obj, obj2, z);
    }

    public static fc1 L0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2) {
        return new fc1(cls, qnbVar, y85Var, y85VarArr, y85Var2, null, null, false);
    }

    @Override // defpackage.cc1, defpackage.y85
    /* renamed from: M0 */
    public fc1 n0(Object obj) {
        return new fc1(this.a, this.h, this.f, this.g, this.l.q0(obj), this.c, this.d, this.e);
    }

    @Override // defpackage.cc1, defpackage.y85
    /* renamed from: N0 */
    public fc1 p0() {
        if (this.e) {
            return this;
        }
        return new fc1(this.a, this.h, this.f, this.g, this.l.p0(), this.c, this.d, true);
    }

    @Override // defpackage.cc1, defpackage.y85
    /* renamed from: O0 */
    public fc1 q0(Object obj) {
        return new fc1(this.a, this.h, this.f, this.g, this.l, this.c, obj, this.e);
    }

    @Override // defpackage.cc1, defpackage.y85
    /* renamed from: P0 */
    public fc1 r0(Object obj) {
        return new fc1(this.a, this.h, this.f, this.g, this.l, obj, this.d, this.e);
    }

    @Override // defpackage.cc1, defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return new fc1(cls, qnbVar, y85Var, y85VarArr, this.l, this.c, this.d, this.e);
    }

    @Override // defpackage.cc1, defpackage.y85
    public y85 m0(y85 y85Var) {
        if (this.l == y85Var) {
            return this;
        }
        return new fc1(this.a, this.h, this.f, this.g, y85Var, this.c, this.d, this.e);
    }

    @Override // defpackage.cc1
    public String toString() {
        return "[collection type; class " + this.a.getName() + ", contains " + this.l + "]";
    }
}
