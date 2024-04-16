package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;
/* renamed from: fec  reason: default package */
/* loaded from: classes3.dex */
public class fec {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public fec(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.b) {
            char[] cArr = this.g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i2 = c - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.a);
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i3 = c2 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.a);
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        return new java.lang.String(r1, r2, r8.f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b() {
        /*
            r8 = this;
            int r0 = r8.c
            r8.d = r0
            r8.e = r0
        L6:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.e
            int r4 = r3 + 1
            r8.e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.c = r0
            goto L6
        L3e:
            int r0 = r8.e
            int r2 = r0 + 1
            r8.e = r2
            char r2 = r8.c()
            r1[r0] = r2
            int r0 = r8.c
            int r0 = r0 + 1
            r8.c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.d
            int r3 = r8.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.e
            r8.f = r2
            int r0 = r0 + 1
            r8.c = r0
            int r0 = r2 + 1
            r8.e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 >= r1) goto L83
            char[] r2 = r8.g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.e
            int r7 = r1 + 1
            r8.e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fec.b():java.lang.String");
    }

    private char c() {
        int i = this.c + 1;
        this.c = i;
        if (i != this.b) {
            char c = this.g[i];
            if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
                return c;
            }
            switch (c) {
                case '*':
                case '+':
                case ',':
                    return c;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c;
                        default:
                            return e();
                    }
            }
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    private char e() {
        int i;
        int i2;
        int a = a(this.c);
        this.c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        if (a <= 223) {
            i = a & 31;
            i2 = 1;
        } else if (a <= 239) {
            i = a & 15;
            i2 = 2;
        } else {
            i = a & 7;
            i2 = 3;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i5 == this.b || this.g[i5] != '\\') {
                return '?';
            }
            int i6 = i4 + 2;
            this.c = i6;
            int a2 = a(i6);
            this.c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (a2 & 63);
        }
        return (char) i;
    }

    private String f() {
        int i;
        char[] cArr;
        char c;
        int i2 = this.c;
        if (i2 + 4 < this.b) {
            this.d = i2;
            this.c = i2 + 1;
            while (true) {
                i = this.c;
                if (i == this.b || (c = (cArr = this.g)[i]) == '+' || c == ',' || c == ';') {
                    break;
                } else if (c == ' ') {
                    this.e = i;
                    this.c = i + 1;
                    while (true) {
                        int i3 = this.c;
                        if (i3 >= this.b || this.g[i3] != ' ') {
                            break;
                        }
                        this.c = i3 + 1;
                    }
                } else {
                    if (c >= 'A' && c <= 'F') {
                        cArr[i] = (char) (c + ' ');
                    }
                    this.c = i + 1;
                }
            }
            this.e = i;
            int i4 = this.e;
            int i5 = this.d;
            int i6 = i4 - i5;
            if (i6 >= 5 && (i6 & 1) != 0) {
                int i7 = i6 / 2;
                byte[] bArr = new byte[i7];
                int i8 = i5 + 1;
                for (int i9 = 0; i9 < i7; i9++) {
                    bArr[i9] = (byte) a(i8);
                    i8 += 2;
                }
                return new String(this.g, this.d, i6);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    private String g() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        int i6;
        char c4;
        char c5;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            i4 = this.b;
            if (i3 >= i4 || (c5 = this.g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        if (i3 < i4) {
            this.e = i3;
            if (this.g[i3] == ' ') {
                while (true) {
                    i5 = this.c;
                    i6 = this.b;
                    if (i5 >= i6 || (c4 = this.g[i5]) == '=' || c4 != ' ') {
                        break;
                    }
                    this.c = i5 + 1;
                }
                if (this.g[i5] != '=' || i5 == i6) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.a);
                }
            }
            this.c++;
            while (true) {
                int i7 = this.c;
                if (i7 >= this.b || this.g[i7] != ' ') {
                    break;
                }
                this.c = i7 + 1;
            }
            int i8 = this.e;
            int i9 = this.d;
            if (i8 - i9 > 4) {
                char[] cArr = this.g;
                if (cArr[i9 + 3] == '.' && (((c = cArr[i9]) == 'O' || c == 'o') && (((c2 = cArr[i9 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i9 + 2]) == 'D' || c3 == 'd')))) {
                    this.d = i9 + 4;
                }
            }
            char[] cArr2 = this.g;
            int i10 = this.d;
            return new String(cArr2, i10, i8 - i10);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    private String h() {
        int i = this.c + 1;
        this.c = i;
        this.d = i;
        this.e = i;
        while (true) {
            int i2 = this.c;
            if (i2 != this.b) {
                char[] cArr = this.g;
                char c = cArr[i2];
                if (c == '\"') {
                    this.c = i2 + 1;
                    while (true) {
                        int i3 = this.c;
                        if (i3 >= this.b || this.g[i3] != ' ') {
                            break;
                        }
                        this.c = i3 + 1;
                    }
                    char[] cArr2 = this.g;
                    int i4 = this.d;
                    return new String(cArr2, i4, this.e - i4);
                }
                if (c == '\\') {
                    cArr[this.e] = c();
                } else {
                    cArr[this.e] = c;
                }
                this.c++;
                this.e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
        }
    }

    public List<String> d(String str) {
        String h;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.a.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String g = g();
        if (g == null) {
            return emptyList;
        }
        do {
            int i = this.c;
            if (i < this.b) {
                char c = this.g[i];
                if (c != '\"') {
                    if (c != '#') {
                        if (c != '+' && c != ',' && c != ';') {
                            h = b();
                        } else {
                            h = "";
                        }
                    } else {
                        h = f();
                    }
                } else {
                    h = h();
                }
                if (str.equalsIgnoreCase(g)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(h);
                }
                int i2 = this.c;
                if (i2 < this.b) {
                    char c2 = this.g[i2];
                    if (c2 != ',' && c2 != ';' && c2 != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.a);
                    }
                    this.c = i2 + 1;
                    g = g();
                }
            }
            return emptyList;
        } while (g != null);
        throw new IllegalStateException("Malformed DN: " + this.a);
    }
}
