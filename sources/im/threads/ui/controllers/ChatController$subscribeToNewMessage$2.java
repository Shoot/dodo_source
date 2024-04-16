package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.Hidable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "chatItem", "Lim/threads/business/models/ChatItem;", "invoke", "(Lim/threads/business/models/ChatItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatController$subscribeToNewMessage$2 extends ej5 implements Function1<ChatItem, Boolean> {
    public static final ChatController$subscribeToNewMessage$2 INSTANCE = new ChatController$subscribeToNewMessage$2();

    ChatController$subscribeToNewMessage$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ChatItem chatItem) {
        return Boolean.valueOf(chatItem instanceof Hidable);
    }
}
