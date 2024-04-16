package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.tmb;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
/* compiled from: JsonWriter.java */
/* renamed from: dd5  reason: default package */
/* loaded from: classes2.dex */
public class dd5 implements Closeable, Flushable {
    private static final String[] j = new String[128];
    private static final String[] k;
    private final Writer a;
    private int[] b = new int[32];
    private int c = 0;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;

    static {
        for (int i = 0; i <= 31; i++) {
            j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public dd5(Writer writer) {
        y(6);
        this.e = ":";
        this.i = true;
        if (writer != null) {
            this.a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void E(int i) {
        this.b[this.c - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void N(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.dd5.k
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.dd5.j
        L9:
            java.io.Writer r1 = r8.a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd5.N(java.lang.String):void");
    }

    private void a() throws IOException {
        int x = x();
        if (x == 5) {
            this.a.write(44);
        } else if (x != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        r();
        E(4);
    }

    private void b() throws IOException {
        int x = x();
        if (x != 1) {
            if (x != 2) {
                if (x != 4) {
                    if (x != 6) {
                        if (x == 7) {
                            if (!this.f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    E(7);
                    return;
                }
                this.a.append((CharSequence) this.e);
                E(5);
                return;
            }
            this.a.append(CoreConstants.COMMA_CHAR);
            r();
            return;
        }
        E(2);
        r();
    }

    private void b0() throws IOException {
        if (this.h != null) {
            a();
            N(this.h);
            this.h = null;
        }
    }

    private dd5 i(int i, int i2, char c) throws IOException {
        int x = x();
        if (x != i2 && x != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.h == null) {
            this.c--;
            if (x == i2) {
                r();
            }
            this.a.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.h);
    }

    private void r() throws IOException {
        if (this.d == null) {
            return;
        }
        this.a.write(10);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            this.a.write(this.d);
        }
    }

    private dd5 u(int i, char c) throws IOException {
        b();
        y(i);
        this.a.write(c);
        return this;
    }

    private int x() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void y(int i) {
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = i;
    }

    public final void H(boolean z) {
        this.g = z;
    }

    public final void K(String str) {
        if (str.length() == 0) {
            this.d = null;
            this.e = ":";
            return;
        }
        this.d = str;
        this.e = ": ";
    }

    public final void L(boolean z) {
        this.f = z;
    }

    public final void M(boolean z) {
        this.i = z;
    }

    public dd5 P(long j2) throws IOException {
        b0();
        b();
        this.a.write(Long.toString(j2));
        return this;
    }

    public dd5 Q(Boolean bool) throws IOException {
        String str;
        if (bool == null) {
            return s();
        }
        b0();
        b();
        Writer writer = this.a;
        if (bool.booleanValue()) {
            str = tmb.h.TRUE_JSON_NAME;
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public dd5 S(Number number) throws IOException {
        if (number == null) {
            return s();
        }
        b0();
        String obj = number.toString();
        if (!this.f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        b();
        this.a.append((CharSequence) obj);
        return this;
    }

    public dd5 T(String str) throws IOException {
        if (str == null) {
            return s();
        }
        b0();
        b();
        N(str);
        return this;
    }

    public dd5 W(boolean z) throws IOException {
        String str;
        b0();
        b();
        Writer writer = this.a;
        if (z) {
            str = tmb.h.TRUE_JSON_NAME;
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public dd5 c() throws IOException {
        b0();
        return u(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i = this.c;
        if (i <= 1 && (i != 1 || this.b[i - 1] == 7)) {
            this.c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public dd5 e() throws IOException {
        b0();
        return u(3, CoreConstants.CURLY_LEFT);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c != 0) {
            this.a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public dd5 j() throws IOException {
        return i(1, 2, ']');
    }

    public dd5 k() throws IOException {
        return i(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public final boolean l() {
        return this.i;
    }

    public final boolean m() {
        return this.g;
    }

    public boolean n() {
        return this.f;
    }

    public dd5 o(String str) throws IOException {
        if (str == null) {
            return s();
        }
        b0();
        b();
        this.a.append((CharSequence) str);
        return this;
    }

    public dd5 q(String str) throws IOException {
        if (str != null) {
            if (this.h == null) {
                if (this.c != 0) {
                    this.h = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public dd5 s() throws IOException {
        if (this.h != null) {
            if (this.i) {
                b0();
            } else {
                this.h = null;
                return this;
            }
        }
        b();
        this.a.write("null");
        return this;
    }
}
