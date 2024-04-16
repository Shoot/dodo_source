package im.threads.business.chatUpdates;

import im.threads.business.formatters.ChatItemType;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatItemSendErrorModel;
import im.threads.business.models.ClientNotificationDisplayType;
import im.threads.business.models.FileDescription;
import im.threads.business.models.InputFieldEnableModel;
import im.threads.business.models.QuickReplyItem;
import im.threads.business.models.SpeechMessageUpdate;
import im.threads.business.models.Survey;
import im.threads.business.transport.ChatItemProviderData;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.TransportException;
import im.threads.business.transport.models.Attachment;
import im.threads.business.transport.models.AttachmentSettings;
import im.threads.business.transport.threadsGate.responses.Status;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ChatUpdateProcessor.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bp\u0010qJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+J\u000e\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.J\u000e\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u000201J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u000204J\u001a\u00109\u001a\u00020\u00022\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000107J\u0010\u0010<\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010:J\u000e\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040@8\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR#\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070@8\u0006¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0006¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110@8\u0006¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010DR#\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070@8\u0006¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00170@8\u0006¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010DR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020#0@8\u0006¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010DR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001a0@8\u0006¢\u0006\f\n\u0004\bS\u0010B\u001a\u0004\bT\u0010DR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0@8\u0006¢\u0006\f\n\u0004\bU\u0010B\u001a\u0004\bV\u0010DR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020 0@8\u0006¢\u0006\f\n\u0004\bW\u0010B\u001a\u0004\bX\u0010DR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0006¢\u0006\f\n\u0004\bY\u0010B\u001a\u0004\bZ\u0010DR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020(0@8\u0006¢\u0006\f\n\u0004\b[\u0010B\u001a\u0004\b\\\u0010DR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020+0@8\u0006¢\u0006\f\n\u0004\b]\u0010B\u001a\u0004\b^\u0010DR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020.0@8\u0006¢\u0006\f\n\u0004\b_\u0010B\u001a\u0004\b`\u0010DR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000e0@8\u0006¢\u0006\f\n\u0004\ba\u0010B\u001a\u0004\bb\u0010DR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u0002010@8\u0006¢\u0006\f\n\u0004\bc\u0010B\u001a\u0004\bd\u0010DR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u0002040@8\u0006¢\u0006\f\n\u0004\be\u0010B\u001a\u0004\bf\u0010DR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020:0@8\u0006¢\u0006\f\n\u0004\bg\u0010B\u001a\u0004\bh\u0010DR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020=0i8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR)\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001070@8\u0006¢\u0006\f\n\u0004\bn\u0010B\u001a\u0004\bo\u0010D¨\u0006r"}, d2 = {"Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "", "", "postTyping", "Lim/threads/business/transport/models/AttachmentSettings;", "attachmentSettings", "postAttachmentSettings", "", "Lim/threads/business/transport/threadsGate/responses/Status;", "statuses", "postOutgoingMessageStatusChanged", "", "messageId", "postIncomingMessageWasRead", "Lim/threads/business/models/SpeechMessageUpdate;", "speechMessageUpdate", "postSpeechMessageUpdate", "Lim/threads/business/models/ChatItem;", "chatItem", "postNewMessage", "Lim/threads/business/transport/models/Attachment;", MessageAttributes.ATTACHMENTS, "updateAttachments", "Lim/threads/business/transport/ChatItemProviderData;", "chatItemProviderData", "postChatItemSendSuccess", "Lim/threads/business/models/ChatItemSendErrorModel;", "sendErrorModel", "postChatItemSendError", "Lim/threads/business/formatters/ChatItemType;", "chatItemType", "postRemoveChatItem", "Lim/threads/business/models/Survey;", "survey", "postSurveySendSuccess", "Lim/threads/business/models/CampaignMessage;", "campaignMessage", "postCampaignMessageReplySuccess", MessageAttributes.DEVICE_ADDRESS, "postDeviceAddressChanged", "Lim/threads/business/models/InputFieldEnableModel;", "enable", "postUserInputEnableChanged", "Lim/threads/business/models/QuickReplyItem;", "quickReplies", "postQuickRepliesChanged", "Lim/threads/business/models/ClientNotificationDisplayType;", MessageAttributes.TYPE, "postClientNotificationDisplayType", "", "attached", "postAttachAudioFile", "Lim/threads/business/transport/TransportException;", "error", "postError", "", "socketResponseMap", "postSocketResponseMap", "Lim/threads/business/models/FileDescription;", "uploadResult", "postUploadResult", "", "permissionsRequestCode", "postGrantedPermissions", "Li14;", "typingProcessor", "Li14;", "getTypingProcessor", "()Li14;", "attachmentSettingsProcessor", "getAttachmentSettingsProcessor", "outgoingMessageStatusChangedProcessor", "getOutgoingMessageStatusChangedProcessor", "incomingMessageReadProcessor", "getIncomingMessageReadProcessor", "newMessageProcessor", "getNewMessageProcessor", "updateAttachmentsProcessor", "getUpdateAttachmentsProcessor", "messageSendSuccessProcessor", "getMessageSendSuccessProcessor", "campaignMessageReplySuccessProcessor", "getCampaignMessageReplySuccessProcessor", "messageSendErrorProcessor", "getMessageSendErrorProcessor", "removeChatItemProcessor", "getRemoveChatItemProcessor", "surveySendSuccessProcessor", "getSurveySendSuccessProcessor", "deviceAddressChangedProcessor", "getDeviceAddressChangedProcessor", "userInputEnableProcessor", "getUserInputEnableProcessor", "quickRepliesProcessor", "getQuickRepliesProcessor", "clientNotificationDisplayTypeProcessor", "getClientNotificationDisplayTypeProcessor", "speechMessageUpdateProcessor", "getSpeechMessageUpdateProcessor", "attachAudioFilesProcessor", "getAttachAudioFilesProcessor", "errorProcessor", "getErrorProcessor", "uploadResultProcessor", "getUploadResultProcessor", "Lcr6;", "grantedPermissionsFlow", "Lcr6;", "getGrantedPermissionsFlow", "()Lcr6;", "socketResponseMapProcessor", "getSocketResponseMapProcessor", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatUpdateProcessor {
    private final i14<Boolean> attachAudioFilesProcessor;
    private final i14<AttachmentSettings> attachmentSettingsProcessor;
    private final i14<CampaignMessage> campaignMessageReplySuccessProcessor;
    private final i14<ClientNotificationDisplayType> clientNotificationDisplayTypeProcessor;
    private final i14<String> deviceAddressChangedProcessor;
    private final i14<TransportException> errorProcessor;
    private final cr6<Integer> grantedPermissionsFlow;
    private final i14<String> incomingMessageReadProcessor;
    private final i14<ChatItemSendErrorModel> messageSendErrorProcessor;
    private final i14<ChatItemProviderData> messageSendSuccessProcessor;
    private final i14<ChatItem> newMessageProcessor;
    private final i14<List<Status>> outgoingMessageStatusChangedProcessor;
    private final i14<QuickReplyItem> quickRepliesProcessor;
    private final i14<ChatItemType> removeChatItemProcessor;
    private final i14<Map<String, Object>> socketResponseMapProcessor;
    private final i14<SpeechMessageUpdate> speechMessageUpdateProcessor;
    private final i14<Survey> surveySendSuccessProcessor;
    private final i14<String> typingProcessor;
    private final i14<List<Attachment>> updateAttachmentsProcessor;
    private final i14<FileDescription> uploadResultProcessor;
    private final i14<InputFieldEnableModel> userInputEnableProcessor;

    public ChatUpdateProcessor() {
        js8 e0 = js8.e0();
        z65.g(e0, "create()");
        this.typingProcessor = e0;
        js8 e02 = js8.e0();
        z65.g(e02, "create()");
        this.attachmentSettingsProcessor = e02;
        js8 e03 = js8.e0();
        z65.g(e03, "create()");
        this.outgoingMessageStatusChangedProcessor = e03;
        js8 e04 = js8.e0();
        z65.g(e04, "create()");
        this.incomingMessageReadProcessor = e04;
        js8 e05 = js8.e0();
        z65.g(e05, "create()");
        this.newMessageProcessor = e05;
        js8 e06 = js8.e0();
        z65.g(e06, "create()");
        this.updateAttachmentsProcessor = e06;
        js8 e07 = js8.e0();
        z65.g(e07, "create()");
        this.messageSendSuccessProcessor = e07;
        js8 e08 = js8.e0();
        z65.g(e08, "create()");
        this.campaignMessageReplySuccessProcessor = e08;
        js8 e09 = js8.e0();
        z65.g(e09, "create()");
        this.messageSendErrorProcessor = e09;
        js8 e010 = js8.e0();
        z65.g(e010, "create()");
        this.removeChatItemProcessor = e010;
        js8 e011 = js8.e0();
        z65.g(e011, "create()");
        this.surveySendSuccessProcessor = e011;
        js8 e012 = js8.e0();
        z65.g(e012, "create()");
        this.deviceAddressChangedProcessor = e012;
        js8 e013 = js8.e0();
        z65.g(e013, "create()");
        this.userInputEnableProcessor = e013;
        js8 e014 = js8.e0();
        z65.g(e014, "create()");
        this.quickRepliesProcessor = e014;
        js8 e015 = js8.e0();
        z65.g(e015, "create()");
        this.clientNotificationDisplayTypeProcessor = e015;
        js8 e016 = js8.e0();
        z65.g(e016, "create()");
        this.speechMessageUpdateProcessor = e016;
        js8 e017 = js8.e0();
        z65.g(e017, "create()");
        this.attachAudioFilesProcessor = e017;
        js8 e018 = js8.e0();
        z65.g(e018, "create()");
        this.errorProcessor = e018;
        js8 e019 = js8.e0();
        z65.g(e019, "create()");
        this.uploadResultProcessor = e019;
        this.grantedPermissionsFlow = uha.b(0, 0, null, 7, null);
        js8 e020 = js8.e0();
        z65.g(e020, "create()");
        this.socketResponseMapProcessor = e020;
    }

    public final i14<Boolean> getAttachAudioFilesProcessor() {
        return this.attachAudioFilesProcessor;
    }

    public final i14<AttachmentSettings> getAttachmentSettingsProcessor() {
        return this.attachmentSettingsProcessor;
    }

    public final i14<CampaignMessage> getCampaignMessageReplySuccessProcessor() {
        return this.campaignMessageReplySuccessProcessor;
    }

    public final i14<ClientNotificationDisplayType> getClientNotificationDisplayTypeProcessor() {
        return this.clientNotificationDisplayTypeProcessor;
    }

    public final i14<String> getDeviceAddressChangedProcessor() {
        return this.deviceAddressChangedProcessor;
    }

    public final i14<TransportException> getErrorProcessor() {
        return this.errorProcessor;
    }

    public final cr6<Integer> getGrantedPermissionsFlow() {
        return this.grantedPermissionsFlow;
    }

    public final i14<String> getIncomingMessageReadProcessor() {
        return this.incomingMessageReadProcessor;
    }

    public final i14<ChatItemSendErrorModel> getMessageSendErrorProcessor() {
        return this.messageSendErrorProcessor;
    }

    public final i14<ChatItemProviderData> getMessageSendSuccessProcessor() {
        return this.messageSendSuccessProcessor;
    }

    public final i14<ChatItem> getNewMessageProcessor() {
        return this.newMessageProcessor;
    }

    public final i14<List<Status>> getOutgoingMessageStatusChangedProcessor() {
        return this.outgoingMessageStatusChangedProcessor;
    }

    public final i14<QuickReplyItem> getQuickRepliesProcessor() {
        return this.quickRepliesProcessor;
    }

    public final i14<ChatItemType> getRemoveChatItemProcessor() {
        return this.removeChatItemProcessor;
    }

    public final i14<Map<String, Object>> getSocketResponseMapProcessor() {
        return this.socketResponseMapProcessor;
    }

    public final i14<SpeechMessageUpdate> getSpeechMessageUpdateProcessor() {
        return this.speechMessageUpdateProcessor;
    }

    public final i14<Survey> getSurveySendSuccessProcessor() {
        return this.surveySendSuccessProcessor;
    }

    public final i14<String> getTypingProcessor() {
        return this.typingProcessor;
    }

    public final i14<List<Attachment>> getUpdateAttachmentsProcessor() {
        return this.updateAttachmentsProcessor;
    }

    public final i14<FileDescription> getUploadResultProcessor() {
        return this.uploadResultProcessor;
    }

    public final i14<InputFieldEnableModel> getUserInputEnableProcessor() {
        return this.userInputEnableProcessor;
    }

    public final void postAttachAudioFile(boolean z) {
        this.attachAudioFilesProcessor.d(Boolean.valueOf(z));
    }

    public final void postAttachmentSettings(AttachmentSettings attachmentSettings) {
        z65.h(attachmentSettings, "attachmentSettings");
        this.attachmentSettingsProcessor.d(attachmentSettings);
    }

    public final void postCampaignMessageReplySuccess(CampaignMessage campaignMessage) {
        z65.h(campaignMessage, "campaignMessage");
        this.campaignMessageReplySuccessProcessor.d(campaignMessage);
    }

    public final void postChatItemSendError(ChatItemSendErrorModel chatItemSendErrorModel) {
        z65.h(chatItemSendErrorModel, "sendErrorModel");
        this.messageSendErrorProcessor.d(chatItemSendErrorModel);
    }

    public final void postChatItemSendSuccess(ChatItemProviderData chatItemProviderData) {
        z65.h(chatItemProviderData, "chatItemProviderData");
        this.messageSendSuccessProcessor.d(chatItemProviderData);
    }

    public final void postClientNotificationDisplayType(ClientNotificationDisplayType clientNotificationDisplayType) {
        z65.h(clientNotificationDisplayType, MessageAttributes.TYPE);
        this.clientNotificationDisplayTypeProcessor.d(clientNotificationDisplayType);
    }

    public final void postDeviceAddressChanged(String str) {
        z65.h(str, MessageAttributes.DEVICE_ADDRESS);
        this.deviceAddressChangedProcessor.d(str);
    }

    public final void postError(TransportException transportException) {
        z65.h(transportException, "error");
        this.errorProcessor.d(transportException);
    }

    public final void postGrantedPermissions(int i) {
        sh0.d(rx1.a(v33.d()), null, null, new ChatUpdateProcessor$postGrantedPermissions$1(this, i, null), 3, null);
    }

    public final void postIncomingMessageWasRead(String str) {
        z65.h(str, "messageId");
        this.incomingMessageReadProcessor.d(str);
    }

    public final void postNewMessage(ChatItem chatItem) {
        z65.h(chatItem, "chatItem");
        this.newMessageProcessor.d(chatItem);
    }

    public final void postOutgoingMessageStatusChanged(List<Status> list) {
        z65.h(list, "statuses");
        this.outgoingMessageStatusChangedProcessor.d(list);
    }

    public final void postQuickRepliesChanged(QuickReplyItem quickReplyItem) {
        z65.h(quickReplyItem, "quickReplies");
        this.quickRepliesProcessor.d(quickReplyItem);
    }

    public final void postRemoveChatItem(ChatItemType chatItemType) {
        z65.h(chatItemType, "chatItemType");
        this.removeChatItemProcessor.d(chatItemType);
    }

    public final void postSocketResponseMap(Map<String, ? extends Object> map) {
        z65.h(map, "socketResponseMap");
        this.socketResponseMapProcessor.d(map);
    }

    public final void postSpeechMessageUpdate(SpeechMessageUpdate speechMessageUpdate) {
        z65.h(speechMessageUpdate, "speechMessageUpdate");
        this.speechMessageUpdateProcessor.d(speechMessageUpdate);
    }

    public final void postSurveySendSuccess(Survey survey) {
        z65.h(survey, "survey");
        this.surveySendSuccessProcessor.d(survey);
    }

    public final void postTyping() {
        this.typingProcessor.d("");
    }

    public final void postUploadResult(FileDescription fileDescription) {
        this.uploadResultProcessor.d(fileDescription);
    }

    public final void postUserInputEnableChanged(InputFieldEnableModel inputFieldEnableModel) {
        z65.h(inputFieldEnableModel, "enable");
        this.userInputEnableProcessor.d(inputFieldEnableModel);
    }

    public final void updateAttachments(List<Attachment> list) {
        z65.h(list, MessageAttributes.ATTACHMENTS);
        this.updateAttachmentsProcessor.d(list);
    }
}
