package im.threads.business.transport.threadsGate.requests;

import im.threads.business.transport.threadsGate.Action;
import kotlin.Metadata;
/* compiled from: BaseRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, d2 = {"Lim/threads/business/transport/threadsGate/requests/BaseRequest;", "Data", "", "action", "Lim/threads/business/transport/threadsGate/Action;", "correlationId", "", "data", "(Lim/threads/business/transport/threadsGate/Action;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseRequest<Data> {
    private final Action action;
    private final String correlationId;
    private final Data data;

    public BaseRequest(Action action, String str, Data data) {
        z65.h(action, "action");
        this.action = action;
        this.correlationId = str;
        this.data = data;
    }
}
