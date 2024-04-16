package defpackage;
/* compiled from: CartModule_ProvideCartUpdateServiceFactory.java */
/* renamed from: jr0  reason: default package */
/* loaded from: classes3.dex */
public final class jr0 implements no3<fs0> {
    private final as8<a98> a;

    public jr0(as8<a98> as8Var) {
        this.a = as8Var;
    }

    public static jr0 a(as8<a98> as8Var) {
        return new jr0(as8Var);
    }

    public static fs0 c(a98 a98Var) {
        return (fs0) jh8.e(yq0.a.k(a98Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fs0 get() {
        return c(this.a.get());
    }
}
