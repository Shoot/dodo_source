package defpackage;
/* compiled from: PaymentModule_ProvideGooglePayControllerFactory.java */
/* renamed from: su7  reason: default package */
/* loaded from: classes3.dex */
public final class su7 implements no3<tg4> {
    private final as8<sg4> a;

    public su7(as8<sg4> as8Var) {
        this.a = as8Var;
    }

    public static su7 a(as8<sg4> as8Var) {
        return new su7(as8Var);
    }

    public static tg4 c(sg4 sg4Var) {
        return (tg4) jh8.e(gu7.a.m(sg4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tg4 get() {
        return c(this.a.get());
    }
}
