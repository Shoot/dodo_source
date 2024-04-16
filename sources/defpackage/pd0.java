package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.domain.blockstore.FeatureBlockStoreDataSource;
/* compiled from: BlockStoreService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lpd0;", "", "", "isEnabled", "", "b", "Lih4;", "a", "Lih4;", "googlePlayServicesHelper", "Lru/dodopizza/app/domain/blockstore/FeatureBlockStoreDataSource;", "Lru/dodopizza/app/domain/blockstore/FeatureBlockStoreDataSource;", "dataSource", "()Z", "<init>", "(Lih4;Lru/dodopizza/app/domain/blockstore/FeatureBlockStoreDataSource;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pd0  reason: default package */
/* loaded from: classes4.dex */
public final class pd0 {
    private final ih4 a;
    private final FeatureBlockStoreDataSource b;

    public pd0(ih4 ih4Var, FeatureBlockStoreDataSource featureBlockStoreDataSource) {
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(featureBlockStoreDataSource, "dataSource");
        this.a = ih4Var;
        this.b = featureBlockStoreDataSource;
    }

    public final boolean a() {
        Boolean find;
        if (this.a.a() && (find = this.b.find()) != null && find.booleanValue()) {
            return true;
        }
        return false;
    }

    public final void b(boolean z) {
        this.b.save(z);
    }
}
