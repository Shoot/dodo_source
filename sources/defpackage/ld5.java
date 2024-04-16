package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ld5  reason: default package */
/* loaded from: classes3.dex */
public class ld5 implements m {
    private xc0 a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private a l;
    private a m;
    private int n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ld5$a */
    /* loaded from: classes3.dex */
    public class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public ld5(xc0 xc0Var) {
        this(xc0Var, 4);
    }

    private void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            for (int i3 = 0; i3 < this.a.a(); i3++) {
                byte[] bArr2 = this.f;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i + i3]);
            }
            xc0 xc0Var = this.a;
            byte[] bArr3 = this.f;
            xc0Var.b(bArr3, 0, bArr3, 0);
            i2 -= this.a.a();
            i += this.a.a();
        }
    }

    private void d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (true) {
            byte[] bArr3 = this.k;
            if (i4 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.j;
            bArr4[i4] = (byte) (bArr4[i4] + bArr3[i4]);
            i4++;
        }
        this.a.b(this.j, 0, this.i, 0);
        for (int i5 = 0; i5 < this.a.a(); i5++) {
            bArr2[i3 + i5] = (byte) (this.i[i5] ^ bArr[i + i5]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[LOOP:0: B:24:0x0041->B:26:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte e(boolean r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "0"
            if (r4 == 0) goto Lf
            java.lang.String r4 = "1"
            r0.append(r4)
            goto L12
        Lf:
            r0.append(r1)
        L12:
            r4 = 8
            if (r5 == r4) goto L36
            r4 = 16
            if (r5 == r4) goto L33
            r4 = 32
            if (r5 == r4) goto L30
            r4 = 48
            if (r5 == r4) goto L2d
            r4 = 64
            if (r5 == r4) goto L27
            goto L39
        L27:
            java.lang.String r4 = "110"
        L29:
            r0.append(r4)
            goto L39
        L2d:
            java.lang.String r4 = "101"
            goto L29
        L30:
            java.lang.String r4 = "100"
            goto L29
        L33:
            java.lang.String r4 = "011"
            goto L29
        L36:
            java.lang.String r4 = "010"
            goto L29
        L39:
            int r4 = r3.n
            int r4 = r4 + (-1)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
        L41:
            int r5 = r4.length()
            r2 = 4
            if (r5 >= r2) goto L57
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r4)
            r4 = 0
            java.lang.StringBuffer r4 = r5.insert(r4, r1)
            java.lang.String r4 = r4.toString()
            goto L41
        L57:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld5.e(boolean, int):byte");
    }

    private void f(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    private void g(byte[] bArr, int i, int i2, int i3) {
        if (i2 - i >= this.a.a()) {
            if (i2 % this.a.a() == 0) {
                byte[] bArr2 = this.g;
                System.arraycopy(bArr2, 0, this.h, 0, (bArr2.length - this.n) - 1);
                f(i3, this.i, 0);
                System.arraycopy(this.i, 0, this.h, (this.g.length - this.n) - 1, 4);
                byte[] bArr3 = this.h;
                bArr3[bArr3.length - 1] = e(true, this.b);
                this.a.b(this.h, 0, this.f, 0);
                f(i2, this.i, 0);
                if (i2 <= this.a.a() - this.n) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        byte[] bArr4 = this.i;
                        int i5 = this.n + i4;
                        bArr4[i5] = (byte) (bArr4[i5] ^ bArr[i + i4]);
                    }
                    for (int i6 = 0; i6 < this.a.a(); i6++) {
                        byte[] bArr5 = this.f;
                        bArr5[i6] = (byte) (bArr5[i6] ^ this.i[i6]);
                    }
                    xc0 xc0Var = this.a;
                    byte[] bArr6 = this.f;
                    xc0Var.b(bArr6, 0, bArr6, 0);
                    return;
                }
                for (int i7 = 0; i7 < this.a.a(); i7++) {
                    byte[] bArr7 = this.f;
                    bArr7[i7] = (byte) (bArr7[i7] ^ this.i[i7]);
                }
                xc0 xc0Var2 = this.a;
                byte[] bArr8 = this.f;
                xc0Var2.b(bArr8, 0, bArr8, 0);
                while (i2 != 0) {
                    for (int i8 = 0; i8 < this.a.a(); i8++) {
                        byte[] bArr9 = this.f;
                        bArr9[i8] = (byte) (bArr9[i8] ^ bArr[i8 + i]);
                    }
                    xc0 xc0Var3 = this.a;
                    byte[] bArr10 = this.f;
                    xc0Var3.b(bArr10, 0, bArr10, 0);
                    i += this.a.a();
                    i2 -= this.a.a();
                }
                return;
            }
            throw new IllegalArgumentException("padding not supported");
        }
        throw new IllegalArgumentException("authText buffer too short");
    }

    private void j(int i) {
        if (i != 4 && i != 6 && i != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.n = i;
    }

    @Override // defpackage.n
    public byte[] a() {
        return tr.h(this.e);
    }

    @Override // defpackage.n
    public void b(byte[] bArr, int i, int i2) {
        this.l.write(bArr, i, i2);
    }

    @Override // defpackage.n
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int h = h(this.m.a(), 0, this.m.size(), bArr, i);
        i();
        return h;
    }

    @Override // defpackage.n
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/KCCM";
    }

    @Override // defpackage.n
    public int getOutputSize(int i) {
        return i + this.b;
    }

    @Override // defpackage.m
    public xc0 getUnderlyingCipher() {
        return this.a;
    }

    public int h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, InvalidCipherTextException {
        int i4;
        if (bArr.length - i >= i2) {
            if (bArr2.length - i3 >= i2) {
                if (this.l.size() > 0) {
                    if (this.c) {
                        g(this.l.a(), 0, this.l.size(), this.m.size());
                    } else {
                        g(this.l.a(), 0, this.l.size(), this.m.size() - this.b);
                    }
                }
                if (this.c) {
                    if (i2 % this.a.a() == 0) {
                        c(bArr, i, i2);
                        this.a.b(this.g, 0, this.j, 0);
                        int i5 = i2;
                        while (i5 > 0) {
                            d(bArr, i, i2, bArr2, i3);
                            i5 -= this.a.a();
                            i += this.a.a();
                            i3 += this.a.a();
                        }
                        int i6 = 0;
                        while (true) {
                            byte[] bArr3 = this.k;
                            if (i6 >= bArr3.length) {
                                break;
                            }
                            byte[] bArr4 = this.j;
                            bArr4[i6] = (byte) (bArr4[i6] + bArr3[i6]);
                            i6++;
                        }
                        this.a.b(this.j, 0, this.i, 0);
                        int i7 = 0;
                        while (true) {
                            int i8 = this.b;
                            if (i7 < i8) {
                                bArr2[i3 + i7] = (byte) (this.i[i7] ^ this.f[i7]);
                                i7++;
                            } else {
                                System.arraycopy(this.f, 0, this.e, 0, i8);
                                i();
                                return i2 + this.b;
                            }
                        }
                    } else {
                        throw new DataLengthException("partial blocks not supported");
                    }
                } else if ((i2 - this.b) % this.a.a() == 0) {
                    this.a.b(this.g, 0, this.j, 0);
                    int a2 = i2 / this.a.a();
                    for (int i9 = 0; i9 < a2; i9++) {
                        d(bArr, i, i2, bArr2, i3);
                        i += this.a.a();
                        i3 += this.a.a();
                    }
                    if (i2 > i) {
                        int i10 = 0;
                        while (true) {
                            byte[] bArr5 = this.k;
                            if (i10 >= bArr5.length) {
                                break;
                            }
                            byte[] bArr6 = this.j;
                            bArr6[i10] = (byte) (bArr6[i10] + bArr5[i10]);
                            i10++;
                        }
                        this.a.b(this.j, 0, this.i, 0);
                        int i11 = 0;
                        while (true) {
                            i4 = this.b;
                            if (i11 >= i4) {
                                break;
                            }
                            bArr2[i3 + i11] = (byte) (this.i[i11] ^ bArr[i + i11]);
                            i11++;
                        }
                        i3 += i4;
                    }
                    int i12 = 0;
                    while (true) {
                        byte[] bArr7 = this.k;
                        if (i12 >= bArr7.length) {
                            break;
                        }
                        byte[] bArr8 = this.j;
                        bArr8[i12] = (byte) (bArr8[i12] + bArr7[i12]);
                        i12++;
                    }
                    this.a.b(this.j, 0, this.i, 0);
                    int i13 = this.b;
                    System.arraycopy(bArr2, i3 - i13, this.i, 0, i13);
                    c(bArr2, 0, i3 - this.b);
                    System.arraycopy(this.f, 0, this.e, 0, this.b);
                    int i14 = this.b;
                    byte[] bArr9 = new byte[i14];
                    System.arraycopy(this.i, 0, bArr9, 0, i14);
                    if (tr.u(this.e, bArr9)) {
                        i();
                        return i2 - this.b;
                    }
                    throw new InvalidCipherTextException("mac check failed");
                } else {
                    throw new DataLengthException("partial blocks not supported");
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    public void i() {
        tr.y(this.h, (byte) 0);
        tr.y(this.i, (byte) 0);
        tr.y(this.k, (byte) 0);
        tr.y(this.f, (byte) 0);
        this.k[0] = 1;
        this.m.reset();
        this.l.reset();
        byte[] bArr = this.d;
        if (bArr != null) {
            b(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.n
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        v71 b;
        if (v71Var instanceof p) {
            p pVar = (p) v71Var;
            if (pVar.c() <= 512 && pVar.c() >= 64 && pVar.c() % 8 == 0) {
                this.g = pVar.d();
                this.b = pVar.c() / 8;
                this.d = pVar.a();
                b = pVar.b();
            } else {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
        } else if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.g = pq7Var.a();
            this.b = this.a.a();
            this.d = null;
            b = pq7Var.b();
        } else {
            throw new IllegalArgumentException("Invalid parameters specified");
        }
        this.e = new byte[this.b];
        this.c = z;
        this.a.init(true, b);
        this.k[0] = 1;
        byte[] bArr = this.d;
        if (bArr != null) {
            b(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.n
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        this.m.write(b);
        return 0;
    }

    @Override // defpackage.n
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i + i2) {
            this.m.write(bArr, i, i2);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }

    public ld5(xc0 xc0Var, int i) {
        this.l = new a();
        this.m = new a();
        this.n = 4;
        this.a = xc0Var;
        this.b = xc0Var.a();
        this.g = new byte[xc0Var.a()];
        this.d = new byte[xc0Var.a()];
        this.e = new byte[xc0Var.a()];
        this.f = new byte[xc0Var.a()];
        this.h = new byte[xc0Var.a()];
        this.i = new byte[xc0Var.a()];
        this.j = new byte[xc0Var.a()];
        this.k = new byte[xc0Var.a()];
        j(i);
    }

    @Override // defpackage.n
    public int getUpdateOutputSize(int i) {
        return i;
    }
}
