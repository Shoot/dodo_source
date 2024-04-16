package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lhw7;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hw7  reason: default package */
/* loaded from: classes3.dex */
public final class hw7 extends vo2 {
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw7(String str) {
        super(null);
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hw7) && z65.c(this.a, ((hw7) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = this.a;
        return "PaymentSuccessDeepLinkData(workflowId=" + str + ")";
    }
}
