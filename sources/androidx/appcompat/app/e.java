package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.g0;
import androidx.lifecycle.d;
import com.huawei.hms.adapter.internal.CommonCode;
import defpackage.cf5;
import defpackage.ek9;
import defpackage.n2b;
import defpackage.x4;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class e extends androidx.appcompat.app.d implements e.a, LayoutInflater.Factory2 {
    private static final wka<String, Integer> n5 = new wka<>();
    private static final boolean o5 = false;
    private static final int[] p5 = {16842836};
    private static final boolean q5 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean r5 = true;
    boolean A;
    boolean B;
    boolean I;
    private t[] S4;
    private t T4;
    private boolean U4;
    private boolean V4;
    private boolean W4;
    boolean X;
    boolean X4;
    boolean Y;
    private Configuration Y4;
    private boolean Z;
    private int Z4;
    private int a5;
    private boolean b5;
    private boolean c5;
    final Object d;
    private p d5;
    final Context e;
    private p e5;
    Window f;
    boolean f5;
    private n g;
    int g5;
    final cn h;
    private final Runnable h5;
    androidx.appcompat.app.a i;
    private boolean i5;
    MenuInflater j;
    private Rect j5;
    private CharSequence k;
    private Rect k5;
    private ro2 l;
    private androidx.appcompat.app.f l5;
    private h m;
    private androidx.appcompat.app.g m5;
    private u n;
    x4 o;
    ActionBarContextView p;
    PopupWindow q;
    Runnable r;
    j0c s;
    private boolean t;
    private boolean u;
    ViewGroup v;
    private TextView w;
    private View x;
    private boolean y;
    private boolean z;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.g5 & 1) != 0) {
                eVar.a0(0);
            }
            e eVar2 = e.this;
            if ((eVar2.g5 & 4096) != 0) {
                eVar2.a0(108);
            }
            e eVar3 = e.this;
            eVar3.f5 = false;
            eVar3.g5 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements h77 {
        b() {
        }

        @Override // defpackage.h77
        public c5c a(View view, c5c c5cVar) {
            int l = c5cVar.l();
            int Q0 = e.this.Q0(c5cVar, null);
            if (l != Q0) {
                c5cVar = c5cVar.q(c5cVar.j(), Q0, c5cVar.k(), c5cVar.i());
            }
            return syb.g0(view, c5cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        class a extends m0c {
            a() {
            }

            @Override // defpackage.l0c
            public void b(View view) {
                e.this.p.setAlpha(1.0f);
                e.this.s.h(null);
                e.this.s = null;
            }

            @Override // defpackage.m0c, defpackage.l0c
            public void c(View view) {
                e.this.p.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.q.showAtLocation(eVar.p, 55, 0, 0);
            e.this.b0();
            if (e.this.J0()) {
                e.this.p.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.s = syb.e(eVar2.p).b(1.0f);
                e.this.s.h(new a());
                return;
            }
            e.this.p.setAlpha(1.0f);
            e.this.p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0009e extends m0c {
        C0009e() {
        }

        @Override // defpackage.l0c
        public void b(View view) {
            e.this.p.setAlpha(1.0f);
            e.this.s.h(null);
            e.this.s = null;
        }

        @Override // defpackage.m0c, defpackage.l0c
        public void c(View view) {
            e.this.p.setVisibility(0);
            if (e.this.p.getParent() instanceof View) {
                syb.r0((View) e.this.p.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    private class f implements u4 {
        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface g {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(@NonNull androidx.appcompat.view.menu.e eVar, boolean z) {
            e.this.R(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback l0 = e.this.l0();
            if (l0 != null) {
                l0.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class i implements x4.a {
        private x4.a a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        class a extends m0c {
            a() {
            }

            @Override // defpackage.l0c
            public void b(View view) {
                e.this.p.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.p.getParent() instanceof View) {
                    syb.r0((View) e.this.p.getParent());
                }
                e.this.p.k();
                e.this.s.h(null);
                e eVar2 = e.this;
                eVar2.s = null;
                syb.r0(eVar2.v);
            }
        }

        public i(x4.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.x4.a
        public boolean a(x4 x4Var, MenuItem menuItem) {
            return this.a.a(x4Var, menuItem);
        }

        @Override // defpackage.x4.a
        public void b(x4 x4Var) {
            this.a.b(x4Var);
            e eVar = e.this;
            if (eVar.q != null) {
                eVar.f.getDecorView().removeCallbacks(e.this.r);
            }
            e eVar2 = e.this;
            if (eVar2.p != null) {
                eVar2.b0();
                e eVar3 = e.this;
                eVar3.s = syb.e(eVar3.p).b(0.0f);
                e.this.s.h(new a());
            }
            e eVar4 = e.this;
            cn cnVar = eVar4.h;
            if (cnVar != null) {
                cnVar.onSupportActionModeFinished(eVar4.o);
            }
            e eVar5 = e.this;
            eVar5.o = null;
            syb.r0(eVar5.v);
        }

        @Override // defpackage.x4.a
        public boolean c(x4 x4Var, Menu menu) {
            return this.a.c(x4Var, menu);
        }

        @Override // defpackage.x4.a
        public boolean d(x4 x4Var, Menu menu) {
            syb.r0(e.this.v);
            return this.a.d(x4Var, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class j {
        static Context a(@NonNull Context context, @NonNull Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class l {
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class m {
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class o extends p {
        private final PowerManager c;

        o(@NonNull Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.p
        public int c() {
            if (k.a(this.c)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.e.p
        public void d() {
            e.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class p {
        private BroadcastReceiver a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    e.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b = b();
            if (b != null && b.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                e.this.e.registerReceiver(this.a, b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class q extends p {
        private final androidx.appcompat.app.k c;

        q(@NonNull androidx.appcompat.app.k kVar) {
            super();
            this.c = kVar;
        }

        @Override // androidx.appcompat.app.e.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.p
        public int c() {
            if (this.c.d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.e.p
        public void d() {
            e.this.e();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean b(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5 && i2 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!e.this.Z(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.this.T(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(on.b(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class t {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.e j;
        androidx.appcompat.view.menu.c k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        t(int i) {
            this.a = i;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, xz8.l);
                this.k = cVar;
                cVar.e(aVar);
                this.j.b(this.k);
            }
            return this.k.c(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            if (this.i == null && this.k.b().getCount() <= 0) {
                return false;
            }
            return true;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.Q(this.k);
            }
            this.j = eVar;
            if (eVar != null && (cVar = this.k) != null) {
                eVar.b(cVar);
            }
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(aw8.a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(aw8.H, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(u19.c, true);
            }
            yu1 yu1Var = new yu1(context, 0);
            yu1Var.getTheme().setTo(newTheme);
            this.l = yu1Var;
            TypedArray obtainStyledAttributes = yu1Var.obtainStyledAttributes(n29.A0);
            this.b = obtainStyledAttributes.getResourceId(n29.D0, 0);
            this.f = obtainStyledAttributes.getResourceId(n29.C0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class u implements j.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(@NonNull androidx.appcompat.view.menu.e eVar, boolean z) {
            boolean z2;
            androidx.appcompat.view.menu.e F = eVar.F();
            if (F != eVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            e eVar2 = e.this;
            if (z2) {
                eVar = F;
            }
            t e0 = eVar2.e0(eVar);
            if (e0 != null) {
                if (z2) {
                    e.this.Q(e0.a, e0, F);
                    e.this.U(e0, true);
                    return;
                }
                e.this.U(e0, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback l0;
            if (eVar == eVar.F()) {
                e eVar2 = e.this;
                if (eVar2.A && (l0 = eVar2.l0()) != null && !e.this.X4) {
                    l0.onMenuOpened(108, eVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Activity activity, cn cnVar) {
        this(activity, null, cnVar, activity);
    }

    private void D0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!tVar.o && !this.X4) {
            if (tVar.a == 0 && (this.e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
            Window.Callback l0 = l0();
            if (l0 != null && !l0.onMenuOpened(tVar.a, tVar.j)) {
                U(tVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
            if (windowManager == null || !G0(tVar, keyEvent)) {
                return;
            }
            ViewGroup viewGroup = tVar.g;
            if (viewGroup != null && !tVar.q) {
                View view = tVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    tVar.n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, tVar.d, tVar.e, CommonCode.BusInterceptor.PRIVACY_CANCEL, 8519680, -3);
                    layoutParams2.gravity = tVar.c;
                    layoutParams2.windowAnimations = tVar.f;
                    windowManager.addView(tVar.g, layoutParams2);
                    tVar.o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!o0(tVar) || tVar.g == null) {
                        return;
                    }
                } else if (tVar.q && viewGroup.getChildCount() > 0) {
                    tVar.g.removeAllViews();
                }
                if (n0(tVar) && tVar.b()) {
                    ViewGroup.LayoutParams layoutParams3 = tVar.h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    tVar.g.setBackgroundResource(tVar.b);
                    ViewParent parent = tVar.h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(tVar.h);
                    }
                    tVar.g.addView(tVar.h, layoutParams3);
                    if (!tVar.h.hasFocus()) {
                        tVar.h.requestFocus();
                    }
                } else {
                    tVar.q = true;
                    return;
                }
            }
            i2 = -2;
            tVar.n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, tVar.d, tVar.e, CommonCode.BusInterceptor.PRIVACY_CANCEL, 8519680, -3);
            layoutParams22.gravity = tVar.c;
            layoutParams22.windowAnimations = tVar.f;
            windowManager.addView(tVar.g, layoutParams22);
            tVar.o = true;
        }
    }

    private boolean F0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.m || G0(tVar, keyEvent)) && (eVar = tVar.j) != null) {
            z = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.l == null) {
            U(tVar, true);
        }
        return z;
    }

    private boolean G0(t tVar, KeyEvent keyEvent) {
        boolean z;
        ro2 ro2Var;
        int i2;
        boolean z2;
        ro2 ro2Var2;
        ro2 ro2Var3;
        if (this.X4) {
            return false;
        }
        if (tVar.m) {
            return true;
        }
        t tVar2 = this.T4;
        if (tVar2 != null && tVar2 != tVar) {
            U(tVar2, false);
        }
        Window.Callback l0 = l0();
        if (l0 != null) {
            tVar.i = l0.onCreatePanelView(tVar.a);
        }
        int i3 = tVar.a;
        if (i3 != 0 && i3 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (ro2Var3 = this.l) != null) {
            ro2Var3.g();
        }
        if (tVar.i == null && (!z || !(E0() instanceof androidx.appcompat.app.i))) {
            androidx.appcompat.view.menu.e eVar = tVar.j;
            if (eVar == null || tVar.r) {
                if (eVar == null && (!p0(tVar) || tVar.j == null)) {
                    return false;
                }
                if (z && this.l != null) {
                    if (this.m == null) {
                        this.m = new h();
                    }
                    this.l.e(tVar.j, this.m);
                }
                tVar.j.h0();
                if (!l0.onCreatePanelMenu(tVar.a, tVar.j)) {
                    tVar.c(null);
                    if (z && (ro2Var = this.l) != null) {
                        ro2Var.e(null, this.m);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.j.h0();
            Bundle bundle = tVar.s;
            if (bundle != null) {
                tVar.j.R(bundle);
                tVar.s = null;
            }
            if (!l0.onPreparePanel(0, tVar.i, tVar.j)) {
                if (z && (ro2Var2 = this.l) != null) {
                    ro2Var2.e(null, this.m);
                }
                tVar.j.g0();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            tVar.p = z2;
            tVar.j.setQwertyMode(z2);
            tVar.j.g0();
        }
        tVar.m = true;
        tVar.n = false;
        this.T4 = tVar;
        return true;
    }

    private void H0(boolean z) {
        ro2 ro2Var = this.l;
        if (ro2Var != null && ro2Var.b() && (!ViewConfiguration.get(this.e).hasPermanentMenuKey() || this.l.h())) {
            Window.Callback l0 = l0();
            if (this.l.f() && z) {
                this.l.c();
                if (!this.X4) {
                    l0.onPanelClosed(108, j0(0, true).j);
                    return;
                }
                return;
            } else if (l0 != null && !this.X4) {
                if (this.f5 && (this.g5 & 1) != 0) {
                    this.f.getDecorView().removeCallbacks(this.h5);
                    this.h5.run();
                }
                t j0 = j0(0, true);
                androidx.appcompat.view.menu.e eVar = j0.j;
                if (eVar != null && !j0.r && l0.onPreparePanel(0, j0.i, eVar)) {
                    l0.onMenuOpened(108, j0.j);
                    this.l.d();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        t j02 = j0(0, true);
        j02.q = true;
        U(j02, false);
        D0(j02, null);
    }

    private int I0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i2;
        }
    }

    private boolean K0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || syb.X((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean M(boolean z) {
        if (this.X4) {
            return false;
        }
        int P = P();
        boolean O0 = O0(t0(this.e, P), z);
        if (P == 0) {
            i0(this.e).e();
        } else {
            p pVar = this.d5;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (P == 3) {
            h0(this.e).e();
        } else {
            p pVar2 = this.e5;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return O0;
    }

    private void M0() {
        if (!this.u) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private void N() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.v.findViewById(16908290);
        View decorView = this.f.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(n29.A0);
        obtainStyledAttributes.getValue(n29.M0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(n29.N0, contentFrameLayout.getMinWidthMinor());
        int i2 = n29.K0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = n29.L0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = n29.I0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = n29.J0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private androidx.appcompat.app.c N0() {
        for (Context context = this.e; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void O(@NonNull Window window) {
        if (this.f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(callback);
                this.g = nVar;
                window.setCallback(nVar);
                e0 u2 = e0.u(this.e, null, p5);
                Drawable h2 = u2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                u2.w();
                this.f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean O0(int i2, boolean z) {
        boolean z2 = false;
        Configuration V = V(this.e, i2, null, false);
        boolean r0 = r0(this.e);
        Configuration configuration = this.Y4;
        if (configuration == null) {
            configuration = this.e.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = V.uiMode & 48;
        boolean z3 = true;
        if (i3 != i4 && z && !r0 && this.V4 && (q5 || this.W4)) {
            Object obj = this.d;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                l5.s((Activity) this.d);
                z2 = true;
            }
        }
        if (!z2 && i3 != i4) {
            P0(i4, r0, null);
        } else {
            z3 = z2;
        }
        if (z3) {
            Object obj2 = this.d;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).onNightModeChanged(i2);
            }
        }
        return z3;
    }

    private int P() {
        int i2 = this.Z4;
        if (i2 == -100) {
            return androidx.appcompat.app.d.l();
        }
        return i2;
    }

    private void P0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.h.a(resources);
        }
        int i4 = this.a5;
        if (i4 != 0) {
            this.e.setTheme(i4);
            if (i3 >= 23) {
                this.e.getTheme().applyStyle(this.a5, true);
            }
        }
        if (z) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof op5) {
                    if (((op5) activity).getLifecycle().b().i(d.b.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.W4 && !this.X4) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void R0(View view) {
        int c2;
        if ((syb.Q(view) & 8192) != 0) {
            c2 = iu1.c(this.e, qw8.b);
        } else {
            c2 = iu1.c(this.e, qw8.a);
        }
        view.setBackgroundColor(c2);
    }

    private void S() {
        p pVar = this.d5;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.e5;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    @NonNull
    private Configuration V(@NonNull Context context, int i2, Configuration configuration, boolean z) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i3 = 32;
            }
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup W() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(n29.A0);
        int i2 = n29.F0;
        if (obtainStyledAttributes.hasValue(i2)) {
            if (obtainStyledAttributes.getBoolean(n29.O0, false)) {
                C(1);
            } else if (obtainStyledAttributes.getBoolean(i2, false)) {
                C(108);
            }
            if (obtainStyledAttributes.getBoolean(n29.G0, false)) {
                C(109);
            }
            if (obtainStyledAttributes.getBoolean(n29.H0, false)) {
                C(10);
            }
            this.X = obtainStyledAttributes.getBoolean(n29.B0, false);
            obtainStyledAttributes.recycle();
            d0();
            this.f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.e);
            if (!this.Y) {
                if (this.X) {
                    viewGroup = (ViewGroup) from.inflate(xz8.h, (ViewGroup) null);
                    this.B = false;
                    this.A = false;
                } else if (this.A) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(aw8.f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new yu1(this.e, typedValue.resourceId);
                    } else {
                        context = this.e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(xz8.r, (ViewGroup) null);
                    ro2 ro2Var = (ro2) viewGroup.findViewById(ay8.q);
                    this.l = ro2Var;
                    ro2Var.setWindowCallback(l0());
                    if (this.B) {
                        this.l.i(109);
                    }
                    if (this.y) {
                        this.l.i(2);
                    }
                    if (this.z) {
                        this.l.i(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.I ? (ViewGroup) from.inflate(xz8.q, (ViewGroup) null) : (ViewGroup) from.inflate(xz8.p, (ViewGroup) null);
            }
            if (viewGroup != null) {
                syb.I0(viewGroup, new b());
                if (this.l == null) {
                    this.w = (TextView) viewGroup.findViewById(ay8.S);
                }
                b1c.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ay8.b);
                ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.X + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.Y + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void c0() {
        if (!this.u) {
            this.v = W();
            CharSequence k0 = k0();
            if (!TextUtils.isEmpty(k0)) {
                ro2 ro2Var = this.l;
                if (ro2Var != null) {
                    ro2Var.setWindowTitle(k0);
                } else if (E0() != null) {
                    E0().x(k0);
                } else {
                    TextView textView = this.w;
                    if (textView != null) {
                        textView.setText(k0);
                    }
                }
            }
            N();
            C0(this.v);
            this.u = true;
            t j0 = j0(0, false);
            if (!this.X4) {
                if (j0 == null || j0.j == null) {
                    q0(108);
                }
            }
        }
    }

    private void d0() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                O(((Activity) obj).getWindow());
            }
        }
        if (this.f != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    @NonNull
    private static Configuration f0(@NonNull Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!p57.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private p h0(@NonNull Context context) {
        if (this.e5 == null) {
            this.e5 = new o(context);
        }
        return this.e5;
    }

    private p i0(@NonNull Context context) {
        if (this.d5 == null) {
            this.d5 = new q(androidx.appcompat.app.k.a(context));
        }
        return this.d5;
    }

    private void m0() {
        c0();
        if (this.A && this.i == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                this.i = new androidx.appcompat.app.l((Activity) this.d, this.B);
            } else if (obj instanceof Dialog) {
                this.i = new androidx.appcompat.app.l((Dialog) this.d);
            }
            androidx.appcompat.app.a aVar = this.i;
            if (aVar != null) {
                aVar.s(this.i5);
            }
        }
    }

    private boolean n0(t tVar) {
        View view = tVar.i;
        if (view != null) {
            tVar.h = view;
            return true;
        } else if (tVar.j == null) {
            return false;
        } else {
            if (this.n == null) {
                this.n = new u();
            }
            View view2 = (View) tVar.a(this.n);
            tVar.h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean o0(t tVar) {
        tVar.d(g0());
        tVar.g = new s(tVar.l);
        tVar.c = 81;
        return true;
    }

    private boolean p0(t tVar) {
        Resources.Theme theme;
        Context context = this.e;
        int i2 = tVar.a;
        if ((i2 == 0 || i2 == 108) && this.l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(aw8.f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(aw8.g, typedValue, true);
            } else {
                theme2.resolveAttribute(aw8.g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                yu1 yu1Var = new yu1(context, 0);
                yu1Var.getTheme().setTo(theme);
                context = yu1Var;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.V(this);
        tVar.c(eVar);
        return true;
    }

    private void q0(int i2) {
        this.g5 = (1 << i2) | this.g5;
        if (!this.f5) {
            syb.m0(this.f.getDecorView(), this.h5);
            this.f5 = true;
        }
    }

    private boolean r0(Context context) {
        int i2;
        boolean z;
        if (!this.c5 && (this.d instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    i2 = 269221888;
                } else if (i3 >= 24) {
                    i2 = 786432;
                } else {
                    i2 = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.d.getClass()), i2);
                if (activityInfo != null && (activityInfo.configChanges & 512) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.b5 = z;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.b5 = false;
            }
        }
        this.c5 = true;
        return this.b5;
    }

    private boolean w0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            t j0 = j0(i2, true);
            if (!j0.o) {
                return G0(j0, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        if (G0(r2, r6) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean z0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            x4 r0 = r4.o
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.e$t r2 = r4.j0(r5, r0)
            if (r5 != 0) goto L43
            ro2 r5 = r4.l
            if (r5 == 0) goto L43
            boolean r5 = r5.b()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.e
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            ro2 r5 = r4.l
            boolean r5 = r5.f()
            if (r5 != 0) goto L3c
            boolean r5 = r4.X4
            if (r5 != 0) goto L60
            boolean r5 = r4.G0(r2, r6)
            if (r5 == 0) goto L60
            ro2 r5 = r4.l
            boolean r0 = r5.d()
            goto L66
        L3c:
            ro2 r5 = r4.l
            boolean r0 = r5.c()
            goto L66
        L43:
            boolean r5 = r2.o
            if (r5 != 0) goto L62
            boolean r3 = r2.n
            if (r3 == 0) goto L4c
            goto L62
        L4c:
            boolean r5 = r2.m
            if (r5 == 0) goto L60
            boolean r5 = r2.r
            if (r5 == 0) goto L5c
            r2.m = r1
            boolean r5 = r4.G0(r2, r6)
            if (r5 == 0) goto L60
        L5c:
            r4.D0(r2, r6)
            goto L66
        L60:
            r0 = 0
            goto L66
        L62:
            r4.U(r2, r0)
            r0 = r5
        L66:
            if (r0 == 0) goto L83
            android.content.Context r5 = r4.e
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7c
            r5.playSoundEffect(r1)
            goto L83
        L7c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.z0(int, android.view.KeyEvent):boolean");
    }

    void A0(int i2) {
        androidx.appcompat.app.a p2;
        if (i2 == 108 && (p2 = p()) != null) {
            p2.i(true);
        }
    }

    void B0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a p2 = p();
            if (p2 != null) {
                p2.i(false);
            }
        } else if (i2 == 0) {
            t j0 = j0(i2, true);
            if (j0.o) {
                U(j0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean C(int i2) {
        int I0 = I0(i2);
        if (this.Y && I0 == 108) {
            return false;
        }
        if (this.A && I0 == 1) {
            this.A = false;
        }
        if (I0 != 1) {
            if (I0 != 2) {
                if (I0 != 5) {
                    if (I0 != 10) {
                        if (I0 != 108) {
                            if (I0 != 109) {
                                return this.f.requestFeature(I0);
                            }
                            M0();
                            this.B = true;
                            return true;
                        }
                        M0();
                        this.A = true;
                        return true;
                    }
                    M0();
                    this.I = true;
                    return true;
                }
                M0();
                this.z = true;
                return true;
            }
            M0();
            this.y = true;
            return true;
        }
        M0();
        this.Y = true;
        return true;
    }

    @Override // androidx.appcompat.app.d
    public void E(int i2) {
        c0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.c(this.f.getCallback());
    }

    final androidx.appcompat.app.a E0() {
        return this.i;
    }

    @Override // androidx.appcompat.app.d
    public void F(View view) {
        c0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.c(this.f.getCallback());
    }

    @Override // androidx.appcompat.app.d
    public void G(View view, ViewGroup.LayoutParams layoutParams) {
        c0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.c(this.f.getCallback());
    }

    @Override // androidx.appcompat.app.d
    public void I(Toolbar toolbar) {
        if (!(this.d instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a p2 = p();
        if (!(p2 instanceof androidx.appcompat.app.l)) {
            this.j = null;
            if (p2 != null) {
                p2.n();
            }
            this.i = null;
            if (toolbar != null) {
                androidx.appcompat.app.i iVar = new androidx.appcompat.app.i(toolbar, k0(), this.g);
                this.i = iVar;
                this.g.e(iVar.c);
            } else {
                this.g.e(null);
            }
            r();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.d
    public void J(int i2) {
        this.a5 = i2;
    }

    final boolean J0() {
        ViewGroup viewGroup;
        if (this.u && (viewGroup = this.v) != null && syb.Y(viewGroup)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public final void K(CharSequence charSequence) {
        this.k = charSequence;
        ro2 ro2Var = this.l;
        if (ro2Var != null) {
            ro2Var.setWindowTitle(charSequence);
        } else if (E0() != null) {
            E0().x(charSequence);
        } else {
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public x4 L(@NonNull x4.a aVar) {
        cn cnVar;
        if (aVar != null) {
            x4 x4Var = this.o;
            if (x4Var != null) {
                x4Var.c();
            }
            i iVar = new i(aVar);
            androidx.appcompat.app.a p2 = p();
            if (p2 != null) {
                x4 y = p2.y(iVar);
                this.o = y;
                if (y != null && (cnVar = this.h) != null) {
                    cnVar.onSupportActionModeStarted(y);
                }
            }
            if (this.o == null) {
                this.o = L0(iVar);
            }
            return this.o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    defpackage.x4 L0(@androidx.annotation.NonNull defpackage.x4.a r8) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.L0(x4$a):x4");
    }

    void Q(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.S4;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.j;
            }
        }
        if ((tVar == null || tVar.o) && !this.X4) {
            this.g.d(this.f.getCallback(), i2, menu);
        }
    }

    final int Q0(c5c c5cVar, Rect rect) {
        int i2;
        boolean z;
        int j2;
        int k2;
        boolean z2;
        int i3 = 0;
        if (c5cVar != null) {
            i2 = c5cVar.l();
        } else if (rect != null) {
            i2 = rect.top;
        } else {
            i2 = 0;
        }
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z3 = true;
            if (this.p.isShown()) {
                if (this.j5 == null) {
                    this.j5 = new Rect();
                    this.k5 = new Rect();
                }
                Rect rect2 = this.j5;
                Rect rect3 = this.k5;
                if (c5cVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c5cVar.j(), c5cVar.l(), c5cVar.k(), c5cVar.i());
                }
                b1c.a(this.v, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                c5c L = syb.L(this.v);
                if (L == null) {
                    j2 = 0;
                } else {
                    j2 = L.j();
                }
                if (L == null) {
                    k2 = 0;
                } else {
                    k2 = L.k();
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 > 0 && this.x == null) {
                    View view = new View(this.e);
                    this.x = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j2;
                    layoutParams.rightMargin = k2;
                    this.v.addView(this.x, -1, layoutParams);
                } else {
                    View view2 = this.x;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != j2 || marginLayoutParams2.rightMargin != k2) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = j2;
                            marginLayoutParams2.rightMargin = k2;
                            this.x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.x;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    R0(this.x);
                }
                if (!this.I && z3) {
                    i2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view4 = this.x;
        if (view4 != null) {
            if (!z) {
                i3 = 8;
            }
            view4.setVisibility(i3);
        }
        return i2;
    }

    void R(@NonNull androidx.appcompat.view.menu.e eVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.l.j();
        Window.Callback l0 = l0();
        if (l0 != null && !this.X4) {
            l0.onPanelClosed(108, eVar);
        }
        this.Z = false;
    }

    void T(int i2) {
        U(j0(i2, true), true);
    }

    void U(t tVar, boolean z) {
        ViewGroup viewGroup;
        ro2 ro2Var;
        if (z && tVar.a == 0 && (ro2Var = this.l) != null && ro2Var.f()) {
            R(tVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && tVar.o && (viewGroup = tVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                Q(tVar.a, tVar, null);
            }
        }
        tVar.m = false;
        tVar.n = false;
        tVar.o = false;
        tVar.h = null;
        tVar.q = true;
        if (this.T4 == tVar) {
            this.T4 = null;
        }
    }

    public View X(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.l5 == null) {
            String string = this.e.obtainStyledAttributes(n29.A0).getString(n29.E0);
            if (string == null) {
                this.l5 = new androidx.appcompat.app.f();
            } else {
                try {
                    this.l5 = (androidx.appcompat.app.f) this.e.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.l5 = new androidx.appcompat.app.f();
                }
            }
        }
        boolean z3 = o5;
        if (z3) {
            if (this.m5 == null) {
                this.m5 = new androidx.appcompat.app.g();
            }
            if (this.m5.a(attributeSet)) {
                z = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z2 = true;
                    }
                } else {
                    z2 = K0((ViewParent) view);
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.l5.r(view, str, context, attributeSet, z, z3, true, g0.d());
    }

    void Y() {
        androidx.appcompat.view.menu.e eVar;
        ro2 ro2Var = this.l;
        if (ro2Var != null) {
            ro2Var.j();
        }
        if (this.q != null) {
            this.f.getDecorView().removeCallbacks(this.r);
            if (this.q.isShowing()) {
                try {
                    this.q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.q = null;
        }
        b0();
        t j0 = j0(0, false);
        if (j0 != null && (eVar = j0.j) != null) {
            eVar.close();
        }
    }

    boolean Z(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.d;
        if (((obj instanceof cf5.a) || (obj instanceof jn)) && (decorView = this.f.getDecorView()) != null && cf5.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.g.b(this.f.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return v0(keyCode, keyEvent);
        }
        return y0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        t e0;
        Window.Callback l0 = l0();
        if (l0 != null && !this.X4 && (e0 = e0(eVar.F())) != null) {
            return l0.onMenuItemSelected(e0.a, menuItem);
        }
        return false;
    }

    void a0(int i2) {
        t j0;
        t j02 = j0(i2, true);
        if (j02.j != null) {
            Bundle bundle = new Bundle();
            j02.j.T(bundle);
            if (bundle.size() > 0) {
                j02.s = bundle;
            }
            j02.j.h0();
            j02.j.clear();
        }
        j02.r = true;
        j02.q = true;
        if ((i2 == 108 || i2 == 0) && this.l != null && (j0 = j0(0, false)) != null) {
            j0.m = false;
            G0(j0, null);
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        H0(true);
    }

    void b0() {
        j0c j0cVar = this.s;
        if (j0cVar != null) {
            j0cVar.c();
        }
    }

    @Override // androidx.appcompat.app.d
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        c0();
        ((ViewGroup) this.v.findViewById(16908290)).addView(view, layoutParams);
        this.g.c(this.f.getCallback());
    }

    @Override // androidx.appcompat.app.d
    public boolean e() {
        return M(true);
    }

    t e0(Menu menu) {
        int i2;
        t[] tVarArr = this.S4;
        if (tVarArr != null) {
            i2 = tVarArr.length;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            t tVar = tVarArr[i3];
            if (tVar != null && tVar.j == menu) {
                return tVar;
            }
        }
        return null;
    }

    final Context g0() {
        Context context;
        androidx.appcompat.app.a p2 = p();
        if (p2 != null) {
            context = p2.k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.e;
        }
        return context;
    }

    @Override // androidx.appcompat.app.d
    @NonNull
    public Context h(@NonNull Context context) {
        this.V4 = true;
        int t0 = t0(context, P());
        Configuration configuration = null;
        if (r5 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, V(context, t0, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof yu1) {
            try {
                ((yu1) context).a(V(context, t0, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!q5) {
            return super.h(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = j.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = f0(configuration3, configuration4);
        }
        Configuration V = V(context, t0, configuration, true);
        yu1 yu1Var = new yu1(context, u19.d);
        yu1Var.a(V);
        try {
            if (context.getTheme() != null) {
                ek9.f.a(yu1Var.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.h(yu1Var);
    }

    protected t j0(int i2, boolean z) {
        t[] tVarArr = this.S4;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.S4 = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar == null) {
            t tVar2 = new t(i2);
            tVarArr[i2] = tVar2;
            return tVar2;
        }
        return tVar;
    }

    @Override // androidx.appcompat.app.d
    public <T extends View> T k(int i2) {
        c0();
        return (T) this.f.findViewById(i2);
    }

    final CharSequence k0() {
        Object obj = this.d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.k;
    }

    final Window.Callback l0() {
        return this.f.getCallback();
    }

    @Override // androidx.appcompat.app.d
    public final u4 m() {
        return new f();
    }

    @Override // androidx.appcompat.app.d
    public int n() {
        return this.Z4;
    }

    @Override // androidx.appcompat.app.d
    public MenuInflater o() {
        Context context;
        if (this.j == null) {
            m0();
            androidx.appcompat.app.a aVar = this.i;
            if (aVar != null) {
                context = aVar.k();
            } else {
                context = this.e;
            }
            this.j = new r2b(context);
        }
        return this.j;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return X(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.a p() {
        m0();
        return this.i;
    }

    @Override // androidx.appcompat.app.d
    public void q() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            sm5.a(from, this);
        } else if (!(from.getFactory2() instanceof e)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.d
    public void r() {
        if (E0() != null && !p().l()) {
            q0(0);
        }
    }

    @Override // androidx.appcompat.app.d
    public void s(Configuration configuration) {
        androidx.appcompat.app.a p2;
        if (this.A && this.u && (p2 = p()) != null) {
            p2.m(configuration);
        }
        androidx.appcompat.widget.i.b().g(this.e);
        this.Y4 = new Configuration(this.e.getResources().getConfiguration());
        M(false);
        configuration.updateFrom(this.e.getResources().getConfiguration());
    }

    public boolean s0() {
        return this.t;
    }

    @Override // androidx.appcompat.app.d
    public void t(Bundle bundle) {
        String str;
        this.V4 = true;
        M(false);
        d0();
        Object obj = this.d;
        if (obj instanceof Activity) {
            try {
                str = ru6.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a E0 = E0();
                if (E0 == null) {
                    this.i5 = true;
                } else {
                    E0.s(true);
                }
            }
            androidx.appcompat.app.d.c(this);
        }
        this.Y4 = new Configuration(this.e.getResources().getConfiguration());
        this.W4 = true;
    }

    int t0(@NonNull Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return h0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return i0(context).c();
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.d.A(r3)
        L9:
            boolean r0 = r3.f5
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.h5
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.X4 = r0
            int r0 = r3.Z4
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            wka<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.e.n5
            java.lang.Object r1 = r3.d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Z4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            wka<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.e.n5
            java.lang.Object r1 = r3.d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.i
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.u():void");
    }

    boolean u0() {
        x4 x4Var = this.o;
        if (x4Var != null) {
            x4Var.c();
            return true;
        }
        androidx.appcompat.app.a p2 = p();
        if (p2 != null && p2.h()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void v(Bundle bundle) {
        c0();
    }

    boolean v0(int i2, KeyEvent keyEvent) {
        boolean z = true;
        if (i2 != 4) {
            if (i2 == 82) {
                w0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.U4 = z;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void w() {
        androidx.appcompat.app.a p2 = p();
        if (p2 != null) {
            p2.v(true);
        }
    }

    boolean x0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a p2 = p();
        if (p2 != null && p2.o(i2, keyEvent)) {
            return true;
        }
        t tVar = this.T4;
        if (tVar != null && F0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.T4;
            if (tVar2 != null) {
                tVar2.n = true;
            }
            return true;
        }
        if (this.T4 == null) {
            t j0 = j0(0, true);
            G0(j0, keyEvent);
            boolean F0 = F0(j0, keyEvent.getKeyCode(), keyEvent, 1);
            j0.m = false;
            if (F0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void y() {
        e();
    }

    boolean y0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                z0(0, keyEvent);
                return true;
            }
        } else {
            boolean z = this.U4;
            this.U4 = false;
            t j0 = j0(0, false);
            if (j0 != null && j0.o) {
                if (!z) {
                    U(j0, true);
                }
                return true;
            } else if (u0()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void z() {
        androidx.appcompat.app.a p2 = p();
        if (p2 != null) {
            p2.v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Dialog dialog, cn cnVar) {
        this(dialog.getContext(), dialog.getWindow(), cnVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class n extends v4c {
        private g b;
        private boolean c;
        private boolean d;
        private boolean e;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.e = false;
            }
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            if (!e.this.Z(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !e.this.x0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        void e(g gVar) {
            this.b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            n2b.a aVar = new n2b.a(e.this.e, callback);
            x4 L = e.this.L(aVar);
            if (L != null) {
                return aVar.e(L);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.c) {
                a().onContentChanged();
            }
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0 && !(menu instanceof androidx.appcompat.view.menu.e)) {
                return false;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            g gVar = this.b;
            if (gVar != null && (onCreatePanelView = gVar.onCreatePanelView(i)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i);
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            e.this.A0(i);
            return true;
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            e.this.B0(i);
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar;
            if (menu instanceof androidx.appcompat.view.menu.e) {
                eVar = (androidx.appcompat.view.menu.e) menu;
            } else {
                eVar = null;
            }
            if (i == 0 && eVar == null) {
                return false;
            }
            boolean z = true;
            if (eVar != null) {
                eVar.e0(true);
            }
            g gVar = this.b;
            z = (gVar == null || !gVar.a(i)) ? false : false;
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.e0(false);
            }
            return z;
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            t j0 = e.this.j0(0, true);
            if (j0 != null && (eVar = j0.j) != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (e.this.s0()) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // defpackage.v4c, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (e.this.s0() && i == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    private e(Context context, Window window, cn cnVar, Object obj) {
        wka<String, Integer> wkaVar;
        Integer num;
        androidx.appcompat.app.c N0;
        this.s = null;
        this.t = true;
        this.Z4 = -100;
        this.h5 = new a();
        this.e = context;
        this.h = cnVar;
        this.d = obj;
        if (this.Z4 == -100 && (obj instanceof Dialog) && (N0 = N0()) != null) {
            this.Z4 = N0.getDelegate().n();
        }
        if (this.Z4 == -100 && (num = (wkaVar = n5).get(obj.getClass().getName())) != null) {
            this.Z4 = num.intValue();
            wkaVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            O(window);
        }
        androidx.appcompat.widget.i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.Y();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    void C0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.d
    public void x(Bundle bundle) {
    }
}
