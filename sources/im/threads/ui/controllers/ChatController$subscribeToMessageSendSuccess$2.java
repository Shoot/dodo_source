package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.business.models.UserPhrase;
import im.threads.business.utils.messenger.Messenger;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chatItem", "Lim/threads/business/models/ChatItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToMessageSendSuccess$2 extends ej5 implements Function1<ChatItem, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToMessageSendSuccess$2(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatItem chatItem) {
        invoke2(chatItem);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatItem chatItem) {
        WeakReference weakReference;
        Messenger messenger;
        ChatFragment chatFragment;
        if (chatItem instanceof UserPhrase) {
            weakReference = this.this$0.fragment;
            if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null) {
                chatFragment.addChatItem(chatItem);
            }
            messenger = this.this$0.messenger;
            messenger.proceedSendingQueue((UserPhrase) chatItem);
        }
    }
}
