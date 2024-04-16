package im.threads.business.models;

import kotlin.Metadata;
/* compiled from: UpcomingUserMessage.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lim/threads/business/models/UpcomingUserMessage;", "", "fileDescription", "Lim/threads/business/models/FileDescription;", "campaignMessage", "Lim/threads/business/models/CampaignMessage;", "quote", "Lim/threads/business/models/Quote;", "text", "", "copied", "", "(Lim/threads/business/models/FileDescription;Lim/threads/business/models/CampaignMessage;Lim/threads/business/models/Quote;Ljava/lang/String;Z)V", "getCampaignMessage", "()Lim/threads/business/models/CampaignMessage;", "getCopied", "()Z", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "getQuote", "()Lim/threads/business/models/Quote;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpcomingUserMessage {
    private final CampaignMessage campaignMessage;
    private final boolean copied;
    private final FileDescription fileDescription;
    private final Quote quote;
    private final String text;

    public UpcomingUserMessage(FileDescription fileDescription, CampaignMessage campaignMessage, Quote quote, String str, boolean z) {
        this.fileDescription = fileDescription;
        this.campaignMessage = campaignMessage;
        this.quote = quote;
        this.text = str;
        this.copied = z;
    }

    public static /* synthetic */ UpcomingUserMessage copy$default(UpcomingUserMessage upcomingUserMessage, FileDescription fileDescription, CampaignMessage campaignMessage, Quote quote, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fileDescription = upcomingUserMessage.fileDescription;
        }
        if ((i & 2) != 0) {
            campaignMessage = upcomingUserMessage.campaignMessage;
        }
        CampaignMessage campaignMessage2 = campaignMessage;
        if ((i & 4) != 0) {
            quote = upcomingUserMessage.quote;
        }
        Quote quote2 = quote;
        if ((i & 8) != 0) {
            str = upcomingUserMessage.text;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = upcomingUserMessage.copied;
        }
        return upcomingUserMessage.copy(fileDescription, campaignMessage2, quote2, str2, z);
    }

    public final FileDescription component1() {
        return this.fileDescription;
    }

    public final CampaignMessage component2() {
        return this.campaignMessage;
    }

    public final Quote component3() {
        return this.quote;
    }

    public final String component4() {
        return this.text;
    }

    public final boolean component5() {
        return this.copied;
    }

    public final UpcomingUserMessage copy(FileDescription fileDescription, CampaignMessage campaignMessage, Quote quote, String str, boolean z) {
        return new UpcomingUserMessage(fileDescription, campaignMessage, quote, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingUserMessage)) {
            return false;
        }
        UpcomingUserMessage upcomingUserMessage = (UpcomingUserMessage) obj;
        if (z65.c(this.fileDescription, upcomingUserMessage.fileDescription) && z65.c(this.campaignMessage, upcomingUserMessage.campaignMessage) && z65.c(this.quote, upcomingUserMessage.quote) && z65.c(this.text, upcomingUserMessage.text) && this.copied == upcomingUserMessage.copied) {
            return true;
        }
        return false;
    }

    public final CampaignMessage getCampaignMessage() {
        return this.campaignMessage;
    }

    public final boolean getCopied() {
        return this.copied;
    }

    public final FileDescription getFileDescription() {
        return this.fileDescription;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        FileDescription fileDescription = this.fileDescription;
        int i = 0;
        if (fileDescription == null) {
            hashCode = 0;
        } else {
            hashCode = fileDescription.hashCode();
        }
        int i2 = hashCode * 31;
        CampaignMessage campaignMessage = this.campaignMessage;
        if (campaignMessage == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = campaignMessage.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Quote quote = this.quote;
        if (quote == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = quote.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.text;
        if (str != null) {
            i = str.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z = this.copied;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        return i5 + i6;
    }

    public String toString() {
        FileDescription fileDescription = this.fileDescription;
        CampaignMessage campaignMessage = this.campaignMessage;
        Quote quote = this.quote;
        String str = this.text;
        boolean z = this.copied;
        return "UpcomingUserMessage(fileDescription=" + fileDescription + ", campaignMessage=" + campaignMessage + ", quote=" + quote + ", text=" + str + ", copied=" + z + ")";
    }
}
