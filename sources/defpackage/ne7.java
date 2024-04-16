package defpackage;
/* compiled from: OrderHistoryDetailsInteractorImpl_Factory.java */
/* renamed from: ne7  reason: default package */
/* loaded from: classes2.dex */
public final class ne7 implements no3<me7> {
    private final as8<li7> a;
    private final as8<f8c> b;
    private final as8<t52> c;
    private final as8<dt5> d;
    private final as8<gc> e;
    private final as8<m31> f;

    public ne7(as8<li7> as8Var, as8<f8c> as8Var2, as8<t52> as8Var3, as8<dt5> as8Var4, as8<gc> as8Var5, as8<m31> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static ne7 a(as8<li7> as8Var, as8<f8c> as8Var2, as8<t52> as8Var3, as8<dt5> as8Var4, as8<gc> as8Var5, as8<m31> as8Var6) {
        return new ne7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static me7 c(li7 li7Var, f8c f8cVar, t52 t52Var, dt5 dt5Var, gc gcVar, m31 m31Var) {
        return new me7(li7Var, f8cVar, t52Var, dt5Var, gcVar, m31Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public me7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
