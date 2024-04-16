package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.ob5;
import defpackage.ua5;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
/* compiled from: JsonFactory.java */
/* renamed from: ra5  reason: default package */
/* loaded from: classes2.dex */
public class ra5 extends sib implements Serializable {
    protected static final int j = a.k();
    protected static final int k = ob5.a.a();
    protected static final int l = ua5.b.a();
    public static final mca m = ir2.h;
    protected final transient pw0 a;
    protected final transient ik0 b;
    protected int c;
    protected int d;
    protected int e;
    protected q47 f;
    protected mca g;
    protected int h;
    protected final char i;

    /* compiled from: JsonFactory.java */
    /* renamed from: ra5$a */
    /* loaded from: classes2.dex */
    public enum a implements l85 {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public static int k() {
            a[] values;
            int i = 0;
            for (a aVar : values()) {
                if (aVar.a()) {
                    i |= aVar.i();
                }
            }
            return i;
        }

        @Override // defpackage.l85
        public boolean a() {
            return this.a;
        }

        @Override // defpackage.l85
        public int i() {
            return 1 << ordinal();
        }

        public boolean o(int i) {
            if ((i & i()) != 0) {
                return true;
            }
            return false;
        }
    }

    public ra5() {
        this(null);
    }

    protected zt1 a(Object obj) {
        return zt1.k(!f(), obj);
    }

    protected ks4 b(zt1 zt1Var, boolean z) {
        if (zt1Var == null) {
            zt1Var = zt1.r();
        }
        return new ks4(e(), zt1Var, z);
    }

    protected ua5 c(Writer writer, ks4 ks4Var) throws IOException {
        e9c e9cVar = new e9c(ks4Var, this.e, this.f, writer, this.i);
        int i = this.h;
        if (i > 0) {
            e9cVar.y(i);
        }
        mca mcaVar = this.g;
        if (mcaVar != m) {
            e9cVar.H1(mcaVar);
        }
        return e9cVar;
    }

    public ah0 e() {
        if (a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.o(this.c)) {
            return bh0.a();
        }
        return new ah0();
    }

    public boolean f() {
        return false;
    }

    public ua5 i(Writer writer) throws IOException {
        ks4 b = b(a(writer), false);
        return c(d(writer, b), b);
    }

    public q47 j() {
        return this.f;
    }

    public boolean k() {
        return false;
    }

    public ra5 l(q47 q47Var) {
        this.f = q47Var;
        return this;
    }

    protected Object readResolve() {
        return new ra5(this, this.f);
    }

    public ra5(q47 q47Var) {
        this.a = pw0.a();
        this.b = ik0.c();
        this.c = j;
        this.d = k;
        this.e = l;
        this.g = m;
        this.f = q47Var;
        this.i = CoreConstants.DOUBLE_QUOTE_CHAR;
    }

    protected ra5(ra5 ra5Var, q47 q47Var) {
        this.a = pw0.a();
        this.b = ik0.c();
        this.c = j;
        this.d = k;
        this.e = l;
        this.g = m;
        this.f = q47Var;
        this.c = ra5Var.c;
        this.d = ra5Var.d;
        this.e = ra5Var.e;
        this.g = ra5Var.g;
        this.h = ra5Var.h;
        this.i = ra5Var.i;
    }

    protected final Writer d(Writer writer, ks4 ks4Var) throws IOException {
        return writer;
    }
}
