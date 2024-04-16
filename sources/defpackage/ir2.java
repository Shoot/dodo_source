package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: DefaultPrettyPrinter.java */
/* renamed from: ir2  reason: default package */
/* loaded from: classes2.dex */
public class ir2 implements jj8, k55<ir2>, Serializable {
    public static final vca h = new vca(" ");
    protected b a;
    protected b b;
    protected final mca c;
    protected boolean d;
    protected transient int e;
    protected uba f;
    protected String g;

    /* compiled from: DefaultPrettyPrinter.java */
    /* renamed from: ir2$a */
    /* loaded from: classes2.dex */
    public static class a extends c {
        public static final a b = new a();

        @Override // defpackage.ir2.c, defpackage.ir2.b
        public void a(ua5 ua5Var, int i) throws IOException {
            ua5Var.K0(' ');
        }

        @Override // defpackage.ir2.c, defpackage.ir2.b
        public boolean isInline() {
            return true;
        }
    }

    /* compiled from: DefaultPrettyPrinter.java */
    /* renamed from: ir2$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(ua5 ua5Var, int i) throws IOException;

        boolean isInline();
    }

    public ir2() {
        this(h);
    }

    @Override // defpackage.jj8
    public void a(ua5 ua5Var, int i) throws IOException {
        if (!this.a.isInline()) {
            this.e--;
        }
        if (i > 0) {
            this.a.a(ua5Var, this.e);
        } else {
            ua5Var.K0(' ');
        }
        ua5Var.K0(']');
    }

    @Override // defpackage.jj8
    public void b(ua5 ua5Var) throws IOException {
        this.a.a(ua5Var, this.e);
    }

    @Override // defpackage.jj8
    public void c(ua5 ua5Var) throws IOException {
        this.b.a(ua5Var, this.e);
    }

    @Override // defpackage.jj8
    public void e(ua5 ua5Var) throws IOException {
        if (!this.a.isInline()) {
            this.e++;
        }
        ua5Var.K0('[');
    }

    @Override // defpackage.jj8
    public void f(ua5 ua5Var) throws IOException {
        ua5Var.K0(CoreConstants.CURLY_LEFT);
        if (!this.b.isInline()) {
            this.e++;
        }
    }

    @Override // defpackage.jj8
    public void i(ua5 ua5Var) throws IOException {
        mca mcaVar = this.c;
        if (mcaVar != null) {
            ua5Var.M0(mcaVar);
        }
    }

    @Override // defpackage.jj8
    public void j(ua5 ua5Var) throws IOException {
        ua5Var.K0(this.f.b());
        this.a.a(ua5Var, this.e);
    }

    @Override // defpackage.jj8
    public void k(ua5 ua5Var) throws IOException {
        ua5Var.K0(this.f.c());
        this.b.a(ua5Var, this.e);
    }

    @Override // defpackage.jj8
    public void l(ua5 ua5Var, int i) throws IOException {
        if (!this.b.isInline()) {
            this.e--;
        }
        if (i > 0) {
            this.b.a(ua5Var, this.e);
        } else {
            ua5Var.K0(' ');
        }
        ua5Var.K0(CoreConstants.CURLY_RIGHT);
    }

    @Override // defpackage.jj8
    public void m(ua5 ua5Var) throws IOException {
        if (this.d) {
            ua5Var.N0(this.g);
        } else {
            ua5Var.K0(this.f.d());
        }
    }

    @Override // defpackage.k55
    /* renamed from: n */
    public ir2 d() {
        if (getClass() == ir2.class) {
            return new ir2(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public ir2 o(uba ubaVar) {
        this.f = ubaVar;
        this.g = " " + ubaVar.d() + " ";
        return this;
    }

    public ir2(mca mcaVar) {
        this.a = a.b;
        this.b = iq2.f;
        this.d = true;
        this.c = mcaVar;
        o(jj8.Q2);
    }

    public ir2(ir2 ir2Var) {
        this(ir2Var, ir2Var.c);
    }

    public ir2(ir2 ir2Var, mca mcaVar) {
        this.a = a.b;
        this.b = iq2.f;
        this.d = true;
        this.a = ir2Var.a;
        this.b = ir2Var.b;
        this.d = ir2Var.d;
        this.e = ir2Var.e;
        this.f = ir2Var.f;
        this.g = ir2Var.g;
        this.c = mcaVar;
    }

    /* compiled from: DefaultPrettyPrinter.java */
    /* renamed from: ir2$c */
    /* loaded from: classes2.dex */
    public static class c implements b, Serializable {
        public static final c a = new c();

        @Override // defpackage.ir2.b
        public boolean isInline() {
            return true;
        }

        @Override // defpackage.ir2.b
        public void a(ua5 ua5Var, int i) throws IOException {
        }
    }
}
