package defpackage;
/* compiled from: RepositoryModule_ProvideUpsaleProductRepositoryFactory.java */
/* renamed from: ci9  reason: default package */
/* loaded from: classes3.dex */
public final class ci9 implements no3<btb> {
    private final tg9 a;

    public ci9(tg9 tg9Var) {
        this.a = tg9Var;
    }

    public static ci9 a(tg9 tg9Var) {
        return new ci9(tg9Var);
    }

    public static btb c(tg9 tg9Var) {
        return (btb) jh8.e(tg9Var.I());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public btb get() {
        return c(this.a);
    }
}
