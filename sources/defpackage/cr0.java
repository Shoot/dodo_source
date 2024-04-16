package defpackage;
/* compiled from: CartModule_ProvideCartItemDataFactory.java */
/* renamed from: cr0  reason: default package */
/* loaded from: classes3.dex */
public final class cr0 implements no3<sq0> {
    private final as8<uja> a;

    public cr0(as8<uja> as8Var) {
        this.a = as8Var;
    }

    public static cr0 a(as8<uja> as8Var) {
        return new cr0(as8Var);
    }

    public static sq0 c(uja ujaVar) {
        return (sq0) jh8.e(yq0.a.d(ujaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sq0 get() {
        return c(this.a.get());
    }
}
