package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bzb;
import defpackage.d4;
import defpackage.i4;
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    bzb a;
    c b;
    private boolean c;
    private boolean e;
    private float d = 0.0f;
    int f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final bzb.c j = new a();

    /* loaded from: classes2.dex */
    class a extends bzb.c {
        private int a;
        private int b = -1;

        a() {
        }

        private boolean n(@NonNull View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (syb.E(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            }
            int left = view.getLeft() - this.a;
            if (Math.abs(left) < Math.round(view.getWidth() * SwipeDismissBehavior.this.g)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.bzb.c
        public int a(@NonNull View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            if (syb.E(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = SwipeDismissBehavior.this.f;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                }
            } else {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            }
            return SwipeDismissBehavior.c(width, i, width2);
        }

        @Override // defpackage.bzb.c
        public int b(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.bzb.c
        public int d(@NonNull View view) {
            return view.getWidth();
        }

        @Override // defpackage.bzb.c
        public void i(@NonNull View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // defpackage.bzb.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // defpackage.bzb.c
        public void k(@NonNull View view, int i, int i2, int i3, int i4) {
            float width = this.a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(0.0f, 1.0f - SwipeDismissBehavior.e(width, width2, f), 1.0f));
            }
        }

        @Override // defpackage.bzb.c
        public void l(@NonNull View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.L(i, view.getTop())) {
                syb.m0(view, new d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.b) != null) {
                cVar.a(view);
            }
        }

        @Override // defpackage.bzb.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements i4 {
        b() {
        }

        @Override // defpackage.i4
        public boolean a(@NonNull View view, i4.a aVar) {
            int width;
            boolean z = false;
            if (!SwipeDismissBehavior.this.a(view)) {
                return false;
            }
            if (syb.E(view) == 1) {
                z = true;
            }
            int i = SwipeDismissBehavior.this.f;
            if ((i == 0 && z) || (i == 1 && !z)) {
                width = -view.getWidth();
            } else {
                width = view.getWidth();
            }
            syb.e0(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);

        void b(int i);
    }

    /* loaded from: classes2.dex */
    private class d implements Runnable {
        private final View a;
        private final boolean b;

        d(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            bzb bzbVar = SwipeDismissBehavior.this.a;
            if (bzbVar != null && bzbVar.m(true)) {
                syb.m0(this.a, this);
            } else if (this.b && (cVar = SwipeDismissBehavior.this.b) != null) {
                cVar.a(this.a);
            }
        }
    }

    static float b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void d(ViewGroup viewGroup) {
        bzb o;
        if (this.a == null) {
            if (this.e) {
                o = bzb.n(viewGroup, this.d, this.j);
            } else {
                o = bzb.o(viewGroup, this.j);
            }
            this.a = o;
        }
    }

    static float e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void j(View view) {
        syb.o0(view, 1048576);
        if (a(view)) {
            syb.q0(view, d4.a.y, null, new b());
        }
    }

    public boolean a(@NonNull View view) {
        return true;
    }

    public void f(float f) {
        this.i = b(0.0f, f, 1.0f);
    }

    public void g(c cVar) {
        this.b = cVar;
    }

    public void h(float f) {
        this.h = b(0.0f, f, 1.0f);
    }

    public void i(int i) {
        this.f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        } else {
            z = coordinatorLayout.v(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        }
        if (!z) {
            return false;
        }
        d(coordinatorLayout);
        return this.a.M(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (syb.C(v) == 0) {
            syb.F0(v, 1);
            j(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        bzb bzbVar = this.a;
        if (bzbVar != null) {
            bzbVar.E(motionEvent);
            return true;
        }
        return false;
    }
}
