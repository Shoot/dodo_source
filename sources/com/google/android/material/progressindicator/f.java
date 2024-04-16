package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
abstract class f<T extends Animator> {
    protected g a;
    protected final float[] b;
    protected final int[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(int i) {
        this.b = new float[i * 2];
        this.c = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public float b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void c();

    public abstract void d(@NonNull nj njVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(@NonNull g gVar) {
        this.a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    public abstract void h();
}
