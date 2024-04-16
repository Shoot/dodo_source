package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsStates;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: yrc  reason: default package */
/* loaded from: classes2.dex */
public final class yrc implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            switch (SafeParcelReader.l(t)) {
                case 1:
                    z = SafeParcelReader.m(parcel, t);
                    break;
                case 2:
                    z2 = SafeParcelReader.m(parcel, t);
                    break;
                case 3:
                    z3 = SafeParcelReader.m(parcel, t);
                    break;
                case 4:
                    z4 = SafeParcelReader.m(parcel, t);
                    break;
                case 5:
                    z5 = SafeParcelReader.m(parcel, t);
                    break;
                case 6:
                    z6 = SafeParcelReader.m(parcel, t);
                    break;
                default:
                    SafeParcelReader.A(parcel, t);
                    break;
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
