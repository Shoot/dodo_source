package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public class k implements Comparable<k> {
    static String[] t = {"position", "x", "y", "width", "height", "pathRotate"};
    yb3 a;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    int k;
    int l;
    float m;
    j n;
    LinkedHashMap<String, androidx.constraintlayout.widget.a> o;
    int p;
    int q;
    double[] r;
    double[] s;
    int b = 0;
    float i = Float.NaN;
    float j = Float.NaN;

    public k() {
        int i = a.f;
        this.k = i;
        this.l = i;
        this.m = Float.NaN;
        this.n = null;
        this.o = new LinkedHashMap<>();
        this.p = 0;
        this.r = new double[18];
        this.s = new double[18];
    }

    private boolean h(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) <= 1.0E-6f) {
                return false;
            }
            return true;
        } else if (Float.isNaN(f) == Float.isNaN(f2)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f6 = f7;
                        }
                    } else {
                        f4 = f7;
                    }
                } else {
                    f5 = f7;
                }
            } else {
                f3 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        float f4 = this.e;
        float f5 = this.f;
        float f6 = this.g;
        float f7 = this.h;
        if (iArr.length != 0 && this.r.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.r = new double[i];
            this.s = new double[i];
        }
        Arrays.fill(this.r, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.r;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.s[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.r;
            if (i4 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f3 = f8;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.r[i4])) {
                    d = this.r[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.s[i4];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    f8 = f13;
                                }
                            } else {
                                f8 = f3;
                                f12 = f14;
                                f7 = f13;
                            }
                        } else {
                            f8 = f3;
                            f11 = f14;
                            f6 = f13;
                        }
                    } else {
                        f8 = f3;
                        f10 = f14;
                        f5 = f13;
                    }
                } else {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                }
                i4++;
            }
            f8 = f3;
            i4++;
        }
        float f15 = f8;
        j jVar = this.n;
        if (jVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            jVar.i(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float sin = (float) ((f16 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            f2 = f7;
            float cos = (float) ((f17 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float sin2 = (float) (f18 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float cos2 = (float) ((f19 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (f15 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (0.0f + f15 + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        if (view instanceof iz3) {
            ((iz3) view).a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i5 = (int) f20;
        float f21 = f5 + 0.5f;
        int i6 = (int) f21;
        int i7 = (int) (f20 + f6);
        int i8 = (int) (f21 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public void D(j jVar, k kVar) {
        double d = ((this.e + (this.g / 2.0f)) - kVar.e) - (kVar.g / 2.0f);
        double d2 = ((this.f + (this.h / 2.0f)) - kVar.f) - (kVar.h / 2.0f);
        this.n = jVar;
        this.e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.m)) {
            this.f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f = (float) Math.toRadians(this.m);
        }
    }

    public void a(d.a aVar) {
        this.a = yb3.c(aVar.d.d);
        d.c cVar = aVar.d;
        this.k = cVar.e;
        this.l = cVar.b;
        this.i = cVar.i;
        this.b = cVar.f;
        this.q = cVar.c;
        this.j = aVar.c.e;
        this.m = aVar.e.C;
        for (String str : aVar.g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.g.get(str);
            if (aVar2 != null && aVar2.g()) {
                this.o.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(@NonNull k kVar) {
        return Float.compare(this.d, kVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(k kVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean h = h(this.e, kVar.e);
        boolean h2 = h(this.f, kVar.f);
        zArr[0] = zArr[0] | h(this.d, kVar.d);
        boolean z2 = h | h2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | h(this.g, kVar.g);
        zArr[4] = h(this.h, kVar.h) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(double[] dArr, int[] iArr) {
        float[] fArr = {this.d, this.e, this.f, this.g, this.h, this.i};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        j jVar = this.n;
        if (jVar != null) {
            float[] fArr2 = new float[2];
            jVar.i(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.e;
        float f3 = this.f;
        float f4 = this.g;
        float f5 = this.h;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f5 = f10;
                            f9 = f11;
                        }
                    } else {
                        f4 = f10;
                        f7 = f11;
                    }
                } else {
                    f3 = f10;
                    f8 = f11;
                }
            } else {
                f2 = f10;
                f6 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        j jVar = this.n;
        if (jVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            jVar.i(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            f = f4;
            double d4 = f6;
            double d5 = f8;
            float sin = (float) (f17 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((f18 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((f15 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            f3 = (float) ((f16 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q(String str, double[] dArr, int i) {
        androidx.constraintlayout.widget.a aVar = this.o.get(str);
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.h() == 1) {
            dArr[i] = aVar.e();
            return 1;
        }
        int h = aVar.h();
        float[] fArr = new float[h];
        aVar.f(fArr);
        while (i2 < h) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s(String str) {
        androidx.constraintlayout.widget.a aVar = this.o.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        j jVar = this.n;
        if (jVar != null) {
            float j = jVar.j();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.n.k() - (d * Math.cos(d2))) - (f4 / 2.0f));
            f = (float) ((j + (Math.sin(d2) * d)) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = f2 + 0.0f;
        fArr[i + 2] = f6 + 0.0f;
        fArr[i + 3] = f2 + 0.0f;
        fArr[i + 4] = f6 + 0.0f;
        fArr[i + 5] = f7 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f7 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(String str) {
        return this.o.containsKey(str);
    }

    void v(e eVar, k kVar, k kVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = eVar.a / 100.0f;
        this.c = f5;
        this.b = eVar.j;
        if (Float.isNaN(eVar.k)) {
            f = f5;
        } else {
            f = eVar.k;
        }
        if (Float.isNaN(eVar.l)) {
            f2 = f5;
        } else {
            f2 = eVar.l;
        }
        float f6 = kVar2.g;
        float f7 = kVar.g;
        float f8 = kVar2.h;
        float f9 = kVar.h;
        this.d = this.c;
        float f10 = kVar.e;
        float f11 = kVar.f;
        float f12 = kVar2.e + (f6 / 2.0f);
        float f13 = f12 - ((f7 / 2.0f) + f10);
        float f14 = (kVar2.f + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f15 = (f6 - f7) * f;
        float f16 = f15 / 2.0f;
        this.e = (int) ((f10 + (f13 * f5)) - f16);
        float f17 = (f8 - f9) * f2;
        float f18 = f17 / 2.0f;
        this.f = (int) ((f11 + (f14 * f5)) - f18);
        this.g = (int) (f7 + f15);
        this.h = (int) (f9 + f17);
        if (Float.isNaN(eVar.m)) {
            f3 = f5;
        } else {
            f3 = eVar.m;
        }
        float f19 = 0.0f;
        if (Float.isNaN(eVar.p)) {
            f4 = 0.0f;
        } else {
            f4 = eVar.p;
        }
        if (!Float.isNaN(eVar.n)) {
            f5 = eVar.n;
        }
        if (!Float.isNaN(eVar.o)) {
            f19 = eVar.o;
        }
        this.p = 0;
        this.e = (int) (((kVar.e + (f3 * f13)) + (f19 * f14)) - f16);
        this.f = (int) (((kVar.f + (f13 * f4)) + (f14 * f5)) - f18);
        this.a = yb3.c(eVar.h);
        this.k = eVar.i;
    }

    void w(e eVar, k kVar, k kVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = eVar.a / 100.0f;
        this.c = f6;
        this.b = eVar.j;
        if (Float.isNaN(eVar.k)) {
            f = f6;
        } else {
            f = eVar.k;
        }
        if (Float.isNaN(eVar.l)) {
            f2 = f6;
        } else {
            f2 = eVar.l;
        }
        float f7 = kVar2.g - kVar.g;
        float f8 = kVar2.h - kVar.h;
        this.d = this.c;
        if (!Float.isNaN(eVar.m)) {
            f6 = eVar.m;
        }
        float f9 = kVar.e;
        float f10 = kVar.g;
        float f11 = kVar.f;
        float f12 = kVar.h;
        float f13 = (kVar2.e + (kVar2.g / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (kVar2.f + (kVar2.h / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.e = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.f = (int) ((f11 + f17) - f18);
        this.g = (int) (f10 + f3);
        this.h = (int) (f12 + f4);
        if (Float.isNaN(eVar.n)) {
            f5 = 0.0f;
        } else {
            f5 = eVar.n;
        }
        this.p = 1;
        float f19 = (int) ((kVar.e + f15) - f16);
        float f20 = (int) ((kVar.f + f17) - f18);
        this.e = f19 + ((-f14) * f5);
        this.f = f20 + (f13 * f5);
        this.l = this.l;
        this.a = yb3.c(eVar.h);
        this.k = eVar.i;
    }

    void x(int i, int i2, e eVar, k kVar, k kVar2) {
        float f;
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6 = eVar.a / 100.0f;
        this.c = f6;
        this.b = eVar.j;
        this.p = eVar.q;
        if (Float.isNaN(eVar.k)) {
            f = f6;
        } else {
            f = eVar.k;
        }
        if (Float.isNaN(eVar.l)) {
            f2 = f6;
        } else {
            f2 = eVar.l;
        }
        float f7 = kVar2.g;
        float f8 = kVar.g;
        float f9 = kVar2.h;
        float f10 = kVar.h;
        this.d = this.c;
        this.g = (int) (f8 + ((f7 - f8) * f));
        this.h = (int) (f10 + ((f9 - f10) * f2));
        int i3 = eVar.q;
        if (i3 != 1) {
            if (i3 != 2) {
                if (Float.isNaN(eVar.m)) {
                    f5 = f6;
                } else {
                    f5 = eVar.m;
                }
                float f11 = kVar2.e;
                float f12 = kVar.e;
                this.e = (f5 * (f11 - f12)) + f12;
                if (!Float.isNaN(eVar.n)) {
                    f6 = eVar.n;
                }
                float f13 = kVar2.f;
                float f14 = kVar.f;
                this.f = (f6 * (f13 - f14)) + f14;
            } else {
                if (Float.isNaN(eVar.m)) {
                    float f15 = kVar2.e;
                    float f16 = kVar.e;
                    min = ((f15 - f16) * f6) + f16;
                } else {
                    min = Math.min(f2, f) * eVar.m;
                }
                this.e = min;
                if (Float.isNaN(eVar.n)) {
                    float f17 = kVar2.f;
                    float f18 = kVar.f;
                    f4 = (f6 * (f17 - f18)) + f18;
                } else {
                    f4 = eVar.n;
                }
                this.f = f4;
            }
        } else {
            if (Float.isNaN(eVar.m)) {
                f3 = f6;
            } else {
                f3 = eVar.m;
            }
            float f19 = kVar2.e;
            float f20 = kVar.e;
            this.e = (f3 * (f19 - f20)) + f20;
            if (!Float.isNaN(eVar.n)) {
                f6 = eVar.n;
            }
            float f21 = kVar2.f;
            float f22 = kVar.f;
            this.f = (f6 * (f21 - f22)) + f22;
        }
        this.l = kVar.l;
        this.a = yb3.c(eVar.h);
        this.k = eVar.i;
    }

    void z(int i, int i2, e eVar, k kVar, k kVar2) {
        float f;
        float f2;
        float f3 = eVar.a / 100.0f;
        this.c = f3;
        this.b = eVar.j;
        if (Float.isNaN(eVar.k)) {
            f = f3;
        } else {
            f = eVar.k;
        }
        if (Float.isNaN(eVar.l)) {
            f2 = f3;
        } else {
            f2 = eVar.l;
        }
        float f4 = kVar2.g;
        float f5 = kVar.g;
        float f6 = kVar2.h;
        float f7 = kVar.h;
        this.d = this.c;
        float f8 = kVar.e;
        float f9 = kVar.f;
        float f10 = kVar2.e + (f4 / 2.0f);
        float f11 = kVar2.f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.g = (int) (f5 + f12);
        this.h = (int) (f7 + f13);
        this.p = 2;
        if (!Float.isNaN(eVar.m)) {
            this.e = (int) (eVar.m * ((int) (i - this.g)));
        }
        if (!Float.isNaN(eVar.n)) {
            this.f = (int) (eVar.n * ((int) (i2 - this.h)));
        }
        this.l = this.l;
        this.a = yb3.c(eVar.h);
        this.k = eVar.i;
    }

    public k(int i, int i2, e eVar, k kVar, k kVar2) {
        int i3 = a.f;
        this.k = i3;
        this.l = i3;
        this.m = Float.NaN;
        this.n = null;
        this.o = new LinkedHashMap<>();
        this.p = 0;
        this.r = new double[18];
        this.s = new double[18];
        if (kVar.l != a.f) {
            x(i, i2, eVar, kVar, kVar2);
            return;
        }
        int i4 = eVar.q;
        if (i4 == 1) {
            w(eVar, kVar, kVar2);
        } else if (i4 != 2) {
            v(eVar, kVar, kVar2);
        } else {
            z(i, i2, eVar, kVar, kVar2);
        }
    }
}
