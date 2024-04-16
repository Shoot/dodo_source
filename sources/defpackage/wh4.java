package defpackage;

import android.graphics.Color;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: GradientColorParser.java */
/* renamed from: wh4  reason: default package */
/* loaded from: classes.dex */
public class wh4 implements jwb<th4> {
    private int a;

    public wh4(int i) {
        this.a = i;
    }

    private th4 b(th4 th4Var, List<Float> list) {
        int i = this.a * 4;
        if (list.size() <= i) {
            return th4Var;
        }
        float[] b = th4Var.b();
        int[] a = th4Var.a();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] e = e(th4Var.b(), fArr);
        int length = e.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = e[i3];
            int binarySearch = Arrays.binarySearch(b, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i3] = d(f, a[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = c(f, fArr2[binarySearch2], b, a);
            }
        }
        return new th4(e, iArr);
    }

    private int c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f3 = fArr[i];
                if (f3 >= f || i == fArr.length - 1) {
                    int i2 = i - 1;
                    float f4 = fArr[i2];
                    float f5 = (f - f4) / (f3 - f4);
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    return Color.argb((int) (f2 * 255.0f), ql6.j(Color.red(i4), Color.red(i3), f5), ql6.j(Color.green(i4), Color.green(i3), f5), ql6.j(Color.blue(i4), Color.blue(i3), f5));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int d(float f, int i, float[] fArr, float[] fArr2) {
        float i2;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i3 = 1; i3 < fArr.length; i3++) {
                float f2 = fArr[i3];
                int i4 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
                if (i4 >= 0 || i3 == fArr.length - 1) {
                    if (i4 <= 0) {
                        i2 = fArr2[i3];
                    } else {
                        int i5 = i3 - 1;
                        float f3 = fArr[i5];
                        i2 = ql6.i(fArr2[i5], fArr2[i3], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (i2 * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        float f;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = Float.NaN;
            if (i2 < fArr.length) {
                f = fArr[i2];
            } else {
                f = Float.NaN;
            }
            if (i3 < fArr2.length) {
                f2 = fArr2[i3];
            }
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        if (i == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i);
    }

    @Override // defpackage.jwb
    /* renamed from: f */
    public th4 a(xb5 xb5Var, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            xb5Var.b();
        }
        while (xb5Var.j()) {
            arrayList.add(Float.valueOf((float) xb5Var.l()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.a = 2;
        }
        if (z) {
            xb5Var.e();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i3 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i2 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            }
        }
        return b(new th4(fArr, iArr), arrayList);
    }
}
