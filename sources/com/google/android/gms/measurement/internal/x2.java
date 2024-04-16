package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class x2 extends y3 {
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x2(u5 u5Var) {
        super(u5Var);
        this.a.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        if (y()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void v() {
        if (!this.b) {
            if (!z()) {
                this.a.Q();
                this.b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void w() {
        if (!this.b) {
            x();
            this.a.Q();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y() {
        if (this.b) {
            return true;
        }
        return false;
    }

    protected abstract boolean z();

    protected void x() {
    }
}
