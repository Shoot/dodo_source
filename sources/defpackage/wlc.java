package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: wlc  reason: default package */
/* loaded from: classes2.dex */
public final class wlc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 2) {
                if (l != 3) {
                    if (l != 4) {
                        if (l != 5) {
                            SafeParcelReader.A(parcel, t);
                        } else {
                            f3 = SafeParcelReader.r(parcel, t);
                        }
                    } else {
                        f2 = SafeParcelReader.r(parcel, t);
                    }
                } else {
                    f = SafeParcelReader.r(parcel, t);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.e(parcel, t, LatLng.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
