package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
/* compiled from: ViewUtils.java */
/* renamed from: z0c  reason: default package */
/* loaded from: classes2.dex */
public class z0c {

    /* compiled from: ViewUtils.java */
    /* renamed from: z0c$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.a.getContext().getSystemService("input_method")).showSoftInput(this.a, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* renamed from: z0c$b */
    /* loaded from: classes2.dex */
    public class b implements h77 {
        final /* synthetic */ d a;
        final /* synthetic */ e b;

        b(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }

        @Override // defpackage.h77
        public c5c a(View view, c5c c5cVar) {
            return this.a.a(view, c5cVar, new e(this.b));
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: z0c$d */
    /* loaded from: classes2.dex */
    public interface d {
        c5c a(View view, c5c c5cVar, e eVar);
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: z0c$e */
    /* loaded from: classes2.dex */
    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public void a(View view) {
            syb.J0(view, this.a, this.b, this.c, this.d);
        }

        public e(@NonNull e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
        }
    }

    public static void a(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(@NonNull View view, @NonNull d dVar) {
        syb.I0(view, new b(dVar, new e(syb.J(view), view.getPaddingTop(), syb.I(view), view.getPaddingBottom())));
        m(view);
    }

    public static float c(@NonNull Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer d(@NonNull View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static ViewGroup e(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static zzb f(@NonNull View view) {
        return g(e(view));
    }

    public static zzb g(View view) {
        if (view == null) {
            return null;
        }
        return new xzb(view);
    }

    public static float h(@NonNull View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += syb.y((View) parent);
        }
        return f;
    }

    public static boolean i(View view) {
        if (syb.E(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode j(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void k(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            l(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void l(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void m(@NonNull View view) {
        if (syb.X(view)) {
            syb.r0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void n(@NonNull View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* renamed from: z0c$c */
    /* loaded from: classes2.dex */
    public class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            syb.r0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
