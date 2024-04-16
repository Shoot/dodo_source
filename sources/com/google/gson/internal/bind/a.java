package com.google.gson.internal.bind;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class a extends yb5 {
    private static final Reader t = new C0246a();
    private static final Object u = new Object();
    private Object[] p;
    private int q;
    private String[] r;
    private int[] s;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0246a extends Reader {
        C0246a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public a(pa5 pa5Var) {
        super(t);
        this.p = new Object[32];
        this.q = 0;
        this.r = new String[32];
        this.s = new int[32];
        x0(pa5Var);
    }

    private void n0(mc5 mc5Var) throws IOException {
        if (N() == mc5Var) {
            return;
        }
        throw new IllegalStateException("Expected " + mc5Var + " but was " + N() + q());
    }

    private Object p0() {
        return this.p[this.q - 1];
    }

    private String q() {
        return " at path " + getPath();
    }

    private Object q0() {
        Object[] objArr = this.p;
        int i = this.q - 1;
        this.q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void x0(Object obj) {
        int i = this.q;
        Object[] objArr = this.p;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.p = Arrays.copyOf(objArr, i2);
            this.s = Arrays.copyOf(this.s, i2);
            this.r = (String[]) Arrays.copyOf(this.r, i2);
        }
        Object[] objArr2 = this.p;
        int i3 = this.q;
        this.q = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.yb5
    public void H() throws IOException {
        n0(mc5.NULL);
        q0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.yb5
    public String L() throws IOException {
        mc5 N = N();
        mc5 mc5Var = mc5.STRING;
        if (N != mc5Var && N != mc5.NUMBER) {
            throw new IllegalStateException("Expected " + mc5Var + " but was " + N + q());
        }
        String h = ((qb5) q0()).h();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    @Override // defpackage.yb5
    public mc5 N() throws IOException {
        if (this.q == 0) {
            return mc5.END_DOCUMENT;
        }
        Object p0 = p0();
        if (p0 instanceof Iterator) {
            boolean z = this.p[this.q - 2] instanceof mb5;
            Iterator it = (Iterator) p0;
            if (it.hasNext()) {
                if (z) {
                    return mc5.NAME;
                }
                x0(it.next());
                return N();
            } else if (z) {
                return mc5.END_OBJECT;
            } else {
                return mc5.END_ARRAY;
            }
        } else if (p0 instanceof mb5) {
            return mc5.BEGIN_OBJECT;
        } else {
            if (p0 instanceof ca5) {
                return mc5.BEGIN_ARRAY;
            }
            if (p0 instanceof qb5) {
                qb5 qb5Var = (qb5) p0;
                if (qb5Var.D()) {
                    return mc5.STRING;
                }
                if (qb5Var.A()) {
                    return mc5.BOOLEAN;
                }
                if (qb5Var.C()) {
                    return mc5.NUMBER;
                }
                throw new AssertionError();
            } else if (p0 instanceof lb5) {
                return mc5.NULL;
            } else {
                if (p0 == u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // defpackage.yb5
    public void a() throws IOException {
        n0(mc5.BEGIN_ARRAY);
        x0(((ca5) p0()).iterator());
        this.s[this.q - 1] = 0;
    }

    @Override // defpackage.yb5
    public void b() throws IOException {
        n0(mc5.BEGIN_OBJECT);
        x0(((mb5) p0()).A().iterator());
    }

    @Override // defpackage.yb5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.p = new Object[]{u};
        this.q = 1;
    }

    @Override // defpackage.yb5
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        int i = 0;
        while (true) {
            int i2 = this.q;
            if (i < i2) {
                Object[] objArr = this.p;
                Object obj = objArr[i];
                if (obj instanceof ca5) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        sb.append('[');
                        sb.append(this.s[i]);
                        sb.append(']');
                    }
                } else if ((obj instanceof mb5) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append(CoreConstants.DOT);
                    String str = this.r[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // defpackage.yb5
    public void j() throws IOException {
        n0(mc5.END_ARRAY);
        q0();
        q0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.yb5
    public void k() throws IOException {
        n0(mc5.END_OBJECT);
        q0();
        q0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.yb5
    public void l0() throws IOException {
        if (N() == mc5.NAME) {
            y();
            this.r[this.q - 2] = "null";
        } else {
            q0();
            int i = this.q;
            if (i > 0) {
                this.r[i - 1] = "null";
            }
        }
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // defpackage.yb5
    public boolean m() throws IOException {
        mc5 N = N();
        if (N != mc5.END_OBJECT && N != mc5.END_ARRAY) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pa5 o0() throws IOException {
        mc5 N = N();
        if (N != mc5.NAME && N != mc5.END_ARRAY && N != mc5.END_OBJECT && N != mc5.END_DOCUMENT) {
            pa5 pa5Var = (pa5) p0();
            l0();
            return pa5Var;
        }
        throw new IllegalStateException("Unexpected " + N + " when reading a JsonElement.");
    }

    @Override // defpackage.yb5
    public boolean r() throws IOException {
        n0(mc5.BOOLEAN);
        boolean v = ((qb5) q0()).v();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return v;
    }

    public void r0() throws IOException {
        n0(mc5.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) p0()).next();
        x0(entry.getValue());
        x0(new qb5((String) entry.getKey()));
    }

    @Override // defpackage.yb5
    public double s() throws IOException {
        mc5 N = N();
        mc5 mc5Var = mc5.NUMBER;
        if (N != mc5Var && N != mc5.STRING) {
            throw new IllegalStateException("Expected " + mc5Var + " but was " + N + q());
        }
        double w = ((qb5) p0()).w();
        if (!n() && (Double.isNaN(w) || Double.isInfinite(w))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + w);
        }
        q0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return w;
    }

    @Override // defpackage.yb5
    public String toString() {
        return a.class.getSimpleName() + q();
    }

    @Override // defpackage.yb5
    public int u() throws IOException {
        mc5 N = N();
        mc5 mc5Var = mc5.NUMBER;
        if (N != mc5Var && N != mc5.STRING) {
            throw new IllegalStateException("Expected " + mc5Var + " but was " + N + q());
        }
        int a = ((qb5) p0()).a();
        q0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return a;
    }

    @Override // defpackage.yb5
    public long x() throws IOException {
        mc5 N = N();
        mc5 mc5Var = mc5.NUMBER;
        if (N != mc5Var && N != mc5.STRING) {
            throw new IllegalStateException("Expected " + mc5Var + " but was " + N + q());
        }
        long x = ((qb5) p0()).x();
        q0();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return x;
    }

    @Override // defpackage.yb5
    public String y() throws IOException {
        n0(mc5.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) p0()).next();
        String str = (String) entry.getKey();
        this.r[this.q - 1] = str;
        x0(entry.getValue());
        return str;
    }
}
