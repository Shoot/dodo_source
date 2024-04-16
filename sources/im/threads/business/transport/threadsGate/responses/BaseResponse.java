package im.threads.business.transport.threadsGate.responses;

import im.threads.business.transport.threadsGate.Action;
import kotlin.Metadata;
/* compiled from: BaseResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lim/threads/business/transport/threadsGate/responses/BaseResponse;", "", "Lim/threads/business/transport/threadsGate/Action;", "action", "Lim/threads/business/transport/threadsGate/Action;", "getAction", "()Lim/threads/business/transport/threadsGate/Action;", "", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", "Lmb5;", "data", "Lmb5;", "getData", "()Lmb5;", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BaseResponse {
    private final Action action;
    private final String correlationId;
    private final mb5 data;

    public final Action getAction() {
        return this.action;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final mb5 getData() {
        return this.data;
    }
}
