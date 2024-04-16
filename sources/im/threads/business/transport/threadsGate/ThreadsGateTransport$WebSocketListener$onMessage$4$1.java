package im.threads.business.transport.threadsGate;

import im.threads.business.models.QuestionDTO;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ThreadsGateTransport.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lim/threads/business/models/QuestionDTO;", "invoke", "(Lim/threads/business/models/QuestionDTO;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ThreadsGateTransport$WebSocketListener$onMessage$4$1 extends ej5 implements Function1<QuestionDTO, Boolean> {
    final /* synthetic */ String $questionSendingId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsGateTransport$WebSocketListener$onMessage$4$1(String str) {
        super(1);
        this.$questionSendingId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(QuestionDTO questionDTO) {
        z65.h(questionDTO, "it");
        return Boolean.valueOf(!z65.c(questionDTO.getCorrelationId(), this.$questionSendingId));
    }
}
