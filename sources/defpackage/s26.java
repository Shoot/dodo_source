package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: LoyaltyProgramAnalytics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Ls26;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lu26;", "Lu26;", "getSender", "()Lu26;", "sender", "", "b", "D", "getCoinBalance", "()D", "coinBalance", c.a, "Z", "getHasGift", "()Z", "hasGift", DateTokenConverter.CONVERTER_KEY, "getCategoryCoins", "categoryCoins", e.a, "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "category", "<init>", "(Lu26;DZDLjava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s26  reason: default package */
/* loaded from: classes4.dex */
public final class s26 implements dc {
    private final u26 a;
    private final double b;
    private final boolean c;
    private final double d;
    private final String e;

    public s26(u26 u26Var, double d, boolean z, double d2, String str) {
        z65.h(str, "category");
        this.a = u26Var;
        this.b = d;
        this.c = z;
        this.d = d2;
        this.e = str;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(bc.e(bc.e(vc.z(new bc("screen_loyalty_category"), this.a), "coinBalance", Double.valueOf(this.b), false, 4, null), "hasGift", Boolean.valueOf(this.c), false, 4, null), "categoryCoins", Double.valueOf(this.d), false, 4, null), "category", this.e, false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s26)) {
            return false;
        }
        s26 s26Var = (s26) obj;
        if (this.a == s26Var.a && Double.compare(this.b, s26Var.b) == 0 && this.c == s26Var.c && Double.compare(this.d, s26Var.d) == 0 && z65.c(this.e, s26Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        u26 u26Var = this.a;
        if (u26Var == null) {
            hashCode = 0;
        } else {
            hashCode = u26Var.hashCode();
        }
        return (((((((hashCode * 31) + nkb.a(this.b)) * 31) + a91.a(this.c)) * 31) + nkb.a(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        u26 u26Var = this.a;
        double d = this.b;
        boolean z = this.c;
        double d2 = this.d;
        String str = this.e;
        return "OpenLoyaltyProgramCategoryScreenEvent(sender=" + u26Var + ", coinBalance=" + d + ", hasGift=" + z + ", categoryCoins=" + d2 + ", category=" + str + ")";
    }
}
