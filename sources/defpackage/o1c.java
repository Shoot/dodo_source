package defpackage;

import androidx.annotation.NonNull;
/* compiled from: ViewingConditions.java */
/* renamed from: o1c  reason: default package */
/* loaded from: classes.dex */
final class o1c {
    static final o1c k = k(rm0.c, (float) ((rm0.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float[] g;
    private final float h;
    private final float i;
    private final float j;

    private o1c(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }

    @NonNull
    static o1c k(@NonNull float[] fArr, float f, float f2, float f3, boolean z) {
        float d;
        float exp;
        float[][] fArr2 = rm0.a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = (fArr3[0] * f4) + (fArr3[1] * f5) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f4) + (fArr4[1] * f5) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f4 * fArr5[0]) + (f5 * fArr5[1]) + (f6 * fArr5[2]);
        float f10 = (f3 / 10.0f) + 0.8f;
        if (f10 >= 0.9d) {
            d = rm0.d(0.59f, 0.69f, (f10 - 0.9f) * 10.0f);
        } else {
            d = rm0.d(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        }
        float f11 = d;
        if (z) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f10;
        }
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f) + (0.1f * f14 * f14 * ((float) Math.cbrt(f * 5.0d)));
        float h = rm0.h(f2) / fArr[1];
        double d3 = h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        return new o1c(h, ((((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f11, f10, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public float[] i() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.j;
    }
}
