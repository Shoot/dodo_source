package defpackage;

import kotlin.Metadata;
/* compiled from: PersonalOfferAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ld08;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getOfferId", "()Ljava/lang/String;", "offerId", "Lqd;", "b", "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d08  reason: default package */
/* loaded from: classes4.dex */
public final class d08 implements dc {
    private final String a;
    private final qd b;

    public d08(String str, qd qdVar) {
        z65.h(str, "offerId");
        this.a = str;
        this.b = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(new bc("secret_personal_offer_part_shown"), "personalOfferId", this.a, false, 4, null), this.b).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d08)) {
            return false;
        }
        d08 d08Var = (d08) obj;
        if (z65.c(this.a, d08Var.a) && z65.c(this.b, d08Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        qd qdVar = this.b;
        if (qdVar == null) {
            hashCode = 0;
        } else {
            hashCode = qdVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.a;
        qd qdVar = this.b;
        return "ShowSecretPersonalOfferEvent(offerId=" + str + ", sender=" + qdVar + ")";
    }
}
