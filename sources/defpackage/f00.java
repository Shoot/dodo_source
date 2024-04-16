package defpackage;

import ru.dodopizza.app.domain.blockstore.AuthorizationBlockStoreDataSource;
/* compiled from: AuthorizationRepository_Factory.java */
/* renamed from: f00  reason: default package */
/* loaded from: classes4.dex */
public final class f00 implements no3<e00> {
    private final as8<ci8> a;
    private final as8<AuthorizationBlockStoreDataSource> b;

    public f00(as8<ci8> as8Var, as8<AuthorizationBlockStoreDataSource> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static f00 a(as8<ci8> as8Var, as8<AuthorizationBlockStoreDataSource> as8Var2) {
        return new f00(as8Var, as8Var2);
    }

    public static e00 c(ci8 ci8Var, AuthorizationBlockStoreDataSource authorizationBlockStoreDataSource) {
        return new e00(ci8Var, authorizationBlockStoreDataSource);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e00 get() {
        return c(this.a.get(), this.b.get());
    }
}
