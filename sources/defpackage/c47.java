package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: c47  reason: default package */
/* loaded from: classes3.dex */
public class c47 implements rx {
    private byte[] a;
    private e23 b;
    private rx c;
    private SecureRandom d;
    private boolean e;

    public c47(rx rxVar, e23 e23Var, e23 e23Var2, byte[] bArr) {
        this.c = rxVar;
        this.b = e23Var2;
        this.a = new byte[e23Var.getDigestSize()];
        e23Var.reset();
        if (bArr != null) {
            e23Var.update(bArr, 0, bArr.length);
        }
        e23Var.doFinal(this.a, 0);
    }

    private void d(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private byte[] g(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int digestSize = this.b.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.b.reset();
        int i4 = 0;
        while (i4 < i3 / digestSize) {
            d(i4, bArr4);
            this.b.update(bArr, i, i2);
            this.b.update(bArr4, 0, 4);
            this.b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i4 * digestSize, digestSize);
            i4++;
        }
        int i5 = digestSize * i4;
        if (i5 < i3) {
            d(i4, bArr4);
            this.b.update(bArr, i, i2);
            this.b.update(bArr4, 0, 4);
            this.b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    @Override // defpackage.rx
    public int a() {
        int a = this.c.a();
        if (this.e) {
            return a;
        }
        return (a - 1) - (this.a.length * 2);
    }

    @Override // defpackage.rx
    public int b() {
        int b = this.c.b();
        if (this.e) {
            return (b - 1) - (this.a.length * 2);
        }
        return b;
    }

    @Override // defpackage.rx
    public byte[] c(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.e) {
            return f(bArr, i, i2);
        }
        return e(bArr, i, i2);
    }

    public byte[] e(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        boolean z;
        byte[] bArr2;
        byte[] bArr3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        byte[] c = this.c.c(bArr, i, i2);
        int a = this.c.a();
        byte[] bArr4 = new byte[a];
        if (a < (this.a.length * 2) + 1) {
            z = true;
        } else {
            z = false;
        }
        if (c.length <= a) {
            System.arraycopy(c, 0, bArr4, a - c.length, c.length);
        } else {
            System.arraycopy(c, 0, bArr4, 0, a);
            z = true;
        }
        byte[] bArr5 = this.a;
        byte[] g = g(bArr4, bArr5.length, a - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.a;
            if (i3 == bArr2.length) {
                break;
            }
            bArr4[i3] = (byte) (bArr4[i3] ^ g[i3]);
            i3++;
        }
        byte[] g2 = g(bArr4, 0, bArr2.length, a - bArr2.length);
        for (int length = this.a.length; length != a; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ g2[length - this.a.length]);
        }
        int i4 = 0;
        boolean z6 = false;
        while (true) {
            bArr3 = this.a;
            if (i4 == bArr3.length) {
                break;
            }
            if (bArr3[i4] != bArr4[bArr3.length + i4]) {
                z6 = true;
            }
            i4++;
        }
        int i5 = a;
        for (int length2 = bArr3.length * 2; length2 != a; length2++) {
            if (bArr4[length2] != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i5 == a) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z4 & z5) {
                i5 = length2;
            }
        }
        if (i5 > a - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArr4[i5] != 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i6 = i5 + 1;
        if (!(z2 | z3 | z | z6)) {
            int i7 = a - i6;
            byte[] bArr6 = new byte[i7];
            System.arraycopy(bArr4, i6, bArr6, 0, i7);
            tr.y(bArr4, (byte) 0);
            return bArr6;
        }
        tr.y(bArr4, (byte) 0);
        throw new InvalidCipherTextException("data wrong");
    }

    public byte[] f(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (i2 <= b()) {
            int b = b() + 1 + (this.a.length * 2);
            byte[] bArr2 = new byte[b];
            int i3 = b - i2;
            System.arraycopy(bArr, i, bArr2, i3, i2);
            bArr2[i3 - 1] = 1;
            byte[] bArr3 = this.a;
            System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
            int length = this.a.length;
            byte[] bArr4 = new byte[length];
            this.d.nextBytes(bArr4);
            byte[] g = g(bArr4, 0, length, b - this.a.length);
            for (int length2 = this.a.length; length2 != b; length2++) {
                bArr2[length2] = (byte) (bArr2[length2] ^ g[length2 - this.a.length]);
            }
            System.arraycopy(bArr4, 0, bArr2, 0, this.a.length);
            byte[] bArr5 = this.a;
            byte[] g2 = g(bArr2, bArr5.length, b - bArr5.length, bArr5.length);
            for (int i4 = 0; i4 != this.a.length; i4++) {
                bArr2[i4] = (byte) (bArr2[i4] ^ g2[i4]);
            }
            return this.c.c(bArr2, 0, b);
        }
        throw new DataLengthException("input data too long");
    }

    @Override // defpackage.rx
    public void init(boolean z, v71 v71Var) {
        SecureRandom b;
        if (v71Var instanceof qq7) {
            b = ((qq7) v71Var).b();
        } else {
            b = b32.b();
        }
        this.d = b;
        this.c.init(z, v71Var);
        this.e = z;
    }

    public c47(rx rxVar, e23 e23Var, byte[] bArr) {
        this(rxVar, e23Var, e23Var, bArr);
    }
}
