package com.dodopizza.payment.core.domain.method;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentMethod.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "isDefault", "", "()Z", "providerCode", "getProviderCode", "providerData", "", "getProviderData", "()Ljava/util/Map;", "providerName", "getProviderName", "RedirectPaymentMethod", "SberPayPaymentMethod", "TwoStepPaymentMethod", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$RedirectPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$SberPayPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod;", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PaymentMethod {

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod$RedirectPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod;", "id", "", "providerName", "providerCode", "providerData", "", "isDefault", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "getId", "()Ljava/lang/String;", "()Z", "getProviderCode", "getProviderData", "()Ljava/util/Map;", "getProviderName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class RedirectPaymentMethod extends PaymentMethod {
        private final String id;
        private final boolean isDefault;
        private final String providerCode;
        private final Map<String, String> providerData;
        private final String providerName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectPaymentMethod(String str, String str2, String str3, Map<String, String> map, boolean z) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, "providerName");
            z65.h(str3, "providerCode");
            z65.h(map, "providerData");
            this.id = str;
            this.providerName = str2;
            this.providerCode = str3;
            this.providerData = map;
            this.isDefault = z;
        }

        public static /* synthetic */ RedirectPaymentMethod copy$default(RedirectPaymentMethod redirectPaymentMethod, String str, String str2, String str3, Map map, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirectPaymentMethod.getId();
            }
            if ((i & 2) != 0) {
                str2 = redirectPaymentMethod.getProviderName();
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = redirectPaymentMethod.getProviderCode();
            }
            String str5 = str3;
            Map<String, String> map2 = map;
            if ((i & 8) != 0) {
                map2 = redirectPaymentMethod.getProviderData();
            }
            Map map3 = map2;
            if ((i & 16) != 0) {
                z = redirectPaymentMethod.isDefault();
            }
            return redirectPaymentMethod.copy(str, str4, str5, map3, z);
        }

        public final String component1() {
            return getId();
        }

        public final String component2() {
            return getProviderName();
        }

        public final String component3() {
            return getProviderCode();
        }

        public final Map<String, String> component4() {
            return getProviderData();
        }

        public final boolean component5() {
            return isDefault();
        }

        public final RedirectPaymentMethod copy(String str, String str2, String str3, Map<String, String> map, boolean z) {
            z65.h(str, "id");
            z65.h(str2, "providerName");
            z65.h(str3, "providerCode");
            z65.h(map, "providerData");
            return new RedirectPaymentMethod(str, str2, str3, map, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedirectPaymentMethod)) {
                return false;
            }
            RedirectPaymentMethod redirectPaymentMethod = (RedirectPaymentMethod) obj;
            if (z65.c(getId(), redirectPaymentMethod.getId()) && z65.c(getProviderName(), redirectPaymentMethod.getProviderName()) && z65.c(getProviderCode(), redirectPaymentMethod.getProviderCode()) && z65.c(getProviderData(), redirectPaymentMethod.getProviderData()) && isDefault() == redirectPaymentMethod.isDefault()) {
                return true;
            }
            return false;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public String getId() {
            return this.id;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public String getProviderCode() {
            return this.providerCode;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public Map<String, String> getProviderData() {
            return this.providerData;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public String getProviderName() {
            return this.providerName;
        }

        public int hashCode() {
            int hashCode = ((((((getId().hashCode() * 31) + getProviderName().hashCode()) * 31) + getProviderCode().hashCode()) * 31) + getProviderData().hashCode()) * 31;
            boolean isDefault = isDefault();
            int i = isDefault;
            if (isDefault) {
                i = 1;
            }
            return hashCode + i;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public boolean isDefault() {
            return this.isDefault;
        }

        public String toString() {
            return "RedirectPaymentMethod(id=" + getId() + ", providerName=" + getProviderName() + ", providerCode=" + getProviderCode() + ", providerData=" + getProviderData() + ", isDefault=" + isDefault() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod$SberPayPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod;", "id", "", "providerName", "providerCode", "providerData", "", "isDefault", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "getId", "()Ljava/lang/String;", "()Z", "getProviderCode", "getProviderData", "()Ljava/util/Map;", "getProviderName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SberPayPaymentMethod extends PaymentMethod {
        private final String id;
        private final boolean isDefault;
        private final String providerCode;
        private final Map<String, String> providerData;
        private final String providerName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SberPayPaymentMethod(String str, String str2, String str3, Map<String, String> map, boolean z) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, "providerName");
            z65.h(str3, "providerCode");
            z65.h(map, "providerData");
            this.id = str;
            this.providerName = str2;
            this.providerCode = str3;
            this.providerData = map;
            this.isDefault = z;
        }

        public static /* synthetic */ SberPayPaymentMethod copy$default(SberPayPaymentMethod sberPayPaymentMethod, String str, String str2, String str3, Map map, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sberPayPaymentMethod.getId();
            }
            if ((i & 2) != 0) {
                str2 = sberPayPaymentMethod.getProviderName();
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = sberPayPaymentMethod.getProviderCode();
            }
            String str5 = str3;
            Map<String, String> map2 = map;
            if ((i & 8) != 0) {
                map2 = sberPayPaymentMethod.getProviderData();
            }
            Map map3 = map2;
            if ((i & 16) != 0) {
                z = sberPayPaymentMethod.isDefault();
            }
            return sberPayPaymentMethod.copy(str, str4, str5, map3, z);
        }

        public final String component1() {
            return getId();
        }

        public final String component2() {
            return getProviderName();
        }

        public final String component3() {
            return getProviderCode();
        }

        public final Map<String, String> component4() {
            return getProviderData();
        }

        public final boolean component5() {
            return isDefault();
        }

        public final SberPayPaymentMethod copy(String str, String str2, String str3, Map<String, String> map, boolean z) {
            z65.h(str, "id");
            z65.h(str2, "providerName");
            z65.h(str3, "providerCode");
            z65.h(map, "providerData");
            return new SberPayPaymentMethod(str, str2, str3, map, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SberPayPaymentMethod)) {
                return false;
            }
            SberPayPaymentMethod sberPayPaymentMethod = (SberPayPaymentMethod) obj;
            if (z65.c(getId(), sberPayPaymentMethod.getId()) && z65.c(getProviderName(), sberPayPaymentMethod.getProviderName()) && z65.c(getProviderCode(), sberPayPaymentMethod.getProviderCode()) && z65.c(getProviderData(), sberPayPaymentMethod.getProviderData()) && isDefault() == sberPayPaymentMethod.isDefault()) {
                return true;
            }
            return false;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public String getId() {
            return this.id;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public String getProviderCode() {
            return this.providerCode;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public Map<String, String> getProviderData() {
            return this.providerData;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public String getProviderName() {
            return this.providerName;
        }

        public int hashCode() {
            int hashCode = ((((((getId().hashCode() * 31) + getProviderName().hashCode()) * 31) + getProviderCode().hashCode()) * 31) + getProviderData().hashCode()) * 31;
            boolean isDefault = isDefault();
            int i = isDefault;
            if (isDefault) {
                i = 1;
            }
            return hashCode + i;
        }

        @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
        public boolean isDefault() {
            return this.isDefault;
        }

        public String toString() {
            return "SberPayPaymentMethod(id=" + getId() + ", providerName=" + getProviderName() + ", providerCode=" + getProviderCode() + ", providerData=" + getProviderData() + ", isDefault=" + isDefault() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod;", "()V", "NewCardPaymentMethod", "SavedCardPaymentMethod", "WalletPayPaymentMethod", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod$NewCardPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod$SavedCardPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod$WalletPayPaymentMethod;", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class TwoStepPaymentMethod extends PaymentMethod {

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod$NewCardPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod;", "id", "", "providerName", "providerCode", "providerData", "", "isDefault", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "getId", "()Ljava/lang/String;", "()Z", "getProviderCode", "getProviderData", "()Ljava/util/Map;", "getProviderName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class NewCardPaymentMethod extends TwoStepPaymentMethod {
            private final String id;
            private final boolean isDefault;
            private final String providerCode;
            private final Map<String, String> providerData;
            private final String providerName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewCardPaymentMethod(String str, String str2, String str3, Map<String, String> map, boolean z) {
                super(null);
                z65.h(str, "id");
                z65.h(str2, "providerName");
                z65.h(str3, "providerCode");
                z65.h(map, "providerData");
                this.id = str;
                this.providerName = str2;
                this.providerCode = str3;
                this.providerData = map;
                this.isDefault = z;
            }

            public static /* synthetic */ NewCardPaymentMethod copy$default(NewCardPaymentMethod newCardPaymentMethod, String str, String str2, String str3, Map map, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = newCardPaymentMethod.getId();
                }
                if ((i & 2) != 0) {
                    str2 = newCardPaymentMethod.getProviderName();
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = newCardPaymentMethod.getProviderCode();
                }
                String str5 = str3;
                Map<String, String> map2 = map;
                if ((i & 8) != 0) {
                    map2 = newCardPaymentMethod.getProviderData();
                }
                Map map3 = map2;
                if ((i & 16) != 0) {
                    z = newCardPaymentMethod.isDefault();
                }
                return newCardPaymentMethod.copy(str, str4, str5, map3, z);
            }

            public final String component1() {
                return getId();
            }

            public final String component2() {
                return getProviderName();
            }

            public final String component3() {
                return getProviderCode();
            }

            public final Map<String, String> component4() {
                return getProviderData();
            }

            public final boolean component5() {
                return isDefault();
            }

            public final NewCardPaymentMethod copy(String str, String str2, String str3, Map<String, String> map, boolean z) {
                z65.h(str, "id");
                z65.h(str2, "providerName");
                z65.h(str3, "providerCode");
                z65.h(map, "providerData");
                return new NewCardPaymentMethod(str, str2, str3, map, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewCardPaymentMethod)) {
                    return false;
                }
                NewCardPaymentMethod newCardPaymentMethod = (NewCardPaymentMethod) obj;
                if (z65.c(getId(), newCardPaymentMethod.getId()) && z65.c(getProviderName(), newCardPaymentMethod.getProviderName()) && z65.c(getProviderCode(), newCardPaymentMethod.getProviderCode()) && z65.c(getProviderData(), newCardPaymentMethod.getProviderData()) && isDefault() == newCardPaymentMethod.isDefault()) {
                    return true;
                }
                return false;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getId() {
                return this.id;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getProviderCode() {
                return this.providerCode;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public Map<String, String> getProviderData() {
                return this.providerData;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getProviderName() {
                return this.providerName;
            }

            public int hashCode() {
                int hashCode = ((((((getId().hashCode() * 31) + getProviderName().hashCode()) * 31) + getProviderCode().hashCode()) * 31) + getProviderData().hashCode()) * 31;
                boolean isDefault = isDefault();
                int i = isDefault;
                if (isDefault) {
                    i = 1;
                }
                return hashCode + i;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public boolean isDefault() {
                return this.isDefault;
            }

            public String toString() {
                return "NewCardPaymentMethod(id=" + getId() + ", providerName=" + getProviderName() + ", providerCode=" + getProviderCode() + ", providerData=" + getProviderData() + ", isDefault=" + isDefault() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JQ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b\u0011\u0010%¨\u0006("}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod$SavedCardPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod;", "", "component1", "component2", "component3", "", "component4", "Lbw7;", "component5", "", "component6", "id", "providerName", "providerCode", "providerData", "savedCard", "isDefault", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getProviderName", "getProviderCode", "Ljava/util/Map;", "getProviderData", "()Ljava/util/Map;", "Lbw7;", "getSavedCard", "()Lbw7;", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lbw7;Z)V", "payment-core_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes2.dex */
        public static final class SavedCardPaymentMethod extends TwoStepPaymentMethod {
            private final String id;
            private final boolean isDefault;
            private final String providerCode;
            private final Map<String, String> providerData;
            private final String providerName;
            private final bw7 savedCard;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SavedCardPaymentMethod(String str, String str2, String str3, Map<String, String> map, bw7 bw7Var, boolean z) {
                super(null);
                z65.h(str, "id");
                z65.h(str2, "providerName");
                z65.h(str3, "providerCode");
                z65.h(map, "providerData");
                z65.h(bw7Var, "savedCard");
                this.id = str;
                this.providerName = str2;
                this.providerCode = str3;
                this.providerData = map;
                this.savedCard = bw7Var;
                this.isDefault = z;
            }

            public static /* synthetic */ SavedCardPaymentMethod copy$default(SavedCardPaymentMethod savedCardPaymentMethod, String str, String str2, String str3, Map map, bw7 bw7Var, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = savedCardPaymentMethod.getId();
                }
                if ((i & 2) != 0) {
                    str2 = savedCardPaymentMethod.getProviderName();
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = savedCardPaymentMethod.getProviderCode();
                }
                String str5 = str3;
                Map<String, String> map2 = map;
                if ((i & 8) != 0) {
                    map2 = savedCardPaymentMethod.getProviderData();
                }
                Map map3 = map2;
                if ((i & 16) != 0) {
                    bw7Var = savedCardPaymentMethod.savedCard;
                }
                bw7 bw7Var2 = bw7Var;
                if ((i & 32) != 0) {
                    z = savedCardPaymentMethod.isDefault();
                }
                return savedCardPaymentMethod.copy(str, str4, str5, map3, bw7Var2, z);
            }

            public final String component1() {
                return getId();
            }

            public final String component2() {
                return getProviderName();
            }

            public final String component3() {
                return getProviderCode();
            }

            public final Map<String, String> component4() {
                return getProviderData();
            }

            public final bw7 component5() {
                return this.savedCard;
            }

            public final boolean component6() {
                return isDefault();
            }

            public final SavedCardPaymentMethod copy(String str, String str2, String str3, Map<String, String> map, bw7 bw7Var, boolean z) {
                z65.h(str, "id");
                z65.h(str2, "providerName");
                z65.h(str3, "providerCode");
                z65.h(map, "providerData");
                z65.h(bw7Var, "savedCard");
                return new SavedCardPaymentMethod(str, str2, str3, map, bw7Var, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SavedCardPaymentMethod)) {
                    return false;
                }
                SavedCardPaymentMethod savedCardPaymentMethod = (SavedCardPaymentMethod) obj;
                if (z65.c(getId(), savedCardPaymentMethod.getId()) && z65.c(getProviderName(), savedCardPaymentMethod.getProviderName()) && z65.c(getProviderCode(), savedCardPaymentMethod.getProviderCode()) && z65.c(getProviderData(), savedCardPaymentMethod.getProviderData()) && z65.c(this.savedCard, savedCardPaymentMethod.savedCard) && isDefault() == savedCardPaymentMethod.isDefault()) {
                    return true;
                }
                return false;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getId() {
                return this.id;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getProviderCode() {
                return this.providerCode;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public Map<String, String> getProviderData() {
                return this.providerData;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getProviderName() {
                return this.providerName;
            }

            public final bw7 getSavedCard() {
                return this.savedCard;
            }

            public int hashCode() {
                int hashCode = ((((((((getId().hashCode() * 31) + getProviderName().hashCode()) * 31) + getProviderCode().hashCode()) * 31) + getProviderData().hashCode()) * 31) + this.savedCard.hashCode()) * 31;
                boolean isDefault = isDefault();
                int i = isDefault;
                if (isDefault) {
                    i = 1;
                }
                return hashCode + i;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public boolean isDefault() {
                return this.isDefault;
            }

            public String toString() {
                return "SavedCardPaymentMethod(id=" + getId() + ", providerName=" + getProviderName() + ", providerCode=" + getProviderCode() + ", providerData=" + getProviderData() + ", savedCard=" + this.savedCard + ", isDefault=" + isDefault() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod$WalletPayPaymentMethod;", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod$TwoStepPaymentMethod;", "id", "", "providerName", "providerCode", "providerData", "", "walletCode", "isDefault", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "()Z", "getProviderCode", "getProviderData", "()Ljava/util/Map;", "getProviderName", "getWalletCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "payment-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class WalletPayPaymentMethod extends TwoStepPaymentMethod {
            private final String id;
            private final boolean isDefault;
            private final String providerCode;
            private final Map<String, String> providerData;
            private final String providerName;
            private final String walletCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WalletPayPaymentMethod(String str, String str2, String str3, Map<String, String> map, String str4, boolean z) {
                super(null);
                z65.h(str, "id");
                z65.h(str2, "providerName");
                z65.h(str3, "providerCode");
                z65.h(map, "providerData");
                z65.h(str4, "walletCode");
                this.id = str;
                this.providerName = str2;
                this.providerCode = str3;
                this.providerData = map;
                this.walletCode = str4;
                this.isDefault = z;
            }

            public static /* synthetic */ WalletPayPaymentMethod copy$default(WalletPayPaymentMethod walletPayPaymentMethod, String str, String str2, String str3, Map map, String str4, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = walletPayPaymentMethod.getId();
                }
                if ((i & 2) != 0) {
                    str2 = walletPayPaymentMethod.getProviderName();
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = walletPayPaymentMethod.getProviderCode();
                }
                String str6 = str3;
                Map<String, String> map2 = map;
                if ((i & 8) != 0) {
                    map2 = walletPayPaymentMethod.getProviderData();
                }
                Map map3 = map2;
                if ((i & 16) != 0) {
                    str4 = walletPayPaymentMethod.walletCode;
                }
                String str7 = str4;
                if ((i & 32) != 0) {
                    z = walletPayPaymentMethod.isDefault();
                }
                return walletPayPaymentMethod.copy(str, str5, str6, map3, str7, z);
            }

            public final String component1() {
                return getId();
            }

            public final String component2() {
                return getProviderName();
            }

            public final String component3() {
                return getProviderCode();
            }

            public final Map<String, String> component4() {
                return getProviderData();
            }

            public final String component5() {
                return this.walletCode;
            }

            public final boolean component6() {
                return isDefault();
            }

            public final WalletPayPaymentMethod copy(String str, String str2, String str3, Map<String, String> map, String str4, boolean z) {
                z65.h(str, "id");
                z65.h(str2, "providerName");
                z65.h(str3, "providerCode");
                z65.h(map, "providerData");
                z65.h(str4, "walletCode");
                return new WalletPayPaymentMethod(str, str2, str3, map, str4, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WalletPayPaymentMethod)) {
                    return false;
                }
                WalletPayPaymentMethod walletPayPaymentMethod = (WalletPayPaymentMethod) obj;
                if (z65.c(getId(), walletPayPaymentMethod.getId()) && z65.c(getProviderName(), walletPayPaymentMethod.getProviderName()) && z65.c(getProviderCode(), walletPayPaymentMethod.getProviderCode()) && z65.c(getProviderData(), walletPayPaymentMethod.getProviderData()) && z65.c(this.walletCode, walletPayPaymentMethod.walletCode) && isDefault() == walletPayPaymentMethod.isDefault()) {
                    return true;
                }
                return false;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getId() {
                return this.id;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getProviderCode() {
                return this.providerCode;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public Map<String, String> getProviderData() {
                return this.providerData;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public String getProviderName() {
                return this.providerName;
            }

            public final String getWalletCode() {
                return this.walletCode;
            }

            public int hashCode() {
                int hashCode = ((((((((getId().hashCode() * 31) + getProviderName().hashCode()) * 31) + getProviderCode().hashCode()) * 31) + getProviderData().hashCode()) * 31) + this.walletCode.hashCode()) * 31;
                boolean isDefault = isDefault();
                int i = isDefault;
                if (isDefault) {
                    i = 1;
                }
                return hashCode + i;
            }

            @Override // com.dodopizza.payment.core.domain.method.PaymentMethod
            public boolean isDefault() {
                return this.isDefault;
            }

            public String toString() {
                return "WalletPayPaymentMethod(id=" + getId() + ", providerName=" + getProviderName() + ", providerCode=" + getProviderCode() + ", providerData=" + getProviderData() + ", walletCode=" + this.walletCode + ", isDefault=" + isDefault() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ TwoStepPaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TwoStepPaymentMethod() {
            super(null);
        }
    }

    private PaymentMethod() {
    }

    public /* synthetic */ PaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    public abstract String getProviderCode();

    public abstract Map<String, String> getProviderData();

    public abstract String getProviderName();

    public abstract boolean isDefault();
}
