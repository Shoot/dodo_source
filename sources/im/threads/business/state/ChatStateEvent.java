package im.threads.business.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatStateEvent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lim/threads/business/state/ChatStateEvent;", "", "state", "Lim/threads/business/state/ChatStateEnum;", "isTimeout", "", "(Lim/threads/business/state/ChatStateEnum;Z)V", "()Z", "getState", "()Lim/threads/business/state/ChatStateEnum;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatStateEvent {
    private final boolean isTimeout;
    private final ChatStateEnum state;

    public ChatStateEvent(ChatStateEnum chatStateEnum, boolean z) {
        z65.h(chatStateEnum, "state");
        this.state = chatStateEnum;
        this.isTimeout = z;
    }

    public static /* synthetic */ ChatStateEvent copy$default(ChatStateEvent chatStateEvent, ChatStateEnum chatStateEnum, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            chatStateEnum = chatStateEvent.state;
        }
        if ((i & 2) != 0) {
            z = chatStateEvent.isTimeout;
        }
        return chatStateEvent.copy(chatStateEnum, z);
    }

    public final ChatStateEnum component1() {
        return this.state;
    }

    public final boolean component2() {
        return this.isTimeout;
    }

    public final ChatStateEvent copy(ChatStateEnum chatStateEnum, boolean z) {
        z65.h(chatStateEnum, "state");
        return new ChatStateEvent(chatStateEnum, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatStateEvent)) {
            return false;
        }
        ChatStateEvent chatStateEvent = (ChatStateEvent) obj;
        if (this.state == chatStateEvent.state && this.isTimeout == chatStateEvent.isTimeout) {
            return true;
        }
        return false;
    }

    public final ChatStateEnum getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        boolean z = this.isTimeout;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isTimeout() {
        return this.isTimeout;
    }

    public String toString() {
        ChatStateEnum chatStateEnum = this.state;
        boolean z = this.isTimeout;
        return "ChatStateEvent(state=" + chatStateEnum + ", isTimeout=" + z + ")";
    }

    public /* synthetic */ ChatStateEvent(ChatStateEnum chatStateEnum, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatStateEnum, (i & 2) != 0 ? false : z);
    }
}
