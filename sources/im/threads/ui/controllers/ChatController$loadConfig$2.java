package im.threads.ui.controllers;

import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.rest.models.ConfigResponse;
import im.threads.business.state.ChatState;
import im.threads.business.state.ChatStateEnum;
import im.threads.business.transport.TransportException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lim/threads/business/rest/models/ConfigResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$loadConfig$2 extends ej5 implements Function1<Response<ConfigResponse>, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadConfig$2(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Response<ConfigResponse> response) {
        invoke2(response);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Response<ConfigResponse> response) {
        String errorMessage;
        ChatUpdateProcessor chatUpdateProcessor;
        boolean updateSettings;
        boolean updateAttachmentSettings;
        String errorMessage2;
        ChatUpdateProcessor chatUpdateProcessor2;
        ChatState chatState;
        if (response == null || !response.isSuccessful()) {
            errorMessage = this.this$0.getErrorMessage(false, false);
            LoggerEdna.error("error on getting settings: " + errorMessage);
            chatUpdateProcessor = this.this$0.getChatUpdateProcessor();
            chatUpdateProcessor.postError(new TransportException(errorMessage));
            return;
        }
        ConfigResponse body = response.body();
        if (body != null) {
            updateSettings = this.this$0.updateSettings(body.getSettings());
            updateAttachmentSettings = this.this$0.updateAttachmentSettings(body.getAttachmentSettings());
            this.this$0.updateSchedule(body.getSchedule());
            if (!updateSettings || !updateAttachmentSettings) {
                errorMessage2 = this.this$0.getErrorMessage(updateSettings, updateAttachmentSettings);
                LoggerEdna.info("error on getting settings: " + errorMessage2);
                chatUpdateProcessor2 = this.this$0.getChatUpdateProcessor();
                chatUpdateProcessor2.postError(new TransportException(errorMessage2));
                return;
            }
            chatState = this.this$0.getChatState();
            chatState.changeState(ChatStateEnum.SETTINGS_LOADED);
        }
    }
}
