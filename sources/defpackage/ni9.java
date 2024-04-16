package defpackage;
/* compiled from: RequestCounterInterceptor_Factory.java */
/* renamed from: ni9  reason: default package */
/* loaded from: classes4.dex */
public final class ni9 implements no3<mi9> {
    private final as8<li9> a;

    public ni9(as8<li9> as8Var) {
        this.a = as8Var;
    }

    public static ni9 a(as8<li9> as8Var) {
        return new ni9(as8Var);
    }

    public static mi9 c(li9 li9Var) {
        return new mi9(li9Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mi9 get() {
        return c(this.a.get());
    }
}
