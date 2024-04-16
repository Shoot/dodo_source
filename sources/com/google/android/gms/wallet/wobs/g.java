package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator<WalletObjectMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WalletObjectMessage createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            if (l != 6) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                uriData2 = (UriData) SafeParcelReader.e(parcel, t, UriData.CREATOR);
                            }
                        } else {
                            uriData = (UriData) SafeParcelReader.e(parcel, t, UriData.CREATOR);
                        }
                    } else {
                        timeInterval = (TimeInterval) SafeParcelReader.e(parcel, t, TimeInterval.CREATOR);
                    }
                } else {
                    str2 = SafeParcelReader.f(parcel, t);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WalletObjectMessage[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
