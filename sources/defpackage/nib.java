package defpackage;
/* compiled from: TokenBufferReadContext.java */
/* renamed from: nib  reason: default package */
/* loaded from: classes2.dex */
public class nib extends jc5 {
    protected final jc5 c;
    protected final fb5 d;
    protected String e;
    protected Object f;

    protected nib(jc5 jc5Var, zt1 zt1Var) {
        super(jc5Var);
        this.c = jc5Var.e();
        this.e = jc5Var.b();
        this.f = jc5Var.c();
        if (jc5Var instanceof wb5) {
            this.d = ((wb5) jc5Var).k(zt1Var);
        } else {
            this.d = fb5.g;
        }
    }

    public static nib j(jc5 jc5Var) {
        if (jc5Var == null) {
            return new nib();
        }
        return new nib(jc5Var, zt1.r());
    }

    @Override // defpackage.jc5
    public String b() {
        return this.e;
    }

    @Override // defpackage.jc5
    public Object c() {
        return this.f;
    }

    @Override // defpackage.jc5
    public jc5 e() {
        return this.c;
    }

    @Override // defpackage.jc5
    public void h(Object obj) {
        this.f = obj;
    }

    protected nib() {
        super(0, -1);
        this.c = null;
        this.d = fb5.g;
    }
}
