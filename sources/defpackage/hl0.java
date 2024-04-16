package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: hl0  reason: default package */
/* loaded from: classes3.dex */
public class hl0 extends ch0 {
    private int g;

    public hl0(xc0 xc0Var) {
        if (!(xc0Var instanceof qya)) {
            this.d = xc0Var;
            int a = xc0Var.a();
            this.g = a;
            this.a = new byte[a * 2];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }

    @Override // defpackage.ch0
    public int a(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        if (this.b + i <= bArr.length) {
            int a = this.d.a();
            int i2 = this.b;
            int i3 = i2 - a;
            byte[] bArr2 = new byte[a];
            if (this.c) {
                if (i2 >= a) {
                    this.d.b(this.a, 0, bArr2, 0);
                    int i4 = this.b;
                    if (i4 > a) {
                        while (true) {
                            byte[] bArr3 = this.a;
                            if (i4 == bArr3.length) {
                                break;
                            }
                            bArr3[i4] = bArr2[i4 - a];
                            i4++;
                        }
                        for (int i5 = a; i5 != this.b; i5++) {
                            byte[] bArr4 = this.a;
                            bArr4[i5] = (byte) (bArr4[i5] ^ bArr2[i5 - a]);
                        }
                        xc0 xc0Var = this.d;
                        if (xc0Var instanceof tk0) {
                            ((tk0) xc0Var).e().b(this.a, a, bArr, i);
                        } else {
                            xc0Var.b(this.a, a, bArr, i);
                        }
                        System.arraycopy(bArr2, 0, bArr, i + a, i3);
                    }
                    System.arraycopy(bArr2, 0, bArr, i, a);
                } else {
                    throw new DataLengthException("need at least one block of input for CTS");
                }
            } else if (i2 >= a) {
                byte[] bArr5 = new byte[a];
                if (i2 > a) {
                    xc0 xc0Var2 = this.d;
                    if (xc0Var2 instanceof tk0) {
                        ((tk0) xc0Var2).e().b(this.a, 0, bArr2, 0);
                    } else {
                        xc0Var2.b(this.a, 0, bArr2, 0);
                    }
                    for (int i6 = a; i6 != this.b; i6++) {
                        int i7 = i6 - a;
                        bArr5[i7] = (byte) (bArr2[i7] ^ this.a[i6]);
                    }
                    System.arraycopy(this.a, a, bArr2, 0, i3);
                    this.d.b(bArr2, 0, bArr, i);
                    System.arraycopy(bArr5, 0, bArr, i + a, i3);
                } else {
                    this.d.b(this.a, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, a);
                }
            } else {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            int i8 = this.b;
            i();
            return i8;
        }
        throw new OutputLengthException("output buffer to small in doFinal");
    }

    @Override // defpackage.ch0
    public int c(int i) {
        return i + this.b;
    }

    @Override // defpackage.ch0
    public int e(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        if (length == 0) {
            return i2 - bArr.length;
        }
        return i2 - length;
    }

    @Override // defpackage.ch0
    public int g(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = this.b;
        byte[] bArr2 = this.a;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int b2 = this.d.b(bArr2, 0, bArr, i);
            byte[] bArr3 = this.a;
            int i4 = this.g;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            this.b = this.g;
            i3 = b2;
        }
        byte[] bArr4 = this.a;
        int i5 = this.b;
        this.b = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }

    @Override // defpackage.ch0
    public int h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int b = b();
            int e = e(i2);
            if (e > 0 && e + i3 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            byte[] bArr3 = this.a;
            int length = bArr3.length;
            int i4 = this.b;
            int i5 = length - i4;
            int i6 = 0;
            if (i2 > i5) {
                System.arraycopy(bArr, i, bArr3, i4, i5);
                int b2 = this.d.b(this.a, 0, bArr2, i3);
                byte[] bArr4 = this.a;
                System.arraycopy(bArr4, b, bArr4, 0, b);
                this.b = b;
                i2 -= i5;
                i += i5;
                while (i2 > b) {
                    System.arraycopy(bArr, i, this.a, this.b, b);
                    b2 += this.d.b(this.a, 0, bArr2, i3 + b2);
                    byte[] bArr5 = this.a;
                    System.arraycopy(bArr5, b, bArr5, 0, b);
                    i2 -= b;
                    i += b;
                }
                i6 = b2;
            }
            System.arraycopy(bArr, i, this.a, this.b, i2);
            this.b += i2;
            return i6;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
