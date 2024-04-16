package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        zzbj zzbjVar = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    if (l != 3) {
                        if (l != 5) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            zzbjVar = (zzbj) SafeParcelReader.e(parcel, t, zzbj.CREATOR);
                        }
                    } else {
                        z2 = SafeParcelReader.m(parcel, t);
                    }
                } else {
                    z = SafeParcelReader.m(parcel, t);
                }
            } else {
                arrayList = SafeParcelReader.j(parcel, t, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LocationSettingsRequest(arrayList, z, z2, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
