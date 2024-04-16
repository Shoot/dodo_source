package defpackage;
/* compiled from: TileSystemWebMercator.java */
/* renamed from: dgb  reason: default package */
/* loaded from: classes3.dex */
public class dgb extends cgb {
    @Override // defpackage.cgb
    public double A() {
        return -180.0d;
    }

    @Override // defpackage.cgb
    public double F(double d) {
        return (d - A()) / (t() - A());
    }

    @Override // defpackage.cgb
    public double I(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }

    @Override // defpackage.cgb
    public double m(double d) {
        return 90.0d - ((Math.atan(Math.exp(((d - 0.5d) * 2.0d) * 3.141592653589793d)) * 360.0d) / 3.141592653589793d);
    }

    @Override // defpackage.cgb
    public double p(double d) {
        return A() + ((t() - A()) * d);
    }

    @Override // defpackage.cgb
    public double s() {
        return 85.05112877980658d;
    }

    @Override // defpackage.cgb
    public double t() {
        return 180.0d;
    }

    @Override // defpackage.cgb
    public double z() {
        return -85.05112877980658d;
    }
}
