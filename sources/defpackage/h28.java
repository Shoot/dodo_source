package defpackage;

import kotlin.Metadata;
/* compiled from: PhoneCallAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lh28;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h28  reason: default package */
/* loaded from: classes4.dex */
public final class h28 implements dc {
    private final qd a;

    public h28(qd qdVar) {
        z65.h(qdVar, "sender");
        this.a = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(new bc("click_on_phone"), this.a).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h28) && z65.c(this.a, ((h28) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        qd qdVar = this.a;
        return "SimplePhoneCall(sender=" + qdVar + ")";
    }
}
