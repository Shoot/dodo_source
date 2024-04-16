package defpackage;

import java.math.BigInteger;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: ws4  reason: default package */
/* loaded from: classes3.dex */
public class ws4 implements rx {
    private static final BigInteger f = BigInteger.valueOf(16);
    private static final BigInteger g = BigInteger.valueOf(6);
    private static byte[] h = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] i = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};
    private rx a;
    private boolean b;
    private int c;
    private int d = 0;
    private BigInteger e;

    public ws4(rx rxVar) {
        this.a = rxVar;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        return byteArray;
    }

    private byte[] e(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte[] c = this.a.c(bArr, i2, i3);
        int i4 = (this.c + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, c);
        BigInteger bigInteger2 = f;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = g;
        if (!mod.equals(bigInteger3)) {
            if (this.e.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                bigInteger = this.e.subtract(bigInteger);
            } else {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
        }
        byte[] d = d(bigInteger);
        if ((d[d.length - 1] & 15) == 6) {
            d[d.length - 1] = (byte) (((d[d.length - 1] & 255) >>> 4) | (i[(d[d.length - 2] & 255) >> 4] << 4));
            byte[] bArr2 = h;
            byte b = d[1];
            byte b2 = bArr2[b & 15];
            d[0] = (byte) (b2 | (bArr2[(b & 255) >>> 4] << 4));
            int i5 = 0;
            boolean z = false;
            int i6 = 1;
            for (int length = d.length - 1; length >= d.length - (i4 * 2); length -= 2) {
                byte[] bArr3 = h;
                byte b3 = d[length];
                int i7 = bArr3[b3 & 15] | (bArr3[(b3 & 255) >>> 4] << 4);
                int i8 = length - 1;
                byte b4 = d[i8];
                if (((b4 ^ i7) & 255) != 0) {
                    if (!z) {
                        i6 = (b4 ^ i7) & 255;
                        i5 = i8;
                        z = true;
                    } else {
                        throw new InvalidCipherTextException("invalid tsums in block");
                    }
                }
            }
            d[i5] = 0;
            int length2 = (d.length - i5) / 2;
            byte[] bArr4 = new byte[length2];
            for (int i9 = 0; i9 < length2; i9++) {
                bArr4[i9] = d[(i9 * 2) + i5 + 1];
            }
            this.d = i6 - 1;
            return bArr4;
        }
        throw new InvalidCipherTextException("invalid forcing byte in block");
    }

    private byte[] f(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        int i4 = this.c;
        int i5 = (i4 + 7) / 8;
        byte[] bArr2 = new byte[i5];
        int i6 = 1;
        int i7 = this.d + 1;
        int i8 = (i4 + 13) / 16;
        int i9 = 0;
        while (i9 < i8) {
            if (i9 > i8 - i3) {
                int i10 = i8 - i9;
                System.arraycopy(bArr, (i2 + i3) - i10, bArr2, i5 - i8, i10);
            } else {
                System.arraycopy(bArr, i2, bArr2, i5 - (i9 + i3), i3);
            }
            i9 += i3;
        }
        for (int i11 = i5 - (i8 * 2); i11 != i5; i11 += 2) {
            byte b = bArr2[(i5 - i8) + (i11 / 2)];
            byte[] bArr3 = h;
            bArr2[i11] = (byte) (bArr3[b & 15] | (bArr3[(b & 255) >>> 4] << 4));
            bArr2[i11 + 1] = b;
        }
        int i12 = i5 - (i3 * 2);
        bArr2[i12] = (byte) (bArr2[i12] ^ i7);
        int i13 = i5 - 1;
        bArr2[i13] = (byte) ((bArr2[i13] << 4) | 6);
        int i14 = 8 - ((this.c - 1) % 8);
        if (i14 != 8) {
            byte b2 = (byte) (bArr2[0] & (255 >>> i14));
            bArr2[0] = b2;
            bArr2[0] = (byte) ((128 >>> i14) | b2);
            i6 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.a.c(bArr2, i6, i5 - i6);
    }

    @Override // defpackage.rx
    public int a() {
        int a = this.a.a();
        if (this.b) {
            return a;
        }
        return (a + 1) / 2;
    }

    @Override // defpackage.rx
    public int b() {
        int b = this.a.b();
        if (this.b) {
            return (b + 1) / 2;
        }
        return b;
    }

    @Override // defpackage.rx
    public byte[] c(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (this.b) {
            return f(bArr, i2, i3);
        }
        return e(bArr, i2, i3);
    }

    @Override // defpackage.rx
    public void init(boolean z, v71 v71Var) {
        n39 n39Var;
        if (v71Var instanceof qq7) {
            n39Var = (n39) ((qq7) v71Var).a();
        } else {
            n39Var = (n39) v71Var;
        }
        this.a.init(z, v71Var);
        BigInteger c = n39Var.c();
        this.e = c;
        this.c = c.bitLength();
        this.b = z;
    }
}
