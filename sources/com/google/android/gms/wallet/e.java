package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator<CardInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardInfo createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            if (l != 5) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                userAddress = (UserAddress) SafeParcelReader.e(parcel, t, UserAddress.CREATOR);
                            }
                        } else {
                            i = SafeParcelReader.v(parcel, t);
                        }
                    } else {
                        str3 = SafeParcelReader.f(parcel, t);
                    }
                } else {
                    str2 = SafeParcelReader.f(parcel, t);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardInfo[] newArray(int i) {
        return new CardInfo[i];
    }
}
