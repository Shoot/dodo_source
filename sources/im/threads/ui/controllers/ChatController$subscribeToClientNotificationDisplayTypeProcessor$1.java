package im.threads.ui.controllers;

import im.threads.business.models.ClientNotificationDisplayType;
import im.threads.business.transport.MessageAttributes;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", MessageAttributes.TYPE, "Lim/threads/business/models/ClientNotificationDisplayType;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToClientNotificationDisplayTypeProcessor$1 extends ej5 implements Function1<ClientNotificationDisplayType, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToClientNotificationDisplayTypeProcessor$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClientNotificationDisplayType clientNotificationDisplayType) {
        invoke2(clientNotificationDisplayType);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClientNotificationDisplayType clientNotificationDisplayType) {
        WeakReference weakReference;
        ChatFragment chatFragment;
        weakReference = this.this$0.fragment;
        if (weakReference == null || (chatFragment = (ChatFragment) weakReference.get()) == null) {
            return;
        }
        chatFragment.setClientNotificationDisplayType(clientNotificationDisplayType);
    }
}
