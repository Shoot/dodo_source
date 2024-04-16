package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: r29  reason: default package */
/* loaded from: classes3.dex */
public class r29 implements l8c {
    private static final byte[] i = {74, -35, -94, 44, 121, -24, 33, 5};
    private tk0 a;
    private v71 b;
    private pq7 c;
    private byte[] d;
    private boolean e;
    private SecureRandom f;
    e23 g = f23.b();
    byte[] h = new byte[20];

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.g.update(bArr, 0, bArr.length);
        this.g.doFinal(this.h, 0);
        System.arraycopy(this.h, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean d(byte[] bArr, byte[] bArr2) {
        return tr.u(c(bArr), bArr2);
    }

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i2, int i3) {
        int i4;
        if (this.e) {
            int i5 = i3 + 1;
            int i6 = i5 % 8;
            if (i6 != 0) {
                i4 = (8 - i6) + i5;
            } else {
                i4 = i5;
            }
            byte[] bArr2 = new byte[i4];
            bArr2[0] = (byte) i3;
            System.arraycopy(bArr, i2, bArr2, 1, i3);
            int i7 = (i4 - i3) - 1;
            byte[] bArr3 = new byte[i7];
            if (i7 > 0) {
                this.f.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i5, i7);
            }
            byte[] c = c(bArr2);
            int length = c.length + i4;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, i4);
            System.arraycopy(c, 0, bArr4, i4, c.length);
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr4, 0, bArr5, 0, length);
            int a = length / this.a.a();
            if (length % this.a.a() == 0) {
                this.a.init(true, this.c);
                for (int i8 = 0; i8 < a; i8++) {
                    int a2 = this.a.a() * i8;
                    this.a.b(bArr5, a2, bArr5, a2);
                }
                byte[] bArr6 = this.d;
                int length2 = bArr6.length + length;
                byte[] bArr7 = new byte[length2];
                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                System.arraycopy(bArr5, 0, bArr7, this.d.length, length);
                byte[] bArr8 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = i9 + 1;
                    bArr8[i9] = bArr7[length2 - i10];
                    i9 = i10;
                }
                this.a.init(true, new pq7(this.b, i));
                for (int i11 = 0; i11 < a + 1; i11++) {
                    int a3 = this.a.a() * i11;
                    this.a.b(bArr8, a3, bArr8, a3);
                }
                return bArr8;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (!this.e) {
            if (bArr != null) {
                if (i3 % this.a.a() == 0) {
                    this.a.init(false, new pq7(this.b, i));
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i2, bArr2, 0, i3);
                    for (int i4 = 0; i4 < i3 / this.a.a(); i4++) {
                        int a = this.a.a() * i4;
                        this.a.b(bArr2, a, bArr2, a);
                    }
                    byte[] bArr3 = new byte[i3];
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = i5 + 1;
                        bArr3[i5] = bArr2[i3 - i6];
                        i5 = i6;
                    }
                    byte[] bArr4 = new byte[8];
                    this.d = bArr4;
                    int i7 = i3 - 8;
                    byte[] bArr5 = new byte[i7];
                    System.arraycopy(bArr3, 0, bArr4, 0, 8);
                    System.arraycopy(bArr3, 8, bArr5, 0, i7);
                    pq7 pq7Var = new pq7(this.b, this.d);
                    this.c = pq7Var;
                    this.a.init(false, pq7Var);
                    byte[] bArr6 = new byte[i7];
                    System.arraycopy(bArr5, 0, bArr6, 0, i7);
                    for (int i8 = 0; i8 < i7 / this.a.a(); i8++) {
                        int a2 = this.a.a() * i8;
                        this.a.b(bArr6, a2, bArr6, a2);
                    }
                    int i9 = i3 - 16;
                    byte[] bArr7 = new byte[i9];
                    byte[] bArr8 = new byte[8];
                    System.arraycopy(bArr6, 0, bArr7, 0, i9);
                    System.arraycopy(bArr6, i9, bArr8, 0, 8);
                    if (d(bArr7, bArr8)) {
                        int i10 = bArr7[0];
                        if (i9 - ((i10 & 255) + 1) <= 7) {
                            byte[] bArr9 = new byte[i10];
                            System.arraycopy(bArr7, 1, bArr9, 0, i10);
                            return bArr9;
                        }
                        throw new InvalidCipherTextException("too many pad bytes (" + (i9 - ((bArr7[0] & 255) + 1)) + ")");
                    }
                    throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
                }
                throw new InvalidCipherTextException("Ciphertext not multiple of " + this.a.a());
            }
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        throw new IllegalStateException("Not set for unwrapping");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        this.e = z;
        this.a = new tk0(new p29());
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            this.f = qq7Var.b();
            v71Var = qq7Var.a();
        } else {
            this.f = b32.b();
        }
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.c = pq7Var;
            this.d = pq7Var.a();
            this.b = this.c.b();
            if (this.e) {
                byte[] bArr = this.d;
                if (bArr == null || bArr.length != 8) {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
                return;
            }
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        this.b = v71Var;
        if (this.e) {
            byte[] bArr2 = new byte[8];
            this.d = bArr2;
            this.f.nextBytes(bArr2);
            this.c = new pq7(this.b, this.d);
        }
    }
}
