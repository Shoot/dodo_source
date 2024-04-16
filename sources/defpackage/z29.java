package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: z29  reason: default package */
/* loaded from: classes3.dex */
public class z29 implements l8c {
    private xc0 a;
    private boolean b;
    private lf5 c;
    private boolean d;
    private byte[] e;

    public z29(xc0 xc0Var) {
        this(xc0Var, false);
    }

    @Override // defpackage.l8c
    public byte[] a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                byte[] bArr2 = this.e;
                byte[] bArr3 = new byte[bArr2.length + i2];
                byte[] bArr4 = new byte[bArr2.length + 8];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i, bArr3, this.e.length, i2);
                this.a.init(this.b, this.c);
                for (int i4 = 0; i4 != 6; i4++) {
                    for (int i5 = 1; i5 <= i3; i5++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.e.length);
                        int i6 = i5 * 8;
                        System.arraycopy(bArr3, i6, bArr4, this.e.length, 8);
                        this.a.b(bArr4, 0, bArr4, 0);
                        int i7 = (i3 * i4) + i5;
                        int i8 = 1;
                        while (i7 != 0) {
                            int length = this.e.length - i8;
                            bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                            i7 >>>= 8;
                            i8++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i6, 8);
                    }
                }
                return bArr3;
            }
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for wrapping");
    }

    @Override // defpackage.l8c
    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.d) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                byte[] bArr2 = this.e;
                byte[] bArr3 = new byte[i2 - bArr2.length];
                byte[] bArr4 = new byte[bArr2.length];
                byte[] bArr5 = new byte[bArr2.length + 8];
                System.arraycopy(bArr, i, bArr4, 0, bArr2.length);
                byte[] bArr6 = this.e;
                System.arraycopy(bArr, i + bArr6.length, bArr3, 0, i2 - bArr6.length);
                this.a.init(!this.b, this.c);
                int i4 = i3 - 1;
                for (int i5 = 5; i5 >= 0; i5--) {
                    for (int i6 = i4; i6 >= 1; i6--) {
                        System.arraycopy(bArr4, 0, bArr5, 0, this.e.length);
                        int i7 = (i6 - 1) * 8;
                        System.arraycopy(bArr3, i7, bArr5, this.e.length, 8);
                        int i8 = (i4 * i5) + i6;
                        int i9 = 1;
                        while (i8 != 0) {
                            int length = this.e.length - i9;
                            bArr5[length] = (byte) (((byte) i8) ^ bArr5[length]);
                            i8 >>>= 8;
                            i9++;
                        }
                        this.a.b(bArr5, 0, bArr5, 0);
                        System.arraycopy(bArr5, 0, bArr4, 0, 8);
                        System.arraycopy(bArr5, 8, bArr3, i7, 8);
                    }
                }
                if (tr.u(bArr4, this.e)) {
                    return bArr3;
                }
                throw new InvalidCipherTextException("checksum failed");
            }
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    @Override // defpackage.l8c
    public String getAlgorithmName() {
        return this.a.getAlgorithmName();
    }

    @Override // defpackage.l8c
    public void init(boolean z, v71 v71Var) {
        this.d = z;
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        if (v71Var instanceof lf5) {
            this.c = (lf5) v71Var;
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.e = pq7Var.a();
            this.c = (lf5) pq7Var.b();
            if (this.e.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    public z29(xc0 xc0Var, boolean z) {
        this.e = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.a = xc0Var;
        this.b = !z;
    }
}
