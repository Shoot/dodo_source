package defpackage;
/* compiled from: RepositoryModule_ProvideLoyaltyMenuRepositoryFactory.java */
/* renamed from: ih9  reason: default package */
/* loaded from: classes3.dex */
public final class ih9 implements no3<v06> {
    private final tg9 a;
    private final as8<ci8> b;
    private final as8<ml0> c;

    public ih9(tg9 tg9Var, as8<ci8> as8Var, as8<ml0> as8Var2) {
        this.a = tg9Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static ih9 a(tg9 tg9Var, as8<ci8> as8Var, as8<ml0> as8Var2) {
        return new ih9(tg9Var, as8Var, as8Var2);
    }

    public static v06 c(tg9 tg9Var, ci8 ci8Var, ml0 ml0Var) {
        return (v06) jh8.e(tg9Var.o(ci8Var, ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v06 get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
