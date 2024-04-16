package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ch0  reason: default package */
/* loaded from: classes3.dex */
public class ch0 {
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected xc0 d;
    protected boolean e;
    protected boolean f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ch0() {
    }

    public ch0(xc0 xc0Var) {
        this.d = xc0Var;
        this.a = new byte[xc0Var.a()];
        boolean z = false;
        this.b = 0;
        String algorithmName = xc0Var.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.f = z2;
        if (z2 || (xc0Var instanceof rya)) {
            this.e = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.e = z;
    }

    public int a(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        try {
            int i2 = this.b;
            if (i + i2 <= bArr.length) {
                int i3 = 0;
                if (i2 != 0) {
                    if (this.e) {
                        xc0 xc0Var = this.d;
                        byte[] bArr2 = this.a;
                        xc0Var.b(bArr2, 0, bArr2, 0);
                        int i4 = this.b;
                        this.b = 0;
                        System.arraycopy(this.a, 0, bArr, i, i4);
                        i3 = i4;
                    } else {
                        throw new DataLengthException("data not block size aligned");
                    }
                }
                i();
                return i3;
            }
            throw new OutputLengthException("output buffer too short for doFinal()");
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    public int b() {
        return this.d.a();
    }

    public int c(int i) {
        return i + this.b;
    }

    public xc0 d() {
        return this.d;
    }

    public int e(int i) {
        int length;
        int i2;
        int i3 = i + this.b;
        if (this.f) {
            if (this.c) {
                i2 = (i3 % this.a.length) - (this.d.a() + 2);
                return i3 - i2;
            }
            length = this.a.length;
        } else {
            length = this.a.length;
        }
        i2 = i3 % length;
        return i3 - i2;
    }

    public void f(boolean z, v71 v71Var) throws IllegalArgumentException {
        this.c = z;
        i();
        this.d.init(z, v71Var);
    }

    public int g(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int b2 = this.d.b(bArr2, 0, bArr, i);
        this.b = 0;
        return b2;
    }

    public int h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        int i4;
        if (i2 >= 0) {
            int b = b();
            int e = e(i2);
            if (e > 0 && e + i3 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            byte[] bArr3 = this.a;
            int length = bArr3.length;
            int i5 = this.b;
            int i6 = length - i5;
            if (i2 > i6) {
                System.arraycopy(bArr, i, bArr3, i5, i6);
                i4 = this.d.b(this.a, 0, bArr2, i3);
                this.b = 0;
                i2 -= i6;
                i += i6;
                while (i2 > this.a.length) {
                    i4 += this.d.b(bArr, i, bArr2, i3 + i4);
                    i2 -= b;
                    i += b;
                }
            } else {
                i4 = 0;
            }
            System.arraycopy(bArr, i, this.a, this.b, i2);
            int i7 = this.b + i2;
            this.b = i7;
            byte[] bArr4 = this.a;
            if (i7 == bArr4.length) {
                int b2 = i4 + this.d.b(bArr4, 0, bArr2, i3 + i4);
                this.b = 0;
                return b2;
            }
            return i4;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public void i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.b = 0;
                this.d.reset();
                return;
            }
        }
    }
}
