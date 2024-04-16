package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public class a extends jn {
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    @NonNull
    private BottomSheetBehavior.f bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private BottomSheetBehavior.f edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0224a implements h77 {
        C0224a() {
        }

        @Override // defpackage.h77
        public c5c a(View view, c5c c5cVar) {
            if (a.this.edgeToEdgeCallback != null) {
                a.this.behavior.N(a.this.edgeToEdgeCallback);
            }
            if (c5cVar != null) {
                a aVar = a.this;
                aVar.edgeToEdgeCallback = new f(aVar.bottomSheet, c5cVar, null);
                a.this.behavior.s(a.this.edgeToEdgeCallback);
            }
            return c5cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.cancelable && aVar.isShowing() && a.this.shouldWindowCloseOnTouchOutside()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class c extends s2 {
        c() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            if (a.this.cancelable) {
                d4Var.a(1048576);
                d4Var.t0(true);
                return;
            }
            d4Var.t0(false);
        }

        @Override // defpackage.s2
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.cancelable) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    private static class f extends BottomSheetBehavior.f {
        private final boolean a;
        private final boolean b;
        private final c5c c;

        /* synthetic */ f(View view, c5c c5cVar, C0224a c0224a) {
            this(view, c5cVar);
        }

        private void d(View view) {
            if (view.getTop() < this.c.l()) {
                a.setLightStatusBar(view, this.a);
                view.setPadding(view.getPaddingLeft(), this.c.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.setLightStatusBar(view, this.b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        void a(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@NonNull View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@NonNull View view, int i) {
            d(view);
        }

        private f(@NonNull View view, @NonNull c5c c5cVar) {
            ColorStateList u;
            this.c = c5cVar;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.b = z;
            fa6 E = BottomSheetBehavior.B(view).E();
            if (E != null) {
                u = E.x();
            } else {
                u = syb.u(view);
            }
            if (u != null) {
                this.a = ba6.f(u.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.a = ba6.f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.a = z;
            }
        }
    }

    public a(@NonNull Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{qv8.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), kz8.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(ky8.d);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(ky8.e);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> B = BottomSheetBehavior.B(frameLayout2);
            this.behavior = B;
            B.s(this.bottomSheetCallback);
            this.behavior.Y(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(@NonNull Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(qv8.e, typedValue, true)) {
                return typedValue.resourceId;
            }
            return i19.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    public static void setLightStatusBar(@NonNull View view, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & (-8193);
            }
            view.setSystemUiVisibility(i);
        }
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(ky8.d);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            syb.I0(this.bottomSheet, new C0224a());
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ky8.Z).setOnClickListener(new b());
        syb.u0(this.bottomSheet, new c());
        this.bottomSheet.setOnTouchListener(new d());
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.dismissWithAnimation && behavior.G() != 5) {
            behavior.f0(5);
        } else {
            super.cancel();
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.om1, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.G() == 5) {
            this.behavior.f0(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeDefaultCallback() {
        this.behavior.N(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.Y(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public a(@NonNull Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new e();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{qv8.enableEdgeToEdge}).getBoolean(0, false);
    }

    protected a(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new e();
        supportRequestWindowFeature(1);
        this.cancelable = z;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{qv8.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@NonNull View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@NonNull View view, float f) {
        }
    }
}
