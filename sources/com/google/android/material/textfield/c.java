package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.NonNull;
/* compiled from: CutoutDrawable.java */
/* loaded from: classes2.dex */
class c extends fa6 {
    @NonNull
    private final RectF A;
    @NonNull
    private final Paint z;

    c() {
        this(null);
    }

    private void t0() {
        this.z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.z.setColor(-1);
        this.z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p0() {
        return !this.A.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0() {
        r0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fa6
    public void r(@NonNull Canvas canvas) {
        if (this.A.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.A);
        } else {
            canvas.clipRect(this.A, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }

    void r0(float f, float f2, float f3, float f4) {
        RectF rectF = this.A;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s0(@NonNull RectF rectF) {
        r0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(uga ugaVar) {
        super(ugaVar == null ? new uga() : ugaVar);
        this.z = new Paint(1);
        t0();
        this.A = new RectF();
    }
}
