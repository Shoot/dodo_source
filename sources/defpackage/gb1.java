package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CollaborationPromoAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lgb1;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getSpecialOfferId", "()Ljava/lang/String;", "specialOfferId", "b", "getSpecialOfferName", "specialOfferName", "Lqd;", c.a, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gb1  reason: default package */
/* loaded from: classes4.dex */
public final class gb1 implements dc {
    private final String a;
    private final String b;
    private final qd c;

    public gb1(String str, String str2, qd qdVar) {
        z65.h(str, "specialOfferId");
        z65.h(str2, "specialOfferName");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = str2;
        this.c = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        String F;
        bc bcVar = new bc("partner_bonuses_open");
        F = l0b.F(this.a, "-", "", false, 4, null);
        return vc.z(bc.e(bc.e(bcVar, "bonusactionId", F, false, 4, null), "bonusaction", this.b, false, 4, null), this.c).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb1)) {
            return false;
        }
        gb1 gb1Var = (gb1) obj;
        if (z65.c(this.a, gb1Var.a) && z65.c(this.b, gb1Var.b) && z65.c(this.c, gb1Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        qd qdVar = this.c;
        return "OpenCollaborationPromoEvent(specialOfferId=" + str + ", specialOfferName=" + str2 + ", sender=" + qdVar + ")";
    }
}
