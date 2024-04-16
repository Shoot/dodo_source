package defpackage;
/* compiled from: CartModule_ProvideCartQueueItemSenderFactory.java */
/* renamed from: fr0  reason: default package */
/* loaded from: classes3.dex */
public final class fr0 implements no3<ur0> {
    private final as8<vr0> a;

    public fr0(as8<vr0> as8Var) {
        this.a = as8Var;
    }

    public static fr0 a(as8<vr0> as8Var) {
        return new fr0(as8Var);
    }

    public static ur0 c(vr0 vr0Var) {
        return (ur0) jh8.e(yq0.a.g(vr0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ur0 get() {
        return c(this.a.get());
    }
}
