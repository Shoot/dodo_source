package defpackage;

import ru.dodopizza.app.domain.blockstore.FeatureBlockStoreDataSource;
/* compiled from: FeatureBlockStoreDataSource_Factory.java */
/* renamed from: aq3  reason: default package */
/* loaded from: classes4.dex */
public final class aq3 implements no3<FeatureBlockStoreDataSource> {
    private final as8<ld0> a;

    public aq3(as8<ld0> as8Var) {
        this.a = as8Var;
    }

    public static aq3 a(as8<ld0> as8Var) {
        return new aq3(as8Var);
    }

    public static FeatureBlockStoreDataSource c(ld0 ld0Var) {
        return new FeatureBlockStoreDataSource(ld0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public FeatureBlockStoreDataSource get() {
        return c(this.a.get());
    }
}
