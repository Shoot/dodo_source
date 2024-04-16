package defpackage;

import kotlin.Metadata;
/* compiled from: PersonalOffer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Ln2a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "isOpenByUser", "<init>", "(Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n2a  reason: default package */
/* loaded from: classes4.dex */
public final class n2a {
    private final boolean a;

    public n2a(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n2a) && this.a == ((n2a) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a91.a(this.a);
    }

    public String toString() {
        boolean z = this.a;
        return "SecretAction(isOpenByUser=" + z + ")";
    }
}
