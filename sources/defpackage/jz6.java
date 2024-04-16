package defpackage;
/* compiled from: Node.java */
/* renamed from: jz6  reason: default package */
/* loaded from: classes3.dex */
public abstract class jz6 {
    private jz6 a = null;
    private jz6 b = null;
    private jz6 c = null;
    private jz6 d = null;
    private jz6 e = null;

    public abstract void a(w1c w1cVar);

    public void b(jz6 jz6Var) {
        jz6Var.l();
        jz6Var.j(this);
        jz6 jz6Var2 = this.c;
        if (jz6Var2 != null) {
            jz6Var2.e = jz6Var;
            jz6Var.d = jz6Var2;
            this.c = jz6Var;
            return;
        }
        this.b = jz6Var;
        this.c = jz6Var;
    }

    public jz6 c() {
        return this.b;
    }

    public jz6 d() {
        return this.c;
    }

    public jz6 e() {
        return this.e;
    }

    public jz6 f() {
        return this.a;
    }

    public jz6 g() {
        return this.d;
    }

    public void h(jz6 jz6Var) {
        jz6Var.l();
        jz6 jz6Var2 = this.e;
        jz6Var.e = jz6Var2;
        if (jz6Var2 != null) {
            jz6Var2.d = jz6Var;
        }
        jz6Var.d = this;
        this.e = jz6Var;
        jz6 jz6Var3 = this.a;
        jz6Var.a = jz6Var3;
        if (jz6Var.e == null) {
            jz6Var3.c = jz6Var;
        }
    }

    public void i(jz6 jz6Var) {
        jz6Var.l();
        jz6 jz6Var2 = this.d;
        jz6Var.d = jz6Var2;
        if (jz6Var2 != null) {
            jz6Var2.e = jz6Var;
        }
        jz6Var.e = this;
        this.d = jz6Var;
        jz6 jz6Var3 = this.a;
        jz6Var.a = jz6Var3;
        if (jz6Var.d == null) {
            jz6Var3.b = jz6Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(jz6 jz6Var) {
        this.a = jz6Var;
    }

    protected String k() {
        return "";
    }

    public void l() {
        jz6 jz6Var = this.d;
        if (jz6Var != null) {
            jz6Var.e = this.e;
        } else {
            jz6 jz6Var2 = this.a;
            if (jz6Var2 != null) {
                jz6Var2.b = this.e;
            }
        }
        jz6 jz6Var3 = this.e;
        if (jz6Var3 != null) {
            jz6Var3.d = jz6Var;
        } else {
            jz6 jz6Var4 = this.a;
            if (jz6Var4 != null) {
                jz6Var4.c = jz6Var;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + k() + "}";
    }
}
