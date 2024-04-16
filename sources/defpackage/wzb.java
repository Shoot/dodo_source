package defpackage;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewOscillator.java */
/* renamed from: wzb  reason: default package */
/* loaded from: classes.dex */
public abstract class wzb extends ve5 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$a */
    /* loaded from: classes.dex */
    public static class a extends wzb {
        a() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$b */
    /* loaded from: classes.dex */
    public static class b extends wzb {
        float[] h = new float[1];
        protected androidx.constraintlayout.widget.a i;

        b() {
        }

        @Override // defpackage.ve5
        protected void b(Object obj) {
            this.i = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            this.h[0] = a(f);
            this.i.k(view, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$c */
    /* loaded from: classes.dex */
    public static class c extends wzb {
        c() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setElevation(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$e */
    /* loaded from: classes.dex */
    public static class e extends wzb {
        boolean h = false;

        e() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (this.h) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.h = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$f */
    /* loaded from: classes.dex */
    public static class f extends wzb {
        f() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$g */
    /* loaded from: classes.dex */
    public static class g extends wzb {
        g() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$h */
    /* loaded from: classes.dex */
    public static class h extends wzb {
        h() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$i */
    /* loaded from: classes.dex */
    public static class i extends wzb {
        i() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$j */
    /* loaded from: classes.dex */
    public static class j extends wzb {
        j() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$k */
    /* loaded from: classes.dex */
    public static class k extends wzb {
        k() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$l */
    /* loaded from: classes.dex */
    public static class l extends wzb {
        l() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$m */
    /* loaded from: classes.dex */
    public static class m extends wzb {
        m() {
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static wzb h(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void i(View view, float f2);

    /* compiled from: ViewOscillator.java */
    /* renamed from: wzb$d */
    /* loaded from: classes.dex */
    public static class d extends wzb {
        public void j(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // defpackage.wzb
        public void i(View view, float f) {
        }
    }
}
