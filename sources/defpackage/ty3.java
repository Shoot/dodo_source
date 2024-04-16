package defpackage;

import java.math.BigInteger;
/* renamed from: ty3  reason: default package */
/* loaded from: classes3.dex */
public class ty3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ty3$a */
    /* loaded from: classes3.dex */
    public static class a implements hg8 {
        final /* synthetic */ ea3 a;
        final /* synthetic */ jb3 b;

        a(ea3 ea3Var, jb3 jb3Var) {
            this.a = ea3Var;
            this.b = jb3Var;
        }

        private boolean b(sy3 sy3Var, int i) {
            if (sy3Var != null && c(sy3Var.a(), i)) {
                return true;
            }
            return false;
        }

        private boolean c(za3 za3Var, int i) {
            if (za3Var != null && za3Var.a() >= i) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hg8
        public ig8 a(ig8 ig8Var) {
            sy3 sy3Var;
            int i;
            if (ig8Var instanceof sy3) {
                sy3Var = (sy3) ig8Var;
            } else {
                sy3Var = null;
            }
            int a = ty3.a(this.a);
            if (a > 250) {
                i = 6;
            } else {
                i = 5;
            }
            int i2 = 1 << i;
            if (b(sy3Var, i2)) {
                return sy3Var;
            }
            int i3 = ((a + i) - 1) / i;
            jb3[] jb3VarArr = new jb3[i + 1];
            jb3VarArr[0] = this.b;
            for (int i4 = 1; i4 < i; i4++) {
                jb3VarArr[i4] = jb3VarArr[i4 - 1].I(i3);
            }
            jb3VarArr[i] = jb3VarArr[0].G(jb3VarArr[1]);
            this.a.z(jb3VarArr);
            jb3[] jb3VarArr2 = new jb3[i2];
            jb3VarArr2[0] = jb3VarArr[0];
            for (int i5 = i - 1; i5 >= 0; i5--) {
                jb3 jb3Var = jb3VarArr[i5];
                int i6 = 1 << i5;
                for (int i7 = i6; i7 < i2; i7 += i6 << 1) {
                    jb3VarArr2[i7] = jb3VarArr2[i7 - i6].a(jb3Var);
                }
            }
            this.a.z(jb3VarArr2);
            sy3 sy3Var2 = new sy3();
            sy3Var2.d(this.a.e(jb3VarArr2, 0, i2));
            sy3Var2.e(jb3VarArr[i]);
            sy3Var2.f(i);
            return sy3Var2;
        }
    }

    public static int a(ea3 ea3Var) {
        BigInteger w = ea3Var.w();
        if (w == null) {
            return ea3Var.t() + 1;
        }
        return w.bitLength();
    }

    public static sy3 b(jb3 jb3Var) {
        ea3 i = jb3Var.i();
        return (sy3) i.B(jb3Var, "bc_fixed_point", new a(i, jb3Var));
    }
}
