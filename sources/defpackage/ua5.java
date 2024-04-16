package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import defpackage.c9c;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: JsonGenerator.java */
/* renamed from: ua5  reason: default package */
/* loaded from: classes2.dex */
public abstract class ua5 implements Closeable, Flushable {
    protected static final m85<yya> b;
    protected static final m85<yya> c;
    protected static final m85<yya> d;
    protected jj8 a;

    /* compiled from: JsonGenerator.java */
    /* renamed from: ua5$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c9c.a.values().length];
            a = iArr;
            try {
                iArr[c9c.a.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c9c.a.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c9c.a.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c9c.a.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c9c.a.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: JsonGenerator.java */
    /* renamed from: ua5$b */
    /* loaded from: classes2.dex */
    public enum b {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean a;
        private final int b = 1 << ordinal();

        b(boolean z) {
            this.a = z;
        }

        public static int a() {
            b[] values;
            int i = 0;
            for (b bVar : values()) {
                if (bVar.i()) {
                    i |= bVar.o();
                }
            }
            return i;
        }

        public boolean i() {
            return this.a;
        }

        public boolean k(int i) {
            if ((i & this.b) != 0) {
                return true;
            }
            return false;
        }

        public int o() {
            return this.b;
        }
    }

    static {
        m85<yya> a2 = m85.a(yya.values());
        b = a2;
        c = a2.b(yya.CAN_WRITE_FORMATTED_NUMBERS);
        d = a2.b(yya.CAN_WRITE_BINARY_NATIVELY);
    }

    public ua5 E(jj8 jj8Var) {
        this.a = jj8Var;
        return this;
    }

