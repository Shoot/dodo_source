package im.threads.business.models;

import im.threads.business.formatters.SpeechStatus;
import im.threads.business.models.ChatPhrase;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.ogParser.OGData;
import im.threads.business.utils.FileUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConsultPhrase.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B½\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0013¢\u0006\u0002\u0010 J\u0006\u0010_\u001a\u00020\u0000J\u0013\u0010`\u001a\u00020\u00132\b\u0010a\u001a\u0004\u0018\u00010bH\u0096\u0002J\b\u0010c\u001a\u00020dH\u0016J\u0012\u0010e\u001a\u00020\u00132\b\u0010f\u001a\u0004\u0018\u00010gH\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u001a\u00104\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001a\u0010;\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u001a\u0010+R\u0011\u0010=\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b=\u00106R\u0011\u0010>\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b>\u00106R\u0011\u0010\u001f\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u00106R\u0011\u0010?\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b?\u00106R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\"R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00106\"\u0004\bS\u00108R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010\\\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010&¨\u0006h"}, d2 = {"Lim/threads/business/models/ConsultPhrase;", "Lim/threads/business/models/ConsultChatPhrase;", "Lim/threads/business/models/ChatPhrase;", "id", "", "fileDescription", "Lim/threads/business/models/FileDescription;", "modified", "Lim/threads/business/models/enums/ModificationStateEnum;", "quote", "Lim/threads/business/models/Quote;", "consultName", "phraseText", "formattedPhrase", "date", "", "consultId", "avatarPath", "read", "", "status", "sex", "threadId", "quickReplies", "", "Lim/threads/business/models/QuickReply;", "isBlockInput", "speechStatus", "Lim/threads/business/formatters/SpeechStatus;", "role", "Lim/threads/business/models/ConsultRole;", "isPersonalOffer", "(Ljava/lang/String;Lim/threads/business/models/FileDescription;Lim/threads/business/models/enums/ModificationStateEnum;Lim/threads/business/models/Quote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Lim/threads/business/formatters/SpeechStatus;Lim/threads/business/models/ConsultRole;Z)V", "getConsultName", "()Ljava/lang/String;", "setConsultName", "(Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "errorMock", "getErrorMock", "()Ljava/lang/Boolean;", "setErrorMock", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "setFileDescription", "(Lim/threads/business/models/FileDescription;)V", "getFormattedPhrase", "found", "getFound", "()Z", "setFound", "(Z)V", "getId", "setId", "isAvatarVisible", "setAvatarVisible", "isOnlyDoc", "isOnlyImage", "isVoiceMessage", "getModified", "()Lim/threads/business/models/enums/ModificationStateEnum;", "ogData", "Lim/threads/business/ogParser/OGData;", "getOgData", "()Lim/threads/business/ogParser/OGData;", "setOgData", "(Lim/threads/business/ogParser/OGData;)V", "ogUrl", "getOgUrl", "setOgUrl", "getPhraseText", "getQuickReplies", "()Ljava/util/List;", "getQuote", "()Lim/threads/business/models/Quote;", "setQuote", "(Lim/threads/business/models/Quote;)V", "getRead", "setRead", "getRole", "()Lim/threads/business/models/ConsultRole;", "getSex", "getSpeechStatus", "()Lim/threads/business/formatters/SpeechStatus;", "getStatus", "getThreadId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "timeStamp", "getTimeStamp", "copy", "equals", "other", "", "hashCode", "", "isTheSameItem", "otherItem", "Lim/threads/business/models/ChatItem;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsultPhrase extends ConsultChatPhrase implements ChatPhrase {
    private String consultName;
    private long date;
    private Boolean errorMock;
    private FileDescription fileDescription;
    private final String formattedPhrase;
    private boolean found;
    private String id;
    private boolean isAvatarVisible;
    private final Boolean isBlockInput;
    private final boolean isPersonalOffer;
    private final ModificationStateEnum modified;
    private OGData ogData;
    private String ogUrl;
    private final String phraseText;
    private final List<QuickReply> quickReplies;
    private Quote quote;
    private boolean read;
    private final ConsultRole role;
    private final boolean sex;
    private final SpeechStatus speechStatus;
    private final String status;
    private final Long threadId;

    public /* synthetic */ ConsultPhrase(String str, FileDescription fileDescription, ModificationStateEnum modificationStateEnum, Quote quote, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, boolean z2, Long l, List list, Boolean bool, SpeechStatus speechStatus, ConsultRole consultRole, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fileDescription, modificationStateEnum, quote, str2, str3, str4, j, str5, str6, z, str7, z2, l, list, bool, speechStatus, consultRole, (i & 262144) != 0 ? false : z3);
    }

    public final ConsultPhrase copy() {
        ConsultPhrase consultPhrase = new ConsultPhrase(getId(), getFileDescription(), this.modified, getQuote(), this.consultName, getPhraseText(), this.formattedPhrase, this.date, getConsultId(), getAvatarPath(), this.read, this.status, this.sex, getThreadId(), this.quickReplies, this.isBlockInput, this.speechStatus, this.role, false, 262144, null);
        consultPhrase.ogData = this.ogData;
        consultPhrase.ogUrl = this.ogUrl;
        consultPhrase.isAvatarVisible = this.isAvatarVisible;
        consultPhrase.setFound(getFound());
        return consultPhrase;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(ConsultPhrase.class, obj.getClass())) {
            return false;
        }
        ConsultPhrase consultPhrase = (ConsultPhrase) obj;
        if (this.sex == consultPhrase.sex && this.date == consultPhrase.date && this.isAvatarVisible == consultPhrase.isAvatarVisible && this.read == consultPhrase.read && getFound() == consultPhrase.getFound() && p57.a(getId(), consultPhrase.getId()) && p57.a(getPhraseText(), consultPhrase.getPhraseText()) && p57.a(this.formattedPhrase, consultPhrase.formattedPhrase) && p57.a(this.consultName, consultPhrase.consultName) && p57.a(getQuote(), consultPhrase.getQuote()) && p57.a(getFileDescription(), consultPhrase.getFileDescription()) && p57.a(this.status, consultPhrase.status) && p57.a(this.quickReplies, consultPhrase.quickReplies) && p57.a(this.isBlockInput, consultPhrase.isBlockInput) && p57.a(this.ogData, consultPhrase.ogData) && p57.a(this.ogUrl, consultPhrase.ogUrl) && p57.a(getThreadId(), consultPhrase.getThreadId())) {
            return true;
        }
        return false;
    }

    public final String getConsultName() {
        return this.consultName;
    }

    public final long getDate() {
        return this.date;
    }

    public final Boolean getErrorMock() {
        return this.errorMock;
    }

    @Override // im.threads.business.models.ChatPhrase
    public FileDescription getFileDescription() {
        return this.fileDescription;
    }

    public final String getFormattedPhrase() {
        return this.formattedPhrase;
    }

    @Override // im.threads.business.models.ChatPhrase
    public boolean getFound() {
        return this.found;
    }

    @Override // im.threads.business.models.ChatPhrase
    public String getId() {
        return this.id;
    }

    public final ModificationStateEnum getModified() {
        return this.modified;
    }

    public final OGData getOgData() {
        return this.ogData;
    }

    public final String getOgUrl() {
        return this.ogUrl;
    }

    @Override // im.threads.business.models.ChatPhrase
    public String getPhraseText() {
        return this.phraseText;
    }

    public final List<QuickReply> getQuickReplies() {
        return this.quickReplies;
    }

    @Override // im.threads.business.models.ChatPhrase
    public Quote getQuote() {
        return this.quote;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final ConsultRole getRole() {
        return this.role;
    }

    public final boolean getSex() {
        return this.sex;
    }

    public final SpeechStatus getSpeechStatus() {
        return this.speechStatus;
    }

    public final String getStatus() {
        return this.status;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return this.threadId;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.date;
    }

    public int hashCode() {
        return p57.b(getId(), Boolean.valueOf(this.sex), Long.valueOf(this.date), getPhraseText(), this.formattedPhrase, this.consultName, Boolean.valueOf(this.isAvatarVisible), getQuote(), getFileDescription(), Boolean.valueOf(this.read), this.status, this.quickReplies, this.isBlockInput, Boolean.valueOf(getFound()), this.ogData, this.ogUrl, getThreadId());
    }

    public final boolean isAvatarVisible() {
        return this.isAvatarVisible;
    }

    public final Boolean isBlockInput() {
        return this.isBlockInput;
    }

    public final boolean isOnlyDoc() {
        String str;
        String phraseText = getPhraseText();
        if ((phraseText == null || phraseText.length() == 0) && (((str = this.formattedPhrase) == null || str.length() == 0) && getFileDescription() != null && !FileUtils.isImage(getFileDescription()) && !FileUtils.isVoiceMessage(getFileDescription()))) {
            return true;
        }
        return false;
    }

    public final boolean isOnlyImage() {
        String phraseText = getPhraseText();
        if ((phraseText == null || phraseText.length() == 0) && getQuote() == null && FileUtils.isImage(getFileDescription())) {
            return true;
        }
        return false;
    }

    public final boolean isPersonalOffer() {
        return this.isPersonalOffer;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (chatItem instanceof ConsultPhrase) {
            return p57.a(getId(), ((ConsultPhrase) chatItem).getId());
        }
        return false;
    }

    public final boolean isVoiceMessage() {
        if (this.speechStatus == SpeechStatus.NO_SPEECH_STATUS && !FileUtils.isVoiceMessage(getFileDescription())) {
            return false;
        }
        return true;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatPhrase.DefaultImpls.modified(this);
    }

    public final void setAvatarVisible(boolean z) {
        this.isAvatarVisible = z;
    }

    public final void setConsultName(String str) {
        this.consultName = str;
    }

    public final void setDate(long j) {
        this.date = j;
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

    public final void setOgData(OGData oGData) {
        this.ogData = oGData;
    }

    public final void setOgUrl(String str) {
        this.ogUrl = str;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public final void setRead(boolean z) {
        this.read = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultPhrase(String str, FileDescription fileDescription, ModificationStateEnum modificationStateEnum, Quote quote, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, boolean z2, Long l, List<QuickReply> list, Boolean bool, SpeechStatus speechStatus, ConsultRole consultRole, boolean z3) {
        super(str6, str5);
        z65.h(modificationStateEnum, "modified");
        z65.h(speechStatus, "speechStatus");
        z65.h(consultRole, "role");
        this.id = str;
        this.fileDescription = fileDescription;
        this.modified = modificationStateEnum;
        this.quote = quote;
        this.consultName = str2;
        this.phraseText = str3;
        this.formattedPhrase = str4;
        this.date = j;
        this.read = z;
        this.status = str7;
        this.sex = z2;
        this.threadId = l;
        this.quickReplies = list;
        this.isBlockInput = bool;
        this.speechStatus = speechStatus;
        this.role = consultRole;
        this.isPersonalOffer = z3;
        this.isAvatarVisible = true;
    }
}
