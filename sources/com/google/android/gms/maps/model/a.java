package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.f(parcel, t);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, t);
                    break;
                case 5:
                    iBinder = SafeParcelReader.u(parcel, t);
                    break;
                case 6:
                    f = SafeParcelReader.r(parcel, t);
                    break;
                case 7:
                    f2 = SafeParcelReader.r(parcel, t);
                    break;
                case 8:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 9:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 10:
                    z3 = SafeParcelReader.m(parcel, t);
                    break;
                case 11:
                    f3 = SafeParcelReader.r(parcel, t);
                    break;
                case 12:
                    f4 = SafeParcelReader.r(parcel, t);
                    break;
                case 13:
                    f5 = SafeParcelReader.r(parcel, t);
                    break;
                case 14:
                    f6 = SafeParcelReader.r(parcel, t);
                    break;
                case 15:
                    f7 = SafeParcelReader.r(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
