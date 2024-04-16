package im.threads.business.models;

import java.util.List;
import kotlin.Metadata;
/* compiled from: MessageRead.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lim/threads/business/models/MessageRead;", "Lim/threads/business/models/GetStatusesAction;", "messageId", "", "", "(Ljava/util/List;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageRead extends GetStatusesAction {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRead(List<String> list) {
        super(list);
        z65.h(list, "messageId");
    }
}
