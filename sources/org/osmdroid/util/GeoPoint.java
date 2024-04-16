package org.osmdroid.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class GeoPoint implements vr4, Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<GeoPoint> CREATOR = new a();
    private double a;
    private double b;
    private double c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<GeoPoint> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GeoPoint createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GeoPoint[] newArray(int i) {
            return new GeoPoint[i];
        }
    }

    /* synthetic */ GeoPoint(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // defpackage.vr4
    public double b() {
        return this.b;
    }

    @Override // defpackage.vr4
    public double c() {
        return this.a;
    }

    /* renamed from: d */
    public GeoPoint clone() {
        return new GeoPoint(this.b, this.a, this.c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(double d, double d2) {
        this.b = d;
        this.a = d2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        if (geoPoint.b != this.b || geoPoint.a != this.a || geoPoint.c != this.c) {
            return false;
        }
        return true;
    }

    public void f(double d) {
        this.b = d;
    }

    public int hashCode() {
        return (((((int) (this.b * 1.0E-6d)) * 17) + ((int) (this.a * 1.0E-6d))) * 37) + ((int) this.c);
    }

    public void i(double d) {
        this.a = d;
    }

    public String toString() {
        return this.b + "," + this.a + "," + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.c);
    }

    @Deprecated
    public GeoPoint(int i, int i2) {
        this.b = i / 1000000.0d;
        this.a = i2 / 1000000.0d;
    }

    public GeoPoint(double d, double d2) {
        this.b = d;
        this.a = d2;
    }

    public GeoPoint(double d, double d2, double d3) {
        this.b = d;
        this.a = d2;
        this.c = d3;
    }

    public GeoPoint(GeoPoint geoPoint) {
        this.b = geoPoint.b;
        this.a = geoPoint.a;
        this.c = geoPoint.c;
    }

    private GeoPoint(Parcel parcel) {
        this.b = parcel.readDouble();
        this.a = parcel.readDouble();
        this.c = parcel.readDouble();
    }
}
