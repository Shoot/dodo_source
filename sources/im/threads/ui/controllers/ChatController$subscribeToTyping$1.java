package im.threads.ui.controllers;

import im.threads.business.models.ConsultTyping;
import im.threads.business.utils.ConsultWriter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lim/threads/business/models/ConsultTyping;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToTyping$1 extends ej5 implements Function1<String, ConsultTyping> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToTyping$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConsultTyping invoke(String str) {
        ConsultWriter consultWriter;
        ConsultWriter consultWriter2;
        z65.h(str, "it");
        consultWriter = this.this$0.getConsultWriter();
        String currentConsultId = consultWriter.getCurrentConsultId();
        long currentTimeMillis = System.currentTimeMillis();
        consultWriter2 = this.this$0.getConsultWriter();
        return new ConsultTyping(currentConsultId, currentTimeMillis, consultWriter2.getCurrentPhotoUrl());
    }
}
