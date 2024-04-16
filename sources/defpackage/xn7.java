package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: xn7  reason: default package */
/* loaded from: classes3.dex */
public class xn7 implements rx {
    private SecureRandom a;
    private rx b;
    private boolean c;
    private boolean d;
    private byte[] h;
    private int f = -1;
    private byte[] g = null;
    private boolean e = i();

    public xn7(rx rxVar) {
        this.b = rxVar;
    }

    private static int d(byte[] bArr, int i) {
        int i2 = bArr[0] ^ 2;
        int i3 = i + 1;
        int length = bArr.length - i3;
        for (int i4 = 1; i4 < length; i4++) {
            byte b = bArr[i4];
            int i5 = b | (b >> 1);
            int i6 = i5 | (i5 >> 2);
            i2 |= ((i6 | (i6 >> 4)) & 1) - 1;
        }
        int i7 = bArr[bArr.length - i3] | i2;
        int i8 = i7 | (i7 >> 1);
        int i9 = i8 | (i8 >> 2);
        return ~(((i9 | (i9 >> 4)) & 1) - 1);
    }

    private byte[] e(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        boolean z;
        boolean z2;
        if (this.f != -1) {
            return f(bArr, i, i2);
        }
        byte[] c = this.b.c(bArr, i, i2);
        boolean z3 = this.e;
        boolean z4 = true;
        if (c.length != this.b.a()) {
            z = true;
        } else {
            z = false;
        }
        boolean z5 = z3 & z;
        if (c.length < a()) {
            c = this.h;
        }
        byte b = c[0];
        if (!this.d ? b != 1 : b != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int h = h(b, c) + 1;
        if (h >= 10) {
            z4 = false;
        }
        if (!(z2 | z4)) {
            if (!z5) {
                int length = c.length - h;
                byte[] bArr2 = new byte[length];
                System.arraycopy(c, h, bArr2, 0, length);
                return bArr2;
            }
            tr.y(c, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        }
        tr.y(c, (byte) 0);
        throw new InvalidCipherTextException("block incorrect");
    }

    private byte[] f(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        boolean z;
        if (this.d) {
            byte[] c = this.b.c(bArr, i, i2);
            byte[] bArr2 = this.g;
            if (bArr2 == null) {
                bArr2 = new byte[this.f];
                this.a.nextBytes(bArr2);
            }
            boolean z2 = this.e;
            if (c.length != this.b.a()) {
                z = true;
            } else {
                z = false;
            }
            if (z2 & z) {
                c = this.h;
            }
            int d = d(c, this.f);
            byte[] bArr3 = new byte[this.f];
            int i3 = 0;
            while (true) {
                int i4 = this.f;
                if (i3 < i4) {
                    bArr3[i3] = (byte) ((c[(c.length - i4) + i3] & (~d)) | (bArr2[i3] & d));
                    i3++;
                } else {
                    tr.y(c, (byte) 0);
                    return bArr3;
                }
            }
        } else {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
    }

    private byte[] g(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (i2 <= b()) {
            int b = this.b.b();
            byte[] bArr2 = new byte[b];
            if (this.d) {
                bArr2[0] = 1;
                for (int i3 = 1; i3 != (b - i2) - 1; i3++) {
                    bArr2[i3] = -1;
                }
            } else {
                this.a.nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i4 = 1; i4 != (b - i2) - 1; i4++) {
                    while (bArr2[i4] == 0) {
                        bArr2[i4] = (byte) this.a.nextInt();
                    }
                }
            }
            int i5 = b - i2;
            bArr2[i5 - 1] = 0;
            System.arraycopy(bArr, i, bArr2, i5, i2);
            return this.b.c(bArr2, 0, b);
        }
        throw new IllegalArgumentException("input data too large");
    }

    private int h(byte b, byte[] bArr) throws InvalidCipherTextException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        int i = -1;
        for (int i2 = 1; i2 != bArr.length; i2++) {
            byte b2 = bArr[i2];
            if (b2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z & z2) {
                i = i2;
            }
            if (b == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z3 & z4;
            if (b2 != -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 |= z5 & z7;
        }
        if (z6) {
            return -1;
        }
        return i;
    }

    private boolean i() {
        if (pq8.d("org.bouncycastle.pkcs1.not_strict", true)) {
            return false;
        }
        return !pq8.d("org.bouncycastle.pkcs1.strict", false);
    }

    @Override // defpackage.rx
    public int a() {
        int a = this.b.a();
        if (this.c) {
            return a;
        }
        return a - 10;
    }

    @Override // defpackage.rx
    public int b() {
        int b = this.b.b();
        if (this.c) {
            return b - 10;
        }
        return b;
    }

    @Override // defpackage.rx
    public byte[] c(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.c) {
            return g(bArr, i, i2);
        }
        return e(bArr, i, i2);
    }

    @Override // defpackage.rx
    public void init(boolean z, v71 v71Var) {
        ux uxVar;
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            this.a = qq7Var.b();
            uxVar = (ux) qq7Var.a();
        } else {
            uxVar = (ux) v71Var;
            if (!uxVar.a() && z) {
                this.a = b32.b();
            }
        }
        this.b.init(z, v71Var);
        this.d = uxVar.a();
        this.c = z;
        this.h = new byte[this.b.a()];
        if (this.f > 0 && this.g == null && this.a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }
}
