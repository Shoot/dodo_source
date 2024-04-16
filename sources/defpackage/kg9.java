package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import defpackage.t70;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* compiled from: RepeaterContent.java */
/* renamed from: kg9  reason: default package */
/* loaded from: classes.dex */
public class kg9 implements y83, qr7, ji4, t70.b, qf5 {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final n c;
    private final v70 d;
    private final String e;
    private final boolean f;
    private final t70<Float, Float> g;
    private final t70<Float, Float> h;
    private final qkb i;
    private jt1 j;

    public kg9(n nVar, v70 v70Var, jg9 jg9Var) {
        this.c = nVar;
        this.d = v70Var;
        this.e = jg9Var.c();
        this.f = jg9Var.f();
        t70<Float, Float> a = jg9Var.b().a();
        this.g = a;
        v70Var.i(a);
        a.a(this);
        t70<Float, Float> a2 = jg9Var.d().a();
        this.h = a2;
        v70Var.i(a2);
        a2.a(this);
        qkb b = jg9Var.e().b();
        this.i = b;
        b.a(v70Var);
        b.b(this);
    }

    @Override // defpackage.t70.b
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.ji4
    public void e(ListIterator<dt1> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new jt1(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        if (this.i.c(t, b06Var)) {
            return;
        }
        if (t == xz5.u) {
            this.g.n(b06Var);
        } else if (t == xz5.v) {
            this.h.n(b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        ql6.k(of5Var, i, list, of5Var2, this);
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.e;
    }

    @Override // defpackage.qr7
    public Path getPath() {
        Path path = this.j.getPath();
        this.b.reset();
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.g(i + floatValue2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }

    @Override // defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        float floatValue3 = this.i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.i.e().h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.g(f + floatValue2));
            this.j.h(canvas, this.a, (int) (i * ql6.i(floatValue3, floatValue4, f / floatValue)));
        }
    }
}
