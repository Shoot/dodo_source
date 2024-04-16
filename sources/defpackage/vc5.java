package defpackage;

import ch.qos.logback.core.joran.action.ActionConst;
import defpackage.tmb;
import defpackage.xb5;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: JsonUtf8Reader.java */
/* renamed from: vc5  reason: default package */
/* loaded from: classes.dex */
final class vc5 extends xb5 {
    private static final lk0 n = lk0.o("'\\");
    private static final lk0 o = lk0.o("\"\\");
    private static final lk0 p = lk0.o("{}[]:, \n\t\r\f/\\;#=");
    private static final lk0 q = lk0.o("\n\r");
    private static final lk0 r = lk0.o("*/");
    private final fh0 h;
    private final yg0 i;
    private int j = 0;
    private long k;
    private int l;
    private String m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vc5(fh0 fh0Var) {
        if (fh0Var != null) {
            this.h = fh0Var;
            this.i = fh0Var.D();
            s(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void K() throws IOException {
        if (this.e) {
            return;
        }
        throw H("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private int L() throws IOException {
        int[] iArr = this.b;
        int i = this.a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int P = P(true);
            this.i.readByte();
            if (P != 44) {
                if (P != 59) {
                    if (P == 93) {
                        this.j = 4;
                        return 4;
                    }
                    throw H("Unterminated array");
                }
                K();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int P2 = P(true);
                this.i.readByte();
                if (P2 != 58) {
                    if (P2 == 61) {
                        K();
                        if (this.h.w(1L) && this.i.n(0L) == 62) {
                            this.i.readByte();
                        }
                    } else {
                        throw H("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (P(false) == -1) {
                    this.j = 18;
                    return 18;
                }
                K();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int P3 = P(true);
                this.i.readByte();
                if (P3 != 44) {
                    if (P3 != 59) {
                        if (P3 == 125) {
                            this.j = 2;
                            return 2;
                        }
                        throw H("Unterminated object");
                    }
                    K();
                }
            }
            int P4 = P(true);
            if (P4 != 34) {
                if (P4 != 39) {
                    if (P4 != 125) {
                        K();
                        if (N((char) P4)) {
                            this.j = 14;
                            return 14;
                        }
                        throw H("Expected name");
                    } else if (i2 != 5) {
                        this.i.readByte();
                        this.j = 2;
                        return 2;
                    } else {
                        throw H("Expected name");
                    }
                }
                this.i.readByte();
                K();
                this.j = 12;
                return 12;
            }
            this.i.readByte();
            this.j = 13;
            return 13;
        }
        int P5 = P(true);
        if (P5 != 34) {
            if (P5 != 39) {
                if (P5 != 44 && P5 != 59) {
                    if (P5 != 91) {
                        if (P5 != 93) {
                            if (P5 != 123) {
                                int T = T();
                                if (T != 0) {
                                    return T;
                                }
                                int W = W();
                                if (W != 0) {
                                    return W;
                                }
                                if (N(this.i.n(0L))) {
                                    K();
                                    this.j = 10;
                                    return 10;
                                }
                                throw H("Expected value");
                            }
                            this.i.readByte();
                            this.j = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.i.readByte();
                            this.j = 4;
                            return 4;
                        }
                    } else {
                        this.i.readByte();
                        this.j = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw H("Unexpected value");
                }
                K();
                this.j = 7;
                return 7;
            }
            K();
            this.i.readByte();
            this.j = 8;
            return 8;
        }
        this.i.readByte();
        this.j = 9;
        return 9;
    }

    private int M(String str, xb5.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.j = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean N(int i) throws IOException {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            K();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r2 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r6.h.w(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        K();
        r3 = r6.i.n(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r6.i.readByte();
        r6.i.readByte();
        j0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.i.readByte();
        r6.i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (f0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        throw H("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r2 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        K();
        j0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int P(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            fh0 r2 = r6.h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.w(r4)
            if (r2 == 0) goto L80
            yg0 r2 = r6.i
            long r4 = (long) r1
            byte r2 = r2.n(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            yg0 r3 = r6.i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            fh0 r3 = r6.h
            r4 = 2
            boolean r3 = r3.w(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.K()
            yg0 r3 = r6.i
            r4 = 1
            byte r3 = r3.n(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            yg0 r1 = r6.i
            r1.readByte()
            yg0 r1 = r6.i
            r1.readByte()
            r6.j0()
            goto L1
        L5a:
            yg0 r1 = r6.i
            r1.readByte()
            yg0 r1 = r6.i
            r1.readByte()
            boolean r1 = r6.f0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            qa5 r7 = r6.H(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.K()
            r6.j0()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc5.P(boolean):int");
    }

    private String Q(lk0 lk0Var) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long O1 = this.h.O1(lk0Var);
            if (O1 != -1) {
                if (this.i.n(O1) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.i.G0(O1));
                    this.i.readByte();
                    sb.append(b0());
                } else if (sb == null) {
                    String G0 = this.i.G0(O1);
                    this.i.readByte();
                    return G0;
                } else {
                    sb.append(this.i.G0(O1));
                    this.i.readByte();
                    return sb.toString();
                }
            } else {
                throw H("Unterminated string");
            }
        }
    }

    private String S() throws IOException {
        long O1 = this.h.O1(p);
        if (O1 != -1) {
            return this.i.G0(O1);
        }
        return this.i.L();
    }

    private int T() throws IOException {
        String str;
        String str2;
        int i;
        byte n2 = this.i.n(0L);
        if (n2 != 116 && n2 != 84) {
            if (n2 != 102 && n2 != 70) {
                if (n2 != 110 && n2 != 78) {
                    return 0;
                }
                str = "null";
                str2 = ActionConst.NULL;
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = tmb.h.TRUE_JSON_NAME;
            str2 = "TRUE";
            i = 5;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.h.w(i3)) {
                return 0;
            }
            byte n3 = this.i.n(i2);
            if (n3 != str.charAt(i2) && n3 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.h.w(length + 1) && N(this.i.n(length))) {
            return 0;
        }
        this.i.skip(length);
        this.j = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
        if (N(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r16.k = r8;
        r16.i.skip(r5);
        r16.j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        r16.l = r5;
        r16.j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int W() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc5.W():int");
    }

    private char b0() throws IOException {
        int i;
        if (this.h.w(1L)) {
            byte readByte = this.i.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.e) {
                                        return (char) readByte;
                                    }
                                    throw H("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.h.w(4L)) {
                                    char c = 0;
                                    for (int i2 = 0; i2 < 4; i2++) {
                                        byte n2 = this.i.n(i2);
                                        char c2 = (char) (c << 4);
                                        if (n2 >= 48 && n2 <= 57) {
                                            i = n2 - 48;
                                        } else if (n2 >= 97 && n2 <= 102) {
                                            i = n2 - 87;
                                        } else if (n2 < 65 || n2 > 70) {
                                            throw H("\\u" + this.i.G0(4L));
                                        } else {
                                            i = n2 - 55;
                                        }
                                        c = (char) (c2 + i);
                                    }
                                    this.i.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw H("Unterminated escape sequence");
    }

    private void e0(lk0 lk0Var) throws IOException {
        while (true) {
            long O1 = this.h.O1(lk0Var);
            if (O1 != -1) {
                if (this.i.n(O1) == 92) {
                    this.i.skip(O1 + 1);
                    b0();
                } else {
                    this.i.skip(O1 + 1);
                    return;
                }
            } else {
                throw H("Unterminated string");
            }
        }
    }

    private boolean f0() throws IOException {
        boolean z;
        long P;
        fh0 fh0Var = this.h;
        lk0 lk0Var = r;
        long h0 = fh0Var.h0(lk0Var);
        if (h0 != -1) {
            z = true;
        } else {
            z = false;
        }
        yg0 yg0Var = this.i;
        if (z) {
            P = h0 + lk0Var.n0();
        } else {
            P = yg0Var.P();
        }
        yg0Var.skip(P);
        return z;
    }

    private void j0() throws IOException {
        long P;
        long O1 = this.h.O1(q);
        yg0 yg0Var = this.i;
        if (O1 != -1) {
            P = O1 + 1;
        } else {
            P = yg0Var.P();
        }
        yg0Var.skip(P);
    }

    private void l0() throws IOException {
        long O1 = this.h.O1(p);
        yg0 yg0Var = this.i;
        if (O1 == -1) {
            O1 = yg0Var.P();
        }
        yg0Var.skip(O1);
    }

    @Override // defpackage.xb5
    public void b() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 3) {
            s(1);
            this.d[this.a - 1] = 0;
            this.j = 0;
            return;
        }
        throw new ka5("Expected BEGIN_ARRAY but was " + r() + " at path " + getPath());
    }

    @Override // defpackage.xb5
    public void c() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 1) {
            s(3);
            this.j = 0;
            return;
        }
        throw new ka5("Expected BEGIN_OBJECT but was " + r() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.j = 0;
        this.b[0] = 8;
        this.a = 1;
        this.i.b();
        this.h.close();
    }

    @Override // defpackage.xb5
    public void e() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 4) {
            int i2 = this.a;
            this.a = i2 - 1;
            int[] iArr = this.d;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.j = 0;
            return;
        }
        throw new ka5("Expected END_ARRAY but was " + r() + " at path " + getPath());
    }

    @Override // defpackage.xb5
    public void i() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 2) {
            int i2 = this.a;
            int i3 = i2 - 1;
            this.a = i3;
            this.c[i3] = null;
            int[] iArr = this.d;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.j = 0;
            return;
        }
        throw new ka5("Expected END_OBJECT but was " + r() + " at path " + getPath());
    }

    @Override // defpackage.xb5
    public boolean j() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i != 2 && i != 4 && i != 18) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xb5
    public boolean k() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 5) {
            this.j = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.j = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new ka5("Expected a boolean but was " + r() + " at path " + getPath());
        }
    }

    @Override // defpackage.xb5
    public double l() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 16) {
            this.j = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.k;
        }
        if (i == 17) {
            this.m = this.i.G0(this.l);
        } else if (i == 9) {
            this.m = Q(o);
        } else if (i == 8) {
            this.m = Q(n);
        } else if (i == 10) {
            this.m = S();
        } else if (i != 11) {
            throw new ka5("Expected a double but was " + r() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            if (!this.e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new qa5("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.m = null;
            this.j = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new ka5("Expected a double but was " + this.m + " at path " + getPath());
        }
    }

    @Override // defpackage.xb5
    public int m() throws IOException {
        String Q;
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 16) {
            long j = this.k;
            int i2 = (int) j;
            if (j == i2) {
                this.j = 0;
                int[] iArr = this.d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new ka5("Expected an int but was " + this.k + " at path " + getPath());
        }
        if (i == 17) {
            this.m = this.i.G0(this.l);
        } else if (i != 9 && i != 8) {
            if (i != 11) {
                throw new ka5("Expected an int but was " + r() + " at path " + getPath());
            }
        } else {
            if (i == 9) {
                Q = Q(o);
            } else {
                Q = Q(n);
            }
            this.m = Q;
            try {
                int parseInt = Integer.parseInt(Q);
                this.j = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.m = null;
                this.j = 0;
                int[] iArr3 = this.d;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new ka5("Expected an int but was " + this.m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new ka5("Expected an int but was " + this.m + " at path " + getPath());
        }
    }

    @Override // defpackage.xb5
    public String n() throws IOException {
        String str;
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 14) {
            str = S();
        } else if (i == 13) {
            str = Q(o);
        } else if (i == 12) {
            str = Q(n);
        } else if (i == 15) {
            str = this.m;
        } else {
            throw new ka5("Expected a name but was " + r() + " at path " + getPath());
        }
        this.j = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // defpackage.xb5
    public String o() throws IOException {
        String G0;
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i == 10) {
            G0 = S();
        } else if (i == 9) {
            G0 = Q(o);
        } else if (i == 8) {
            G0 = Q(n);
        } else if (i == 11) {
            G0 = this.m;
            this.m = null;
        } else if (i == 16) {
            G0 = Long.toString(this.k);
        } else if (i == 17) {
            G0 = this.i.G0(this.l);
        } else {
            throw new ka5("Expected a string but was " + r() + " at path " + getPath());
        }
        this.j = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return G0;
    }

    @Override // defpackage.xb5
    public xb5.b r() throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        switch (i) {
            case 1:
                return xb5.b.BEGIN_OBJECT;
            case 2:
                return xb5.b.END_OBJECT;
            case 3:
                return xb5.b.BEGIN_ARRAY;
            case 4:
                return xb5.b.END_ARRAY;
            case 5:
            case 6:
                return xb5.b.BOOLEAN;
            case 7:
                return xb5.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return xb5.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return xb5.b.NAME;
            case 16:
            case 17:
                return xb5.b.NUMBER;
            case 18:
                return xb5.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonReader(" + this.h + ")";
    }

    @Override // defpackage.xb5
    public int u(xb5.a aVar) throws IOException {
        int i = this.j;
        if (i == 0) {
            i = L();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return M(this.m, aVar);
        }
        int W0 = this.h.W0(aVar.b);
        if (W0 != -1) {
            this.j = 0;
            this.c[this.a - 1] = aVar.a[W0];
            return W0;
        }
        String str = this.c[this.a - 1];
        String n2 = n();
        int M = M(n2, aVar);
        if (M == -1) {
            this.j = 15;
            this.m = n2;
            this.c[this.a - 1] = str;
        }
        return M;
    }

    @Override // defpackage.xb5
    public void x() throws IOException {
        if (!this.f) {
            int i = this.j;
            if (i == 0) {
                i = L();
            }
            if (i == 14) {
                l0();
            } else if (i == 13) {
                e0(o);
            } else if (i == 12) {
                e0(n);
            } else if (i != 15) {
                throw new ka5("Expected a name but was " + r() + " at path " + getPath());
            }
            this.j = 0;
            this.c[this.a - 1] = "null";
            return;
        }
        throw new ka5("Cannot skip unexpected " + r() + " at " + getPath());
    }

    @Override // defpackage.xb5
    public void y() throws IOException {
        if (!this.f) {
            int i = 0;
            do {
                int i2 = this.j;
                if (i2 == 0) {
                    i2 = L();
                }
                if (i2 == 3) {
                    s(1);
                } else if (i2 == 1) {
                    s(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.a--;
                        } else {
                            throw new ka5("Expected a value but was " + r() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.a--;
                        } else {
                            throw new ka5("Expected a value but was " + r() + " at path " + getPath());
                        }
                    } else if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    this.i.skip(this.l);
                                } else if (i2 == 18) {
                                    throw new ka5("Expected a value but was " + r() + " at path " + getPath());
                                }
                            } else {
                                e0(n);
                            }
                        } else {
                            e0(o);
                        }
                    } else {
                        l0();
                    }
                    this.j = 0;
                }
                i++;
                this.j = 0;
            } while (i != 0);
            int[] iArr = this.d;
            int i3 = this.a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.c[i3 - 1] = "null";
            return;
        }
        throw new ka5("Cannot skip unexpected " + r() + " at " + getPath());
    }
}
