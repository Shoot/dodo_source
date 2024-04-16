package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new o();
    boolean a;
    boolean b;
    CardRequirements c;
    boolean d;
    ShippingAddressRequirements e;
    ArrayList<Integer> f;
    PaymentMethodTokenizationParameters g;
    TransactionInfo h;
    boolean i;
    String j;
    Bundle k;

    /* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
    @Deprecated
    /* loaded from: classes2.dex */
    public final class a {
        /* synthetic */ a(n nVar) {
        }

        @RecentlyNonNull
        public PaymentDataRequest a() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.j == null) {
                gh8.k(paymentDataRequest.f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                gh8.k(PaymentDataRequest.this.c, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.g != null) {
                    gh8.k(paymentDataRequest2.h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }
    }

    private PaymentDataRequest() {
        this.i = true;
    }

    @RecentlyNonNull
    public static PaymentDataRequest h(@RecentlyNonNull String str) {
        a k = k();
        PaymentDataRequest.this.j = (String) gh8.k(str, "paymentDataRequestJson cannot be null!");
        return k.a();
    }

    @RecentlyNonNull
    @Deprecated
    public static a k() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.c(parcel, 1, this.a);
        ys9.c(parcel, 2, this.b);
        ys9.s(parcel, 3, this.c, i, false);
        ys9.c(parcel, 4, this.d);
        ys9.s(parcel, 5, this.e, i, false);
        ys9.o(parcel, 6, this.f, false);
        ys9.s(parcel, 7, this.g, i, false);
        ys9.s(parcel, 8, this.h, i, false);
        ys9.c(parcel, 9, this.i);
        ys9.t(parcel, 10, this.j, false);
        ys9.e(parcel, 11, this.k, false);
        ys9.b(parcel, a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList<Integer> arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = cardRequirements;
        this.d = z3;
        this.e = shippingAddressRequirements;
        this.f = arrayList;
        this.g = paymentMethodTokenizationParameters;
        this.h = transactionInfo;
        this.i = z4;
        this.j = str;
        this.k = bundle;
    }
}
