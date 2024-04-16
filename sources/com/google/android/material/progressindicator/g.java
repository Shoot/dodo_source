package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.b;
/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class g<S extends b> extends d {
    private e<S> p;
    private f<ObjectAnimator> q;

    g(@NonNull Context context, @NonNull b bVar, @NonNull e<S> eVar, @NonNull f<ObjectAnimator> fVar) {
        super(context, bVar);
        w(eVar);
        v(fVar);
    }

    @NonNull
    public static g<k> s(@NonNull Context context, @NonNull k kVar) {
        f jVar;
        h hVar = new h(kVar);
        if (kVar.g == 0) {
            jVar = new i(kVar);
        } else {
            jVar = new j(context, kVar);
        }
        return new g<>(context, kVar, hVar, jVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.p.g(canvas, g());
            this.p.c(canvas, this.m);
            int i = 0;
            while (true) {
                f<ObjectAnimator> fVar = this.q;
                int[] iArr = fVar.c;
                if (i < iArr.length) {
                    e<S> eVar = this.p;
                    Paint paint = this.m;
                    float[] fArr = fVar.b;
                    int i2 = i * 2;
                    eVar.b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.p.e();
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ void l(@NonNull nj njVar) {
        super.l(njVar);
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean p(boolean z, boolean z2, boolean z3) {
        return super.p(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.d
    public boolean q(boolean z, boolean z2, boolean z3) {
        boolean q = super.q(z, z2, z3);
        if (!isRunning()) {
            this.q.a();
        }
        float a = this.c.a(this.a.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && a > 0.0f))) {
            this.q.g();
        }
        return q;
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean r(@NonNull nj njVar) {
        return super.r(njVar);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public f<ObjectAnimator> t() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public e<S> u() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(@NonNull f<ObjectAnimator> fVar) {
        this.q = fVar;
        fVar.e(this);
    }

    void w(@NonNull e<S> eVar) {
        this.p = eVar;
        eVar.f(this);
    }
}
