package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class f0 implements so2 {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        final w4 a;

        a() {
            this.a = new w4(f0.this.a.getContext(), 0, 16908332, 0, 0, f0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0 f0Var = f0.this;
            Window.Callback callback = f0Var.l;
            if (callback != null && f0Var.m) {
                callback.onMenuItemSelected(0, this.a);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class b extends m0c {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        @Override // defpackage.m0c, defpackage.l0c
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.l0c
        public void b(View view) {
            if (!this.a) {
                f0.this.a.setVisibility(this.b);
            }
        }

        @Override // defpackage.m0c, defpackage.l0c
        public void c(View view) {
            f0.this.a.setVisibility(0);
        }
    }

    public f0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h19.a, px8.n);
    }

    private int A() {
        if (this.a.getNavigationIcon() != null) {
            this.q = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void H(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                syb.x0(this.a.getRootView(), charSequence);
            }
        }
    }

    private void I() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void J() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void K() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.f;
                if (drawable == null) {
                    drawable = this.e;
                }
            } else {
                drawable = this.e;
            }
        } else {
            drawable = null;
        }
        this.a.setLogo(drawable);
    }

    public void B(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void C(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            E(this.p);
        }
    }

    public void D(Drawable drawable) {
        this.f = drawable;
        K();
    }

    public void E(int i) {
        String string;
        if (i == 0) {
            string = null;
        } else {
            string = getContext().getString(i);
        }
        F(string);
    }

    public void F(CharSequence charSequence) {
        this.k = charSequence;
        I();
    }

    public void G(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // defpackage.so2
    public void a(Drawable drawable) {
        syb.y0(this.a, drawable);
    }

    @Override // defpackage.so2
    public boolean b() {
        return this.a.d();
    }

    @Override // defpackage.so2
    public boolean c() {
        return this.a.w();
    }

    @Override // defpackage.so2
    public void collapseActionView() {
        this.a.e();
    }

    @Override // defpackage.so2
    public boolean d() {
        return this.a.Q();
    }

    @Override // defpackage.so2
    public void e(Menu menu, j.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.s(ay8.g);
        }
        this.n.e(aVar);
        this.a.K((androidx.appcompat.view.menu.e) menu, this.n);
    }

    @Override // defpackage.so2
    public boolean f() {
        return this.a.B();
    }

    @Override // defpackage.so2
    public void g() {
        this.m = true;
    }

    @Override // defpackage.so2
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.so2
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.so2
    public boolean h() {
        return this.a.A();
    }

    @Override // defpackage.so2
    public boolean i() {
        return this.a.v();
    }

    @Override // defpackage.so2
    public void j(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    I();
                }
                J();
            }
            if ((i2 & 3) != 0) {
                K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.d) != null) {
                if ((i & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // defpackage.so2
    public Menu k() {
        return this.a.getMenu();
    }

    @Override // defpackage.so2
    public int l() {
        return this.o;
    }

    @Override // defpackage.so2
    public j0c m(int i, long j) {
        float f;
        j0c e = syb.e(this.a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return e.b(f).f(j).h(new b(i));
    }

    @Override // defpackage.so2
    public ViewGroup n() {
        return this.a;
    }

    @Override // defpackage.so2
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.so2
    public void q(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // defpackage.so2
    public void r() {
        this.a.f();
    }

    @Override // defpackage.so2
    public void s(y yVar) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = yVar;
        if (yVar != null && this.o == 2) {
            this.a.addView(yVar, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.a = 8388691;
            yVar.setAllowCollapse(true);
        }
    }

    @Override // defpackage.so2
    public void setIcon(int i) {
        setIcon(i != 0 ? on.b(getContext(), i) : null);
    }

    @Override // defpackage.so2
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        H(charSequence);
    }

    @Override // defpackage.so2
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // defpackage.so2
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            H(charSequence);
        }
    }

    @Override // defpackage.so2
    public void t(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = on.b(getContext(), i);
        } else {
            drawable = null;
        }
        D(drawable);
    }

    @Override // defpackage.so2
    public void u(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = on.b(getContext(), i);
        } else {
            drawable = null;
        }
        z(drawable);
    }

    @Override // defpackage.so2
    public void v(j.a aVar, e.a aVar2) {
        this.a.L(aVar, aVar2);
    }

    @Override // defpackage.so2
    public void w(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.so2
    public int x() {
        return this.b;
    }

    @Override // defpackage.so2
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.so2
    public void z(Drawable drawable) {
        this.g = drawable;
        J();
    }

    public f0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        e0 v = e0.v(toolbar.getContext(), null, n29.a, aw8.c, 0);
        this.q = v.g(n29.l);
        if (z) {
            CharSequence p = v.p(n29.r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.p(n29.p);
            if (!TextUtils.isEmpty(p2)) {
                G(p2);
            }
            Drawable g = v.g(n29.n);
            if (g != null) {
                D(g);
            }
            Drawable g2 = v.g(n29.m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                z(drawable);
            }
            j(v.k(n29.h, 0));
            int n = v.n(n29.g, 0);
            if (n != 0) {
                B(LayoutInflater.from(this.a.getContext()).inflate(n, (ViewGroup) this.a, false));
                j(this.b | 16);
            }
            int m = v.m(n29.j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m;
                this.a.setLayoutParams(layoutParams);
            }
            int e = v.e(n29.f, -1);
            int e2 = v.e(n29.e, -1);
            if (e >= 0 || e2 >= 0) {
                this.a.J(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.n(n29.s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.N(toolbar2.getContext(), n2);
            }
            int n3 = v.n(n29.q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.M(toolbar3.getContext(), n3);
            }
            int n4 = v.n(n29.o, 0);
            if (n4 != 0) {
                this.a.setPopupTheme(n4);
            }
        } else {
            this.b = A();
        }
        v.w();
        C(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // defpackage.so2
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        K();
    }

    @Override // defpackage.so2
    public void o(boolean z) {
    }
}
