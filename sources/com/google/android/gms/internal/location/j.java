package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = zzba.l;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                switch (l) {
                    case 5:
                        arrayList = SafeParcelReader.j(parcel, t, ClientIdentity.CREATOR);
                        continue;
                    case 6:
                        str = SafeParcelReader.f(parcel, t);
                        continue;
                    case 7:
                        z = SafeParcelReader.m(parcel, t);
                        continue;
                    case 8:
                        z2 = SafeParcelReader.m(parcel, t);
                        continue;
                    case 9:
                        z3 = SafeParcelReader.m(parcel, t);
                        continue;
                    case 10:
                        str2 = SafeParcelReader.f(parcel, t);
                        continue;
                    case 11:
                        z4 = SafeParcelReader.m(parcel, t);
                        continue;
                    case 12:
                        z5 = SafeParcelReader.m(parcel, t);
                        continue;
                    case 13:
                        str3 = SafeParcelReader.f(parcel, t);
                        continue;
                    case 14:
                        j = SafeParcelReader.x(parcel, t);
                        continue;
                    default:
                        SafeParcelReader.A(parcel, t);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.e(parcel, t, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new zzba(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i) {
        return new zzba[i];
    }
}
