package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: r62  reason: default package */
/* loaded from: classes3.dex */
public class r62 implements l8c {
    private static final byte[] h = {74, -35, -94, 44, 121, -24, 33, 5};
    private tk0 a;
    private lf5 b;
    private pq7 c;
    private byte[] d;
    private boolean e;
    e23 f = f23.b();
    byte[] g = new byte[20];

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f.update(bArr, 0, bArr.length);
        this.f.doFinal(this.g, 0);
        System.arraycopy(this.g, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean d(byte[] bArr, byte[] bArr2) {
        return tr.u(c(bArr), bArr2);
    }

    private static byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            bArr2[i] = bArr[bArr.length - i2];
            i = i2;
        }
        return bArr2;
    }

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i, int i2) {
        if (this.e) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            byte[] c = c(bArr2);
            int length = c.length + i2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(c, 0, bArr3, i2, c.length);
            int a = this.a.a();
            if (length % a == 0) {
                this.a.init(true, this.c);
                byte[] bArr4 = new byte[length];
                for (int i3 = 0; i3 != length; i3 += a) {
                    this.a.b(bArr3, i3, bArr4, i3);
                }
                byte[] bArr5 = this.d;
                byte[] bArr6 = new byte[bArr5.length + length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                System.arraycopy(bArr4, 0, bArr6, this.d.length, length);
                byte[] e = e(bArr6);
                this.a.init(true, new pq7(this.b, h));
                for (int i4 = 0; i4 != e.length; i4 += a) {
                    this.a.b(e, i4, e, i4);
                }
                return e;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.e) {
            if (bArr != null) {
                int a = this.a.a();
                if (i2 % a == 0) {
                    this.a.init(false, new pq7(this.b, h));
                    byte[] bArr2 = new byte[i2];
                    for (int i3 = 0; i3 != i2; i3 += a) {
                        this.a.b(bArr, i + i3, bArr2, i3);
                    }
                    byte[] e = e(bArr2);
                    byte[] bArr3 = new byte[8];
                    this.d = bArr3;
                    int length = e.length;
                    int i4 = length - 8;
                    byte[] bArr4 = new byte[i4];
                    System.arraycopy(e, 0, bArr3, 0, 8);
                    System.arraycopy(e, 8, bArr4, 0, e.length - 8);
                    pq7 pq7Var = new pq7(this.b, this.d);
                    this.c = pq7Var;
                    this.a.init(false, pq7Var);
                    byte[] bArr5 = new byte[i4];
                    for (int i5 = 0; i5 != i4; i5 += a) {
                        this.a.b(bArr4, i5, bArr5, i5);
                    }
                    int i6 = length - 16;
                    byte[] bArr6 = new byte[i6];
                    byte[] bArr7 = new byte[8];
                    System.arraycopy(bArr5, 0, bArr6, 0, i6);
                    System.arraycopy(bArr5, i6, bArr7, 0, 8);
                    if (d(bArr6, bArr7)) {
                        return bArr6;
                    }
                    throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
                }
                throw new InvalidCipherTextException("Ciphertext not multiple of " + a);
            }
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        throw new IllegalStateException("Not set for unwrapping");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        SecureRandom b;
        this.e = z;
        this.a = new tk0(new o62());
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            v71 a = qq7Var.a();
            SecureRandom b2 = qq7Var.b();
            v71Var = a;
            b = b2;
        } else {
            b = b32.b();
        }
        if (v71Var instanceof lf5) {
            this.b = (lf5) v71Var;
            if (this.e) {
                byte[] bArr = new byte[8];
                this.d = bArr;
                b.nextBytes(bArr);
                this.c = new pq7(this.b, this.d);
            }
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.c = pq7Var;
            this.d = pq7Var.a();
            this.b = (lf5) this.c.b();
            if (this.e) {
                byte[] bArr2 = this.d;
                if (bArr2 == null || bArr2.length != 8) {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
                return;
            }
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
    }
}
