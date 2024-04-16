package defpackage;

import ru.dodopizza.app.domain.blockstore.BaseUrlBlockStoreDataSource;
/* compiled from: BaseUrlRepository_Factory.java */
/* renamed from: r80  reason: default package */
/* loaded from: classes.dex */
public final class r80 implements no3<q80> {
    private final as8<ci8> a;
    private final as8<BaseUrlBlockStoreDataSource> b;

    public r80(as8<ci8> as8Var, as8<BaseUrlBlockStoreDataSource> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static r80 a(as8<ci8> as8Var, as8<BaseUrlBlockStoreDataSource> as8Var2) {
        return new r80(as8Var, as8Var2);
    }

    public static q80 c(ci8 ci8Var, BaseUrlBlockStoreDataSource baseUrlBlockStoreDataSource) {
        return new q80(ci8Var, baseUrlBlockStoreDataSource);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public q80 get() {
        return c(this.a.get(), this.b.get());
    }
}
