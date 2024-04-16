package defpackage;

import java.math.BigInteger;
/* renamed from: xh3  reason: default package */
/* loaded from: classes3.dex */
public abstract class xh3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh3$a */
    /* loaded from: classes3.dex */
    public static class a implements hg8 {
        final /* synthetic */ ma3 a;
        final /* synthetic */ jb3 b;

        a(ma3 ma3Var, jb3 jb3Var) {
            this.a = ma3Var;
            this.b = jb3Var;
        }

        private boolean b(wh3 wh3Var, ma3 ma3Var) {
            if (wh3Var != null && wh3Var.a() == ma3Var && wh3Var.b() != null) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hg8
        public ig8 a(ig8 ig8Var) {
            wh3 wh3Var;
            if (ig8Var instanceof wh3) {
                wh3Var = (wh3) ig8Var;
            } else {
                wh3Var = null;
            }
            if (b(wh3Var, this.a)) {
                return wh3Var;
            }
            jb3 a = this.a.b().a(this.b);
            wh3 wh3Var2 = new wh3();
            wh3Var2.c(this.a);
            wh3Var2.d(a);
            return wh3Var2;
        }
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z;
        if (bigInteger2.signum() < 0) {
            z = true;
        } else {
            z = false;
        }
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(da3.b);
        }
        if (z) {
            return shiftRight.negate();
        }
        return shiftRight;
    }

    public static BigInteger[] b(dv9 dv9Var, BigInteger bigInteger) {
        int b = dv9Var.b();
        BigInteger a2 = a(bigInteger, dv9Var.c(), b);
        BigInteger a3 = a(bigInteger, dv9Var.d(), b);
        return new BigInteger[]{bigInteger.subtract(a2.multiply(dv9Var.e()).add(a3.multiply(dv9Var.g()))), a2.multiply(dv9Var.f()).add(a3.multiply(dv9Var.h())).negate()};
    }

    public static jb3 c(ma3 ma3Var, jb3 jb3Var) {
        return ((wh3) jb3Var.i().B(jb3Var, "bc_endo", new a(ma3Var, jb3Var))).b();
    }
}
