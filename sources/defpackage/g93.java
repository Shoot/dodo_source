package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import defpackage.t70;
/* compiled from: DropShadowKeyframeAnimation.java */
/* renamed from: g93  reason: default package */
/* loaded from: classes.dex */
public class g93 implements t70.b {
    private final t70.b a;
    private final t70<Integer, Integer> b;
    private final t70<Float, Float> c;
    private final t70<Float, Float> d;
    private final t70<Float, Float> e;
    private final t70<Float, Float> f;
    private boolean g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* renamed from: g93$a */
    /* loaded from: classes.dex */
    class a extends b06<Float> {
        final /* synthetic */ b06 d;

        a(b06 b06Var) {
            this.d = b06Var;
        }

        @Override // defpackage.b06
        /* renamed from: d */
        public Float a(qz5<Float> qz5Var) {
            Float f = (Float) this.d.a(qz5Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public g93(t70.b bVar, v70 v70Var, e93 e93Var) {
        this.a = bVar;
        t70<Integer, Integer> a2 = e93Var.a().a();
        this.b = a2;
        a2.a(this);
        v70Var.i(a2);
        t70<Float, Float> a3 = e93Var.d().a();
        this.c = a3;
        a3.a(this);
        v70Var.i(a3);
        t70<Float, Float> a4 = e93Var.b().a();
        this.d = a4;
        a4.a(this);
        v70Var.i(a4);
        t70<Float, Float> a5 = e93Var.c().a();
        this.e = a5;
        a5.a(this);
        v70Var.i(a5);
        t70<Float, Float> a6 = e93Var.e().a();
        this.f = a6;
        a6.a(this);
        v70Var.i(a6);
    }

    @Override // defpackage.t70.b
    public void a() {
        this.g = true;
        this.a.a();
    }

    public void b(Paint paint) {
        if (!this.g) {
            return;
        }
        this.g = false;
        double floatValue = this.d.h().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.e.h().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.b.h().intValue();
        paint.setShadowLayer(this.f.h().floatValue(), sin, cos, Color.argb(Math.round(this.c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public void c(b06<Integer> b06Var) {
        this.b.n(b06Var);
    }

    public void d(b06<Float> b06Var) {
        this.d.n(b06Var);
    }

    public void e(b06<Float> b06Var) {
        this.e.n(b06Var);
    }

    public void f(b06<Float> b06Var) {
        if (b06Var == null) {
            this.c.n(null);
        } else {
            this.c.n(new a(b06Var));
        }
    }

    public void g(b06<Float> b06Var) {
        this.f.n(b06Var);
    }
}
