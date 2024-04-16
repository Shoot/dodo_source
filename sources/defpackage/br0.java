package defpackage;
/* compiled from: CartModule_ProvideCartEditServiceFactory.java */
/* renamed from: br0  reason: default package */
/* loaded from: classes3.dex */
public final class br0 implements no3<kq0> {
    private final as8<as0> a;

    public br0(as8<as0> as8Var) {
        this.a = as8Var;
    }

    public static br0 a(as8<as0> as8Var) {
        return new br0(as8Var);
    }

    public static kq0 c(as0 as0Var) {
        return (kq0) jh8.e(yq0.a.c(as0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kq0 get() {
        return c(this.a.get());
    }
}
