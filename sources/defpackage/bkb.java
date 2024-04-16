package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InitData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J?\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lbkb;", "", "", "component1", "component2", "component3", "component4", "", "component5", "ianaTimeZone", "endpointId", KustoStorage.KustoTable.COLUMN_SOURCE, "requestUrl", "sdkVersionNumeric", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getIanaTimeZone", "()Ljava/lang/String;", "getEndpointId", "getSource", "getRequestUrl", "I", "getSdkVersionNumeric", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bkb  reason: default package */
/* loaded from: classes.dex */
public final class bkb {
    @uca("endpointId")
    private final String endpointId;
    @uca("ianaTimeZone")
    private final String ianaTimeZone;
    @uca("requestUrl")
    private final String requestUrl;
    @uca("sdkVersionNumeric")
    private final int sdkVersionNumeric;
    @uca(KustoStorage.KustoTable.COLUMN_SOURCE)
    private final String source;

    public bkb(String str, String str2, String str3, String str4, int i) {
        z65.h(str, "ianaTimeZone");
        z65.h(str2, "endpointId");
        this.ianaTimeZone = str;
        this.endpointId = str2;
        this.source = str3;
        this.requestUrl = str4;
        this.sdkVersionNumeric = i;
    }

    public static /* synthetic */ bkb copy$default(bkb bkbVar, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bkbVar.ianaTimeZone;
        }
        if ((i2 & 2) != 0) {
            str2 = bkbVar.endpointId;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = bkbVar.source;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = bkbVar.requestUrl;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = bkbVar.sdkVersionNumeric;
        }
        return bkbVar.copy(str, str5, str6, str7, i);
    }

    public final String component1() {
        return this.ianaTimeZone;
    }

    public final String component2() {
        return this.endpointId;
    }

    public final String component3() {
        return this.source;
    }

    public final String component4() {
        return this.requestUrl;
    }

    public final int component5() {
        return this.sdkVersionNumeric;
    }

    public final bkb copy(String str, String str2, String str3, String str4, int i) {
        z65.h(str, "ianaTimeZone");
        z65.h(str2, "endpointId");
        return new bkb(str, str2, str3, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkb)) {
            return false;
        }
        bkb bkbVar = (bkb) obj;
        if (z65.c(this.ianaTimeZone, bkbVar.ianaTimeZone) && z65.c(this.endpointId, bkbVar.endpointId) && z65.c(this.source, bkbVar.source) && z65.c(this.requestUrl, bkbVar.requestUrl) && this.sdkVersionNumeric == bkbVar.sdkVersionNumeric) {
            return true;
        }
        return false;
    }

    public final String getEndpointId() {
        return this.endpointId;
    }

    public final String getIanaTimeZone() {
        return this.ianaTimeZone;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final int getSdkVersionNumeric() {
        return this.sdkVersionNumeric;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.ianaTimeZone.hashCode() * 31) + this.endpointId.hashCode()) * 31;
        String str = this.source;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.requestUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i2 + i) * 31) + this.sdkVersionNumeric;
    }

    public String toString() {
        return "TrackVisitData(ianaTimeZone=" + this.ianaTimeZone + ", endpointId=" + this.endpointId + ", source=" + this.source + ", requestUrl=" + this.requestUrl + ", sdkVersionNumeric=" + this.sdkVersionNumeric + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ bkb(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, i);
    }
}
