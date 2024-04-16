package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lya7;", "", "", "component1", "systemName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSystemName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ya7  reason: default package */
/* loaded from: classes.dex */
public final class ya7 {
    @uca("systemName")
    private final String systemName;

    public ya7(String str) {
        z65.h(str, "systemName");
        this.systemName = str;
    }

    public static /* synthetic */ ya7 copy$default(ya7 ya7Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ya7Var.systemName;
        }
        return ya7Var.copy(str);
    }

    public final String component1() {
        return this.systemName;
    }

    public final ya7 copy(String str) {
        z65.h(str, "systemName");
        return new ya7(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ya7) && z65.c(this.systemName, ((ya7) obj).systemName)) {
            return true;
        }
        return false;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public int hashCode() {
        return this.systemName.hashCode();
    }

    public String toString() {
        return "OperationDto(systemName=" + this.systemName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
