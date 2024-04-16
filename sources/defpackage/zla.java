package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: SimpleType.java */
/* renamed from: zla  reason: default package */
/* loaded from: classes2.dex */
public class zla extends pnb {
    /* JADX INFO: Access modifiers changed from: protected */
    public zla(Class<?> cls) {
        this(cls, qnb.j(), null, null);
    }

    public static zla F0(Class<?> cls) {
        return new zla(cls, null, null, null, null, null, false);
    }

    @Override // defpackage.pnb
    protected String E0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getName());
        int q = this.h.q();
        if (q > 0 && z0(q)) {
            sb.append('<');
            for (int i = 0; i < q; i++) {
                y85 f = f(i);
                if (i > 0) {
                    sb.append(CoreConstants.COMMA_CHAR);
                }
                sb.append(f.e());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.y85
    /* renamed from: I0 */
    public zla p0() {
        if (this.e) {
            return this;
        }
        return new zla(this.a, this.h, this.f, this.g, this.c, this.d, true);
    }

    @Override // defpackage.y85
    /* renamed from: J0 */
    public zla q0(Object obj) {
        if (this.d == obj) {
            return this;
        }
        return new zla(this.a, this.h, this.f, this.g, this.c, obj, this.e);
    }

    @Override // defpackage.y85
    /* renamed from: K0 */
    public zla r0(Object obj) {
        if (obj == this.c) {
            return this;
        }
        return new zla(this.a, this.h, this.f, this.g, obj, this.d, this.e);
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
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        zla zlaVar = (zla) obj;
        if (zlaVar.a != this.a) {
            return false;
        }
        return this.h.equals(zlaVar.h);
    }

    @Override // defpackage.y85
    public y85 j0(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        return null;
    }

    @Override // defpackage.y85
    public y85 m0(y85 y85Var) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        return pnb.x0(this.a, sb, true);
    }

    @Override // defpackage.y85
    public y85 n0(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        pnb.x0(this.a, sb, false);
        int q = this.h.q();
        if (q > 0) {
            sb.append('<');
            for (int i = 0; i < q; i++) {
                sb = f(i).q(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(E0());
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zla(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr) {
        this(cls, qnbVar, y85Var, y85VarArr, null, null, false);
    }

    protected zla(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, 0, obj, obj2, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zla(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, qnbVar, y85Var, y85VarArr, i, obj, obj2, z);
    }
}
