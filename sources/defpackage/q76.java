package defpackage;

import android.content.Context;
import org.osmdroid.tileprovider.tilesource.a;
/* compiled from: MapTileProviderBasic.java */
/* renamed from: q76  reason: default package */
/* loaded from: classes3.dex */
public class q76 extends o76 implements ds4 {
    protected ur4 j;
    private final js4 k;
    private final g76 l;
    private final x66 m;

    public q76(Context context, a aVar) {
        this(context, aVar, null);
    }

    public static i76 G(rs4 rs4Var, a aVar, ur4 ur4Var) {
        if (ur4Var instanceof egb) {
            return new j76(rs4Var, aVar);
        }
        return new s76(rs4Var, aVar);
    }

    protected x66 C(i76 i76Var, i76 i76Var2, i76 i76Var3) {
        x66 x66Var = new x66();
        x66Var.n(i76Var);
        x66Var.n(i76Var2);
        x66Var.n(i76Var3);
        return x66Var;
    }

    protected i76 D(rs4 rs4Var, a aVar) {
        return new h76(rs4Var, aVar);
    }

    protected i76 E(rs4 rs4Var, a aVar, Context context) {
        return new d76(rs4Var, context.getAssets(), aVar);
    }

    protected g76 F(js4 js4Var, a aVar) {
        return new g76(aVar, this.j, js4Var);
    }

    public boolean H(boolean z) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (m76 m76Var : this.i) {
            if (i == -1 && m76Var == this.l) {
                i = i3;
            }
            if (i2 == -1 && m76Var == this.m) {
                i2 = i3;
            }
            i3++;
        }
        if (i == -1 || i2 == -1) {
            return false;
        }
        if (i2 < i && z) {
            return true;
        }
        if (i2 > i && !z) {
            return true;
        }
        this.i.set(i, this.m);
        this.i.set(i2, this.l);
        return true;
    }

    @Override // defpackage.o76, defpackage.p76
    public void i() {
        ur4 ur4Var = this.j;
        if (ur4Var != null) {
            ur4Var.b();
        }
        this.j = null;
        super.i();
    }

    @Override // defpackage.o76
    protected boolean z(long j) {
        int e;
        js4 js4Var = this.k;
        if ((js4Var != null && !js4Var.a()) || !w()) {
            return true;
        }
        int i = -1;
        int i2 = -1;
        for (m76 m76Var : this.i) {
            if (m76Var.i()) {
                int e2 = m76Var.e();
                if (i == -1 || i > e2) {
                    i = e2;
                }
                int d = m76Var.d();
                if (i2 == -1 || i2 < d) {
                    i2 = d;
                }
            }
        }
        if (i == -1 || i2 == -1 || (e = k76.e(j)) < i || e > i2) {
            return true;
        }
        return false;
    }

    public q76(Context context, a aVar, ur4 ur4Var) {
        this(new sla(context), new wv6(context), aVar, context, ur4Var);
    }

    public q76(rs4 rs4Var, js4 js4Var, a aVar, Context context, ur4 ur4Var) {
        super(aVar, rs4Var);
        this.k = js4Var;
        if (ur4Var != null) {
            this.j = ur4Var;
        } else {
            this.j = new osa();
        }
        i76 E = E(rs4Var, aVar, context);
        this.i.add(E);
        i76 G = G(rs4Var, aVar, this.j);
        this.i.add(G);
        i76 D = D(rs4Var, aVar);
        this.i.add(D);
        x66 C = C(E, G, D);
        this.m = C;
        this.i.add(C);
        g76 F = F(js4Var, aVar);
        this.l = F;
        this.i.add(F);
        n().h().add(new c76(-1));
        n().h().add(new z66(1));
        n().p(false);
        n().q(false);
        n().g().c(E);
        n().g().c(G);
        n().g().c(D);
        n().g().c(F);
        n().i().add(this);
        H(true);
    }
}
