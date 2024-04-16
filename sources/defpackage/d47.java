package defpackage;

import java.util.Vector;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: d47  reason: default package */
/* loaded from: classes3.dex */
public class d47 implements m {
    private xc0 a;
    private xc0 b;
    private boolean c;
    private int d;
    private byte[] e;
    private Vector f;
    private byte[] g;
    private byte[] h;
    private byte[] l;
    private byte[] m;
    private int n;
    private int o;
    private long p;
    private long q;
    private byte[] r;
    private byte[] s;
    private byte[] u;
    private byte[] v;
    private byte[] i = null;
    private byte[] j = new byte[24];
    private byte[] k = new byte[16];
    private byte[] t = new byte[16];

    public d47(xc0 xc0Var, xc0 xc0Var2) {
        if (xc0Var != null) {
            if (xc0Var.a() == 16) {
                if (xc0Var2 != null) {
                    if (xc0Var2.a() == 16) {
                        if (xc0Var.getAlgorithmName().equals(xc0Var2.getAlgorithmName())) {
                            this.a = xc0Var;
                            this.b = xc0Var2;
                            return;
                        }
                        throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
                    }
                    throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
                }
                throw new IllegalArgumentException("'mainCipher' cannot be null");
            }
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        throw new IllegalArgumentException("'hashCipher' cannot be null");
    }

    protected static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - l(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    protected static void d(byte[] bArr, int i) {
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i < 16) {
                bArr[i] = 0;
            } else {
                return;
            }
        }
    }

