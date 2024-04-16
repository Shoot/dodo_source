package im.threads.business.transport.models;

import im.threads.business.models.QuickReply;
import im.threads.business.models.Settings;
import im.threads.business.transport.MessageAttributes;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MessageContent.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0002\u0010\u001cJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0018HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003JÞ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u0018HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00182\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u001b\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 ¨\u0006M"}, d2 = {"Lim/threads/business/transport/models/MessageContent;", "", MessageAttributes.UUID, "", "text", "speechText", "formattedText", MessageAttributes.RECEIVED_DATE, "Ljava/util/Date;", "threadId", "", "operator", "Lim/threads/business/transport/models/Operator;", MessageAttributes.ATTACHMENTS, "", "Lim/threads/business/transport/models/Attachment;", MessageAttributes.QUOTES, "Lim/threads/business/transport/models/Quote;", "quickReplies", "Lim/threads/business/models/QuickReply;", "settings", "Lim/threads/business/models/Settings;", "speechStatus", "read", "", "modified", "messageUuid", "isPersonalOffer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Long;Lim/threads/business/transport/models/Operator;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lim/threads/business/models/Settings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Z)V", "getAttachments", "()Ljava/util/List;", "getFormattedText", "()Ljava/lang/String;", "()Z", "getMessageUuid", "getModified", "getOperator", "()Lim/threads/business/transport/models/Operator;", "getQuickReplies", "getQuotes", "getRead", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReceivedDate", "()Ljava/util/Date;", "getSettings", "()Lim/threads/business/models/Settings;", "getSpeechStatus", "getSpeechText", "getText", "getThreadId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Long;Lim/threads/business/transport/models/Operator;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lim/threads/business/models/Settings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Z)Lim/threads/business/transport/models/MessageContent;", "equals", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageContent {
    private final List<Attachment> attachments;
    private final String formattedText;
    private final boolean isPersonalOffer;
    private final String messageUuid;
    private final String modified;
    private final Operator operator;
    private final List<QuickReply> quickReplies;
    private final List<Quote> quotes;
    private final Boolean read;
    private final Date receivedDate;
    private final Settings settings;
    private final String speechStatus;
    private final String speechText;
    private final String text;
    private final Long threadId;
    private final String uuid;

    public MessageContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 65535, null);
    }

    public final String component1() {
        return this.uuid;
    }

    public final List<QuickReply> component10() {
        return this.quickReplies;
    }

    public final Settings component11() {
        return this.settings;
    }

    public final String component12() {
        return this.speechStatus;
    }

    public final Boolean component13() {
        return this.read;
    }

    public final String component14() {
        return this.modified;
    }

    public final String component15() {
        return this.messageUuid;
    }

    public final boolean component16() {
        return this.isPersonalOffer;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.speechText;
    }

    public final String component4() {
        return this.formattedText;
    }

    public final Date component5() {
        return this.receivedDate;
    }

    public final Long component6() {
        return this.threadId;
    }

    public final Operator component7() {
        return this.operator;
    }

    public final List<Attachment> component8() {
        return this.attachments;
    }

    public final List<Quote> component9() {
        return this.quotes;
    }

    public final MessageContent copy(String str, String str2, String str3, String str4, Date date, Long l, Operator operator, List<Attachment> list, List<Quote> list2, List<QuickReply> list3, Settings settings, String str5, Boolean bool, String str6, String str7, boolean z) {
        return new MessageContent(str, str2, str3, str4, date, l, operator, list, list2, list3, settings, str5, bool, str6, str7, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageContent)) {
            return false;
        }
        MessageContent messageContent = (MessageContent) obj;
        if (z65.c(this.uuid, messageContent.uuid) && z65.c(this.text, messageContent.text) && z65.c(this.speechText, messageContent.speechText) && z65.c(this.formattedText, messageContent.formattedText) && z65.c(this.receivedDate, messageContent.receivedDate) && z65.c(this.threadId, messageContent.threadId) && z65.c(this.operator, messageContent.operator) && z65.c(this.attachments, messageContent.attachments) && z65.c(this.quotes, messageContent.quotes) && z65.c(this.quickReplies, messageContent.quickReplies) && z65.c(this.settings, messageContent.settings) && z65.c(this.speechStatus, messageContent.speechStatus) && z65.c(this.read, messageContent.read) && z65.c(this.modified, messageContent.modified) && z65.c(this.messageUuid, messageContent.messageUuid) && this.isPersonalOffer == messageContent.isPersonalOffer) {
            return true;
        }
        return false;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getFormattedText() {
        return this.formattedText;
    }

    public final String getMessageUuid() {
        return this.messageUuid;
    }

    public final String getModified() {
        return this.modified;
    }

    public final Operator getOperator() {
        return this.operator;
    }

    public final List<QuickReply> getQuickReplies() {
        return this.quickReplies;
    }

    public final List<Quote> getQuotes() {
        return this.quotes;
    }

    public final Boolean getRead() {
        return this.read;
    }

    public final Date getReceivedDate() {
        return this.receivedDate;
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

    public final Long getThreadId() {
        return this.threadId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        String str = this.uuid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.text;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.speechText;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.formattedText;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Date date = this.receivedDate;
        if (date == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l = this.threadId;
        if (l == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Operator operator = this.operator;
        if (operator == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = operator.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        List<Attachment> list = this.attachments;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        List<Quote> list2 = this.quotes;
        if (list2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list2.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<QuickReply> list3 = this.quickReplies;
        if (list3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list3.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Settings settings = this.settings;
        if (settings == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = settings.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str5 = this.speechStatus;
        if (str5 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str5.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Boolean bool = this.read;
        if (bool == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        String str6 = this.modified;
        if (str6 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str6.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        String str7 = this.messageUuid;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i16 = (i15 + i) * 31;
        boolean z = this.isPersonalOffer;
        int i17 = z;
        if (z != 0) {
            i17 = 1;
        }
        return i16 + i17;
    }

    public final boolean isPersonalOffer() {
        return this.isPersonalOffer;
    }

    public String toString() {
        String str = this.uuid;
        String str2 = this.text;
        String str3 = this.speechText;
        String str4 = this.formattedText;
        Date date = this.receivedDate;
        Long l = this.threadId;
        Operator operator = this.operator;
        List<Attachment> list = this.attachments;
        List<Quote> list2 = this.quotes;
        List<QuickReply> list3 = this.quickReplies;
        Settings settings = this.settings;
        String str5 = this.speechStatus;
        Boolean bool = this.read;
        String str6 = this.modified;
        String str7 = this.messageUuid;
        boolean z = this.isPersonalOffer;
        return "MessageContent(uuid=" + str + ", text=" + str2 + ", speechText=" + str3 + ", formattedText=" + str4 + ", receivedDate=" + date + ", threadId=" + l + ", operator=" + operator + ", attachments=" + list + ", quotes=" + list2 + ", quickReplies=" + list3 + ", settings=" + settings + ", speechStatus=" + str5 + ", read=" + bool + ", modified=" + str6 + ", messageUuid=" + str7 + ", isPersonalOffer=" + z + ")";
    }

    public MessageContent(String str, String str2, String str3, String str4, Date date, Long l, Operator operator, List<Attachment> list, List<Quote> list2, List<QuickReply> list3, Settings settings, String str5, Boolean bool, String str6, String str7, boolean z) {
        this.uuid = str;
        this.text = str2;
        this.speechText = str3;
        this.formattedText = str4;
        this.receivedDate = date;
        this.threadId = l;
        this.operator = operator;
        this.attachments = list;
        this.quotes = list2;
        this.quickReplies = list3;
        this.settings = settings;
        this.speechStatus = str5;
        this.read = bool;
        this.modified = str6;
        this.messageUuid = str7;
        this.isPersonalOffer = z;
    }

    public /* synthetic */ MessageContent(String str, String str2, String str3, String str4, Date date, Long l, Operator operator, List list, List list2, List list3, Settings settings, String str5, Boolean bool, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : operator, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : settings, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? false : z);
    }
}
