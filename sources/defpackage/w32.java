package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.bottomsheet.LockableBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0001\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lw32;", "Ljn;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "getBehavior", "ensureContainerAndBehavior", "", "layoutResId", "Landroid/view/View;", "view", e.a, "", "setContentView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "cancelable", "setCancelable", "onStart", "cancel", "setCanceledOnTouchOutside", "Lcom/dodopizza/android/bottomsheet/LockableBottomSheetBehavior;", "a", "Lcom/dodopizza/android/bottomsheet/LockableBottomSheetBehavior;", "behavior", "b", "Landroid/widget/FrameLayout;", "container", com.huawei.hms.opendevice.c.a, "Z", "dismissWithAnimation", DateTokenConverter.CONVERTER_KEY, "isCancelable", "canceledOnTouchOutside", "f", "canceledOnTouchOutsideSet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "bottomSheetCallback", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "theme", "<init>", "(Landroid/content/Context;I)V", Image.TYPE_HIGH, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w32  reason: default package */
/* loaded from: classes.dex */
public final class w32 extends jn {
    public static final a h = new a(null);
    private LockableBottomSheetBehavior<FrameLayout> a;
    private FrameLayout b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final BottomSheetBehavior.f g;

    /* compiled from: CustomBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lw32$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "themeId1", "b", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w32$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Context context, int i) {
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(yv8.a, typedValue, true)) {
                return typedValue.resourceId;
            }
            return p19.DodopizzaTheme_CustomBottomSheetDialog;
        }
    }

    /* compiled from: CustomBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"w32$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", com.huawei.hms.opendevice.c.a, "", "slideOffset", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w32$b */
    /* loaded from: classes.dex */
    public static final class b extends BottomSheetBehavior.f {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            z65.h(view, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            if (i == 5) {
                w32.this.cancel();
            }
        }
    }

    /* compiled from: CustomBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"w32$c", "Ls2;", "Landroid/view/View;", "host", "Ld4;", "info", "", "g", "", "action", "Landroid/os/Bundle;", "args", "", "j", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w32$c */
    /* loaded from: classes.dex */
    public static final class c extends s2 {
        c() {
        }

        @Override // defpackage.s2
        public void g(View view, d4 d4Var) {
            z65.h(view, "host");
            z65.h(d4Var, "info");
            super.g(view, d4Var);
            if (w32.this.d) {
                d4Var.a(1048576);
                d4Var.t0(true);
                return;
            }
            d4Var.t0(false);
        }

        @Override // defpackage.s2
        public boolean j(View view, int i, Bundle bundle) {
            z65.h(view, "host");
            if (i == 1048576 && w32.this.d) {
                w32.this.cancel();
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w32(Context context, int i) {
        super(context, h.b(context, i));
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        supportRequestWindowFeature(1);
        this.d = true;
        this.e = true;
        this.g = new b();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final View e(int i, View view) {
        FrameLayout ensureContainerAndBehavior = ensureContainerAndBehavior();
        View findViewById = ensureContainerAndBehavior.findViewById(vx8.e);
        z65.f(findViewById, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        View findViewById2 = ensureContainerAndBehavior.findViewById(vx8.f);
        z65.f(findViewById2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        frameLayout.addView(view);
        coordinatorLayout.findViewById(vx8.t).setOnClickListener(new View.OnClickListener() { // from class: u32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w32.f(w32.this, view2);
            }
        });
        syb.u0(frameLayout, new c());
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: v32
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean g;
                g = w32.g(view2, motionEvent);
                return g;
            }
        });
        return ensureContainerAndBehavior;
    }

    private final FrameLayout ensureContainerAndBehavior() {
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            View inflate = View.inflate(getContext(), sz8.design_bottom_sheet, null);
            z65.f(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout2 = (FrameLayout) inflate;
            this.b = frameLayout2;
            View findViewById = frameLayout2.findViewById(vx8.f);
            z65.f(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
            BottomSheetBehavior B = BottomSheetBehavior.B((FrameLayout) findViewById);
            z65.f(B, "null cannot be cast to non-null type com.dodopizza.android.bottomsheet.LockableBottomSheetBehavior<android.widget.FrameLayout>");
            LockableBottomSheetBehavior<FrameLayout> lockableBottomSheetBehavior = (LockableBottomSheetBehavior) B;
            lockableBottomSheetBehavior.s(this.g);
            lockableBottomSheetBehavior.Y(this.d);
            lockableBottomSheetBehavior.s0(this.d);
            this.a = lockableBottomSheetBehavior;
            return frameLayout2;
        }
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(w32 w32Var, View view) {
        z65.h(w32Var, "this$0");
        if (w32Var.d && w32Var.isShowing()) {
            w32Var.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(View view, MotionEvent motionEvent) {
        return true;
    }

    private final BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.a == null) {
            ensureContainerAndBehavior();
        }
        LockableBottomSheetBehavior<FrameLayout> lockableBottomSheetBehavior = this.a;
        z65.e(lockableBottomSheetBehavior);
        return lockableBottomSheetBehavior;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.c && behavior.G() != 5) {
            behavior.f0(5);
        } else {
            super.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            g6c.a.g(window);
            window.setLayout(-1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.om1, android.app.Dialog
    public void onStart() {
        super.onStart();
        LockableBottomSheetBehavior<FrameLayout> lockableBottomSheetBehavior = this.a;
        if (lockableBottomSheetBehavior != null && lockableBottomSheetBehavior.G() == 5) {
            lockableBottomSheetBehavior.f0(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            LockableBottomSheetBehavior<FrameLayout> lockableBottomSheetBehavior = this.a;
            if (lockableBottomSheetBehavior != null) {
                lockableBottomSheetBehavior.Y(z);
                lockableBottomSheetBehavior.s0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(e(i, null));
    }

    @Override // defpackage.jn, defpackage.om1, android.app.Dialog
    public void setContentView(View view) {
        z65.h(view, "view");
        super.setContentView(e(0, view));
    }
}
