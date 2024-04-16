package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: rj4  reason: default package */
/* loaded from: classes3.dex */
public class rj4 implements v72 {
    private static final BigInteger e = BigInteger.valueOf(0);
    private final qj4 a;
    private final byte[] b;
    private final byte[] c;
    private BigInteger d;

    public rj4(e23 e23Var) {
        qj4 qj4Var = new qj4(e23Var);
        this.a = qj4Var;
        this.c = new byte[qj4Var.getMacSize()];
        this.b = new byte[qj4Var.getMacSize()];
    }

    private BigInteger e(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bArr.length * 8 > this.d.bitLength()) {
            return bigInteger.shiftRight((bArr.length * 8) - this.d.bitLength());
        }
        return bigInteger;
    }

    @Override // defpackage.v72
    public void a(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // defpackage.v72
    public BigInteger b() {
        int i = db0.i(this.d);
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = 0;
            while (i2 < i) {
                qj4 qj4Var = this.a;
                byte[] bArr2 = this.c;
                qj4Var.update(bArr2, 0, bArr2.length);
                this.a.doFinal(this.c, 0);
                int min = Math.min(i - i2, this.c.length);
                System.arraycopy(this.c, 0, bArr, i2, min);
                i2 += min;
            }
            BigInteger e2 = e(bArr);
            if (e2.compareTo(e) > 0 && e2.compareTo(this.d) < 0) {
                return e2;
            }
            qj4 qj4Var2 = this.a;
            byte[] bArr3 = this.c;
            qj4Var2.update(bArr3, 0, bArr3.length);
            this.a.update((byte) 0);
            this.a.doFinal(this.b, 0);
            this.a.init(new lf5(this.b));
            qj4 qj4Var3 = this.a;
            byte[] bArr4 = this.c;
            qj4Var3.update(bArr4, 0, bArr4.length);
            this.a.doFinal(this.c, 0);
        }
    }

    @Override // defpackage.v72
    public boolean c() {
        return true;
    }

    @Override // defpackage.v72
    public void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.d = bigInteger;
        tr.y(this.c, (byte) 1);
        tr.y(this.b, (byte) 0);
        int i = db0.i(bigInteger);
        byte[] bArr2 = new byte[i];
        byte[] c = db0.c(bigInteger2);
        System.arraycopy(c, 0, bArr2, i - c.length, c.length);
        byte[] bArr3 = new byte[i];
        BigInteger e2 = e(bArr);
        if (e2.compareTo(bigInteger) >= 0) {
            e2 = e2.subtract(bigInteger);
        }
        byte[] c2 = db0.c(e2);
        System.arraycopy(c2, 0, bArr3, i - c2.length, c2.length);
        this.a.init(new lf5(this.b));
        qj4 qj4Var = this.a;
        byte[] bArr4 = this.c;
        qj4Var.update(bArr4, 0, bArr4.length);
        this.a.update((byte) 0);
        this.a.update(bArr2, 0, i);
        this.a.update(bArr3, 0, i);
        this.a.doFinal(this.b, 0);
        this.a.init(new lf5(this.b));
        qj4 qj4Var2 = this.a;
        byte[] bArr5 = this.c;
        qj4Var2.update(bArr5, 0, bArr5.length);
        this.a.doFinal(this.c, 0);
        qj4 qj4Var3 = this.a;
        byte[] bArr6 = this.c;
        qj4Var3.update(bArr6, 0, bArr6.length);
        this.a.update((byte) 1);
        this.a.update(bArr2, 0, i);
        this.a.update(bArr3, 0, i);
        this.a.doFinal(this.b, 0);
        this.a.init(new lf5(this.b));
        qj4 qj4Var4 = this.a;
        byte[] bArr7 = this.c;
        qj4Var4.update(bArr7, 0, bArr7.length);
        this.a.doFinal(this.c, 0);
    }
}
