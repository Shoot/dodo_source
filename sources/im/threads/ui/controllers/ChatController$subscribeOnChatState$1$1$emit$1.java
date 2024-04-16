package im.threads.ui.controllers;

import im.threads.business.state.ChatStateEvent;
import im.threads.ui.controllers.ChatController$subscribeOnChatState$1;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@nn2(c = "im.threads.ui.controllers.ChatController$subscribeOnChatState$1$1", f = "ChatController.kt", l = {1710, 1725}, m = "emit")
/* loaded from: classes3.dex */
public final class ChatController$subscribeOnChatState$1$1$emit$1 extends ev1 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatController$subscribeOnChatState$1.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatController$subscribeOnChatState$1$1$emit$1(ChatController$subscribeOnChatState$1.AnonymousClass1<? super T> anonymousClass1, cv1<? super ChatController$subscribeOnChatState$1$1$emit$1> cv1Var) {
        super(cv1Var);
        this.this$0 = anonymousClass1;
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ChatStateEvent) null, (cv1<? super Unit>) this);
    }
}
