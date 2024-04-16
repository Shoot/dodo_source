package im.threads.business.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MessageStatus.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lim/threads/business/models/MessageStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SENDING", "FAILED", "SENT", "ENQUEUED", "DELIVERED", "READ", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum MessageStatus {
    SENDING(0),
    FAILED(1),
    SENT(2),
    ENQUEUED(3),
    DELIVERED(4),
    READ(5);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: MessageStatus.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lim/threads/business/models/MessageStatus$Companion;", "", "()V", "fromOrdinal", "Lim/threads/business/models/MessageStatus;", "ordinal", "", "fromString", "string", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MessageStatus fromOrdinal(int i) {
            return MessageStatus.values()[i];
        }

        public final MessageStatus fromString(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1281977283:
                    if (str.equals("failed")) {
                        return MessageStatus.FAILED;
                    }
                    break;
                case -242327420:
                    if (str.equals("delivered")) {
                        return MessageStatus.DELIVERED;
                    }
                    break;
                case 3496342:
                    if (str.equals("read")) {
                        return MessageStatus.READ;
                    }
                    break;
                case 3526552:
                    if (str.equals("sent")) {
                        return MessageStatus.SENT;
                    }
                    break;
                case 2117612380:
                    if (str.equals("enqueued")) {
                        return MessageStatus.ENQUEUED;
                    }
                    break;
            }
            return MessageStatus.SENDING;
        }
    }

    MessageStatus(int i) {
        this.value = i;
    }

    public static final MessageStatus fromOrdinal(int i) {
        return Companion.fromOrdinal(i);
    }

    public static final MessageStatus fromString(String str) {
        return Companion.fromString(str);
    }

    public final int getValue() {
        return this.value;
    }
}
