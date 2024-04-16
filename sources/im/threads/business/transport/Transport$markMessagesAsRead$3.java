package im.threads.business.transport;

import com.huawei.hms.push.e;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.rest.queries.ThreadsApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transport.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", e.a, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Transport$markMessagesAsRead$3 extends ej5 implements Function1<Throwable, Unit> {
    final /* synthetic */ List<String> $uuidList;
    final /* synthetic */ Transport this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transport$markMessagesAsRead$3(List<String> list, Transport transport) {
        super(1);
        this.$uuidList = list;
        this.this$0 = transport;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        String message;
        ChatUpdateProcessor chatUpdateProcessor;
        boolean y;
        z65.h(th, e.a);
        List<String> list = this.$uuidList;
        LoggerEdna.info(ThreadsApi.REST_TAG, "error on messages read : " + list);
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            y = l0b.y(localizedMessage);
            if (!y) {
                message = th.getLocalizedMessage();
                chatUpdateProcessor = this.this$0.getChatUpdateProcessor();
                chatUpdateProcessor.postError(new TransportException(message));
            }
        }
        message = th.getMessage();
        chatUpdateProcessor = this.this$0.getChatUpdateProcessor();
        chatUpdateProcessor.postError(new TransportException(message));
    }
}
