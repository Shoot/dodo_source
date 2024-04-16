package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ud5  reason: default package */
/* loaded from: classes3.dex */
public class ud5 implements m {
    private xc0 a;
    private ch0 b;
    private boolean d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private vd5 h;
    private long[] i;
    private final int j;
    private a k = new a();
    private a l = new a();
    private int c = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ud5$a */
    /* loaded from: classes3.dex */
    public class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public ud5(xc0 xc0Var) {
        this.a = xc0Var;
        this.b = new ch0(new md5(xc0Var));
        int a2 = this.a.a();
        this.j = a2;
        this.e = new byte[a2];
        this.g = new byte[a2];
        this.h = d(a2);
        this.i = new long[a2 >>> 3];
        this.f = null;
    }

    private void c(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i2;
        while (i < i4) {
            h(this.i, bArr, i);
            this.h.b(this.i);
            i += this.j;
        }
        long[] jArr = this.i;
        jArr[0] = ((i3 & 4294967295L) << 3) ^ jArr[0];
        int i5 = this.j >>> 4;
        jArr[i5] = jArr[i5] ^ ((4294967295L & i2) << 3);
        byte[] z = mo7.z(jArr);
        this.f = z;
        this.a.b(z, 0, z, 0);
    }

    private static vd5 d(int i) {
        if (i != 16) {
            if (i != 32) {
                if (i == 64) {
                    return new c6b();
                }
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
            }
            return new f6b();
        }
        return new e6b();
    }

    private void e(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            h(this.i, bArr, i);
            this.h.b(this.i);
            i += this.j;
        }
    }

    private static void h(long[] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = jArr[i2] ^ mo7.p(bArr, i);
            i += 8;
        }
    }

    @Override // defpackage.n
    public byte[] a() {
        int i = this.c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        this.k.write(bArr, i, i2);
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int a2;
        int size = this.l.size();
        if (!this.d && size < this.c) {
            throw new InvalidCipherTextException("data too short");
        }
        byte[] bArr2 = new byte[this.j];
        this.a.b(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.j >>> 3];
        mo7.q(bArr2, 0, jArr);
        this.h.a(jArr);
        tr.y(bArr2, (byte) 0);
        tr.C(jArr, 0L);
        int size2 = this.k.size();
        if (size2 > 0) {
            e(this.k.a(), 0, size2);
        }
        if (this.d) {
            if ((bArr.length - i) - this.c >= size) {
                int h = this.b.h(this.l.a(), 0, size, bArr, i);
                a2 = h + this.b.a(bArr, i + h);
                c(bArr, i, size, size2);
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        } else {
            int i2 = size - this.c;
            if (bArr.length - i >= i2) {
                c(this.l.a(), 0, i2, size2);
                int h2 = this.b.h(this.l.a(), 0, i2, bArr, i);
                a2 = h2 + this.b.a(bArr, i + h2);
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        }
        byte[] bArr3 = this.f;
        if (bArr3 != null) {
            if (this.d) {
                System.arraycopy(bArr3, 0, bArr, i + a2, this.c);
                g();
                return a2 + this.c;
            }
            byte[] bArr4 = new byte[this.c];
            byte[] a3 = this.l.a();
            int i3 = this.c;
            System.arraycopy(a3, size - i3, bArr4, 0, i3);
            int i4 = this.c;
            byte[] bArr5 = new byte[i4];
            System.arraycopy(this.f, 0, bArr5, 0, i4);
            if (tr.u(bArr4, bArr5)) {
                g();
                return a2;
            }
            throw new InvalidCipherTextException("mac verification failed");
        }
        throw new IllegalStateException("mac is not calculated");
    }

    public void f(byte b) {
        this.k.write(b);
    }

    public void g() {
        tr.C(this.i, 0L);
        this.a.reset();
        this.l.reset();
        this.k.reset();
        byte[] bArr = this.e;
        if (bArr != null) {
            b(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/KGCM";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        int size = i + this.l.size();
        if (this.d) {
            return size + this.c;
        }
        int i2 = this.c;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.a;
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        lf5 lf5Var;
        this.d = z;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            byte[] d = pVar.d();
            byte[] bArr = this.g;
            tr.y(bArr, (byte) 0);
            System.arraycopy(d, 0, this.g, bArr.length - d.length, d.length);
            this.e = pVar.a();
            int c = pVar.c();
            if (c >= 64 && c <= (this.j << 3) && (c & 7) == 0) {
                this.c = c >>> 3;
                lf5Var = pVar.b();
                byte[] bArr2 = this.e;
                if (bArr2 != null) {
                    b(bArr2, 0, bArr2.length);
                }
            } else {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c);
            }
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a2 = pq7Var.a();
            byte[] bArr3 = this.g;
            tr.y(bArr3, (byte) 0);
            System.arraycopy(a2, 0, this.g, bArr3.length - a2.length, a2.length);
            this.e = null;
            this.c = this.j;
            lf5Var = (lf5) pq7Var.b();
        } else {
            throw new IllegalArgumentException("Invalid parameter passed");
        }
        this.f = new byte[this.j];
        this.b.f(true, new pq7(lf5Var, this.g));
        this.a.init(true, lf5Var);
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        this.l.write(b);
        return 0;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i + i2) {
            this.l.write(bArr, i, i2);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }
}
