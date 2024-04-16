package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.n;
/* compiled from: SolidLayer.java */
/* renamed from: kqa  reason: default package */
/* loaded from: classes.dex */
public class kqa extends v70 {
    private final RectF D;
    private final Paint E;
    private final float[] F;
    private final Path G;
    private final em5 H;
    private t70<ColorFilter, ColorFilter> I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kqa(n nVar, em5 em5Var) {
        super(nVar, em5Var);
        this.D = new RectF();
        yi5 yi5Var = new yi5();
        this.E = yi5Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = em5Var;
        yi5Var.setAlpha(0);
        yi5Var.setStyle(Paint.Style.FILL);
        yi5Var.setColor(em5Var.o());
    }

    @Override // defpackage.v70, defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.set(0.0f, 0.0f, this.H.q(), this.H.p());
        this.o.mapRect(this.D);
        rectF.set(this.D);
    }

    @Override // defpackage.v70, defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        super.f(t, b06Var);
        if (t == xz5.K) {
            if (b06Var == null) {
                this.I = null;
            } else {
                this.I = new dwb(b06Var);
            }
        }
    }

    @Override // defpackage.v70
    public void t(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.H.o());
        if (alpha == 0) {
            return;
        }
        if (this.x.h() == null) {
            intValue = 100;
        } else {
            intValue = this.x.h().h().intValue();
        }
        int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.E.setAlpha(i2);
        t70<ColorFilter, ColorFilter> t70Var = this.I;
        if (t70Var != null) {
            this.E.setColorFilter(t70Var.h());
        }
        if (i2 > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.H.q();
            float[] fArr2 = this.F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.H.q();
            this.F[5] = this.H.p();
            float[] fArr3 = this.F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.H.p();
            matrix.mapPoints(this.F);
            this.G.reset();
            Path path = this.G;
            float[] fArr4 = this.F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.G;
            float[] fArr5 = this.F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.G;
            float[] fArr6 = this.F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.G;
            float[] fArr7 = this.F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.G;
            float[] fArr8 = this.F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.G.close();
            canvas.drawPath(this.G, this.E);
        }
    }
}
