package ru.dodopizza.app.domain.blockstore;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AuthorizationBlockStoreDataSource.kt */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lru/dodopizza/app/domain/blockstore/AuthorizationBlockStoreDataSource;", "", "", "token", "", "save", "find", "Lld0;", "blockStoreDataSource", "Lld0;", "<init>", "(Lld0;)V", "Companion", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AuthorizationBlockStoreDataSource {
    private static final String BLOCK_STORE_KEY = "AUTH_DATA";
    public static final b Companion = new b(null);
    private final ld0 blockStoreDataSource;

    /* compiled from: AuthorizationBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/domain/blockstore/AuthorizationBlockStoreDataSource$a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "token", "<init>", "(Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a implements Serializable {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "AuthorizationDataDto(token=" + str + ")";
        }
    }

    /* compiled from: AuthorizationBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/domain/blockstore/AuthorizationBlockStoreDataSource$b;", "", "", "BLOCK_STORE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AuthorizationBlockStoreDataSource(ld0 ld0Var) {
        z65.h(ld0Var, "blockStoreDataSource");
        this.blockStoreDataSource = ld0Var;
    }

    public final String find() {
        a aVar = (a) this.blockStoreDataSource.i(BLOCK_STORE_KEY);
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public final void save(String str) {
        this.blockStoreDataSource.m(BLOCK_STORE_KEY, new a(str));
    }
}
