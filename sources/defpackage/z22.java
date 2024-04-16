package defpackage;
/* renamed from: z22  reason: default package */
/* loaded from: classes3.dex */
public class z22 extends ya4 {
    private static boolean c(byte b, int i) {
        if ((b & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

    private static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int l = mo7.l(bArr, i4 * 4);
                if (c(bArr2[i], i4)) {
                    i2 += l;
                } else {
                    i3 += l;
                }
            }
            byte[] bArr4 = new byte[8];
            mo7.i(i2, bArr4, 0);
            mo7.i(i3, bArr4, 4);
            y94 y94Var = new y94(new ua4());
            y94Var.init(true, new pq7(new rq7(new lf5(bArr), bArr3), bArr4));
            y94Var.b(bArr, 0, bArr, 0);
            y94Var.b(bArr, 8, bArr, 8);
            y94Var.b(bArr, 16, bArr, 16);
            y94Var.b(bArr, 24, bArr, 24);
        }
        return bArr;
    }

    @Override // defpackage.ya4, defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        lf5 lf5Var;
        byte[] bArr;
        sq7 sq7Var;
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        sq7 sq7Var2 = (sq7) v71Var;
        if (sq7Var2.a() instanceof rq7) {
            lf5Var = (lf5) ((rq7) sq7Var2.a()).a();
            bArr = ((rq7) sq7Var2.a()).b();
        } else {
            lf5Var = (lf5) sq7Var2.a();
            bArr = null;
        }
        lf5 lf5Var2 = new lf5(d(lf5Var.a(), sq7Var2.b(), bArr));
        if (bArr != null) {
            sq7Var = new sq7(new rq7(lf5Var2, bArr), sq7Var2.b());
        } else {
            sq7Var = new sq7(lf5Var2, sq7Var2.b());
        }
        super.init(z, sq7Var);
    }
}
