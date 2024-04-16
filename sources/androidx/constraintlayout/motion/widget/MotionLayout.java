package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import defpackage.lr1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements ov6 {
    public static boolean Q5;
    private kxa A;
    int A5;
    private e B;
    private boolean B5;
    int C5;
    HashMap<View, p0c> D5;
    private int E5;
    private int F5;
    private int G5;
    Rect H5;
    private j13 I;
    private boolean I5;
    l J5;
    g K5;
    private boolean L5;
    private RectF M5;
    private View N5;
    private Matrix O5;
    ArrayList<Integer> P5;
    boolean S4;
    int T4;
    int U4;
    int V4;
    int W4;
    boolean X4;
    float Y4;
    float Z4;
    androidx.constraintlayout.motion.widget.l a;
    long a5;
    Interpolator b;
    float b5;
    Interpolator c;
    private boolean c5;
    float d;
    private ArrayList<zo6> d5;
    private int e;
    private ArrayList<zo6> e5;
    int f;
    private ArrayList<zo6> f5;
    private int g;
    private CopyOnWriteArrayList<k> g5;
    private int h;
    private int h5;
    private int i;
    private long i5;
    private boolean j;
    private float j5;
    HashMap<View, androidx.constraintlayout.motion.widget.j> k;
    private int k5;
    private long l;
    private float l5;
    private float m;
    boolean m5;
    float n;
    protected boolean n5;
    float o;
    int o5;
    private long p;
    int p5;
    float q;
    int q5;
    private boolean r;
    int r5;
    boolean s;
    int s5;
    boolean t;
    int t5;
    private k u;
    float u5;
    private float v;
    private ue5 v5;
    private float w;
    private boolean w5;
    int x;
    private j x5;
    f y;
    private Runnable y5;
    private boolean z;
    private int[] z5;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.x5.a();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setNestedScrollingEnabled(true);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.x5.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.values().length];
            a = iArr;
            try {
                iArr[l.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[l.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[l.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[l.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends ap6 {
        float a = 0.0f;
        float b = 0.0f;
        float c;

        e() {
        }

        @Override // defpackage.ap6
        public float a() {
            return MotionLayout.this.d;
        }

        public void b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.a;
            if (f4 > 0.0f) {
                float f5 = this.c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.d = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.b;
            } else {
                float f6 = this.c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.d = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.b;
            }
            return f2 + f3;
        }
    }

    /* loaded from: classes.dex */
    private class f {
        float[] a;
        int[] b;
        float[] c;
        Path d;
        Paint e;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        private float[] j;
        DashPathEffect p;
        int q;
        int t;
        final int k = -21965;
        final int l = -2067046;
        final int m = -13391360;
        final int n = 1996488704;
        final int o = 10;
        Rect r = new Rect();
        boolean s = false;

        public f() {
            this.t = 1;
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            Paint paint2 = this.e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f = paint3;
            paint3.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(style);
            Paint paint4 = new Paint();
            this.g = paint4;
            paint4.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(style);
            Paint paint5 = new Paint();
            this.h = paint5;
            paint5.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint6 = new Paint();
            this.i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.p = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
            if (this.s) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.a, this.e);
        }

        private void d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.q; i++) {
                int i2 = this.b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                g(canvas);
            }
            if (z2) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.g);
        }

        private void f(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            l(str, this.h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.r.width() / 2)) + min, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            l(str2, this.h);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (this.r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        private void h(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            l(str, this.h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.r.width() / 2), -20.0f, this.h);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        private void i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            l(str, this.h);
            canvas.drawText(str, ((f / 2.0f) - (this.r.width() / 2)) + 0.0f, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.g);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            l(str2, this.h);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.g);
        }

        private void j(Canvas canvas, androidx.constraintlayout.motion.widget.j jVar) {
            this.d.reset();
            for (int i = 0; i <= 50; i++) {
                jVar.e(i / 50, this.j, 0);
                Path path = this.d;
                float[] fArr = this.j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.d;
                float[] fArr2 = this.j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.d;
                float[] fArr3 = this.j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.d;
                float[] fArr4 = this.j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(-65536);
            canvas.drawPath(this.d, this.e);
        }

        private void k(Canvas canvas, int i, int i2, androidx.constraintlayout.motion.widget.j jVar) {
            int i3;
            int i4;
            float f;
            float f2;
            View view = jVar.b;
            if (view != null) {
                i3 = view.getWidth();
                i4 = jVar.b.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i5 = 1; i5 < i2 - 1; i5++) {
                if (i != 4 || this.b[i5 - 1] != 0) {
                    float[] fArr = this.c;
                    int i6 = i5 * 2;
                    float f3 = fArr[i6];
                    float f4 = fArr[i6 + 1];
                    this.d.reset();
                    this.d.moveTo(f3, f4 + 10.0f);
                    this.d.lineTo(f3 + 10.0f, f4);
                    this.d.lineTo(f3, f4 - 10.0f);
                    this.d.lineTo(f3 - 10.0f, f4);
                    this.d.close();
                    int i7 = i5 - 1;
                    jVar.q(i7);
                    if (i == 4) {
                        int i8 = this.b[i7];
                        if (i8 == 1) {
                            h(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 0) {
                            f(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 2) {
                            f = f4;
                            f2 = f3;
                            i(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.d, this.i);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.d, this.i);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        h(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        f(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        i(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            float[] fArr2 = this.a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        public void a(Canvas canvas, HashMap<View, androidx.constraintlayout.motion.widget.j> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.g) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.h);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.e);
                }
                for (androidx.constraintlayout.motion.widget.j jVar : hashMap.values()) {
                    int m = jVar.m();
                    if (i2 > 0 && m == 0) {
                        m = 1;
                    }
                    if (m != 0) {
                        this.q = jVar.c(this.c, this.b);
                        if (m >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.a = new float[i3 * 2];
                                this.d = new Path();
                            }
                            int i4 = this.t;
                            canvas.translate(i4, i4);
                            this.e.setColor(1996488704);
                            this.i.setColor(1996488704);
                            this.f.setColor(1996488704);
                            this.g.setColor(1996488704);
                            jVar.d(this.a, i3);
                            b(canvas, m, this.q, jVar);
                            this.e.setColor(-21965);
                            this.f.setColor(-2067046);
                            this.i.setColor(-2067046);
                            this.g.setColor(-13391360);
                            int i5 = this.t;
                            canvas.translate(-i5, -i5);
                            b(canvas, m, this.q, jVar);
                            if (m == 5) {
                                j(canvas, jVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i, int i2, androidx.constraintlayout.motion.widget.j jVar) {
            if (i == 4) {
                d(canvas);
            }
            if (i == 2) {
                g(canvas);
            }
            if (i == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i, i2, jVar);
        }

        void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g {
        mr1 a = new mr1();
        mr1 b = new mr1();
        androidx.constraintlayout.widget.d c = null;
        androidx.constraintlayout.widget.d d = null;
        int e;
        int f;

        g() {
        }

        private void i(mr1 mr1Var, androidx.constraintlayout.widget.d dVar) {
            SparseArray<lr1> sparseArray = new SparseArray<>();
            e.a aVar = new e.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, mr1Var);
            sparseArray.put(MotionLayout.this.getId(), mr1Var);
            if (dVar != null && dVar.d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<lr1> it = mr1Var.m1().iterator();
            while (it.hasNext()) {
                lr1 next = it.next();
                sparseArray.put(((View) next.t()).getId(), next);
            }
            Iterator<lr1> it2 = mr1Var.m1().iterator();
            while (it2.hasNext()) {
                lr1 next2 = it2.next();
                View view = (View) next2.t();
                dVar.l(view.getId(), aVar);
                next2.f1(dVar.D(view.getId()));
                next2.G0(dVar.y(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    dVar.j((androidx.constraintlayout.widget.b) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).x();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, aVar, sparseArray);
                if (dVar.C(view.getId()) == 1) {
                    next2.e1(view.getVisibility());
                } else {
                    next2.e1(dVar.B(view.getId()));
                }
            }
            Iterator<lr1> it3 = mr1Var.m1().iterator();
            while (it3.hasNext()) {
                lr1 next3 = it3.next();
                if (next3 instanceof s1c) {
                    co4 co4Var = (co4) next3;
                    ((androidx.constraintlayout.widget.b) next3.t()).v(mr1Var, co4Var, sparseArray);
                    ((s1c) co4Var).p1();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.g.a():void");
        }

        void b(mr1 mr1Var, mr1 mr1Var2) {
            lr1 lr1Var;
            ArrayList<lr1> m1 = mr1Var.m1();
            HashMap<lr1, lr1> hashMap = new HashMap<>();
            hashMap.put(mr1Var, mr1Var2);
            mr1Var2.m1().clear();
            mr1Var2.m(mr1Var, hashMap);
            Iterator<lr1> it = m1.iterator();
            while (it.hasNext()) {
                lr1 next = it.next();
                if (next instanceof q60) {
                    lr1Var = new q60();
                } else if (next instanceof vi4) {
                    lr1Var = new vi4();
                } else if (next instanceof nz3) {
                    lr1Var = new nz3();
                } else if (next instanceof co4) {
                    lr1Var = new eo4();
                } else {
                    lr1Var = new lr1();
                }
                mr1Var2.b(lr1Var);
                hashMap.put(next, lr1Var);
            }
            Iterator<lr1> it2 = m1.iterator();
            while (it2.hasNext()) {
                lr1 next2 = it2.next();
                hashMap.get(next2).m(next2, hashMap);
            }
        }

        lr1 c(mr1 mr1Var, View view) {
            if (mr1Var.t() == view) {
                return mr1Var;
            }
            ArrayList<lr1> m1 = mr1Var.m1();
            int size = m1.size();
            for (int i = 0; i < size; i++) {
                lr1 lr1Var = m1.get(i);
                if (lr1Var.t() == view) {
                    return lr1Var;
                }
            }
            return null;
        }

        void d(mr1 mr1Var, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.c = dVar;
            this.d = dVar2;
            this.a = new mr1();
            this.b = new mr1();
            this.a.R1(((ConstraintLayout) MotionLayout.this).mLayoutWidget.E1());
            this.b.R1(((ConstraintLayout) MotionLayout.this).mLayoutWidget.E1());
            this.a.p1();
            this.b.p1();
            b(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.a);
            b(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.b);
            if (MotionLayout.this.o > 0.5d) {
                if (dVar != null) {
                    i(this.a, dVar);
                }
                i(this.b, dVar2);
            } else {
                i(this.b, dVar2);
                if (dVar != null) {
                    i(this.a, dVar);
                }
            }
            this.a.U1(MotionLayout.this.isRtl());
            this.a.W1();
            this.b.U1(MotionLayout.this.isRtl());
            this.b.W1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    mr1 mr1Var2 = this.a;
                    lr1.b bVar = lr1.b.WRAP_CONTENT;
                    mr1Var2.K0(bVar);
                    this.b.K0(bVar);
                }
                if (layoutParams.height == -2) {
                    mr1 mr1Var3 = this.a;
                    lr1.b bVar2 = lr1.b.WRAP_CONTENT;
                    mr1Var3.b1(bVar2);
                    this.b.b1(bVar2);
                }
            }
        }

        public boolean e(int i, int i2) {
            if (i == this.e && i2 == this.f) {
                return false;
            }
            return true;
        }

        public void f(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            boolean z;
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z2;
            boolean z3;
            int i15;
            int i16;
            int i17;
            int i18;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.s5 = mode;
            motionLayout.t5 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.f == motionLayout2.getStartState()) {
                MotionLayout motionLayout3 = MotionLayout.this;
                mr1 mr1Var = this.b;
                androidx.constraintlayout.widget.d dVar = this.d;
                if (dVar != null && dVar.d != 0) {
                    i15 = i2;
                } else {
                    i15 = i;
                }
                if (dVar != null && dVar.d != 0) {
                    i16 = i;
                } else {
                    i16 = i2;
                }
                motionLayout3.resolveSystem(mr1Var, optimizationLevel, i15, i16);
                androidx.constraintlayout.widget.d dVar2 = this.c;
                if (dVar2 != null) {
                    MotionLayout motionLayout4 = MotionLayout.this;
                    mr1 mr1Var2 = this.a;
                    int i19 = dVar2.d;
                    if (i19 == 0) {
                        i17 = i;
                    } else {
                        i17 = i2;
                    }
                    if (i19 == 0) {
                        i18 = i2;
                    } else {
                        i18 = i;
                    }
                    motionLayout4.resolveSystem(mr1Var2, optimizationLevel, i17, i18);
                }
            } else {
                androidx.constraintlayout.widget.d dVar3 = this.c;
                if (dVar3 != null) {
                    MotionLayout motionLayout5 = MotionLayout.this;
                    mr1 mr1Var3 = this.a;
                    int i20 = dVar3.d;
                    if (i20 == 0) {
                        i5 = i;
                    } else {
                        i5 = i2;
                    }
                    if (i20 == 0) {
                        i6 = i2;
                    } else {
                        i6 = i;
                    }
                    motionLayout5.resolveSystem(mr1Var3, optimizationLevel, i5, i6);
                }
                MotionLayout motionLayout6 = MotionLayout.this;
                mr1 mr1Var4 = this.b;
                androidx.constraintlayout.widget.d dVar4 = this.d;
                if (dVar4 != null && dVar4.d != 0) {
                    i3 = i2;
                } else {
                    i3 = i;
                }
                if (dVar4 != null && dVar4.d != 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                motionLayout6.resolveSystem(mr1Var4, optimizationLevel, i3, i4);
            }
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                MotionLayout motionLayout7 = MotionLayout.this;
                motionLayout7.s5 = mode;
                motionLayout7.t5 = mode2;
                if (motionLayout7.f == motionLayout7.getStartState()) {
                    MotionLayout motionLayout8 = MotionLayout.this;
                    mr1 mr1Var5 = this.b;
                    int i21 = this.d.d;
                    if (i21 == 0) {
                        i11 = i;
                    } else {
                        i11 = i2;
                    }
                    if (i21 == 0) {
                        i12 = i2;
                    } else {
                        i12 = i;
                    }
                    motionLayout8.resolveSystem(mr1Var5, optimizationLevel, i11, i12);
                    androidx.constraintlayout.widget.d dVar5 = this.c;
                    if (dVar5 != null) {
                        MotionLayout motionLayout9 = MotionLayout.this;
                        mr1 mr1Var6 = this.a;
                        int i22 = dVar5.d;
                        if (i22 == 0) {
                            i13 = i;
                        } else {
                            i13 = i2;
                        }
                        if (i22 == 0) {
                            i14 = i2;
                        } else {
                            i14 = i;
                        }
                        motionLayout9.resolveSystem(mr1Var6, optimizationLevel, i13, i14);
                    }
                } else {
                    androidx.constraintlayout.widget.d dVar6 = this.c;
                    if (dVar6 != null) {
                        MotionLayout motionLayout10 = MotionLayout.this;
                        mr1 mr1Var7 = this.a;
                        int i23 = dVar6.d;
                        if (i23 == 0) {
                            i9 = i;
                        } else {
                            i9 = i2;
                        }
                        if (i23 == 0) {
                            i10 = i2;
                        } else {
                            i10 = i;
                        }
                        motionLayout10.resolveSystem(mr1Var7, optimizationLevel, i9, i10);
                    }
                    MotionLayout motionLayout11 = MotionLayout.this;
                    mr1 mr1Var8 = this.b;
                    int i24 = this.d.d;
                    if (i24 == 0) {
                        i7 = i;
                    } else {
                        i7 = i2;
                    }
                    if (i24 == 0) {
                        i8 = i2;
                    } else {
                        i8 = i;
                    }
                    motionLayout11.resolveSystem(mr1Var8, optimizationLevel, i7, i8);
                }
                MotionLayout.this.o5 = this.a.U();
                MotionLayout.this.p5 = this.a.y();
                MotionLayout.this.q5 = this.b.U();
                MotionLayout.this.r5 = this.b.y();
                MotionLayout motionLayout12 = MotionLayout.this;
                if (motionLayout12.o5 == motionLayout12.q5 && motionLayout12.p5 == motionLayout12.r5) {
                    z = false;
                } else {
                    z = true;
                }
                motionLayout12.n5 = z;
            }
            MotionLayout motionLayout13 = MotionLayout.this;
            int i25 = motionLayout13.o5;
            int i26 = motionLayout13.p5;
            int i27 = motionLayout13.s5;
            if (i27 == Integer.MIN_VALUE || i27 == 0) {
                i25 = (int) (i25 + (motionLayout13.u5 * (motionLayout13.q5 - i25)));
            }
            int i28 = i25;
            int i29 = motionLayout13.t5;
            if (i29 == Integer.MIN_VALUE || i29 == 0) {
                i26 = (int) (i26 + (motionLayout13.u5 * (motionLayout13.r5 - i26)));
            }
            int i30 = i26;
            if (!this.a.M1() && !this.b.M1()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.a.K1() && !this.b.K1()) {
                z3 = false;
            } else {
                z3 = true;
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i28, i30, z2, z3);
        }

        public void g() {
            f(MotionLayout.this.h, MotionLayout.this.i);
            MotionLayout.this.b0();
        }

        public void h(int i, int i2) {
            this.e = i;
            this.f = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface h {
        void a(MotionEvent motionEvent);

        void b();

        float c();

        float d();

        void e(int i);
    }

    /* loaded from: classes.dex */
    private static class i implements h {
        private static i b = new i();
        VelocityTracker a;

        private i() {
        }

        public static i f() {
            b.a = VelocityTracker.obtain();
            return b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void b() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float c() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public float d() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
        public void e(int i) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j {
        float a = Float.NaN;
        float b = Float.NaN;
        int c = -1;
        int d = -1;
        final String e = "motion.progress";
        final String f = "motion.velocity";
        final String g = "motion.StartState";
        final String h = "motion.EndState";

        j() {
        }

        void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    MotionLayout.this.h0(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.a0(i, i2);
                    }
                }
                MotionLayout.this.setState(l.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.a);
                return;
            }
            MotionLayout.this.Z(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void c() {
            this.d = MotionLayout.this.g;
            this.c = MotionLayout.this.e;
            this.b = MotionLayout.this.getVelocity();
            this.a = MotionLayout.this.getProgress();
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(float f) {
            this.a = f;
        }

        public void f(int i) {
            this.c = i;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float f) {
            this.b = f;
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(MotionLayout motionLayout, int i, int i2, float f);

        void b(MotionLayout motionLayout, int i);

        void c(MotionLayout motionLayout, int i, int i2);

        void d(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum l {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap<>();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new kxa();
        this.B = new e();
        this.S4 = true;
        this.X4 = false;
        this.c5 = false;
        this.d5 = null;
        this.e5 = null;
        this.f5 = null;
        this.g5 = null;
        this.h5 = 0;
        this.i5 = -1L;
        this.j5 = 0.0f;
        this.k5 = 0;
        this.l5 = 0.0f;
        this.m5 = false;
        this.n5 = false;
        this.v5 = new ue5();
        this.w5 = false;
        this.y5 = null;
        this.z5 = null;
        this.A5 = 0;
        this.B5 = false;
        this.C5 = 0;
        this.D5 = new HashMap<>();
        this.H5 = new Rect();
        this.I5 = false;
        this.J5 = l.UNDEFINED;
        this.K5 = new g();
        this.L5 = false;
        this.M5 = new RectF();
        this.N5 = null;
        this.O5 = null;
        this.P5 = new ArrayList<>();
        T(attributeSet);
    }

    private boolean D(View view, MotionEvent motionEvent, float f2, float f3) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f2, f3);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f2, -f3);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f2, f3);
        if (this.O5 == null) {
            this.O5 = new Matrix();
        }
        matrix.invert(this.O5);
        obtain.transform(this.O5);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void E() {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int E = lVar.E();
        androidx.constraintlayout.motion.widget.l lVar2 = this.a;
        F(E, lVar2.k(lVar2.E()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<l.b> it = this.a.n().iterator();
        while (it.hasNext()) {
            l.b next = it.next();
            if (next == this.a.c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            G(next);
            int A = next.A();
            int y = next.y();
            String c2 = ln2.c(getContext(), A);
            String c3 = ln2.c(getContext(), y);
            if (sparseIntArray.get(A) == y) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c2 + "->" + c3);
            }
            if (sparseIntArray2.get(y) == A) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c2 + "->" + c3);
            }
            sparseIntArray.put(A, y);
            sparseIntArray2.put(y, A);
            if (this.a.k(A) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + c2);
            }
            if (this.a.k(y) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + c2);
            }
        }
    }

    private void F(int i2, androidx.constraintlayout.widget.d dVar) {
        String c2 = ln2.c(getContext(), i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + c2 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.x(id) == null) {
                Log.w("MotionLayout", "CHECK: " + c2 + " NO CONSTRAINTS for " + ln2.d(childAt));
            }
        }
        int[] z = dVar.z();
        for (int i4 = 0; i4 < z.length; i4++) {
            int i5 = z[i4];
            String c3 = ln2.c(getContext(), i5);
            if (findViewById(z[i4]) == null) {
                Log.w("MotionLayout", "CHECK: " + c2 + " NO View matches id " + c3);
            }
            if (dVar.y(i5) == -1) {
                Log.w("MotionLayout", "CHECK: " + c2 + "(" + c3 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.D(i5) == -1) {
                Log.w("MotionLayout", "CHECK: " + c2 + "(" + c3 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void G(l.b bVar) {
        if (bVar.A() == bVar.y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void H() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            androidx.constraintlayout.motion.widget.j jVar = this.k.get(childAt);
            if (jVar != null) {
                jVar.A(childAt);
            }
        }
    }

    private void K() {
        float f2;
        boolean z;
        float signum = Math.signum(this.q - this.o);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.b;
        if (!(interpolator instanceof kxa)) {
            f2 = ((((float) (nanoTime - this.p)) * signum) * 1.0E-9f) / this.m;
        } else {
            f2 = 0.0f;
        }
        float f3 = this.o + f2;
        if (this.r) {
            f3 = this.q;
        }
        int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i2 > 0 && f3 >= this.q) || (signum <= 0.0f && f3 <= this.q)) {
            f3 = this.q;
            z = true;
        } else {
            z = false;
        }
        if (interpolator != null && !z) {
            if (this.z) {
                f3 = interpolator.getInterpolation(((float) (nanoTime - this.l)) * 1.0E-9f);
            } else {
                f3 = interpolator.getInterpolation(f3);
            }
        }
        if ((i2 > 0 && f3 >= this.q) || (signum <= 0.0f && f3 <= this.q)) {
            f3 = this.q;
        }
        this.u5 = f3;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.c;
        if (interpolator2 != null) {
            f3 = interpolator2.getInterpolation(f3);
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            androidx.constraintlayout.motion.widget.j jVar = this.k.get(childAt);
            if (jVar != null) {
                jVar.u(childAt, f3, nanoTime2, this.v5);
            }
        }
        if (this.n5) {
            requestLayout();
        }
    }

    private void L() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.u != null || ((copyOnWriteArrayList = this.g5) != null && !copyOnWriteArrayList.isEmpty())) && this.l5 != this.n) {
            if (this.k5 != -1) {
                k kVar = this.u;
                if (kVar != null) {
                    kVar.c(this, this.e, this.g);
                }
                CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.g5;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<k> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().c(this, this.e, this.g);
                    }
                }
                this.m5 = true;
            }
            this.k5 = -1;
            float f2 = this.n;
            this.l5 = f2;
            k kVar2 = this.u;
            if (kVar2 != null) {
                kVar2.a(this, this.e, this.g, f2);
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList3 = this.g5;
            if (copyOnWriteArrayList3 != null) {
                Iterator<k> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.e, this.g, this.n);
                }
            }
            this.m5 = true;
        }
    }

    private boolean S(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (S((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f3) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.M5.set(f2, f3, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f3) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.M5.contains(motionEvent.getX(), motionEvent.getY())) && D(view, motionEvent, -f2, -f3)) {
                return true;
            }
        }
        return z;
    }

    private void T(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.l lVar;
        int i2;
        Q5 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.G8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == g29.J8) {
                    this.a = new androidx.constraintlayout.motion.widget.l(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == g29.I8) {
                    this.f = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == g29.L8) {
                    this.q = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.s = true;
                } else if (index == g29.H8) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == g29.M8) {
                    if (this.x == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                        this.x = i2;
                    }
                } else if (index == g29.K8) {
                    this.x = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.a == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.a = null;
            }
        }
        if (this.x != 0) {
            E();
        }
        if (this.f == -1 && (lVar = this.a) != null) {
            this.f = lVar.E();
            this.e = this.a.E();
            this.g = this.a.p();
        }
    }

    private void X() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if (this.u == null && ((copyOnWriteArrayList = this.g5) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.m5 = false;
        Iterator<Integer> it = this.P5.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            k kVar = this.u;
            if (kVar != null) {
                kVar.b(this, next.intValue());
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.g5;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this, next.intValue());
                }
            }
        }
        this.P5.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        float f2;
        float f3;
        int childCount = getChildCount();
        this.K5.a();
        boolean z = true;
        this.s = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            sparseArray.put(childAt.getId(), this.k.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int i4 = this.a.i();
        if (i4 != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                androidx.constraintlayout.motion.widget.j jVar = this.k.get(getChildAt(i5));
                if (jVar != null) {
                    jVar.z(i4);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.k.size()];
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            androidx.constraintlayout.motion.widget.j jVar2 = this.k.get(getChildAt(i7));
            if (jVar2.h() != -1) {
                sparseBooleanArray.put(jVar2.h(), true);
                iArr[i6] = jVar2.h();
                i6++;
            }
        }
        if (this.f5 != null) {
            for (int i8 = 0; i8 < i6; i8++) {
                androidx.constraintlayout.motion.widget.j jVar3 = this.k.get(findViewById(iArr[i8]));
                if (jVar3 != null) {
                    this.a.s(jVar3);
                }
            }
            Iterator<zo6> it = this.f5.iterator();
            while (it.hasNext()) {
                it.next().E(this, this.k);
            }
            for (int i9 = 0; i9 < i6; i9++) {
                androidx.constraintlayout.motion.widget.j jVar4 = this.k.get(findViewById(iArr[i9]));
                if (jVar4 != null) {
                    jVar4.E(width, height, this.m, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < i6; i10++) {
                androidx.constraintlayout.motion.widget.j jVar5 = this.k.get(findViewById(iArr[i10]));
                if (jVar5 != null) {
                    this.a.s(jVar5);
                    jVar5.E(width, height, this.m, getNanoTime());
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            androidx.constraintlayout.motion.widget.j jVar6 = this.k.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && jVar6 != null) {
                this.a.s(jVar6);
                jVar6.E(width, height, this.m, getNanoTime());
            }
        }
        float D = this.a.D();
        if (D != 0.0f) {
            if (D >= 0.0d) {
                z = false;
            }
            float abs = Math.abs(D);
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            float f6 = Float.MAX_VALUE;
            float f7 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                androidx.constraintlayout.motion.widget.j jVar7 = this.k.get(getChildAt(i12));
                if (!Float.isNaN(jVar7.l)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        androidx.constraintlayout.motion.widget.j jVar8 = this.k.get(getChildAt(i13));
                        if (!Float.isNaN(jVar8.l)) {
                            f5 = Math.min(f5, jVar8.l);
                            f4 = Math.max(f4, jVar8.l);
                        }
                    }
                    while (i2 < childCount) {
                        androidx.constraintlayout.motion.widget.j jVar9 = this.k.get(getChildAt(i2));
                        if (!Float.isNaN(jVar9.l)) {
                            jVar9.n = 1.0f / (1.0f - abs);
                            if (z) {
                                jVar9.m = abs - (((f4 - jVar9.l) / (f4 - f5)) * abs);
                            } else {
                                jVar9.m = abs - (((jVar9.l - f5) * abs) / (f4 - f5));
                            }
                        }
                        i2++;
                    }
                    return;
                }
                float n = jVar7.n();
                float o = jVar7.o();
                if (z) {
                    f3 = o - n;
                } else {
                    f3 = o + n;
                }
                f6 = Math.min(f6, f3);
                f7 = Math.max(f7, f3);
            }
            while (i2 < childCount) {
                androidx.constraintlayout.motion.widget.j jVar10 = this.k.get(getChildAt(i2));
                float n2 = jVar10.n();
                float o2 = jVar10.o();
                if (z) {
                    f2 = o2 - n2;
                } else {
                    f2 = o2 + n2;
                }
                jVar10.n = 1.0f / (1.0f - abs);
                jVar10.m = abs - (((f2 - f6) * abs) / (f7 - f6));
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect c0(lr1 lr1Var) {
        this.H5.top = lr1Var.W();
        this.H5.left = lr1Var.V();
        Rect rect = this.H5;
        int U = lr1Var.U();
        Rect rect2 = this.H5;
        rect.right = U + rect2.left;
        int y = lr1Var.y();
        Rect rect3 = this.H5;
        rect2.bottom = y + rect3.top;
        return rect3;
    }

    private static boolean n0(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            if (f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) <= 1.0f) {
                return false;
            }
            return true;
        }
        float f6 = (-f2) / f4;
        if (f3 + (f2 * f6) + (((f4 * f6) * f6) / 2.0f) >= 0.0f) {
            return false;
        }
        return true;
    }

    void C(float f2) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            return;
        }
        float f3 = this.o;
        float f4 = this.n;
        if (f3 != f4 && this.r) {
            this.o = f4;
        }
        float f5 = this.o;
        if (f5 == f2) {
            return;
        }
        this.z = false;
        this.q = f2;
        this.m = lVar.o() / 1000.0f;
        setProgress(this.q);
        this.b = null;
        this.c = this.a.r();
        this.r = false;
        this.l = getNanoTime();
        this.s = true;
        this.n = f5;
        this.o = f5;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            androidx.constraintlayout.motion.widget.j jVar = this.k.get(getChildAt(i2));
            if (jVar != null) {
                jVar.f(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(boolean r23) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.J(boolean):void");
    }

    protected void M() {
        int i2;
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.u != null || ((copyOnWriteArrayList = this.g5) != null && !copyOnWriteArrayList.isEmpty())) && this.k5 == -1) {
            this.k5 = this.f;
            if (!this.P5.isEmpty()) {
                ArrayList<Integer> arrayList = this.P5;
                i2 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i2 = -1;
            }
            int i3 = this.f;
            if (i2 != i3 && i3 != -1) {
                this.P5.add(Integer.valueOf(i3));
            }
        }
        X();
        Runnable runnable = this.y5;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.z5;
        if (iArr != null && this.A5 > 0) {
            h0(iArr[0]);
            int[] iArr2 = this.z5;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.A5--;
        }
    }

    public void N(int i2, boolean z, float f2) {
        k kVar = this.u;
        if (kVar != null) {
            kVar.d(this, i2, z, f2);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.g5;
        if (copyOnWriteArrayList != null) {
            Iterator<k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, i2, z, f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i2, float f2, float f3, float f4, float[] fArr) {
        String resourceName;
        HashMap<View, androidx.constraintlayout.motion.widget.j> hashMap = this.k;
        View viewById = getViewById(i2);
        androidx.constraintlayout.motion.widget.j jVar = hashMap.get(viewById);
        if (jVar != null) {
            jVar.l(f2, f3, f4, fArr);
            float y = viewById.getY();
            this.v = f2;
            this.w = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i2;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i2);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.d P(int i2) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            return null;
        }
        return lVar.k(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.constraintlayout.motion.widget.j Q(int i2) {
        return this.k.get(findViewById(i2));
    }

    public l.b R(int i2) {
        return this.a.F(i2);
    }

    public boolean U() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h V() {
        return i.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            return;
        }
        if (lVar.g(this, this.f)) {
            requestLayout();
            return;
        }
        int i2 = this.f;
        if (i2 != -1) {
            this.a.f(this, i2);
        }
        if (this.a.a0()) {
            this.a.Y();
        }
    }

    public void Y() {
        this.K5.g();
        invalidate();
    }

    public void Z(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.x5 == null) {
                this.x5 = new j();
            }
            this.x5.e(f2);
            this.x5.h(f3);
            return;
        }
        setProgress(f2);
        setState(l.MOVING);
        this.d = f3;
        C(1.0f);
    }

    public void a0(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.x5 == null) {
                this.x5 = new j();
            }
            this.x5.f(i2);
            this.x5.d(i3);
            return;
        }
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            this.e = i2;
            this.g = i3;
            lVar.W(i2, i3);
            this.K5.d(this.mLayoutWidget, this.a.k(i2), this.a.k(i3));
            Y();
            this.o = 0.0f;
            g0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r10 != 7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.d0(int, float, float):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        String e2;
        long j2;
        o oVar;
        ArrayList<zo6> arrayList = this.f5;
        if (arrayList != null) {
            Iterator<zo6> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().D(canvas);
            }
        }
        J(false);
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && (oVar = lVar.s) != null) {
            oVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.a == null) {
            return;
        }
        if ((this.x & 1) == 1 && !isInEditMode()) {
            this.h5++;
            long nanoTime = getNanoTime();
            long j3 = this.i5;
            if (j3 != -1) {
                if (nanoTime - j3 > 200000000) {
                    this.j5 = ((int) ((this.h5 / (((float) j2) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.h5 = 0;
                    this.i5 = nanoTime;
                }
            } else {
                this.i5 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sb = new StringBuilder();
            sb.append(this.j5 + " fps " + ln2.e(this, this.e) + " -> ");
            sb.append(ln2.e(this, this.g));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i2 = this.f;
            if (i2 == -1) {
                e2 = "undefined";
            } else {
                e2 = ln2.e(this, i2);
            }
            sb.append(e2);
            String sb2 = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.x > 1) {
            if (this.y == null) {
                this.y = new f();
            }
            this.y.a(canvas, this.k, this.a.o(), this.x);
        }
        ArrayList<zo6> arrayList2 = this.f5;
        if (arrayList2 != null) {
            Iterator<zo6> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().C(canvas);
            }
        }
    }

    public void e0() {
        C(1.0f);
        this.y5 = null;
    }

    public void f0(Runnable runnable) {
        C(1.0f);
        this.y5 = runnable;
    }

    public void g0() {
        C(0.0f);
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            return null;
        }
        return lVar.m();
    }

    public int getCurrentState() {
        return this.f;
    }

    public ArrayList<l.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            return null;
        }
        return lVar.n();
    }

    public j13 getDesignTool() {
        if (this.I == null) {
            this.I = new j13(this);
        }
        return this.I;
    }

    public int getEndState() {
        return this.g;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.o;
    }

    public int getStartState() {
        return this.e;
    }

    public float getTargetPosition() {
        return this.q;
    }

    public Bundle getTransitionState() {
        if (this.x5 == null) {
            this.x5 = new j();
        }
        this.x5.c();
        return this.x5.b();
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            this.m = lVar.o() / 1000.0f;
        }
        return this.m * 1000.0f;
    }

    public float getVelocity() {
        return this.d;
    }

    public void h0(int i2) {
        if (!isAttachedToWindow()) {
            if (this.x5 == null) {
                this.x5 = new j();
            }
            this.x5.d(i2);
            return;
        }
        i0(i2, -1, -1);
    }

    public void i0(int i2, int i3, int i4) {
        j0(i2, i3, i4, -1);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j0(int i2, int i3, int i4, int i5) {
        dva dvaVar;
        int a2;
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && (dvaVar = lVar.b) != null && (a2 = dvaVar.a(this.f, i2, i3, i4)) != -1) {
            i2 = a2;
        }
        int i6 = this.f;
        if (i6 == i2) {
            return;
        }
        if (this.e == i2) {
            C(0.0f);
            if (i5 > 0) {
                this.m = i5 / 1000.0f;
            }
        } else if (this.g == i2) {
            C(1.0f);
            if (i5 > 0) {
                this.m = i5 / 1000.0f;
            }
        } else {
            this.g = i2;
            if (i6 != -1) {
                a0(i6, i2);
                C(1.0f);
                this.o = 0.0f;
                e0();
                if (i5 > 0) {
                    this.m = i5 / 1000.0f;
                    return;
                }
                return;
            }
            this.z = false;
            this.q = 1.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = getNanoTime();
            this.l = getNanoTime();
            this.r = false;
            this.b = null;
            if (i5 == -1) {
                this.m = this.a.o() / 1000.0f;
            }
            this.e = -1;
            this.a.W(-1, this.g);
            SparseArray sparseArray = new SparseArray();
            if (i5 == 0) {
                this.m = this.a.o() / 1000.0f;
            } else if (i5 > 0) {
                this.m = i5 / 1000.0f;
            }
            int childCount = getChildCount();
            this.k.clear();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                this.k.put(childAt, new androidx.constraintlayout.motion.widget.j(childAt));
                sparseArray.put(childAt.getId(), this.k.get(childAt));
            }
            this.s = true;
            this.K5.d(this.mLayoutWidget, null, this.a.k(i2));
            Y();
            this.K5.a();
            H();
            int width = getWidth();
            int height = getHeight();
            if (this.f5 != null) {
                for (int i8 = 0; i8 < childCount; i8++) {
                    androidx.constraintlayout.motion.widget.j jVar = this.k.get(getChildAt(i8));
                    if (jVar != null) {
                        this.a.s(jVar);
                    }
                }
                Iterator<zo6> it = this.f5.iterator();
                while (it.hasNext()) {
                    it.next().E(this, this.k);
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    androidx.constraintlayout.motion.widget.j jVar2 = this.k.get(getChildAt(i9));
                    if (jVar2 != null) {
                        jVar2.E(width, height, this.m, getNanoTime());
                    }
                }
            } else {
                for (int i10 = 0; i10 < childCount; i10++) {
                    androidx.constraintlayout.motion.widget.j jVar3 = this.k.get(getChildAt(i10));
                    if (jVar3 != null) {
                        this.a.s(jVar3);
                        jVar3.E(width, height, this.m, getNanoTime());
                    }
                }
            }
            float D = this.a.D();
            if (D != 0.0f) {
                float f2 = Float.MAX_VALUE;
                float f3 = -3.4028235E38f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    androidx.constraintlayout.motion.widget.j jVar4 = this.k.get(getChildAt(i11));
                    float o = jVar4.o() + jVar4.n();
                    f2 = Math.min(f2, o);
                    f3 = Math.max(f3, o);
                }
                for (int i12 = 0; i12 < childCount; i12++) {
                    androidx.constraintlayout.motion.widget.j jVar5 = this.k.get(getChildAt(i12));
                    float n = jVar5.n();
                    float o2 = jVar5.o();
                    jVar5.n = 1.0f / (1.0f - D);
                    jVar5.m = D - ((((n + o2) - f2) * D) / (f3 - f2));
                }
            }
            this.n = 0.0f;
            this.o = 0.0f;
            this.s = true;
            invalidate();
        }
    }

    public void k0() {
        this.K5.d(this.mLayoutWidget, this.a.k(this.e), this.a.k(this.g));
        Y();
    }

    public void l0(int i2, androidx.constraintlayout.widget.d dVar) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            lVar.T(i2, dVar);
        }
        k0();
        if (this.f == i2) {
            dVar.i(this);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i2) {
        int rotation;
        l.b bVar;
        if (i2 != 0) {
            try {
                androidx.constraintlayout.motion.widget.l lVar = new androidx.constraintlayout.motion.widget.l(getContext(), this, i2);
                this.a = lVar;
                if (this.f == -1) {
                    this.f = lVar.E();
                    this.e = this.a.E();
                    this.g = this.a.p();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display == null) {
                            rotation = 0;
                        } else {
                            rotation = display.getRotation();
                        }
                        this.G5 = rotation;
                        androidx.constraintlayout.motion.widget.l lVar2 = this.a;
                        if (lVar2 != null) {
                            androidx.constraintlayout.widget.d k2 = lVar2.k(this.f);
                            this.a.S(this);
                            ArrayList<zo6> arrayList = this.f5;
                            if (arrayList != null) {
                                Iterator<zo6> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().B(this);
                                }
                            }
                            if (k2 != null) {
                                k2.i(this);
                            }
                            this.e = this.f;
                        }
                        W();
                        j jVar = this.x5;
                        if (jVar != null) {
                            if (this.I5) {
                                post(new a());
                                return;
                            } else {
                                jVar.a();
                                return;
                            }
                        }
                        androidx.constraintlayout.motion.widget.l lVar3 = this.a;
                        if (lVar3 != null && (bVar = lVar3.c) != null && bVar.x() == 4) {
                            e0();
                            setState(l.SETUP);
                            setState(l.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e2);
                    }
                }
                this.a = null;
                return;
            } catch (Exception e3) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e3);
            }
        }
        this.a = null;
    }

    public void m0(int i2, View... viewArr) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            lVar.b0(i2, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        l.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.G5 = display.getRotation();
        }
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && (i2 = this.f) != -1) {
            androidx.constraintlayout.widget.d k2 = lVar.k(i2);
            this.a.S(this);
            ArrayList<zo6> arrayList = this.f5;
            if (arrayList != null) {
                Iterator<zo6> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().B(this);
                }
            }
            if (k2 != null) {
                k2.i(this);
            }
            this.e = this.f;
        }
        W();
        j jVar = this.x5;
        if (jVar != null) {
            if (this.I5) {
                post(new c());
                return;
            } else {
                jVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.l lVar2 = this.a;
        if (lVar2 != null && (bVar = lVar2.c) != null && bVar.x() == 4) {
            e0();
            setState(l.SETUP);
            setState(l.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m B;
        int q;
        RectF p;
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && this.j) {
            o oVar = lVar.s;
            if (oVar != null) {
                oVar.g(motionEvent);
            }
            l.b bVar = this.a.c;
            if (bVar != null && bVar.C() && (B = bVar.B()) != null && ((motionEvent.getAction() != 0 || (p = B.p(this, new RectF())) == null || p.contains(motionEvent.getX(), motionEvent.getY())) && (q = B.q()) != -1)) {
                View view = this.N5;
                if (view == null || view.getId() != q) {
                    this.N5 = findViewById(q);
                }
                View view2 = this.N5;
                if (view2 != null) {
                    this.M5.set(view2.getLeft(), this.N5.getTop(), this.N5.getRight(), this.N5.getBottom());
                    if (this.M5.contains(motionEvent.getX(), motionEvent.getY()) && !S(this.N5.getLeft(), this.N5.getTop(), this.N5, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.w5 = true;
        try {
            if (this.a == null) {
                super.onLayout(z, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (this.V4 != i6 || this.W4 != i7) {
                Y();
                J(true);
            }
            this.V4 = i6;
            this.W4 = i7;
            this.T4 = i6;
            this.U4 = i7;
        } finally {
            this.w5 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z;
        if (this.a == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (this.h == i2 && this.i == i3) {
            z = false;
        } else {
            z = true;
        }
        if (this.L5) {
            this.L5 = false;
            W();
            X();
            z = true;
        }
        if (this.mDirtyHierarchy) {
            z = true;
        }
        this.h = i2;
        this.i = i3;
        int E = this.a.E();
        int p = this.a.p();
        if ((z || this.K5.e(E, p)) && this.e != -1) {
            super.onMeasure(i2, i3);
            this.K5.d(this.mLayoutWidget, this.a.k(E), this.a.k(p));
            this.K5.g();
            this.K5.h(E, p);
        } else {
            if (z) {
                super.onMeasure(i2, i3);
            }
            z2 = true;
        }
        if (this.n5 || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int U = this.mLayoutWidget.U() + getPaddingLeft() + getPaddingRight();
            int y = this.mLayoutWidget.y() + paddingTop;
            int i4 = this.s5;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.o5;
                U = (int) (i5 + (this.u5 * (this.q5 - i5)));
                requestLayout();
            }
            int i6 = this.t5;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.p5;
                y = (int) (i7 + (this.u5 * (this.r5 - i7)));
                requestLayout();
            }
            setMeasuredDimension(U, y);
        }
        K();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f2, float f3) {
        return false;
    }

    @Override // defpackage.nv6
    public void onNestedPreScroll(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        l.b bVar;
        m B;
        int q;
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && (bVar = lVar.c) != null && bVar.C()) {
            int i5 = -1;
            if (bVar.C() && (B = bVar.B()) != null && (q = B.q()) != -1 && view.getId() != q) {
                return;
            }
            if (lVar.v()) {
                m B2 = bVar.B();
                if (B2 != null && (B2.e() & 4) != 0) {
                    i5 = i3;
                }
                float f2 = this.n;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            if (bVar.B() != null && (bVar.B().e() & 1) != 0) {
                float w = lVar.w(i2, i3);
                float f3 = this.o;
                if ((f3 <= 0.0f && w < 0.0f) || (f3 >= 1.0f && w > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new b(view));
                    return;
                }
            }
            float f4 = this.n;
            long nanoTime = getNanoTime();
            float f5 = i2;
            this.Y4 = f5;
            float f6 = i3;
            this.Z4 = f6;
            this.b5 = (float) ((nanoTime - this.a5) * 1.0E-9d);
            this.a5 = nanoTime;
            lVar.O(f5, f6);
            if (f4 != this.n) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            J(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.X4 = true;
            }
        }
    }

    @Override // defpackage.nv6
    public void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // defpackage.nv6
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i2, int i3) {
        this.a5 = getNanoTime();
        this.b5 = 0.0f;
        this.Y4 = 0.0f;
        this.Z4 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            lVar.V(isRtl());
        }
    }

    @Override // defpackage.nv6
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i2, int i3) {
        l.b bVar;
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && (bVar = lVar.c) != null && bVar.B() != null && (this.a.c.B().e() & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nv6
    public void onStopNestedScroll(@NonNull View view, int i2) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            float f2 = this.b5;
            if (f2 != 0.0f) {
                lVar.P(this.Y4 / f2, this.Z4 / f2);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null && this.j && lVar.a0()) {
            l.b bVar = this.a.c;
            if (bVar != null && !bVar.C()) {
                return super.onTouchEvent(motionEvent);
            }
            this.a.Q(motionEvent, getCurrentState(), this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof zo6) {
            zo6 zo6Var = (zo6) view;
            if (this.g5 == null) {
                this.g5 = new CopyOnWriteArrayList<>();
            }
            this.g5.add(zo6Var);
            if (zo6Var.A()) {
                if (this.d5 == null) {
                    this.d5 = new ArrayList<>();
                }
                this.d5.add(zo6Var);
            }
            if (zo6Var.z()) {
                if (this.e5 == null) {
                    this.e5 = new ArrayList<>();
                }
                this.e5.add(zo6Var);
            }
            if (zo6Var.y()) {
                if (this.f5 == null) {
                    this.f5 = new ArrayList<>();
                }
                this.f5.add(zo6Var);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<zo6> arrayList = this.d5;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<zo6> arrayList2 = this.e5;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.l lVar;
        l.b bVar;
        if (!this.n5 && this.f == -1 && (lVar = this.a) != null && (bVar = lVar.c) != null && bVar.z() == 0) {
            return;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i2) {
        this.x = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.I5 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.j = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.a != null) {
            setState(l.MOVING);
            Interpolator r = this.a.r();
            if (r != null) {
                setProgress(r.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<zo6> arrayList = this.e5;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.e5.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<zo6> arrayList = this.d5;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.d5.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 < 0 || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.x5 == null) {
                this.x5 = new j();
            }
            this.x5.e(f2);
            return;
        }
        if (i2 <= 0) {
            if (this.o == 1.0f && this.f == this.g) {
                setState(l.MOVING);
            }
            this.f = this.e;
            if (this.o == 0.0f) {
                setState(l.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.o == 0.0f && this.f == this.e) {
                setState(l.MOVING);
            }
            this.f = this.g;
            if (this.o == 1.0f) {
                setState(l.FINISHED);
            }
        } else {
            this.f = -1;
            setState(l.MOVING);
        }
        if (this.a == null) {
            return;
        }
        this.r = true;
        this.q = f2;
        this.n = f2;
        this.p = -1L;
        this.l = -1L;
        this.b = null;
        this.s = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.l lVar) {
        this.a = lVar;
        lVar.V(isRtl());
        Y();
    }

    void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.x5 == null) {
                this.x5 = new j();
            }
            this.x5.f(i2);
            this.x5.d(i2);
            return;
        }
        this.f = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(l lVar) {
        l lVar2 = l.FINISHED;
        if (lVar == lVar2 && this.f == -1) {
            return;
        }
        l lVar3 = this.J5;
        this.J5 = lVar;
        l lVar4 = l.MOVING;
        if (lVar3 == lVar4 && lVar == lVar4) {
            L();
        }
        int i2 = d.a[lVar3.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 && lVar == lVar2) {
                M();
                return;
            }
            return;
        }
        if (lVar == lVar4) {
            L();
        }
        if (lVar == lVar2) {
            M();
        }
    }

    public void setTransition(int i2) {
        if (this.a != null) {
            l.b R = R(i2);
            this.e = R.A();
            this.g = R.y();
            if (!isAttachedToWindow()) {
                if (this.x5 == null) {
                    this.x5 = new j();
                }
                this.x5.f(this.e);
                this.x5.d(this.g);
                return;
            }
            int i3 = this.f;
            float f2 = i3 == this.e ? 0.0f : i3 == this.g ? 1.0f : Float.NaN;
            this.a.X(R);
            this.K5.d(this.mLayoutWidget, this.a.k(this.e), this.a.k(this.g));
            Y();
            if (this.o != f2) {
                if (f2 == 0.0f) {
                    I(true);
                    this.a.k(this.e).i(this);
                } else if (f2 == 1.0f) {
                    I(false);
                    this.a.k(this.g).i(this);
                }
            }
            this.o = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                Log.v("MotionLayout", ln2.b() + " transitionToStart ");
                g0();
                return;
            }
            setProgress(f2);
        }
    }

    public void setTransitionDuration(int i2) {
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            lVar.U(i2);
        }
    }

    public void setTransitionListener(k kVar) {
        this.u = kVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.x5 == null) {
            this.x5 = new j();
        }
        this.x5.g(bundle);
        if (isAttachedToWindow()) {
            this.x5.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return ln2.c(context, this.e) + "->" + ln2.c(context, this.g) + " (pos:" + this.o + " Dpos/Dt:" + this.d;
    }

    @Override // defpackage.ov6
    public void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.X4 || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.X4 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i2, int i3, int i4) {
        setState(l.SETUP);
        this.f = i2;
        this.e = -1;
        this.g = -1;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i2, i3, i4);
            return;
        }
        androidx.constraintlayout.motion.widget.l lVar = this.a;
        if (lVar != null) {
            lVar.k(i2).i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransition(l.b bVar) {
        this.a.X(bVar);
        setState(l.SETUP);
        if (this.f == this.a.p()) {
            this.o = 1.0f;
            this.n = 1.0f;
            this.q = 1.0f;
        } else {
            this.o = 0.0f;
            this.n = 0.0f;
            this.q = 0.0f;
        }
        this.p = bVar.D(1) ? -1L : getNanoTime();
        int E = this.a.E();
        int p = this.a.p();
        if (E == this.e && p == this.g) {
            return;
        }
        this.e = E;
        this.g = p;
        this.a.W(E, p);
        this.K5.d(this.mLayoutWidget, this.a.k(this.e), this.a.k(this.g));
        this.K5.h(this.e, this.g);
        this.K5.g();
        Y();
    }
}
