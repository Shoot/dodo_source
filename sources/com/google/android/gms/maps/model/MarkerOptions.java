package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ns4;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: classes2.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new a();
    private LatLng a;
    private String b;
    private String c;
    private sb0 d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;

    public MarkerOptions() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
    }

    public String A() {
        return this.b;
    }

    public float B() {
        return this.n;
    }

    @NonNull
    public MarkerOptions C(sb0 sb0Var) {
        this.d = sb0Var;
        return this;
    }

    public boolean D() {
        return this.g;
    }

    public boolean E() {
        return this.i;
    }

    public boolean F() {
        return this.h;
    }

    @NonNull
    public MarkerOptions G(@NonNull LatLng latLng) {
        if (latLng != null) {
            this.a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @NonNull
    public MarkerOptions I(String str) {
        this.c = str;
        return this;
    }

    @NonNull
    public MarkerOptions J(String str) {
        this.b = str;
        return this;
    }

    @NonNull
    public MarkerOptions h(float f, float f2) {
        this.e = f;
        this.f = f2;
        return this;
    }

    public float k() {
        return this.m;
    }

    public float p() {
        return this.e;
    }

    public float t() {
        return this.f;
    }

    public float u() {
        return this.k;
    }

    public float v() {
        return this.l;
    }

    @NonNull
    public LatLng w() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder asBinder;
        int a = ys9.a(parcel);
        ys9.s(parcel, 2, w(), i, false);
        ys9.t(parcel, 3, A(), false);
        ys9.t(parcel, 4, z(), false);
        sb0 sb0Var = this.d;
        if (sb0Var == null) {
            asBinder = null;
        } else {
            asBinder = sb0Var.a().asBinder();
        }
        ys9.l(parcel, 5, asBinder, false);
        ys9.j(parcel, 6, p());
        ys9.j(parcel, 7, t());
        ys9.c(parcel, 8, D());
        ys9.c(parcel, 9, F());
        ys9.c(parcel, 10, E());
        ys9.j(parcel, 11, x());
        ys9.j(parcel, 12, u());
        ys9.j(parcel, 13, v());
        ys9.j(parcel, 14, k());
        ys9.j(parcel, 15, B());
        ys9.b(parcel, a);
    }

    public float x() {
        return this.j;
    }

    public String z() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.d = null;
        } else {
            this.d = new sb0(ns4.a.C(iBinder));
        }
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }
}
