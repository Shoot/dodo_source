package defpackage;
/* compiled from: CurveFit.java */
/* renamed from: s32  reason: default package */
/* loaded from: classes.dex */
public abstract class s32 {

    /* compiled from: CurveFit.java */
    /* renamed from: s32$a */
    /* loaded from: classes.dex */
    static class a extends s32 {
        double a;
        double[] b;

        a(double d, double[] dArr) {
            this.a = d;
            this.b = dArr;
        }

        @Override // defpackage.s32
        public double c(double d, int i) {
            return this.b[i];
        }

        @Override // defpackage.s32
        public void d(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // defpackage.s32
        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // defpackage.s32
        public void f(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // defpackage.s32
        public double[] g() {
            return new double[]{this.a};
        }
    }

    public static s32 a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i != 2) {
                return new cq5(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new lo6(dArr, dArr2);
    }

    public static s32 b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new rq(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract void f(double d, double[] dArr);

    public abstract double[] g();
}
