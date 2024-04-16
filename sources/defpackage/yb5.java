package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.gson.stream.MalformedJsonException;
import defpackage.tmb;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* compiled from: JsonReader.java */
/* renamed from: yb5  reason: default package */
/* loaded from: classes2.dex */
public class yb5 implements Closeable {
    private final Reader a;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private String[] n;
    private int[] o;
    private boolean b = false;
    private final char[] c = new char[1024];
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    int h = 0;
    private int m = 1;

    /* compiled from: JsonReader.java */
    /* renamed from: yb5$a */
    /* loaded from: classes2.dex */
    class a extends zb5 {
        a() {
        }

        @Override // defpackage.zb5
        public void a(yb5 yb5Var) throws IOException {
            if (yb5Var instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) yb5Var).r0();
                return;
            }
            int i = yb5Var.h;
            if (i == 0) {
                i = yb5Var.i();
            }
            if (i == 13) {
                yb5Var.h = 9;
            } else if (i == 12) {
                yb5Var.h = 8;
            } else if (i == 14) {
                yb5Var.h = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + yb5Var.N() + yb5Var.q());
            }
        }
    }

    static {
        zb5.a = new a();
    }

    public yb5(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        if (reader != null) {
            this.a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private int E(boolean z) throws IOException {
        char[] cArr = this.c;
        int i = this.d;
        int i2 = this.e;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!l(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + q());
                }
                i = this.d;
                i2 = this.e;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i;
                        boolean l = l(2);
                        this.d++;
                        if (!l) {
                            return c;
                        }
                    }
                    c();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return c;
                        }
                        this.d = i4 + 1;
                        f0();
                        i = this.d;
                        i2 = this.e;
                    } else {
                        this.d = i4 + 1;
                        if (e0("*/")) {
                            i = this.d + 2;
                            i2 = this.e;
                        } else {
                            throw m0("Unterminated comment");
                        }
                    }
                } else if (c == '#') {
                    this.d = i3;
                    c();
                    f0();
                    i = this.d;
                    i2 = this.e;
                } else {
                    this.d = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String K(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.c
            r1 = 0
        L3:
            int r2 = r9.d
            int r3 = r9.e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.T()
            r1.append(r2)
            int r2 = r9.d
            int r3 = r9.e
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f
            int r2 = r2 + r6
            r9.f = r2
            r9.g = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.d = r2
            boolean r2 = r9.l(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb5.K(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String M() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.d
            int r4 = r3 + r2
            int r5 = r6.e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.c()
            goto L5c
        L4e:
            char[] r3 = r6.c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.l(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.c
            int r4 = r6.d
            r0.append(r3, r4, r2)
            int r3 = r6.d
            int r3 = r3 + r2
            r6.d = r3
            r2 = 1
            boolean r2 = r6.l(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.c
            int r3 = r6.d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.c
            int r3 = r6.d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.d
            int r2 = r2 + r1
            r6.d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb5.M():java.lang.String");
    }

    private int P() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.c[this.d];
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
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
        for (int i2 = 1; i2 < length; i2++) {
            if (this.d + i2 >= this.e && !l(i2 + 1)) {
                return 0;
            }
            char c2 = this.c[this.d + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.d + length < this.e || l(length + 1)) && o(this.c[this.d + length])) {
            return 0;
        }
        this.d += length;
        this.h = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (o(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ad, code lost:
        r18.i = r11;
        r18.d += r8;
        r18.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c4, code lost:
        r18.j = r8;
        r18.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ca, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cb, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Q() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb5.Q():int");
    }

    private void S(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private char T() throws IOException {
        int i;
        if (this.d == this.e && !l(1)) {
            throw m0("Unterminated escape sequence");
        }
        char[] cArr = this.c;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i2 + 5 > this.e && !l(4)) {
                                        throw m0("Unterminated escape sequence");
                                    }
                                    int i4 = this.d;
                                    int i5 = i4 + 4;
                                    char c2 = 0;
                                    while (i4 < i5) {
                                        char c3 = this.c[i4];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i = c3 - '0';
                                        } else if (c3 >= 'a' && c3 <= 'f') {
                                            i = c3 - 'W';
                                        } else if (c3 >= 'A' && c3 <= 'F') {
                                            i = c3 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u" + new String(this.c, this.d, 4));
                                        }
                                        c2 = (char) (c4 + i);
                                        i4++;
                                    }
                                    this.d += 4;
                                    return c2;
                                }
                                throw m0("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f++;
            this.g = i3;
        }
        return c;
    }

    private void b0(char c) throws IOException {
        char[] cArr = this.c;
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                } else if (c2 == '\\') {
                    this.d = i3;
                    T();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (l(1));
        throw m0("Unterminated string");
    }

    private void c() throws IOException {
        if (this.b) {
            return;
        }
        throw m0("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void e() throws IOException {
        E(true);
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        if (i + 4 > this.e && !l(5)) {
            return;
        }
        char[] cArr = this.c;
        if (cArr[i2] == ')' && cArr[i] == ']' && cArr[i + 1] == '}' && cArr[i + 2] == '\'' && cArr[i + 3] == '\n') {
            this.d += 5;
        }
    }

    private boolean e0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.d + length > this.e && !l(length)) {
                return false;
            }
            char[] cArr = this.c;
            int i = this.d;
            if (cArr[i] == '\n') {
                this.f++;
                this.g = i + 1;
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.c[this.d + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.d++;
        }
    }

    private void f0() throws IOException {
        char c;
        do {
            if (this.d < this.e || l(1)) {
                char[] cArr = this.c;
                int i = this.d;
                int i2 = i + 1;
                this.d = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f++;
                    this.g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.d
            int r2 = r1 + r0
            int r3 = r4.e
            if (r2 >= r3) goto L51
            char[] r2 = r4.c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.c()
        L4b:
            int r1 = r4.d
            int r1 = r1 + r0
            r4.d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.d = r1
            r0 = 1
            boolean r0 = r4.l(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb5.j0():void");
    }

    private boolean l(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.c;
        int i4 = this.g;
        int i5 = this.d;
        this.g = i4 - i5;
        int i6 = this.e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            Reader reader = this.a;
            int i8 = this.e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.e + read;
            this.e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private IOException m0(String str) throws IOException {
        throw new MalformedJsonException(str + q());
    }

    private boolean o(char c) throws IOException {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
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
            c();
            return false;
        }
        return false;
    }

    public void H() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 7) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + N() + q());
    }

    public String L() throws IOException {
        String str;
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 10) {
            str = M();
        } else if (i == 8) {
            str = K(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 9) {
            str = K(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else if (i == 16) {
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            throw new IllegalStateException("Expected a string but was " + N() + q());
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public mc5 N() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        switch (i) {
            case 1:
                return mc5.BEGIN_OBJECT;
            case 2:
                return mc5.END_OBJECT;
            case 3:
                return mc5.BEGIN_ARRAY;
            case 4:
                return mc5.END_ARRAY;
            case 5:
            case 6:
                return mc5.BOOLEAN;
            case 7:
                return mc5.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return mc5.STRING;
            case 12:
            case 13:
            case 14:
                return mc5.NAME;
            case 15:
            case 16:
                return mc5.NUMBER;
            case 17:
                return mc5.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void W(boolean z) {
        this.b = z;
    }

    public void a() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 3) {
            S(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + N() + q());
    }

    public void b() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 1) {
            S(3);
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + N() + q());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append(CoreConstants.DOT);
                    String str = this.n[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(this.o[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    int i() throws IOException {
        int E;
        int[] iArr = this.l;
        int i = this.m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int E2 = E(true);
            if (E2 != 44) {
                if (E2 != 59) {
                    if (E2 == 93) {
                        this.h = 4;
                        return 4;
                    }
                    throw m0("Unterminated array");
                }
                c();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int E3 = E(true);
                if (E3 != 58) {
                    if (E3 == 61) {
                        c();
                        if (this.d < this.e || l(1)) {
                            char[] cArr = this.c;
                            int i3 = this.d;
                            if (cArr[i3] == '>') {
                                this.d = i3 + 1;
                            }
                        }
                    } else {
                        throw m0("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.b) {
                    e();
                }
                this.l[this.m - 1] = 7;
            } else if (i2 == 7) {
                if (E(false) == -1) {
                    this.h = 17;
                    return 17;
                }
                c();
                this.d--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5 && (E = E(true)) != 44) {
                if (E != 59) {
                    if (E == 125) {
                        this.h = 2;
                        return 2;
                    }
                    throw m0("Unterminated object");
                }
                c();
            }
            int E4 = E(true);
            if (E4 != 34) {
                if (E4 != 39) {
                    if (E4 != 125) {
                        c();
                        this.d--;
                        if (o((char) E4)) {
                            this.h = 14;
                            return 14;
                        }
                        throw m0("Expected name");
                    } else if (i2 != 5) {
                        this.h = 2;
                        return 2;
                    } else {
                        throw m0("Expected name");
                    }
                }
                c();
                this.h = 12;
                return 12;
            }
            this.h = 13;
            return 13;
        }
        int E5 = E(true);
        if (E5 != 34) {
            if (E5 != 39) {
                if (E5 != 44 && E5 != 59) {
                    if (E5 != 91) {
                        if (E5 != 93) {
                            if (E5 != 123) {
                                this.d--;
                                int P = P();
                                if (P != 0) {
                                    return P;
                                }
                                int Q = Q();
                                if (Q != 0) {
                                    return Q;
                                }
                                if (o(this.c[this.d])) {
                                    c();
                                    this.h = 10;
                                    return 10;
                                }
                                throw m0("Expected value");
                            }
                            this.h = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.h = 4;
                            return 4;
                        }
                    } else {
                        this.h = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m0("Unexpected value");
                }
                c();
                this.d--;
                this.h = 7;
                return 7;
            }
            c();
            this.h = 8;
            return 8;
        }
        this.h = 9;
        return 9;
    }

    public void j() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 4) {
            int i2 = this.m;
            this.m = i2 - 1;
            int[] iArr = this.o;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + N() + q());
    }

    public void k() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 2) {
            int i2 = this.m;
            int i3 = i2 - 1;
            this.m = i3;
            this.n[i3] = null;
            int[] iArr = this.o;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + N() + q());
    }

    public void l0() throws IOException {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = i();
            }
            if (i2 == 3) {
                S(1);
            } else if (i2 == 1) {
                S(3);
            } else {
                if (i2 == 4) {
                    this.m--;
                } else if (i2 == 2) {
                    this.m--;
                } else {
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 8 && i2 != 12) {
                            if (i2 != 9 && i2 != 13) {
                                if (i2 == 16) {
                                    this.d += this.j;
                                }
                            } else {
                                b0(CoreConstants.DOUBLE_QUOTE_CHAR);
                            }
                        } else {
                            b0(CoreConstants.SINGLE_QUOTE_CHAR);
                        }
                    } else {
                        j0();
                    }
                    this.h = 0;
                }
                i--;
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.o;
        int i3 = this.m;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.n[i3 - 1] = "null";
    }

    public boolean m() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i != 2 && i != 4) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        return this.b;
    }

    String q() {
        return " at line " + (this.f + 1) + " column " + ((this.d - this.g) + 1) + " path " + getPath();
    }

    public boolean r() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.h = 0;
            int[] iArr2 = this.o;
            int i3 = this.m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + N() + q());
        }
    }

    public double s() throws IOException {
        char c;
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.k = M();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + N() + q());
            }
        } else {
            if (i == 8) {
                c = CoreConstants.SINGLE_QUOTE_CHAR;
            } else {
                c = CoreConstants.DOUBLE_QUOTE_CHAR;
            }
            this.k = K(c);
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (!this.b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + q());
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public String toString() {
        return getClass().getSimpleName() + q();
    }

    public int u() throws IOException {
        char c;
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.o;
                int i3 = this.m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.i + q());
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + N() + q());
        } else {
            if (i == 10) {
                this.k = M();
            } else {
                if (i == 8) {
                    c = CoreConstants.SINGLE_QUOTE_CHAR;
                } else {
                    c = CoreConstants.DOUBLE_QUOTE_CHAR;
                }
                this.k = K(c);
            }
            try {
                int parseInt = Integer.parseInt(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.o;
            int i6 = this.m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.k + q());
    }

    public long x() throws IOException {
        char c;
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + N() + q());
        } else {
            if (i == 10) {
                this.k = M();
            } else {
                if (i == 8) {
                    c = CoreConstants.SINGLE_QUOTE_CHAR;
                } else {
                    c = CoreConstants.DOUBLE_QUOTE_CHAR;
                }
                this.k = K(c);
            }
            try {
                long parseLong = Long.parseLong(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i3 = this.m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.o;
            int i4 = this.m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.k + q());
    }

    public String y() throws IOException {
        String K;
        int i = this.h;
        if (i == 0) {
            i = i();
        }
        if (i == 14) {
            K = M();
        } else if (i == 12) {
            K = K(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 13) {
            K = K(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else {
            throw new IllegalStateException("Expected a name but was " + N() + q());
        }
        this.h = 0;
        this.n[this.m - 1] = K;
        return K;
    }
}
