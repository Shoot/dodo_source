package im.threads.business.models;

import android.os.Parcel;
import android.os.Parcelable;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.PushMessageAttributes;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: CampaignMessage.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\fHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\fHÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00063"}, d2 = {"Lim/threads/business/models/CampaignMessage;", "Landroid/os/Parcelable;", "text", "", "senderName", MessageAttributes.RECEIVED_DATE, "Ljava/util/Date;", PushMessageAttributes.CHAT_MESSAGE_ID, PushMessageAttributes.GATE_MESSAGE_ID, "", "expiredAt", MessageAttributes.SKILL_ID, "", "campaign", "priority", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;JLjava/util/Date;ILjava/lang/String;I)V", "getCampaign", "()Ljava/lang/String;", "getChatMessageId", "getExpiredAt", "()Ljava/util/Date;", "getGateMessageId", "()J", "getPriority", "()I", "getReceivedDate", "getSenderName", "getSkillId", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampaignMessage implements Parcelable {
    public static final Parcelable.Creator<CampaignMessage> CREATOR = new Creator();
    private final String campaign;
    private final String chatMessageId;
    private final Date expiredAt;
    private final long gateMessageId;
    private final int priority;
    private final Date receivedDate;
    private final String senderName;
    private final int skillId;
    private final String text;

    /* compiled from: CampaignMessage.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<CampaignMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignMessage createFromParcel(Parcel parcel) {
            z65.h(parcel, "parcel");
            return new CampaignMessage(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readLong(), (Date) parcel.readSerializable(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CampaignMessage[] newArray(int i) {
            return new CampaignMessage[i];
        }
    }

    public CampaignMessage(String str, String str2, Date date, String str3, long j, Date date2, int i, String str4, int i2) {
        z65.h(str, "text");
        z65.h(str2, "senderName");
        z65.h(date, MessageAttributes.RECEIVED_DATE);
        z65.h(str3, PushMessageAttributes.CHAT_MESSAGE_ID);
        z65.h(date2, "expiredAt");
        z65.h(str4, "campaign");
        this.text = str;
        this.senderName = str2;
        this.receivedDate = date;
        this.chatMessageId = str3;
        this.gateMessageId = j;
        this.expiredAt = date2;
        this.skillId = i;
        this.campaign = str4;
        this.priority = i2;
    }

    public static /* synthetic */ CampaignMessage copy$default(CampaignMessage campaignMessage, String str, String str2, Date date, String str3, long j, Date date2, int i, String str4, int i2, int i3, Object obj) {
        String str5;
        String str6;
        Date date3;
        String str7;
        long j2;
        Date date4;
        int i4;
        String str8;
        int i5;
        if ((i3 & 1) != 0) {
            str5 = campaignMessage.text;
        } else {
            str5 = str;
        }
        if ((i3 & 2) != 0) {
            str6 = campaignMessage.senderName;
        } else {
            str6 = str2;
        }
        if ((i3 & 4) != 0) {
            date3 = campaignMessage.receivedDate;
        } else {
            date3 = date;
        }
        if ((i3 & 8) != 0) {
            str7 = campaignMessage.chatMessageId;
        } else {
            str7 = str3;
        }
        if ((i3 & 16) != 0) {
            j2 = campaignMessage.gateMessageId;
        } else {
            j2 = j;
        }
        if ((i3 & 32) != 0) {
            date4 = campaignMessage.expiredAt;
        } else {
            date4 = date2;
        }
        if ((i3 & 64) != 0) {
            i4 = campaignMessage.skillId;
        } else {
            i4 = i;
        }
        if ((i3 & 128) != 0) {
            str8 = campaignMessage.campaign;
        } else {
            str8 = str4;
        }
        if ((i3 & 256) != 0) {
            i5 = campaignMessage.priority;
        } else {
            i5 = i2;
        }
        return campaignMessage.copy(str5, str6, date3, str7, j2, date4, i4, str8, i5);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.senderName;
    }

    public final Date component3() {
        return this.receivedDate;
    }

    public final String component4() {
        return this.chatMessageId;
    }

    public final long component5() {
        return this.gateMessageId;
    }

    public final Date component6() {
        return this.expiredAt;
    }

    public final int component7() {
        return this.skillId;
    }

    public final String component8() {
        return this.campaign;
    }

    public final int component9() {
        return this.priority;
    }

    public final CampaignMessage copy(String str, String str2, Date date, String str3, long j, Date date2, int i, String str4, int i2) {
        z65.h(str, "text");
        z65.h(str2, "senderName");
        z65.h(date, MessageAttributes.RECEIVED_DATE);
        z65.h(str3, PushMessageAttributes.CHAT_MESSAGE_ID);
        z65.h(date2, "expiredAt");
        z65.h(str4, "campaign");
        return new CampaignMessage(str, str2, date, str3, j, date2, i, str4, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignMessage)) {
            return false;
        }
        CampaignMessage campaignMessage = (CampaignMessage) obj;
        if (z65.c(this.text, campaignMessage.text) && z65.c(this.senderName, campaignMessage.senderName) && z65.c(this.receivedDate, campaignMessage.receivedDate) && z65.c(this.chatMessageId, campaignMessage.chatMessageId) && this.gateMessageId == campaignMessage.gateMessageId && z65.c(this.expiredAt, campaignMessage.expiredAt) && this.skillId == campaignMessage.skillId && z65.c(this.campaign, campaignMessage.campaign) && this.priority == campaignMessage.priority) {
            return true;
        }
        return false;
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final String getChatMessageId() {
        return this.chatMessageId;
    }

    public final Date getExpiredAt() {
        return this.expiredAt;
    }

    public final long getGateMessageId() {
        return this.gateMessageId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final Date getReceivedDate() {
        return this.receivedDate;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final int getSkillId() {
        return this.skillId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((((((((this.text.hashCode() * 31) + this.senderName.hashCode()) * 31) + this.receivedDate.hashCode()) * 31) + this.chatMessageId.hashCode()) * 31) + ax1.a(this.gateMessageId)) * 31) + this.expiredAt.hashCode()) * 31) + this.skillId) * 31) + this.campaign.hashCode()) * 31) + this.priority;
    }

    public String toString() {
        String str = this.text;
        String str2 = this.senderName;
        Date date = this.receivedDate;
        String str3 = this.chatMessageId;
        long j = this.gateMessageId;
        Date date2 = this.expiredAt;
        int i = this.skillId;
        String str4 = this.campaign;
        int i2 = this.priority;
        return "CampaignMessage(text=" + str + ", senderName=" + str2 + ", receivedDate=" + date + ", chatMessageId=" + str3 + ", gateMessageId=" + j + ", expiredAt=" + date2 + ", skillId=" + i + ", campaign=" + str4 + ", priority=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        z65.h(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.senderName);
        parcel.writeSerializable(this.receivedDate);
        parcel.writeString(this.chatMessageId);
        parcel.writeLong(this.gateMessageId);
        parcel.writeSerializable(this.expiredAt);
        parcel.writeInt(this.skillId);
        parcel.writeString(this.campaign);
        parcel.writeInt(this.priority);
    }
}
