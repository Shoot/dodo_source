package im.threads.business.models;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ClientNotificationDisplayType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lim/threads/business/models/ClientNotificationDisplayType;", "", "(Ljava/lang/String;I)V", "ALL", "CURRENT_THREAD_ONLY", "CURRENT_THREAD_WITH_GROUPING", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ClientNotificationDisplayType {
    ALL,
    CURRENT_THREAD_ONLY,
    CURRENT_THREAD_WITH_GROUPING;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: ClientNotificationDisplayType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/models/ClientNotificationDisplayType$Companion;", "", "()V", "fromString", "Lim/threads/business/models/ClientNotificationDisplayType;", Action.NAME_ATTRIBUTE, "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientNotificationDisplayType fromString(String str) {
            ClientNotificationDisplayType clientNotificationDisplayType;
            try {
                if (str != null) {
                    clientNotificationDisplayType = ClientNotificationDisplayType.valueOf(str);
                } else {
                    clientNotificationDisplayType = ClientNotificationDisplayType.CURRENT_THREAD_ONLY;
                }
                return clientNotificationDisplayType;
            } catch (IllegalArgumentException unused) {
                return ClientNotificationDisplayType.CURRENT_THREAD_ONLY;
            }
        }
    }
}
