package defpackage;

import ru.dodopizza.app.domain.blockstore.LocalityBlockStoreDataSource;
/* compiled from: LocalityBlockStoreDataSource_Factory.java */
/* renamed from: ft5  reason: default package */
/* loaded from: classes4.dex */
public final class ft5 implements no3<LocalityBlockStoreDataSource> {
    private final as8<ld0> a;

    public ft5(as8<ld0> as8Var) {
        this.a = as8Var;
    }

    public static ft5 a(as8<ld0> as8Var) {
        return new ft5(as8Var);
    }

    public static LocalityBlockStoreDataSource c(ld0 ld0Var) {
        return new LocalityBlockStoreDataSource(ld0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LocalityBlockStoreDataSource get() {
        return c(this.a.get());
    }
}
