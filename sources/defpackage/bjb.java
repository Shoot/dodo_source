package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TooltipCompatHandler.java */
/* renamed from: bjb  reason: default package */
/* loaded from: classes.dex */
public class bjb implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static bjb k;
    private static bjb l;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d = new Runnable() { // from class: zib
        @Override // java.lang.Runnable
        public final void run() {
            bjb.this.e();
        }
    };
    private final Runnable e = new Runnable() { // from class: ajb
        @Override // java.lang.Runnable
        public final void run() {
            bjb.this.d();
        }
    };
    private int f;
    private int g;
    private djb h;
    private boolean i;
    private boolean j;

    private bjb(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.c = yyb.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.a.removeCallbacks(this.d);
    }

    private void c() {
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.a.postDelayed(this.d, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(bjb bjbVar) {
        bjb bjbVar2 = k;
        if (bjbVar2 != null) {
            bjbVar2.b();
        }
        k = bjbVar;
        if (bjbVar != null) {
            bjbVar.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        bjb bjbVar = k;
        if (bjbVar != null && bjbVar.a == view) {
            g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            bjb bjbVar2 = l;
            if (bjbVar2 != null && bjbVar2.a == view) {
                bjbVar2.d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new bjb(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.j && Math.abs(x - this.f) <= this.c && Math.abs(y - this.g) <= this.c) {
            return false;
        }
        this.f = x;
        this.g = y;
        this.j = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (l == this) {
            l = null;
            djb djbVar = this.h;
            if (djbVar != null) {
                djbVar.c();
                this.h = null;
                c();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            g(null);
        }
        this.a.removeCallbacks(this.e);
    }

    void i(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (!syb.X(this.a)) {
            return;
        }
        g(null);
        bjb bjbVar = l;
        if (bjbVar != null) {
            bjbVar.d();
        }
        l = this;
        this.i = z;
        djb djbVar = new djb(this.a.getContext());
        this.h = djbVar;
        djbVar.e(this.a, this.f, this.g, this.i, this.b);
        this.a.addOnAttachStateChangeListener(this);
        if (this.i) {
            j2 = 2500;
        } else {
            if ((syb.Q(this.a) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.a.removeCallbacks(this.e);
        this.a.postDelayed(this.e, j2);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h != null && this.i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.a.isEnabled() && this.h == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
