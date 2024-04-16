package defpackage;

import java.math.BigInteger;
/* renamed from: ry3  reason: default package */
/* loaded from: classes3.dex */
public class ry3 extends h1 {
    @Override // defpackage.h1
    protected jb3 c(jb3 jb3Var, BigInteger bigInteger) {
        int a;
        ea3 i = jb3Var.i();
        if (bigInteger.bitLength() <= ty3.a(i)) {
            sy3 b = ty3.b(jb3Var);
            za3 a2 = b.a();
            int c = b.c();
            int i2 = ((a + c) - 1) / c;
            jb3 u = i.u();
            int i3 = c * i2;
            int[] r = et6.r(i3, bigInteger);
            int i4 = i3 - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = 0;
                for (int i7 = i4 - i5; i7 >= 0; i7 -= i2) {
                    int i8 = r[i7 >>> 5] >>> (i7 & 31);
                    i6 = ((i6 ^ (i8 >>> 1)) << 1) ^ i8;
                }
                u = u.K(a2.b(i6));
            }
            return u.a(b.b());
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
