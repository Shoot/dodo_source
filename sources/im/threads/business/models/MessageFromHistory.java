package im.threads.business.models;

import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.utils.DateHelper;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MessageFromHistory.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010v\u001a\u00020!2\b\u0010w\u001a\u0004\u0018\u00010xH\u0096\u0002J\b\u0010y\u001a\u00020LH\u0016J\u0012\u0010z\u001a\u00020!2\b\u0010{\u001a\u0004\u0018\u00010\u0001H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u0015\u0010*\u001a\u0004\u0018\u00010+¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u00020!X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u001a\u00104\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bA\u0010-\"\u0004\bB\u0010CR\"\u0010D\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\"\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001e\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00100\"\u0004\bT\u00102R\u001c\u0010U\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0019\"\u0004\bW\u0010\u001bR\u001e\u0010X\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010PR\u001e\u0010[\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b\\\u0010-\"\u0004\b]\u0010CR\u0013\u0010^\u001a\u0004\u0018\u00010_¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0013\u0010b\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0019R\u001c\u0010d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0019\"\u0004\bf\u0010\u001bR\u001c\u0010g\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0019\"\u0004\bi\u0010\u001bR\u001e\u0010j\u001a\u0004\u0018\u00010+X\u0096\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bk\u0010-\"\u0004\bl\u0010CR\u0014\u0010m\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001c\u0010p\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0019\"\u0004\br\u0010\u001bR\u001c\u0010s\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0019\"\u0004\bu\u0010\u001b¨\u0006|"}, d2 = {"Lim/threads/business/models/MessageFromHistory;", "Lim/threads/business/models/ChatItem;", "()V", MessageAttributes.ATTACHMENTS, "", "Lim/threads/business/models/Attachment;", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", AppsFlyerProperties.CHANNEL, "Lim/threads/business/models/Channel;", "getChannel", "()Lim/threads/business/models/Channel;", "setChannel", "(Lim/threads/business/models/Channel;)V", "client", "Lim/threads/business/models/Client;", "getClient", "()Lim/threads/business/models/Client;", "setClient", "(Lim/threads/business/models/Client;)V", MessageAttributes.CLIENT_ID, "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", RemoteMessageConst.Notification.CONTENT, "Lim/threads/business/models/Survey;", "getContent", "()Lim/threads/business/models/Survey;", "errorMock", "", "getErrorMock", "()Ljava/lang/Boolean;", "setErrorMock", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "formattedText", "getFormattedText", "setFormattedText", "hideAfter", "", "getHideAfter", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isDisplay", "()Z", "setDisplay", "(Z)V", "isPersonalOffer", "isSimple", "setSimple", "modified", "Lim/threads/business/models/enums/ModificationStateEnum;", "getModified", "()Lim/threads/business/models/enums/ModificationStateEnum;", "operator", "Lim/threads/business/models/Operator;", "getOperator", "()Lim/threads/business/models/Operator;", "setOperator", "(Lim/threads/business/models/Operator;)V", "questionId", "getQuestionId", "setQuestionId", "(Ljava/lang/Long;)V", "quickReplies", "Lim/threads/business/models/QuickReply;", "getQuickReplies", "setQuickReplies", MessageAttributes.QUOTES, "getQuotes", "setQuotes", "rate", "", "getRate", "()Ljava/lang/Integer;", "setRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "read", "getRead", "setRead", MessageAttributes.RECEIVED_DATE, "getReceivedDate", "setReceivedDate", "scale", "getScale", "setScale", "sendingId", "getSendingId", "setSendingId", "settings", "Lim/threads/business/models/Settings;", "getSettings", "()Lim/threads/business/models/Settings;", "speechStatus", "getSpeechStatus", "speechText", "getSpeechText", "setSpeechText", "text", "getText", "setText", "threadId", "getThreadId", "setThreadId", "timeStamp", "getTimeStamp", "()J", MessageAttributes.TYPE, "getType", "setType", MessageAttributes.UUID, "getUuid", "setUuid", "equals", "other", "", "hashCode", "isTheSameItem", "otherItem", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageFromHistory implements ChatItem {
    private List<Attachment> attachments;
    private Channel channel;
    private Client client;
    private String clientId;
    private final Survey content;
    private Boolean errorMock;
    private String formattedText;
    private final Long hideAfter;
    private boolean isDisplay;
    private final boolean isPersonalOffer;
    private boolean isSimple;
    private final ModificationStateEnum modified = ModificationStateEnum.NONE;
    private Operator operator;
    private Long questionId;
    private List<QuickReply> quickReplies;
    private List<MessageFromHistory> quotes;
    private Integer rate;
    private boolean read;
    private String receivedDate;
    private Integer scale;
    private Long sendingId;
    private final Settings settings;
    private final String speechStatus;
    private String speechText;
    private String text;
    private Long threadId;
    private String type;
    private String uuid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(MessageFromHistory.class, obj.getClass())) {
            return false;
        }
        MessageFromHistory messageFromHistory = (MessageFromHistory) obj;
        if (this.read == messageFromHistory.read && this.isDisplay == messageFromHistory.isDisplay && this.isSimple == messageFromHistory.isSimple && p57.a(this.uuid, messageFromHistory.uuid) && p57.a(this.clientId, messageFromHistory.clientId) && p57.a(getThreadId(), messageFromHistory.getThreadId()) && p57.a(this.operator, messageFromHistory.operator) && p57.a(this.client, messageFromHistory.client) && p57.a(this.receivedDate, messageFromHistory.receivedDate) && p57.a(this.channel, messageFromHistory.channel) && p57.a(this.formattedText, messageFromHistory.formattedText) && p57.a(this.text, messageFromHistory.text) && p57.a(this.attachments, messageFromHistory.attachments) && p57.a(this.quickReplies, messageFromHistory.quickReplies) && p57.a(this.quotes, messageFromHistory.quotes) && p57.a(this.type, messageFromHistory.type) && p57.a(this.hideAfter, messageFromHistory.hideAfter) && p57.a(this.sendingId, messageFromHistory.sendingId) && p57.a(this.questionId, messageFromHistory.questionId) && p57.a(this.rate, messageFromHistory.rate) && p57.a(this.scale, messageFromHistory.scale)) {
            return true;
        }
        return false;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Client getClient() {
        return this.client;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Survey getContent() {
        return this.content;
    }

    public final Boolean getErrorMock() {
        return this.errorMock;
    }

    public final String getFormattedText() {
        return this.formattedText;
    }

    public final Long getHideAfter() {
        return this.hideAfter;
    }

    public final ModificationStateEnum getModified() {
        return this.modified;
    }

    public final Operator getOperator() {
        return this.operator;
    }

    public final Long getQuestionId() {
        return this.questionId;
    }

    public final List<QuickReply> getQuickReplies() {
        return this.quickReplies;
    }

    public final List<MessageFromHistory> getQuotes() {
        return this.quotes;
    }

    public final Integer getRate() {
        return this.rate;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final String getReceivedDate() {
        return this.receivedDate;
    }

    public final Integer getScale() {
        return this.scale;
    }

    public final Long getSendingId() {
        return this.sendingId;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final String getSpeechStatus() {
        return this.speechStatus;
    }

    public final String getSpeechText() {
        return this.speechText;
    }

    public final String getText() {
        return this.text;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return this.threadId;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return DateHelper.INSTANCE.getMessageTimestampFromDateString(this.receivedDate);
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return p57.b(this.uuid, this.clientId, getThreadId(), this.operator, this.client, this.receivedDate, this.channel, Boolean.valueOf(this.read), this.formattedText, this.text, this.attachments, this.quickReplies, this.quotes, this.type, Boolean.valueOf(this.isDisplay), this.hideAfter, this.sendingId, this.questionId, this.rate, this.scale, Boolean.valueOf(this.isSimple));
    }

    public final boolean isDisplay() {
        return this.isDisplay;
    }

    public final boolean isPersonalOffer() {
        return this.isPersonalOffer;
    }

    public final boolean isSimple() {
        return this.isSimple;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (chatItem instanceof MessageFromHistory) {
            return p57.a(this.uuid, ((MessageFromHistory) chatItem).uuid);
        }
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public final void setAttachments(List<Attachment> list) {
        this.attachments = list;
    }

    public final void setChannel(Channel channel) {
        this.channel = channel;
    }

    public final void setClient(Client client) {
        this.client = client;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setDisplay(boolean z) {
        this.isDisplay = z;
    }

    public final void setErrorMock(Boolean bool) {
        this.errorMock = bool;
    }

    public final void setFormattedText(String str) {
        this.formattedText = str;
    }

    public final void setOperator(Operator operator) {
        this.operator = operator;
    }

    public final void setQuestionId(Long l) {
        this.questionId = l;
    }

    public final void setQuickReplies(List<QuickReply> list) {
        this.quickReplies = list;
    }

    public final void setQuotes(List<MessageFromHistory> list) {
        this.quotes = list;
    }

    public final void setRate(Integer num) {
        this.rate = num;
    }

    public final void setRead(boolean z) {
        this.read = z;
    }

    public final void setReceivedDate(String str) {
        this.receivedDate = str;
    }

    public final void setScale(Integer num) {
        this.scale = num;
    }

    public final void setSendingId(Long l) {
        this.sendingId = l;
    }

    public final void setSimple(boolean z) {
        this.isSimple = z;
    }

    public final void setSpeechText(String str) {
        this.speechText = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public void setThreadId(Long l) {
        this.threadId = l;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }
}
