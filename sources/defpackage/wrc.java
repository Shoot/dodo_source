package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: wrc  reason: default package */
/* loaded from: classes2.dex */
public final class wrc implements Parcelable.Creator<LocationSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsResult createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < B) {
            int t = SafeParcelReader.t(parcel);
            int l = SafeParcelReader.l(t);
            if (l != 1) {
                if (l != 2) {
                    SafeParcelReader.A(parcel, t);
                } else {
                    locationSettingsStates = (LocationSettingsStates) SafeParcelReader.e(parcel, t, LocationSettingsStates.CREATOR);
                }
            } else {
                status = (Status) SafeParcelReader.e(parcel, t, Status.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, B);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsResult[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
