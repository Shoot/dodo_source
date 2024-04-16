package com.dodopizza.geo.feature.deliveryaddresslist.presentation;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryAddressListRoutingHandler.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0016Jb\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&Jb\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&JD\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&J\b\u0010\u0019\u001a\u00020\u0014H&J(\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&¨\u0006 "}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c;", "", "Le91;", "location", "", "isEmptyCart", "isAddressSelected", "Ldt5;", "currentLocality", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", LocalityEntity.FIELD_COUNTRY_CODE, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a$a;", "locationType", "Lck1;", "sender", "Lkotlin/Function1;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "", "action", "a", "b", com.huawei.hms.opendevice.c.a, "onBackPressed", "selectedClientDeliveryLocation", "locationHaveBeenChanged", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", DateTokenConverter.CONVERTER_KEY, "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: DeliveryAddressListRoutingHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$b;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$c;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: DeliveryAddressListRoutingHandler.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "b", "Z", "isNewAddress", "()Z", com.huawei.hms.opendevice.c.a, "isAddressInState", DateTokenConverter.CONVERTER_KEY, "isNewLocality", "<init>", "(Le91;ZZZ)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.deliveryaddresslist.presentation.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0131a extends a implements Serializable {
            private final e91 a;
            private final boolean b;
            private final boolean c;
            private final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0131a(e91 e91Var, boolean z, boolean z2, boolean z3) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                this.a = e91Var;
                this.b = z;
                this.c = z2;
                this.d = z3;
            }

            public final e91 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0131a)) {
                    return false;
                }
                C0131a c0131a = (C0131a) obj;
                if (z65.c(this.a, c0131a.a) && this.b == c0131a.b && this.c == c0131a.c && this.d == c0131a.d) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + a91.a(this.d);
            }

            public String toString() {
                e91 e91Var = this.a;
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                return "DeliveryLocationDetailsChanged(clientDeliveryLocation=" + e91Var + ", isNewAddress=" + z + ", isAddressInState=" + z2 + ", isNewLocality=" + z3 + ")";
            }
        }

        /* compiled from: DeliveryAddressListRoutingHandler.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$b;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "b", "Z", "isAddressInState", "()Z", "<init>", "(Le91;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private final e91 a;
            private final boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e91 e91Var, boolean z) {
                super(null);
                z65.h(e91Var, "clientDeliveryLocation");
                this.a = e91Var;
                this.b = z;
            }

            public final e91 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (z65.c(this.a, bVar.a) && this.b == bVar.b) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + a91.a(this.b);
            }

            public String toString() {
                e91 e91Var = this.a;
                boolean z = this.b;
                return "DeliveryLocationDetailsDeleted(clientDeliveryLocation=" + e91Var + ", isAddressInState=" + z + ")";
            }
        }

        /* compiled from: DeliveryAddressListRoutingHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$c;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.deliveryaddresslist.presentation.c$a$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0132c extends a {
            public static final C0132c a = new C0132c();

            private C0132c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(e91 e91Var, boolean z, boolean z2, dt5 dt5Var, String str, qx1 qx1Var, a.EnumC0142a enumC0142a, ck1 ck1Var, Function1<? super a, Unit> function1);

    void b(e91 e91Var, boolean z, boolean z2, dt5 dt5Var, String str, qx1 qx1Var, a.EnumC0142a enumC0142a, ck1 ck1Var, Function1<? super a, Unit> function1);

    void c(e91 e91Var, boolean z, boolean z2, qx1 qx1Var, ck1 ck1Var, Function1<? super a, Unit> function1);

    void d(e91 e91Var, boolean z, boolean z2, a.b bVar);

    void onBackPressed();
}
