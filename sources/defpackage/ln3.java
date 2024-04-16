package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import defpackage.m24;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExploreByTouchHelper.java */
/* renamed from: ln3  reason: default package */
/* loaded from: classes.dex */
public abstract class ln3 extends s2 {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final m24.a<d4> o = new a();
    private static final m24.b<cra<d4>, d4> p = new b();
    private final AccessibilityManager h;
    private final View i;
    private c j;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: ln3$a */
    /* loaded from: classes.dex */
    class a implements m24.a<d4> {
        a() {
        }

        @Override // defpackage.m24.a
        /* renamed from: b */
        public void a(d4 d4Var, Rect rect) {
            d4Var.m(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: ln3$b */
    /* loaded from: classes.dex */
    class b implements m24.b<cra<d4>, d4> {
        b() {
        }

        @Override // defpackage.m24.b
        /* renamed from: c */
        public d4 a(cra<d4> craVar, int i) {
            return craVar.o(i);
        }

        @Override // defpackage.m24.b
        /* renamed from: d */
        public int b(cra<d4> craVar) {
            return craVar.n();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: ln3$c */
    /* loaded from: classes.dex */
    private class c extends g4 {
        c() {
        }

        @Override // defpackage.g4
        public d4 b(int i) {
            return d4.a0(ln3.this.J(i));
        }

        @Override // defpackage.g4
        public d4 d(int i) {
            int i2;
            if (i == 2) {
                i2 = ln3.this.k;
            } else {
                i2 = ln3.this.l;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // defpackage.g4
        public boolean f(int i, int i2, Bundle bundle) {
            return ln3.this.R(i, i2, bundle);
        }
    }

    public ln3(@NonNull View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (syb.C(view) == 0) {
                syb.F0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(@NonNull View view, int i, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    private boolean G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private static int H(int i) {
        if (i != 19) {
            if (i != 21) {
                if (i != 22) {
                    return 130;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean I(int i, Rect rect) {
        d4 g;
        boolean z;
        d4 d4Var;
        cra<d4> y = y();
        int i2 = this.l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            g = null;
        } else {
            g = y.g(i2);
        }
        d4 d4Var2 = g;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            d4Var = (d4) m24.c(y, p, o, d4Var2, rect2, i);
        } else {
            if (syb.E(this.i) == 1) {
                z = true;
            } else {
                z = false;
            }
            d4Var = (d4) m24.d(y, p, o, d4Var2, i, z, false);
        }
        if (d4Var != null) {
            i3 = y.l(y.j(d4Var));
        }
        return V(i3);
    }

    private boolean S(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return L(i, i2, bundle);
                    }
                    return n(i);
                }
                return U(i);
            }
            return o(i);
        }
        return V(i);
    }

    private boolean T(int i, Bundle bundle) {
        return syb.j0(this.i, i, bundle);
    }

    private boolean U(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.k = i;
        this.i.invalidate();
        W(i, 32768);
        return true;
    }

    private void X(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        W(i, 128);
        W(i2, 256);
    }

    private boolean n(int i) {
        if (this.k == i) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            W(i, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i = this.l;
        if (i != Integer.MIN_VALUE && L(i, 16, null)) {
            return true;
        }
        return false;
    }

    private AccessibilityEvent q(int i, int i2) {
        if (i != -1) {
            return r(i, i2);
        }
        return s(i2);
    }

    private AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        d4 J = J(i);
        obtain.getText().add(J.B());
        obtain.setContentDescription(J.t());
        obtain.setScrollable(J.V());
        obtain.setPassword(J.T());
        obtain.setEnabled(J.N());
        obtain.setChecked(J.H());
        N(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(J.p());
        h4.c(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @NonNull
    private d4 t(int i) {
        boolean z;
        d4 Z = d4.Z();
        Z.v0(true);
        Z.x0(true);
        Z.n0("android.view.View");
        Rect rect = n;
        Z.i0(rect);
        Z.j0(rect);
        Z.J0(this.i);
        P(i, Z);
        if (Z.B() == null && Z.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Z.m(this.e);
        if (!this.e.equals(rect)) {
            int k = Z.k();
            if ((k & 64) == 0) {
                if ((k & 128) == 0) {
                    Z.H0(this.i.getContext().getPackageName());
                    Z.S0(this.i, i);
                    if (this.k == i) {
                        Z.g0(true);
                        Z.a(128);
                    } else {
                        Z.g0(false);
                        Z.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Z.a(2);
                    } else if (Z.O()) {
                        Z.a(1);
                    }
                    Z.y0(z);
                    this.i.getLocationOnScreen(this.g);
                    Z.n(this.d);
                    if (this.d.equals(rect)) {
                        Z.m(this.d);
                        if (Z.b != -1) {
                            d4 Z2 = d4.Z();
                            for (int i2 = Z.b; i2 != -1; i2 = Z2.b) {
                                Z2.K0(this.i, -1);
                                Z2.i0(n);
                                P(i2, Z2);
                                Z2.m(this.e);
                                Rect rect2 = this.d;
                                Rect rect3 = this.e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            Z2.d0();
                        }
                        this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    }
                    if (this.i.getLocalVisibleRect(this.f)) {
                        this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                        if (this.d.intersect(this.f)) {
                            Z.j0(this.d);
                            if (G(this.d)) {
                                Z.b1(true);
                            }
                        }
                    }
                    return Z;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    @NonNull
    private d4 u() {
        d4 b0 = d4.b0(this.i);
        syb.h0(this.i, b0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (b0.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b0.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return b0;
    }

    private cra<d4> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        cra<d4> craVar = new cra<>();
        for (int i = 0; i < arrayList.size(); i++) {
            craVar.m(arrayList.get(i).intValue(), t(arrayList.get(i).intValue()));
        }
        return craVar;
    }

    private void z(int i, Rect rect) {
        J(i).m(rect);
    }

    public final int A() {
        return this.l;
    }

    protected abstract int B(float f, float f2);

    protected abstract void C(List<Integer> list);

    public final void E(int i) {
        F(i, 0);
    }

    public final void F(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.h.isEnabled() && (parent = this.i.getParent()) != null) {
            AccessibilityEvent q = q(i, 2048);
            t2.b(q, i2);
            parent.requestSendAccessibilityEvent(this.i, q);
        }
    }

    @NonNull
    d4 J(int i) {
        if (i == -1) {
            return u();
        }
        return t(i);
    }

    public final void K(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            I(i, rect);
        }
    }

    protected abstract boolean L(int i, int i2, Bundle bundle);

    protected abstract void P(int i, @NonNull d4 d4Var);

    boolean R(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return S(i, i2, bundle);
        }
        return T(i2, bundle);
    }

    public final boolean V(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        Q(i, true);
        W(i, 8);
        return true;
    }

    public final boolean W(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    @Override // defpackage.s2
    public g4 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.s2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        M(accessibilityEvent);
    }

    @Override // defpackage.s2
    public void g(View view, d4 d4Var) {
        super.g(view, d4Var);
        O(d4Var);
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        Q(i, false);
        W(i, 8);
        return true;
    }

    public final boolean v(@NonNull MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.m == Integer.MIN_VALUE) {
                return false;
            }
            X(Integer.MIN_VALUE);
            return true;
        }
        int B = B(motionEvent.getX(), motionEvent.getY());
        X(B);
        if (B == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean w(@NonNull KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int H = H(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && I(H, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return I(2, null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return I(1, null);
        }
    }

    public final int x() {
        return this.k;
    }

    protected void M(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void O(@NonNull d4 d4Var) {
    }

    protected void N(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void Q(int i, boolean z) {
    }
}
