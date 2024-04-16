package defpackage;

import ru.dodopizza.app.domain.blockstore.AuthorizationBlockStoreDataSource;
/* compiled from: AuthorizationBlockStoreDataSource_Factory.java */
/* renamed from: xz  reason: default package */
/* loaded from: classes4.dex */
public final class xz implements no3<AuthorizationBlockStoreDataSource> {
    private final as8<ld0> a;

    public xz(as8<ld0> as8Var) {
        this.a = as8Var;
    }

    public static xz a(as8<ld0> as8Var) {
        return new xz(as8Var);
    }

    public static AuthorizationBlockStoreDataSource c(ld0 ld0Var) {
        return new AuthorizationBlockStoreDataSource(ld0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AuthorizationBlockStoreDataSource get() {
        return c(this.a.get());
    }
}
