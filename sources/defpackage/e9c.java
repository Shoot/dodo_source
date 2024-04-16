package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonGenerationException;
import defpackage.ua5;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: WriterBasedJsonGenerator.java */
/* renamed from: e9c  reason: default package */
/* loaded from: classes2.dex */
public class e9c extends va5 {
    protected static final char[] A = kw0.c();
    protected final Writer r;
    protected char s;
    protected char[] t;
    protected int u;
    protected int v;
    protected int w;
    protected char[] x;
    protected mca y;
    protected char[] z;

    public e9c(ks4 ks4Var, int i, q47 q47Var, Writer writer, char c) {
        super(ks4Var, i, q47Var);
        this.r = writer;
        char[] e = ks4Var.e();
        this.t = e;
        this.w = e.length;
        this.s = c;
        if (c != '\"') {
            this.l = kw0.e(c);
        }
    }

    private char[] I1() {
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 0, CoreConstants.ESCAPE_CHAR, 'u', '0', '0', 0, 0, CoreConstants.ESCAPE_CHAR, 'u'};
        this.x = cArr;
        return cArr;
    }

    private void J1(char c, int i) throws IOException, JsonGenerationException {
        int i2;
        if (i >= 0) {
            if (this.v + 2 > this.w) {
                K1();
            }
            char[] cArr = this.t;
            int i3 = this.v;
            cArr[i3] = CoreConstants.ESCAPE_CHAR;
            this.v = i3 + 2;
            cArr[i3 + 1] = (char) i;
        } else if (i != -2) {
            if (this.v + 5 >= this.w) {
                K1();
            }
            int i4 = this.v;
            char[] cArr2 = this.t;
            cArr2[i4] = CoreConstants.ESCAPE_CHAR;
            int i5 = i4 + 2;
            cArr2[i4 + 1] = 'u';
            if (c > 255) {
                int i6 = c >> '\b';
                int i7 = i4 + 3;
                char[] cArr3 = A;
                cArr2[i5] = cArr3[(i6 & 255) >> 4];
                i2 = i4 + 4;
                cArr2[i7] = cArr3[i6 & 15];
                c = (char) (c & 255);
            } else {
                int i8 = i4 + 3;
                cArr2[i5] = '0';
                i2 = i4 + 4;
                cArr2[i8] = '0';
            }
            char[] cArr4 = A;
            cArr2[i2] = cArr4[c >> 4];
            cArr2[i2 + 1] = cArr4[c & 15];
            this.v = i2 + 2;
        } else {
            this.y.getClass();
            String value = this.y.getValue();
            this.y = null;
            int length = value.length();
            if (this.v + length > this.w) {
                K1();
                if (length > this.w) {
                    this.r.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.t, this.v);
            this.v += length;
        }
    }

    private int P1(char[] cArr, int i, int i2, char c, int i3) throws IOException, JsonGenerationException {
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = CoreConstants.ESCAPE_CHAR;
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArr2 = this.x;
            if (cArr2 == null) {
                cArr2 = I1();
            }
            cArr2[1] = (char) i3;
            this.r.write(cArr2, 0, 2);
            return i;
        } else if (i3 != -2) {
            if (i > 5 && i < i2) {
                cArr[i - 6] = CoreConstants.ESCAPE_CHAR;
                int i6 = i - 4;
                cArr[i - 5] = 'u';
                if (c > 255) {
                    int i7 = c >> '\b';
                    int i8 = i - 3;
                    char[] cArr3 = A;
                    cArr[i6] = cArr3[(i7 & 255) >> 4];
                    i4 = i - 2;
                    cArr[i8] = cArr3[i7 & 15];
                    c = (char) (c & 255);
                } else {
                    int i9 = i - 3;
                    cArr[i6] = '0';
                    i4 = i - 2;
                    cArr[i9] = '0';
                }
                char[] cArr4 = A;
                cArr[i4] = cArr4[c >> 4];
                cArr[i4 + 1] = cArr4[c & 15];
                return i4 - 4;
            }
            char[] cArr5 = this.x;
            if (cArr5 == null) {
                cArr5 = I1();
            }
            this.u = this.v;
            if (c > 255) {
                int i10 = c >> '\b';
                char[] cArr6 = A;
                cArr5[10] = cArr6[(i10 & 255) >> 4];
                cArr5[11] = cArr6[i10 & 15];
                cArr5[12] = cArr6[(c & 255) >> 4];
                cArr5[13] = cArr6[c & 15];
                this.r.write(cArr5, 8, 6);
                return i;
            }
            char[] cArr7 = A;
            cArr5[6] = cArr7[c >> 4];
            cArr5[7] = cArr7[c & 15];
            this.r.write(cArr5, 2, 6);
            return i;
        } else {
            this.y.getClass();
            String value = this.y.getValue();
            this.y = null;
            int length = value.length();
            if (i >= length && i < i2) {
                int i11 = i - length;
                value.getChars(0, length, cArr, i11);
                return i11;
            }
            this.r.write(value);
            return i;
        }
    }

    private void Q1(char c, int i) throws IOException, JsonGenerationException {
        int i2;
        if (i >= 0) {
            int i3 = this.v;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.u = i4;
                char[] cArr = this.t;
                cArr[i4] = CoreConstants.ESCAPE_CHAR;
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr2 = this.x;
            if (cArr2 == null) {
                cArr2 = I1();
            }
            this.u = this.v;
            cArr2[1] = (char) i;
            this.r.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i5 = this.v;
            if (i5 >= 6) {
                char[] cArr3 = this.t;
                int i6 = i5 - 6;
                this.u = i6;
                cArr3[i6] = CoreConstants.ESCAPE_CHAR;
                cArr3[i5 - 5] = 'u';
                if (c > 255) {
                    int i7 = c >> '\b';
                    char[] cArr4 = A;
                    cArr3[i5 - 4] = cArr4[(i7 & 255) >> 4];
                    i2 = i5 - 3;
                    cArr3[i2] = cArr4[i7 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr3[i5 - 4] = '0';
                    i2 = i5 - 3;
                    cArr3[i2] = '0';
                }
                char[] cArr5 = A;
                cArr3[i2 + 1] = cArr5[c >> 4];
                cArr3[i2 + 2] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.x;
            if (cArr6 == null) {
                cArr6 = I1();
            }
            this.u = this.v;
            if (c > 255) {
                int i8 = c >> '\b';
                char[] cArr7 = A;
                cArr6[10] = cArr7[(i8 & 255) >> 4];
                cArr6[11] = cArr7[i8 & 15];
                cArr6[12] = cArr7[(c & 255) >> 4];
                cArr6[13] = cArr7[c & 15];
                this.r.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = A;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.r.write(cArr6, 2, 6);
        } else {
            this.y.getClass();
            String value = this.y.getValue();
            this.y = null;
            int length = value.length();
            int i9 = this.v;
            if (i9 >= length) {
                int i10 = i9 - length;
                this.u = i10;
                value.getChars(0, length, this.t, i10);
                return;
            }
            this.u = i9;
            this.r.write(value);
        }
    }

    private int R1(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i5 = min - i4;
            if (i5 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i5);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    private final void a2(mca mcaVar) throws IOException {
        char[] b = mcaVar.b();
        O0(b, 0, b.length);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = this.s;
    }

    private void b2(String str) throws IOException {
        K1();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.w;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.t, 0);
            int i4 = this.m;
            if (i4 != 0) {
                k2(i2, i4);
            } else {
                j2(i2);
            }
            if (i3 >= length) {
                return;
            }
            i = i3;
        }
    }

    private final void c2() throws IOException {
        if (this.v + 4 >= this.w) {
            K1();
        }
        int i = this.v;
        char[] cArr = this.t;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.v = i + 4;
    }

    private void f2(int i) throws IOException {
        if (this.v + 13 >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i2 = this.v;
        int i3 = i2 + 1;
        this.v = i3;
        cArr[i2] = this.s;
        int j = y37.j(i, cArr, i3);
        char[] cArr2 = this.t;
        this.v = j + 1;
        cArr2[j] = this.s;
    }

    private void g2(long j) throws IOException {
        if (this.v + 23 >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        cArr[i] = this.s;
        int k = y37.k(j, cArr, i2);
        char[] cArr2 = this.t;
        this.v = k + 1;
        cArr2[k] = this.s;
    }

    private void h2(String str) throws IOException {
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = this.s;
        N0(str);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr2[i2] = this.s;
    }

    private void i2(short s) throws IOException {
        if (this.v + 8 >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        cArr[i] = this.s;
        int j = y37.j(s, cArr, i2);
        char[] cArr2 = this.t;
        this.v = j + 1;
        cArr2[j] = this.s;
    }

    private void j2(int i) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.l;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                cArr = this.t;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2++;
            } while (i2 < i);
            int i4 = i2 - i3;
            if (i4 > 0) {
                this.r.write(cArr, i3, i4);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = P1(this.t, i2, i, c, iArr[c]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0021 A[EDGE_INSN: B:26:0x0021->B:13:0x0021 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k2(int r13, int r14) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r12 = this;
            int[] r0 = r12.l
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            if (r2 >= r13) goto L3a
        Le:
            char[] r5 = r12.t
            char r10 = r5[r2]
            if (r10 >= r1) goto L19
            r4 = r0[r10]
            if (r4 == 0) goto L1d
            goto L21
        L19:
            if (r10 <= r14) goto L1d
            r4 = -1
            goto L21
        L1d:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
        L21:
            int r6 = r2 - r3
            if (r6 <= 0) goto L2d
            java.io.Writer r7 = r12.r
            r7.write(r5, r3, r6)
            if (r2 < r13) goto L2d
            goto L3a
        L2d:
            int r2 = r2 + 1
            char[] r7 = r12.t
            r6 = r12
            r8 = r2
            r9 = r13
            r11 = r4
            int r3 = r6.P1(r7, r8, r9, r10, r11)
            goto Lc
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9c.k2(int, int):void");
    }

    private void l2(String str) throws IOException {
        int length = str.length();
        int i = this.w;
        if (length > i) {
            b2(str);
            return;
        }
        if (this.v + length > i) {
            K1();
        }
        str.getChars(0, length, this.t, this.v);
        int i2 = this.m;
        if (i2 != 0) {
            p2(length, i2);
        } else {
            n2(length);
        }
    }

    private void m2(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.m;
        if (i3 != 0) {
            q2(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.l;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i5++;
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this.v + i6 > this.w) {
                    K1();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this.t, this.v, i6);
                    this.v += i6;
                }
            } else {
                K1();
                this.r.write(cArr, i, i6);
            }
            if (i5 < i4) {
                i = i5 + 1;
                char c2 = cArr[i5];
                J1(c2, iArr[c2]);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        r6.r.write(r2, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = r6.t;
        r3 = r6.v;
        r6.v = r3 + 1;
        r2 = r2[r3];
        Q1(r2, r7[r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        r4 = r6.u;
        r3 = r3 - r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n2(int r7) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.v
            int r0 = r0 + r7
            int[] r7 = r6.l
            int r1 = r7.length
        L6:
            int r2 = r6.v
            if (r2 >= r0) goto L36
        La:
            char[] r2 = r6.t
            int r3 = r6.v
            char r4 = r2[r3]
            if (r4 >= r1) goto L30
            r4 = r7[r4]
            if (r4 == 0) goto L30
            int r4 = r6.u
            int r3 = r3 - r4
            if (r3 <= 0) goto L20
            java.io.Writer r5 = r6.r
            r5.write(r2, r4, r3)
        L20:
            char[] r2 = r6.t
            int r3 = r6.v
            int r4 = r3 + 1
            r6.v = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.Q1(r2, r3)
            goto L6
        L30:
            int r3 = r3 + 1
            r6.v = r3
            if (r3 < r0) goto La
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9c.n2(int):void");
    }

    private void o2(mca mcaVar) throws IOException {
        char[] b = mcaVar.b();
        int length = b.length;
        if (length < 32) {
            if (length > this.w - this.v) {
                K1();
            }
            System.arraycopy(b, 0, this.t, this.v, length);
            this.v += length;
        } else {
            K1();
            this.r.write(b, 0, length);
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p2(int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r0 = r8.v
            int r0 = r0 + r9
            int[] r9 = r8.l
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8.v
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8.t
            int r3 = r8.v
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8.u
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8.r
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8.v
            int r2 = r2 + 1
            r8.v = r2
            r8.Q1(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8.v = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9c.p2(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001f A[EDGE_INSN: B:30:0x001f->B:14:0x001f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q2(char[] r9, int r10, int r11, int r12) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8.l
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8.v
            int r6 = r6 + r5
            int r7 = r8.w
            if (r6 <= r7) goto L2f
            r8.K1()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8.t
            int r7 = r8.v
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8.v
            int r10 = r10 + r5
            r8.v = r10
            goto L46
        L3e:
            r8.K1()
            java.io.Writer r6 = r8.r
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8.J1(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9c.q2(char[], int, int, int):void");
    }

    private void r2(String str) throws IOException {
        int i = this.w;
        int i2 = this.v;
        int i3 = i - i2;
        str.getChars(0, i3, this.t, i2);
        this.v += i3;
        K1();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.w;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.t, 0);
                this.u = 0;
                this.v = i4;
                K1();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.t, 0);
                this.u = 0;
                this.v = length;
                return;
            }
        }
    }

    @Override // defpackage.hd4
    protected final void E1(String str) throws IOException {
        char c;
        int w = this.h.w();
        if (this.a != null) {
            G1(str, w);
            return;
        }
        if (w != 1) {
            if (w != 2) {
                if (w != 3) {
                    if (w != 5) {
                        return;
                    }
                    F1(str);
                    return;
                }
                mca mcaVar = this.n;
                if (mcaVar != null) {
                    N0(mcaVar.getValue());
                    return;
                }
                return;
            }
            c = CoreConstants.COLON_CHAR;
        } else {
            c = CoreConstants.COMMA_CHAR;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.ua5
    public void K0(char c) throws IOException {
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = c;
    }

    protected void K1() throws IOException {
        int i = this.v;
        int i2 = this.u;
        int i3 = i - i2;
        if (i3 > 0) {
            this.u = 0;
            this.v = 0;
            this.r.write(this.t, i2, i3);
        }
    }

    @Override // defpackage.ua5
    public int M(v60 v60Var, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        E1("write a binary value");
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr[i2] = this.s;
        byte[] d = this.k.d();
        try {
            if (i < 0) {
                i = V1(v60Var, inputStream, d);
            } else {
                int W1 = W1(v60Var, inputStream, d, i);
                if (W1 > 0) {
                    a("Too few bytes available: missing " + W1 + " bytes (out of " + i + ")");
                }
            }
            this.k.g(d);
            if (this.v >= this.w) {
                K1();
            }
            char[] cArr2 = this.t;
            int i3 = this.v;
            this.v = i3 + 1;
            cArr2[i3] = this.s;
            return i;
        } catch (Throwable th) {
            this.k.g(d);
            throw th;
        }
    }

    @Override // defpackage.ua5
    public void M0(mca mcaVar) throws IOException {
        int c = mcaVar.c(this.t, this.v);
        if (c < 0) {
            N0(mcaVar.getValue());
        } else {
            this.v += c;
        }
    }

    @Override // defpackage.ua5
    public void N0(String str) throws IOException {
        int length = str.length();
        int i = this.w - this.v;
        if (i == 0) {
            K1();
            i = this.w - this.v;
        }
        if (i >= length) {
            str.getChars(0, length, this.t, this.v);
            this.v += length;
            return;
        }
        r2(str);
    }

    @Override // defpackage.ua5
    public void O0(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            if (i2 > this.w - this.v) {
                K1();
            }
            System.arraycopy(cArr, i, this.t, this.v, i2);
            this.v += i2;
            return;
        }
        K1();
        this.r.write(cArr, i, i2);
    }

    @Override // defpackage.ua5
    public void P(v60 v60Var, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        E1("write a binary value");
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i3 = this.v;
        this.v = i3 + 1;
        cArr[i3] = this.s;
        X1(v60Var, bArr, i, i2 + i);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i4 = this.v;
        this.v = i4 + 1;
        cArr2[i4] = this.s;
    }

    @Override // defpackage.ua5
    public void T(boolean z) throws IOException {
        int i;
        E1("write a boolean value");
        if (this.v + 5 >= this.w) {
            K1();
        }
        int i2 = this.v;
        char[] cArr = this.t;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.v = i + 1;
    }

    protected void U1() {
        char[] cArr = this.t;
        if (cArr != null) {
            this.t = null;
            this.k.h(cArr);
        }
        char[] cArr2 = this.z;
        if (cArr2 != null) {
            this.z = null;
            this.k.i(cArr2);
        }
    }

    protected final int V1(v60 v60Var, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i = this.w - 6;
        int i2 = 2;
        int i3 = -3;
        int i4 = v60Var.i() >> 2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 > i3) {
                i6 = R1(inputStream, bArr, i5, i6, bArr.length);
                if (i6 < 3) {
                    break;
                }
                i3 = i6 - 3;
                i5 = 0;
            }
            if (this.v > i) {
                K1();
            }
            int i8 = i5 + 2;
            int i9 = bArr[i5 + 1] & 255;
            i5 += 3;
            i7 += 3;
            int c = v60Var.c(((i9 | (bArr[i5] << 8)) << 8) | (bArr[i8] & 255), this.t, this.v);
            this.v = c;
            i4--;
            if (i4 <= 0) {
                char[] cArr = this.t;
                cArr[c] = CoreConstants.ESCAPE_CHAR;
                this.v = c + 2;
                cArr[c + 1] = 'n';
                i4 = v60Var.i() >> 2;
            }
        }
        if (i6 > 0) {
            if (this.v > i) {
                K1();
            }
            int i10 = bArr[0] << 16;
            if (1 < i6) {
                i10 |= (bArr[1] & 255) << 8;
            } else {
                i2 = 1;
            }
            int i11 = i7 + i2;
            this.v = v60Var.e(i10, i2, this.t, this.v);
            return i11;
        }
        return i7;
    }

    @Override // defpackage.ua5
    public void W() throws IOException {
        if (!this.h.f()) {
            a("Current context not Array but " + this.h.i());
        }
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.a(this, this.h.d());
        } else {
            if (this.v >= this.w) {
                K1();
            }
            char[] cArr = this.t;
            int i = this.v;
            this.v = i + 1;
            cArr[i] = ']';
        }
        this.h = this.h.k();
    }

    protected final int W1(v60 v60Var, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int R1;
        int i2 = this.w - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int i6 = v60Var.i() >> 2;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i5 <= 2) {
                break;
            }
            if (i7 > i4) {
                i8 = R1(inputStream, bArr, i7, i8, i5);
                if (i8 < 3) {
                    i7 = 0;
                    break;
                }
                i4 = i8 - 3;
                i7 = 0;
            }
            if (this.v > i2) {
                K1();
            }
            int i9 = i7 + 2;
            int i10 = bArr[i7 + 1] & 255;
            i7 += 3;
            i5 -= 3;
            int c = v60Var.c(((i10 | (bArr[i7] << 8)) << 8) | (bArr[i9] & 255), this.t, this.v);
            this.v = c;
            i6--;
            if (i6 <= 0) {
                char[] cArr = this.t;
                cArr[c] = CoreConstants.ESCAPE_CHAR;
                this.v = c + 2;
                cArr[c + 1] = 'n';
                i6 = v60Var.i() >> 2;
            }
        }
        if (i5 > 0 && (R1 = R1(inputStream, bArr, i7, i8, i5)) > 0) {
            if (this.v > i2) {
                K1();
            }
            int i11 = bArr[0] << 16;
            if (1 < R1) {
                i11 |= (bArr[1] & 255) << 8;
            } else {
                i3 = 1;
            }
            this.v = v60Var.e(i11, i3, this.t, this.v);
            return i5 - i3;
        }
        return i5;
    }

    protected final void X1(v60 v60Var, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int c;
        int i3 = i2 - 3;
        int i4 = this.w - 6;
        int i5 = v60Var.i();
        loop0: while (true) {
            int i6 = i5 >> 2;
            while (i <= i3) {
                if (this.v > i4) {
                    K1();
                }
                int i7 = i + 2;
                int i8 = bArr[i + 1] & 255;
                i += 3;
                c = v60Var.c(((i8 | (bArr[i] << 8)) << 8) | (bArr[i7] & 255), this.t, this.v);
                this.v = c;
                i6--;
                if (i6 <= 0) {
                    break;
                }
            }
            char[] cArr = this.t;
            cArr[c] = CoreConstants.ESCAPE_CHAR;
            this.v = c + 2;
            cArr[c + 1] = 'n';
            i5 = v60Var.i();
        }
        int i9 = i2 - i;
        if (i9 > 0) {
            if (this.v > i4) {
                K1();
            }
            int i10 = i + 1;
            int i11 = bArr[i] << 16;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            this.v = v60Var.e(i11, i9, this.t, this.v);
        }
    }

    @Override // defpackage.ua5
    public void Y0() throws IOException {
        E1("start an array");
        this.h = this.h.l();
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.e(this);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = '[';
    }

    protected final void Y1(mca mcaVar, boolean z) throws IOException {
        if (this.a != null) {
            d2(mcaVar, z);
            return;
        }
        if (this.v + 1 >= this.w) {
            K1();
        }
        if (z) {
            char[] cArr = this.t;
            int i = this.v;
            this.v = i + 1;
            cArr[i] = CoreConstants.COMMA_CHAR;
        }
        if (this.o) {
            char[] b = mcaVar.b();
            O0(b, 0, b.length);
            return;
        }
        char[] cArr2 = this.t;
        int i2 = this.v;
        int i3 = i2 + 1;
        this.v = i3;
        cArr2[i2] = this.s;
        int a = mcaVar.a(cArr2, i3);
        if (a < 0) {
            a2(mcaVar);
            return;
        }
        int i4 = this.v + a;
        this.v = i4;
        if (i4 >= this.w) {
            K1();
        }
        char[] cArr3 = this.t;
        int i5 = this.v;
        this.v = i5 + 1;
        cArr3[i5] = this.s;
    }

    protected final void Z1(String str, boolean z) throws IOException {
        if (this.a != null) {
            e2(str, z);
            return;
        }
        if (this.v + 1 >= this.w) {
            K1();
        }
        if (z) {
            char[] cArr = this.t;
            int i = this.v;
            this.v = i + 1;
            cArr[i] = CoreConstants.COMMA_CHAR;
        }
        if (this.o) {
            l2(str);
            return;
        }
        char[] cArr2 = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr2[i2] = this.s;
        l2(str);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr3 = this.t;
        int i3 = this.v;
        this.v = i3 + 1;
        cArr3[i3] = this.s;
    }

    @Override // defpackage.ua5
    public void b0() throws IOException {
        if (!this.h.g()) {
            a("Current context not Object but " + this.h.i());
        }
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.l(this, this.h.d());
        } else {
            if (this.v >= this.w) {
                K1();
            }
            char[] cArr = this.t;
            int i = this.v;
            this.v = i + 1;
            cArr[i] = CoreConstants.CURLY_RIGHT;
        }
        this.h = this.h.k();
    }

    @Override // defpackage.hd4, defpackage.ua5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.t != null && q(ua5.b.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                jc5 n = n();
                if (n.f()) {
                    W();
                } else if (!n.g()) {
                    break;
                } else {
                    b0();
                }
            }
        }
        K1();
        this.u = 0;
        this.v = 0;
        if (this.r != null) {
            if (!this.k.f() && !q(ua5.b.AUTO_CLOSE_TARGET)) {
                if (q(ua5.b.FLUSH_PASSED_TO_STREAM)) {
                    this.r.flush();
                }
            } else {
                this.r.close();
            }
        }
        U1();
    }

    protected final void d2(mca mcaVar, boolean z) throws IOException {
        if (z) {
            this.a.k(this);
        } else {
            this.a.c(this);
        }
        char[] b = mcaVar.b();
        if (this.o) {
            O0(b, 0, b.length);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = this.s;
        O0(b, 0, b.length);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr2[i2] = this.s;
    }

    @Override // defpackage.ua5
    public void e1(Object obj) throws IOException {
        E1("start an array");
        this.h = this.h.m(obj);
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.e(this);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = '[';
    }

    protected final void e2(String str, boolean z) throws IOException {
        if (z) {
            this.a.k(this);
        } else {
            this.a.c(this);
        }
        if (this.o) {
            l2(str);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = this.s;
        l2(str);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr2[i2] = this.s;
    }

    @Override // defpackage.ua5
    public void f0(mca mcaVar) throws IOException {
        int v = this.h.v(mcaVar.getValue());
        if (v == 4) {
            a("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (v != 1) {
            z = false;
        }
        Y1(mcaVar, z);
    }

    @Override // defpackage.ua5
    public void f1(Object obj, int i) throws IOException {
        E1("start an array");
        this.h = this.h.m(obj);
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.e(this);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // defpackage.ua5, java.io.Flushable
    public void flush() throws IOException {
        K1();
        if (this.r != null && q(ua5.b.FLUSH_PASSED_TO_STREAM)) {
            this.r.flush();
        }
    }

    @Override // defpackage.ua5
    public void g1() throws IOException {
        E1("start an object");
        this.h = this.h.n();
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.f(this);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = CoreConstants.CURLY_LEFT;
    }

    @Override // defpackage.ua5
    public void i1(Object obj) throws IOException {
        E1("start an object");
        this.h = this.h.o(obj);
        jj8 jj8Var = this.a;
        if (jj8Var != null) {
            jj8Var.f(this);
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = CoreConstants.CURLY_LEFT;
    }

    @Override // defpackage.ua5
    public void j0(String str) throws IOException {
        int v = this.h.v(str);
        if (v == 4) {
            a("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (v != 1) {
            z = false;
        }
        Z1(str, z);
    }

    @Override // defpackage.ua5
    public void l0() throws IOException {
        E1("write a null");
        c2();
    }

    @Override // defpackage.ua5
    public void m0(double d) throws IOException {
        if (!this.g && (!y37.h(d) || !q(ua5.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            E1("write a number");
            N0(String.valueOf(d));
            return;
        }
        q1(String.valueOf(d));
    }

    @Override // defpackage.ua5
    public void n0(float f) throws IOException {
        if (!this.g && (!y37.i(f) || !q(ua5.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            E1("write a number");
            N0(String.valueOf(f));
            return;
        }
        q1(String.valueOf(f));
    }

    @Override // defpackage.ua5
    public void o0(int i) throws IOException {
        E1("write a number");
        if (this.g) {
            f2(i);
            return;
        }
        if (this.v + 11 >= this.w) {
            K1();
        }
        this.v = y37.j(i, this.t, this.v);
    }

    @Override // defpackage.ua5
    public void o1(mca mcaVar) throws IOException {
        E1("write a string");
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        cArr[i] = this.s;
        int a = mcaVar.a(cArr, i2);
        if (a < 0) {
            o2(mcaVar);
            return;
        }
        int i3 = this.v + a;
        this.v = i3;
        if (i3 >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i4 = this.v;
        this.v = i4 + 1;
        cArr2[i4] = this.s;
    }

    @Override // defpackage.ua5
    public void p0(long j) throws IOException {
        E1("write a number");
        if (this.g) {
            g2(j);
            return;
        }
        if (this.v + 21 >= this.w) {
            K1();
        }
        this.v = y37.k(j, this.t, this.v);
    }

    @Override // defpackage.ua5
    public void q0(String str) throws IOException {
        E1("write a number");
        if (str == null) {
            c2();
        } else if (this.g) {
            h2(str);
        } else {
            N0(str);
        }
    }

    @Override // defpackage.ua5
    public void q1(String str) throws IOException {
        E1("write a string");
        if (str == null) {
            c2();
            return;
        }
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr = this.t;
        int i = this.v;
        this.v = i + 1;
        cArr[i] = this.s;
        l2(str);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        cArr2[i2] = this.s;
    }

    @Override // defpackage.ua5
    public void r0(BigDecimal bigDecimal) throws IOException {
        E1("write a number");
        if (bigDecimal == null) {
            c2();
        } else if (this.g) {
            h2(A1(bigDecimal));
        } else {
            N0(A1(bigDecimal));
        }
    }

    @Override // defpackage.ua5
    public void s1(char[] cArr, int i, int i2) throws IOException {
        E1("write a string");
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr2 = this.t;
        int i3 = this.v;
        this.v = i3 + 1;
        cArr2[i3] = this.s;
        m2(cArr, i, i2);
        if (this.v >= this.w) {
            K1();
        }
        char[] cArr3 = this.t;
        int i4 = this.v;
        this.v = i4 + 1;
        cArr3[i4] = this.s;
    }

    @Override // defpackage.ua5
    public void x0(BigInteger bigInteger) throws IOException {
        E1("write a number");
        if (bigInteger == null) {
            c2();
        } else if (this.g) {
            h2(bigInteger.toString());
        } else {
            N0(bigInteger.toString());
        }
    }

    @Override // defpackage.ua5
    public void z0(short s) throws IOException {
        E1("write a number");
        if (this.g) {
            i2(s);
            return;
        }
        if (this.v + 6 >= this.w) {
            K1();
        }
        this.v = y37.j(s, this.t, this.v);
    }
}
