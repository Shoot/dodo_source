package defpackage;

import java.math.BigInteger;
/* renamed from: l2c  reason: default package */
/* loaded from: classes3.dex */
public class l2c extends h1 {
    @Override // defpackage.h1
    protected jb3 c(jb3 jb3Var, BigInteger bigInteger) {
        jb3[] jb3VarArr;
        jb3[] jb3VarArr2;
        jb3 jb3Var2;
        m2c l = n2c.l(jb3Var, n2c.i(bigInteger.bitLength()), true);
        jb3[] c = l.c();
        jb3[] d = l.d();
        int g = l.g();
        int[] e = n2c.e(g, bigInteger);
        jb3 u = jb3Var.i().u();
        int length = e.length;
        if (length > 1) {
            length--;
            int i = e[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int abs = Math.abs(i2);
            if (i2 < 0) {
                jb3VarArr2 = d;
            } else {
                jb3VarArr2 = c;
            }
            if ((abs << 2) < (1 << g)) {
                int a = g65.a(abs);
                int i4 = g - (32 - a);
                jb3Var2 = jb3VarArr2[((1 << (g - 1)) - 1) >>> 1].a(jb3VarArr2[(((abs ^ (1 << (31 - a))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                jb3Var2 = jb3VarArr2[abs >>> 1];
            }
            u = jb3Var2.I(i3);
        }
        while (length > 0) {
            length--;
            int i5 = e[length];
            int i6 = i5 >> 16;
            int i7 = i5 & 65535;
            int abs2 = Math.abs(i6);
            if (i6 < 0) {
                jb3VarArr = d;
            } else {
                jb3VarArr = c;
            }
            u = u.K(jb3VarArr[abs2 >>> 1]).I(i7);
        }
        return u;
    }
}
