package im.threads.ui.controllers;

import im.threads.business.formatters.ChatItemType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "chatItemType", "Lim/threads/business/formatters/ChatItemType;", "invoke", "(Lim/threads/business/formatters/ChatItemType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatController$subscribeToRemoveChatItem$1 extends ej5 implements Function1<ChatItemType, Boolean> {
    public static final ChatController$subscribeToRemoveChatItem$1 INSTANCE = new ChatController$subscribeToRemoveChatItem$1();

    ChatController$subscribeToRemoveChatItem$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ChatItemType chatItemType) {
        z65.h(chatItemType, "chatItemType");
        return Boolean.valueOf(chatItemType == ChatItemType.REQUEST_CLOSE_THREAD);
    }
}
