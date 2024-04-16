package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonTreeWriter.java */
/* renamed from: oc5  reason: default package */
/* loaded from: classes2.dex */
public final class oc5 extends dd5 {
    private static final Writer o = new a();
    private static final qb5 p = new qb5("closed");
    private final List<pa5> l;
    private String m;
    private pa5 n;

    /* compiled from: JsonTreeWriter.java */
    /* renamed from: oc5$a */
    /* loaded from: classes2.dex */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public oc5() {
        super(o);
        this.l = new ArrayList();
        this.n = lb5.a;
    }

    private pa5 f0() {
        List<pa5> list = this.l;
        return list.get(list.size() - 1);
    }

    private void j0(pa5 pa5Var) {
        if (this.m != null) {
            if (!pa5Var.p() || l()) {
                ((mb5) f0()).v(this.m, pa5Var);
            }
            this.m = null;
        } else if (this.l.isEmpty()) {
            this.n = pa5Var;
        } else {
            pa5 f0 = f0();
            if (f0 instanceof ca5) {
                ((ca5) f0).v(pa5Var);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.dd5
    public dd5 P(long j) throws IOException {
        j0(new qb5(Long.valueOf(j)));
        return this;
    }

    @Override // defpackage.dd5
    public dd5 Q(Boolean bool) throws IOException {
        if (bool == null) {
            return s();
        }
        j0(new qb5(bool));
        return this;
    }

    @Override // defpackage.dd5
    public dd5 S(Number number) throws IOException {
        if (number == null) {
            return s();
        }
        if (!n()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        j0(new qb5(number));
        return this;
    }

    @Override // defpackage.dd5
    public dd5 T(String str) throws IOException {
        if (str == null) {
            return s();
        }
        j0(new qb5(str));
        return this;
    }

    @Override // defpackage.dd5
    public dd5 W(boolean z) throws IOException {
        j0(new qb5(Boolean.valueOf(z)));
        return this;
    }

    @Override // defpackage.dd5
    public dd5 c() throws IOException {
        ca5 ca5Var = new ca5();
        j0(ca5Var);
        this.l.add(ca5Var);
        return this;
    }

    @Override // defpackage.dd5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.l.isEmpty()) {
            this.l.add(p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // defpackage.dd5
    public dd5 e() throws IOException {
        mb5 mb5Var = new mb5();
        j0(mb5Var);
        this.l.add(mb5Var);
        return this;
    }

    public pa5 e0() {
        if (this.l.isEmpty()) {
            return this.n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.l);
    }

    @Override // defpackage.dd5
    public dd5 j() throws IOException {
        if (!this.l.isEmpty() && this.m == null) {
            if (f0() instanceof ca5) {
                List<pa5> list = this.l;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.dd5
    public dd5 k() throws IOException {
        if (!this.l.isEmpty() && this.m == null) {
            if (f0() instanceof mb5) {
                List<pa5> list = this.l;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.dd5
    public dd5 q(String str) throws IOException {
        if (str != null) {
            if (!this.l.isEmpty() && this.m == null) {
                if (f0() instanceof mb5) {
                    this.m = str;
                    return this;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // defpackage.dd5
    public dd5 s() throws IOException {
        j0(lb5.a);
        return this;
    }

    @Override // defpackage.dd5, java.io.Flushable
    public void flush() throws IOException {
    }
}
