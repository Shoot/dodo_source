package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator<LoyaltyPointsBalance> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyPointsBalance createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        double d = 0.0d;
        long j = 0;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 3:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 4:
                    d = SafeParcelReader.p(parcel, t);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 6:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 7:
                    i2 = SafeParcelReader.v(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LoyaltyPointsBalance(i, str, d, str2, j, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyPointsBalance[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
