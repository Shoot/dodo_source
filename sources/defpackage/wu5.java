package defpackage;

import ru.dodopizza.app.domain.blockstore.LocalityBlockStoreDataSource;
/* compiled from: LocalityModule_ProvideLocalityRepositoryFactory.java */
/* renamed from: wu5  reason: default package */
/* loaded from: classes3.dex */
public final class wu5 implements no3<dv5> {
    private final as8<jk2> a;
    private final as8<ci8> b;
    private final as8<ht5> c;
    private final as8<LocalityBlockStoreDataSource> d;
    private final as8<ev5> e;

    public wu5(as8<jk2> as8Var, as8<ci8> as8Var2, as8<ht5> as8Var3, as8<LocalityBlockStoreDataSource> as8Var4, as8<ev5> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static wu5 a(as8<jk2> as8Var, as8<ci8> as8Var2, as8<ht5> as8Var3, as8<LocalityBlockStoreDataSource> as8Var4, as8<ev5> as8Var5) {
        return new wu5(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static dv5 c(jk2 jk2Var, ci8 ci8Var, ht5 ht5Var, LocalityBlockStoreDataSource localityBlockStoreDataSource, ev5 ev5Var) {
        return (dv5) jh8.e(iu5.a.h(jk2Var, ci8Var, ht5Var, localityBlockStoreDataSource, ev5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dv5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
