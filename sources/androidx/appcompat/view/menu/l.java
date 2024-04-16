package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {
    private static final int v = xz8.o;
    private final Context b;
    private final e c;
    private final d d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    final mg6 i;
    private PopupWindow.OnDismissListener l;
    private View m;
    View n;
    private j.a o;
    ViewTreeObserver p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean u;
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new b();
    private int t = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (l.this.b() && !l.this.i.B()) {
                View view = l.this.n;
                if (view != null && view.isShown()) {
                    l.this.i.c();
                } else {
                    l.this.dismiss();
                }
            }
        }
    }

    public l(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.b = context;
        this.c = eVar;
        this.e = z;
        this.d = new d(eVar, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xw8.d));
        this.m = view;
        this.i = new mg6(context, null, i, i2);
        eVar.c(this, context);
    }

    private boolean B() {
        View view;
        boolean z;
        if (b()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.K(this);
        this.i.L(this);
        this.i.J(true);
        View view2 = this.n;
        if (this.p == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.D(view2);
        this.i.G(this.t);
        if (!this.r) {
            this.s = h.q(this.d, null, this.b, this.f);
            this.r = true;
        }
        this.i.F(this.s);
        this.i.I(2);
        this.i.H(o());
        this.i.c();
        ListView p = this.i.p();
        p.setOnKeyListener(this);
        if (this.u && this.c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(xz8.n, (ViewGroup) p, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.c.z());
            }
            frameLayout.setEnabled(false);
            p.addHeaderView(frameLayout, null, false);
        }
        this.i.n(this.d);
        this.i.c();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        if (eVar != this.c) {
            return;
        }
        dismiss();
        j.a aVar = this.o;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // defpackage.eka
    public boolean b() {
        if (!this.q && this.i.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.eka
    public void c() {
        if (B()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.eka
    public void dismiss() {
        if (b()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.o = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.b, mVar, this.n, this.e, this.g, this.h);
            iVar.j(this.o);
            iVar.g(h.z(mVar));
            iVar.i(this.l);
            this.l = null;
            this.c.e(false);
            int d = this.i.d();
            int m = this.i.m();
            if ((Gravity.getAbsoluteGravity(this.t, syb.E(this.m)) & 7) == 5) {
                d += this.m.getWidth();
            }
            if (iVar.n(d, m)) {
                j.a aVar = this.o;
                if (aVar != null) {
                    aVar.b(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        this.r = false;
        d dVar = this.d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.eka
    public ListView p() {
        return this.i.p();
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(View view) {
        this.m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z) {
        this.d.d(z);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i) {
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i) {
        this.i.f(i);
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z) {
        this.u = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i) {
        this.i.j(i);
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.p.removeGlobalOnLayoutListener(lVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
    }
}
