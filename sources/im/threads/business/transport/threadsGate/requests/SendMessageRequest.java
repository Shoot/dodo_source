package im.threads.business.transport.threadsGate.requests;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.threadsGate.Action;
import kotlin.Metadata;
/* compiled from: SendMessageRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lim/threads/business/transport/threadsGate/requests/SendMessageRequest;", "Lim/threads/business/transport/threadsGate/requests/BaseRequest;", "Lim/threads/business/transport/threadsGate/requests/SendMessageRequest$Data;", "correlationId", "", "data", "(Ljava/lang/String;Lim/threads/business/transport/threadsGate/requests/SendMessageRequest$Data;)V", "Data", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendMessageRequest extends BaseRequest<Data> {

    /* compiled from: SendMessageRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lim/threads/business/transport/threadsGate/requests/SendMessageRequest$Data;", "", "", MessageAttributes.DEVICE_ADDRESS, "Ljava/lang/String;", "Lmb5;", RemoteMessageConst.Notification.CONTENT, "Lmb5;", "", "important", "Z", "<init>", "(Ljava/lang/String;Lmb5;Z)V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Data {
        private final mb5 content;
        private final String deviceAddress;
        private final boolean important;

        public Data(String str, mb5 mb5Var, boolean z) {
            z65.h(mb5Var, RemoteMessageConst.Notification.CONTENT);
            this.deviceAddress = str;
            this.content = mb5Var;
            this.important = z;
        }
    }

    public SendMessageRequest(String str, Data data) {
        super(Action.SEND_MESSAGE, str, data);
    }
}
