package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.a;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import defpackage.s5;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* loaded from: classes.dex */
public class ComponentActivity extends gm1 implements op5, vzb, androidx.lifecycle.c, nt9, k77, b6, p77, f97, p87, r87, md6, i84 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final hu1 mContextAwareHelper;
    private s.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    @NonNull
    final h84 mFullyDrawnReporter;
    private final h mLifecycleRegistry;
    private final pd6 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<xr1<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<xr1<cq6>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<xr1<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<xr1<d68>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<xr1<Integer>> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final mt9 mSavedStateRegistryController;
    private t mViewModelStore;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    return;
                }
                throw e;
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ s5.a b;

            a(int i, s5.a aVar) {
                this.a = i;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.a, this.b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0007b implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ IntentSender.SendIntentException b;

            RunnableC0007b(int i, IntentSender.SendIntentException sendIntentException) {
                this.a = i;
                this.b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i, @NonNull s5<I, O> s5Var, I i2, p5 p5Var) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            s5.a<O> b = s5Var.b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, b));
                return;
            }
            Intent a2 = s5Var.a(componentActivity, i2);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                l5.t(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    l5.y(componentActivity, intentSenderRequest.d(), i, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0007b(i, e));
                }
            } else {
                l5.x(componentActivity, a2, i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {
        Object a;
        t b;

        e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f extends Executor {
        void i();

        void u(@NonNull View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements f, ViewTreeObserver.OnDrawListener, Runnable {
        Runnable b;
        final long a = SystemClock.uptimeMillis() + AbstractComponentTracker.LINGERING_TIMEOUT;
        boolean c = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
                this.b = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (this.c) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.a
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.g.this.b();
                }
            });
        }

        @Override // androidx.activity.ComponentActivity.f
        public void i() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
                this.b = null;
                if (ComponentActivity.this.mFullyDrawnReporter.c()) {
                    this.c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void u(@NonNull View view) {
            if (!this.c) {
                this.c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new hu1();
        this.mMenuHostHelper = new pd6(new Runnable() { // from class: cm1
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new h(this);
        mt9 a2 = mt9.a(this);
        this.mSavedStateRegistryController = a2;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        f createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new h84(createFullyDrawnExecutor, new Function0() { // from class: dm1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.g
                public void d(@NonNull op5 op5Var, @NonNull d.a aVar) {
                    View view;
                    if (aVar == d.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            c.a(view);
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.g
                public void d(@NonNull op5 op5Var, @NonNull d.a aVar) {
                    if (aVar == d.a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        ComponentActivity.this.mReportFullyDrawnExecutor.i();
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.g
                public void d(@NonNull op5 op5Var, @NonNull d.a aVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().d(this);
                }
            });
            a2.c();
            o.c(this);
            if (i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() { // from class: em1
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle lambda$new$1;
                    lambda$new$1 = ComponentActivity.this.lambda$new$1();
                    return lambda$new$1;
                }
            });
            addOnContextAvailableListener(new s77() { // from class: fm1
                @Override // defpackage.s77
                public final void a(Context context) {
                    ComponentActivity.this.lambda$new$2(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private f createFullyDrawnExecutor() {
        return new g();
    }

    private void initViewTreeOwners() {
        v0c.b(getWindow().getDecorView(), this);
        y0c.a(getWindow().getDecorView(), this);
        x0c.b(getWindow().getDecorView(), this);
        w0c.a(getWindow().getDecorView(), this);
        u0c.a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle b2 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b2 != null) {
            this.mActivityResultRegistry.g(b2);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.u(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.md6
    public void addMenuProvider(@NonNull vg6 vg6Var) {
        this.mMenuHostHelper.c(vg6Var);
    }

    @Override // defpackage.p77
    public final void addOnConfigurationChangedListener(@NonNull xr1<Configuration> xr1Var) {
        this.mOnConfigurationChangedListeners.add(xr1Var);
    }

    public final void addOnContextAvailableListener(@NonNull s77 s77Var) {
        this.mContextAwareHelper.a(s77Var);
    }

    @Override // defpackage.p87
    public final void addOnMultiWindowModeChangedListener(@NonNull xr1<cq6> xr1Var) {
        this.mOnMultiWindowModeChangedListeners.add(xr1Var);
    }

    public final void addOnNewIntentListener(@NonNull xr1<Intent> xr1Var) {
        this.mOnNewIntentListeners.add(xr1Var);
    }

    @Override // defpackage.r87
    public final void addOnPictureInPictureModeChangedListener(@NonNull xr1<d68> xr1Var) {
        this.mOnPictureInPictureModeChangedListeners.add(xr1Var);
    }

    @Override // defpackage.f97
    public final void addOnTrimMemoryListener(@NonNull xr1<Integer> xr1Var) {
        this.mOnTrimMemoryListeners.add(xr1Var);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new t();
            }
        }
    }

    @Override // defpackage.b6
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.c
    @NonNull
    public n22 getDefaultViewModelCreationExtras() {
        jq6 jq6Var = new jq6();
        if (getApplication() != null) {
            jq6Var.c(s.a.g, getApplication());
        }
        jq6Var.c(o.a, this);
        jq6Var.c(o.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            jq6Var.c(o.c, getIntent().getExtras());
        }
        return jq6Var;
    }

    @NonNull
    public s.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new p(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public h84 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.a;
        }
        return null;
    }

    @Override // defpackage.gm1, defpackage.op5
    @NonNull
    public androidx.lifecycle.d getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // defpackage.k77
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // defpackage.nt9
    @NonNull
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // defpackage.vzb
    @NonNull
    public t getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<xr1<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        m.e(this);
        if (gh0.d()) {
            this.mOnBackPressedDispatcher.f(d.a(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.mMenuHostHelper.h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<xr1<cq6>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new cq6(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<xr1<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<xr1<d68>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new d68(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, @NonNull Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.mMenuHostHelper.k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (!this.mActivityResultRegistry.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        t tVar = this.mViewModelStore;
        if (tVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            tVar = eVar.b;
        }
        if (tVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = onRetainCustomNonConfigurationInstance;
        eVar2.b = tVar;
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gm1, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        androidx.lifecycle.d lifecycle = getLifecycle();
        if (lifecycle instanceof h) {
            ((h) lifecycle).o(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<xr1<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    @NonNull
    public final <I, O> a6<I> registerForActivityResult(@NonNull s5<I, O> s5Var, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull r5<O> r5Var) {
        return activityResultRegistry.j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, s5Var, r5Var);
    }

    @Override // defpackage.md6
    public void removeMenuProvider(@NonNull vg6 vg6Var) {
        this.mMenuHostHelper.l(vg6Var);
    }

    @Override // defpackage.p77
    public final void removeOnConfigurationChangedListener(@NonNull xr1<Configuration> xr1Var) {
        this.mOnConfigurationChangedListeners.remove(xr1Var);
    }

    public final void removeOnContextAvailableListener(@NonNull s77 s77Var) {
        this.mContextAwareHelper.e(s77Var);
    }

    @Override // defpackage.p87
    public final void removeOnMultiWindowModeChangedListener(@NonNull xr1<cq6> xr1Var) {
        this.mOnMultiWindowModeChangedListeners.remove(xr1Var);
    }

    public final void removeOnNewIntentListener(@NonNull xr1<Intent> xr1Var) {
        this.mOnNewIntentListeners.remove(xr1Var);
    }

    @Override // defpackage.r87
    public final void removeOnPictureInPictureModeChangedListener(@NonNull xr1<d68> xr1Var) {
        this.mOnPictureInPictureModeChangedListeners.remove(xr1Var);
    }

    @Override // defpackage.f97
    public final void removeOnTrimMemoryListener(@NonNull xr1<Integer> xr1Var) {
        this.mOnTrimMemoryListeners.remove(xr1Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (pjb.d()) {
                pjb.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.b();
            pjb.b();
        } catch (Throwable th) {
            pjb.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.u(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(@NonNull vg6 vg6Var, @NonNull op5 op5Var) {
        this.mMenuHostHelper.d(vg6Var, op5Var);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull vg6 vg6Var, @NonNull op5 op5Var, @NonNull d.b bVar) {
        this.mMenuHostHelper.e(vg6Var, op5Var, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<xr1<cq6>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new cq6(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<xr1<d68>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new d68(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @NonNull
    public final <I, O> a6<I> registerForActivityResult(@NonNull s5<I, O> s5Var, @NonNull r5<O> r5Var) {
        return registerForActivityResult(s5Var, this.mActivityResultRegistry, r5Var);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.u(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.u(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
