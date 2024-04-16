package com.dodopizza.geo.feature.selectdeliveryaddress;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectDeliveryAddressData.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bBI\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020$\u0012\u0006\u0010.\u001a\u00020)¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\u000b\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0016\u0010'R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "a", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "f", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "scenario", "Lzo9;", "b", "Lzo9;", e.a, "()Lzo9;", "routingStrategy", com.huawei.hms.opendevice.c.a, "Z", "j", "()Z", "isEmptyCart", DateTokenConverter.CONVERTER_KEY, "hasAddresses", "Ldt5;", "Ldt5;", "()Ldt5;", "currentLocality", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Ljk7;", "g", "Ljk7;", "()Ljk7;", "currentOrderType", "Lck1;", Image.TYPE_HIGH, "Lck1;", "i", "()Lck1;", "sender", "<init>", "(Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;Lzo9;ZZLdt5;Ljava/lang/String;Ljk7;Lck1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b implements Serializable {
    private final a a;
    private final zo9 b;
    private final boolean c;
    private final boolean d;
    private final dt5 e;
    private final String f;
    private final jk7 g;
    private final ck1 h;

    /* compiled from: SelectDeliveryAddressData.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$c;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a implements Serializable {

        /* compiled from: SelectDeliveryAddressData.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$a;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "<init>", "(Le91;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0153a extends a {
            private final e91 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0153a(e91 e91Var) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                this.a = e91Var;
            }

            public final e91 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0153a) && z65.c(this.a, ((C0153a) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                e91 e91Var = this.a;
                return "ADDRESS_DETAILS(clientDeliveryLocation=" + e91Var + ")";
            }
        }

        /* compiled from: SelectDeliveryAddressData.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "Ltl5;", "b", "Ltl5;", "()Ltl5;", "currentLanguage", "<init>", "(Le91;Ltl5;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.selectdeliveryaddress.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0154b extends a {
            private final e91 a;
            private final tl5 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0154b(e91 e91Var, tl5 tl5Var) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                this.a = e91Var;
                this.b = tl5Var;
            }

            public final e91 a() {
                return this.a;
            }

            public final tl5 b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0154b)) {
                    return false;
                }
                C0154b c0154b = (C0154b) obj;
                if (z65.c(this.a, c0154b.a) && z65.c(this.b, c0154b.b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.a.hashCode() * 31;
                tl5 tl5Var = this.b;
                if (tl5Var == null) {
                    hashCode = 0;
                } else {
                    hashCode = tl5Var.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                e91 e91Var = this.a;
                tl5 tl5Var = this.b;
                return "Onboarding(clientDeliveryLocation=" + e91Var + ", currentLanguage=" + tl5Var + ")";
            }
        }

        /* compiled from: SelectDeliveryAddressData.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$c;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "()Z", "canShowEmptyAddressList", "<init>", "(Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends a {
            private final boolean a;

            public c(boolean z) {
                super(null);
                this.a = z;
            }

            public final boolean a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && this.a == ((c) obj).a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return a91.a(this.a);
            }

            public String toString() {
                boolean z = this.a;
                return "SELECT_ADDRESS(canShowEmptyAddressList=" + z + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(a aVar, zo9 zo9Var, boolean z, boolean z2, dt5 dt5Var, String str, jk7 jk7Var, ck1 ck1Var) {
        z65.h(aVar, "scenario");
        z65.h(zo9Var, "routingStrategy");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(jk7Var, "currentOrderType");
        z65.h(ck1Var, "sender");
        this.a = aVar;
        this.b = zo9Var;
        this.c = z;
        this.d = z2;
        this.e = dt5Var;
        this.f = str;
        this.g = jk7Var;
        this.h = ck1Var;
    }

    public final String a() {
        return this.f;
    }

    public final dt5 b() {
        return this.e;
    }

    public final jk7 c() {
        return this.g;
    }

    public final boolean d() {
        return this.d;
    }

    public final zo9 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && z65.c(this.e, bVar.e) && z65.c(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final a f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31;
        dt5 dt5Var = this.e;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final ck1 i() {
        return this.h;
    }

    public final boolean j() {
        return this.c;
    }

    public String toString() {
        a aVar = this.a;
        zo9 zo9Var = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        dt5 dt5Var = this.e;
        String str = this.f;
        jk7 jk7Var = this.g;
        ck1 ck1Var = this.h;
        return "SelectDeliveryAddressData(scenario=" + aVar + ", routingStrategy=" + zo9Var + ", isEmptyCart=" + z + ", hasAddresses=" + z2 + ", currentLocality=" + dt5Var + ", countryCode=" + str + ", currentOrderType=" + jk7Var + ", sender=" + ck1Var + ")";
    }
}
