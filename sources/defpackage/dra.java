package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: SpecialOfferAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Ldra;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getSpecialOfferId", "()Ljava/lang/String;", "specialOfferId", "b", "getSpecialOfferName", "specialOfferName", c.a, "Z", "isSecretOffer", "()Z", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "getSender", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dra  reason: default package */
/* loaded from: classes4.dex */
public final class dra implements dc {
    private final String a;
    private final String b;
    private final boolean c;
    private final qd d;

    public dra(String str, String str2, boolean z, qd qdVar) {
        z65.h(str, "specialOfferId");
        z65.h(str2, "specialOfferName");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        String F;
        bc bcVar = new bc("open_bonusaction");
        F = l0b.F(this.a, "-", "", false, 4, null);
        return vc.z(bc.e(bc.e(bc.e(bcVar, "bonusactionId", F, false, 4, null), "bonusaction", this.b, false, 4, null), "isSecretOffer", Boolean.valueOf(this.c), false, 4, null), this.d).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dra)) {
            return false;
        }
        dra draVar = (dra) obj;
        if (z65.c(this.a, draVar.a) && z65.c(this.b, draVar.b) && this.c == draVar.c && z65.c(this.d, draVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        qd qdVar = this.d;
        return "OpenSpecialOfferEvent(specialOfferId=" + str + ", specialOfferName=" + str2 + ", isSecretOffer=" + z + ", sender=" + qdVar + ")";
    }
}
