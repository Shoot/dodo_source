package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements tk9 {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new wrc();
    private final Status a;
    private final LocationSettingsStates b;

    public LocationSettingsResult(@RecentlyNonNull Status status, LocationSettingsStates locationSettingsStates) {
        this.a = status;
        this.b = locationSettingsStates;
    }

    @Override // defpackage.tk9
    @RecentlyNonNull
    public Status d() {
        return this.a;
    }

    @RecentlyNullable
    public LocationSettingsStates h() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 1, d(), i, false);
        ys9.s(parcel, 2, h(), i, false);
        ys9.b(parcel, a);
    }
}
