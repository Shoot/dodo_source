package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.inappstory.sdk.stories.utils.ViewAnimator;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new wlc();
    @NonNull
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private LatLng a;
        private float b;
        private float c;
        private float d;

        @NonNull
        public a a(float f) {
            this.d = f;
            return this;
        }

        @NonNull
        public CameraPosition b() {
            return new CameraPosition(this.a, this.b, this.c, this.d);
        }

        @NonNull
        public a c(@NonNull LatLng latLng) {
            this.a = (LatLng) gh8.k(latLng, "location must not be null.");
            return this;
        }

        @NonNull
        public a d(float f) {
            this.c = f;
            return this;
        }

        @NonNull
        public a e(float f) {
            this.b = f;
            return this;
        }
    }

    public CameraPosition(@NonNull LatLng latLng, float f, float f2, float f3) {
        boolean z;
        gh8.k(latLng, "camera target must not be null.");
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        } else {
            z = false;
        }
        gh8.c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @NonNull
    public static a h() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return m57.b(this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }

    @NonNull
    public String toString() {
        return m57.c(this).a("target", this.a).a(ViewAnimator.ZOOM, Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.s(parcel, 2, this.a, i, false);
        ys9.j(parcel, 3, this.b);
        ys9.j(parcel, 4, this.c);
        ys9.j(parcel, 5, this.d);
        ys9.b(parcel, a2);
    }
}
