package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator<PaymentMethodToken> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PaymentMethodToken createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    str = SafeParcelReader.f(parcel, t);
                }
            } else {
                i = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new PaymentMethodToken(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PaymentMethodToken[] newArray(int i) {
        return new PaymentMethodToken[i];
    }
}
