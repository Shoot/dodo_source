package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ReferralCodeApplyingInfo.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u001f"}, d2 = {"Ls1b;", "Lja9;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljb9;", "b", "Ljb9;", "getPromoTypes", "()Ljb9;", "promoTypes", c.a, "I", "getCountryId", "()I", "countryId", "", DateTokenConverter.CONVERTER_KEY, "D", "a", "()D", "coinsAmount", e.a, "expirationInDays", "<init>", "(Ljb9;IDI)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s1b  reason: default package */
/* loaded from: classes4.dex */
public final class s1b extends ja9 {
    private final jb9 b;
    private final int c;
    private final double d;
    private final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1b(jb9 jb9Var, int i, double d, int i2) {
        super(jb9Var, null);
        z65.h(jb9Var, "promoTypes");
        this.b = jb9Var;
        this.c = i;
        this.d = d;
        this.e = i2;
    }

    public final double a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1b)) {
            return false;
        }
        s1b s1bVar = (s1b) obj;
        if (this.b == s1bVar.b && this.c == s1bVar.c && Double.compare(this.d, s1bVar.d) == 0 && this.e == s1bVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c) * 31) + nkb.a(this.d)) * 31) + this.e;
    }

    public String toString() {
        jb9 jb9Var = this.b;
        int i = this.c;
        double d = this.d;
        int i2 = this.e;
        return "SuccessReferralCodeApplyingInfo(promoTypes=" + jb9Var + ", countryId=" + i + ", coinsAmount=" + d + ", expirationInDays=" + i2 + ")";
    }
}
