package defpackage;
/* compiled from: RepositoryModule_ProvideLoyaltyMissionRepositoryFactory.java */
/* renamed from: jh9  reason: default package */
/* loaded from: classes3.dex */
public final class jh9 implements no3<u16> {
    private final tg9 a;
    private final as8<ml0> b;

    public jh9(tg9 tg9Var, as8<ml0> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static jh9 a(tg9 tg9Var, as8<ml0> as8Var) {
        return new jh9(tg9Var, as8Var);
    }

    public static u16 c(tg9 tg9Var, ml0 ml0Var) {
        return (u16) jh8.e(tg9Var.p(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public u16 get() {
        return c(this.a, this.b.get());
    }
}
