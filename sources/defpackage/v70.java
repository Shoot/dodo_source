package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.n;
import defpackage.c96;
import defpackage.em5;
import defpackage.t70;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: BaseLayer.java */
/* renamed from: v70  reason: default package */
/* loaded from: classes.dex */
public abstract class v70 implements y83, t70.b, pf5 {
    private Paint A;
    float B;
    BlurMaskFilter C;
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Matrix c = new Matrix();
    private final Paint d = new yi5(1);
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final RectF i;
    private final RectF j;
    private final RectF k;
    private final RectF l;
    private final RectF m;
    private final String n;
    final Matrix o;
    final n p;
    final em5 q;
    private d96 r;
    private hz3 s;
    private v70 t;
    private v70 u;
    private List<v70> v;
    private final List<t70<?, ?>> w;
    final qkb x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseLayer.java */
    /* renamed from: v70$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c96.a.values().length];
            b = iArr;
            try {
                iArr[c96.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c96.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c96.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[c96.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[em5.a.values().length];
            a = iArr2;
            try {
                iArr2[em5.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[em5.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[em5.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[em5.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[em5.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[em5.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[em5.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v70(n nVar, em5 em5Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new yi5(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new yi5(1, mode2);
        yi5 yi5Var = new yi5(1);
        this.g = yi5Var;
        this.h = new yi5(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.o = new Matrix();
        this.w = new ArrayList();
        this.y = true;
        this.B = 0.0f;
        this.p = nVar;
        this.q = em5Var;
        this.n = em5Var.i() + "#draw";
        if (em5Var.h() == em5.b.INVERT) {
            yi5Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            yi5Var.setXfermode(new PorterDuffXfermode(mode));
        }
        qkb b = em5Var.w().b();
        this.x = b;
        b.b(this);
        if (em5Var.g() != null && !em5Var.g().isEmpty()) {
            d96 d96Var = new d96(em5Var.g());
            this.r = d96Var;
            for (t70<yga, Path> t70Var : d96Var.a()) {
                t70Var.a(this);
            }
            for (t70<Integer, Integer> t70Var2 : this.r.c()) {
                i(t70Var2);
                t70Var2.a(this);
            }
        }
        N();
    }

    private void B(RectF rectF, Matrix matrix) {
        this.k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!z()) {
            return;
        }
        int size = this.r.b().size();
        for (int i = 0; i < size; i++) {
            c96 c96Var = this.r.b().get(i);
            Path h = this.r.a().get(i).h();
            if (h != null) {
                this.a.set(h);
                this.a.transform(matrix);
                int i2 = a.b[c96Var.a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 == 3 || i2 == 4) && c96Var.d()) {
                        return;
                    }
                    this.a.computeBounds(this.m, false);
                    if (i == 0) {
                        this.k.set(this.m);
                    } else {
                        RectF rectF2 = this.k;
                        rectF2.set(Math.min(rectF2.left, this.m.left), Math.min(this.k.top, this.m.top), Math.max(this.k.right, this.m.right), Math.max(this.k.bottom, this.m.bottom));
                    }
                } else {
                    return;
                }
            }
        }
        if (!rectF.intersect(this.k)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C(RectF rectF, Matrix matrix) {
        if (!A() || this.q.h() == em5.b.INVERT) {
            return;
        }
        this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.t.d(this.l, matrix, true);
        if (!rectF.intersect(this.l)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D() {
        this.p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        boolean z;
        if (this.s.p() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        M(z);
    }

    private void F(float f) {
        this.p.G().n().a(this.q.i(), f);
    }

    private void M(boolean z) {
        if (z != this.y) {
            this.y = z;
            D();
        }
    }

    private void N() {
        boolean z = true;
        if (!this.q.e().isEmpty()) {
            hz3 hz3Var = new hz3(this.q.e());
            this.s = hz3Var;
            hz3Var.l();
            this.s.a(new t70.b() { // from class: u70
                @Override // defpackage.t70.b
                public final void a() {
                    v70.this.E();
                }
            });
            if (this.s.h().floatValue() != 1.0f) {
                z = false;
            }
            M(z);
            i(this.s);
            return;
        }
        M(true);
    }

    private void j(Canvas canvas, Matrix matrix, t70<yga, Path> t70Var, t70<Integer, Integer> t70Var2) {
        this.a.set(t70Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (t70Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
    }

    private void k(Canvas canvas, Matrix matrix, t70<yga, Path> t70Var, t70<Integer, Integer> t70Var2) {
        fvb.m(canvas, this.i, this.e);
        this.a.set(t70Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (t70Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, t70<yga, Path> t70Var, t70<Integer, Integer> t70Var2) {
        fvb.m(canvas, this.i, this.d);
        canvas.drawRect(this.i, this.d);
        this.a.set(t70Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (t70Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, t70<yga, Path> t70Var, t70<Integer, Integer> t70Var2) {
        fvb.m(canvas, this.i, this.e);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (t70Var2.h().intValue() * 2.55f));
        this.a.set(t70Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, t70<yga, Path> t70Var, t70<Integer, Integer> t70Var2) {
        fvb.m(canvas, this.i, this.f);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (t70Var2.h().intValue() * 2.55f));
        this.a.set(t70Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        oi5.a("Layer#saveLayer");
        fvb.n(canvas, this.i, this.e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        oi5.b("Layer#saveLayer");
        for (int i = 0; i < this.r.b().size(); i++) {
            c96 c96Var = this.r.b().get(i);
            t70<yga, Path> t70Var = this.r.a().get(i);
            t70<Integer, Integer> t70Var2 = this.r.c().get(i);
            int i2 = a.b[c96Var.a().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (c96Var.d()) {
                                l(canvas, matrix, t70Var, t70Var2);
                            } else {
                                j(canvas, matrix, t70Var, t70Var2);
                            }
                        }
                    } else if (c96Var.d()) {
                        m(canvas, matrix, t70Var, t70Var2);
                    } else {
                        k(canvas, matrix, t70Var, t70Var2);
                    }
                } else {
                    if (i == 0) {
                        this.d.setColor(-16777216);
                        this.d.setAlpha(255);
                        canvas.drawRect(this.i, this.d);
                    }
                    if (c96Var.d()) {
                        n(canvas, matrix, t70Var, t70Var2);
                    } else {
                        p(canvas, matrix, t70Var);
                    }
                }
            } else if (q()) {
                this.d.setAlpha(255);
                canvas.drawRect(this.i, this.d);
            }
        }
        oi5.a("Layer#restoreLayer");
        canvas.restore();
        oi5.b("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, t70<yga, Path> t70Var) {
        this.a.set(t70Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
    }

    private boolean q() {
        if (this.r.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.r.b().size(); i++) {
            if (this.r.b().get(i).a() != c96.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.v != null) {
            return;
        }
        if (this.u == null) {
            this.v = Collections.emptyList();
            return;
        }
        this.v = new ArrayList();
        for (v70 v70Var = this.u; v70Var != null; v70Var = v70Var.u) {
            this.v.add(v70Var);
        }
    }

    private void s(Canvas canvas) {
        oi5.a("Layer#clearLayer");
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        oi5.b("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v70 u(ko1 ko1Var, em5 em5Var, n nVar, ez5 ez5Var) {
        switch (a.a[em5Var.f().ordinal()]) {
            case 1:
                return new fha(nVar, em5Var, ko1Var);
            case 2:
                return new ko1(nVar, em5Var, ez5Var.o(em5Var.m()), ez5Var);
            case 3:
                return new kqa(nVar, em5Var);
            case 4:
                return new tu4(nVar, em5Var);
            case 5:
                return new q37(nVar, em5Var);
            case 6:
                return new xbb(nVar, em5Var);
            default:
                ox5.c("Unknown layer type " + em5Var.f());
                return null;
        }
    }

    boolean A() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public void G(t70<?, ?> t70Var) {
        this.w.remove(t70Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(v70 v70Var) {
        this.t = v70Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(boolean z) {
        if (z && this.A == null) {
            this.A = new yi5();
        }
        this.z = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(v70 v70Var) {
        this.u = v70Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(float f) {
        this.x.j(f);
        if (this.r != null) {
            for (int i = 0; i < this.r.a().size(); i++) {
                this.r.a().get(i).m(f);
            }
        }
        hz3 hz3Var = this.s;
        if (hz3Var != null) {
            hz3Var.m(f);
        }
        v70 v70Var = this.t;
        if (v70Var != null) {
            v70Var.L(f);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            this.w.get(i2).m(f);
        }
    }

    @Override // defpackage.t70.b
    public void a() {
        D();
    }

    @Override // defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.o.set(matrix);
        if (z) {
            List<v70> list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.o.preConcat(this.v.get(size).x.f());
                }
            } else {
                v70 v70Var = this.u;
                if (v70Var != null) {
                    this.o.preConcat(v70Var.x.f());
                }
            }
        }
        this.o.preConcat(this.x.f());
    }

    public <T> void f(T t, b06<T> b06Var) {
        this.x.c(t, b06Var);
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        v70 v70Var = this.t;
        if (v70Var != null) {
            of5 a2 = of5Var2.a(v70Var.getName());
            if (of5Var.c(this.t.getName(), i)) {
                list.add(a2.i(this.t));
            }
            if (of5Var.h(getName(), i)) {
                this.t.H(of5Var, of5Var.e(this.t.getName(), i) + i, list, a2);
            }
        }
        if (!of5Var.g(getName(), i)) {
            return;
        }
        if (!"__container".equals(getName())) {
            of5Var2 = of5Var2.a(getName());
            if (of5Var.c(getName(), i)) {
                list.add(of5Var2.i(this));
            }
        }
        if (of5Var.h(getName(), i)) {
            H(of5Var, i + of5Var.e(getName(), i), list, of5Var2);
        }
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.q.i();
    }

    @Override // defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        Paint paint;
        oi5.a(this.n);
        if (this.y && !this.q.x()) {
            r();
            oi5.a("Layer#parentMatrix");
            this.b.reset();
            this.b.set(matrix);
            for (int size = this.v.size() - 1; size >= 0; size--) {
                this.b.preConcat(this.v.get(size).x.f());
            }
            oi5.b("Layer#parentMatrix");
            if (this.x.h() == null) {
                intValue = 100;
            } else {
                intValue = this.x.h().h().intValue();
            }
            int i2 = (int) ((((i / 255.0f) * intValue) / 100.0f) * 255.0f);
            if (!A() && !z()) {
                this.b.preConcat(this.x.f());
                oi5.a("Layer#drawLayer");
                t(canvas, this.b, i2);
                oi5.b("Layer#drawLayer");
                F(oi5.b(this.n));
                return;
            }
            oi5.a("Layer#computeBounds");
            d(this.i, this.b, false);
            C(this.i, matrix);
            this.b.preConcat(this.x.f());
            B(this.i, this.b);
            this.j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.c);
            if (!this.c.isIdentity()) {
                Matrix matrix2 = this.c;
                matrix2.invert(matrix2);
                this.c.mapRect(this.j);
            }
            if (!this.i.intersect(this.j)) {
                this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            oi5.b("Layer#computeBounds");
            if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
                oi5.a("Layer#saveLayer");
                this.d.setAlpha(255);
                fvb.m(canvas, this.i, this.d);
                oi5.b("Layer#saveLayer");
                s(canvas);
                oi5.a("Layer#drawLayer");
                t(canvas, this.b, i2);
                oi5.b("Layer#drawLayer");
                if (z()) {
                    o(canvas, this.b);
                }
                if (A()) {
                    oi5.a("Layer#drawMatte");
                    oi5.a("Layer#saveLayer");
                    fvb.n(canvas, this.i, this.g, 19);
                    oi5.b("Layer#saveLayer");
                    s(canvas);
                    this.t.h(canvas, matrix, i2);
                    oi5.a("Layer#restoreLayer");
                    canvas.restore();
                    oi5.b("Layer#restoreLayer");
                    oi5.b("Layer#drawMatte");
                }
                oi5.a("Layer#restoreLayer");
                canvas.restore();
                oi5.b("Layer#restoreLayer");
            }
            if (this.z && (paint = this.A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.A.setColor(-251901);
                this.A.setStrokeWidth(4.0f);
                canvas.drawRect(this.i, this.A);
                this.A.setStyle(Paint.Style.FILL);
                this.A.setColor(1357638635);
                canvas.drawRect(this.i, this.A);
            }
            F(oi5.b(this.n));
            return;
        }
        oi5.b(this.n);
    }

    public void i(t70<?, ?> t70Var) {
        if (t70Var == null) {
            return;
        }
        this.w.add(t70Var);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i);

    public ae0 v() {
        return this.q.a();
    }

    public BlurMaskFilter w(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    public e93 x() {
        return this.q.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public em5 y() {
        return this.q;
    }

    boolean z() {
        d96 d96Var = this.r;
        if (d96Var != null && !d96Var.a().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
    }

    void H(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
    }
}
