package defpackage;

import java.util.Objects;
/* compiled from: ReferenceType.java */
/* renamed from: ga9  reason: default package */
/* loaded from: classes2.dex */
public class ga9 extends zla {
    protected final y85 l;
    protected final y85 m;

    protected ga9(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2, y85 y85Var3, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, Objects.hashCode(y85Var2), obj, obj2, z);
        y85 y85Var4;
        this.l = y85Var2;
        if (y85Var3 == null) {
            y85Var4 = this;
        } else {
            y85Var4 = y85Var3;
        }
        this.m = y85Var4;
    }

    public static ga9 L0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, y85 y85Var2) {
        return new ga9(cls, qnbVar, y85Var, y85VarArr, y85Var2, null, null, null, false);
    }

    @Override // defpackage.zla, defpackage.pnb
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

    @Override // defpackage.zla, defpackage.y85
    /* renamed from: M0 */
    public ga9 n0(Object obj) {
        if (obj == this.l.y()) {
            return this;
        }
        return new ga9(this.a, this.h, this.f, this.g, this.l.q0(obj), this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.zla, defpackage.y85
    /* renamed from: N0 */
    public ga9 p0() {
        if (this.e) {
            return this;
        }
        return new ga9(this.a, this.h, this.f, this.g, this.l.p0(), this.m, this.c, this.d, true);
    }

    @Override // defpackage.zla, defpackage.y85
    /* renamed from: O0 */
    public ga9 q0(Object obj) {
        if (obj == this.d) {
            return this;
        }
        return new ga9(this.a, this.h, this.f, this.g, this.l, this.m, this.c, obj, this.e);
    }

    @Override // defpackage.zla, defpackage.y85
    /* renamed from: P0 */
    public ga9 r0(Object obj) {
        if (obj == this.c) {
            return this;
        }
        return new ga9(this.a, this.h, this.f, this.g, this.l, this.m, obj, this.d, this.e);
    }

    @Override // defpackage.lj9
    public boolean c() {
        return true;
    }

    @Override // defpackage.zla, defpackage.y85
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ga9 ga9Var = (ga9) obj;
        if (ga9Var.a != this.a) {
            return false;
        }
        return this.l.equals(ga9Var.l);
    }

    @Override // defpackage.zla, defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return new ga9(cls, this.h, y85Var, y85VarArr, this.l, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.y85
    public y85 m() {
        return this.l;
    }

    @Override // defpackage.zla, defpackage.y85
    public y85 m0(y85 y85Var) {
        if (this.l == y85Var) {
            return this;
        }
        return new ga9(this.a, this.h, this.f, this.g, y85Var, this.m, this.c, this.d, this.e);
    }

    @Override // defpackage.zla, defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        return pnb.x0(this.a, sb, true);
    }

    @Override // defpackage.zla, defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        pnb.x0(this.a, sb, false);
        sb.append('<');
        StringBuilder q = this.l.q(sb);
        q.append(">;");
        return q;
    }

    @Override // defpackage.zla
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(E0());
        sb.append('<');
        sb.append(this.l);
        sb.append('>');
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.y85, defpackage.lj9
    /* renamed from: w */
    public y85 b() {
        return this.l;
    }
}
