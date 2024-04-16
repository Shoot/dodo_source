package defpackage;

import defpackage.ua5;
import java.io.Serializable;
/* compiled from: SerializationConfig.java */
/* renamed from: pca  reason: default package */
/* loaded from: classes2.dex */
public final class pca extends x76<qca, pca> implements Serializable {
    protected static final jj8 u = new ir2();
    private static final int v = w76.c(qca.class);
    protected final jj8 o;
    protected final int p;
    protected final int q;
    protected final int r;
    protected final int s;
    protected final int t;

    public pca(i80 i80Var, q1b q1bVar, mla mlaVar, bo9 bo9Var, vp1 vp1Var) {
        super(i80Var, q1bVar, mlaVar, bo9Var, vp1Var);
        this.p = v;
        this.o = u;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
    }

    public jj8 E0() {
        jj8 jj8Var = this.o;
        if (jj8Var instanceof k55) {
            return (jj8) ((k55) jj8Var).d();
        }
        return jj8Var;
    }

    public xu3 F0() {
        return null;
    }

    public void I0(ua5 ua5Var) {
        jj8 E0;
        if (qca.INDENT_OUTPUT.k(this.p) && ua5Var.o() == null && (E0 = E0()) != null) {
            ua5Var.E(E0);
        }
        boolean k = qca.WRITE_BIGDECIMAL_AS_PLAIN.k(this.p);
        int i = this.r;
        if (i != 0 || k) {
            int i2 = this.q;
            if (k) {
                int o = ua5.b.WRITE_BIGDECIMAL_AS_PLAIN.o();
                i2 |= o;
                i |= o;
            }
            ua5Var.s(i2, i);
        }
        int i3 = this.t;
        if (i3 != 0) {
            ua5Var.r(this.s, i3);
        }
    }

    public fa0 J0(y85 y85Var) {
        return k().b(this, y85Var, this);
    }

    public final boolean K0(qca qcaVar) {
        if ((qcaVar.i() & this.p) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.x76
    /* renamed from: z0 */
    public final pca b0(long j) {
        return new pca(this, j, this.p, this.q, this.r, this.s, this.t);
    }

    private pca(pca pcaVar, long j, int i, int i2, int i3, int i4, int i5) {
        super(pcaVar, j);
        this.p = i;
        pcaVar.getClass();
        this.o = pcaVar.o;
        this.q = i2;
        this.r = i3;
        this.s = i4;
        this.t = i5;
    }
}
