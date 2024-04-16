package defpackage;
/* compiled from: RepositoryModule_ProvideCartConverterFactory.java */
/* renamed from: ug9  reason: default package */
/* loaded from: classes3.dex */
public final class ug9 implements no3<hq0> {
    private final tg9 a;
    private final as8<iq0> b;

    public ug9(tg9 tg9Var, as8<iq0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static ug9 a(tg9 tg9Var, as8<iq0> as8Var) {
        return new ug9(tg9Var, as8Var);
    }

    public static hq0 c(tg9 tg9Var, iq0 iq0Var) {
        return (hq0) jh8.e(tg9Var.a(iq0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hq0 get() {
        return c(this.a, this.b.get());
    }
}
