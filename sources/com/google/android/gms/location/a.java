package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        zzbo[] zzboVarArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
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
                                zzboVarArr = (zzbo[]) SafeParcelReader.i(parcel, t, zzbo.CREATOR);
                            }
                        } else {
                            i = SafeParcelReader.v(parcel, t);
                        }
                    } else {
                        j = SafeParcelReader.x(parcel, t);
                    }
                } else {
                    i3 = SafeParcelReader.v(parcel, t);
                }
            } else {
                i2 = SafeParcelReader.v(parcel, t);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LocationAvailability(i, i2, i3, j, zzboVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
