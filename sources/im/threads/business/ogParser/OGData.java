package im.threads.business.ogParser;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OGData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\u0006\u0010,\u001a\u00020(J\b\u0010-\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006."}, d2 = {"Lim/threads/business/ogParser/OGData;", "", "title", "", "description", "imageUrl", RemoteMessageConst.Notification.URL, "siteName", MessageAttributes.TYPE, "parsedUrl", "messageText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getImageUrl", "setImageUrl", "getMessageText", "setMessageText", "getParsedUrl", "setParsedUrl", "getSiteName", "setSiteName", "getTitle", "setTitle", "getType", "setType", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "isEmpty", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OGData {
    private String description;
    private String imageUrl;
    private String messageText;
    private String parsedUrl;
    private String siteName;
    private String title;
    private String type;
    private String url;

    public OGData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ OGData copy$default(OGData oGData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        if ((i & 1) != 0) {
            str9 = oGData.title;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            str10 = oGData.description;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            str11 = oGData.imageUrl;
        } else {
            str11 = str3;
        }
        if ((i & 8) != 0) {
            str12 = oGData.url;
        } else {
            str12 = str4;
        }
        if ((i & 16) != 0) {
            str13 = oGData.siteName;
        } else {
            str13 = str5;
        }
        if ((i & 32) != 0) {
            str14 = oGData.type;
        } else {
            str14 = str6;
        }
        if ((i & 64) != 0) {
            str15 = oGData.parsedUrl;
        } else {
            str15 = str7;
        }
        if ((i & 128) != 0) {
            str16 = oGData.messageText;
        } else {
            str16 = str8;
        }
        return oGData.copy(str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.siteName;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.parsedUrl;
    }

    public final String component8() {
        return this.messageText;
    }

    public final OGData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z65.h(str, "title");
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(str4, RemoteMessageConst.Notification.URL);
        z65.h(str5, "siteName");
        z65.h(str6, MessageAttributes.TYPE);
        z65.h(str7, "parsedUrl");
        return new OGData(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OGData)) {
            return false;
        }
        OGData oGData = (OGData) obj;
        if (z65.c(this.title, oGData.title) && z65.c(this.description, oGData.description) && z65.c(this.imageUrl, oGData.imageUrl) && z65.c(this.url, oGData.url) && z65.c(this.siteName, oGData.siteName) && z65.c(this.type, oGData.type) && z65.c(this.parsedUrl, oGData.parsedUrl) && z65.c(this.messageText, oGData.messageText)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final String getParsedUrl() {
        return this.parsedUrl;
    }

    public final String getSiteName() {
        return this.siteName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.url.hashCode()) * 31) + this.siteName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.parsedUrl.hashCode()) * 31;
        String str = this.messageText;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean isEmpty() {
        if (this.title.length() == 0 && this.description.length() == 0 && this.url.length() == 0) {
            return true;
        }
        return false;
    }

    public final void setDescription(String str) {
        z65.h(str, "<set-?>");
        this.description = str;
    }

    public final void setImageUrl(String str) {
        z65.h(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setMessageText(String str) {
        this.messageText = str;
    }

    public final void setParsedUrl(String str) {
        z65.h(str, "<set-?>");
        this.parsedUrl = str;
    }

    public final void setSiteName(String str) {
        z65.h(str, "<set-?>");
        this.siteName = str;
    }

    public final void setTitle(String str) {
        z65.h(str, "<set-?>");
        this.title = str;
    }

    public final void setType(String str) {
        z65.h(str, "<set-?>");
        this.type = str;
    }

    public final void setUrl(String str) {
        z65.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.url;
        String str4 = this.siteName;
        String str5 = this.type;
        return "Open Graph Data:[title:" + str + ", desc: " + str2 + ", imageUrl: imageUrl, url:" + str3 + ", siteName: " + str4 + ", type: " + str5 + "]";
    }

    public OGData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z65.h(str, "title");
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(str4, RemoteMessageConst.Notification.URL);
        z65.h(str5, "siteName");
        z65.h(str6, MessageAttributes.TYPE);
        z65.h(str7, "parsedUrl");
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.url = str4;
        this.siteName = str5;
        this.type = str6;
        this.parsedUrl = str7;
        this.messageText = str8;
    }

    public /* synthetic */ OGData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : str8);
    }
}
