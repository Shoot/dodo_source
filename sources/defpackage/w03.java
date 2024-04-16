package defpackage;

import java.io.Serializable;
/* compiled from: DeserializationConfig.java */
/* renamed from: w03  reason: default package */
/* loaded from: classes2.dex */
public final class w03 extends x76<y03, w03> implements Serializable {
    private static final int v = w76.c(y03.class);
    protected final kb5 o;
    protected final ta1 p;
    protected final int q;
    protected final int r;
    protected final int s;
    protected final int t;
    protected final int u;

    public w03(i80 i80Var, q1b q1bVar, mla mlaVar, bo9 bo9Var, vp1 vp1Var, ta1 ta1Var) {
        super(i80Var, q1bVar, mlaVar, bo9Var, vp1Var);
        this.q = v;
        this.o = kb5.d;
        this.p = ta1Var;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.x76
    /* renamed from: z0 */
    public final w03 b0(long j) {
        return new w03(this, j, this.q, this.r, this.s, this.t, this.u);
    }

    private w03(w03 w03Var, long j, int i, int i2, int i3, int i4, int i5) {
        super(w03Var, j);
        this.q = i;
        w03Var.getClass();
        this.o = w03Var.o;
        this.p = w03Var.p;
        this.r = i2;
        this.s = i3;
        this.t = i4;
        this.u = i5;
    }
}
