package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator<OfferWalletObject> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OfferWalletObject createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            commonWalletObject = (CommonWalletObject) SafeParcelReader.e(parcel, t, CommonWalletObject.CREATOR);
                        }
                    } else {
                        str2 = SafeParcelReader.f(parcel, t);
                    }
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                i = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new OfferWalletObject(i, str, str2, commonWalletObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OfferWalletObject[] newArray(int i) {
        return new OfferWalletObject[i];
    }
}
