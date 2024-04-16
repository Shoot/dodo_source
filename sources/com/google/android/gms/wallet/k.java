package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator<MaskedWallet> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MaskedWallet createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 4:
                    strArr = SafeParcelReader.g(parcel, t);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    zzaVar = (zza) SafeParcelReader.e(parcel, t, zza.CREATOR);
                    break;
                case 7:
                    zzaVar2 = (zza) SafeParcelReader.e(parcel, t, zza.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) SafeParcelReader.i(parcel, t, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) SafeParcelReader.i(parcel, t, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) SafeParcelReader.e(parcel, t, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) SafeParcelReader.e(parcel, t, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) SafeParcelReader.i(parcel, t, InstrumentInfo.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new MaskedWallet(str, str2, strArr, str3, zzaVar, zzaVar2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MaskedWallet[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
