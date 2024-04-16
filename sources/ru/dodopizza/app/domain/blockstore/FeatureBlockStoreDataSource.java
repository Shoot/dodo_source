package ru.dodopizza.app.domain.blockstore;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FeatureBlockStoreDataSource.kt */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lru/dodopizza/app/domain/blockstore/FeatureBlockStoreDataSource;", "", "", "isEnabled", "", "save", "find", "()Ljava/lang/Boolean;", "Lld0;", "blockStoreDataSource", "Lld0;", "<init>", "(Lld0;)V", "Companion", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FeatureBlockStoreDataSource {
    public static final a Companion = new a(null);
    private static final String KEY = "IS_ENABLED";
    private final ld0 blockStoreDataSource;

    /* compiled from: FeatureBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/domain/blockstore/FeatureBlockStoreDataSource$a;", "", "", "KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FeatureBlockStoreDataSource(ld0 ld0Var) {
        z65.h(ld0Var, "blockStoreDataSource");
        this.blockStoreDataSource = ld0Var;
    }

    public final Boolean find() {
        return (Boolean) this.blockStoreDataSource.i(KEY);
    }

    public final void save(boolean z) {
        this.blockStoreDataSource.m(KEY, Boolean.valueOf(z));
    }
}
