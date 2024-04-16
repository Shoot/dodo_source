package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: MinimalPrettyPrinter.java */
/* renamed from: ml6  reason: default package */
/* loaded from: classes2.dex */
public class ml6 implements jj8, Serializable {
    protected String a;
    protected uba b;

    public ml6() {
        this(jj8.R2.toString());
    }

    @Override // defpackage.jj8
    public void a(ua5 ua5Var, int i) throws IOException {
        ua5Var.K0(']');
    }

    @Override // defpackage.jj8
    public void e(ua5 ua5Var) throws IOException {
        ua5Var.K0('[');
    }

    @Override // defpackage.jj8
    public void f(ua5 ua5Var) throws IOException {
        ua5Var.K0(CoreConstants.CURLY_LEFT);
    }

    @Override // defpackage.jj8
    public void i(ua5 ua5Var) throws IOException {
        String str = this.a;
        if (str != null) {
            ua5Var.N0(str);
        }
    }

    @Override // defpackage.jj8
    public void j(ua5 ua5Var) throws IOException {
        ua5Var.K0(this.b.b());
    }

    @Override // defpackage.jj8
    public void k(ua5 ua5Var) throws IOException {
        ua5Var.K0(this.b.c());
    }

    @Override // defpackage.jj8
    public void l(ua5 ua5Var, int i) throws IOException {
        ua5Var.K0(CoreConstants.CURLY_RIGHT);
    }

    @Override // defpackage.jj8
    public void m(ua5 ua5Var) throws IOException {
        ua5Var.K0(this.b.d());
    }

    public ml6(String str) {
        this.a = str;
        this.b = jj8.Q2;
    }

    @Override // defpackage.jj8
    public void b(ua5 ua5Var) throws IOException {
    }

    @Override // defpackage.jj8
    public void c(ua5 ua5Var) throws IOException {
    }
}
