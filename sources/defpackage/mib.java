package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.ua5;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: TokenBuffer.java */
/* renamed from: mib  reason: default package */
/* loaded from: classes2.dex */
public class mib extends ua5 {
    protected static final int p = ua5.b.a();
    protected q47 e;
    protected jc5 f;
    protected int g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected Object l;
    protected Object m;
    protected boolean n;
    protected cd5 o;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: TokenBuffer.java */
    /* renamed from: mib$a */
    /* loaded from: classes2.dex */
    public static final class a extends hr7 {
        protected q47 n;
        protected final boolean o;
        protected final boolean p;
        protected final boolean q;
        protected int r;
        protected nib s;
        protected boolean t;
        protected fb5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, q47 q47Var, boolean z, boolean z2, jc5 jc5Var) {
            super(0);
            boolean z3 = false;
            this.u = null;
            this.r = -1;
            this.n = q47Var;
            this.s = nib.j(jc5Var);
            this.o = z;
            this.p = z2;
            this.q = (z || z2) ? true : true;
        }

        @Override // defpackage.ob5
        public String a() {
            nc5 nc5Var = this.c;
            if (nc5Var != nc5.START_OBJECT && nc5Var != nc5.START_ARRAY) {
                return this.s.b();
            }
            return this.s.e().b();
        }

        @Override // defpackage.ob5
        public String b() {
            return a();
        }

