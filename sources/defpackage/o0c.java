package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewSpline.java */
/* renamed from: o0c  reason: default package */
/* loaded from: classes.dex */
public abstract class o0c extends gsa {

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$a */
    /* loaded from: classes.dex */
    static class a extends o0c {
        a() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$b */
    /* loaded from: classes.dex */
    public static class b extends o0c {
        String f;
        SparseArray<androidx.constraintlayout.widget.a> g;
        float[] h;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f = str.split(",")[1];
            this.g = sparseArray;
        }

        @Override // defpackage.gsa
        public void b(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // defpackage.gsa
        public void d(int i) {
            int size = this.g.size();
            int h = this.g.valueAt(0).h();
            double[] dArr = new double[size];
            this.h = new float[h];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, h);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.g.keyAt(i2) * 0.01d;
                this.g.valueAt(i2).f(this.h);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.h;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = s32.a(i, dArr, dArr2);
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            this.a.e(f, this.h);
            this.g.valueAt(0).k(view, this.h);
        }

        public void h(int i, androidx.constraintlayout.widget.a aVar) {
            this.g.append(i, aVar);
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$c */
    /* loaded from: classes.dex */
    static class c extends o0c {
        c() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$e */
    /* loaded from: classes.dex */
    static class e extends o0c {
        e() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$f */
    /* loaded from: classes.dex */
    static class f extends o0c {
        f() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$g */
    /* loaded from: classes.dex */
    static class g extends o0c {
        boolean f = false;

        g() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (this.f) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewSpline", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewSpline", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$h */
    /* loaded from: classes.dex */
    static class h extends o0c {
        h() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$i */
    /* loaded from: classes.dex */
    static class i extends o0c {
        i() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$j */
    /* loaded from: classes.dex */
    static class j extends o0c {
        j() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$k */
    /* loaded from: classes.dex */
    static class k extends o0c {
        k() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$l */
    /* loaded from: classes.dex */
    static class l extends o0c {
        l() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$m */
    /* loaded from: classes.dex */
    static class m extends o0c {
        m() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$n */
    /* loaded from: classes.dex */
    static class n extends o0c {
        n() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$o */
    /* loaded from: classes.dex */
    static class o extends o0c {
        o() {
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static o0c e(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static o0c f(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = 15;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void g(View view, float f2);

    /* compiled from: ViewSpline.java */
    /* renamed from: o0c$d */
    /* loaded from: classes.dex */
    public static class d extends o0c {
        public void h(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // defpackage.o0c
        public void g(View view, float f) {
        }
    }
}
