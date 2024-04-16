package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lyx9;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "minVersion", "maxVersion", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lyx9;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getMinVersion", "getMaxVersion", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yx9  reason: default package */
/* loaded from: classes.dex */
public final class yx9 {
    @uca("max")
    private final Integer maxVersion;
    @uca("min")
    private final Integer minVersion;

    public yx9(Integer num, Integer num2) {
        this.minVersion = num;
        this.maxVersion = num2;
    }

    public static /* synthetic */ yx9 copy$default(yx9 yx9Var, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = yx9Var.minVersion;
        }
        if ((i & 2) != 0) {
            num2 = yx9Var.maxVersion;
        }
        return yx9Var.copy(num, num2);
    }

    public final Integer component1() {
        return this.minVersion;
    }

    public final Integer component2() {
        return this.maxVersion;
    }

    public final yx9 copy(Integer num, Integer num2) {
        return new yx9(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx9)) {
            return false;
        }
        yx9 yx9Var = (yx9) obj;
        if (z65.c(this.minVersion, yx9Var.minVersion) && z65.c(this.maxVersion, yx9Var.maxVersion)) {
            return true;
        }
        return false;
    }

    public final Integer getMaxVersion() {
        return this.maxVersion;
    }

    public final Integer getMinVersion() {
        return this.minVersion;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.minVersion;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.maxVersion;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "SdkVersion(minVersion=" + this.minVersion + ", maxVersion=" + this.maxVersion + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
