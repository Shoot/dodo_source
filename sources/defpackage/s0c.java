package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewTimeCycle.java */
/* renamed from: s0c  reason: default package */
/* loaded from: classes.dex */
public abstract class s0c extends igb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$a */
    /* loaded from: classes.dex */
    public static class a extends s0c {
        a() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setAlpha(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$b */
    /* loaded from: classes.dex */
    public static class b extends s0c {
        String l;
        SparseArray<androidx.constraintlayout.widget.a> m;
        SparseArray<float[]> n = new SparseArray<>();
        float[] o;
        float[] p;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.l = str.split(",")[1];
            this.m = sparseArray;
        }

        @Override // defpackage.igb
        public void b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // defpackage.igb
        public void e(int i) {
            int size = this.m.size();
            int h = this.m.valueAt(0).h();
            double[] dArr = new double[size];
            int i2 = h + 2;
            this.o = new float[i2];
            this.p = new float[h];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.m.keyAt(i3);
                float[] valueAt = this.n.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                this.m.valueAt(i3).f(this.o);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.o;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[h] = valueAt[0];
                dArr3[h + 1] = valueAt[1];
            }
            this.a = s32.a(i, dArr, dArr2);
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            boolean z;
            this.a.e(f, this.o);
            float[] fArr = this.o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float a = ue5Var.a(view, this.l, 0);
                this.j = a;
                if (Float.isNaN(a)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((this.j + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.j = f4;
            this.i = j;
            float a2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.p;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.h;
                float f5 = this.o[i];
                if (f5 != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            this.m.valueAt(0).k(view, this.p);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }

        public void j(int i, androidx.constraintlayout.widget.a aVar, float f, int i2, float f2) {
            this.m.append(i, aVar);
            this.n.append(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$c */
    /* loaded from: classes.dex */
    public static class c extends s0c {
        c() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setElevation(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$d */
    /* loaded from: classes.dex */
    public static class d extends s0c {
        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            return this.h;
        }

        public boolean j(View view, ue5 ue5Var, float f, long j, double d, double d2) {
            view.setRotation(f(f, j, view, ue5Var) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$e */
    /* loaded from: classes.dex */
    public static class e extends s0c {
        boolean l = false;

        e() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(f(f, j, view, ue5Var));
            } else if (this.l) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.l = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(f(f, j, view, ue5Var)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$f */
    /* loaded from: classes.dex */
    public static class f extends s0c {
        f() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setRotation(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$g */
    /* loaded from: classes.dex */
    public static class g extends s0c {
        g() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setRotationX(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$h */
    /* loaded from: classes.dex */
    public static class h extends s0c {
        h() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setRotationY(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$i */
    /* loaded from: classes.dex */
    public static class i extends s0c {
        i() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setScaleX(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$j */
    /* loaded from: classes.dex */
    public static class j extends s0c {
        j() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setScaleY(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$k */
    /* loaded from: classes.dex */
    public static class k extends s0c {
        k() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setTranslationX(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$l */
    /* loaded from: classes.dex */
    public static class l extends s0c {
        l() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setTranslationY(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTimeCycle.java */
    /* renamed from: s0c$m */
    /* loaded from: classes.dex */
    public static class m extends s0c {
        m() {
        }

        @Override // defpackage.s0c
        public boolean i(View view, float f, long j, ue5 ue5Var) {
            view.setTranslationZ(f(f, j, view, ue5Var));
            return this.h;
        }
    }

    public static s0c g(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static s0c h(String str, long j2) {
        s0c gVar;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                gVar = new g();
                break;
            case 1:
                gVar = new h();
                break;
            case 2:
                gVar = new k();
                break;
            case 3:
                gVar = new l();
                break;
            case 4:
                gVar = new m();
                break;
            case 5:
                gVar = new e();
                break;
            case 6:
                gVar = new i();
                break;
            case 7:
                gVar = new j();
                break;
            case '\b':
                gVar = new f();
                break;
            case '\t':
                gVar = new c();
                break;
            case '\n':
                gVar = new d();
                break;
            case 11:
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.c(j2);
        return gVar;
    }

    public float f(float f2, long j2, View view, ue5 ue5Var) {
        boolean z;
        this.a.e(f2, this.g);
        float[] fArr = this.g;
        float f3 = fArr[1];
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a2 = ue5Var.a(view, this.f, 0);
            this.j = a2;
            if (Float.isNaN(a2)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((this.j + (((j2 - this.i) * 1.0E-9d) * f3)) % 1.0d);
        this.j = f4;
        ue5Var.b(view, this.f, 0, f4);
        this.i = j2;
        float f5 = this.g[0];
        float a3 = (a(this.j) * f5) + this.g[2];
        if (f5 == 0.0f && i2 == 0) {
            z = false;
        } else {
            z = true;
        }
        this.h = z;
        return a3;
    }

    public abstract boolean i(View view, float f2, long j2, ue5 ue5Var);
}
