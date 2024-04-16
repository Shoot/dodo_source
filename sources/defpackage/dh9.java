package defpackage;
/* compiled from: RepositoryModule_ProvideDomainEventsFactory.java */
/* renamed from: dh9  reason: default package */
/* loaded from: classes3.dex */
public final class dh9 implements no3<k63> {
    private final tg9 a;

    public dh9(tg9 tg9Var) {
        this.a = tg9Var;
    }

    public static dh9 a(tg9 tg9Var) {
        return new dh9(tg9Var);
    }

    public static k63 c(tg9 tg9Var) {
        return (k63) jh8.e(tg9Var.k());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public k63 get() {
        return c(this.a);
    }
}
