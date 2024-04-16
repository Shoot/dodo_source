package im.threads.business.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatStateEnum.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lim/threads/business/state/ChatStateEnum;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "isLastObservableState", "", "LOGGED_OUT", "LOGGING_IN", "REGISTERING_DEVICE", "DEVICE_REGISTERED", "SETTINGS_LOADED", "SENDING_INIT_USER", "INIT_USER_SENT", "HISTORY_LOADED", "THREAD_OPENED", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ChatStateEnum {
    LOGGED_OUT(0),
    LOGGING_IN(1),
    REGISTERING_DEVICE(2),
    DEVICE_REGISTERED(3),
    SETTINGS_LOADED(4),
    SENDING_INIT_USER(5),
    INIT_USER_SENT(6),
    HISTORY_LOADED(7),
    THREAD_OPENED(8);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: ChatStateEnum.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/state/ChatStateEnum$Companion;", "", "()V", "fromValue", "Lim/threads/business/state/ChatStateEnum;", "value", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChatStateEnum fromValue(int i) {
            ChatStateEnum[] values;
            for (ChatStateEnum chatStateEnum : ChatStateEnum.values()) {
                if (chatStateEnum.getValue() == i) {
                    return chatStateEnum;
                }
            }
            return null;
        }
    }

    ChatStateEnum(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isLastObservableState() {
        if (this == THREAD_OPENED) {
            return true;
        }
        return false;
    }
}