    protected static int e(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>>= 1;
        }
        return i;
    }

    protected static int l(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                int i3 = bArr[i] & 255;
                bArr2[i] = (byte) (i2 | (i3 << 1));
                i2 = (i3 >>> 7) & 1;
            } else {
                return i2;
            }
        }
    }

    protected static void n(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    @Override // defpackage.n
    public byte[] a() {
        byte[] bArr = this.v;
        if (bArr == null) {
            return new byte[this.d];
        }
        return tr.h(bArr);
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.l;
            int i4 = this.n;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.n = i5;
            if (i5 == bArr2.length) {
                h();
            }
        }
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        if (!this.c) {
            int i2 = this.o;
            int i3 = this.d;
            if (i2 >= i3) {
                int i4 = i2 - i3;
                this.o = i4;
                bArr2 = new byte[i3];
                System.arraycopy(this.m, i4, bArr2, 0, i3);
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        } else {
            bArr2 = null;
        }
        int i5 = this.n;
        if (i5 > 0) {
            d(this.l, i5);
            m(this.g);
        }
        int i6 = this.o;
        if (i6 > 0) {
            if (this.c) {
                d(this.m, i6);
                n(this.u, this.m);
            }
            n(this.t, this.g);
            byte[] bArr3 = new byte[16];
            this.a.b(this.t, 0, bArr3, 0);
            n(this.m, bArr3);
            int length = bArr.length;
            int i7 = this.o;
            if (length >= i + i7) {
                System.arraycopy(this.m, 0, bArr, i, i7);
                if (!this.c) {
                    d(this.m, this.o);
                    n(this.u, this.m);
                }
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        }
        n(this.u, this.t);
        n(this.u, this.h);
        xc0 xc0Var = this.a;
        byte[] bArr4 = this.u;
        xc0Var.b(bArr4, 0, bArr4, 0);
        n(this.u, this.s);
        int i8 = this.d;
        byte[] bArr5 = new byte[i8];
        this.v = bArr5;
        System.arraycopy(this.u, 0, bArr5, 0, i8);
        int i9 = this.o;
        if (this.c) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.d;
            if (length2 >= i10 + i11) {
                System.arraycopy(this.v, 0, bArr, i10, i11);
                i9 += this.d;
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (!tr.u(this.v, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        k(false);
        return i9;
    }

    protected void f(byte[] bArr) {
        if (bArr != null) {
            tr.y(bArr, (byte) 0);
        }
    }

    protected byte[] g(int i) {
        while (i >= this.f.size()) {
            Vector vector = this.f;
            vector.addElement(c((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f.elementAt(i);
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.b.getAlgorithmName() + "/OCB";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        int i2 = i + this.o;
        if (this.c) {
            return i2 + this.d;
        }
        int i3 = this.d;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.b;
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.o;
        if (!this.c) {
            int i3 = this.d;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    protected void h() {
        long j = this.p + 1;
        this.p = j;
        m(g(e(j)));
        this.n = 0;
    }

    protected void i(byte[] bArr, int i) {
        if (bArr.length >= i + 16) {
            if (this.c) {
                n(this.u, this.m);
                this.o = 0;
            }
            byte[] bArr2 = this.t;
            long j = this.q + 1;
            this.q = j;
            n(bArr2, g(e(j)));
            n(this.m, this.t);
            xc0 xc0Var = this.b;
            byte[] bArr3 = this.m;
            xc0Var.b(bArr3, 0, bArr3, 0);
            n(this.m, this.t);
            System.arraycopy(this.m, 0, bArr, i, 16);
            if (!this.c) {
                n(this.u, this.m);
                byte[] bArr4 = this.m;
                System.arraycopy(bArr4, 16, bArr4, 0, this.d);
                this.o = this.d;
                return;
            }
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        byte[] a;
        lf5 lf5Var;
        int i;
        boolean z2 = this.c;
        this.c = z;
        this.v = null;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            a = pVar.d();
            this.e = pVar.a();
            int c = pVar.c();
            if (c >= 64 && c <= 128 && c % 8 == 0) {
                this.d = c / 8;
                lf5Var = pVar.b();
            } else {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c);
            }
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            a = pq7Var.a();
            this.e = null;
            this.d = 16;
            lf5Var = (lf5) pq7Var.b();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        }
        this.l = new byte[16];
        if (z) {
            i = 16;
        } else {
            i = this.d + 16;
        }
        this.m = new byte[i];
        if (a == null) {
            a = new byte[0];
        }
        if (a.length <= 15) {
            if (lf5Var != null) {
                this.a.init(true, lf5Var);
                this.b.init(z, lf5Var);
                this.i = null;
            } else if (z2 != z) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            byte[] bArr = new byte[16];
            this.g = bArr;
            this.a.b(bArr, 0, bArr, 0);
            this.h = c(this.g);
            Vector vector = new Vector();
            this.f = vector;
            vector.addElement(c(this.h));
            int j = j(a);
            int i2 = j % 8;
            int i3 = j / 8;
            if (i2 == 0) {
                System.arraycopy(this.j, i3, this.k, 0, 16);
            } else {
                for (int i4 = 0; i4 < 16; i4++) {
                    byte[] bArr2 = this.j;
                    i3++;
                    this.k[i4] = (byte) (((bArr2[i3] & 255) >>> (8 - i2)) | ((bArr2[i3] & 255) << i2));
                }
            }
            this.n = 0;
            this.o = 0;
            this.p = 0L;
            this.q = 0L;
            this.r = new byte[16];
            this.s = new byte[16];
            System.arraycopy(this.k, 0, this.t, 0, 16);
            this.u = new byte[16];
            byte[] bArr3 = this.e;
            if (bArr3 != null) {
                b(bArr3, 0, bArr3.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("IV must be no more than 15 bytes");
    }

    protected int j(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b = bArr2[15];
        int i2 = b & 63;
        bArr2[15] = (byte) (b & 192);
        byte[] bArr3 = this.i;
        if (bArr3 == null || !tr.c(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.i = bArr2;
            this.a.b(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.j, 0, 16);
            while (i < 8) {
                byte[] bArr5 = this.j;
                int i3 = i + 16;
                byte b2 = bArr4[i];
                i++;
                bArr5[i3] = (byte) (b2 ^ bArr4[i]);
            }
        }
        return i2;
    }

    protected void k(boolean z) {
        this.a.reset();
        this.b.reset();
        f(this.l);
        f(this.m);
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.q = 0L;
        f(this.r);
        f(this.s);
        System.arraycopy(this.k, 0, this.t, 0, 16);
        f(this.u);
        if (z) {
            this.v = null;
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            b(bArr, 0, bArr.length);
        }
    }

    protected void m(byte[] bArr) {
        n(this.r, bArr);
        n(this.l, this.r);
        xc0 xc0Var = this.a;
        byte[] bArr2 = this.l;
        xc0Var.b(bArr2, 0, bArr2, 0);
        n(this.s, this.l);
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        byte[] bArr2 = this.m;
        int i2 = this.o;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.o = i3;
        if (i3 == bArr2.length) {
            i(bArr, i);
            return 16;
        }
        return 0;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr3 = this.m;
                int i6 = this.o;
                bArr3[i6] = bArr[i + i5];
                int i7 = i6 + 1;
                this.o = i7;
                if (i7 == bArr3.length) {
                    i(bArr2, i3 + i4);
                    i4 += 16;
                }
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }
}
