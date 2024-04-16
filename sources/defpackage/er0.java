package defpackage;
/* compiled from: CartModule_ProvideCartQueueItemRepositoryConverterFactory.java */
/* renamed from: er0  reason: default package */
/* loaded from: classes3.dex */
public final class er0 implements no3<sr0> {
    private final as8<x23> a;

    public er0(as8<x23> as8Var) {
        this.a = as8Var;
    }

    public static er0 a(as8<x23> as8Var) {
        return new er0(as8Var);
    }

    public static sr0 c(x23 x23Var) {
        return (sr0) jh8.e(yq0.a.f(x23Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sr0 get() {
        return c(this.a.get());
    }
}
