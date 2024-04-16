package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 2:
                    b = SafeParcelReader.o(parcel, t);
                    break;
                case 3:
                    b2 = SafeParcelReader.o(parcel, t);
                    break;
                case 4:
                    i = SafeParcelReader.v(parcel, t);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.e(parcel, t, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.o(parcel, t);
                    break;
                case 7:
                    b4 = SafeParcelReader.o(parcel, t);
                    break;
                case 8:
                    b5 = SafeParcelReader.o(parcel, t);
                    break;
                case 9:
                    b6 = SafeParcelReader.o(parcel, t);
                    break;
                case 10:
                    b7 = SafeParcelReader.o(parcel, t);
                    break;
                case 11:
                    b8 = SafeParcelReader.o(parcel, t);
                    break;
                case 12:
                    b9 = SafeParcelReader.o(parcel, t);
                    break;
                case 13:
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
                case 14:
                    b10 = SafeParcelReader.o(parcel, t);
                    break;
                case 15:
                    b11 = SafeParcelReader.o(parcel, t);
                    break;
                case 16:
                    f = SafeParcelReader.s(parcel, t);
                    break;
                case 17:
                    f2 = SafeParcelReader.s(parcel, t);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.e(parcel, t, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.o(parcel, t);
                    break;
                case 20:
                    num = SafeParcelReader.w(parcel, t);
                    break;
                case 21:
                    str = SafeParcelReader.f(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
