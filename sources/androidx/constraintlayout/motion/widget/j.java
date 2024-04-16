package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import defpackage.o0c;
import defpackage.s0c;
import defpackage.wzb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class j {
    private HashMap<String, s0c> A;
    private HashMap<String, o0c> B;
    private HashMap<String, wzb> C;
    private h[] D;
    private int E;
    private int F;
    private View G;
    private int H;
    private float I;
    private Interpolator J;
    private boolean K;
    View b;
    int c;
    String d;
    private s32[] j;
    private s32 k;
    float o;
    float p;
    private int[] q;
    private double[] r;
    private double[] s;
    private String[] t;
    private int[] u;
    Rect a = new Rect();
    private int e = -1;
    private k f = new k();
    private k g = new k();
    private i h = new i();
    private i i = new i();
    float l = Float.NaN;
    float m = 0.0f;
    float n = 1.0f;
    private int v = 4;
    private float[] w = new float[4];
    private ArrayList<k> x = new ArrayList<>();
    private float[] y = new float[1];
    private ArrayList<androidx.constraintlayout.motion.widget.a> z = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MotionController.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        final /* synthetic */ yb3 a;

        a(yb3 yb3Var) {
            this.a = yb3Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(View view) {
        int i = androidx.constraintlayout.motion.widget.a.f;
        this.E = i;
        this.F = i;
        this.G = null;
        this.H = i;
        this.I = Float.NaN;
        this.J = null;
        this.K = false;
        D(view);
    }

    private float g(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.n;
            if (f4 != 1.0d) {
                float f5 = this.m;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        yb3 yb3Var = this.f.a;
        Iterator<k> it = this.x.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            k next = it.next();
            yb3 yb3Var2 = next.a;
            if (yb3Var2 != null) {
                float f7 = next.c;
                if (f7 < f) {
                    yb3Var = yb3Var2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.c;
                }
            }
        }
        if (yb3Var != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) yb3Var.a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) yb3Var.b(d);
            }
        }
        return f;
    }

    private static Interpolator p(Context context, int i, String str, int i2) {
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(yb3.c(str));
        }
        return AnimationUtils.loadInterpolator(context, i2);
    }

    private float r() {
        char c;
        float f;
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f4 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f5 = i * f3;
            double d3 = f5;
            yb3 yb3Var = this.f.a;
            Iterator<k> it = this.x.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it.hasNext()) {
                k next = it.next();
                yb3 yb3Var2 = next.a;
                if (yb3Var2 != null) {
                    float f8 = next.c;
                    if (f8 < f5) {
                        yb3Var = yb3Var2;
                        f7 = f8;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.c;
                    }
                }
            }
            if (yb3Var != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d3 = (((float) yb3Var.a((f5 - f7) / f2)) * (f6 - f7)) + f7;
            }
            this.j[0].d(d3, this.r);
            float f9 = f4;
            int i2 = i;
            this.f.o(d3, this.q, this.r, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (f9 + Math.hypot(d2 - fArr[1], d - fArr[0]));
            } else {
                c = 0;
                f = f9;
            }
            d = fArr[c];
            i = i2 + 1;
            f4 = f;
            d2 = fArr[1];
        }
        return f4;
    }

    private void t(k kVar) {
        int binarySearch = Collections.binarySearch(this.x, kVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + kVar.d + "\" outside of range");
        }
        this.x.add((-binarySearch) - 1, kVar);
    }

    private void v(k kVar) {
        kVar.A((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(View view) {
        k kVar = this.f;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        kVar.A(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.h.t(view);
    }

    public void B(p0c p0cVar, View view, int i, int i2, int i3) {
        k kVar = this.f;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        Rect rect = new Rect();
        if (i != 1) {
            if (i == 2) {
                int i4 = p0cVar.b + p0cVar.d;
                rect.left = i3 - (((p0cVar.c + p0cVar.e) + p0cVar.b()) / 2);
                rect.top = (i4 - p0cVar.a()) / 2;
                rect.right = rect.left + p0cVar.b();
                rect.bottom = rect.top + p0cVar.a();
            }
        } else {
            int i5 = p0cVar.b + p0cVar.d;
            rect.left = ((p0cVar.c + p0cVar.e) - p0cVar.b()) / 2;
            rect.top = i2 - ((i5 + p0cVar.a()) / 2);
            rect.right = rect.left + p0cVar.b();
            rect.bottom = rect.top + p0cVar.a();
        }
        this.f.A(rect.left, rect.top, rect.width(), rect.height());
        this.h.q(rect, view, i, p0cVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(Rect rect, androidx.constraintlayout.widget.d dVar, int i, int i2) {
        int i3 = dVar.d;
        if (i3 != 0) {
            w(rect, this.a, i3, i, i2);
        }
        k kVar = this.f;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        v(kVar);
        this.f.A(rect.left, rect.top, rect.width(), rect.height());
        d.a A = dVar.A(this.c);
        this.f.a(A);
        this.l = A.d.g;
        this.h.s(rect, dVar, i3, this.c);
        this.F = A.f.i;
        d.c cVar = A.d;
        this.H = cVar.k;
        this.I = cVar.j;
        Context context = this.b.getContext();
        d.c cVar2 = A.d;
        this.J = p(context, cVar2.m, cVar2.l, cVar2.n);
    }

    public void D(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.d = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void E(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        k kVar;
        double[][] dArr;
        androidx.constraintlayout.widget.a aVar;
        int i3;
        s0c h;
        androidx.constraintlayout.widget.a aVar2;
        int i4;
        Integer num;
        o0c f2;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i5 = this.E;
        if (i5 != androidx.constraintlayout.motion.widget.a.f) {
            this.f.k = i5;
        }
        this.h.o(this.i, hashSet2);
        ArrayList<androidx.constraintlayout.motion.widget.a> arrayList2 = this.z;
        if (arrayList2 != null) {
            Iterator<androidx.constraintlayout.motion.widget.a> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                androidx.constraintlayout.motion.widget.a next = it.next();
                if (next instanceof e) {
                    e eVar = (e) next;
                    t(new k(i, i2, eVar, this.f, this.g));
                    int i6 = eVar.g;
                    if (i6 != androidx.constraintlayout.motion.widget.a.f) {
                        this.e = i6;
                    }
                } else if (next instanceof c) {
                    next.d(hashSet3);
                } else if (next instanceof g) {
                    next.d(hashSet);
                } else if (next instanceof h) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((h) next);
                } else {
                    next.g(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.D = (h[]) arrayList.toArray(new h[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.B = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<androidx.constraintlayout.motion.widget.a> it3 = this.z.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.motion.widget.a next3 = it3.next();
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.e;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.a, aVar3);
                        }
                    }
                    f2 = o0c.e(next2, sparseArray);
                } else {
                    f2 = o0c.f(next2);
                }
                if (f2 != null) {
                    f2.c(next2);
                    this.B.put(next2, f2);
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.a> arrayList3 = this.z;
            if (arrayList3 != null) {
                Iterator<androidx.constraintlayout.motion.widget.a> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    androidx.constraintlayout.motion.widget.a next4 = it4.next();
                    if (next4 instanceof b) {
                        next4.a(this.B);
                    }
                }
            }
            this.h.a(this.B, 0);
            this.i.a(this.B, 100);
            for (String str2 : this.B.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                }
                o0c o0cVar = this.B.get(str2);
                if (o0cVar != null) {
                    o0cVar.d(i4);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.A.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<androidx.constraintlayout.motion.widget.a> it6 = this.z.iterator();
                        while (it6.hasNext()) {
                            androidx.constraintlayout.motion.widget.a next6 = it6.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.e;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.a, aVar2);
                            }
                        }
                        h = s0c.g(next5, sparseArray2);
                    } else {
                        h = s0c.h(next5, j);
                    }
                    if (h != null) {
                        h.d(next5);
                        this.A.put(next5, h);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.a> arrayList4 = this.z;
            if (arrayList4 != null) {
                Iterator<androidx.constraintlayout.motion.widget.a> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    androidx.constraintlayout.motion.widget.a next7 = it7.next();
                    if (next7 instanceof g) {
                        ((g) next7).Q(this.A);
                    }
                }
            }
            for (String str4 : this.A.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i3 = hashMap.get(str4).intValue();
                } else {
                    i3 = 0;
                }
                this.A.get(str4).e(i3);
            }
        }
        int size = this.x.size();
        int i7 = size + 2;
        k[] kVarArr = new k[i7];
        kVarArr[0] = this.f;
        kVarArr[size + 1] = this.g;
        if (this.x.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        Iterator<k> it8 = this.x.iterator();
        int i8 = 1;
        while (it8.hasNext()) {
            kVarArr[i8] = it8.next();
            i8++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.g.o.keySet()) {
            if (this.f.o.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.t = strArr2;
        this.u = new int[strArr2.length];
        int i9 = 0;
        while (true) {
            strArr = this.t;
            if (i9 >= strArr.length) {
                break;
            }
            String str6 = strArr[i9];
            this.u[i9] = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    break;
                }
                if (kVarArr[i10].o.containsKey(str6) && (aVar = kVarArr[i10].o.get(str6)) != null) {
                    int[] iArr = this.u;
                    iArr[i9] = iArr[i9] + aVar.h();
                    break;
                }
                i10++;
            }
            i9++;
        }
        if (kVarArr[0].k != androidx.constraintlayout.motion.widget.a.f) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 1; i11 < i7; i11++) {
            kVarArr[i11].i(kVarArr[i11 - 1], zArr, this.t, z);
        }
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                i12++;
            }
        }
        this.q = new int[i12];
        int max = Math.max(2, i12);
        this.r = new double[max];
        this.s = new double[max];
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                this.q[i14] = i15;
                i14++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i7, this.q.length);
        double[] dArr3 = new double[i7];
        for (int i16 = 0; i16 < i7; i16++) {
            kVarArr[i16].k(dArr2[i16], this.q);
            dArr3[i16] = kVarArr[i16].c;
        }
        int i17 = 0;
        while (true) {
            int[] iArr2 = this.q;
            if (i17 >= iArr2.length) {
                break;
            }
            if (iArr2[i17] < k.t.length) {
                String str7 = k.t[this.q[i17]] + " [";
                for (int i18 = 0; i18 < i7; i18++) {
                    str7 = str7 + dArr2[i18][i17];
                }
            }
            i17++;
        }
        this.j = new s32[this.t.length + 1];
        int i19 = 0;
        while (true) {
            String[] strArr3 = this.t;
            if (i19 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i19];
            int i20 = 0;
            double[] dArr4 = null;
            int i21 = 0;
            double[][] dArr5 = null;
            while (i20 < i7) {
                if (kVarArr[i20].u(str8)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i7];
                        dArr5 = (double[][]) Array.newInstance(Double.TYPE, i7, kVarArr[i20].s(str8));
                    }
                    k kVar2 = kVarArr[i20];
                    dArr = dArr2;
                    dArr4[i21] = kVar2.c;
                    kVar2.q(str8, dArr5[i21], 0);
                    i21++;
                } else {
                    dArr = dArr2;
                }
                i20++;
                dArr2 = dArr;
            }
            i19++;
            this.j[i19] = s32.a(this.e, Arrays.copyOf(dArr4, i21), (double[][]) Arrays.copyOf(dArr5, i21));
            dArr2 = dArr2;
        }
        this.j[0] = s32.a(this.e, dArr3, dArr2);
        if (kVarArr[0].k != androidx.constraintlayout.motion.widget.a.f) {
            int[] iArr3 = new int[i7];
            double[] dArr6 = new double[i7];
            double[][] dArr7 = (double[][]) Array.newInstance(Double.TYPE, i7, 2);
            for (int i22 = 0; i22 < i7; i22++) {
                iArr3[i22] = kVarArr[i22].k;
                dArr6[i22] = kVar.c;
                double[] dArr8 = dArr7[i22];
                dArr8[0] = kVar.e;
                dArr8[1] = kVar.f;
            }
            this.k = s32.b(iArr3, dArr6, dArr7);
        }
        this.C = new HashMap<>();
        if (this.z != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f3 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                wzb h2 = wzb.h(next8);
                if (h2 != null) {
                    if (h2.g() && Float.isNaN(f3)) {
                        f3 = r();
                    }
                    h2.e(next8);
                    this.C.put(next8, h2);
                }
            }
            Iterator<androidx.constraintlayout.motion.widget.a> it10 = this.z.iterator();
            while (it10.hasNext()) {
                androidx.constraintlayout.motion.widget.a next9 = it10.next();
                if (next9 instanceof c) {
                    ((c) next9).U(this.C);
                }
            }
            for (wzb wzbVar : this.C.values()) {
                wzbVar.f(f3);
            }
        }
    }

    public void F(j jVar) {
        this.f.D(jVar, jVar.f);
        this.g.D(jVar, jVar.g);
    }

    public void a(androidx.constraintlayout.motion.widget.a aVar) {
        this.z.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ArrayList<androidx.constraintlayout.motion.widget.a> arrayList) {
        this.z.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] g = this.j[0].g();
        if (iArr != null) {
            Iterator<k> it = this.x.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().p;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < g.length; i3++) {
            this.j[0].d(g[i3], this.r);
            this.f.o(g[i3], this.q, this.r, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(float[] fArr, int i) {
        o0c o0cVar;
        o0c o0cVar2;
        wzb wzbVar;
        double d;
        float f;
        float f2 = 1.0f;
        float f3 = 1.0f / (i - 1);
        HashMap<String, o0c> hashMap = this.B;
        wzb wzbVar2 = null;
        if (hashMap == null) {
            o0cVar = null;
        } else {
            o0cVar = hashMap.get("translationX");
        }
        HashMap<String, o0c> hashMap2 = this.B;
        if (hashMap2 == null) {
            o0cVar2 = null;
        } else {
            o0cVar2 = hashMap2.get("translationY");
        }
        HashMap<String, wzb> hashMap3 = this.C;
        if (hashMap3 == null) {
            wzbVar = null;
        } else {
            wzbVar = hashMap3.get("translationX");
        }
        HashMap<String, wzb> hashMap4 = this.C;
        if (hashMap4 != null) {
            wzbVar2 = hashMap4.get("translationY");
        }
        wzb wzbVar3 = wzbVar2;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f3;
            float f5 = this.n;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.m;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            float f8 = f4;
            double d2 = f8;
            yb3 yb3Var = this.f.a;
            Iterator<k> it = this.x.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                k next = it.next();
                yb3 yb3Var2 = next.a;
                double d3 = d2;
                if (yb3Var2 != null) {
                    float f10 = next.c;
                    if (f10 < f8) {
                        f6 = f10;
                        yb3Var = yb3Var2;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.c;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (yb3Var != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d = (((float) yb3Var.a((f8 - f6) / f)) * (f9 - f6)) + f6;
            } else {
                d = d4;
            }
            this.j[0].d(d, this.r);
            s32 s32Var = this.k;
            if (s32Var != null) {
                double[] dArr = this.r;
                if (dArr.length > 0) {
                    s32Var.d(d, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f.o(d, this.q, this.r, fArr, i3);
            if (wzbVar != null) {
                fArr[i3] = fArr[i3] + wzbVar.a(f8);
            } else if (o0cVar != null) {
                fArr[i3] = fArr[i3] + o0cVar.a(f8);
            }
            if (wzbVar3 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + wzbVar3.a(f8);
            } else if (o0cVar2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + o0cVar2.a(f8);
            }
            i2 = i4 + 1;
            f2 = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(float f, float[] fArr, int i) {
        this.j[0].d(g(f, null), this.r);
        this.f.t(this.q, this.r, fArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z) {
        float f;
        if ("button".equals(ln2.d(this.b)) && this.D != null) {
            int i = 0;
            while (true) {
                h[] hVarArr = this.D;
                if (i < hVarArr.length) {
                    h hVar = hVarArr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    hVar.u(f, this.b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public int h() {
        return this.f.l;
    }

    public void i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].d(d, dArr);
        this.j[0].f(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f.p(d, this.q, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.o;
    }

    public float k() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float g = g(f, this.y);
        s32[] s32VarArr = this.j;
        int i = 0;
        if (s32VarArr != null) {
            double d = g;
            s32VarArr[0].f(d, this.s);
            this.j[0].d(d, this.r);
            float f4 = this.y[0];
            while (true) {
                dArr = this.s;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            s32 s32Var = this.k;
            if (s32Var != null) {
                double[] dArr2 = this.r;
                if (dArr2.length > 0) {
                    s32Var.d(d, dArr2);
                    this.k.f(d, this.s);
                    this.f.B(f2, f3, fArr, this.q, this.s, this.r);
                    return;
                }
                return;
            }
            this.f.B(f2, f3, fArr, this.q, dArr, this.r);
            return;
        }
        k kVar = this.g;
        float f5 = kVar.e;
        k kVar2 = this.f;
        float f6 = f5 - kVar2.e;
        float f7 = kVar.f - kVar2.f;
        float f8 = (kVar.g - kVar2.g) + f6;
        float f9 = (kVar.h - kVar2.h) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    public int m() {
        int i = this.f.b;
        Iterator<k> it = this.x.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().b);
        }
        return Math.max(i, this.g.b);
    }

    public float n() {
        return this.g.e;
    }

    public float o() {
        return this.g.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k q(int i) {
        return this.x.get(i);
    }

    public View s() {
        return this.b;
    }

    public String toString() {
        return " start: x: " + this.f.e + " y: " + this.f.f + " end: x: " + this.g.e + " y: " + this.g.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(View view, float f, long j, ue5 ue5Var) {
        s0c.d dVar;
        boolean z;
        char c;
        double d;
        View view2;
        float f2;
        float g = g(f, null);
        int i = this.H;
        if (i != androidx.constraintlayout.motion.widget.a.f) {
            float f3 = 1.0f / i;
            float floor = ((float) Math.floor(g / f3)) * f3;
            float f4 = (g % f3) / f3;
            if (!Float.isNaN(this.I)) {
                f4 = (f4 + this.I) % 1.0f;
            }
            Interpolator interpolator = this.J;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f4);
            } else if (f4 > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            g = (f2 * f3) + floor;
        }
        float f5 = g;
        HashMap<String, o0c> hashMap = this.B;
        if (hashMap != null) {
            for (o0c o0cVar : hashMap.values()) {
                o0cVar.g(view, f5);
            }
        }
        HashMap<String, s0c> hashMap2 = this.A;
        if (hashMap2 != null) {
            dVar = null;
            boolean z2 = false;
            for (s0c s0cVar : hashMap2.values()) {
                if (s0cVar instanceof s0c.d) {
                    dVar = (s0c.d) s0cVar;
                } else {
                    z2 |= s0cVar.i(view, f5, j, ue5Var);
                }
            }
            z = z2;
        } else {
            dVar = null;
            z = false;
        }
        s32[] s32VarArr = this.j;
        if (s32VarArr != null) {
            double d2 = f5;
            s32VarArr[0].d(d2, this.r);
            this.j[0].f(d2, this.s);
            s32 s32Var = this.k;
            if (s32Var != null) {
                double[] dArr = this.r;
                if (dArr.length > 0) {
                    s32Var.d(d2, dArr);
                    this.k.f(d2, this.s);
                }
            }
            if (!this.K) {
                d = d2;
                this.f.C(f5, view, this.q, this.r, this.s, null);
            } else {
                d = d2;
            }
            if (this.F != androidx.constraintlayout.motion.widget.a.f) {
                if (this.G == null) {
                    this.G = ((View) view.getParent()).findViewById(this.F);
                }
                if (this.G != null) {
                    float top = (view2.getTop() + this.G.getBottom()) / 2.0f;
                    float left = (this.G.getLeft() + this.G.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, o0c> hashMap3 = this.B;
            if (hashMap3 != null) {
                for (o0c o0cVar2 : hashMap3.values()) {
                    if (o0cVar2 instanceof o0c.d) {
                        double[] dArr2 = this.s;
                        if (dArr2.length > 1) {
                            ((o0c.d) o0cVar2).h(view, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.s;
                c = 1;
                z |= dVar.j(view, ue5Var, f5, j, dArr3[0], dArr3[1]);
            } else {
                c = 1;
            }
            int i2 = 1;
            while (true) {
                s32[] s32VarArr2 = this.j;
                if (i2 >= s32VarArr2.length) {
                    break;
                }
                s32VarArr2[i2].e(d, this.w);
                this.f.o.get(this.t[i2 - 1]).k(view, this.w);
                i2++;
            }
            i iVar = this.h;
            if (iVar.b == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(iVar.c);
                } else if (f5 >= 1.0f) {
                    view.setVisibility(this.i.c);
                } else if (this.i.c != iVar.c) {
                    view.setVisibility(0);
                }
            }
            if (this.D != null) {
                int i3 = 0;
                while (true) {
                    h[] hVarArr = this.D;
                    if (i3 >= hVarArr.length) {
                        break;
                    }
                    hVarArr[i3].u(f5, view);
                    i3++;
                }
            }
        } else {
            c = 1;
            k kVar = this.f;
            float f6 = kVar.e;
            k kVar2 = this.g;
            float f7 = f6 + ((kVar2.e - f6) * f5);
            float f8 = kVar.f;
            float f9 = f8 + ((kVar2.f - f8) * f5);
            float f10 = kVar.g;
            float f11 = kVar2.g;
            float f12 = kVar.h;
            float f13 = kVar2.h;
            float f14 = f7 + 0.5f;
            int i4 = (int) f14;
            float f15 = f9 + 0.5f;
            int i5 = (int) f15;
            int i6 = (int) (f14 + ((f11 - f10) * f5) + f10);
            int i7 = (int) (f15 + ((f13 - f12) * f5) + f12);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (f11 != f10 || f13 != f12) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
            }
            view.layout(i4, i5, i6, i7);
        }
        HashMap<String, wzb> hashMap4 = this.C;
        if (hashMap4 != null) {
            for (wzb wzbVar : hashMap4.values()) {
                if (wzbVar instanceof wzb.d) {
                    double[] dArr4 = this.s;
                    ((wzb.d) wzbVar).j(view, f5, dArr4[0], dArr4[c]);
                } else {
                    wzbVar.i(view, f5);
                }
            }
        }
        return z;
    }

    void w(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        int i4 = rect.left + rect.right;
                        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i4 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i5 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i5 / 2);
                rect2.top = i3 - ((i5 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i6 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i3 - ((i7 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(View view) {
        k kVar = this.f;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        this.K = true;
        kVar.A(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.g.A(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.h.t(view);
        this.i.t(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Rect rect, androidx.constraintlayout.widget.d dVar, int i, int i2) {
        int i3 = dVar.d;
        if (i3 != 0) {
            w(rect, this.a, i3, i, i2);
            rect = this.a;
        }
        k kVar = this.g;
        kVar.c = 1.0f;
        kVar.d = 1.0f;
        v(kVar);
        this.g.A(rect.left, rect.top, rect.width(), rect.height());
        this.g.a(dVar.A(this.c));
        this.i.s(rect, dVar, i3, this.c);
    }

    public void z(int i) {
        this.E = i;
    }
}
