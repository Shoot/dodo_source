package defpackage;

import java.math.BigInteger;
/* renamed from: sb3  reason: default package */
/* loaded from: classes3.dex */
public class sb3 {
    private final e23 a;
    private nb3 b;
    private BigInteger c;

    public sb3(e23 e23Var) {
        this.a = e23Var;
    }

    private byte[] b(jb3 jb3Var) {
        int i;
        BigInteger t = jb3Var.f().t();
        BigInteger t2 = jb3Var.g().t();
        if (t.toByteArray().length > 33) {
            i = 64;
        } else {
            i = 32;
        }
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        byte[] b = db0.b(i, t);
        byte[] b2 = db0.b(i, t2);
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i3] = b[(i - i3) - 1];
        }
        for (int i4 = 0; i4 != i; i4++) {
            bArr[i + i4] = b2[(i - i4) - 1];
        }
        this.a.update(bArr, 0, i2);
        byte[] bArr2 = new byte[this.a.getDigestSize()];
        this.a.doFinal(bArr2, 0);
        return bArr2;
    }

    private static BigInteger d(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return new BigInteger(1, bArr2);
    }

    public byte[] a(v71 v71Var) {
        qb3 qb3Var = (qb3) v71Var;
        la3 b = this.b.b();
        if (b.equals(qb3Var.b())) {
            BigInteger mod = b.c().multiply(this.c).multiply(this.b.c()).mod(b.e());
            jb3 a = ca3.a(b.a(), qb3Var.c());
            if (!a.u()) {
                jb3 A = a.y(mod).A();
                if (!A.u()) {
                    return b(A);
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECVKO public key has wrong domain parameters");
    }

    public void c(v71 v71Var) {
        sq7 sq7Var = (sq7) v71Var;
        this.b = (nb3) sq7Var.a();
        this.c = d(sq7Var.b());
    }
}
