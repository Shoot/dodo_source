package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: CustomViewTarget.java */
/* renamed from: l42  reason: default package */
/* loaded from: classes.dex */
public abstract class l42<T extends View, Z> implements n6b<Z> {
    private static final int f = tx8.glide_custom_view_target_tag;
    private final a a;
    protected final T b;
    private View.OnAttachStateChangeListener c;
    private boolean d;
    private boolean e;

    /* compiled from: CustomViewTarget.java */
    /* renamed from: l42$a */
    /* loaded from: classes.dex */
    static final class a {
        static Integer e;
        private final View a;
        private final List<kna> b = new ArrayList();
        boolean c;
        private ViewTreeObserver$OnPreDrawListenerC0423a d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CustomViewTarget.java */
        /* renamed from: l42$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0423a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> a;

            ViewTreeObserver$OnPreDrawListenerC0423a(@NonNull a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        a(@NonNull View view) {
            this.a = view;
        }

        private static int c(@NonNull Context context) {
            if (e == null) {
                Display defaultDisplay = ((WindowManager) eh8.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.a.getContext());
        }

        private int f() {
            int i;
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return e(this.a.getHeight(), i, paddingTop);
        }

        private int g() {
            int i;
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return e(this.a.getWidth(), i, paddingLeft);
        }

        private boolean h(int i) {
            if (i <= 0 && i != Integer.MIN_VALUE) {
                return false;
            }
            return true;
        }

        private boolean i(int i, int i2) {
            if (h(i) && h(i2)) {
                return true;
            }
            return false;
        }

        private void j(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((kna) it.next()).d(i, i2);
            }
        }

        void a() {
            if (this.b.isEmpty()) {
                return;
            }
            int g = g();
            int f = f();
            if (!i(g, f)) {
                return;
            }
            j(g, f);
            b();
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        void d(@NonNull kna knaVar) {
            int g = g();
            int f = f();
            if (i(g, f)) {
                knaVar.d(g, f);
                return;
            }
            if (!this.b.contains(knaVar)) {
                this.b.add(knaVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0423a viewTreeObserver$OnPreDrawListenerC0423a = new ViewTreeObserver$OnPreDrawListenerC0423a(this);
                this.d = viewTreeObserver$OnPreDrawListenerC0423a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0423a);
            }
        }

        void k(@NonNull kna knaVar) {
            this.b.remove(knaVar);
        }
    }

    public l42(@NonNull T t) {
        this.b = (T) eh8.d(t);
        this.a = new a(t);
    }

    private Object e() {
        return this.b.getTag(f);
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener != null && !this.e) {
            this.b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.e = true;
        }
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener != null && this.e) {
            this.b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.e = false;
        }
    }

    private void o(Object obj) {
        this.b.setTag(f, obj);
    }

    @Override // defpackage.n6b
    public final void a(Drawable drawable) {
        f();
        n(drawable);
    }

    @Override // defpackage.n6b
    public final void c(@NonNull kna knaVar) {
        this.a.d(knaVar);
    }

    @Override // defpackage.n6b
    public final ii9 h() {
        Object e = e();
        if (e != null) {
            if (e instanceof ii9) {
                return (ii9) e;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.n6b
    public final void i(Drawable drawable) {
        this.a.b();
        m(drawable);
        if (!this.d) {
            k();
        }
    }

    @Override // defpackage.n6b
    public final void j(ii9 ii9Var) {
        o(ii9Var);
    }

    @Override // defpackage.n6b
    public final void l(@NonNull kna knaVar) {
        this.a.k(knaVar);
    }

    protected abstract void m(Drawable drawable);

    public String toString() {
        return "Target for: " + this.b;
    }

    @Override // defpackage.mp5
    public void g() {
    }

    @Override // defpackage.mp5
    public void onDestroy() {
    }

    @Override // defpackage.mp5
    public void onStart() {
    }

    protected void n(Drawable drawable) {
    }
}
