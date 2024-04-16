package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k9a;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: EditDeliveryAddressMapInteractor.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u001fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\u0006\u0010\u000e\u001a\u00020\u0007H&J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u000e\u001a\u00020\u0007H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H&J\"\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH&¨\u0006 "}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "", "Lqw1;", MessageAttributes.COORDINATES, "Lwx;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "a", "Le91;", "location", "", "Lcom/dodopizza/async/AsyncJob;", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "f", "clientDeliveryLocation", "g", "Lk9a$b;", "request", "", "setDeliveryOrderType", "Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", com.huawei.hms.push.e.a, "Lk9a$a;", Image.TYPE_HIGH, "Lc66;", com.huawei.hms.opendevice.c.a, "Ljx2;", "deliveryLocation", "", "clientPhoneNumber", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a$c;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0146a extends a {
            public static final C0146a a = new C0146a();

            private C0146a() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljx2;", "a", "Ljx2;", "()Ljx2;", "deliveryLocation", "<init>", "(Ljx2;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private final jx2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jx2 jx2Var) {
                super(null);
                z65.h(jx2Var, "deliveryLocation");
                this.a = jx2Var;
            }

            public final jx2 a() {
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
                jx2 jx2Var = this.a;
                return "ErrorUndeliverable(deliveryLocation=" + jx2Var + ")";
            }
        }

        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljx2;", "a", "Ljx2;", "()Ljx2;", "deliveryLocation", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "localityId", "<init>", "(Ljx2;Ljava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends a {
            private final jx2 a;
            private final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(jx2 jx2Var, String str) {
                super(null);
                z65.h(jx2Var, "deliveryLocation");
                z65.h(str, "localityId");
                this.a = jx2Var;
                this.b = str;
            }

            public final jx2 a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                jx2 jx2Var = this.a;
                String str = this.b;
                return "Success(deliveryLocation=" + jx2Var + ", localityId=" + str + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b$c;", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b$a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b$b;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0147b extends b {
            public static final C0147b a = new C0147b();

            private C0147b() {
                super(null);
            }
        }

        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b$c;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "a", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "()Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "fieldsDesign", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "localityId", "<init>", "(Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;Ljava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class c extends b {
            private final AddressDetailsFieldDesignDto a;
            private final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AddressDetailsFieldDesignDto addressDetailsFieldDesignDto, String str) {
                super(null);
                z65.h(addressDetailsFieldDesignDto, "fieldsDesign");
                this.a = addressDetailsFieldDesignDto;
                this.b = str;
            }

            public final AddressDetailsFieldDesignDto a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.a.hashCode() * 31;
                String str = this.b;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = this.a;
                String str = this.b;
                return "InitialData(fieldsDesign=" + addressDetailsFieldDesignDto + ", localityId=" + str + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    wx<a> a(qw1 qw1Var);

    wx<Unit> b(jx2 jx2Var, String str);

    wx<c66> c();

    wx<Unit> d(e91 e91Var);

    wx<sk9<a.b>> e(k9a.b bVar, boolean z);

    wx<b> f(qw1 qw1Var);

    wx<Unit> g(e91 e91Var);

    wx<k9a.a> h(e91 e91Var);
}
