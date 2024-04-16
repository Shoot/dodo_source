package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.Hidable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lim/threads/business/models/Hidable;", "kotlin.jvm.PlatformType", "chatItem", "Lim/threads/business/models/ChatItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatController$subscribeToNewMessage$3 extends ej5 implements Function1<ChatItem, Hidable> {
    public static final ChatController$subscribeToNewMessage$3 INSTANCE = new ChatController$subscribeToNewMessage$3();

    ChatController$subscribeToNewMessage$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Hidable invoke(ChatItem chatItem) {
        z65.h(chatItem, "chatItem");
        return (Hidable) chatItem;
    }
}
