package defpackage;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: StepCurve.java */
/* renamed from: gxa  reason: default package */
/* loaded from: classes.dex */
public class gxa extends yb3 {
    lo6 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gxa(String str) {
        this.a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.d = d(Arrays.copyOf(dArr, i + 1));
    }

    private static lo6 d(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        lo6 lo6Var = new lo6(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + lo6Var.c(0.0d, 0));
        printStream.println(" 1 " + lo6Var.c(1.0d, 0));
        return lo6Var;
    }

    @Override // defpackage.yb3
    public double a(double d) {
        return this.d.c(d, 0);
    }

    @Override // defpackage.yb3
    public double b(double d) {
        return this.d.k(d, 0);
    }
}
