package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MissionStatus.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0016"}, d2 = {"Ldp8;", "Lwl6;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "()I", "currentProgress", "b", c.a, "totalProgress", "Ljava/lang/String;", "()Ljava/lang/String;", "moderatorResponse", "<init>", "(IILjava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dp8  reason: default package */
/* loaded from: classes4.dex */
public final class dp8 extends wl6 {
    private final int a;
    private final int b;
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp8(int i, int i2, String str) {
        super(null);
        z65.h(str, "moderatorResponse");
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp8)) {
            return false;
        }
        dp8 dp8Var = (dp8) obj;
        if (this.a == dp8Var.a && this.b == dp8Var.b && z65.c(this.c, dp8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        return "ProgressStatus(currentProgress=" + i + ", totalProgress=" + i2 + ", moderatorResponse=" + str + ")";
    }
}
