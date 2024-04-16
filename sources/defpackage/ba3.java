package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ba3  reason: default package */
/* loaded from: classes3.dex */
public class ba3 implements m {
    private kq9 a;
    private boolean b;
    private int c;
    private x36 d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private int h;
    private byte[] i;
    private int j;
    private boolean k;
    private byte[] l;

    public ba3(xc0 xc0Var) {
        this.c = xc0Var.a();
        cl0 cl0Var = new cl0(xc0Var);
        this.d = cl0Var;
        this.g = new byte[this.c];
        this.f = new byte[cl0Var.getMacSize()];
        this.e = new byte[this.d.getMacSize()];
        this.a = new kq9(xc0Var);
    }

    private void c() {
        byte[] bArr = new byte[this.c];
        int i = 0;
        this.d.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.g;
            if (i < bArr2.length) {
                bArr2[i] = (byte) ((this.e[i] ^ this.f[i]) ^ bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    private void d() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.d.doFinal(this.f, 0);
        int i = this.c;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 2;
        this.d.update(bArr, 0, i);
    }

    private int e(byte b, byte[] bArr, int i) {
        int b2;
        byte[] bArr2 = this.i;
        int i2 = this.j;
        int i3 = i2 + 1;
        this.j = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i4 = this.c;
        if (length >= i + i4) {
            if (this.b) {
                b2 = this.a.b(bArr2, 0, bArr, i);
                this.d.update(bArr, i, this.c);
            } else {
                this.d.update(bArr2, 0, i4);
                b2 = this.a.b(this.i, 0, bArr, i);
            }
            this.j = 0;
            if (!this.b) {
                byte[] bArr3 = this.i;
                System.arraycopy(bArr3, this.c, bArr3, 0, this.h);
                this.j = this.h;
            }
            return b2;
        }
        throw new OutputLengthException("Output buffer is too short");
    }

    private void g(boolean z) {
        this.a.reset();
        this.d.reset();
        this.j = 0;
        tr.y(this.i, (byte) 0);
        if (z) {
            tr.y(this.g, (byte) 0);
        }
        int i = this.c;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        this.d.update(bArr, 0, i);
        this.k = false;
        byte[] bArr2 = this.l;
        if (bArr2 != null) {
            b(bArr2, 0, bArr2.length);
        }
    }

    private boolean h(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.h; i3++) {
            i2 |= this.g[i3] ^ bArr[i + i3];
        }
        if (i2 != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.n
    public byte[] a() {
        int i = this.h;
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        if (!this.k) {
            this.d.update(bArr, i, i2);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        d();
        int i2 = this.j;
        byte[] bArr2 = this.i;
        byte[] bArr3 = new byte[bArr2.length];
        this.j = 0;
        if (this.b) {
            int i3 = i + i2;
            if (bArr.length >= this.h + i3) {
                this.a.b(bArr2, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2);
                this.d.update(bArr3, 0, i2);
                c();
                System.arraycopy(this.g, 0, bArr, i3, this.h);
                g(false);
                return i2 + this.h;
            }
            throw new OutputLengthException("Output buffer too short");
        }
        int i4 = this.h;
        if (i2 >= i4) {
            if (bArr.length >= (i + i2) - i4) {
                if (i2 > i4) {
                    this.d.update(bArr2, 0, i2 - i4);
                    this.a.b(this.i, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i, i2 - this.h);
                }
                c();
                if (h(this.i, i2 - this.h)) {
                    g(false);
                    return i2 - this.h;
                }
                throw new InvalidCipherTextException("mac check in EAX failed");
            }
            throw new OutputLengthException("Output buffer too short");
        }
        throw new InvalidCipherTextException("data too short");
    }

    public void f() {
        g(true);
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.a.d().getAlgorithmName() + "/EAX";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        int i2 = i + this.j;
        if (this.b) {
            return i2 + this.h;
        }
        int i3 = this.h;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.a.d();
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.j;
        if (!this.b) {
            int i3 = this.h;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.c);
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        byte[] a;
        v71 b;
        int i;
        this.b = z;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            a = pVar.d();
            this.l = pVar.a();
            this.h = pVar.c() / 8;
            b = pVar.b();
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            a = pq7Var.a();
            this.l = null;
            this.h = this.d.getMacSize() / 2;
            b = pq7Var.b();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        if (z) {
            i = this.c;
        } else {
            i = this.c + this.h;
        }
        this.i = new byte[i];
        byte[] bArr = new byte[this.c];
        this.d.init(b);
        int i2 = this.c;
        bArr[i2 - 1] = 0;
        this.d.update(bArr, 0, i2);
        this.d.update(a, 0, a.length);
        this.d.doFinal(this.e, 0);
        this.a.init(true, new pq7(null, this.e));
        f();
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        d();
        return e(b, bArr, i);
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        d();
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 != i2; i5++) {
                i4 += e(bArr[i + i5], bArr2, i3 + i4);
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }
}
