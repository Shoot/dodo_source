package defpackage;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: AddressDetailsField.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lg7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", MessageAttributes.TYPE, "b", "Z", "isRequired", "()Z", "<init>", "(Ljava/lang/String;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g7  reason: default package */
/* loaded from: classes4.dex */
public final class g7 {
    private final String a;
    private final boolean b;

    public g7(String str, boolean z) {
        z65.h(str, MessageAttributes.TYPE);
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        if (z65.c(this.a, g7Var.a) && this.b == g7Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        return "AddressDetailsField(type=" + str + ", isRequired=" + z + ")";
    }
}
