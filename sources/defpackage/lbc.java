package defpackage;

import defpackage.aj5;
import defpackage.an4;
/* renamed from: lbc  reason: default package */
/* loaded from: classes3.dex */
class lbc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static kbc a(o2c o2cVar, r2c r2cVar, aj5 aj5Var) {
        double d;
        if (r2cVar != null) {
            if (aj5Var != null) {
                int a = o2cVar.d().a();
                byte[][] a2 = r2cVar.a();
                kbc[] kbcVarArr = new kbc[a2.length];
                for (int i = 0; i < a2.length; i++) {
                    kbcVarArr[i] = new kbc(0, a2[i]);
                }
                aj5.b f = new aj5.b().g(aj5Var.b()).h(aj5Var.c()).n(aj5Var.e()).o(0).p(aj5Var.g()).f(aj5Var.a());
                while (true) {
                    aj5 aj5Var2 = (aj5) f.l();
                    if (a > 1) {
                        int i2 = 0;
                        while (true) {
                            d = a / 2;
                            if (i2 >= ((int) Math.floor(d))) {
                                break;
                            }
                            aj5Var2 = (aj5) new aj5.b().g(aj5Var2.b()).h(aj5Var2.c()).n(aj5Var2.e()).o(aj5Var2.f()).p(i2).f(aj5Var2.a()).l();
                            int i3 = i2 * 2;
                            kbcVarArr[i2] = b(o2cVar, kbcVarArr[i3], kbcVarArr[i3 + 1], aj5Var2);
                            i2++;
                        }
                        if (a % 2 == 1) {
                            kbcVarArr[(int) Math.floor(d)] = kbcVarArr[a - 1];
                        }
                        a = (int) Math.ceil(a / 2.0d);
                        f = new aj5.b().g(aj5Var2.b()).h(aj5Var2.c()).n(aj5Var2.e()).o(aj5Var2.f() + 1).p(aj5Var2.g()).f(aj5Var2.a());
                    } else {
                        return kbcVarArr[0];
                    }
                }
            } else {
                throw new NullPointerException("address == null");
            }
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kbc b(o2c o2cVar, kbc kbcVar, kbc kbcVar2, yac yacVar) {
        if (kbcVar != null) {
            if (kbcVar2 != null) {
                if (kbcVar.a() == kbcVar2.a()) {
                    if (yacVar != null) {
                        byte[] f = o2cVar.f();
                        if (yacVar instanceof aj5) {
                            aj5 aj5Var = (aj5) yacVar;
                            yacVar = (aj5) new aj5.b().g(aj5Var.b()).h(aj5Var.c()).n(aj5Var.e()).o(aj5Var.f()).p(aj5Var.g()).f(0).l();
                        } else if (yacVar instanceof an4) {
                            an4 an4Var = (an4) yacVar;
                            yacVar = (an4) new an4.b().g(an4Var.b()).h(an4Var.c()).m(an4Var.e()).n(an4Var.f()).f(0).k();
                        }
                        byte[] c = o2cVar.c().c(f, yacVar.d());
                        if (yacVar instanceof aj5) {
                            aj5 aj5Var2 = (aj5) yacVar;
                            yacVar = (aj5) new aj5.b().g(aj5Var2.b()).h(aj5Var2.c()).n(aj5Var2.e()).o(aj5Var2.f()).p(aj5Var2.g()).f(1).l();
                        } else if (yacVar instanceof an4) {
                            an4 an4Var2 = (an4) yacVar;
                            yacVar = (an4) new an4.b().g(an4Var2.b()).h(an4Var2.c()).m(an4Var2.e()).n(an4Var2.f()).f(1).k();
                        }
                        byte[] c2 = o2cVar.c().c(f, yacVar.d());
                        if (yacVar instanceof aj5) {
                            aj5 aj5Var3 = (aj5) yacVar;
                            yacVar = (aj5) new aj5.b().g(aj5Var3.b()).h(aj5Var3.c()).n(aj5Var3.e()).o(aj5Var3.f()).p(aj5Var3.g()).f(2).l();
                        } else if (yacVar instanceof an4) {
                            an4 an4Var3 = (an4) yacVar;
                            yacVar = (an4) new an4.b().g(an4Var3.b()).h(an4Var3.c()).m(an4Var3.e()).n(an4Var3.f()).f(2).k();
                        }
                        byte[] c3 = o2cVar.c().c(f, yacVar.d());
                        int c4 = o2cVar.d().c();
                        byte[] bArr = new byte[c4 * 2];
                        for (int i = 0; i < c4; i++) {
                            bArr[i] = (byte) (kbcVar.b()[i] ^ c2[i]);
                        }
                        for (int i2 = 0; i2 < c4; i2++) {
                            bArr[i2 + c4] = (byte) (kbcVar2.b()[i2] ^ c3[i2]);
                        }
                        return new kbc(kbcVar.a(), o2cVar.c().b(c, bArr));
                    }
                    throw new NullPointerException("address == null");
                }
                throw new IllegalStateException("height of both nodes must be equal");
            }
            throw new NullPointerException("right == null");
        }
        throw new NullPointerException("left == null");
    }
}
