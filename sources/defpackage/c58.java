package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PhoneValidity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lc58;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "isValid", "()Z", "b", "isValidForSMS", "<init>", "(ZZ)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: c58  reason: default package */
/* loaded from: classes2.dex */
public final class c58 {
    private final boolean a;
    private final boolean b;

    public c58() {
        this(false, false, 3, null);
    }

    public final boolean a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c58)) {
            return false;
        }
        c58 c58Var = (c58) obj;
        if (this.a == c58Var.a && this.b == c58Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a91.a(this.a) * 31) + a91.a(this.b);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return "PhoneValidity(isValid=" + z + ", isValidForSMS=" + z2 + ")";
    }

    public c58(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ c58(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
