package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: dp7  reason: default package */
/* loaded from: classes3.dex */
public class dp7 extends ch0 {
    yc0 g;

    public dp7(xc0 xc0Var) {
        this(xc0Var, new ao7());
    }

    @Override // defpackage.ch0
    public int a(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        int a;
        int i2;
        int a2 = this.d.a();
        if (this.c) {
            if (this.b == a2) {
                if ((a2 * 2) + i <= bArr.length) {
                    i2 = this.d.b(this.a, 0, bArr, i);
                    this.b = 0;
                } else {
                    i();
                    throw new OutputLengthException("output buffer too short");
                }
            } else {
                i2 = 0;
            }
            this.g.c(this.a, this.b);
            a = i2 + this.d.b(this.a, 0, bArr, i + i2);
        } else if (this.b == a2) {
            xc0 xc0Var = this.d;
            byte[] bArr2 = this.a;
            int b = xc0Var.b(bArr2, 0, bArr2, 0);
            this.b = 0;
            try {
                a = b - this.g.a(this.a);
                System.arraycopy(this.a, 0, bArr, i, a);
            } finally {
                i();
            }
        } else {
            i();
            throw new DataLengthException("last block incomplete in decryption");
        }
        return a;
    }

    @Override // defpackage.ch0
    public int c(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        if (length == 0) {
            if (!this.c) {
                return i2;
            }
        } else {
            i2 -= length;
        }
        return i2 + bArr.length;
    }

    @Override // defpackage.ch0
    public int e(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        if (length == 0) {
            return Math.max(0, i2 - bArr.length);
        }
        return i2 - length;
    }

    @Override // defpackage.ch0
    public void f(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        this.c = z;
        i();
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            this.g.b(qq7Var.b());
            xc0Var = this.d;
            v71Var = qq7Var.a();
        } else {
            this.g.b(null);
            xc0Var = this.d;
        }
        xc0Var.init(z, v71Var);
    }

    @Override // defpackage.ch0
    public int g(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = this.b;
        byte[] bArr2 = this.a;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int b2 = this.d.b(bArr2, 0, bArr, i);
            this.b = 0;
            i3 = b2;
        }
        byte[] bArr3 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        bArr3[i4] = b;
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
                this.b = 0;
                i2 -= i5;
                i += i5;
                i6 = b2;
                while (i2 > this.a.length) {
                    i6 += this.d.b(bArr, i, bArr2, i3 + i6);
                    i2 -= b;
                    i += b;
                }
            }
            System.arraycopy(bArr, i, this.a, this.b, i2);
            this.b += i2;
            return i6;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public dp7(xc0 xc0Var, yc0 yc0Var) {
        this.d = xc0Var;
        this.g = yc0Var;
        this.a = new byte[xc0Var.a()];
        this.b = 0;
    }
}
