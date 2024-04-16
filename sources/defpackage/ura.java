package defpackage;

import com.google.android.gms.maps.model.LatLng;
/* compiled from: SphericalMercatorProjection.java */
/* renamed from: ura  reason: default package */
/* loaded from: classes.dex */
public class ura {
    final double a;

    public ura(double d) {
        this.a = d;
    }

    public LatLng a(dd8 dd8Var) {
        double d = dd8Var.a;
        double d2 = this.a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (dd8Var.b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    public cd8 b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.a));
        double d = this.a;
        return new cd8(((latLng.b / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * d);
    }
}
