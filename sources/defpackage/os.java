package defpackage;
/* compiled from: AssistantAddToCartService_Factory.java */
/* renamed from: os  reason: default package */
/* loaded from: classes2.dex */
public final class os implements no3<ns> {
    private final as8<kq0> a;
    private final as8<uja> b;

    public os(as8<kq0> as8Var, as8<uja> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static os a(as8<kq0> as8Var, as8<uja> as8Var2) {
        return new os(as8Var, as8Var2);
    }

    public static ns c(kq0 kq0Var, uja ujaVar) {
        return new ns(kq0Var, ujaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ns get() {
        return c(this.a.get(), this.b.get());
    }
}
