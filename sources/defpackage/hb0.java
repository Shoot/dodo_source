package defpackage;

import kotlin.Metadata;
/* compiled from: OrderFeedbackValue.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0012\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lhb0;", "Lqd7;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isFeedbackPositive", "b", "Z", "g", "()Z", "isSelected", "<init>", "(Ljava/lang/Boolean;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hb0  reason: default package */
/* loaded from: classes.dex */
public final class hb0 implements qd7 {
    private final Boolean a;
    private final boolean b;

    public hb0(Boolean bool) {
        boolean z;
        this.a = bool;
        if (bool != null) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }

    public final Boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hb0) && z65.c(this.a, ((hb0) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qd7
    public boolean g() {
        return this.b;
    }

    public int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        Boolean bool = this.a;
        return "BinaryFeedbackValue(isFeedbackPositive=" + bool + ")";
    }
}
