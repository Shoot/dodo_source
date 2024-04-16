package defpackage;

import defpackage.lr1;
/* compiled from: Optimizer.java */
/* renamed from: lb7  reason: default package */
/* loaded from: classes.dex */
public class lb7 {
    static boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(mr1 mr1Var, gq5 gq5Var, lr1 lr1Var) {
        lr1Var.s = -1;
        lr1Var.t = -1;
        lr1.b bVar = mr1Var.a0[0];
        lr1.b bVar2 = lr1.b.WRAP_CONTENT;
        if (bVar != bVar2 && lr1Var.a0[0] == lr1.b.MATCH_PARENT) {
            int i = lr1Var.P.g;
            int U = mr1Var.U() - lr1Var.R.g;
            hr1 hr1Var = lr1Var.P;
            hr1Var.i = gq5Var.q(hr1Var);
            hr1 hr1Var2 = lr1Var.R;
            hr1Var2.i = gq5Var.q(hr1Var2);
            gq5Var.f(lr1Var.P.i, i);
            gq5Var.f(lr1Var.R.i, U);
            lr1Var.s = 2;
            lr1Var.J0(i, U);
        }
        if (mr1Var.a0[1] != bVar2 && lr1Var.a0[1] == lr1.b.MATCH_PARENT) {
            int i2 = lr1Var.Q.g;
            int y = mr1Var.y() - lr1Var.S.g;
            hr1 hr1Var3 = lr1Var.Q;
            hr1Var3.i = gq5Var.q(hr1Var3);
            hr1 hr1Var4 = lr1Var.S;
            hr1Var4.i = gq5Var.q(hr1Var4);
            gq5Var.f(lr1Var.Q.i, i2);
            gq5Var.f(lr1Var.S.i, y);
            if (lr1Var.m0 > 0 || lr1Var.T() == 8) {
                hr1 hr1Var5 = lr1Var.T;
                hr1Var5.i = gq5Var.q(hr1Var5);
                gq5Var.f(lr1Var.T.i, lr1Var.m0 + i2);
            }
            lr1Var.t = 2;
            lr1Var.a1(i2, y);
        }
    }

    public static final boolean b(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
