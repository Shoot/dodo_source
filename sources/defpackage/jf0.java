package defpackage;
/* compiled from: Bounds.java */
/* renamed from: jf0  reason: default package */
/* loaded from: classes.dex */
public class jf0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public jf0(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d3;
        this.c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public boolean a(double d, double d2) {
        if (this.a <= d && d <= this.c && this.b <= d2 && d2 <= this.d) {
            return true;
        }
        return false;
    }

    public boolean b(jf0 jf0Var) {
        if (jf0Var.a >= this.a && jf0Var.c <= this.c && jf0Var.b >= this.b && jf0Var.d <= this.d) {
            return true;
        }
        return false;
    }

    public boolean c(dd8 dd8Var) {
        return a(dd8Var.a, dd8Var.b);
    }

    public boolean d(double d, double d2, double d3, double d4) {
        if (d < this.c && this.a < d2 && d3 < this.d && this.b < d4) {
            return true;
        }
        return false;
    }

    public boolean e(jf0 jf0Var) {
        return d(jf0Var.a, jf0Var.c, jf0Var.b, jf0Var.d);
    }
}
