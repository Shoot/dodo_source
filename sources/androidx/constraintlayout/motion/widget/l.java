package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public class l {
    private final MotionLayout a;
    private MotionEvent n;
    private MotionLayout.h q;
    private boolean r;
    final o s;
    float t;
    float u;
    dva b = null;
    b c = null;
    private boolean d = false;
    private ArrayList<b> e = new ArrayList<>();
    private b f = null;
    private ArrayList<b> g = new ArrayList<>();
    private SparseArray<androidx.constraintlayout.widget.d> h = new SparseArray<>();
    private HashMap<String, Integer> i = new HashMap<>();
    private SparseIntArray j = new SparseIntArray();
    private boolean k = false;
    private int l = 400;
    private int m = 0;
    private boolean o = false;
    private boolean p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MotionScene.java */
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
    public l(Context context, MotionLayout motionLayout, int i) {
        this.a = motionLayout;
        this.s = new o(motionLayout);
        J(context, i);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.h;
        int i2 = py8.motion_base;
        sparseArray.put(i2, new androidx.constraintlayout.widget.d());
        this.i.put("motion_base", Integer.valueOf(i2));
    }

    private boolean H(int i) {
        int i2 = this.j.get(i);
        int size = this.j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.j.get(i2);
            size = i3;
        }
        return false;
    }

    private boolean I() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void J(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            if (this.k) {
                                PrintStream printStream = System.out;
                                printStream.println("parsing = " + name);
                            }
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1239391468:
                                    if (name.equals("KeyFrameSet")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -687739768:
                                    if (name.equals("Include")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 61998586:
                                    if (name.equals("ViewTransition")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 269306229:
                                    if (name.equals("Transition")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 312750793:
                                    if (name.equals("OnClick")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 327855227:
                                    if (name.equals("OnSwipe")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 793277014:
                                    if (name.equals("MotionScene")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1942574248:
                                    if (name.equals("include")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    N(context, xml);
                                    continue;
                                case 1:
                                    ArrayList<b> arrayList = this.e;
                                    bVar = new b(this, context, xml);
                                    arrayList.add(bVar);
                                    if (this.c == null && !bVar.b) {
                                        this.c = bVar;
                                        if (bVar.l != null) {
                                            this.c.l.w(this.r);
                                        }
                                    }
                                    if (bVar.b) {
                                        if (bVar.c == -1) {
                                            this.f = bVar;
                                        } else {
                                            this.g.add(bVar);
                                        }
                                        this.e.remove(bVar);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 2:
                                    if (bVar == null) {
                                        String resourceEntryName = context.getResources().getResourceEntryName(i);
                                        int lineNumber = xml.getLineNumber();
                                        Log.v("MotionScene", " OnSwipe (" + resourceEntryName + ".xml:" + lineNumber + ")");
                                    }
                                    if (bVar != null) {
                                        bVar.l = new m(context, this.a, xml);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 3:
                                    if (bVar != null) {
                                        bVar.u(context, xml);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 4:
                                    this.b = new dva(context, xml);
                                    continue;
                                case 5:
                                    K(context, xml);
                                    continue;
                                case 6:
                                case 7:
                                    M(context, xml);
                                    continue;
                                case '\b':
                                    d dVar = new d(context, xml);
                                    if (bVar != null) {
                                        bVar.k.add(dVar);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case '\t':
                                    this.s.a(new n(context, xml));
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r8.equals("deriveConstraintsFrom") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int K(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.d r0 = new androidx.constraintlayout.widget.d
            r0.<init>()
            r1 = 0
            r0.S(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L11:
            r7 = 1
            if (r4 >= r2) goto L8a
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.k
            if (r10 == 0) goto L36
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L36:
            r8.hashCode()
            int r10 = r8.hashCode()
            switch(r10) {
                case -1995929160: goto L56;
                case -1496482599: goto L4d;
                case 3355: goto L42;
                default: goto L40;
            }
        L40:
            r7 = -1
            goto L60
        L42:
            java.lang.String r7 = "id"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L4b
            goto L40
        L4b:
            r7 = 2
            goto L60
        L4d:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L60
            goto L40
        L56:
            java.lang.String r7 = "ConstraintRotate"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L5f
            goto L40
        L5f:
            r7 = 0
        L60:
            switch(r7) {
                case 0: goto L81;
                case 1: goto L7c;
                case 2: goto L64;
                default: goto L63;
            }
        L63:
            goto L87
        L64:
            int r5 = r13.q(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.i
            java.lang.String r8 = Z(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = defpackage.ln2.c(r14, r5)
            r0.b = r7
            goto L87
        L7c:
            int r6 = r13.q(r14, r9)
            goto L87
        L81:
            int r7 = java.lang.Integer.parseInt(r9)
            r0.d = r7
        L87:
            int r4 = r4 + 1
            goto L11
        L8a:
            if (r5 == r3) goto La4
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.a
            int r1 = r1.x
            if (r1 == 0) goto L95
            r0.T(r7)
        L95:
            r0.F(r14, r15)
            if (r6 == r3) goto L9f
            android.util.SparseIntArray r14 = r13.j
            r14.put(r5, r6)
        L9f:
            android.util.SparseArray<androidx.constraintlayout.widget.d> r14 = r13.h
            r14.put(r5, r0)
        La4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.l.K(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return K(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private void M(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.Ha);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == g29.Ia) {
                L(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.N8);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == g29.O8) {
                int i2 = obtainStyledAttributes.getInt(index, this.l);
                this.l = i2;
                if (i2 < 8) {
                    this.l = 8;
                }
            } else if (index == g29.P8) {
                this.m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void R(int i, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.d dVar = this.h.get(i);
        dVar.c = dVar.b;
        int i2 = this.j.get(i);
        if (i2 > 0) {
            R(i2, motionLayout);
            androidx.constraintlayout.widget.d dVar2 = this.h.get(i2);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + ln2.c(this.a.getContext(), i2));
                return;
            }
            dVar.c += "/" + dVar2.c;
            dVar.N(dVar2);
        } else {
            dVar.c += "  layout";
            dVar.M(motionLayout);
        }
        dVar.h(dVar);
    }

    public static String Z(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    private int q(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.k) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i;
        }
        return i;
    }

    private int x(int i) {
        int c;
        dva dvaVar = this.b;
        if (dvaVar != null && (c = dvaVar.c(i, -1, -1)) != -1) {
            return c;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float A() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.m();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float B() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.n();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float C() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.o();
        }
        return 0.0f;
    }

    public float D() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.i;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int E() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.d;
        }
        return -1;
    }

    public b F(int i) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i) {
                return next;
            }
        }
        return null;
    }

    public List<b> G(int i) {
        int x = x(i);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == x || next.c == x) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(float f, float f2) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.t(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(float f, float f2) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.u(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.h hVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.q == null) {
            this.q = this.a.V();
        }
        this.q.a(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action != 0) {
                if (action == 2 && !this.o) {
                    float rawY = motionEvent.getRawY() - this.u;
                    float rawX = motionEvent.getRawX() - this.t;
                    if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.n) == null) {
                        return;
                    }
                    b h = h(i, rawX, rawY, motionEvent2);
                    if (h != null) {
                        motionLayout.setTransition(h);
                        RectF p = this.c.l.p(this.a, rectF);
                        if (p != null && !p.contains(this.n.getX(), this.n.getY())) {
                            z = true;
                        }
                        this.p = z;
                        this.c.l.x(this.t, this.u);
                    }
                }
            } else {
                this.t = motionEvent.getRawX();
                this.u = motionEvent.getRawY();
                this.n = motionEvent;
                this.o = false;
                if (this.c.l != null) {
                    RectF f = this.c.l.f(this.a, rectF);
                    if (f != null && !f.contains(this.n.getX(), this.n.getY())) {
                        this.n = null;
                        this.o = true;
                        return;
                    }
                    RectF p2 = this.c.l.p(this.a, rectF);
                    if (p2 != null && !p2.contains(this.n.getX(), this.n.getY())) {
                        this.p = true;
                    } else {
                        this.p = false;
                    }
                    this.c.l.v(this.t, this.u);
                    return;
                }
                return;
            }
        }
        if (this.o) {
            return;
        }
        b bVar = this.c;
        if (bVar != null && bVar.l != null && !this.p) {
            this.c.l.r(motionEvent, this.q, i, this);
        }
        this.t = motionEvent.getRawX();
        this.u = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (hVar = this.q) != null) {
            hVar.b();
            this.q = null;
            int i2 = motionLayout.f;
            if (i2 != -1) {
                g(motionLayout, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(MotionLayout motionLayout) {
        for (int i = 0; i < this.h.size(); i++) {
            int keyAt = this.h.keyAt(i);
            if (H(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            R(keyAt, motionLayout);
        }
    }

    public void T(int i, androidx.constraintlayout.widget.d dVar) {
        this.h.put(i, dVar);
    }

    public void U(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.E(i);
        } else {
            this.l = i;
        }
    }

    public void V(boolean z) {
        this.r = z;
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.w(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(int r7, int r8) {
        /*
            r6 = this;
            dva r0 = r6.b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.c(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            dva r2 = r6.b
            int r2 = r2.c(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.l$b r3 = r6.c
            if (r3 == 0) goto L2d
            int r3 = androidx.constraintlayout.motion.widget.l.b.a(r3)
            if (r3 != r8) goto L2d
            androidx.constraintlayout.motion.widget.l$b r3 = r6.c
            int r3 = androidx.constraintlayout.motion.widget.l.b.c(r3)
            if (r3 != r7) goto L2d
            return
        L2d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.l$b> r3 = r6.e
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.l$b r4 = (androidx.constraintlayout.motion.widget.l.b) r4
            int r5 = androidx.constraintlayout.motion.widget.l.b.a(r4)
            if (r5 != r2) goto L4b
            int r5 = androidx.constraintlayout.motion.widget.l.b.c(r4)
            if (r5 == r0) goto L57
        L4b:
            int r5 = androidx.constraintlayout.motion.widget.l.b.a(r4)
            if (r5 != r8) goto L33
            int r5 = androidx.constraintlayout.motion.widget.l.b.c(r4)
            if (r5 != r7) goto L33
        L57:
            r6.c = r4
            if (r4 == 0) goto L6c
            androidx.constraintlayout.motion.widget.m r7 = androidx.constraintlayout.motion.widget.l.b.l(r4)
            if (r7 == 0) goto L6c
            androidx.constraintlayout.motion.widget.l$b r7 = r6.c
            androidx.constraintlayout.motion.widget.m r7 = androidx.constraintlayout.motion.widget.l.b.l(r7)
            boolean r8 = r6.r
            r7.w(r8)
        L6c:
            return
        L6d:
            androidx.constraintlayout.motion.widget.l$b r7 = r6.f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.l$b> r3 = r6.g
            java.util.Iterator r3 = r3.iterator()
        L75:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.l$b r4 = (androidx.constraintlayout.motion.widget.l.b) r4
            int r5 = androidx.constraintlayout.motion.widget.l.b.a(r4)
            if (r5 != r8) goto L75
            r7 = r4
            goto L75
        L89:
            androidx.constraintlayout.motion.widget.l$b r8 = new androidx.constraintlayout.motion.widget.l$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.l.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.l.b.b(r8, r2)
            if (r0 == r1) goto L9b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.l$b> r7 = r6.e
            r7.add(r8)
        L9b:
            r6.c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.l.W(int, int):void");
    }

    public void X(b bVar) {
        this.c = bVar;
        if (bVar != null && bVar.l != null) {
            this.c.l.w(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return true;
        }
        return false;
    }

    public void b0(int i, View... viewArr) {
        this.s.h(i, viewArr);
    }

    public void f(MotionLayout motionLayout, int i) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.m.size() > 0) {
                Iterator it2 = next.m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.m.size() > 0) {
                Iterator it4 = next2.m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.m.size() > 0) {
                Iterator it6 = next3.m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, i, next3);
                }
            }
        }
        Iterator<b> it7 = this.g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.m.size() > 0) {
                Iterator it8 = next4.m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, i, next4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(MotionLayout motionLayout, int i) {
        b bVar;
        if (I() || this.d) {
            return false;
        }
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.n != 0 && ((bVar = this.c) != next || !bVar.D(2))) {
                if (i == next.d && (next.n == 4 || next.n == 2)) {
                    MotionLayout.l lVar = MotionLayout.l.FINISHED;
                    motionLayout.setState(lVar);
                    motionLayout.setTransition(next);
                    if (next.n == 4) {
                        motionLayout.e0();
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.J(true);
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                        motionLayout.setState(lVar);
                        motionLayout.W();
                    }
                    return true;
                } else if (i == next.c && (next.n == 3 || next.n == 1)) {
                    MotionLayout.l lVar2 = MotionLayout.l.FINISHED;
                    motionLayout.setState(lVar2);
                    motionLayout.setTransition(next);
                    if (next.n == 3) {
                        motionLayout.g0();
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.J(true);
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                        motionLayout.setState(lVar2);
                        motionLayout.W();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i, float f, float f2, MotionEvent motionEvent) {
        float f3;
        if (i != -1) {
            List<b> G = G(i);
            RectF rectF = new RectF();
            float f4 = 0.0f;
            b bVar = null;
            for (b bVar2 : G) {
                if (!bVar2.o && bVar2.l != null) {
                    bVar2.l.w(this.r);
                    RectF p = bVar2.l.p(this.a, rectF);
                    if (p == null || motionEvent == null || p.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF f5 = bVar2.l.f(this.a, rectF);
                        if (f5 == null || motionEvent == null || f5.contains(motionEvent.getX(), motionEvent.getY())) {
                            float a2 = bVar2.l.a(f, f2);
                            if (bVar2.l.l && motionEvent != null) {
                                float x = motionEvent.getX() - bVar2.l.i;
                                float y = motionEvent.getY() - bVar2.l.j;
                                a2 = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                            }
                            if (bVar2.c == i) {
                                f3 = -1.0f;
                            } else {
                                f3 = 1.1f;
                            }
                            float f6 = a2 * f3;
                            if (f6 > f4) {
                                bVar = bVar2;
                                f4 = f6;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.c;
    }

    public int i() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.p;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.d();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.constraintlayout.widget.d k(int i) {
        return l(i, -1, -1);
    }

    androidx.constraintlayout.widget.d l(int i, int i2, int i3) {
        int c;
        if (this.k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            printStream.println("size " + this.h.size());
        }
        dva dvaVar = this.b;
        if (dvaVar != null && (c = dvaVar.c(i, i2, i3)) != -1) {
            i = c;
        }
        if (this.h.get(i) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + ln2.c(this.a.getContext(), i) + " In MotionScene");
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.h;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.h.get(i);
    }

    public int[] m() {
        int size = this.h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.h.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<b> n() {
        return this.e;
    }

    public int o() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.h;
        }
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c;
        }
        return -1;
    }

    public Interpolator r() {
        int i = this.c.e;
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
            return new a(yb3.c(this.c.f));
        }
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    public void s(j jVar) {
        b bVar = this.c;
        if (bVar == null) {
            b bVar2 = this.f;
            if (bVar2 != null) {
                Iterator it = bVar2.k.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b(jVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.k.iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).b(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.g();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float u() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.h();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.i();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float w(float f, float f2) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.j(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int y() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.k();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float z() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.l();
        }
        return 0.0f;
    }

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public static class b {
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private String f;
        private int g;
        private int h;
        private float i;
        private final l j;
        private ArrayList<d> k;
        private m l;
        private ArrayList<a> m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private int r;

        /* compiled from: MotionScene.java */
        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {
            private final b a;
            int b;
            int c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.b = -1;
                this.c = 17;
                this.a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.R8);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == g29.T8) {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                    } else if (index == g29.S8) {
                        this.c = obtainStyledAttributes.getInt(index, this.c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void a(MotionLayout motionLayout, int i, b bVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.b;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 != null) {
                    int i3 = bVar.d;
                    int i4 = bVar.c;
                    if (i3 == -1) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    int i5 = this.c;
                    boolean z5 = false;
                    if ((i5 & 1) != 0 && i == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i5 & 256) != 0 && i == i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z6 = z | z2;
                    if ((i5 & 1) != 0 && i == i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z7 = z3 | z6;
                    if ((i5 & 16) != 0 && i == i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z8 = z7 | z4;
                    if ((i5 & 4096) != 0 && i == i4) {
                        z5 = true;
                    }
                    if (z8 | z5) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                Log.e("MotionScene", "OnClick could not find id " + this.b);
            }

            boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.a;
                if (bVar2 != bVar) {
                    int i = bVar2.c;
                    int i2 = this.a.d;
                    if (i2 == -1) {
                        if (motionLayout.f != i) {
                            return true;
                        }
                        return false;
                    }
                    int i3 = motionLayout.f;
                    if (i3 == i2 || i3 == i) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            public void c(MotionLayout motionLayout) {
                int i = this.b;
                if (i == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i);
                if (findViewById == null) {
                    Log.e("MotionScene", " (*)  could not find id " + this.b);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z;
                boolean z2;
                MotionLayout motionLayout = this.a.j.a;
                if (!motionLayout.U()) {
                    return;
                }
                if (this.a.d == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.h0(this.a.c);
                        return;
                    }
                    b bVar = new b(this.a.j, this.a);
                    bVar.d = currentState;
                    bVar.c = this.a.c;
                    motionLayout.setTransition(bVar);
                    motionLayout.e0();
                    return;
                }
                b bVar2 = this.a.j.c;
                int i = this.c;
                boolean z3 = false;
                if ((i & 1) == 0 && (i & 256) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i & 16) == 0 && (i & 4096) == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    b bVar3 = this.a.j.c;
                    b bVar4 = this.a;
                    if (bVar3 != bVar4) {
                        motionLayout.setTransition(bVar4);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z3 = z;
                        z2 = false;
                    }
                } else {
                    z3 = z;
                }
                if (b(bVar2, motionLayout)) {
                    if (z3 && (this.c & 1) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.e0();
                    } else if (z2 && (this.c & 16) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.g0();
                    } else if (z3 && (this.c & 256) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.setProgress(1.0f);
                    } else if (z2 && (this.c & 4096) != 0) {
                        motionLayout.setTransition(this.a);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        b(l lVar, b bVar) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = lVar;
            this.h = lVar.l;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        private void v(l lVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == g29.Z9) {
                    this.c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.E(context, this.c);
                        lVar.h.append(this.c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = lVar.L(context, this.c);
                    }
                } else if (index == g29.aa) {
                    this.d = typedArray.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.E(context, this.d);
                        lVar.h.append(this.d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = lVar.L(context, this.d);
                    }
                } else if (index == g29.da) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = typedArray.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArray.getInteger(index, this.e);
                    }
                } else if (index == g29.ba) {
                    int i3 = typedArray.getInt(index, this.h);
                    this.h = i3;
                    if (i3 < 8) {
                        this.h = 8;
                    }
                } else if (index == g29.fa) {
                    this.i = typedArray.getFloat(index, this.i);
                } else if (index == g29.Y9) {
                    this.n = typedArray.getInteger(index, this.n);
                } else if (index == g29.X9) {
                    this.a = typedArray.getResourceId(index, this.a);
                } else if (index == g29.ga) {
                    this.o = typedArray.getBoolean(index, this.o);
                } else if (index == g29.ea) {
                    this.p = typedArray.getInteger(index, -1);
                } else if (index == g29.ca) {
                    this.q = typedArray.getInteger(index, 0);
                } else if (index == g29.ha) {
                    this.r = typedArray.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
        }

        private void w(l lVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.W9);
            v(lVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.d;
        }

        public m B() {
            return this.l;
        }

        public boolean C() {
            return !this.o;
        }

        public boolean D(int i) {
            if ((i & this.r) != 0) {
                return true;
            }
            return false;
        }

        public void E(int i) {
            this.h = Math.max(i, 8);
        }

        public void F(int i, String str, int i2) {
            this.e = i;
            this.f = str;
            this.g = i2;
        }

        public void G(int i) {
            this.p = i;
        }

        public void t(d dVar) {
            this.k.add(dVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new a(context, this, xmlPullParser));
        }

        public int x() {
            return this.n;
        }

        public int y() {
            return this.c;
        }

        public int z() {
            return this.q;
        }

        public b(int i, l lVar, int i2, int i3) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = i;
            this.j = lVar;
            this.d = i2;
            this.c = i3;
            this.h = lVar.l;
            this.q = lVar.m;
        }

        b(l lVar, Context context, XmlPullParser xmlPullParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = lVar.l;
            this.q = lVar.m;
            this.j = lVar;
            w(lVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