        @Override // defpackage.ob5
        public fb5 c() {
            return i();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.t) {
                this.t = true;
            }
        }

        @Override // defpackage.ob5
        public nc5 e() throws IOException {
            return null;
        }

        public fb5 i() {
            fb5 fb5Var = this.u;
            if (fb5Var == null) {
                return fb5.g;
            }
            return fb5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: TokenBuffer.java */
    /* renamed from: mib$b */
    /* loaded from: classes2.dex */
    public static final class b {
    }

    private final void E1(StringBuilder sb) {
        throw null;
    }

    protected final void A1(nc5 nc5Var) {
        throw null;
    }

    protected final void D1(Object obj) {
        if (this.n) {
            nc5 nc5Var = nc5.NOT_AVAILABLE;
            throw null;
        } else {
            nc5 nc5Var2 = nc5.NOT_AVAILABLE;
            throw null;
        }
    }

    @Override // defpackage.ua5
    public void E0(Object obj) {
        this.m = obj;
        this.n = true;
    }

    protected final void F1(nc5 nc5Var) {
        if (this.n) {
            throw null;
        }
        throw null;
    }

    protected final void G1(nc5 nc5Var) {
        this.o.w();
        if (this.n) {
            throw null;
        }
        throw null;
    }

    protected final void H1(nc5 nc5Var, Object obj) {
        this.o.w();
        if (this.n) {
            throw null;
        }
        throw null;
    }

    protected void I1() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public ob5 J1() {
        return K1(this.e);
    }

    @Override // defpackage.ua5
    public void K0(char c) throws IOException {
        I1();
    }

    public ob5 K1(q47 q47Var) {
        return new a(null, q47Var, this.i, this.j, this.f);
    }

    @Override // defpackage.ua5
    public int M(v60 v60Var, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ua5
    public void M0(mca mcaVar) throws IOException {
        I1();
    }

    @Override // defpackage.ua5
    public void N0(String str) throws IOException {
        I1();
    }

    @Override // defpackage.ua5
    public void O0(char[] cArr, int i, int i2) throws IOException {
        I1();
    }

    @Override // defpackage.ua5
    public void P(v60 v60Var, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        R1(bArr2);
    }

    @Override // defpackage.ua5
    /* renamed from: P1 */
    public final cd5 n() {
        return this.o;
    }

    public void Q1(ua5 ua5Var) throws IOException {
        if (!this.k) {
            if ((-1) + 1 >= 16) {
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void R1(Object obj) throws IOException {
        if (obj == null) {
            l0();
        } else if (obj.getClass() != byte[].class && !(obj instanceof f79)) {
            q47 q47Var = this.e;
            if (q47Var == null) {
                H1(nc5.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                q47Var.a(this, obj);
            }
        } else {
            H1(nc5.VALUE_EMBEDDED_OBJECT, obj);
        }
    }

    @Override // defpackage.ua5
    public void S0(String str) throws IOException {
        H1(nc5.VALUE_EMBEDDED_OBJECT, new f79(str));
    }

    @Override // defpackage.ua5
    public void T(boolean z) throws IOException {
        nc5 nc5Var;
        if (z) {
            nc5Var = nc5.VALUE_TRUE;
        } else {
            nc5Var = nc5.VALUE_FALSE;
        }
        G1(nc5Var);
    }

    @Override // defpackage.ua5
    public final void W() throws IOException {
        A1(nc5.END_ARRAY);
        cd5 e = this.o.e();
        if (e != null) {
            this.o = e;
        }
    }

    @Override // defpackage.ua5
    public final void Y0() throws IOException {
        this.o.w();
        F1(nc5.START_ARRAY);
        this.o = this.o.l();
    }

    @Override // defpackage.ua5
    public final void b0() throws IOException {
        A1(nc5.END_OBJECT);
        cd5 e = this.o.e();
        if (e != null) {
            this.o = e;
        }
    }

    @Override // defpackage.ua5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = true;
    }

    @Override // defpackage.ua5
    public void e1(Object obj) throws IOException {
        this.o.w();
        F1(nc5.START_ARRAY);
        this.o = this.o.m(obj);
    }

    @Override // defpackage.ua5
    public void f0(mca mcaVar) throws IOException {
        this.o.v(mcaVar.getValue());
        D1(mcaVar);
    }

    @Override // defpackage.ua5
    public void f1(Object obj, int i) throws IOException {
        this.o.w();
        F1(nc5.START_ARRAY);
        this.o = this.o.m(obj);
    }

    @Override // defpackage.ua5
    public final void g1() throws IOException {
        this.o.w();
        F1(nc5.START_OBJECT);
        this.o = this.o.n();
    }

    @Override // defpackage.ua5
    public boolean i() {
        return true;
    }

    @Override // defpackage.ua5
    public void i1(Object obj) throws IOException {
        this.o.w();
        F1(nc5.START_OBJECT);
        this.o = this.o.o(obj);
    }

    @Override // defpackage.ua5
    public boolean j() {
        return this.j;
    }

    @Override // defpackage.ua5
    public final void j0(String str) throws IOException {
        this.o.v(str);
        D1(str);
    }

    @Override // defpackage.ua5
    public void j1(Object obj, int i) throws IOException {
        this.o.w();
        F1(nc5.START_OBJECT);
        this.o = this.o.o(obj);
    }

    @Override // defpackage.ua5
    public boolean k() {
        return this.i;
    }

    @Override // defpackage.ua5
    public ua5 l(ua5.b bVar) {
        this.g = (~bVar.o()) & this.g;
        return this;
    }

    @Override // defpackage.ua5
    public void l0() throws IOException {
        G1(nc5.VALUE_NULL);
    }

    @Override // defpackage.ua5
    public int m() {
        return this.g;
    }

    @Override // defpackage.ua5
    public void m0(double d) throws IOException {
        H1(nc5.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // defpackage.ua5
    public void n0(float f) throws IOException {
        H1(nc5.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // defpackage.ua5
    public void o0(int i) throws IOException {
        H1(nc5.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // defpackage.ua5
    public void o1(mca mcaVar) throws IOException {
        if (mcaVar == null) {
            l0();
        } else {
            H1(nc5.VALUE_STRING, mcaVar);
        }
    }

    @Override // defpackage.ua5
    public void p0(long j) throws IOException {
        H1(nc5.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // defpackage.ua5
    public boolean q(ua5.b bVar) {
        if ((bVar.o() & this.g) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ua5
    public void q0(String str) throws IOException {
        H1(nc5.VALUE_NUMBER_FLOAT, str);
    }

    @Override // defpackage.ua5
    public void q1(String str) throws IOException {
        if (str == null) {
            l0();
        } else {
            H1(nc5.VALUE_STRING, str);
        }
    }

    @Override // defpackage.ua5
    public void r0(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            l0();
        } else {
            H1(nc5.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // defpackage.ua5
    public ua5 s(int i, int i2) {
        this.g = (i & i2) | (m() & (~i2));
        return this;
    }

    @Override // defpackage.ua5
    public void s1(char[] cArr, int i, int i2) throws IOException {
        q1(new String(cArr, i, i2));
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        ob5 J1 = J1();
        int i = 0;
        if (!this.i && !this.j) {
            z = false;
        } else {
            z = true;
        }
        while (true) {
            try {
                nc5 e = J1.e();
                if (e == null) {
                    break;
                }
                if (z) {
                    E1(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(e.toString());
                    if (e == nc5.FIELD_NAME) {
                        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                        sb.append(J1.a());
                        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    }
                }
                i++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.ua5
    public void w1(Object obj) {
        this.l = obj;
        this.n = true;
    }

    @Override // defpackage.ua5
    @Deprecated
    public ua5 x(int i) {
        this.g = i;
        return this;
    }

    @Override // defpackage.ua5
    public void x0(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            l0();
        } else {
            H1(nc5.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // defpackage.ua5
    public void z0(short s) throws IOException {
        H1(nc5.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // defpackage.ua5, java.io.Flushable
    public void flush() throws IOException {
    }
}
