package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator<CardRequirements> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardRequirements createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList<Integer> arrayList = null;
        boolean z = false;
        int i = 0;
        boolean z2 = true;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 4) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            i = SafeParcelReader.v(parcel, t);
                        }
                    } else {
                        z = SafeParcelReader.m(parcel, t);
                    }
                } else {
                    z2 = SafeParcelReader.m(parcel, t);
                }
            } else {
                arrayList = SafeParcelReader.d(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new CardRequirements(arrayList, z2, z, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardRequirements[] newArray(int i) {
        return new CardRequirements[i];
    }
}
