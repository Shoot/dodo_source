package im.threads.business.transport.threadsGate.responses;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GetStatusesData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lim/threads/business/transport/threadsGate/responses/GetStatusesData;", "", "statuses", "", "Lim/threads/business/transport/threadsGate/responses/Status;", "(Ljava/util/List;)V", "getStatuses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetStatusesData {
    private final List<Status> statuses;

    public GetStatusesData() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetStatusesData copy$default(GetStatusesData getStatusesData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getStatusesData.statuses;
        }
        return getStatusesData.copy(list);
    }

    public final List<Status> component1() {
        return this.statuses;
    }

    public final GetStatusesData copy(List<Status> list) {
        return new GetStatusesData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GetStatusesData) && z65.c(this.statuses, ((GetStatusesData) obj).statuses)) {
            return true;
        }
        return false;
    }

    public final List<Status> getStatuses() {
        return this.statuses;
    }

    public int hashCode() {
        List<Status> list = this.statuses;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<Status> list = this.statuses;
        return "GetStatusesData(statuses=" + list + ")";
    }

    public GetStatusesData(List<Status> list) {
        this.statuses = list;
    }

    public /* synthetic */ GetStatusesData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
