package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new yrc();
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public boolean h() {
        return this.f;
    }

    public boolean k() {
        return this.c;
    }

    public boolean p() {
        return this.d;
    }

    public boolean t() {
        return this.a;
    }

    public boolean u() {
        return this.e;
    }

    public boolean v() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.c(parcel, 1, t());
        ys9.c(parcel, 2, v());
        ys9.c(parcel, 3, k());
        ys9.c(parcel, 4, p());
        ys9.c(parcel, 5, u());
        ys9.c(parcel, 6, h());
        ys9.b(parcel, a);
    }
}
