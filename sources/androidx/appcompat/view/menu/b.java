package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = xz8.g;
    boolean A;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    final Handler g;
    private View o;
    View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private j.a x;
    ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;
    private final List<e> h = new ArrayList();
    final List<d> i = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new View$OnAttachStateChangeListenerC0010b();
    private final ge6 l = new c();
    private int m = 0;
    private int n = 0;
    private boolean v = false;
    private int q = F();

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (b.this.b() && b.this.i.size() > 0 && !b.this.i.get(0).a.B()) {
                View view = b.this.p;
                if (view != null && view.isShown()) {
                    for (d dVar : b.this.i) {
                        dVar.a.c();
                    }
                    return;
                }
                b.this.dismiss();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class c implements ge6 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ d a;
            final /* synthetic */ MenuItem b;
            final /* synthetic */ e c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.a = dVar;
                this.b = menuItem;
                this.c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.N(this.b, 4);
                }
            }
        }

        c() {
        }

        @Override // defpackage.ge6
        public void e(@NonNull e eVar, @NonNull MenuItem menuItem) {
            d dVar = null;
            b.this.g.removeCallbacksAndMessages(null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (eVar == b.this.i.get(i).b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < b.this.i.size()) {
                dVar = b.this.i.get(i2);
            }
            b.this.g.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.ge6
        public void o(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class d {
        public final mg6 a;
        public final e b;
        public final int c;

        public d(@NonNull mg6 mg6Var, @NonNull e eVar, int i) {
            this.a = mg6Var;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.p();
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xw8.d));
        this.g = new Handler();
    }

    private mg6 B() {
        mg6 mg6Var = new mg6(this.b, null, this.d, this.e);
        mg6Var.T(this.l);
        mg6Var.L(this);
        mg6Var.K(this);
        mg6Var.D(this.o);
        mg6Var.G(this.n);
        mg6Var.J(true);
        mg6Var.I(2);
        return mg6Var;
    }

    private int C(@NonNull e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.i.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem D(@NonNull e eVar, @NonNull e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(@NonNull d dVar, @NonNull e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i;
        int firstVisiblePosition;
        MenuItem D = D(dVar.b, eVar);
        if (D == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 < count) {
                if (D == dVar2.getItem(i2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    private int F() {
        if (syb.E(this.o) != 1) {
            return 1;
        }
        return 0;
    }

    private int G(int i) {
        List<d> list = this.i;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            if (iArr[0] + a2.getWidth() + i <= rect.right) {
                return 1;
            }
            return 0;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void H(@NonNull e eVar) {
        d dVar;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f, B);
        if (!b() && this.v) {
            dVar2.d(true);
        } else if (b()) {
            dVar2.d(h.z(eVar));
        }
        int q = h.q(dVar2, null, this.b, this.c);
        mg6 B2 = B();
        B2.n(dVar2);
        B2.F(q);
        B2.G(this.n);
        if (this.i.size() > 0) {
            List<d> list = this.i;
            dVar = list.get(list.size() - 1);
            view = E(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B2.U(false);
            B2.R(null);
            int G = G(q);
            if (G == 1) {
                z = true;
            } else {
                z = false;
            }
            this.q = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B2.D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.n & 7) == 5) {
                    iArr[0] = iArr[0] + this.o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.n & 5) == 5) {
                if (!z) {
                    q = view.getWidth();
                    i3 = i - q;
                }
                i3 = i + q;
            } else {
                if (z) {
                    q = view.getWidth();
                    i3 = i + q;
                }
                i3 = i - q;
            }
            B2.f(i3);
            B2.M(true);
            B2.j(i2);
        } else {
            if (this.r) {
                B2.f(this.t);
            }
            if (this.s) {
                B2.j(this.u);
            }
            B2.H(o());
        }
        this.i.add(new d(B2, eVar, this.q));
        B2.c();
        ListView p = B2.p();
        p.setOnKeyListener(this);
        if (dVar == null && this.w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(xz8.n, (ViewGroup) p, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.z());
            p.addHeaderView(frameLayout, null, false);
            B2.c();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        int C = C(eVar);
        if (C < 0) {
            return;
        }
        int i = C + 1;
        if (i < this.i.size()) {
            this.i.get(i).b.e(false);
        }
        d remove = this.i.remove(C);
        remove.b.Q(this);
        if (this.A) {
            remove.a.S(null);
            remove.a.E(0);
        }
        remove.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = this.i.get(size - 1).c;
        } else {
            this.q = F();
        }
        if (size == 0) {
            dismiss();
            j.a aVar = this.x;
            if (aVar != null) {
                aVar.a(eVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.y.removeGlobalOnLayoutListener(this.j);
                }
                this.y = null;
            }
            this.p.removeOnAttachStateChangeListener(this.k);
            this.z.onDismiss();
        } else if (z) {
            this.i.get(0).b.e(false);
        }
    }

    @Override // defpackage.eka
    public boolean b() {
        if (this.i.size() <= 0 || !this.i.get(0).a.b()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.eka
    public void c() {
        boolean z;
        if (b()) {
            return;
        }
        for (e eVar : this.h) {
            H(eVar);
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            if (this.y == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // defpackage.eka
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        for (d dVar : this.i) {
            if (mVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            m(mVar);
            j.a aVar = this.x;
            if (aVar != null) {
                aVar.b(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        for (d dVar : this.i) {
            h.A(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
        eVar.c(this, this.b);
        if (b()) {
            H(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean n() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i < size) {
                dVar = this.i.get(i);
                if (!dVar.a.b()) {
                    break;
                }
                i++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.i.isEmpty()) {
            return null;
        }
        List<d> list = this.i;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(@NonNull View view) {
        if (this.o != view) {
            this.o = view;
            this.n = ii4.b(this.m, syb.E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = ii4.b(i, syb.E(this.o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i) {
        this.s = true;
        this.u = i;
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0010b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0010b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
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
}