    public void E0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void F0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void H(double[] dArr, int i, int i2) throws IOException {
        if (dArr != null) {
            c(dArr.length, i, i2);
            f1(dArr, i2);
            int i3 = i2 + i;
            while (i < i3) {
                m0(dArr[i]);
                i++;
            }
            W();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void K(int[] iArr, int i, int i2) throws IOException {
        if (iArr != null) {
            c(iArr.length, i, i2);
            f1(iArr, i2);
            int i3 = i2 + i;
            while (i < i3) {
                o0(iArr[i]);
                i++;
            }
            W();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public abstract void K0(char c2) throws IOException;

    public void L(long[] jArr, int i, int i2) throws IOException {
        if (jArr != null) {
            c(jArr.length, i, i2);
            f1(jArr, i2);
            int i3 = i2 + i;
            while (i < i3) {
                p0(jArr[i]);
                i++;
            }
            W();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public abstract int M(v60 v60Var, InputStream inputStream, int i) throws IOException;

    public void M0(mca mcaVar) throws IOException {
        N0(mcaVar.getValue());
    }

    public int N(InputStream inputStream, int i) throws IOException {
        return M(w60.a(), inputStream, i);
    }

    public abstract void N0(String str) throws IOException;

    public abstract void O0(char[] cArr, int i, int i2) throws IOException;

    public abstract void P(v60 v60Var, byte[] bArr, int i, int i2) throws IOException;

    public void Q(byte[] bArr) throws IOException {
        P(w60.a(), bArr, 0, bArr.length);
    }

    public void Q0(mca mcaVar) throws IOException {
        S0(mcaVar.getValue());
    }

    public void S(byte[] bArr, int i, int i2) throws IOException {
        P(w60.a(), bArr, i, i2);
    }

    public abstract void S0(String str) throws IOException;

    public abstract void T(boolean z) throws IOException;

    public abstract void W() throws IOException;

    public abstract void Y0() throws IOException;

    @Deprecated
    public void Z0(int i) throws IOException {
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        byb.a();
    }

    public abstract void b0() throws IOException;

    protected final void c(int i, int i2, int i3) {
        if (i2 >= 0 && i2 + i3 <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public boolean e() {
        return true;
    }

    public void e0(long j) throws IOException {
        j0(Long.toString(j));
    }

    public void e1(Object obj) throws IOException {
        Y0();
        u(obj);
    }

    public abstract void f0(mca mcaVar) throws IOException;

    public void f1(Object obj, int i) throws IOException {
        Z0(i);
        u(obj);
    }

    public abstract void flush() throws IOException;

    public abstract void g1() throws IOException;

    public boolean i() {
        return false;
    }

    public void i1(Object obj) throws IOException {
        g1();
        u(obj);
    }

    public boolean j() {
        return false;
    }

    public abstract void j0(String str) throws IOException;

    public void j1(Object obj, int i) throws IOException {
        g1();
        u(obj);
    }

    public boolean k() {
        return false;
    }

    public abstract ua5 l(b bVar);

    public abstract void l0() throws IOException;

    public abstract int m();

    public abstract void m0(double d2) throws IOException;

    public abstract jc5 n();

    public abstract void n0(float f) throws IOException;

    public jj8 o() {
        return this.a;
    }

    public abstract void o0(int i) throws IOException;

    public abstract void o1(mca mcaVar) throws IOException;

    public abstract void p0(long j) throws IOException;

    public abstract boolean q(b bVar);

    public abstract void q0(String str) throws IOException;

    public abstract void q1(String str) throws IOException;

    public abstract void r0(BigDecimal bigDecimal) throws IOException;

    public ua5 s(int i, int i2) {
        return x((i & i2) | (m() & (~i2)));
    }

    public abstract void s1(char[] cArr, int i, int i2) throws IOException;

    public void t1(String str, String str2) throws IOException {
        j0(str);
        q1(str2);
    }

    public void u(Object obj) {
        jc5 n = n();
        if (n != null) {
            n.h(obj);
        }
    }

    public void w1(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    @Deprecated
    public abstract ua5 x(int i);

    public abstract void x0(BigInteger bigInteger) throws IOException;

    public c9c x1(c9c c9cVar) throws IOException {
        String valueOf;
        Object obj = c9cVar.c;
        nc5 nc5Var = c9cVar.f;
        if (k()) {
            c9cVar.g = false;
            w1(obj);
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else {
                valueOf = String.valueOf(obj);
            }
            c9cVar.g = true;
            c9c.a aVar = c9cVar.e;
            if (nc5Var != nc5.START_OBJECT && aVar.a()) {
                aVar = c9c.a.WRAPPER_ARRAY;
                c9cVar.e = aVar;
            }
            int i = a.a[aVar.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Y0();
                        q1(valueOf);
                    } else {
                        g1();
                        j0(valueOf);
                    }
                } else {
                    i1(c9cVar.a);
                    t1(c9cVar.d, valueOf);
                    return c9cVar;
                }
            }
        }
        if (nc5Var == nc5.START_OBJECT) {
            i1(c9cVar.a);
        } else if (nc5Var == nc5.START_ARRAY) {
            Y0();
        }
        return c9cVar;
    }

    public abstract ua5 y(int i);

    public c9c y1(c9c c9cVar) throws IOException {
        String valueOf;
        nc5 nc5Var = c9cVar.f;
        if (nc5Var == nc5.START_OBJECT) {
            b0();
        } else if (nc5Var == nc5.START_ARRAY) {
            W();
        }
        if (c9cVar.g) {
            int i = a.a[c9cVar.e.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 5) {
                        b0();
                    } else {
                        W();
                    }
                }
            } else {
                Object obj = c9cVar.c;
                if (obj instanceof String) {
                    valueOf = (String) obj;
                } else {
                    valueOf = String.valueOf(obj);
                }
                t1(c9cVar.d, valueOf);
            }
        }
        return c9cVar;
    }

    public void z0(short s) throws IOException {
        o0(s);
    }

    public void I0(String str) throws IOException {
    }

    public ua5 r(int i, int i2) {
        return this;
    }
}
