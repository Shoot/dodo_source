package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.d;
import defpackage.o0c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
public class i implements Comparable<i> {
    static String[] X = {"position", "x", "y", "width", "height", "pathRotate"};
    int c;
    private yb3 p;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float a = 1.0f;
    int b = 0;
    private boolean d = false;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    public float h = 0.0f;
    private float i = 1.0f;
    private float j = 1.0f;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = 0.0f;
    private float n = 0.0f;
    private float o = 0.0f;
    private int q = 0;
    private float w = Float.NaN;
    private float x = Float.NaN;
    private int y = -1;
    LinkedHashMap<String, androidx.constraintlayout.widget.a> z = new LinkedHashMap<>();
    int A = 0;
    double[] B = new double[18];
    double[] I = new double[18];

    private boolean k(float f, float f2) {
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

    public void a(HashMap<String, o0c> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            o0c o0cVar = hashMap.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.g)) {
                        f2 = this.g;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.h)) {
                        f2 = this.h;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.m)) {
                        f2 = this.m;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.n)) {
                        f2 = this.n;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.o)) {
                        f2 = this.o;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.x)) {
                        f2 = this.x;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.i)) {
                        f = this.i;
                    }
                    o0cVar.b(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.j)) {
                        f = this.j;
                    }
                    o0cVar.b(i, f);
                    break;
                case '\b':
                    if (!Float.isNaN(this.k)) {
                        f2 = this.k;
                    }
                    o0cVar.b(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.l)) {
                        f2 = this.l;
                    }
                    o0cVar.b(i, f2);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f)) {
                        f2 = this.f;
                    }
                    o0cVar.b(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.e)) {
                        f2 = this.e;
                    }
                    o0cVar.b(i, f2);
                    break;
                case '\f':
                    if (!Float.isNaN(this.w)) {
                        f2 = this.w;
                    }
                    o0cVar.b(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.a)) {
                        f = this.a;
                    }
                    o0cVar.b(i, f);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.z.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = this.z.get(str2);
                            if (o0cVar instanceof o0c.b) {
                                ((o0c.b) o0cVar).h(i, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + aVar.e() + o0cVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void g(View view) {
        float alpha;
        this.c = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.a = alpha;
        this.d = false;
        this.e = view.getElevation();
        this.f = view.getRotation();
        this.g = view.getRotationX();
        this.h = view.getRotationY();
        this.i = view.getScaleX();
        this.j = view.getScaleY();
        this.k = view.getPivotX();
        this.l = view.getPivotY();
        this.m = view.getTranslationX();
        this.n = view.getTranslationY();
        this.o = view.getTranslationZ();
    }

    public void h(d.a aVar) {
        float f;
        d.C0027d c0027d = aVar.c;
        int i = c0027d.c;
        this.b = i;
        int i2 = c0027d.b;
        this.c = i2;
        if (i2 != 0 && i == 0) {
            f = 0.0f;
        } else {
            f = c0027d.d;
        }
        this.a = f;
        d.e eVar = aVar.f;
        this.d = eVar.m;
        this.e = eVar.n;
        this.f = eVar.b;
        this.g = eVar.c;
        this.h = eVar.d;
        this.i = eVar.e;
        this.j = eVar.f;
        this.k = eVar.g;
        this.l = eVar.h;
        this.m = eVar.j;
        this.n = eVar.k;
        this.o = eVar.l;
        this.p = yb3.c(aVar.d.d);
        d.c cVar = aVar.d;
        this.w = cVar.i;
        this.q = cVar.f;
        this.y = cVar.b;
        this.x = aVar.c.e;
        for (String str : aVar.g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.g.get(str);
            if (aVar2.g()) {
                this.z.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(i iVar) {
        return Float.compare(this.r, iVar.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(i iVar, HashSet<String> hashSet) {
        if (k(this.a, iVar.a)) {
            hashSet.add("alpha");
        }
        if (k(this.e, iVar.e)) {
            hashSet.add("elevation");
        }
        int i = this.c;
        int i2 = iVar.c;
        if (i != i2 && this.b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (k(this.f, iVar.f)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.w) || !Float.isNaN(iVar.w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.x) || !Float.isNaN(iVar.x)) {
            hashSet.add("progress");
        }
        if (k(this.g, iVar.g)) {
            hashSet.add("rotationX");
        }
        if (k(this.h, iVar.h)) {
            hashSet.add("rotationY");
        }
        if (k(this.k, iVar.k)) {
            hashSet.add("transformPivotX");
        }
        if (k(this.l, iVar.l)) {
            hashSet.add("transformPivotY");
        }
        if (k(this.i, iVar.i)) {
            hashSet.add("scaleX");
        }
        if (k(this.j, iVar.j)) {
            hashSet.add("scaleY");
        }
        if (k(this.m, iVar.m)) {
            hashSet.add("translationX");
        }
        if (k(this.n, iVar.n)) {
            hashSet.add("translationY");
        }
        if (k(this.o, iVar.o)) {
            hashSet.add("translationZ");
        }
    }

    void p(float f, float f2, float f3, float f4) {
        this.s = f;
        this.t = f2;
        this.u = f3;
        this.v = f4;
    }

    public void q(Rect rect, View view, int i, float f) {
        p(rect.left, rect.top, rect.width(), rect.height());
        g(view);
        this.k = Float.NaN;
        this.l = Float.NaN;
        if (i != 1) {
            if (i == 2) {
                this.f = f + 90.0f;
                return;
            }
            return;
        }
        this.f = f - 90.0f;
    }

    public void s(Rect rect, androidx.constraintlayout.widget.d dVar, int i, int i2) {
        p(rect.left, rect.top, rect.width(), rect.height());
        h(dVar.A(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f + 90.0f;
            this.f = f;
            if (f > 180.0f) {
                this.f = f - 360.0f;
                return;
            }
            return;
        }
        this.f -= 90.0f;
    }

    public void t(View view) {
        p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        g(view);
    }
}
