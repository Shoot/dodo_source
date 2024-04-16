package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.NonNull;
import androidx.fragment.app.d;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import defpackage.l5;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class d extends ComponentActivity implements l5.e, l5.f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.h mFragmentLifecycleRegistry;
    final f mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    class a extends h<d> implements p77, f97, p87, r87, vzb, k77, b6, nt9, o64, md6 {
        public a() {
            super(d.this);
        }

        @Override // defpackage.o64
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            d.this.onAttachFragment(fragment);
        }

        @Override // defpackage.md6
        public void addMenuProvider(@NonNull vg6 vg6Var) {
            d.this.addMenuProvider(vg6Var);
        }

        @Override // defpackage.p77
        public void addOnConfigurationChangedListener(@NonNull xr1<Configuration> xr1Var) {
            d.this.addOnConfigurationChangedListener(xr1Var);
        }

        @Override // defpackage.p87
        public void addOnMultiWindowModeChangedListener(@NonNull xr1<cq6> xr1Var) {
            d.this.addOnMultiWindowModeChangedListener(xr1Var);
        }

        @Override // defpackage.r87
        public void addOnPictureInPictureModeChangedListener(@NonNull xr1<d68> xr1Var) {
            d.this.addOnPictureInPictureModeChangedListener(xr1Var);
        }

        @Override // defpackage.f97
        public void addOnTrimMemoryListener(@NonNull xr1<Integer> xr1Var) {
            d.this.addOnTrimMemoryListener(xr1Var);
        }

        @Override // androidx.fragment.app.h, defpackage.e64
        public View c(int i) {
            return d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.h, defpackage.e64
        public boolean d() {
            Window window = d.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // defpackage.b6
        @NonNull
        public ActivityResultRegistry getActivityResultRegistry() {
            return d.this.getActivityResultRegistry();
        }

        @Override // defpackage.op5
        @NonNull
        public androidx.lifecycle.d getLifecycle() {
            return d.this.mFragmentLifecycleRegistry;
        }

        @Override // defpackage.k77
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return d.this.getOnBackPressedDispatcher();
        }

        @Override // defpackage.nt9
        @NonNull
        public androidx.savedstate.a getSavedStateRegistry() {
            return d.this.getSavedStateRegistry();
        }

        @Override // defpackage.vzb
        @NonNull
        public androidx.lifecycle.t getViewModelStore() {
            return d.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.h
        public void h(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        @NonNull
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public boolean l(@NonNull String str) {
            return l5.w(d.this, str);
        }

        @Override // androidx.fragment.app.h
        public void o() {
            p();
        }

        public void p() {
            d.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.h
        /* renamed from: q */
        public d i() {
            return d.this;
        }

        @Override // defpackage.md6
        public void removeMenuProvider(@NonNull vg6 vg6Var) {
            d.this.removeMenuProvider(vg6Var);
        }

        @Override // defpackage.p77
        public void removeOnConfigurationChangedListener(@NonNull xr1<Configuration> xr1Var) {
            d.this.removeOnConfigurationChangedListener(xr1Var);
        }

        @Override // defpackage.p87
        public void removeOnMultiWindowModeChangedListener(@NonNull xr1<cq6> xr1Var) {
            d.this.removeOnMultiWindowModeChangedListener(xr1Var);
        }

        @Override // defpackage.r87
        public void removeOnPictureInPictureModeChangedListener(@NonNull xr1<d68> xr1Var) {
            d.this.removeOnPictureInPictureModeChangedListener(xr1Var);
        }

        @Override // defpackage.f97
        public void removeOnTrimMemoryListener(@NonNull xr1<Integer> xr1Var) {
            d.this.removeOnTrimMemoryListener(xr1Var);
        }
    }

    public d() {
        this.mFragments = f.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.h(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new a.c() { // from class: a64
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle lambda$init$0;
                lambda$init$0 = d.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new xr1() { // from class: b64
            @Override // defpackage.xr1
            public final void accept(Object obj) {
                d.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new xr1() { // from class: c64
            @Override // defpackage.xr1
            public final void accept(Object obj) {
                d.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new s77() { // from class: d64
            @Override // defpackage.s77
            public final void a(Context context) {
                d.this.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(d.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(FragmentManager fragmentManager, d.b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), bVar);
                }
                t tVar = fragment.mViewLifecycleOwner;
                if (tVar != null && tVar.getLifecycle().b().i(d.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.b().i(d.b.STARTED)) {
                    fragment.mLifecycleRegistry.o(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            yr5.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.l().Z(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @NonNull
    @Deprecated
    public yr5 getSupportLoaderManager() {
        return yr5.b(this);
    }

    void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), d.b.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(d.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(d.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(d.a.ON_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(d.a.ON_RESUME);
        this.mFragments.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(d.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(d.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(rha rhaVar) {
        l5.u(this, rhaVar);
    }

    public void setExitSharedElementCallback(rha rhaVar) {
        l5.v(this, rhaVar);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            l5.y(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        l5.p(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        l5.r(this);
    }

    public void supportStartPostponedEnterTransition() {
        l5.z(this);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            l5.x(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public d(int i) {
        super(i);
        this.mFragments = f.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.h(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // defpackage.l5.f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
