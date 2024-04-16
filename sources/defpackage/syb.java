package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import defpackage.c5c;
import defpackage.d4;
import defpackage.s2;
import defpackage.syb;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: syb  reason: default package */
/* loaded from: classes.dex */
public class syb {
    private static Field c;
    private static ThreadLocal<Rect> e;
    private static final AtomicInteger a = new AtomicInteger(1);
    private static WeakHashMap<View, j0c> b = null;
    private static boolean d = false;
    private static final int[] f = {qy8.b, qy8.c, qy8.n, qy8.y, qy8.B, qy8.C, qy8.D, qy8.E, qy8.F, qy8.G, qy8.d, qy8.e, qy8.f, qy8.g, qy8.h, qy8.i, qy8.j, qy8.k, qy8.l, qy8.m, qy8.o, qy8.p, qy8.q, qy8.r, qy8.s, qy8.t, qy8.u, qy8.v, qy8.w, qy8.x, qy8.z, qy8.A};
    private static final w87 g = new w87() { // from class: ryb
        @Override // defpackage.w87
        public final nt1 onReceiveContent(nt1 nt1Var) {
            nt1 c0;
            c0 = syb.c0(nt1Var);
            return c0;
        }
    };
    private static final e h = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$a */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: i */
        public Boolean d(@NonNull View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: j */
        public void e(@NonNull View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$b */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$c */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            s.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$d */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.syb.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            if (Build.VERSION.SDK_INT >= this.c) {
                return true;
            }
            return false;
        }

        boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
            return true;
        }

        abstract T d(View view);

