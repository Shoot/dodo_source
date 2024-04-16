package defpackage;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
/* renamed from: eac  reason: default package */
/* loaded from: classes3.dex */
public class eac implements oka {
    private e23 g;
    private rx h;
    private n39 i;
    private int j;
    private int k;
    private byte[] l;

    public eac(rx rxVar, e23 e23Var) {
        this(rxVar, e23Var, false);
    }

    private void c(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private void d(int i) {
        int i2;
        byte[] bArr;
        int digestSize = this.g.getDigestSize();
        if (i == 188) {
            byte[] bArr2 = this.l;
            i2 = (bArr2.length - digestSize) - 1;
            this.g.doFinal(bArr2, i2);
            this.l[bArr.length - 1] = -68;
        } else {
            byte[] bArr3 = this.l;
            int length = (bArr3.length - digestSize) - 2;
            this.g.doFinal(bArr3, length);
            byte[] bArr4 = this.l;
            bArr4[bArr4.length - 2] = (byte) (i >>> 8);
            bArr4[bArr4.length - 1] = (byte) i;
            i2 = length;
        }
        this.l[0] = 107;
        for (int i3 = i2 - 2; i3 != 0; i3--) {
            this.l[i3] = -69;
        }
        this.l[i2 - 1] = -70;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if ((r4.intValue() & 15) == 12) goto L10;
     */
    @Override // defpackage.oka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            rx r1 = r3.h     // Catch: java.lang.Exception -> L5e
            int r2 = r4.length     // Catch: java.lang.Exception -> L5e
            byte[] r4 = r1.c(r4, r0, r2)     // Catch: java.lang.Exception -> L5e
            r3.l = r4     // Catch: java.lang.Exception -> L5e
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.l
            r4.<init>(r1, r2)
            int r1 = r4.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L1d
            goto L2f
        L1d:
            n39 r1 = r3.i
            java.math.BigInteger r1 = r1.c()
            java.math.BigInteger r4 = r1.subtract(r4)
            int r1 = r4.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L5e
        L2f:
            int r0 = r3.j
            r3.d(r0)
            byte[] r0 = r3.l
            int r0 = r0.length
            byte[] r4 = defpackage.db0.b(r0, r4)
            byte[] r0 = r3.l
            boolean r0 = defpackage.tr.u(r0, r4)
            int r1 = r3.j
            r2 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r2) goto L56
            if (r0 != 0) goto L56
            byte[] r0 = r3.l
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 64
            r0[r1] = r2
            boolean r0 = defpackage.tr.u(r0, r4)
        L56:
            byte[] r1 = r3.l
            r3.c(r1)
            r3.c(r4)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eac.a(byte[]):boolean");
    }

    @Override // defpackage.oka
    public byte[] b() throws CryptoException {
        d(this.j);
        rx rxVar = this.h;
        byte[] bArr = this.l;
        BigInteger bigInteger = new BigInteger(1, rxVar.c(bArr, 0, bArr.length));
        c(this.l);
        return db0.b(db0.i(this.i.c()), bigInteger.min(this.i.c().subtract(bigInteger)));
    }

    public void e() {
        this.g.reset();
    }

    @Override // defpackage.oka
    public void init(boolean z, v71 v71Var) {
        n39 n39Var = (n39) v71Var;
        this.i = n39Var;
        this.h.init(z, n39Var);
        int bitLength = this.i.c().bitLength();
        this.k = bitLength;
        this.l = new byte[(bitLength + 7) / 8];
        e();
    }

    @Override // defpackage.oka
    public void update(byte b) {
        this.g.update(b);
    }

    public eac(rx rxVar, e23 e23Var, boolean z) {
        int intValue;
        this.h = rxVar;
        this.g = e23Var;
        if (z) {
            intValue = 188;
        } else {
            Integer a = at4.a(e23Var);
            if (a == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + e23Var.getAlgorithmName());
            }
            intValue = a.intValue();
        }
        this.j = intValue;
    }

    @Override // defpackage.oka
    public void update(byte[] bArr, int i, int i2) {
        this.g.update(bArr, i, i2);
    }
}
