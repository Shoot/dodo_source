package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import defpackage.mha;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseStrokeContent.java */
/* renamed from: j80  reason: default package */
/* loaded from: classes.dex */
public abstract class j80 implements t70.b, qf5, y83 {
    private final n e;
    protected final v70 f;
    private final float[] h;
    final Paint i;
    private final t70<?, Float> j;
    private final t70<?, Integer> k;
    private final List<t70<?, Float>> l;
    private final t70<?, Float> m;
    private t70<ColorFilter, ColorFilter> n;
    private t70<Float, Float> o;
    float p;
    private g93 q;
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final List<b> g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseStrokeContent.java */
    /* renamed from: j80$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final List<qr7> a;
        private final bnb b;

        private b(bnb bnbVar) {
            this.a = new ArrayList();
            this.b = bnbVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j80(n nVar, v70 v70Var, Paint.Cap cap, Paint.Join join, float f, rj rjVar, pj pjVar, List<pj> list, pj pjVar2) {
        yi5 yi5Var = new yi5(1);
        this.i = yi5Var;
        this.p = 0.0f;
        this.e = nVar;
        this.f = v70Var;
        yi5Var.setStyle(Paint.Style.STROKE);
        yi5Var.setStrokeCap(cap);
        yi5Var.setStrokeJoin(join);
        yi5Var.setStrokeMiter(f);
        this.k = rjVar.a();
        this.j = pjVar.a();
        if (pjVar2 == null) {
            this.m = null;
        } else {
            this.m = pjVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        v70Var.i(this.k);
        v70Var.i(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            v70Var.i(this.l.get(i2));
        }
        t70<?, Float> t70Var = this.m;
        if (t70Var != null) {
            v70Var.i(t70Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        t70<?, Float> t70Var2 = this.m;
        if (t70Var2 != null) {
            t70Var2.a(this);
        }
        if (v70Var.v() != null) {
            t70<Float, Float> a2 = v70Var.v().a().a();
            this.o = a2;
            a2.a(this);
            v70Var.i(this.o);
        }
        if (v70Var.x() != null) {
            this.q = new g93(this, v70Var, v70Var.x());
        }
    }

    private void e(Matrix matrix) {
        float floatValue;
        oi5.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            oi5.b("StrokeContent#applyDashPattern");
            return;
        }
        float g = fvb.g(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = this.l.get(i).h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * g;
        }
        t70<?, Float> t70Var = this.m;
        if (t70Var == null) {
            floatValue = 0.0f;
        } else {
            floatValue = g * t70Var.h().floatValue();
        }
        this.i.setPathEffect(new DashPathEffect(this.h, floatValue));
        oi5.b("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        float f;
        float f2;
        float f3;
        oi5.a("StrokeContent#applyTrimPath");
        if (bVar.b == null) {
            oi5.b("StrokeContent#applyTrimPath");
            return;
        }
        this.b.reset();
        for (int size = bVar.a.size() - 1; size >= 0; size--) {
            this.b.addPath(((qr7) bVar.a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.b.f().h().floatValue() / 100.0f;
        float floatValue3 = bVar.b.g().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.i);
            oi5.b("StrokeContent#applyTrimPath");
            return;
        }
        this.a.setPath(this.b, false);
        float length = this.a.getLength();
        while (this.a.nextContour()) {
            length += this.a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = bVar.a.size() - 1; size2 >= 0; size2--) {
            this.c.set(((qr7) bVar.a.get(size2)).getPath());
            this.c.transform(matrix);
            this.a.setPath(this.c, false);
            float length2 = this.a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    if (f5 > length) {
                        f3 = (f5 - length) / length2;
                    } else {
                        f3 = 0.0f;
                    }
                    fvb.a(this.c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.c, this.i);
                    f6 += length2;
                }
            }
            float f8 = f6 + length2;
            if (f8 >= f5 && f6 <= min) {
                if (f8 <= min && f5 < f6) {
                    canvas.drawPath(this.c, this.i);
                } else {
                    if (f5 < f6) {
                        f = 0.0f;
                    } else {
                        f = (f5 - f6) / length2;
                    }
                    if (min > f8) {
                        f2 = 1.0f;
                    } else {
                        f2 = (min - f6) / length2;
                    }
                    fvb.a(this.c, f, f2, 0.0f);
                    canvas.drawPath(this.c, this.i);
                }
            }
            f6 += length2;
        }
        oi5.b("StrokeContent#applyTrimPath");
    }

    @Override // defpackage.t70.b
    public void a() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        bnb bnbVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            dt1 dt1Var = list.get(size);
            if (dt1Var instanceof bnb) {
                bnb bnbVar2 = (bnb) dt1Var;
                if (bnbVar2.j() == mha.a.INDIVIDUALLY) {
                    bnbVar = bnbVar2;
                }
            }
        }
        if (bnbVar != null) {
            bnbVar.e(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            dt1 dt1Var2 = list2.get(size2);
            if (dt1Var2 instanceof bnb) {
                bnb bnbVar3 = (bnb) dt1Var2;
                if (bnbVar3.j() == mha.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(bnbVar3);
                    bnbVar3.e(this);
                }
            }
            if (dt1Var2 instanceof qr7) {
                if (bVar == null) {
                    bVar = new b(bnbVar);
                }
                bVar.a.add((qr7) dt1Var2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        oi5.a("StrokeContent#getBounds");
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((qr7) bVar.a.get(i2)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float p = ((hz3) this.j).p();
        RectF rectF2 = this.d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        oi5.b("StrokeContent#getBounds");
    }

    public <T> void f(T t, b06<T> b06Var) {
        g93 g93Var;
        g93 g93Var2;
        g93 g93Var3;
        g93 g93Var4;
        g93 g93Var5;
        if (t == xz5.d) {
            this.k.n(b06Var);
        } else if (t == xz5.s) {
            this.j.n(b06Var);
        } else if (t == xz5.K) {
            t70<ColorFilter, ColorFilter> t70Var = this.n;
            if (t70Var != null) {
                this.f.G(t70Var);
            }
            if (b06Var == null) {
                this.n = null;
                return;
            }
            dwb dwbVar = new dwb(b06Var);
            this.n = dwbVar;
            dwbVar.a(this);
            this.f.i(this.n);
        } else if (t == xz5.j) {
            t70<Float, Float> t70Var2 = this.o;
            if (t70Var2 != null) {
                t70Var2.n(b06Var);
                return;
            }
            dwb dwbVar2 = new dwb(b06Var);
            this.o = dwbVar2;
            dwbVar2.a(this);
            this.f.i(this.o);
        } else if (t == xz5.e && (g93Var5 = this.q) != null) {
            g93Var5.c(b06Var);
        } else if (t == xz5.G && (g93Var4 = this.q) != null) {
            g93Var4.f(b06Var);
        } else if (t == xz5.H && (g93Var3 = this.q) != null) {
            g93Var3.d(b06Var);
        } else if (t == xz5.I && (g93Var2 = this.q) != null) {
            g93Var2.e(b06Var);
        } else if (t == xz5.J && (g93Var = this.q) != null) {
            g93Var.g(b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        ql6.k(of5Var, i, list, of5Var2, this);
    }

    public void h(Canvas canvas, Matrix matrix, int i) {
        oi5.a("StrokeContent#draw");
        if (fvb.h(matrix)) {
            oi5.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(ql6.c((int) ((((i / 255.0f) * ((e65) this.k).p()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((hz3) this.j).p() * fvb.g(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            oi5.b("StrokeContent#draw");
            return;
        }
        e(matrix);
        t70<ColorFilter, ColorFilter> t70Var = this.n;
        if (t70Var != null) {
            this.i.setColorFilter(t70Var.h());
        }
        t70<Float, Float> t70Var2 = this.o;
        if (t70Var2 != null) {
            float floatValue = t70Var2.h().floatValue();
            if (floatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (floatValue != this.p) {
                this.i.setMaskFilter(this.f.w(floatValue));
            }
            this.p = floatValue;
        }
        g93 g93Var = this.q;
        if (g93Var != null) {
            g93Var.b(this.i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.b != null) {
                i(canvas, bVar, matrix);
            } else {
                oi5.a("StrokeContent#buildPath");
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((qr7) bVar.a.get(size)).getPath(), matrix);
                }
                oi5.b("StrokeContent#buildPath");
                oi5.a("StrokeContent#drawPath");
                canvas.drawPath(this.b, this.i);
                oi5.b("StrokeContent#drawPath");
            }
        }
        oi5.b("StrokeContent#draw");
    }
}
