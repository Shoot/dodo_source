package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: EditAddressMapFragmentData.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB[\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020\b\u0012\b\u00100\u001a\u0004\u0018\u00010-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0010\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(R\u0017\u0010,\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u0019\u00100\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b\u0014\u0010/R\u0017\u00104\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b!\u00103¨\u00067"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "getResultId", "()I", "resultId", "Le91;", "b", "Le91;", "()Le91;", "clientDeliveryLocation", com.huawei.hms.opendevice.c.a, "Z", "j", "()Z", "isEmptyCart", DateTokenConverter.CONVERTER_KEY, "i", "isAddressSelected", "Ldt5;", com.huawei.hms.push.e.a, "Ldt5;", "()Ldt5;", "currentLocality", "f", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "g", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "locationType", Image.TYPE_HIGH, "k", "isOnboarding", "Ltl5;", "Ltl5;", "()Ltl5;", "currentLanguage", "Lck1;", "Lck1;", "()Lck1;", "sender", "<init>", "(ILe91;ZZLdt5;Ljava/lang/String;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;ZLtl5;Lck1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a implements Serializable {
    private final int a;
    private final e91 b;
    private final boolean c;
    private final boolean d;
    private final dt5 e;
    private final String f;
    private final EnumC0142a g;
    private final boolean h;
    private final tl5 i;
    private final ck1 j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditAddressMapFragmentData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class EnumC0142a {
        public static final EnumC0142a a = new EnumC0142a("NEW", 0);
        public static final EnumC0142a b = new EnumC0142a("EXISTING", 1);
        private static final /* synthetic */ EnumC0142a[] c;
        private static final /* synthetic */ kj3 d;

        static {
            EnumC0142a[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private EnumC0142a(String str, int i) {
        }

        private static final /* synthetic */ EnumC0142a[] a() {
            return new EnumC0142a[]{a, b};
        }

        public static EnumC0142a valueOf(String str) {
            return (EnumC0142a) Enum.valueOf(EnumC0142a.class, str);
        }

        public static EnumC0142a[] values() {
            return (EnumC0142a[]) c.clone();
        }
    }

    public a(int i, e91 e91Var, boolean z, boolean z2, dt5 dt5Var, String str, EnumC0142a enumC0142a, boolean z3, tl5 tl5Var, ck1 ck1Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(enumC0142a, "locationType");
        z65.h(ck1Var, "sender");
        this.a = i;
        this.b = e91Var;
        this.c = z;
        this.d = z2;
        this.e = dt5Var;
        this.f = str;
        this.g = enumC0142a;
        this.h = z3;
        this.i = tl5Var;
        this.j = ck1Var;
    }

    public final e91 a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final tl5 c() {
        return this.i;
    }

    public final dt5 d() {
        return this.e;
    }

    public final EnumC0142a e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && z65.c(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && z65.c(this.e, aVar.e) && z65.c(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && z65.c(this.i, aVar.i) && this.j == aVar.j) {
            return true;
        }
        return false;
    }

    public final ck1 f() {
        return this.j;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31;
        dt5 dt5Var = this.e;
        int i = 0;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a91.a(this.h)) * 31;
        tl5 tl5Var = this.i;
        if (tl5Var != null) {
            i = tl5Var.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.j.hashCode();
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    public final boolean k() {
        return this.h;
    }

    public String toString() {
        int i = this.a;
        e91 e91Var = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        dt5 dt5Var = this.e;
        String str = this.f;
        EnumC0142a enumC0142a = this.g;
        boolean z3 = this.h;
        tl5 tl5Var = this.i;
        ck1 ck1Var = this.j;
        return "EditAddressMapFragmentData(resultId=" + i + ", clientDeliveryLocation=" + e91Var + ", isEmptyCart=" + z + ", isAddressSelected=" + z2 + ", currentLocality=" + dt5Var + ", countryCode=" + str + ", locationType=" + enumC0142a + ", isOnboarding=" + z3 + ", currentLanguage=" + tl5Var + ", sender=" + ck1Var + ")";
    }
}
