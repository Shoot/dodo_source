package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator<ShippingAddressRequirements> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ShippingAddressRequirements createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t) != 1) {
                SafeParcelReader.A(parcel, t);
            } else {
                arrayList = SafeParcelReader.h(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new ShippingAddressRequirements(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ShippingAddressRequirements[] newArray(int i) {
        return new ShippingAddressRequirements[i];
    }
}
