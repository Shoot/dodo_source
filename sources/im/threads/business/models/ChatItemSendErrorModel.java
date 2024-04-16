package im.threads.business.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatItemSendErrorModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lim/threads/business/models/ChatItemSendErrorModel;", "", "chatItem", "Lim/threads/business/models/ChatItem;", "userPhraseUuid", "", "message", "(Lim/threads/business/models/ChatItem;Ljava/lang/String;Ljava/lang/String;)V", "getChatItem", "()Lim/threads/business/models/ChatItem;", "getMessage", "()Ljava/lang/String;", "getUserPhraseUuid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatItemSendErrorModel {
    private final ChatItem chatItem;
    private final String message;
    private final String userPhraseUuid;

    public ChatItemSendErrorModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChatItemSendErrorModel copy$default(ChatItemSendErrorModel chatItemSendErrorModel, ChatItem chatItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            chatItem = chatItemSendErrorModel.chatItem;
        }
        if ((i & 2) != 0) {
            str = chatItemSendErrorModel.userPhraseUuid;
        }
        if ((i & 4) != 0) {
            str2 = chatItemSendErrorModel.message;
        }
        return chatItemSendErrorModel.copy(chatItem, str, str2);
    }

    public final ChatItem component1() {
        return this.chatItem;
    }

    public final String component2() {
        return this.userPhraseUuid;
    }

    public final String component3() {
        return this.message;
    }

    public final ChatItemSendErrorModel copy(ChatItem chatItem, String str, String str2) {
        return new ChatItemSendErrorModel(chatItem, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatItemSendErrorModel)) {
            return false;
        }
        ChatItemSendErrorModel chatItemSendErrorModel = (ChatItemSendErrorModel) obj;
        if (z65.c(this.chatItem, chatItemSendErrorModel.chatItem) && z65.c(this.userPhraseUuid, chatItemSendErrorModel.userPhraseUuid) && z65.c(this.message, chatItemSendErrorModel.message)) {
            return true;
        }
        return false;
    }

    public final ChatItem getChatItem() {
        return this.chatItem;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUserPhraseUuid() {
        return this.userPhraseUuid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        ChatItem chatItem = this.chatItem;
        int i = 0;
        if (chatItem == null) {
            hashCode = 0;
        } else {
            hashCode = chatItem.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.userPhraseUuid;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        ChatItem chatItem = this.chatItem;
        String str = this.userPhraseUuid;
        String str2 = this.message;
        return "ChatItemSendErrorModel(chatItem=" + chatItem + ", userPhraseUuid=" + str + ", message=" + str2 + ")";
    }

    public ChatItemSendErrorModel(ChatItem chatItem, String str, String str2) {
        this.chatItem = chatItem;
        this.userPhraseUuid = str;
        this.message = str2;
    }

    public /* synthetic */ ChatItemSendErrorModel(ChatItem chatItem, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : chatItem, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
