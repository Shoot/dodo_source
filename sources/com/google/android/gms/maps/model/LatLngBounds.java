package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new wwc();
    @NonNull
    public final LatLng a;
    @NonNull
    public final LatLng b;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private double a = Double.POSITIVE_INFINITY;
        private double b = Double.NEGATIVE_INFINITY;
        private double c = Double.NaN;
        private double d = Double.NaN;

        @NonNull
        public LatLngBounds a() {
            gh8.n(!Double.isNaN(this.c), "no included points");
            return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
        }

        @NonNull
        public a b(@NonNull LatLng latLng) {
            gh8.k(latLng, "point must not be null");
            this.a = Math.min(this.a, latLng.a);
            this.b = Math.max(this.b, latLng.a);
            double d = latLng.b;
            if (Double.isNaN(this.c)) {
                this.c = d;
                this.d = d;
            } else {
                double d2 = this.c;
                double d3 = this.d;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.c = d;
                    } else {
                        this.d = d;
                    }
                }
            }
            return this;
        }
    }

    public LatLngBounds(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        boolean z;
        gh8.k(latLng, "southwest must not be null.");
        gh8.k(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        gh8.c(z, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.a));
        this.a = latLng;
        this.b = latLng2;
    }

    @NonNull
    public static a h() {
        return new a();
    }

    private final boolean p(double d) {
        double d2 = this.a.b;
        double d3 = this.b.b;
        if (d2 <= d3) {
            if (d2 > d || d > d3) {
                return false;
            }
            return true;
        } else if (d2 > d && d > d3) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m57.b(this.a, this.b);
    }

    public boolean k(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) gh8.k(latLng, "point must not be null.");
        double d = latLng2.a;
        if (this.a.a <= d && d <= this.b.a && p(latLng2.b)) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        return m57.c(this).a("southwest", this.a).a("northeast", this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.s(parcel, 2, this.a, i, false);
        ys9.s(parcel, 3, this.b, i, false);
        ys9.b(parcel, a2);
    }
}
