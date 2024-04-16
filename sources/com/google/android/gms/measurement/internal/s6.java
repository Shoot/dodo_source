package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class s6 extends t6 {
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6(u5 u5Var) {
        super(u5Var);
        this.a.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        if (r()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void p() {
        if (!this.b) {
            if (!s()) {
                this.a.Q();
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void q() {
        if (!this.b) {
            m();
            this.a.Q();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        if (this.b) {
            return true;
        }
        return false;
    }

    protected abstract boolean s();

    protected void m() {
    }
}
