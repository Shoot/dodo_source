package defpackage;
/* compiled from: OrderModule_ProvideCreateOrderRequestConverterFactory.java */
/* renamed from: pg7  reason: default package */
/* loaded from: classes3.dex */
public final class pg7 implements no3<g22> {
    private final as8<jgb> a;
    private final as8<w13> b;

    public pg7(as8<jgb> as8Var, as8<w13> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static pg7 a(as8<jgb> as8Var, as8<w13> as8Var2) {
        return new pg7(as8Var, as8Var2);
    }

    public static g22 c(jgb jgbVar, w13 w13Var) {
        return (g22) jh8.e(ng7.a.b(jgbVar, w13Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public g22 get() {
        return c(this.a.get(), this.b.get());
    }
}
