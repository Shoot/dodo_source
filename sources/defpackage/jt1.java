package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ContentGroup.java */
/* renamed from: jt1  reason: default package */
/* loaded from: classes.dex */
public class jt1 implements y83, qr7, t70.b, pf5 {
    private final Paint a;
    private final RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<dt1> h;
    private final n i;
    private List<qr7> j;
    private qkb k;

    public jt1(n nVar, v70 v70Var, cha chaVar) {
        this(nVar, v70Var, chaVar.c(), chaVar.d(), e(nVar, v70Var, chaVar.b()), i(chaVar.b()));
    }

    private static List<dt1> e(n nVar, v70 v70Var, List<xt1> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            dt1 a = list.get(i).a(nVar, v70Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    static bk i(List<xt1> list) {
        for (int i = 0; i < list.size(); i++) {
            xt1 xt1Var = list.get(i);
            if (xt1Var instanceof bk) {
                return (bk) xt1Var;
            }
        }
        return null;
    }

    private boolean l() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof y83) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.t70.b
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            dt1 dt1Var = this.h.get(size);
            dt1Var.b(arrayList, this.h.subList(0, size));
            arrayList.add(dt1Var);
        }
    }

    @Override // defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        qkb qkbVar = this.k;
        if (qkbVar != null) {
            this.c.preConcat(qkbVar.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            dt1 dt1Var = this.h.get(size);
            if (dt1Var instanceof y83) {
                ((y83) dt1Var).d(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        qkb qkbVar = this.k;
        if (qkbVar != null) {
            qkbVar.c(t, b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        if (!of5Var.g(getName(), i) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            of5Var2 = of5Var2.a(getName());
            if (of5Var.c(getName(), i)) {
                list.add(of5Var2.i(this));
            }
        }
        if (of5Var.h(getName(), i)) {
            int e = i + of5Var.e(getName(), i);
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                dt1 dt1Var = this.h.get(i2);
                if (dt1Var instanceof pf5) {
                    ((pf5) dt1Var).g(of5Var, e, list, of5Var2);
                }
            }
        }
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.f;
    }

    @Override // defpackage.qr7
    public Path getPath() {
        this.c.reset();
        qkb qkbVar = this.k;
        if (qkbVar != null) {
            this.c.set(qkbVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            dt1 dt1Var = this.h.get(size);
            if (dt1Var instanceof qr7) {
                this.d.addPath(((qr7) dt1Var).getPath(), this.c);
            }
        }
        return this.d;
    }

    @Override // defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int intValue;
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        qkb qkbVar = this.k;
        if (qkbVar != null) {
            this.c.preConcat(qkbVar.f());
            if (this.k.h() == null) {
                intValue = 100;
            } else {
                intValue = this.k.h().h().intValue();
            }
            i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        if (this.i.b0() && l() && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.b, this.c, true);
            this.a.setAlpha(i);
            fvb.m(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            dt1 dt1Var = this.h.get(size);
            if (dt1Var instanceof y83) {
                ((y83) dt1Var).h(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<qr7> j() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                dt1 dt1Var = this.h.get(i);
                if (dt1Var instanceof qr7) {
                    this.j.add((qr7) dt1Var);
                }
            }
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix k() {
        qkb qkbVar = this.k;
        if (qkbVar != null) {
            return qkbVar.f();
        }
        this.c.reset();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jt1(n nVar, v70 v70Var, String str, boolean z, List<dt1> list, bk bkVar) {
        this.a = new yi5();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = nVar;
        this.g = z;
        this.h = list;
        if (bkVar != null) {
            qkb b = bkVar.b();
            this.k = b;
            b.a(v70Var);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            dt1 dt1Var = list.get(size);
            if (dt1Var instanceof ji4) {
                arrayList.add((ji4) dt1Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ji4) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
