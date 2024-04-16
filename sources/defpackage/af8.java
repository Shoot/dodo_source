package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.n;
/* compiled from: PolystarShape.java */
/* renamed from: af8  reason: default package */
/* loaded from: classes.dex */
public class af8 implements xt1 {
    private final String a;
    private final a b;
    private final pj c;
    private final dk<PointF, PointF> d;
    private final pj e;
    private final pj f;
    private final pj g;
    private final pj h;
    private final pj i;
    private final boolean j;
    private final boolean k;

    /* compiled from: PolystarShape.java */
    /* renamed from: af8$a */
    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int a;

        a(int i) {
            this.a = i;
        }

        public static a a(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public af8(String str, a aVar, pj pjVar, dk<PointF, PointF> dkVar, pj pjVar2, pj pjVar3, pj pjVar4, pj pjVar5, pj pjVar6, boolean z, boolean z2) {
        this.a = str;
        this.b = aVar;
        this.c = pjVar;
        this.d = dkVar;
        this.e = pjVar2;
        this.f = pjVar3;
        this.g = pjVar4;
        this.h = pjVar5;
        this.i = pjVar6;
        this.j = z;
        this.k = z2;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new ze8(nVar, v70Var, this);
    }

    public pj b() {
        return this.f;
    }

    public pj c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public pj e() {
        return this.g;
    }

    public pj f() {
        return this.i;
    }

    public pj g() {
        return this.c;
    }

    public dk<PointF, PointF> h() {
        return this.d;
    }

    public pj i() {
        return this.e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }
}
