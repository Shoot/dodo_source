package im.threads.ui.controllers;

import im.threads.business.models.QuickReplyItem;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "quickReplies", "Lim/threads/business/models/QuickReplyItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToQuickReplies$1 extends ej5 implements Function1<QuickReplyItem, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToQuickReplies$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(QuickReplyItem quickReplyItem) {
        invoke2(quickReplyItem);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(QuickReplyItem quickReplyItem) {
        boolean z;
        WeakReference weakReference;
        ChatFragment chatFragment;
        WeakReference weakReference2;
        ChatFragment chatFragment2;
        this.this$0.hasQuickReplies = quickReplyItem != null && (quickReplyItem.getItems().isEmpty() ^ true);
        z = this.this$0.hasQuickReplies;
        if (!z || !this.this$0.isChatWorking$threads_release()) {
            weakReference = this.this$0.fragment;
            if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null) {
                chatFragment.hideQuickReplies();
            }
        } else {
            weakReference2 = this.this$0.fragment;
            if (weakReference2 != null && (chatFragment2 = (ChatFragment) weakReference2.get()) != null) {
                chatFragment2.showQuickReplies(quickReplyItem);
            }
        }
        ChatController.refreshUserInputState$default(this.this$0, null, 1, null);
    }
}
