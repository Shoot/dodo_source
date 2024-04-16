package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/p;", "Landroidx/compose/ui/platform/o;", "Landroid/view/View;", "view", "Loa6;", "matrix", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", com.huawei.hms.opendevice.c.a, "([FFF)V", "a", "", "[I", "tmpLocation", "[F", "tmpMatrix", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class p implements o {
    private final int[] a = new int[2];
    private final float[] b = oa6.c(null, 1, null);

    private final void b(float[] fArr, Matrix matrix) {
        th.b(this.b, matrix);
        og.f(fArr, this.b);
    }

    private final void c(float[] fArr, float f, float f2) {
        oa6.h(this.b);
        oa6.m(this.b, f, f2, 0.0f, 4, null);
        og.f(fArr, this.b);
    }

    private final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            z65.g(matrix, "viewMatrix");
            b(fArr, matrix);
        }
    }

    @Override // androidx.compose.ui.platform.o
    public void a(View view, float[] fArr) {
        z65.h(view, "view");
        z65.h(fArr, "matrix");
        oa6.h(fArr);
        d(view, fArr);
    }
}
