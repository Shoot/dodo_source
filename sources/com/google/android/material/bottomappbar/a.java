package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes2.dex */
public class a extends zc3 implements Cloneable {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;

    @Override // defpackage.zc3
    public void c(float f, float f2, float f3, @NonNull hha hhaVar) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.c;
        if (f6 == 0.0f) {
            hhaVar.m(f, 0.0f);
            return;
        }
        float f7 = ((this.b * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.a;
        float f9 = f2 + this.e;
        float f10 = (this.d * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            hhaVar.m(f, 0.0f);
            return;
        }
        float f11 = this.f;
        float f12 = f11 * f3;
        if (f11 != -1.0f && Math.abs((f11 * 2.0f) - f6) >= 0.1f) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        hhaVar.m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        hhaVar.a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            hhaVar.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.b;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            hhaVar.a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.b;
            hhaVar.m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.b;
            hhaVar.a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        hhaVar.a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        hhaVar.m(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.d;
    }

    public float e() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.a;
    }

    public float h() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(float f) {
        if (f >= 0.0f) {
            this.d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void j(float f) {
        this.f = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(float f) {
        this.b = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(float f) {
        this.a = f;
    }

    public void n(float f) {
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(float f) {
        this.e = f;
    }
}
