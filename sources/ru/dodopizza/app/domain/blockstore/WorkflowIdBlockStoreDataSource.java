package ru.dodopizza.app.domain.blockstore;

import androidx.annotation.Keep;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WorkflowIdBlockStoreDataSource.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource;", "", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "localityId", "", "save", "findWorkflowId", "clear", "Lld0;", "blockStoreDataSource", "Lld0;", "<init>", "(Lld0;)V", "Companion", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkflowIdBlockStoreDataSource {
    private static final String BLOCK_STORE_KEY = "WORKFLOW_ID";
    public static final a Companion = new a(null);
    private final ld0 blockStoreDataSource;

    /* compiled from: WorkflowIdBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource$a;", "", "", "BLOCK_STORE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WorkflowIdBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, d2 = {"Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource$b;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "localityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b implements Serializable {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            String str = this.a;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "WorkflowDdo(workflowId=" + str + ", localityId=" + str2 + ")";
        }
    }

    public WorkflowIdBlockStoreDataSource(ld0 ld0Var) {
        z65.h(ld0Var, "blockStoreDataSource");
        this.blockStoreDataSource = ld0Var;
    }

    public final void clear() {
        this.blockStoreDataSource.m(BLOCK_STORE_KEY, new b(null, null));
    }

    public final String findWorkflowId(String str) {
        String str2;
        z65.h(str, "localityId");
        b bVar = (b) this.blockStoreDataSource.i(BLOCK_STORE_KEY);
        if (bVar != null) {
            str2 = bVar.a();
        } else {
            str2 = null;
        }
        if (!z65.c(str2, str)) {
            return null;
        }
        return bVar.b();
    }

    public final void save(String str, String str2) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "localityId");
        this.blockStoreDataSource.m(BLOCK_STORE_KEY, new b(str, str2));
    }
}
