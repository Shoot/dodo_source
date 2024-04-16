package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InAppHandleRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lzx4;", "", "", "component1", "inAppId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getInAppId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zx4  reason: default package */
/* loaded from: classes.dex */
public final class zx4 {
    @uca("inappid")
    private final String inAppId;

    public zx4(String str) {
        z65.h(str, "inAppId");
        this.inAppId = str;
    }

    public static /* synthetic */ zx4 copy$default(zx4 zx4Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zx4Var.inAppId;
        }
        return zx4Var.copy(str);
    }

    public final String component1() {
        return this.inAppId;
    }

    public final zx4 copy(String str) {
        z65.h(str, "inAppId");
        return new zx4(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zx4) && z65.c(this.inAppId, ((zx4) obj).inAppId)) {
            return true;
        }
        return false;
    }

    public final String getInAppId() {
        return this.inAppId;
    }

    public int hashCode() {
        return this.inAppId.hashCode();
    }

    public String toString() {
        return "InAppHandleRequest(inAppId=" + this.inAppId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
