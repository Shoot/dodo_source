package org.osmdroid.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class BoundingBox implements Parcelable, Serializable {
    public static final Parcelable.Creator<BoundingBox> CREATOR = new a();
    private double a;
    private double b;
    private double c;
    private double d;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<BoundingBox> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BoundingBox createFromParcel(Parcel parcel) {
            return BoundingBox.r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BoundingBox[] newArray(int i) {
            return new BoundingBox[i];
        }
    }

    public BoundingBox(double d, double d2, double d3, double d4) {
        s(d, d2, d3, d4);
    }

    public static double i(double d, double d2) {
        double d3 = (d2 + d) / 2.0d;
        if (d2 < d) {
            d3 += 180.0d;
        }
        return MapView.getTileSystem().g(d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BoundingBox r(Parcel parcel) {
        return new BoundingBox(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    /* renamed from: b */
    public BoundingBox clone() {
        return new BoundingBox(this.a, this.c, this.b, this.d);
    }

    public double c() {
        return Math.max(this.a, this.b);
    }

    public double d() {
        return Math.min(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double e() {
        return (this.a + this.b) / 2.0d;
    }

    public double f() {
        return i(this.d, this.c);
    }

    public GeoPoint j() {
        return new GeoPoint(e(), f());
    }

    public double k() {
        return this.a;
    }

    public double l() {
        return this.b;
    }

    public double m() {
        return Math.abs(this.a - this.b);
    }

    public double n() {
        return this.c;
    }

    public double o() {
        return this.d;
    }

    @Deprecated
    public double q() {
        return Math.abs(this.c - this.d);
    }

    public void s(double d, double d2, double d3, double d4) {
        this.a = d;
        this.c = d2;
        this.b = d3;
        this.d = d4;
        cgb tileSystem = MapView.getTileSystem();
        if (tileSystem.K(d)) {
            if (tileSystem.K(d3)) {
                if (tileSystem.L(d4)) {
                    if (tileSystem.L(d2)) {
                        return;
                    }
                    throw new IllegalArgumentException("east must be in " + tileSystem.O());
                }
                throw new IllegalArgumentException("west must be in " + tileSystem.O());
            }
            throw new IllegalArgumentException("south must be in " + tileSystem.N());
        }
        throw new IllegalArgumentException("north must be in " + tileSystem.N());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("N:");
        stringBuffer.append(this.a);
        stringBuffer.append("; E:");
        stringBuffer.append(this.c);
        stringBuffer.append("; S:");
        stringBuffer.append(this.b);
        stringBuffer.append("; W:");
        stringBuffer.append(this.d);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.d);
    }

    public BoundingBox() {
    }
}
