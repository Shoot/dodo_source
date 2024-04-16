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
/* compiled from: ViewTarget.java */
@Deprecated
/* renamed from: r0c  reason: default package */
/* loaded from: classes.dex */
public abstract class r0c<T extends View, Z> extends k80<Z> {
    private static boolean g;
    private static int h = tx8.glide_custom_view_target_tag;
    protected final T b;
    private final a c;
    private View.OnAttachStateChangeListener d;
    private boolean e;
    private boolean f;

    /* compiled from: ViewTarget.java */
    /* renamed from: r0c$a */
    /* loaded from: classes.dex */
    static final class a {
        static Integer e;
        private final View a;
        private final List<kna> b = new ArrayList();
        boolean c;
        private ViewTreeObserver$OnPreDrawListenerC0494a d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ViewTarget.java */
        /* renamed from: r0c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0494a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> a;

            ViewTreeObserver$OnPreDrawListenerC0494a(@NonNull a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
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
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
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
                ViewTreeObserver$OnPreDrawListenerC0494a viewTreeObserver$OnPreDrawListenerC0494a = new ViewTreeObserver$OnPreDrawListenerC0494a(this);
                this.d = viewTreeObserver$OnPreDrawListenerC0494a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0494a);
            }
        }

        void k(@NonNull kna knaVar) {
            this.b.remove(knaVar);
        }
    }

    public r0c(@NonNull T t) {
        this.b = (T) eh8.d(t);
        this.c = new a(t);
    }

    private Object k() {
        return this.b.getTag(h);
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener != null && !this.f) {
            this.b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f = true;
        }
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener != null && this.f) {
            this.b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f = false;
        }
    }

    private void o(Object obj) {
        g = true;
        this.b.setTag(h, obj);
    }

    @Override // defpackage.k80, defpackage.n6b
    public void a(Drawable drawable) {
        super.a(drawable);
        m();
    }

    @Override // defpackage.n6b
    public void c(@NonNull kna knaVar) {
        this.c.d(knaVar);
    }

    @Override // defpackage.k80, defpackage.n6b
    public ii9 h() {
        Object k = k();
        if (k != null) {
            if (k instanceof ii9) {
                return (ii9) k;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.k80, defpackage.n6b
    public void i(Drawable drawable) {
        super.i(drawable);
        this.c.b();
        if (!this.e) {
            n();
        }
    }

    @Override // defpackage.k80, defpackage.n6b
    public void j(ii9 ii9Var) {
        o(ii9Var);
    }

    @Override // defpackage.n6b
    public void l(@NonNull kna knaVar) {
        this.c.k(knaVar);
    }

    public String toString() {
        return "Target for: " + this.b;
    }
}
