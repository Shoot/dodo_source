package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: fnc  reason: default package */
/* loaded from: classes2.dex */
public final class fnc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            if (l != 6) {
                                SafeParcelReader.A(parcel, t);
                            } else {
                                latLngBounds = (LatLngBounds) SafeParcelReader.e(parcel, t, LatLngBounds.CREATOR);
                            }
                        } else {
                            latLng4 = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
                        }
                    } else {
                        latLng3 = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
                    }
                } else {
                    latLng2 = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
