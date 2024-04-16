package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class ua extends ra {
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ua(va vaVar) {
        super(vaVar);
        this.b.r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        if (v()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void u() {
        if (!this.c) {
            w();
            this.b.q0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        if (this.c) {
            return true;
        }
        return false;
    }

    protected abstract boolean w();
}
