package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.motion.widget.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public class n {
    private static String w = "ViewTransition";
    private int a;
    int e;
    d f;
    d.a g;
    private int j;
    private String k;
    Context o;
    private int b = -1;
    private boolean c = false;
    private int d = 0;
    private int h = -1;
    private int i = -1;
    private int l = 0;
    private String m = null;
    private int n = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private int u = -1;
    private int v = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTransition.java */
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
    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    public static class b {
        private final int a;
        private final int b;
        long c;
        j d;
        int e;
        int f;
        o h;
        Interpolator i;
        float k;
        float l;
        long m;
        boolean o;
        ue5 g = new ue5();
        boolean j = false;
        Rect n = new Rect();

        b(o oVar, j jVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.o = false;
            this.h = oVar;
            this.d = jVar;
            this.e = i;
            this.f = i2;
            long nanoTime = System.nanoTime();
            this.c = nanoTime;
            this.m = nanoTime;
            this.h.b(this);
            this.i = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.l = f;
            a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            if (this.j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.m = nanoTime;
            float f = this.k + (((float) ((nanoTime - this.m) * 1.0E-6d)) * this.l);
            this.k = f;
            if (f >= 1.0f) {
                this.k = 1.0f;
            }
            Interpolator interpolator = this.i;
            if (interpolator == null) {
                interpolation = this.k;
            } else {
                interpolation = interpolator.getInterpolation(this.k);
            }
            float f2 = interpolation;
            j jVar = this.d;
            boolean u = jVar.u(jVar.b, f2, nanoTime, this.g);
            if (this.k >= 1.0f) {
                if (this.a != -1) {
                    this.d.s().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.s().setTag(this.b, null);
                }
                if (!this.o) {
                    this.h.f(this);
                }
            }
            if (this.k < 1.0f || u) {
                this.h.d();
            }
        }

        void c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.m = nanoTime;
            float f = this.k - (((float) ((nanoTime - this.m) * 1.0E-6d)) * this.l);
            this.k = f;
            if (f < 0.0f) {
                this.k = 0.0f;
            }
            Interpolator interpolator = this.i;
            if (interpolator == null) {
                interpolation = this.k;
            } else {
                interpolation = interpolator.getInterpolation(this.k);
            }
            float f2 = interpolation;
            j jVar = this.d;
            boolean u = jVar.u(jVar.b, f2, nanoTime, this.g);
            if (this.k <= 0.0f) {
                if (this.a != -1) {
                    this.d.s().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.s().setTag(this.b, null);
                }
                this.h.f(this);
            }
            if (this.k > 0.0f || u) {
                this.h.d();
            }
        }

        public void d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.d.s().getHitRect(this.n);
                    if (!this.n.contains((int) f, (int) f2) && !this.j) {
                        e(true);
                    }
                }
            } else if (!this.j) {
                e(true);
            }
        }

        void e(boolean z) {
            int i;
            float f;
            this.j = z;
            if (z && (i = this.f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i;
                }
                this.l = f;
            }
            this.h.d();
            this.m = System.nanoTime();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context, XmlPullParser xmlPullParser) {
        char c;
        this.o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3 && c != 4) {
                                    String str = w;
                                    Log.e(str, ln2.a() + " unknown tag " + name);
                                    String str2 = w;
                                    Log.e(str2, ".xml:" + xmlPullParser.getLineNumber());
                                } else {
                                    androidx.constraintlayout.widget.a.i(context, xmlPullParser, this.g.g);
                                }
                            } else {
                                this.g = androidx.constraintlayout.widget.d.m(context, xmlPullParser);
                            }
                        } else {
                            this.f = new d(context, xmlPullParser);
                        }
                    } else {
                        l(context, xmlPullParser);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View[] viewArr) {
        if (this.p != -1) {
            for (View view : viewArr) {
                view.setTag(this.p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.q, null);
            }
        }
    }

    private void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.ra);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == g29.sa) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == g29.Aa) {
                if (MotionLayout.Q5) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == g29.Ba) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == g29.Ea) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == g29.Ca) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == g29.wa) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == g29.Fa) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == g29.Ga) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == g29.za) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    } else {
                        this.l = -1;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == g29.Da) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == g29.va) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == g29.ya) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == g29.xa) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == g29.ua) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == g29.ta) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void n(l.b bVar, View view) {
        int i = this.h;
        if (i != -1) {
            bVar.E(i);
        }
        bVar.G(this.d);
        bVar.F(this.l, this.m, this.n);
        int id = view.getId();
        d dVar = this.f;
        if (dVar != null) {
            ArrayList<androidx.constraintlayout.motion.widget.a> d = dVar.d(-1);
            d dVar2 = new d();
            Iterator<androidx.constraintlayout.motion.widget.a> it = d.iterator();
            while (it.hasNext()) {
                dVar2.c(it.next().clone().h(id));
            }
            bVar.t(dVar2);
        }
    }

    void b(o oVar, MotionLayout motionLayout, View view) {
        j jVar = new j(view);
        jVar.x(view);
        this.f.a(jVar);
        jVar.E(motionLayout.getWidth(), motionLayout.getHeight(), this.h, System.nanoTime());
        new b(oVar, jVar, this.h, this.i, this.b, f(motionLayout.getContext()), this.p, this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(o oVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.d dVar, final View... viewArr) {
        int[] constraintSetIds;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        if (i2 == 2) {
            b(oVar, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    androidx.constraintlayout.widget.d P = motionLayout.P(i3);
                    for (View view : viewArr) {
                        d.a x = P.x(view.getId());
                        d.a aVar = this.g;
                        if (aVar != null) {
                            aVar.d(x);
                            x.g.putAll(this.g.g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        dVar2.q(dVar);
        for (View view2 : viewArr) {
            d.a x2 = dVar2.x(view2.getId());
            d.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.d(x2);
                x2.g.putAll(this.g.g);
            }
        }
        motionLayout.l0(i, dVar2);
        int i4 = py8.view_transition;
        motionLayout.l0(i4, dVar);
        motionLayout.setState(i4, -1, -1);
        l.b bVar = new l.b(-1, motionLayout.a, i4, i);
        for (View view3 : viewArr) {
            n(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.f0(new Runnable() { // from class: t0c
            @Override // java.lang.Runnable
            public final void run() {
                n.this.j(viewArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(View view) {
        boolean z;
        boolean z2;
        int i = this.r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.a;
    }

    Interpolator f(Context context) {
        int i = this.l;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
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
            return new a(yb3.c(this.m));
        }
        return AnimationUtils.loadInterpolator(context, this.n);
    }

    public int g() {
        return this.t;
    }

    public int h() {
        return this.u;
    }

    public int i() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k == null || !(view.getLayoutParams() instanceof ConstraintLayout.b) || (str = ((ConstraintLayout.b) view.getLayoutParams()).b0) == null || !str.matches(this.k)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m(int i) {
        int i2 = this.b;
        if (i2 == 1) {
            if (i != 0) {
                return false;
            }
            return true;
        } else if (i2 == 2) {
            if (i != 1) {
                return false;
            }
            return true;
        } else if (i2 != 3 || i != 0) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "ViewTransition(" + ln2.c(this.o, this.a) + ")";
    }
}
