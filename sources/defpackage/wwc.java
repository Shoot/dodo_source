package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: wwc  reason: default package */
/* loaded from: classes2.dex */
public final class wwc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    latLng2 = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
