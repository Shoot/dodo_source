package im.threads.business.utils.messenger;

import android.content.Context;
import com.huawei.hms.push.e;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItemSendErrorModel;
import im.threads.business.models.UserPhrase;
import im.threads.business.utils.NetworkErrorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessengerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", e.a, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessengerImpl$sendFileMessage$3 extends ej5 implements Function1<Throwable, Unit> {
    final /* synthetic */ UserPhrase $userPhrase;
    final /* synthetic */ MessengerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerImpl$sendFileMessage$3(MessengerImpl messengerImpl, UserPhrase userPhrase) {
        super(1);
        this.this$0 = messengerImpl;
        this.$userPhrase = userPhrase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Context context;
        ChatUpdateProcessor chatUpdateProcessor;
        z65.h(th, e.a);
        String message = th.getMessage();
        z65.e(message);
        int errorStringResByCode = NetworkErrorUtilsKt.getErrorStringResByCode(message);
        context = this.this$0.context;
        String string = context.getString(errorStringResByCode);
        z65.g(string, "context.getString(errorCode)");
        ChatItemSendErrorModel chatItemSendErrorModel = new ChatItemSendErrorModel(null, this.$userPhrase.getId(), string);
        chatUpdateProcessor = this.this$0.getChatUpdateProcessor();
        chatUpdateProcessor.postChatItemSendError(chatItemSendErrorModel);
        LoggerEdna.error(th);
    }
}
