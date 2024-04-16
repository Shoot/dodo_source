package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, d2 = {"Ldq7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Leq7;", "a", "Leq7;", "b", "()Leq7;", "intrinsics", "I", c.a, "()I", "startIndex", "endIndex", "<init>", "(Leq7;II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dq7  reason: default package */
/* loaded from: classes.dex */
public final class dq7 {
    private final eq7 a;
    private final int b;
    private final int c;

    public dq7(eq7 eq7Var, int i, int i2) {
        z65.h(eq7Var, "intrinsics");
        this.a = eq7Var;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final eq7 b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq7)) {
            return false;
        }
        dq7 dq7Var = (dq7) obj;
        if (z65.c(this.a, dq7Var.a) && this.b == dq7Var.b && this.c == dq7Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
