package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes2.dex */
final class h extends e<k> {
    private float c;
    private float d;
    private float e;

    public h(@NonNull k kVar) {
        super(kVar);
        this.c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.e
    public void a(@NonNull Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = clipBounds.width();
        float f2 = ((k) this.a).a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((k) this.a).a) / 2.0f));
        if (((k) this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.j() && ((k) this.a).e == 1) || (this.b.i() && ((k) this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.j() || this.b.i()) {
            canvas.translate(0.0f, (((k) this.a).a * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.a;
        this.d = ((k) s).a * f;
        this.e = ((k) s).b * f;
    }

    @Override // com.google.android.material.progressindicator.e
    public void b(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = this.e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f5 = this.d;
        RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
        float f6 = this.e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.e
    public void c(@NonNull Canvas canvas, @NonNull Paint paint) {
        int a = ba6.a(((k) this.a).d, this.b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // com.google.android.material.progressindicator.e
    public int d() {
        return ((k) this.a).a;
    }

    @Override // com.google.android.material.progressindicator.e
    public int e() {
        return -1;
    }
}
