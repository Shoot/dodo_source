package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LogResponseDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ldx5;", "", "", "component1", "component2", "", "component3", "status", "requestId", RemoteMessageConst.Notification.CONTENT, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "getRequestId", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dx5  reason: default package */
/* loaded from: classes.dex */
public final class dx5 {
    @uca(RemoteMessageConst.Notification.CONTENT)
    private final List<String> content;
    @uca("requestId")
    private final String requestId;
    @uca("status")
    private final String status;

    public dx5(String str, String str2, List<String> list) {
        z65.h(str, "status");
        z65.h(str2, "requestId");
        z65.h(list, RemoteMessageConst.Notification.CONTENT);
        this.status = str;
        this.requestId = str2;
        this.content = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dx5 copy$default(dx5 dx5Var, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dx5Var.status;
        }
        if ((i & 2) != 0) {
            str2 = dx5Var.requestId;
        }
        if ((i & 4) != 0) {
            list = dx5Var.content;
        }
        return dx5Var.copy(str, str2, list);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.requestId;
    }

    public final List<String> component3() {
        return this.content;
    }

    public final dx5 copy(String str, String str2, List<String> list) {
        z65.h(str, "status");
        z65.h(str2, "requestId");
        z65.h(list, RemoteMessageConst.Notification.CONTENT);
        return new dx5(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx5)) {
            return false;
        }
        dx5 dx5Var = (dx5) obj;
        if (z65.c(this.status, dx5Var.status) && z65.c(this.requestId, dx5Var.requestId) && z65.c(this.content, dx5Var.content)) {
            return true;
        }
        return false;
    }

    public final List<String> getContent() {
        return this.content;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "LogResponseDto(status=" + this.status + ", requestId=" + this.requestId + ", content=" + this.content + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
