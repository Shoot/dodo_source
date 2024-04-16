package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lyw5;", "", "", "component1", "component2", "component3", "component4", "requestId", "deviceId", RemoteMessageConst.FROM, RemoteMessageConst.TO, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getDeviceId", "getFrom", "getTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yw5  reason: default package */
/* loaded from: classes.dex */
public final class yw5 {
    @uca("deviceUUID")
    private final String deviceId;
    @uca(RemoteMessageConst.FROM)
    private final String from;
    @uca("requestId")
    private final String requestId;
    @uca(RemoteMessageConst.TO)
    private final String to;

    public yw5(String str, String str2, String str3, String str4) {
        this.requestId = str;
        this.deviceId = str2;
        this.from = str3;
        this.to = str4;
    }

    public static /* synthetic */ yw5 copy$default(yw5 yw5Var, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yw5Var.requestId;
        }
        if ((i & 2) != 0) {
            str2 = yw5Var.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = yw5Var.from;
        }
        if ((i & 8) != 0) {
            str4 = yw5Var.to;
        }
        return yw5Var.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.from;
    }

    public final String component4() {
        return this.to;
    }

    public final yw5 copy(String str, String str2, String str3, String str4) {
        return new yw5(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw5)) {
            return false;
        }
        yw5 yw5Var = (yw5) obj;
        if (z65.c(this.requestId, yw5Var.requestId) && z65.c(this.deviceId, yw5Var.deviceId) && z65.c(this.from, yw5Var.from) && z65.c(this.to, yw5Var.to)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.requestId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.deviceId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.from;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.to;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "LogRequestDtoBlank(requestId=" + this.requestId + ", deviceId=" + this.deviceId + ", from=" + this.from + ", to=" + this.to + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
