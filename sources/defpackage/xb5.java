package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: JsonReader.java */
/* renamed from: xb5  reason: default package */
/* loaded from: classes.dex */
public abstract class xb5 implements Closeable {
    private static final String[] g = new String[128];
    int a;
    int[] b = new int[32];
    String[] c = new String[32];
    int[] d = new int[32];
    boolean e;
    boolean f;

    /* compiled from: JsonReader.java */
    /* renamed from: xb5$a */
    /* loaded from: classes.dex */
    public static final class a {
        final String[] a;
        final zb7 b;

        private a(String[] strArr, zb7 zb7Var) {
            this.a = strArr;
            this.b = zb7Var;
        }

        public static a a(String... strArr) {
            try {
                lk0[] lk0VarArr = new lk0[strArr.length];
                yg0 yg0Var = new yg0();
                for (int i = 0; i < strArr.length; i++) {
                    xb5.E(yg0Var, strArr[i]);
                    yg0Var.readByte();
                    lk0VarArr[i] = yg0Var.v1();
                }
                return new a((String[]) strArr.clone(), zb7.P(lk0VarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* renamed from: xb5$b */
    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(defpackage.eh0 r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = defpackage.xb5.g
            r1 = 34
            r7.V0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.k0(r8, r4, r3)
        L2e:
            r7.a0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.k0(r8, r4, r2)
        L3b:
            r7.V0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb5.E(eh0, java.lang.String):void");
    }

    public static xb5 q(fh0 fh0Var) {
        return new vc5(fh0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qa5 H(String str) throws qa5 {
        throw new qa5(str + " at path " + getPath());
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void e() throws IOException;

    public final String getPath() {
        return cc5.a(this.a, this.b, this.c, this.d);
    }

    public abstract void i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract boolean k() throws IOException;

    public abstract double l() throws IOException;

    public abstract int m() throws IOException;

    public abstract String n() throws IOException;

    public abstract String o() throws IOException;

    public abstract b r() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.c;
                this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.d;
                this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new ka5("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int u(a aVar) throws IOException;

    public abstract void x() throws IOException;

    public abstract void y() throws IOException;
}
