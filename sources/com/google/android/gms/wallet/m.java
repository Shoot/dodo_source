package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator<PaymentData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PaymentData createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 2:
                    cardInfo = (CardInfo) SafeParcelReader.e(parcel, t, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) SafeParcelReader.e(parcel, t, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) SafeParcelReader.e(parcel, t, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    bundle = SafeParcelReader.a(parcel, t);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 8:
                    bundle2 = SafeParcelReader.a(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PaymentData[] newArray(int i) {
        return new PaymentData[i];
    }
}
