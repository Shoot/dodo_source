package defpackage;

import java.util.Arrays;
/* compiled from: Oscillator.java */
/* renamed from: fm7  reason: default package */
/* loaded from: classes.dex */
public class fm7 {
    double[] c;
    String d;
    lo6 e;
    int f;
    float[] a = new float[0];
    double[] b = new double[0];
    double g = 6.283185307179586d;
    private boolean h = false;

    public void a(double d, float f) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d;
        this.a[binarySearch] = f;
        this.h = false;
    }

    double b(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = -binarySearch;
        int i2 = i - 1;
        float[] fArr = this.a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = (f - f2) / (d2 - d3);
        return this.c[i3] + ((f2 - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
    }

    public double c(double d, double d2) {
        double abs;
        double b = b(d) + d2;
        switch (this.f) {
            case 1:
                return Math.signum(0.5d - (b % 1.0d));
            case 2:
                abs = Math.abs((((b * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.g * (d2 + b));
            case 6:
                double abs2 = 1.0d - Math.abs(((b * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.e.c(b % 1.0d, 0);
            default:
                return Math.sin(this.g * b);
        }
        return 1.0d - abs;
    }

    public void d() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.a.length) {
                break;
            }
            double[] dArr = this.b;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.a;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = (float) (fArr4[i4] * (d / d2));
            i4++;
        }
        this.c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 < this.a.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.b;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.c;
                dArr3[i5] = dArr3[i6] + (d3 * ((fArr3[i6] + fArr3[i5]) / 2.0f));
                i5++;
            } else {
                this.h = true;
                return;
            }
        }
    }

    public void e(int i, String str) {
        this.f = i;
        this.d = str;
        if (str != null) {
            this.e = lo6.h(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}
