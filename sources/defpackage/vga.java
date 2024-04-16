package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
/* compiled from: ShapeAppearancePathProvider.java */
/* renamed from: vga  reason: default package */
/* loaded from: classes2.dex */
public class vga {
    private final hha[] a = new hha[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final hha g = new hha();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: vga$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final vga a = new vga();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: vga$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(hha hhaVar, Matrix matrix, int i);

        void b(hha hhaVar, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: vga$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @NonNull
        public final uga a;
        @NonNull
        public final Path b;
        @NonNull
        public final RectF c;
        public final b d;
        public final float e;

        c(@NonNull uga ugaVar, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = ugaVar;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public vga() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new hha();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private void b(@NonNull c cVar, int i) {
        this.h[0] = this.a[i].k();
        this.h[1] = this.a[i].l();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.a[i], this.b[i], i);
        }
    }

    private void c(@NonNull c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].k();
        this.i[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = i(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        zc3 j = j(i, cVar.a);
        j.c(max, i3, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (j.b() || l(this.j, i) || l(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.g, this.c[i], i);
        }
    }

    private void f(int i, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    private dx1 g(int i, @NonNull uga ugaVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ugaVar.t();
                }
                return ugaVar.r();
            }
            return ugaVar.j();
        }
        return ugaVar.l();
    }

    private gx1 h(int i, @NonNull uga ugaVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ugaVar.s();
                }
                return ugaVar.q();
            }
            return ugaVar.i();
        }
        return ugaVar.k();
    }

    private float i(@NonNull RectF rectF, int i) {
        float[] fArr = this.h;
        hha hhaVar = this.a[i];
        fArr[0] = hhaVar.c;
        fArr[1] = hhaVar.d;
        this.b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.h[1]);
        }
        return Math.abs(rectF.centerX() - this.h[0]);
    }

    private zc3 j(int i, @NonNull uga ugaVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ugaVar.o();
                }
                return ugaVar.p();
            }
            return ugaVar.n();
        }
        return ugaVar.h();
    }

    @NonNull
    public static vga k() {
        return a.a;
    }

    private boolean l(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    private void m(@NonNull c cVar, int i) {
        h(i, cVar.a).b(this.a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.a));
        float a2 = a(i);
        this.b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(a2);
    }

    private void n(int i) {
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        float a2 = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(a2);
    }

    public void d(uga ugaVar, float f, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(ugaVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }

    public void e(uga ugaVar, float f, RectF rectF, @NonNull Path path) {
        d(ugaVar, f, rectF, null, path);
    }
}
