package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.n;
/* compiled from: ImageLayer.java */
/* renamed from: tu4  reason: default package */
/* loaded from: classes.dex */
public class tu4 extends v70 {
    private final Paint D;
    private final Rect E;
    private final Rect F;
    private final rz5 G;
    private t70<ColorFilter, ColorFilter> H;
    private t70<Bitmap, Bitmap> I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tu4(n nVar, em5 em5Var) {
        super(nVar, em5Var);
        this.D = new yi5(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = nVar.M(em5Var.m());
    }

    private Bitmap O() {
        Bitmap h;
        t70<Bitmap, Bitmap> t70Var = this.I;
        if (t70Var != null && (h = t70Var.h()) != null) {
            return h;
        }
        Bitmap E = this.p.E(this.q.m());
        if (E != null) {
            return E;
        }
        rz5 rz5Var = this.G;
        if (rz5Var != null) {
            return rz5Var.a();
        }
        return null;
    }

    @Override // defpackage.v70, defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        if (this.G != null) {
            float e = fvb.e();
            rectF.set(0.0f, 0.0f, this.G.e() * e, this.G.c() * e);
            this.o.mapRect(rectF);
        }
    }

    @Override // defpackage.v70, defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        super.f(t, b06Var);
        if (t == xz5.K) {
            if (b06Var == null) {
                this.H = null;
            } else {
                this.H = new dwb(b06Var);
            }
        } else if (t == xz5.N) {
            if (b06Var == null) {
                this.I = null;
            } else {
                this.I = new dwb(b06Var);
            }
        }
    }

    @Override // defpackage.v70
    public void t(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap O = O();
        if (O != null && !O.isRecycled() && this.G != null) {
            float e = fvb.e();
            this.D.setAlpha(i);
            t70<ColorFilter, ColorFilter> t70Var = this.H;
            if (t70Var != null) {
                this.D.setColorFilter(t70Var.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.E.set(0, 0, O.getWidth(), O.getHeight());
            if (this.p.N()) {
                this.F.set(0, 0, (int) (this.G.e() * e), (int) (this.G.c() * e));
            } else {
                this.F.set(0, 0, (int) (O.getWidth() * e), (int) (O.getHeight() * e));
            }
            canvas.drawBitmap(O, this.E, this.F, this.D);
            canvas.restore();
        }
    }
}
