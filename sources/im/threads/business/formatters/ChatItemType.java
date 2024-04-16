package im.threads.business.formatters;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatItemType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b)\b\u0086\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001)B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006*"}, d2 = {"Lim/threads/business/formatters/ChatItemType;", "", "(Ljava/lang/String;I)V", "TYPING", "ATTACHMENT_SETTINGS", "SCHEDULE", "SURVEY", "REQUEST_CLOSE_THREAD", "MESSAGE", "MIRROR", "ON_HOLD", "NONE", "MESSAGES_READ", "REMOVE_PUSHES", "UNREAD_MESSAGE_NOTIFICATION", "CLIENT_BLOCKED", "SCENARIO", "CHAT_PUSH", "MESSAGE_EDITED", "MESSAGE_DELETED", "THREAD_ENQUEUED", "AVERAGE_WAIT_TIME", "PARTING_AFTER_SURVEY", "OPERATOR_JOINED", "THREAD_CLOSED", "THREAD_WILL_BE_REASSIGNED", "THREAD_IN_PROGRESS", "ATTACHMENT_UPDATED", "OPERATOR_LEFT", "OPERATOR_LOOKUP_STARTED", "CLIENT_PERSONAL_DATA_PROCESSING", "THREAD_OPENED", "INIT_CHAT", "CLIENT_INFO", "SURVEY_QUESTION_ANSWER", "CLOSE_THREAD", "REOPEN_THREAD", "CLIENT_OFFLINE", "SPEECH_MESSAGE_UPDATED", "UPDATE_LOCATION", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ChatItemType {
    TYPING,
    ATTACHMENT_SETTINGS,
    SCHEDULE,
    SURVEY,
    REQUEST_CLOSE_THREAD,
    MESSAGE,
    MIRROR,
    ON_HOLD,
    NONE,
    MESSAGES_READ,
    REMOVE_PUSHES,
    UNREAD_MESSAGE_NOTIFICATION,
    CLIENT_BLOCKED,
    SCENARIO,
    CHAT_PUSH,
    MESSAGE_EDITED,
    MESSAGE_DELETED,
    THREAD_ENQUEUED,
    AVERAGE_WAIT_TIME,
    PARTING_AFTER_SURVEY,
    OPERATOR_JOINED,
    THREAD_CLOSED,
    THREAD_WILL_BE_REASSIGNED,
    THREAD_IN_PROGRESS,
    ATTACHMENT_UPDATED,
    OPERATOR_LEFT,
    OPERATOR_LOOKUP_STARTED,
    CLIENT_PERSONAL_DATA_PROCESSING,
    THREAD_OPENED,
    INIT_CHAT,
    CLIENT_INFO,
    SURVEY_QUESTION_ANSWER,
    CLOSE_THREAD,
    REOPEN_THREAD,
    CLIENT_OFFLINE,
    SPEECH_MESSAGE_UPDATED,
    UPDATE_LOCATION,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: ChatItemType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lim/threads/business/formatters/ChatItemType$Companion;", "", "()V", "fromString", "Lim/threads/business/formatters/ChatItemType;", Action.NAME_ATTRIBUTE, "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChatItemType fromString(String str) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            try {
                return ChatItemType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                return ChatItemType.UNKNOWN;
            }
        }
    }

    public static final ChatItemType fromString(String str) {
        return Companion.fromString(str);
    }
}
