package defpackage;

import ru.dodopizza.app.domain.blockstore.FeatureBlockStoreDataSource;
/* compiled from: BlockStoreService_Factory.java */
/* renamed from: qd0  reason: default package */
/* loaded from: classes4.dex */
public final class qd0 implements no3<pd0> {
    private final as8<ih4> a;
    private final as8<FeatureBlockStoreDataSource> b;

    public qd0(as8<ih4> as8Var, as8<FeatureBlockStoreDataSource> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static qd0 a(as8<ih4> as8Var, as8<FeatureBlockStoreDataSource> as8Var2) {
        return new qd0(as8Var, as8Var2);
    }

    public static pd0 c(ih4 ih4Var, FeatureBlockStoreDataSource featureBlockStoreDataSource) {
        return new pd0(ih4Var, featureBlockStoreDataSource);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pd0 get() {
        return c(this.a.get(), this.b.get());
    }
}
