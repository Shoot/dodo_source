package defpackage;
/* compiled from: PaymentModule_ProvideGooglePayHandlerFactory.java */
/* renamed from: uu7  reason: default package */
/* loaded from: classes3.dex */
public final class uu7 implements no3<ug4> {
    private final as8<sg4> a;

    public uu7(as8<sg4> as8Var) {
        this.a = as8Var;
    }

    public static uu7 a(as8<sg4> as8Var) {
        return new uu7(as8Var);
    }

    public static ug4 c(sg4 sg4Var) {
        return (ug4) jh8.e(gu7.a.n(sg4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ug4 get() {
        return c(this.a.get());
    }
}
