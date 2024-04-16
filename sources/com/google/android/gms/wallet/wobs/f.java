package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator<LoyaltyPoints> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyPoints createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 5) {
                        SafeParcelReader.A(parcel, t);
                    } else {
                        timeInterval = (TimeInterval) SafeParcelReader.e(parcel, t, TimeInterval.CREATOR);
                    }
                } else {
                    loyaltyPointsBalance = (LoyaltyPointsBalance) SafeParcelReader.e(parcel, t, LoyaltyPointsBalance.CREATOR);
                }
            } else {
                str = SafeParcelReader.f(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyPoints[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
