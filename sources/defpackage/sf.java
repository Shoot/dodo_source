package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!*\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J0\u0010$\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u0010'\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0016JE\u00101\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0002H\u0016R,\u0010>\u001a\u000605j\u0002`68\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\r\u00107\u0012\u0004\b<\u0010=\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010@R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lsf;", "Lqn0;", "", "l", "g", "Lk99;", "bounds", "Lpp7;", "paint", "o", "", "dx", "dy", "a", "sx", "sy", c.a, "Loa6;", "matrix", "n", "([F)V", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "Lp91;", "clipOp", "f", "(FFFFI)V", "Lor7;", "path", "b", "(Lor7;I)V", "Landroid/graphics/Region$Op;", Image.TYPE_SMALL, "(I)Landroid/graphics/Region$Op;", "p", "radiusX", "radiusY", "j", "k", "Leu4;", ElementGenerator.TYPE_IMAGE, "Ls55;", "srcOffset", "Lw55;", "srcSize", "dstOffset", "dstSize", e.a, "(Leu4;JJJJLpp7;)V", Image.TYPE_HIGH, Image.TYPE_MEDIUM, "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "q", "()Landroid/graphics/Canvas;", "r", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sf  reason: default package */
/* loaded from: classes.dex */
public final class sf implements qn0 {
    private Canvas a = tf.b();
    private final Rect b = new Rect();
    private final Rect c = new Rect();

    @Override // defpackage.qn0
    public void a(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.qn0
    public void b(or7 or7Var, int i) {
        z65.h(or7Var, "path");
        Canvas canvas = this.a;
        if (or7Var instanceof ei) {
            canvas.clipPath(((ei) or7Var).q(), s(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.qn0
    public void c(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.qn0
    public /* synthetic */ void d(k99 k99Var, int i) {
        pn0.a(this, k99Var, i);
    }

    @Override // defpackage.qn0
    public void e(eu4 eu4Var, long j, long j2, long j3, long j4, pp7 pp7Var) {
        z65.h(eu4Var, ElementGenerator.TYPE_IMAGE);
        z65.h(pp7Var, "paint");
        Canvas canvas = this.a;
        Bitmap b = bh.b(eu4Var);
        Rect rect = this.b;
        rect.left = s55.h(j);
        rect.top = s55.i(j);
        rect.right = s55.h(j) + w55.g(j2);
        rect.bottom = s55.i(j) + w55.f(j2);
        Unit unit = Unit.a;
        Rect rect2 = this.c;
        rect2.left = s55.h(j3);
        rect2.top = s55.i(j3);
        rect2.right = s55.h(j3) + w55.g(j4);
        rect2.bottom = s55.i(j3) + w55.f(j4);
        canvas.drawBitmap(b, rect, rect2, pp7Var.p());
    }

    @Override // defpackage.qn0
    public void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, s(i));
    }

    @Override // defpackage.qn0
    public void g() {
        this.a.restore();
    }

    @Override // defpackage.qn0
    public void h() {
        wn0.a.a(this.a, true);
    }

    @Override // defpackage.qn0
    public /* synthetic */ void i(k99 k99Var, pp7 pp7Var) {
        pn0.b(this, k99Var, pp7Var);
    }

    @Override // defpackage.qn0
    public void j(float f, float f2, float f3, float f4, float f5, float f6, pp7 pp7Var) {
        z65.h(pp7Var, "paint");
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, pp7Var.p());
    }

    @Override // defpackage.qn0
    public void k(or7 or7Var, pp7 pp7Var) {
        z65.h(or7Var, "path");
        z65.h(pp7Var, "paint");
        Canvas canvas = this.a;
        if (or7Var instanceof ei) {
            canvas.drawPath(((ei) or7Var).q(), pp7Var.p());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.qn0
    public void l() {
        this.a.save();
    }

    @Override // defpackage.qn0
    public void m() {
        wn0.a.a(this.a, false);
    }

    @Override // defpackage.qn0
    public void n(float[] fArr) {
        z65.h(fArr, "matrix");
        if (!ra6.a(fArr)) {
            Matrix matrix = new Matrix();
            th.a(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.qn0
    public void o(k99 k99Var, pp7 pp7Var) {
        z65.h(k99Var, "bounds");
        z65.h(pp7Var, "paint");
        this.a.saveLayer(k99Var.f(), k99Var.i(), k99Var.g(), k99Var.c(), pp7Var.p(), 31);
    }

    @Override // defpackage.qn0
    public void p(float f, float f2, float f3, float f4, pp7 pp7Var) {
        z65.h(pp7Var, "paint");
        this.a.drawRect(f, f2, f3, f4, pp7Var.p());
    }

    public final Canvas q() {
        return this.a;
    }

    public final void r(Canvas canvas) {
        z65.h(canvas, "<set-?>");
        this.a = canvas;
    }

    public final Region.Op s(int i) {
        if (p91.d(i, p91.a.a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }
}
