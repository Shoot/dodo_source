package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "lhs", "Lim/threads/business/models/ChatItem;", "rhs", "invoke", "(Lim/threads/business/models/ChatItem;Lim/threads/business/models/ChatItem;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatController$getUncompletedUserPhraseTimestamp$2 extends ej5 implements Function2<ChatItem, ChatItem, Integer> {
    public static final ChatController$getUncompletedUserPhraseTimestamp$2 INSTANCE = new ChatController$getUncompletedUserPhraseTimestamp$2();

    ChatController$getUncompletedUserPhraseTimestamp$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(ChatItem chatItem, ChatItem chatItem2) {
        z65.h(chatItem, "lhs");
        z65.h(chatItem2, "rhs");
        return Integer.valueOf(z65.k(chatItem.getTimeStamp(), chatItem2.getTimeStamp()));
    }
}
