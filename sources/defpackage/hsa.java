package defpackage;

import android.graphics.PointF;
import java.util.Collections;
/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* renamed from: hsa  reason: default package */
/* loaded from: classes.dex */
public class hsa extends t70<PointF, PointF> {
    private final PointF i;
    private final PointF j;
    private final t70<Float, Float> k;
    private final t70<Float, Float> l;
    protected b06<Float> m;
    protected b06<Float> n;

    public hsa(t70<Float, Float> t70Var, t70<Float, Float> t70Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = t70Var;
        this.l = t70Var2;
        m(f());
    }

    @Override // defpackage.t70
    public void m(float f) {
        this.k.m(f);
        this.l.m(f);
        this.i.set(this.k.h().floatValue(), this.l.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override // defpackage.t70
    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t70
    /* renamed from: q */
    public PointF i(lg5<PointF> lg5Var, float f) {
        Float f2;
        lg5<Float> b;
        float floatValue;
        lg5<Float> b2;
        float floatValue2;
        Float f3 = null;
        if (this.m != null && (b2 = this.k.b()) != null) {
            float d = this.k.d();
            Float f4 = b2.h;
            b06<Float> b06Var = this.m;
            float f5 = b2.g;
            if (f4 == null) {
                floatValue2 = f5;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = b06Var.b(f5, floatValue2, b2.b, b2.c, f, f, d);
        } else {
            f2 = null;
        }
        if (this.n != null && (b = this.l.b()) != null) {
            float d2 = this.l.d();
            Float f6 = b.h;
            b06<Float> b06Var2 = this.n;
            float f7 = b.g;
            if (f6 == null) {
                floatValue = f7;
            } else {
                floatValue = f6.floatValue();
            }
            f3 = b06Var2.b(f7, floatValue, b.b, b.c, f, f, d2);
        }
        if (f2 == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.j;
    }

    public void r(b06<Float> b06Var) {
        b06<Float> b06Var2 = this.m;
        if (b06Var2 != null) {
            b06Var2.c(null);
        }
        this.m = b06Var;
        if (b06Var != null) {
            b06Var.c(this);
        }
    }

    public void s(b06<Float> b06Var) {
        b06<Float> b06Var2 = this.n;
        if (b06Var2 != null) {
            b06Var2.c(null);
        }
        this.n = b06Var;
        if (b06Var != null) {
            b06Var.c(this);
        }
    }
}
