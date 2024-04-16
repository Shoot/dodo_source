package com.dodopizza.onboarding.feature.chooseordertype.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ChooseOrderTypeRouter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001:\u0004)\u000b\u001e\u001cJ,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J2\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0014\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H&J\b\u0010\u0018\u001a\u00020\nH&J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\bH&J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\bH&J\b\u0010'\u001a\u00020\nH&J\b\u0010(\u001a\u00020\nH&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H&¨\u0006*"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;", "", "", "isEmptyCart", "Ldt5;", "currentLocality", "Ltl5;", "currentLanguage", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "b", "j", "Lhv0$b;", "localitySelectionResult", "Lnaa;", MessageAttributes.TYPE, "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$d;", "i", "(Lhv0$b;Lnaa;Ljava/lang/String;ZLcv1;)Ljava/lang/Object;", "g", "(Ldt5;Ljava/lang/String;Lnaa;ZLcv1;)Ljava/lang/Object;", "Loz3;", "f", "k", "l", "locality", "language", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$c;", com.huawei.hms.opendevice.c.a, "(Ldt5;Lcv1;)Ljava/lang/Object;", "pizzeriaId", "pizzeriaHasRestaurantOperationalType", "languageConfig", e.a, "firstAppStart", "deviceLocalityCode", Image.TYPE_HIGH, Image.TYPE_MEDIUM, "onBackPressed", "a", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChooseOrderTypeRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.onboarding.feature.chooseordertype.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class EnumC0163a {
        public static final EnumC0163a a = new EnumC0163a("DELIVERY_ADDRESS_SELECTED", 0);
        public static final EnumC0163a b = new EnumC0163a("DELIVERY_LOCATION_DETAILS_CHANGED", 1);
        public static final EnumC0163a c = new EnumC0163a("MAIN_SCREEN", 2);
        public static final EnumC0163a d = new EnumC0163a("LOCALITY_CHANGED", 3);
        private static final /* synthetic */ EnumC0163a[] e;
        private static final /* synthetic */ kj3 f;

        static {
            EnumC0163a[] a2 = a();
            e = a2;
            f = lj3.a(a2);
        }

        private EnumC0163a(String str, int i) {
        }

        private static final /* synthetic */ EnumC0163a[] a() {
            return new EnumC0163a[]{a, b, c, d};
        }

        public static EnumC0163a valueOf(String str) {
            return (EnumC0163a) Enum.valueOf(EnumC0163a.class, str);
        }

        public static EnumC0163a[] values() {
            return (EnumC0163a[]) e.clone();
        }
    }

    /* compiled from: ChooseOrderTypeRouter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$b;", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$a;", "a", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$a;", "()Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$a;", "deliveryResultType", "<init>", "(Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$a;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b implements d {
        private final EnumC0163a a;

        public b(EnumC0163a enumC0163a) {
            z65.h(enumC0163a, "deliveryResultType");
            this.a = enumC0163a;
        }

        public final EnumC0163a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            EnumC0163a enumC0163a = this.a;
            return "NavigateToSelectDeliveryResult(deliveryResultType=" + enumC0163a + ")";
        }
    }

    /* compiled from: ChooseOrderTypeRouter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$c;", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$d;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isPizzeriaCandidate", "b", "Ljava/lang/String;", com.huawei.hms.opendevice.c.a, "()Ljava/lang/String;", "pizzeriaId", "localityId", "pizzeriaHasRestaurantOperationalType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c implements d {
        private final boolean a;
        private final String b;
        private final String c;
        private final boolean d;

        public c(boolean z, String str, String str2, boolean z2) {
            z65.h(str, "pizzeriaId");
            z65.h(str2, "localityId");
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = z2;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == cVar.a && z65.c(this.b, cVar.b) && z65.c(this.c, cVar.c) && this.d == cVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((a91.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d);
        }

        public String toString() {
            boolean z = this.a;
            String str = this.b;
            String str2 = this.c;
            boolean z2 = this.d;
            return "NavigateToSelectPizzeriaResult(isPizzeriaCandidate=" + z + ", pizzeriaId=" + str + ", localityId=" + str2 + ", pizzeriaHasRestaurantOperationalType=" + z2 + ")";
        }
    }

    /* compiled from: ChooseOrderTypeRouter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$d;", "", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public interface d {
    }

    oz3<Unit> a();

    void b(boolean z, dt5 dt5Var, tl5 tl5Var, String str);

    Object c(dt5 dt5Var, cv1<? super c> cv1Var);

    void d(dt5 dt5Var, String str);

    void e(String str, dt5 dt5Var, boolean z, tl5 tl5Var);

    oz3<hv0.b> f();

    Object g(dt5 dt5Var, String str, naa naaVar, boolean z, cv1<? super d> cv1Var);

    void h(boolean z, String str);

    Object i(hv0.b bVar, naa naaVar, String str, boolean z, cv1<? super d> cv1Var);

    void j(String str, tl5 tl5Var);

    void k();

    void l(String str);

    void m();

    void onBackPressed();
}
