package defpackage;

import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CamColor.java */
/* renamed from: qm0  reason: default package */
/* loaded from: classes.dex */
public class qm0 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    qm0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    private static qm0 b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        qm0 qm0Var = null;
        float f6 = 1000.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f4) > 0.01f) {
            float f8 = ((f4 - f7) / 2.0f) + f7;
            int p = e(f8, f2, f).p();
            float b = rm0.b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                qm0 c = c(p);
                float a = c.a(e(c.k(), c.i(), f));
                if (a <= 1.0f) {
                    qm0Var = c;
                    f5 = abs;
                    f6 = a;
                }
            }
            if (f5 == 0.0f && f6 == 0.0f) {
                break;
            } else if (b < f3) {
                f7 = f8;
            } else {
                f4 = f8;
            }
        }
        return qm0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static qm0 c(int i) {
        return d(i, o1c.k);
    }

    @NonNull
    static qm0 d(int i, @NonNull o1c o1cVar) {
        float f;
        float pow;
        float[] f2 = rm0.f(i);
        float[][] fArr = rm0.a;
        float f3 = f2[0];
        float[] fArr2 = fArr[0];
        float f4 = f2[1];
        float f5 = f2[2];
        float f6 = (fArr2[0] * f3) + (fArr2[1] * f4) + (fArr2[2] * f5);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[0] * f3) + (fArr3[1] * f4) + (fArr3[2] * f5);
        float[] fArr4 = fArr[2];
        float f8 = (f3 * fArr4[0]) + (f4 * fArr4[1]) + (f5 * fArr4[2]);
        float f9 = o1cVar.i()[0] * f6;
        float f10 = o1cVar.i()[1] * f7;
        float f11 = o1cVar.i()[2] * f8;
        float pow2 = (float) Math.pow((o1cVar.c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((o1cVar.c() * Math.abs(f10)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((o1cVar.c() * Math.abs(f11)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f12 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float pow5 = ((float) Math.pow((f16 * o1cVar.f()) / o1cVar.a(), o1cVar.b() * o1cVar.j())) * 100.0f;
        float d2 = o1cVar.d() * (4.0f / o1cVar.b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (o1cVar.a() + 4.0f);
        if (f17 < 20.14d) {
            f = 360.0f + f17;
        } else {
            f = f17;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, o1cVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * o1cVar.g()) * o1cVar.h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float d3 = pow6 * o1cVar.d();
        float sqrt = ((float) Math.sqrt((pow * o1cVar.b()) / (o1cVar.a() + 4.0f))) * 50.0f;
        float f19 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d3) + 1.0f)) * 43.85965f;
        double d4 = f18;
        return new qm0(f17, pow6, pow5, d2, d3, sqrt, f19, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    @NonNull
    private static qm0 e(float f, float f2, float f3) {
        return f(f, f2, f3, o1c.k);
    }

    @NonNull
    private static qm0 f(float f, float f2, float f3, o1c o1cVar) {
        double d;
        float b = (4.0f / o1cVar.b()) * ((float) Math.sqrt(f / 100.0d)) * (o1cVar.a() + 4.0f) * o1cVar.d();
        float d2 = f2 * o1cVar.d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * o1cVar.b()) / (o1cVar.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f3) / 180.0f;
        return new qm0(f3, f2, f, b, d2, sqrt, f4, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(float f, float f2, float f3) {
        return n(f, f2, f3, o1c.k);
    }

    static int n(float f, float f2, float f3, @NonNull o1c o1cVar) {
        float min;
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            if (f < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f);
            }
            float f4 = f2;
            qm0 qm0Var = null;
            float f5 = 0.0f;
            boolean z = true;
            while (Math.abs(f5 - f2) >= 0.4f) {
                qm0 b = b(min, f4, f3);
                if (z) {
                    if (b != null) {
                        return b.o(o1cVar);
                    }
                    f4 = ((f2 - f5) / 2.0f) + f5;
                    z = false;
                } else {
                    if (b == null) {
                        f2 = f4;
                    } else {
                        f5 = f4;
                        qm0Var = b;
                    }
                    f4 = ((f2 - f5) / 2.0f) + f5;
                }
            }
            if (qm0Var == null) {
                return rm0.a(f3);
            }
            return qm0Var.o(o1cVar);
        }
        return rm0.a(f3);
    }

    float a(@NonNull qm0 qm0Var) {
        float l = l() - qm0Var.l();
        float g = g() - qm0Var.g();
        float h = h() - qm0Var.h();
        return (float) (Math.pow(Math.sqrt((l * l) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    float g() {
        return this.h;
    }

    float h() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.a;
    }

    float k() {
        return this.c;
    }

    float l() {
        return this.g;
    }

    int o(@NonNull o1c o1cVar) {
        float f;
        float f2;
        if (i() != 0.0d && k() != 0.0d) {
            f = i() / ((float) Math.sqrt(k() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, o1cVar.e()), 0.73d), 1.1111111111111112d);
        double j = (j() * 3.1415927f) / 180.0f;
        float a = o1cVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / o1cVar.b()) / o1cVar.j()));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * o1cVar.g() * o1cVar.h();
        float f3 = a / o1cVar.f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f4 = (((0.305f + f3) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f5 = cos2 * f4;
        float f6 = f4 * sin;
        float f7 = f3 * 460.0f;
        float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
        float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
        float signum = Math.signum(f8) * (100.0f / o1cVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum2 = Math.signum(f9) * (100.0f / o1cVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
        float signum3 = Math.signum(((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f) * (100.0f / o1cVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f10 = signum / o1cVar.i()[0];
        float f11 = signum2 / o1cVar.i()[1];
        float f12 = signum3 / o1cVar.i()[2];
        float[][] fArr = rm0.b;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return qf1.d(f13, (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12), (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }

    int p() {
        return o(o1c.k);
    }
}
