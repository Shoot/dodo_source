package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class f1 extends h1 {
    private int a = 0;
    private final int b;
    private final /* synthetic */ d1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(d1 d1Var) {
        this.c = d1Var;
        this.b = d1Var.P();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.a1d
    public final byte zza() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.H(i);
        }
        throw new NoSuchElementException();
    }
}
