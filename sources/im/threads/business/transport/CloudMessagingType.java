package im.threads.business.transport;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.HmsMessaging;
import kotlin.Metadata;
/* compiled from: CloudMessagingType.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lim/threads/business/transport/CloudMessagingType;", "", "(Ljava/lang/String;I)V", "fromString", Action.NAME_ATTRIBUTE, "", "FCM", HmsMessaging.DEFAULT_TOKEN_SCOPE, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum CloudMessagingType {
    FCM,
    HCM;

    public final CloudMessagingType fromString(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return valueOf(str);
    }
}
