package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.y;
import defpackage.x4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class l extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    Context a;
    private Context b;
    private Activity c;
    ActionBarOverlayLayout d;
    ActionBarContainer e;
    so2 f;
    ActionBarContextView g;
    View h;
    y i;
    private boolean l;
    d m;
    x4 n;
    x4.a o;
    private boolean p;
    private boolean r;
    boolean u;
    boolean v;
    private boolean w;
    k0c y;
    private boolean z;
    private ArrayList<Object> j = new ArrayList<>();
    private int k = -1;
    private ArrayList<a.b> q = new ArrayList<>();
    private int s = 0;
    boolean t = true;
    private boolean x = true;
    final l0c B = new a();
    final l0c C = new b();
    final n0c D = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class a extends m0c {
        a() {
        }

        @Override // defpackage.l0c
        public void b(View view) {
            View view2;
            l lVar = l.this;
            if (lVar.t && (view2 = lVar.h) != null) {
                view2.setTranslationY(0.0f);
                l.this.e.setTranslationY(0.0f);
            }
            l.this.e.setVisibility(8);
            l.this.e.setTransitioning(false);
            l lVar2 = l.this;
            lVar2.y = null;
            lVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = l.this.d;
            if (actionBarOverlayLayout != null) {
                syb.r0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class b extends m0c {
        b() {
        }

        @Override // defpackage.l0c
        public void b(View view) {
            l lVar = l.this;
            lVar.y = null;
            lVar.e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class c implements n0c {
        c() {
        }

        @Override // defpackage.n0c
        public void a(View view) {
            ((View) l.this.e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends x4 implements e.a {
        private final Context c;
        private final androidx.appcompat.view.menu.e d;
        private x4.a e;
        private WeakReference<View> f;

        public d(Context context, x4.a aVar) {
            this.c = context;
            this.e = aVar;
            androidx.appcompat.view.menu.e W = new androidx.appcompat.view.menu.e(context).W(1);
            this.d = W;
            W.V(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            x4.a aVar = this.e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (this.e == null) {
                return;
            }
            k();
            l.this.g.l();
        }

        @Override // defpackage.x4
        public void c() {
            l lVar = l.this;
            if (lVar.m != this) {
                return;
            }
            if (!l.A(lVar.u, lVar.v, false)) {
                l lVar2 = l.this;
                lVar2.n = this;
                lVar2.o = this.e;
            } else {
                this.e.b(this);
            }
            this.e = null;
            l.this.z(false);
            l.this.g.g();
            l lVar3 = l.this;
            lVar3.d.setHideOnContentScrollEnabled(lVar3.A);
            l.this.m = null;
        }

        @Override // defpackage.x4
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.x4
        public Menu e() {
            return this.d;
        }

        @Override // defpackage.x4
        public MenuInflater f() {
            return new r2b(this.c);
        }

        @Override // defpackage.x4
        public CharSequence g() {
            return l.this.g.getSubtitle();
        }

        @Override // defpackage.x4
        public CharSequence i() {
            return l.this.g.getTitle();
        }

        @Override // defpackage.x4
        public void k() {
            if (l.this.m != this) {
                return;
            }
            this.d.h0();
            try {
                this.e.d(this, this.d);
            } finally {
                this.d.g0();
            }
        }

        @Override // defpackage.x4
        public boolean l() {
            return l.this.g.j();
        }

        @Override // defpackage.x4
        public void m(View view) {
            l.this.g.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // defpackage.x4
        public void n(int i) {
            o(l.this.a.getResources().getString(i));
        }

        @Override // defpackage.x4
        public void o(CharSequence charSequence) {
            l.this.g.setSubtitle(charSequence);
        }

        @Override // defpackage.x4
        public void q(int i) {
            r(l.this.a.getResources().getString(i));
        }

        @Override // defpackage.x4
        public void r(CharSequence charSequence) {
            l.this.g.setTitle(charSequence);
        }

        @Override // defpackage.x4
        public void s(boolean z) {
            super.s(z);
            l.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.d.h0();
            try {
                return this.e.c(this, this.d);
            } finally {
                this.d.g0();
            }
        }
    }

    public l(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(16908290);
    }

    static boolean A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (!z && !z2) {
            return true;
        }
        return false;
    }

    private so2 E(View view) {
        String str;
        if (view instanceof so2) {
            return (so2) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    private void G() {
        if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            Q(false);
        }
    }

    private void H(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ay8.q);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = E(view.findViewById(ay8.a));
        this.g = (ActionBarContextView) view.findViewById(ay8.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ay8.c);
        this.e = actionBarContainer;
        so2 so2Var = this.f;
        if (so2Var != null && this.g != null && actionBarContainer != null) {
            this.a = so2Var.getContext();
            if ((this.f.x() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.l = true;
            }
            v4 b2 = v4.b(this.a);
            if (!b2.a() && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            N(z2);
            L(b2.g());
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, n29.a, aw8.c, 0);
            if (obtainStyledAttributes.getBoolean(n29.k, false)) {
                M(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n29.i, 0);
            if (dimensionPixelSize != 0) {
                K(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void L(boolean z) {
        boolean z2;
        boolean z3;
        this.r = z;
        if (!z) {
            this.f.s(null);
            this.e.setTabContainer(this.i);
        } else {
            this.e.setTabContainer(null);
            this.f.s(this.i);
        }
        boolean z4 = true;
        if (F() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        y yVar = this.i;
        if (yVar != null) {
            if (z2) {
                yVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    syb.r0(actionBarOverlayLayout);
                }
            } else {
                yVar.setVisibility(8);
            }
        }
        so2 so2Var = this.f;
        if (!this.r && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        so2Var.q(z3);
        this.d.setHasNonEmbeddedTabs((this.r || !z2) ? false : false);
    }

    private boolean O() {
        return syb.Y(this.e);
    }

    private void P() {
        if (!this.w) {
            this.w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            Q(false);
        }
    }

    private void Q(boolean z) {
        if (A(this.u, this.v, this.w)) {
            if (!this.x) {
                this.x = true;
                D(z);
            }
        } else if (this.x) {
            this.x = false;
            C(z);
        }
    }

    void B() {
        x4.a aVar = this.o;
        if (aVar != null) {
            aVar.b(this.n);
            this.n = null;
            this.o = null;
        }
    }

    public void C(boolean z) {
        View view;
        int[] iArr;
        k0c k0cVar = this.y;
        if (k0cVar != null) {
            k0cVar.a();
        }
        if (this.s == 0 && (this.z || z)) {
            this.e.setAlpha(1.0f);
            this.e.setTransitioning(true);
            k0c k0cVar2 = new k0c();
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            j0c m = syb.e(this.e).m(f);
            m.k(this.D);
            k0cVar2.c(m);
            if (this.t && (view = this.h) != null) {
                k0cVar2.c(syb.e(view).m(f));
            }
            k0cVar2.f(E);
            k0cVar2.e(250L);
            k0cVar2.g(this.B);
            this.y = k0cVar2;
            k0cVar2.h();
            return;
        }
        this.B.b(null);
    }

    public void D(boolean z) {
        View view;
        View view2;
        int[] iArr;
        k0c k0cVar = this.y;
        if (k0cVar != null) {
            k0cVar.a();
        }
        this.e.setVisibility(0);
        if (this.s == 0 && (this.z || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.e.setTranslationY(f);
            k0c k0cVar2 = new k0c();
            j0c m = syb.e(this.e).m(0.0f);
            m.k(this.D);
            k0cVar2.c(m);
            if (this.t && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                k0cVar2.c(syb.e(this.h).m(0.0f));
            }
            k0cVar2.f(F);
            k0cVar2.e(250L);
            k0cVar2.g(this.C);
            this.y = k0cVar2;
            k0cVar2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.t && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            syb.r0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f.l();
    }

    public void I(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        J(i, 4);
    }

    public void J(int i, int i2) {
        int x = this.f.x();
        if ((i2 & 4) != 0) {
            this.l = true;
        }
        this.f.j((i & i2) | ((~i2) & x));
    }

    public void K(float f) {
        syb.C0(this.e, f);
    }

    public void M(boolean z) {
        if (z && !this.d.q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    public void N(boolean z) {
        this.f.o(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.v) {
            this.v = false;
            Q(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b(int i) {
        this.s = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z) {
        this.t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (!this.v) {
            this.v = true;
            Q(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        k0c k0cVar = this.y;
        if (k0cVar != null) {
            k0cVar.a();
            this.y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        so2 so2Var = this.f;
        if (so2Var != null && so2Var.i()) {
            this.f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.p) {
            return;
        }
        this.p = z;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            this.q.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f.x();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(aw8.g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        L(v4.b(this.a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i, KeyEvent keyEvent) {
        Menu e;
        int i2;
        d dVar = this.m;
        if (dVar == null || (e = dVar.e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(Drawable drawable) {
        this.e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        if (!this.l) {
            I(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void t(int i) {
        this.f.u(i);
    }

    @Override // androidx.appcompat.app.a
    public void u(Drawable drawable) {
        this.f.z(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z) {
        k0c k0cVar;
        this.z = z;
        if (!z && (k0cVar = this.y) != null) {
            k0cVar.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public x4 y(x4.a aVar) {
        d dVar = this.m;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), aVar);
        if (dVar2.t()) {
            this.m = dVar2;
            dVar2.k();
            this.g.h(dVar2);
            z(true);
            return dVar2;
        }
        return null;
    }

    public void z(boolean z) {
        j0c m;
        j0c f;
        if (z) {
            P();
        } else {
            G();
        }
        if (O()) {
            if (z) {
                f = this.f.m(4, 100L);
                m = this.g.f(0, 200L);
            } else {
                m = this.f.m(0, 200L);
                f = this.g.f(8, 100L);
            }
            k0c k0cVar = new k0c();
            k0cVar.d(f, m);
            k0cVar.h();
        } else if (z) {
            this.f.w(4);
            this.g.setVisibility(0);
        } else {
            this.f.w(0);
            this.g.setVisibility(8);
        }
    }

    public l(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }
}
