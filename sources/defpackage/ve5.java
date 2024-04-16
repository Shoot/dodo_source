package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: KeyCycleOscillator.java */
/* renamed from: ve5  reason: default package */
/* loaded from: classes.dex */
public abstract class ve5 {
    private s32 a;
    private b b;
    private String c;
    private int d = 0;
    private String e = null;
    public int f = 0;
    ArrayList<c> g = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    /* renamed from: ve5$a */
    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.a, cVar2.a);
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* renamed from: ve5$b */
    /* loaded from: classes.dex */
    static class b {
        private final int a;
        fm7 b;
        private final int c;
        private final int d;
        private final int e;
        float[] f;
        double[] g;
        float[] h;
        float[] i;
        float[] j;
        float[] k;
        int l;
        s32 m;
        double[] n;
        double[] o;
        float p;

        b(int i, String str, int i2, int i3) {
            fm7 fm7Var = new fm7();
            this.b = fm7Var;
            this.c = 0;
            this.d = 1;
            this.e = 2;
            this.l = i;
            this.a = i2;
            fm7Var.e(i, str);
            this.f = new float[i3];
            this.g = new double[i3];
            this.h = new float[i3];
            this.i = new float[i3];
            this.j = new float[i3];
            this.k = new float[i3];
        }

        public double a(float f) {
            s32 s32Var = this.m;
            if (s32Var != null) {
                s32Var.d(f, this.n);
            } else {
                double[] dArr = this.n;
                dArr[0] = this.i[0];
                dArr[1] = this.j[0];
                dArr[2] = this.f[0];
            }
            double[] dArr2 = this.n;
            return dArr2[0] + (this.b.c(f, dArr2[1]) * this.n[2]);
        }

        public void b(int i, int i2, float f, float f2, float f3, float f4) {
            this.g[i] = i2 / 100.0d;
            this.h[i] = f;
            this.i[i] = f2;
            this.j[i] = f3;
            this.f[i] = f4;
        }

        public void c(float f) {
            this.p = f;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.g.length, 3);
            float[] fArr = this.f;
            this.n = new double[fArr.length + 2];
            this.o = new double[fArr.length + 2];
            if (this.g[0] > 0.0d) {
                this.b.a(0.0d, this.h[0]);
            }
            double[] dArr2 = this.g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.b.a(1.0d, this.h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.i[i];
                dArr3[1] = this.j[i];
                dArr3[2] = this.f[i];
                this.b.a(this.g[i], this.h[i]);
            }
            this.b.d();
            double[] dArr4 = this.g;
            if (dArr4.length > 1) {
                this.m = s32.a(0, dArr4, dArr);
            } else {
                this.m = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeyCycleOscillator.java */
    /* renamed from: ve5$c */
    /* loaded from: classes.dex */
    public static class c {
        int a;
        float b;
        float c;
        float d;
        float e;

        public c(int i, float f, float f2, float f3, float f4) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public float a(float f) {
        return (float) this.b.a(f);
    }

    public void c(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.g.add(new c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        this.e = str;
    }

    public void d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.g.add(new c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        b(obj);
        this.e = str;
    }

    public void e(String str) {
        this.c = str;
    }

    public void f(float f) {
        int size = this.g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.b = new b(this.d, this.e, this.f, size);
        Iterator<c> it = this.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            c next = it.next();
            float f2 = next.d;
            dArr[i] = f2 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = next.b;
            dArr3[0] = f3;
            float f4 = next.c;
            dArr3[1] = f4;
            float f5 = next.e;
            dArr3[2] = f5;
            this.b.b(i, next.a, f2, f4, f5, f3);
            i++;
        }
        this.b.c(f);
        this.a = s32.a(0, dArr, dArr2);
    }

    public boolean g() {
        if (this.f == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<c> it = this.g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            str = str + "[" + next.a + " , " + decimalFormat.format(next.b) + "] ";
        }
        return str;
    }

    protected void b(Object obj) {
    }
}
