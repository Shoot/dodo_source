package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoyaltyProductsVO.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0016BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b+\u0010,JW\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b\u001f\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lm26;", "", "", "loyaltyPointsBalance", "pointsPrice", "Lhn6;", "minLegalPrice", "", Action.NAME_ATTRIBUTE, "", "hasGift", "Lrba;", "sender", "", "Le26;", "productList", "b", "toString", "", "hashCode", "other", "equals", "a", "D", e.a, "()D", Image.TYPE_HIGH, c.a, "Lhn6;", "f", "()Lhn6;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Z", "()Z", "Lrba;", "j", "()Lrba;", "Ljava/util/List;", "i", "()Ljava/util/List;", "<init>", "(DDLhn6;Ljava/lang/String;ZLrba;Ljava/util/List;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m26  reason: default package */
/* loaded from: classes2.dex */
public final class m26 {
    public static final a h = new a(null);
    private static final m26 i;
    private final double a;
    private final double b;
    private final hn6 c;
    private final String d;
    private final boolean e;
    private final rba f;
    private final List<e26> g;

    /* compiled from: LoyaltyProductsVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lm26$a;", "", "Lm26;", "EMPTY", "Lm26;", "a", "()Lm26;", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m26$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m26 a() {
            return m26.i;
        }
    }

    static {
        List l;
        hn6 f = kn6.f();
        rba rbaVar = rba.a;
        l = kc1.l();
        i = new m26(0.0d, 0.0d, f, "", true, rbaVar, l);
    }

    public m26(double d, double d2, hn6 hn6Var, String str, boolean z, rba rbaVar, List<e26> list) {
        z65.h(hn6Var, "minLegalPrice");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "productList");
        this.a = d;
        this.b = d2;
        this.c = hn6Var;
        this.d = str;
        this.e = z;
        this.f = rbaVar;
        this.g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m26 c(m26 m26Var, double d, double d2, hn6 hn6Var, String str, boolean z, rba rbaVar, List list, int i2, Object obj) {
        double d3;
        double d4;
        hn6 hn6Var2;
        String str2;
        boolean z2;
        rba rbaVar2;
        List<e26> list2;
        if ((i2 & 1) != 0) {
            d3 = m26Var.a;
        } else {
            d3 = d;
        }
        if ((i2 & 2) != 0) {
            d4 = m26Var.b;
        } else {
            d4 = d2;
        }
        if ((i2 & 4) != 0) {
            hn6Var2 = m26Var.c;
        } else {
            hn6Var2 = hn6Var;
        }
        if ((i2 & 8) != 0) {
            str2 = m26Var.d;
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            z2 = m26Var.e;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            rbaVar2 = m26Var.f;
        } else {
            rbaVar2 = rbaVar;
        }
        if ((i2 & 64) != 0) {
            list2 = m26Var.g;
        } else {
            list2 = list;
        }
        return m26Var.b(d3, d4, hn6Var2, str2, z2, rbaVar2, list2);
    }

    public final m26 b(double d, double d2, hn6 hn6Var, String str, boolean z, rba rbaVar, List<e26> list) {
        z65.h(hn6Var, "minLegalPrice");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "productList");
        return new m26(d, d2, hn6Var, str, z, rbaVar, list);
    }

    public final boolean d() {
        return this.e;
    }

    public final double e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m26)) {
            return false;
        }
        m26 m26Var = (m26) obj;
        if (Double.compare(this.a, m26Var.a) == 0 && Double.compare(this.b, m26Var.b) == 0 && z65.c(this.c, m26Var.c) && z65.c(this.d, m26Var.d) && this.e == m26Var.e && this.f == m26Var.f && z65.c(this.g, m26Var.g)) {
            return true;
        }
        return false;
    }

    public final hn6 f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final double h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int a2 = ((((((((nkb.a(this.a) * 31) + nkb.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e)) * 31;
        rba rbaVar = this.f;
        if (rbaVar == null) {
            hashCode = 0;
        } else {
            hashCode = rbaVar.hashCode();
        }
        return ((a2 + hashCode) * 31) + this.g.hashCode();
    }

    public final List<e26> i() {
        return this.g;
    }

    public final rba j() {
        return this.f;
    }

    public String toString() {
        double d = this.a;
        double d2 = this.b;
        hn6 hn6Var = this.c;
        String str = this.d;
        boolean z = this.e;
        rba rbaVar = this.f;
        List<e26> list = this.g;
        return "LoyaltyProductsVO(loyaltyPointsBalance=" + d + ", pointsPrice=" + d2 + ", minLegalPrice=" + hn6Var + ", name=" + str + ", hasGift=" + z + ", sender=" + rbaVar + ", productList=" + list + ")";
    }
}
