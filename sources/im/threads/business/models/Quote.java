package im.threads.business.models;

import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Quote.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010\u0000J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001d¨\u0006."}, d2 = {"Lim/threads/business/models/Quote;", "", MessageAttributes.UUID, "", "phraseOwnerTitle", "text", "fileDescription", "Lim/threads/business/models/FileDescription;", "timeStamp", "", "modified", "Lim/threads/business/models/enums/ModificationStateEnum;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lim/threads/business/models/FileDescription;JLim/threads/business/models/enums/ModificationStateEnum;)V", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "setFileDescription", "(Lim/threads/business/models/FileDescription;)V", "isFromConsult", "", "()Z", "setFromConsult", "(Z)V", "getModified", "()Lim/threads/business/models/enums/ModificationStateEnum;", "setModified", "(Lim/threads/business/models/enums/ModificationStateEnum;)V", "getPhraseOwnerTitle", "()Ljava/lang/String;", "setPhraseOwnerTitle", "(Ljava/lang/String;)V", "quotedPhraseConsultId", "getQuotedPhraseConsultId", "setQuotedPhraseConsultId", "getText", "setText", "getTimeStamp", "()J", "getUuid", "setUuid", "equals", "other", "hasSameContent", "quote", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Quote {
    private FileDescription fileDescription;
    private boolean isFromConsult;
    private ModificationStateEnum modified;
    private String phraseOwnerTitle;
    private String quotedPhraseConsultId;
    private String text;
    private final long timeStamp;
    private String uuid;

    public Quote(String str, String str2, String str3, FileDescription fileDescription, long j, ModificationStateEnum modificationStateEnum) {
        z65.h(modificationStateEnum, "modified");
        this.uuid = str;
        this.phraseOwnerTitle = str2;
        this.text = str3;
        this.fileDescription = fileDescription;
        this.timeStamp = j;
        this.modified = modificationStateEnum;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(Quote.class, obj.getClass())) {
            return false;
        }
        Quote quote = (Quote) obj;
        if (!p57.a(this.text, quote.text)) {
            return false;
        }
        return p57.a(this.fileDescription, quote.fileDescription);
    }

    public final FileDescription getFileDescription() {
        return this.fileDescription;
    }

    public final ModificationStateEnum getModified() {
        return this.modified;
    }

    public final String getPhraseOwnerTitle() {
        return this.phraseOwnerTitle;
    }

    public final String getQuotedPhraseConsultId() {
        return this.quotedPhraseConsultId;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean hasSameContent(Quote quote) {
        boolean z;
        boolean z2 = false;
        if (quote == null) {
            return false;
        }
        if (p57.a(this.uuid, quote.uuid) && p57.a(this.phraseOwnerTitle, quote.phraseOwnerTitle) && p57.a(this.text, quote.text) && p57.a(this.modified, quote.modified) && p57.a(Long.valueOf(this.timeStamp), Long.valueOf(quote.timeStamp))) {
            z = true;
        } else {
            z = false;
        }
        FileDescription fileDescription = this.fileDescription;
        if (fileDescription != null) {
            if (z) {
                z65.e(fileDescription);
                if (fileDescription.hasSameContent(quote.fileDescription)) {
                    z2 = true;
                }
            }
            return z2;
        }
        return z;
    }

    public int hashCode() {
        int i;
        String str = this.text;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        FileDescription fileDescription = this.fileDescription;
        if (fileDescription != null && fileDescription != null) {
            i2 = fileDescription.hashCode();
        }
        return i3 + i2;
    }

    public final boolean isFromConsult() {
        return this.isFromConsult;
    }

    public final void setFileDescription(FileDescription fileDescription) {
        this.fileDescription = fileDescription;
    }

    public final void setFromConsult(boolean z) {
        this.isFromConsult = z;
    }

    public final void setModified(ModificationStateEnum modificationStateEnum) {
        z65.h(modificationStateEnum, "<set-?>");
        this.modified = modificationStateEnum;
    }

    public final void setPhraseOwnerTitle(String str) {
        this.phraseOwnerTitle = str;
    }

    public final void setQuotedPhraseConsultId(String str) {
        this.quotedPhraseConsultId = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public String toString() {
        String str = this.phraseOwnerTitle;
        String str2 = this.text;
        FileDescription fileDescription = this.fileDescription;
        long j = this.timeStamp;
        boolean z = this.isFromConsult;
        ModificationStateEnum modificationStateEnum = this.modified;
        String str3 = this.quotedPhraseConsultId;
        return "Quote{phraseOwnerTitle='" + str + "', text='" + str2 + "', fileDescription=" + fileDescription + ", timeStamp=" + j + ", isFromConsult=" + z + ", modified=" + modificationStateEnum + ", quotedPhraseConsultId='" + str3 + "'}";
    }

    public /* synthetic */ Quote(String str, String str2, String str3, FileDescription fileDescription, long j, ModificationStateEnum modificationStateEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, fileDescription, j, (i & 32) != 0 ? ModificationStateEnum.NONE : modificationStateEnum);
    }
}
