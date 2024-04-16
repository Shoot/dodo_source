package defpackage;

import java.math.BigInteger;
/* renamed from: is9  reason: default package */
/* loaded from: classes3.dex */
class is9 {
    private final byte[] a;
    private int b = 0;

    public is9(byte[] bArr) {
        this.a = bArr;
    }

    public boolean a() {
        if (this.b < this.a.length) {
            return true;
        }
        return false;
    }

    public BigInteger b() {
        int g = g();
        int i = this.b;
        int i2 = i + g;
        byte[] bArr = this.a;
        if (i2 <= bArr.length) {
            int i3 = g + i;
            this.b = i3;
            return new BigInteger(1, tr.w(bArr, i, i3));
        }
        throw new IllegalArgumentException("not enough data for big num");
    }

    public byte[] c() {
        int g = g();
        if (g == 0) {
            return new byte[0];
        }
        int i = this.b;
        byte[] bArr = this.a;
        if (i <= bArr.length - g) {
            int i2 = g + i;
            this.b = i2;
            return tr.w(bArr, i, i2);
        }
        throw new IllegalArgumentException("not enough data for block");
    }

    public byte[] d() {
        return e(8);
    }

    public byte[] e(int i) {
        int i2;
        int g = g();
        if (g == 0) {
            return new byte[0];
        }
        int i3 = this.b;
        byte[] bArr = this.a;
        if (i3 <= bArr.length - g) {
            if (g % i == 0) {
                int i4 = i3 + g;
                this.b = i4;
                if (g > 0 && (i2 = bArr[i4 - 1] & 255) > 0 && i2 < i) {
                    i4 -= i2;
                    int i5 = 1;
                    int i6 = i4;
                    while (i5 <= i2) {
                        if (i5 == (this.a[i6] & 255)) {
                            i5++;
                            i6++;
                        } else {
                            throw new IllegalArgumentException("incorrect padding");
                        }
                    }
                }
                return tr.w(this.a, i3, i4);
            }
            throw new IllegalArgumentException("missing padding");
        }
        throw new IllegalArgumentException("not enough data for block");
    }

    public String f() {
        return a0b.b(c());
    }

    public int g() {
        int i = this.b;
        byte[] bArr = this.a;
        if (i <= bArr.length - 4) {
            int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            this.b = i + 4;
            return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
        }
        throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
    }

    public void h() {
        int g = g();
        int i = this.b;
        if (i <= this.a.length - g) {
            this.b = i + g;
            return;
        }
        throw new IllegalArgumentException("not enough data for block");
    }

    public is9(byte[] bArr, byte[] bArr2) {
        this.a = bArr2;
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.b += bArr.length;
    }
}
