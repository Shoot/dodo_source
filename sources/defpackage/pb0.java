package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: BitString.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpb0;", "", "", "hashCode", "", "toString", "other", "", "equals", "Llk0;", "a", "Llk0;", "()Llk0;", "byteString", "b", "I", "()I", "unusedBitsCount", "<init>", "(Llk0;I)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: pb0  reason: default package */
/* loaded from: classes3.dex */
public final class pb0 {
    private final lk0 a;
    private final int b;

    public pb0(lk0 lk0Var, int i) {
        z65.h(lk0Var, "byteString");
        this.a = lk0Var;
        this.b = i;
    }

    public final lk0 a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj;
        if (z65.c(this.a, pb0Var.a) && this.b == pb0Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        return "BitString(byteString=" + this.a + ", unusedBitsCount=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
