package im.threads.business.models;

import android.text.TextUtils;
import im.threads.business.models.ChatPhrase;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.utils.FileUtils;
import java.util.UUID;
import kotlin.Metadata;
/* compiled from: UserPhrase.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fB7\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rBG\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0014J\u0013\u0010G\u001a\u00020!2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\u0006\u0010J\u001a\u00020!J\b\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u00020!2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010P\u001a\u00020\u0003H\u0016R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001a\u00102\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u0011\u00104\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b4\u0010-R\u0011\u00105\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b5\u0010-R\u001a\u00106\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\u0014\u00108\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0017R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006Q"}, d2 = {"Lim/threads/business/models/UserPhrase;", "Lim/threads/business/models/ChatPhrase;", MessageAttributes.UUID, "", "phrase", "mQuote", "Lim/threads/business/models/Quote;", "phraseTimeStamp", "", "fileDescription", "Lim/threads/business/models/FileDescription;", "threadId", "(Ljava/lang/String;Ljava/lang/String;Lim/threads/business/models/Quote;JLim/threads/business/models/FileDescription;Ljava/lang/Long;)V", "(Ljava/lang/String;Lim/threads/business/models/Quote;JLim/threads/business/models/FileDescription;Ljava/lang/Long;)V", "id", "phraseText", "quote", "timeStamp", "sentState", "Lim/threads/business/models/MessageStatus;", "(Ljava/lang/String;Ljava/lang/String;Lim/threads/business/models/Quote;JLim/threads/business/models/FileDescription;Lim/threads/business/models/MessageStatus;Ljava/lang/Long;)V", "backendMessageId", "getBackendMessageId", "()Ljava/lang/String;", "setBackendMessageId", "(Ljava/lang/String;)V", "campaignMessage", "Lim/threads/business/models/CampaignMessage;", "getCampaignMessage", "()Lim/threads/business/models/CampaignMessage;", "setCampaignMessage", "(Lim/threads/business/models/CampaignMessage;)V", "errorMock", "", "getErrorMock", "()Ljava/lang/Boolean;", "setErrorMock", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "setFileDescription", "(Lim/threads/business/models/FileDescription;)V", "found", "getFound", "()Z", "setFound", "(Z)V", "getId", "setId", "isCopy", "setCopy", "isOnlyDoc", "isOnlyImage", "isRead", "setRead", "ogUrl", "getPhraseText", "getQuote", "()Lim/threads/business/models/Quote;", "getSentState", "()Lim/threads/business/models/MessageStatus;", "setSentState", "(Lim/threads/business/models/MessageStatus;)V", "getThreadId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "equals", "other", "", "hasFile", "hashCode", "", "isTheSameItem", "otherItem", "Lim/threads/business/models/ChatItem;", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserPhrase implements ChatPhrase {
    private String backendMessageId;
    private CampaignMessage campaignMessage;
    private Boolean errorMock;
    private FileDescription fileDescription;
    private boolean found;
    private String id;
    private boolean isCopy;
    private boolean isRead;
    public String ogUrl;
    private final String phraseText;
    private final Quote quote;
    private MessageStatus sentState;
    private final Long threadId;
    private long timeStamp;

    public UserPhrase(String str, String str2, Quote quote, long j, FileDescription fileDescription, MessageStatus messageStatus, Long l) {
        z65.h(messageStatus, "sentState");
        this.id = str;
        this.phraseText = str2;
        this.quote = quote;
        this.timeStamp = j;
        this.fileDescription = fileDescription;
        this.sentState = messageStatus;
        this.threadId = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(UserPhrase.class, obj.getClass())) {
            return false;
        }
        UserPhrase userPhrase = (UserPhrase) obj;
        if (getTimeStamp() == userPhrase.getTimeStamp() && this.isCopy == userPhrase.isCopy && getFound() == userPhrase.getFound() && p57.a(getId(), userPhrase.getId()) && p57.a(getPhraseText(), userPhrase.getPhraseText()) && this.sentState == userPhrase.sentState && p57.a(getQuote(), userPhrase.getQuote()) && p57.a(getFileDescription(), userPhrase.getFileDescription()) && p57.a(this.ogUrl, userPhrase.ogUrl) && p57.a(getThreadId(), userPhrase.getThreadId()) && p57.a(this.sentState, userPhrase.sentState)) {
            return true;
        }
        return false;
    }

    public final String getBackendMessageId() {
        return this.backendMessageId;
    }

    public final CampaignMessage getCampaignMessage() {
        return this.campaignMessage;
    }

    public final Boolean getErrorMock() {
        return this.errorMock;
    }

    @Override // im.threads.business.models.ChatPhrase
    public FileDescription getFileDescription() {
        return this.fileDescription;
    }

    @Override // im.threads.business.models.ChatPhrase
    public boolean getFound() {
        return this.found;
    }

    @Override // im.threads.business.models.ChatPhrase
    public String getId() {
        return this.id;
    }

    @Override // im.threads.business.models.ChatPhrase
    public String getPhraseText() {
        return this.phraseText;
    }

    @Override // im.threads.business.models.ChatPhrase
    public Quote getQuote() {
        return this.quote;
    }

    public final MessageStatus getSentState() {
        return this.sentState;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return this.threadId;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public final boolean hasFile() {
        FileDescription fileDescription;
        if (getFileDescription() == null) {
            Quote quote = getQuote();
            if (quote != null) {
                fileDescription = quote.getFileDescription();
            } else {
                fileDescription = null;
            }
            if (fileDescription == null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return p57.b(getId(), getPhraseText(), this.sentState, getQuote(), Long.valueOf(getTimeStamp()), getFileDescription(), Boolean.valueOf(this.isCopy), Boolean.valueOf(getFound()), this.ogUrl, getThreadId());
    }

    public final boolean isCopy() {
        return this.isCopy;
    }

    public final boolean isOnlyDoc() {
        if (TextUtils.isEmpty(getPhraseText()) && getFileDescription() != null && getQuote() == null && !FileUtils.isImage(getFileDescription()) && !FileUtils.isVoiceMessage(getFileDescription())) {
            return true;
        }
        return false;
    }

    public final boolean isOnlyImage() {
        if (TextUtils.isEmpty(getPhraseText()) && getQuote() == null && FileUtils.isImage(getFileDescription())) {
            return true;
        }
        return false;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (chatItem instanceof UserPhrase) {
            return z65.c(getId(), ((UserPhrase) chatItem).getId());
        }
        return false;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatPhrase.DefaultImpls.modified(this);
    }

    public final void setBackendMessageId(String str) {
        this.backendMessageId = str;
    }

    public final void setCampaignMessage(CampaignMessage campaignMessage) {
        this.campaignMessage = campaignMessage;
    }

    public final void setCopy(boolean z) {
        this.isCopy = z;
    }

    public final void setErrorMock(Boolean bool) {
        this.errorMock = bool;
    }

    public void setFileDescription(FileDescription fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override // im.threads.business.models.ChatPhrase
    public void setFound(boolean z) {
        this.found = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setSentState(MessageStatus messageStatus) {
        z65.h(messageStatus, "<set-?>");
        this.sentState = messageStatus;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        String f;
        String phraseText = getPhraseText();
        f = e0b.f("UserPhrase{phrase='" + phraseText + "'}");
        return f;
    }

    public UserPhrase(String str, String str2, Quote quote, long j, FileDescription fileDescription, Long l) {
        this(str, str2, quote, j, fileDescription, MessageStatus.SENDING, l);
    }

    public UserPhrase(String str, Quote quote, long j, FileDescription fileDescription, Long l) {
        this(UUID.randomUUID().toString(), str, quote, j, fileDescription, MessageStatus.SENDING, l);
    }
}
