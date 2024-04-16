package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.b;
/* compiled from: DeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class c<S extends b> extends d {
    private static final lz3<c> u = new a("indicatorLevel");
    private e<S> p;
    private final ksa q;
    private final jsa r;
    private float s;
    private boolean t;

    /* compiled from: DeterminateDrawable.java */
    /* loaded from: classes2.dex */
    class a extends lz3<c> {
        a(String str) {
            super(str);
        }

        @Override // defpackage.lz3
        /* renamed from: c */
        public float a(c cVar) {
            return cVar.w() * 10000.0f;
        }

        @Override // defpackage.lz3
        /* renamed from: d */
        public void b(c cVar, float f) {
            cVar.y(f / 10000.0f);
        }
    }

    c(@NonNull Context context, @NonNull b bVar, @NonNull e<S> eVar) {
        super(context, bVar);
        this.t = false;
        x(eVar);
        ksa ksaVar = new ksa();
        this.q = ksaVar;
        ksaVar.d(1.0f);
        ksaVar.f(50.0f);
        jsa jsaVar = new jsa(this, u);
        this.r = jsaVar;
        jsaVar.p(ksaVar);
        m(1.0f);
    }

    @NonNull
    public static c<k> u(@NonNull Context context, @NonNull k kVar) {
        return new c<>(context, kVar, new h(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float w() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(float f) {
        this.s = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.p.g(canvas, g());
            this.p.c(canvas, this.m);
            this.p.b(canvas, this.m, 0.0f, w(), ba6.a(this.b.c[0], getAlpha()));
            canvas.restore();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.r.q();
        y(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ void l(@NonNull nj njVar) {
        super.l(njVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.t) {
            this.r.q();
            y(i / 10000.0f);
            return true;
        }
        this.r.h(w() * 10000.0f);
        this.r.l(i);
        return true;
    }

    @Override // com.google.android.material.progressindicator.d
    public /* bridge */ /* synthetic */ boolean p(boolean z, boolean z2, boolean z3) {
        return super.p(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.d
    public boolean q(boolean z, boolean z2, boolean z3) {
        boolean q = super.q(z, z2, z3);
        float a2 = this.c.a(this.a.getContentResolver());
        if (a2 == 0.0f) {
            this.t = true;
        } else {
            this.t = false;
            this.q.f(50.0f / a2);
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
    public e<S> v() {
        return this.p;
    }

    void x(@NonNull e<S> eVar) {
        this.p = eVar;
        eVar.f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
