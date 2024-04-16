package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.b;
/* compiled from: DrawingDelegate.java */
/* loaded from: classes2.dex */
abstract class e<S extends b> {
    S a;
    protected d b;

    public e(S s) {
        this.a = s;
    }

    abstract void a(@NonNull Canvas canvas, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(@NonNull Canvas canvas, @NonNull Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(@NonNull d dVar) {
        this.b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@NonNull Canvas canvas, float f) {
        this.a.e();
        a(canvas, f);
    }
}
