package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new fnc();
    @NonNull
    public final LatLng a;
    @NonNull
    public final LatLng b;
    @NonNull
    public final LatLng c;
    @NonNull
    public final LatLng d;
    @NonNull
    public final LatLngBounds e;

    public VisibleRegion(@NonNull LatLng latLng, @NonNull LatLng latLng2, @NonNull LatLng latLng3, @NonNull LatLng latLng4, @NonNull LatLngBounds latLngBounds) {
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
        this.d = latLng4;
        this.e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.a.equals(visibleRegion.a) && this.b.equals(visibleRegion.b) && this.c.equals(visibleRegion.c) && this.d.equals(visibleRegion.d) && this.e.equals(visibleRegion.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m57.b(this.a, this.b, this.c, this.d, this.e);
    }

    @NonNull
    public String toString() {
        return m57.c(this).a("nearLeft", this.a).a("nearRight", this.b).a("farLeft", this.c).a("farRight", this.d).a("latLngBounds", this.e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.s(parcel, 2, this.a, i, false);
        ys9.s(parcel, 3, this.b, i, false);
        ys9.s(parcel, 4, this.c, i, false);
        ys9.s(parcel, 5, this.d, i, false);
        ys9.s(parcel, 6, this.e, i, false);
        ys9.b(parcel, a);
    }
}