        abstract void e(View view, T t);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t = (T) view.getTag(this.a);
                if (this.b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                syb.l(view);
                view.setTag(this.a, t);
                syb.d0(view, this.d);
            }
        }

        abstract boolean h(T t, T t2);

        f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$g */
    /* loaded from: classes.dex */
    static class g {
        static boolean a(@NonNull View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$h */
    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$i */
    /* loaded from: classes.dex */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(@NonNull View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i) {
            view.setLabelFor(i);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$j */
    /* loaded from: classes.dex */
    static class j {
        static Rect a(@NonNull View view) {
            return view.getClipBounds();
        }

        static boolean b(@NonNull View view) {
            return view.isInLayout();
        }

        static void c(@NonNull View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$k */
    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(@NonNull View view) {
            return view.isLaidOut();
        }

        static boolean d(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$l */
    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$m */
    /* loaded from: classes.dex */
    private static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompat.java */
        /* renamed from: syb$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            c5c a = null;
            final /* synthetic */ View b;
            final /* synthetic */ h77 c;

            a(View view, h77 h77Var) {
                this.b = view;
                this.c = h77Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                c5c x = c5c.x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    m.a(windowInsets, this.b);
                    if (x.equals(this.a)) {
                        return this.c.a(view, x).v();
                    }
                }
                this.a = x;
                c5c a = this.c.a(view, x);
                if (i >= 30) {
                    return a.v();
                }
                syb.r0(view);
                return a.v();
            }
        }

        static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(qy8.g0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static c5c b(@NonNull View view, @NonNull c5c c5cVar, @NonNull Rect rect) {
            WindowInsets v = c5cVar.v();
            if (v != null) {
                return c5c.x(view.computeSystemWindowInsets(v, rect), view);
            }
            rect.setEmpty();
            return c5cVar;
        }

        static boolean c(@NonNull View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        static boolean d(@NonNull View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static c5c j(@NonNull View view) {
            return c5c.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(@NonNull View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f) {
            view.setElevation(f);
        }

        static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static void u(@NonNull View view, h77 h77Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(qy8.Z, h77Var);
            }
            if (h77Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(qy8.g0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, h77Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        static void x(@NonNull View view, float f) {
            view.setZ(f);
        }

        static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$n */
    /* loaded from: classes.dex */
    private static class n {
        public static c5c a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            c5c w = c5c.w(rootWindowInsets);
            w.t(w);
            w.d(view.getRootView());
            return w;
        }

        static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        static void c(@NonNull View view, int i) {
            view.setScrollIndicators(i);
        }

        static void d(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$o */
    /* loaded from: classes.dex */
    static class o {
        static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(@NonNull View view, ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$p */
    /* loaded from: classes.dex */
    static class p {
        static void a(@NonNull View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(@NonNull View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        static boolean i(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        static void j(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(@NonNull View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        static void m(@NonNull View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        static void o(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$q */
    /* loaded from: classes.dex */
    public static class q {
        static void a(@NonNull View view, @NonNull final v vVar) {
            int i = qy8.f0;
            wka wkaVar = (wka) view.getTag(i);
            if (wkaVar == null) {
                wkaVar = new wka();
                view.setTag(i, wkaVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: tyb
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return syb.v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            wkaVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(@NonNull View view, @NonNull v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            wka wkaVar = (wka) view.getTag(qy8.f0);
            if (wkaVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) wkaVar.get(vVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$r */
    /* loaded from: classes.dex */
    public static class r {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: syb$s */
    /* loaded from: classes.dex */
    public static class s {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static z5c b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return z5c.c(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$t */
    /* loaded from: classes.dex */
    private static final class t {
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static nt1 b(@NonNull View view, @NonNull nt1 nt1Var) {
            ContentInfo f = nt1Var.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f) {
                return nt1Var;
            }
            return nt1.g(performReceiveContent);
        }

        public static void c(@NonNull View view, String[] strArr, v87 v87Var) {
            if (v87Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(v87Var));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$u */
    /* loaded from: classes.dex */
    private static final class u implements OnReceiveContentListener {
        @NonNull
        private final v87 a;

        u(@NonNull v87 v87Var) {
            this.a = v87Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            nt1 g = nt1.g(contentInfo);
            nt1 a = this.a.a(view, g);
            if (a == null) {
                return null;
            }
            if (a == g) {
                return contentInfo;
            }
            return a.f();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$v */
    /* loaded from: classes.dex */
    public interface v {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$w */
    /* loaded from: classes.dex */
    static class w {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        w() {
        }

        static w a(View view) {
            int i = qy8.e0;
            w wVar = (w) view.getTag(i);
            if (wVar == null) {
                w wVar2 = new w();
                view.setTag(i, wVar2);
                return wVar2;
            }
            return wVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(qy8.f0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            if (c != null) {
                return true;
            }
            return false;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && syb.X(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    private static w87 A(@NonNull View view) {
        if (view instanceof w87) {
            return (w87) view;
        }
        return g;
    }

    public static void A0(@NonNull View view, PorterDuff.Mode mode) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        m.r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            if (m.g(view) == null && m.h(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    public static boolean B(@NonNull View view) {
        return h.b(view);
    }

    public static void B0(@NonNull View view, Rect rect) {
        j.c(view, rect);
    }

    public static int C(@NonNull View view) {
        return h.c(view);
    }

    public static void C0(@NonNull View view, float f2) {
        m.s(view, f2);
    }

    @SuppressLint({"InlinedApi"})
    public static int D(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    @Deprecated
    public static void D0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static int E(@NonNull View view) {
        return i.d(view);
    }

    public static void E0(@NonNull View view, boolean z) {
        h.r(view, z);
    }

    public static int F(@NonNull View view) {
        return h.d(view);
    }

    public static void F0(@NonNull View view, int i2) {
        h.s(view, i2);
    }

    public static int G(@NonNull View view) {
        return h.e(view);
    }

    public static void G0(@NonNull View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i2);
        }
    }

    public static String[] H(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(qy8.b0);
    }

    public static void H0(@NonNull View view, boolean z) {
        m.t(view, z);
    }

    public static int I(@NonNull View view) {
        return i.e(view);
    }

    public static void I0(@NonNull View view, h77 h77Var) {
        m.u(view, h77Var);
    }

    public static int J(@NonNull View view) {
        return i.f(view);
    }

    public static void J0(@NonNull View view, int i2, int i3, int i4, int i5) {
        i.k(view, i2, i3, i4, i5);
    }

    public static ViewParent K(@NonNull View view) {
        return h.f(view);
    }

    public static void K0(@NonNull View view, qd8 qd8Var) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (qd8Var != null) {
                obj = qd8Var.a();
            } else {
                obj = null;
            }
            o.d(view, qyb.a(obj));
        }
    }

    public static c5c L(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.a(view);
        }
        return m.j(view);
    }

    public static void L0(@NonNull View view, boolean z) {
        t0().g(view, Boolean.valueOf(z));
    }

    public static CharSequence M(@NonNull View view) {
        return S0().f(view);
    }

    public static void M0(@NonNull View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i2, i3);
        }
    }

    public static String N(@NonNull View view) {
        return m.k(view);
    }

    public static void N0(@NonNull View view, CharSequence charSequence) {
        S0().g(view, charSequence);
    }

    public static float O(@NonNull View view) {
        return m.l(view);
    }

    public static void O0(@NonNull View view, String str) {
        m.v(view, str);
    }

    @Deprecated
    public static z5c P(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return w4c.a(window, view);
            }
        }
        return null;
    }

    public static void P0(@NonNull View view, float f2) {
        m.w(view, f2);
    }

    @Deprecated
    public static int Q(@NonNull View view) {
        return h.g(view);
    }

    private static void Q0(View view) {
        if (C(view) == 0) {
            F0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C((View) parent) == 4) {
                F0(view, 2);
                return;
            }
        }
    }

    public static float R(@NonNull View view) {
        return m.m(view);
    }

    public static void R0(@NonNull View view, float f2) {
        m.x(view, f2);
    }

    public static boolean S(@NonNull View view) {
        if (o(view) != null) {
            return true;
        }
        return false;
    }

    private static f<CharSequence> S0() {
        return new c(qy8.d0, CharSequence.class, 64, 30);
    }

    public static boolean T(@NonNull View view) {
        return g.a(view);
    }

    public static void T0(@NonNull View view) {
        m.z(view);
    }

    public static boolean U(@NonNull View view) {
        return h.h(view);
    }

    private static void U0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean V(@NonNull View view) {
        return h.i(view);
    }

    public static boolean W(@NonNull View view) {
        Boolean f2 = b().f(view);
        if (f2 != null && f2.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean X(@NonNull View view) {
        return k.b(view);
    }

    public static boolean Y(@NonNull View view) {
        return k.c(view);
    }

    public static boolean Z(@NonNull View view) {
        return m.p(view);
    }

    public static boolean a0(@NonNull View view) {
        return i.g(view);
    }

    private static f<Boolean> b() {
        return new d(qy8.X, Boolean.class, 28);
    }

    public static boolean b0(@NonNull View view) {
        Boolean f2 = t0().f(view);
        if (f2 != null && f2.booleanValue()) {
            return true;
        }
        return false;
    }

    public static int c(@NonNull View view, @NonNull CharSequence charSequence, @NonNull i4 i4Var) {
        int t2 = t(view, charSequence);
        if (t2 != -1) {
            d(view, new d4.a(t2, charSequence, i4Var));
        }
        return t2;
    }

    private static void d(@NonNull View view, @NonNull d4.a aVar) {
        l(view);
        p0(aVar.b(), view);
        s(view).add(aVar);
        d0(view, 0);
    }

    static void d0(View view, int i2) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (r(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 32;
        if (q(view) == 0 && !z) {
            if (i2 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                k.g(obtain, i2);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i2);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i3 = 2048;
        }
        obtain2.setEventType(i3);
        k.g(obtain2, i2);
        if (z) {
            obtain2.getText().add(r(view));
            Q0(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    @NonNull
    public static j0c e(@NonNull View view) {
        if (b == null) {
            b = new WeakHashMap<>();
        }
        j0c j0cVar = b.get(view);
        if (j0cVar == null) {
            j0c j0cVar2 = new j0c(view);
            b.put(view, j0cVar2);
            return j0cVar2;
        }
        return j0cVar;
    }

    public static void e0(@NonNull View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect z2 = z();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            z2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !z2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        f(view, i2);
        if (z && z2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(z2);
        }
    }

    private static void f(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            U0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                U0((View) parent);
            }
        }
    }

    public static void f0(@NonNull View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect z2 = z();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            z2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !z2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        g(view, i2);
        if (z && z2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(z2);
        }
    }

    private static void g(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            U0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                U0((View) parent);
            }
        }
    }

    @NonNull
    public static c5c g0(@NonNull View view, @NonNull c5c c5cVar) {
        WindowInsets v2 = c5cVar.v();
        if (v2 != null) {
            WindowInsets b2 = l.b(view, v2);
            if (!b2.equals(v2)) {
                return c5c.x(b2, view);
            }
        }
        return c5cVar;
    }

    @NonNull
    public static c5c h(@NonNull View view, @NonNull c5c c5cVar, @NonNull Rect rect) {
        return m.b(view, c5cVar, rect);
    }

    public static void h0(@NonNull View view, @NonNull d4 d4Var) {
        view.onInitializeAccessibilityNodeInfo(d4Var.c1());
    }

    @NonNull
    public static c5c i(@NonNull View view, @NonNull c5c c5cVar) {
        WindowInsets v2 = c5cVar.v();
        if (v2 != null) {
            WindowInsets a2 = l.a(view, v2);
            if (!a2.equals(v2)) {
                return c5c.x(a2, view);
            }
        }
        return c5cVar;
    }

    private static f<CharSequence> i0() {
        return new b(qy8.Y, CharSequence.class, 8, 28);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    public static boolean j0(@NonNull View view, int i2, Bundle bundle) {
        return h.j(view, i2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    public static nt1 k0(@NonNull View view, @NonNull nt1 nt1Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + nt1Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, nt1Var);
        }
        v87 v87Var = (v87) view.getTag(qy8.a0);
        if (v87Var != null) {
            nt1 a2 = v87Var.a(view, nt1Var);
            if (a2 == null) {
                return null;
            }
            return A(view).onReceiveContent(a2);
        }
        return A(view).onReceiveContent(nt1Var);
    }

    static void l(@NonNull View view) {
        s2 n2 = n(view);
        if (n2 == null) {
            n2 = new s2();
        }
        u0(view, n2);
    }

    public static void l0(@NonNull View view) {
        h.k(view);
    }

    public static int m() {
        return i.a();
    }

    public static void m0(@NonNull View view, @NonNull Runnable runnable) {
        h.m(view, runnable);
    }

    public static s2 n(@NonNull View view) {
        View.AccessibilityDelegate o2 = o(view);
        if (o2 == null) {
            return null;
        }
        if (o2 instanceof s2.a) {
            return ((s2.a) o2).a;
        }
        return new s2(o2);
    }

    @SuppressLint({"LambdaLast"})
    public static void n0(@NonNull View view, @NonNull Runnable runnable, long j2) {
        h.n(view, runnable, j2);
    }

    private static View.AccessibilityDelegate o(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return p(view);
    }

    public static void o0(@NonNull View view, int i2) {
        p0(i2, view);
        d0(view, 0);
    }

    private static View.AccessibilityDelegate p(@NonNull View view) {
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        try {
            Object obj = c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            d = true;
            return null;
        }
    }

    private static void p0(int i2, View view) {
        List<d4.a> s2 = s(view);
        for (int i3 = 0; i3 < s2.size(); i3++) {
            if (s2.get(i3).b() == i2) {
                s2.remove(i3);
                return;
            }
        }
    }

    public static int q(@NonNull View view) {
        return k.a(view);
    }

    public static void q0(@NonNull View view, @NonNull d4.a aVar, CharSequence charSequence, i4 i4Var) {
        if (i4Var == null && charSequence == null) {
            o0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, i4Var));
        }
    }

    public static CharSequence r(@NonNull View view) {
        return i0().f(view);
    }

    public static void r0(@NonNull View view) {
        l.c(view);
    }

    private static List<d4.a> s(View view) {
        int i2 = qy8.V;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void s0(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static int t(View view, @NonNull CharSequence charSequence) {
        boolean z;
        List<d4.a> s2 = s(view);
        for (int i2 = 0; i2 < s2.size(); i2++) {
            if (TextUtils.equals(charSequence, s2.get(i2).c())) {
                return s2.get(i2).b();
            }
        }
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int[] iArr = f;
            if (i3 >= iArr.length || i4 != -1) {
                break;
            }
            int i5 = iArr[i3];
            boolean z2 = true;
            for (int i6 = 0; i6 < s2.size(); i6++) {
                if (s2.get(i6).b() != i5) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i4 = i5;
            }
            i3++;
        }
        return i4;
    }

    private static f<Boolean> t0() {
        return new a(qy8.c0, Boolean.class, 28);
    }

    public static ColorStateList u(@NonNull View view) {
        return m.g(view);
    }

    public static void u0(@NonNull View view, s2 s2Var) {
        View.AccessibilityDelegate d2;
        if (s2Var == null && (o(view) instanceof s2.a)) {
            s2Var = new s2();
        }
        if (s2Var == null) {
            d2 = null;
        } else {
            d2 = s2Var.d();
        }
        view.setAccessibilityDelegate(d2);
    }

    public static PorterDuff.Mode v(@NonNull View view) {
        return m.h(view);
    }

    public static void v0(@NonNull View view, boolean z) {
        b().g(view, Boolean.valueOf(z));
    }

    public static Rect w(@NonNull View view) {
        return j.a(view);
    }

    public static void w0(@NonNull View view, int i2) {
        k.f(view, i2);
    }

    public static Display x(@NonNull View view) {
        return i.b(view);
    }

    public static void x0(@NonNull View view, CharSequence charSequence) {
        i0().g(view, charSequence);
        if (charSequence != null) {
            h.a(view);
        } else {
            h.d(view);
        }
    }

    public static float y(@NonNull View view) {
        return m.i(view);
    }

    public static void y0(@NonNull View view, Drawable drawable) {
        h.q(view, drawable);
    }

    private static Rect z() {
        if (e == null) {
            e = new ThreadLocal<>();
        }
        Rect rect = e.get();
        if (rect == null) {
            rect = new Rect();
            e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void z0(@NonNull View view, ColorStateList colorStateList) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        m.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            if (m.g(view) == null && m.h(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: syb$e */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z) {
            boolean z2;
            int i;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                syb.d0(view, i);
                this.a.put(view, Boolean.valueOf(z2));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.a.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nt1 c0(nt1 nt1Var) {
        return nt1Var;
    }
}
