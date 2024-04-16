package im.threads.ui.controllers;

import im.threads.business.models.ChatItem;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatItems", "", "Lim/threads/business/models/ChatItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$bindFragment$2 extends ej5 implements Function1<List<? extends ChatItem>, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$bindFragment$2(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends ChatItem> list) {
        invoke2(list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends ChatItem> list) {
        WeakReference weakReference;
        ChatFragment chatFragment;
        z65.h(list, "chatItems");
        weakReference = this.this$0.fragment;
        if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null) {
            chatFragment.addChatItems(list, true);
        }
        this.this$0.handleQuickReplies(list);
    }
}
