package defpackage;
/* compiled from: DeferredTimeModule_ProvideDeferredTimeFormatterFactory.java */
/* renamed from: it2  reason: default package */
/* loaded from: classes3.dex */
public final class it2 implements no3<vs2> {
    private final as8<jgb> a;
    private final as8<hq3> b;

    public it2(as8<jgb> as8Var, as8<hq3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static it2 a(as8<jgb> as8Var, as8<hq3> as8Var2) {
        return new it2(as8Var, as8Var2);
    }

    public static vs2 c(jgb jgbVar, hq3 hq3Var) {
        return (vs2) jh8.e(gt2.a.b(jgbVar, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vs2 get() {
        return c(this.a.get(), this.b.get());
    }
}
