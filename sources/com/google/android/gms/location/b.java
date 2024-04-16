package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 2:
                    j = SafeParcelReader.x(parcel, t);
                    break;
                case 3:
                    j2 = SafeParcelReader.x(parcel, t);
                    break;
                case 4:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 5:
                    j3 = SafeParcelReader.x(parcel, t);
                    break;
                case 6:
                    i2 = SafeParcelReader.v(parcel, t);
                    break;
                case 7:
                    f = SafeParcelReader.r(parcel, t);
                    break;
                case 8:
                    j4 = SafeParcelReader.x(parcel, t);
                    break;
                case 9:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
