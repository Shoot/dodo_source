package com.dodopizza.geo.feature.deliveryaddresslist.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.huawei.hms.push.e;
import defpackage.k9a;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DeliveryAddressListInteractor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0005J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00022\u0006\u0010\r\u001a\u00020\fH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u0013\u001a\u00020\tH&¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a;", "", "Lwx;", "", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "b", "Lou2;", "deliverablePlace", DateTokenConverter.CONVERTER_KEY, "Le91;", "clientDeliveryLocation", com.huawei.hms.opendevice.c.a, "Lk9a$b;", "request", "Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", e.a, "Lk9a$a;", "a", "f", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "formattedAddress", "b", "addressName", com.huawei.hms.opendevice.c.a, "comment", "Lou2;", "Lou2;", "()Lou2;", "deliverablePlace", e.a, "Z", "()Z", "isFromState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lou2;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.deliveryaddresslist.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0129a {
        private final String a;
        private final String b;
        private final String c;
        private final ou2 d;
        private final boolean e;

        public C0129a(String str, String str2, String str3, ou2 ou2Var, boolean z) {
            z65.h(str, "formattedAddress");
            z65.h(str2, "addressName");
            z65.h(str3, "comment");
            z65.h(ou2Var, "deliverablePlace");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = ou2Var;
            this.e = z;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final ou2 c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0129a)) {
                return false;
            }
            C0129a c0129a = (C0129a) obj;
            if (z65.c(this.a, c0129a.a) && z65.c(this.b, c0129a.b) && z65.c(this.c, c0129a.c) && z65.c(this.d, c0129a.d) && this.e == c0129a.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            ou2 ou2Var = this.d;
            boolean z = this.e;
            return "DeliveryAddressItem(formattedAddress=" + str + ", addressName=" + str2 + ", comment=" + str3 + ", deliverablePlace=" + ou2Var + ", isFromState=" + z + ")";
        }
    }

    /* compiled from: DeliveryAddressListInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "a", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        private final a.b a;

        public b(a.b bVar) {
            z65.h(bVar, "stateError");
            this.a = bVar;
        }

        public final a.b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            a.b bVar = this.a;
            return "SetDeliveryLocationToStateResult(stateError=" + bVar + ")";
        }
    }

    wx<k9a.a> a(ou2 ou2Var);

    wx<List<C0129a>> b();

    wx<List<C0129a>> c(e91 e91Var);

    wx<List<C0129a>> d(ou2 ou2Var);

    wx<sk9<b>> e(k9a.b bVar);

    e91 f();
}
