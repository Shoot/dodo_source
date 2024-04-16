package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComponentDialog.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0003\u00100\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0015J\b\u0010\u000b\u001a\u00020\u0005H\u0015J\b\u0010\f\u001a\u00020\u0005H\u0015J\b\u0010\r\u001a\u00020\u0005H\u0017J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00063"}, d2 = {"Lom1;", "Landroid/app/Dialog;", "Lop5;", "Lk77;", "Lnt9;", "", "initViewTreeOwners", "Landroid/os/Bundle;", "onSaveInstanceState", "savedInstanceState", "onCreate", "onStart", "onStop", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "Landroidx/lifecycle/h;", "_lifecycleRegistry", "Landroidx/lifecycle/h;", "Lmt9;", "savedStateRegistryController", "Lmt9;", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "getLifecycleRegistry", "()Landroidx/lifecycle/h;", "lifecycleRegistry", "Landroidx/savedstate/a;", "getSavedStateRegistry", "()Landroidx/savedstate/a;", "savedStateRegistry", "Landroidx/lifecycle/d;", "getLifecycle", "()Landroidx/lifecycle/d;", "lifecycle", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: om1  reason: default package */
/* loaded from: classes.dex */
public class om1 extends Dialog implements op5, k77, nt9 {
    private h _lifecycleRegistry;
    private final OnBackPressedDispatcher onBackPressedDispatcher;
    private final mt9 savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public om1(Context context) {
        this(context, 0, 2, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final h getLifecycleRegistry() {
        h hVar = this._lifecycleRegistry;
        if (hVar == null) {
            h hVar2 = new h(this);
            this._lifecycleRegistry = hVar2;
            return hVar2;
        }
        return hVar;
    }

    private final void initViewTreeOwners() {
        Window window = getWindow();
        z65.e(window);
        View decorView = window.getDecorView();
        z65.g(decorView, "window!!.decorView");
        v0c.b(decorView, this);
        Window window2 = getWindow();
        z65.e(window2);
        View decorView2 = window2.getDecorView();
        z65.g(decorView2, "window!!.decorView");
        w0c.a(decorView2, this);
        Window window3 = getWindow();
        z65.e(window3);
        View decorView3 = window3.getDecorView();
        z65.g(decorView3, "window!!.decorView");
        x0c.b(decorView3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(om1 om1Var) {
        z65.h(om1Var, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z65.h(view, "view");
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.op5
    public d getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // defpackage.k77
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // defpackage.nt9
    public a getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            z65.g(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.f(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(bundle);
        getLifecycleRegistry().i(d.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        z65.g(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().i(d.a.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().i(d.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    public /* synthetic */ om1(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om1(Context context, int i) {
        super(context, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.savedStateRegistryController = mt9.d.a(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: nm1
            @Override // java.lang.Runnable
            public final void run() {
                om1.onBackPressedDispatcher$lambda$1(om1.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        z65.h(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z65.h(view, "view");
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
