package defpackage;

import java.lang.reflect.Array;
/* compiled from: ArrayType.java */
/* renamed from: rr  reason: default package */
/* loaded from: classes2.dex */
public final class rr extends pnb {
    protected final y85 l;
    protected final Object m;

    protected rr(y85 y85Var, qnb qnbVar, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), qnbVar, null, null, y85Var.hashCode(), obj2, obj3, z);
        this.l = y85Var;
        this.m = obj;
    }

    public static rr F0(y85 y85Var, qnb qnbVar) {
        return I0(y85Var, qnbVar, null, null);
    }

    public static rr I0(y85 y85Var, qnb qnbVar, Object obj, Object obj2) {
        return new rr(y85Var, qnbVar, Array.newInstance(y85Var.u(), 0), obj, obj2, false);
    }

    @Override // defpackage.y85
    public boolean G() {
        return this.l.G();
    }

    @Override // defpackage.y85
    public boolean H() {
        if (!super.H() && !this.l.H()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.y85
    /* renamed from: J0 */
    public rr n0(Object obj) {
        if (obj == this.l.y()) {
            return this;
        }
        return new rr(this.l.q0(obj), this.h, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    /* renamed from: K0 */
    public rr p0() {
        if (this.e) {
            return this;
        }
        return new rr(this.l.p0(), this.h, this.m, this.c, this.d, true);
    }

    @Override // defpackage.y85
    public boolean L() {
        return true;
    }

    @Override // defpackage.y85
    /* renamed from: L0 */
    public rr q0(Object obj) {
        if (obj == this.d) {
            return this;
        }
        return new rr(this.l, this.h, this.m, this.c, obj, this.e);
    }

    @Override // defpackage.y85
    /* renamed from: M0 */
    public rr r0(Object obj) {
        if (obj == this.c) {
            return this;
        }
        return new rr(this.l, this.h, this.m, obj, this.d, this.e);
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
        if (obj == null || obj.getClass() != rr.class) {
            return false;
        }
        return this.l.equals(((rr) obj).l);
    }

    @Override // defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return null;
    }

    @Override // defpackage.y85
    public y85 m() {
        return this.l;
    }

    @Override // defpackage.y85
    public y85 m0(y85 y85Var) {
        return new rr(y85Var, this.h, Array.newInstance(y85Var.u(), 0), this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        sb.append('[');
        return this.l.n(sb);
    }

    @Override // defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        sb.append('[');
        return this.l.q(sb);
    }

    public String toString() {
        return "[array type, component type: " + this.l + "]";
    }
}
