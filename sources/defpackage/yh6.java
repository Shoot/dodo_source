package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MessageHandlingState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lyh6;", "", "", "attemptNumber", "", "isMessageDisplayed", "a", "", "toString", "hashCode", "other", "equals", "I", c.a, "()I", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "<init>", "(IZ)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yh6  reason: default package */
/* loaded from: classes.dex */
public final class yh6 {
    private final int a;
    private final boolean b;

    public yh6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static /* synthetic */ yh6 b(yh6 yh6Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = yh6Var.a;
        }
        if ((i2 & 2) != 0) {
            z = yh6Var.b;
        }
        return yh6Var.a(i, z);
    }

    public final yh6 a(int i, boolean z) {
        return new yh6(i, z);
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh6)) {
            return false;
        }
        yh6 yh6Var = (yh6) obj;
        if (this.a == yh6Var.a && this.b == yh6Var.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.a * 31;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        return "MessageHandlingState(attemptNumber=" + this.a + ", isMessageDisplayed=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
