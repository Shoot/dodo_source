package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lxw5;", "", "", "component1", "component2", "component3", "component4", "requestId", "deviceId", RemoteMessageConst.FROM, RemoteMessageConst.TO, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getDeviceId", "getFrom", "getTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xw5  reason: default package */
/* loaded from: classes.dex */
public final class xw5 {
    @uca("deviceUUID")
    private final String deviceId;
    @uca(RemoteMessageConst.FROM)
    private final String from;
    @uca("requestId")
    private final String requestId;
    @uca(RemoteMessageConst.TO)
    private final String to;

    public xw5(String str, String str2, String str3, String str4) {
        z65.h(str, "requestId");
        z65.h(str2, "deviceId");
        z65.h(str3, RemoteMessageConst.FROM);
        z65.h(str4, RemoteMessageConst.TO);
        this.requestId = str;
        this.deviceId = str2;
        this.from = str3;
        this.to = str4;
    }

    public static /* synthetic */ xw5 copy$default(xw5 xw5Var, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xw5Var.requestId;
        }
        if ((i & 2) != 0) {
            str2 = xw5Var.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = xw5Var.from;
        }
        if ((i & 8) != 0) {
            str4 = xw5Var.to;
        }
        return xw5Var.copy(str, str2, str3, str4);
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

    public final xw5 copy(String str, String str2, String str3, String str4) {
        z65.h(str, "requestId");
        z65.h(str2, "deviceId");
        z65.h(str3, RemoteMessageConst.FROM);
        z65.h(str4, RemoteMessageConst.TO);
        return new xw5(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw5)) {
            return false;
        }
        xw5 xw5Var = (xw5) obj;
        if (z65.c(this.requestId, xw5Var.requestId) && z65.c(this.deviceId, xw5Var.deviceId) && z65.c(this.from, xw5Var.from) && z65.c(this.to, xw5Var.to)) {
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
        return (((((this.requestId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode();
    }

    public String toString() {
        return "LogRequestDto(requestId=" + this.requestId + ", deviceId=" + this.deviceId + ", from=" + this.from + ", to=" + this.to + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
