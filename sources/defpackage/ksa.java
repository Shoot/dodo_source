package defpackage;

import defpackage.o93;
/* compiled from: SpringForce.java */
/* renamed from: ksa  reason: default package */
/* loaded from: classes.dex */
public final class ksa {
    double a;
    double b;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final o93.o j;

    public ksa() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new o93.o();
    }

    private void b() {
        if (this.c) {
            return;
        }
        if (this.i != Double.MAX_VALUE) {
            double d = this.b;
            if (d > 1.0d) {
                double d2 = this.a;
                this.f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.b;
                double d4 = this.a;
                this.g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.h = this.a * Math.sqrt(1.0d - (d * d));
            }
            this.c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public float a() {
        return (float) this.i;
    }

    public boolean c(float f, float f2) {
        if (Math.abs(f2) < this.e && Math.abs(f - a()) < this.d) {
            return true;
        }
        return false;
    }

    public ksa d(float f) {
        if (f >= 0.0f) {
            this.b = f;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public ksa e(float f) {
        this.i = f;
        return this;
    }

    public ksa f(float f) {
        if (f > 0.0f) {
            this.a = Math.sqrt(f);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(double d) {
        double abs = Math.abs(d);
        this.d = abs;
        this.e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o93.o h(double d, double d2, long j) {
        double cos;
        double d3;
        b();
        double d4 = j / 1000.0d;
        double d5 = d - this.i;
        double d6 = this.b;
        if (d6 > 1.0d) {
            double d7 = this.g;
            double d8 = this.f;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f * d4) * d10);
            double d11 = this.g;
            double pow = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f;
            cos = pow + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            d3 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow2 = d15 * Math.pow(2.718281828459045d, (-this.a) * d4);
            double d16 = this.a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (pow2 * (-d16));
        } else {
            double d17 = 1.0d / this.h;
            double d18 = this.a;
            double d19 = d17 * ((d6 * d18 * d5) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d6) * d18 * d4) * ((Math.cos(this.h * d4) * d5) + (Math.sin(this.h * d4) * d19));
            double d20 = this.a;
            double d21 = this.b;
            double d22 = (-d20) * pow3 * d21;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d23 = this.h;
            double sin = (-d23) * d5 * Math.sin(d23 * d4);
            double d24 = this.h;
            cos = d22 + (pow4 * (sin + (d19 * d24 * Math.cos(d24 * d4))));
            d3 = pow3;
        }
        o93.o oVar = this.j;
        oVar.a = (float) (d3 + this.i);
        oVar.b = (float) cos;
        return oVar;
    }

    public ksa(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new o93.o();
        this.i = f;
    }
}
