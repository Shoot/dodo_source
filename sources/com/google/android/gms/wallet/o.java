package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class o implements Parcelable.Creator<PaymentDataRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PaymentDataRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList<Integer> arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        Bundle bundle = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 2:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) SafeParcelReader.e(parcel, t, CardRequirements.CREATOR);
                    break;
                case 4:
                    z3 = SafeParcelReader.m(parcel, t);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) SafeParcelReader.e(parcel, t, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = SafeParcelReader.d(parcel, t);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) SafeParcelReader.e(parcel, t, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) SafeParcelReader.e(parcel, t, TransactionInfo.CREATOR);
                    break;
                case 9:
                    z4 = SafeParcelReader.m(parcel, t);
                    break;
                case 10:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 11:
                    bundle = SafeParcelReader.a(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new PaymentDataRequest(z, z2, cardRequirements, z3, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z4, str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PaymentDataRequest[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
