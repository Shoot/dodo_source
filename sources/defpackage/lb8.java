package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: PlaceholderForType.java */
/* renamed from: lb8  reason: default package */
/* loaded from: classes2.dex */
public class lb8 extends pnb {
    protected final int l;
    protected y85 m;

    public lb8(int i) {
        super(Object.class, qnb.j(), rnb.b0(), null, 1, null, null, false);
        this.l = i;
    }

    private <T> T F0() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    @Override // defpackage.pnb
    protected String E0() {
        return toString();
    }

    public y85 I0() {
        return this.m;
    }

    public void J0(y85 y85Var) {
        this.m = y85Var;
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
        return (y85) F0();
    }

    @Override // defpackage.y85
    public y85 m0(y85 y85Var) {
        return (y85) F0();
    }

    @Override // defpackage.y85
    public StringBuilder n(StringBuilder sb) {
        sb.append(CoreConstants.DOLLAR);
        sb.append(this.l + 1);
        return sb;
    }

    @Override // defpackage.y85
    public y85 n0(Object obj) {
        return (y85) F0();
    }

    @Override // defpackage.y85
    public y85 p0() {
        return (y85) F0();
    }

    @Override // defpackage.y85
    public StringBuilder q(StringBuilder sb) {
        return n(sb);
    }

    @Override // defpackage.y85
    public y85 q0(Object obj) {
        return (y85) F0();
    }

    @Override // defpackage.y85
    public y85 r0(Object obj) {
        return (y85) F0();
    }

    public String toString() {
        return n(new StringBuilder()).toString();
    }
}
