package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();
    private static final Integer t = Integer.valueOf(Color.argb(255, 236, 233, 225));
    private Boolean a;
    private Boolean b;
    private int c;
    private CameraPosition d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n;
    private Float o;
    private LatLngBounds p;
    private Boolean q;
    private Integer r;
    private String s;

    public GoogleMapOptions() {
        this.c = -1;
        this.n = null;
        this.o = null;
        this.p = null;
        this.r = null;
        this.s = null;
    }

    public static CameraPosition c0(Context context, AttributeSet attributeSet) {
        float f;
        float f2;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a29.a);
            int i = a29.g;
            if (obtainAttributes.hasValue(i)) {
                f = obtainAttributes.getFloat(i, 0.0f);
            } else {
                f = 0.0f;
            }
            int i2 = a29.h;
            if (obtainAttributes.hasValue(i2)) {
                f2 = obtainAttributes.getFloat(i2, 0.0f);
            } else {
                f2 = 0.0f;
            }
            LatLng latLng = new LatLng(f, f2);
            CameraPosition.a h = CameraPosition.h();
            h.c(latLng);
            int i3 = a29.j;
            if (obtainAttributes.hasValue(i3)) {
                h.e(obtainAttributes.getFloat(i3, 0.0f));
            }
            int i4 = a29.d;
            if (obtainAttributes.hasValue(i4)) {
                h.a(obtainAttributes.getFloat(i4, 0.0f));
            }
            int i5 = a29.i;
            if (obtainAttributes.hasValue(i5)) {
                h.d(obtainAttributes.getFloat(i5, 0.0f));
            }
            obtainAttributes.recycle();
            return h.b();
        }
        return null;
    }

    public static LatLngBounds d0(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a29.a);
        int i = a29.m;
        if (obtainAttributes.hasValue(i)) {
            f = Float.valueOf(obtainAttributes.getFloat(i, 0.0f));
        } else {
            f = null;
        }
        int i2 = a29.n;
        if (obtainAttributes.hasValue(i2)) {
            f2 = Float.valueOf(obtainAttributes.getFloat(i2, 0.0f));
        } else {
            f2 = null;
        }
        int i3 = a29.k;
        if (obtainAttributes.hasValue(i3)) {
            f3 = Float.valueOf(obtainAttributes.getFloat(i3, 0.0f));
        } else {
            f3 = null;
        }
        int i4 = a29.l;
        if (obtainAttributes.hasValue(i4)) {
            f4 = Float.valueOf(obtainAttributes.getFloat(i4, 0.0f));
        } else {
            f4 = null;
        }
        obtainAttributes.recycle();
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(f.floatValue(), f2.floatValue()), new LatLng(f3.floatValue(), f4.floatValue()));
    }

    public static GoogleMapOptions u(Context context, AttributeSet attributeSet) {
        String string;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a29.a);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            int i = a29.q;
            if (obtainAttributes.hasValue(i)) {
                googleMapOptions.I(obtainAttributes.getInt(i, -1));
            }
            int i2 = a29.A;
            if (obtainAttributes.hasValue(i2)) {
                googleMapOptions.Y(obtainAttributes.getBoolean(i2, false));
            }
            int i3 = a29.z;
            if (obtainAttributes.hasValue(i3)) {
                googleMapOptions.X(obtainAttributes.getBoolean(i3, false));
            }
            int i4 = a29.r;
            if (obtainAttributes.hasValue(i4)) {
                googleMapOptions.t(obtainAttributes.getBoolean(i4, true));
            }
            int i5 = a29.t;
            if (obtainAttributes.hasValue(i5)) {
                googleMapOptions.R(obtainAttributes.getBoolean(i5, true));
            }
            int i6 = a29.v;
            if (obtainAttributes.hasValue(i6)) {
                googleMapOptions.V(obtainAttributes.getBoolean(i6, true));
            }
            int i7 = a29.u;
            if (obtainAttributes.hasValue(i7)) {
                googleMapOptions.U(obtainAttributes.getBoolean(i7, true));
            }
            int i8 = a29.w;
            if (obtainAttributes.hasValue(i8)) {
                googleMapOptions.W(obtainAttributes.getBoolean(i8, true));
            }
            int i9 = a29.y;
            if (obtainAttributes.hasValue(i9)) {
                googleMapOptions.a0(obtainAttributes.getBoolean(i9, true));
            }
            int i10 = a29.x;
            if (obtainAttributes.hasValue(i10)) {
                googleMapOptions.Z(obtainAttributes.getBoolean(i10, true));
            }
            int i11 = a29.o;
            if (obtainAttributes.hasValue(i11)) {
                googleMapOptions.E(obtainAttributes.getBoolean(i11, false));
            }
            int i12 = a29.s;
            if (obtainAttributes.hasValue(i12)) {
                googleMapOptions.G(obtainAttributes.getBoolean(i12, true));
            }
            int i13 = a29.b;
            if (obtainAttributes.hasValue(i13)) {
                googleMapOptions.h(obtainAttributes.getBoolean(i13, false));
            }
            int i14 = a29.f;
            if (obtainAttributes.hasValue(i14)) {
                googleMapOptions.O(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
            }
            if (obtainAttributes.hasValue(i14)) {
                googleMapOptions.J(obtainAttributes.getFloat(a29.e, Float.POSITIVE_INFINITY));
            }
            int i15 = a29.c;
            if (obtainAttributes.hasValue(i15)) {
                googleMapOptions.k(Integer.valueOf(obtainAttributes.getColor(i15, t.intValue())));
            }
            int i16 = a29.p;
            if (obtainAttributes.hasValue(i16) && (string = obtainAttributes.getString(i16)) != null && !string.isEmpty()) {
                googleMapOptions.F(string);
            }
            googleMapOptions.D(d0(context, attributeSet));
            googleMapOptions.p(c0(context, attributeSet));
            obtainAttributes.recycle();
            return googleMapOptions;
        }
        return null;
    }

    public int A() {
        return this.c;
    }

    public Float B() {
        return this.o;
    }

    public Float C() {
        return this.n;
    }

    @NonNull
    public GoogleMapOptions D(LatLngBounds latLngBounds) {
        this.p = latLngBounds;
        return this;
    }

    @NonNull
    public GoogleMapOptions E(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions F(@NonNull String str) {
        this.s = str;
        return this;
    }

    @NonNull
    public GoogleMapOptions G(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions I(int i) {
        this.c = i;
        return this;
    }

    @NonNull
    public GoogleMapOptions J(float f) {
        this.o = Float.valueOf(f);
        return this;
    }

    @NonNull
    public GoogleMapOptions O(float f) {
        this.n = Float.valueOf(f);
        return this;
    }

    @NonNull
    public GoogleMapOptions R(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions U(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions V(boolean z) {
        this.q = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions W(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions X(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions Y(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions Z(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions a0(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions h(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions k(Integer num) {
        this.r = num;
        return this;
    }

    @NonNull
    public GoogleMapOptions p(CameraPosition cameraPosition) {
        this.d = cameraPosition;
        return this;
    }

    @NonNull
    public GoogleMapOptions t(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public String toString() {
        return m57.c(this).a("MapType", Integer.valueOf(this.c)).a("LiteMode", this.k).a("Camera", this.d).a("CompassEnabled", this.f).a("ZoomControlsEnabled", this.e).a("ScrollGesturesEnabled", this.g).a("ZoomGesturesEnabled", this.h).a("TiltGesturesEnabled", this.i).a("RotateGesturesEnabled", this.j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.q).a("MapToolbarEnabled", this.l).a("AmbientEnabled", this.m).a("MinZoomPreference", this.n).a("MaxZoomPreference", this.o).a("BackgroundColor", this.r).a("LatLngBoundsForCameraTarget", this.p).a("ZOrderOnTop", this.a).a("UseViewLifecycleInFragment", this.b).toString();
    }

    public Integer v() {
        return this.r;
    }

    public CameraPosition w() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.f(parcel, 2, vlc.a(this.a));
        ys9.f(parcel, 3, vlc.a(this.b));
        ys9.m(parcel, 4, A());
        ys9.s(parcel, 5, w(), i, false);
        ys9.f(parcel, 6, vlc.a(this.e));
        ys9.f(parcel, 7, vlc.a(this.f));
        ys9.f(parcel, 8, vlc.a(this.g));
        ys9.f(parcel, 9, vlc.a(this.h));
        ys9.f(parcel, 10, vlc.a(this.i));
        ys9.f(parcel, 11, vlc.a(this.j));
        ys9.f(parcel, 12, vlc.a(this.k));
        ys9.f(parcel, 14, vlc.a(this.l));
        ys9.f(parcel, 15, vlc.a(this.m));
        ys9.k(parcel, 16, C(), false);
        ys9.k(parcel, 17, B(), false);
        ys9.s(parcel, 18, x(), i, false);
        ys9.f(parcel, 19, vlc.a(this.q));
        ys9.p(parcel, 20, v(), false);
        ys9.t(parcel, 21, z(), false);
        ys9.b(parcel, a);
    }

    public LatLngBounds x() {
        return this.p;
    }

    public String z() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.c = -1;
        this.n = null;
        this.o = null;
        this.p = null;
        this.r = null;
        this.s = null;
        this.a = vlc.b(b);
        this.b = vlc.b(b2);
        this.c = i;
        this.d = cameraPosition;
        this.e = vlc.b(b3);
        this.f = vlc.b(b4);
        this.g = vlc.b(b5);
        this.h = vlc.b(b6);
        this.i = vlc.b(b7);
        this.j = vlc.b(b8);
        this.k = vlc.b(b9);
        this.l = vlc.b(b10);
        this.m = vlc.b(b11);
        this.n = f;
        this.o = f2;
        this.p = latLngBounds;
        this.q = vlc.b(b12);
        this.r = num;
        this.s = str;
    }
}
