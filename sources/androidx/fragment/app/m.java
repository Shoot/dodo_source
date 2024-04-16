package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public class m {
    private final j a;
    private final o b;
    @NonNull
    private final Fragment c;
    private boolean d = false;
    private int e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@NonNull j jVar, @NonNull o oVar, @NonNull Fragment fragment) {
        this.a = jVar;
        this.b = oVar;
        this.c = fragment;
    }

    private boolean l(@NonNull View view) {
        if (view == this.c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.c.performSaveInstanceState(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.mView != null) {
            t();
        }
        if (this.c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.mSavedViewState);
        }
        if (this.c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
        }
        if (!this.c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        j jVar = this.a;
        Fragment fragment2 = this.c;
        jVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    void c() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        m mVar = null;
        if (fragment2 != null) {
            m n = this.b.n(fragment2.mWho);
            if (n != null) {
                Fragment fragment3 = this.c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                mVar = n;
            } else {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (mVar = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (mVar != null) {
            mVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.mHost = fragment4.mFragmentManager.z0();
        Fragment fragment5 = this.c;
        fragment5.mParentFragment = fragment5.mFragmentManager.C0();
        this.a.g(this.c, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    int d() {
        v.e.b bVar;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.e;
        int i2 = b.a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = Math.min(i, -1);
                    } else {
                        i = Math.min(i, 0);
                    }
                } else {
                    i = Math.min(i, 1);
                }
            } else {
                i = Math.min(i, 5);
            }
        }
        Fragment fragment2 = this.c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.e, 2);
                View view = this.c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            bVar = v.n(viewGroup, fragment3.getParentFragmentManager()).l(this);
        } else {
            bVar = null;
        }
        if (bVar == v.e.b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == v.e.b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.c);
        }
        return i;
    }

    void e() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        if (!fragment.mIsCreated) {
            this.a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            j jVar = this.a;
            Fragment fragment3 = this.c;
            jVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.c.mState = 1;
    }

    void f() {
        String str;
        if (this.c.mFromLayout) {
            return;
        }
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.u0().c(this.c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.mContainerId) + " (" + str + ") for fragment " + this.c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        v64.n(this.c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.mView.setTag(sy8.a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (syb.X(this.c.mView)) {
                syb.r0(this.c.mView);
            } else {
                View view2 = this.c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.c.performViewCreated();
            j jVar = this.a;
            Fragment fragment7 = this.c;
            jVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.c.mView.getVisibility();
            this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
            Fragment fragment8 = this.c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.c.setFocusedView(findFocus);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                    }
                }
                this.c.mView.setAlpha(0.0f);
            }
        }
        this.c.mState = 2;
    }

    void g() {
        boolean z;
        Fragment f;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Fragment fragment2 = this.c;
            if (!fragment2.mBeingSaved) {
                this.b.B(fragment2.mWho, null);
            }
        }
        if (!z && !this.b.p().r(this.c)) {
            String str = this.c.mTargetWho;
            if (str != null && (f = this.b.f(str)) != null && f.mRetainInstance) {
                this.c.mTarget = f;
            }
            this.c.mState = 0;
            return;
        }
        h<?> hVar = this.c.mHost;
        if (hVar instanceof vzb) {
            z2 = this.b.p().o();
        } else if (hVar.f() instanceof Activity) {
            z2 = true ^ ((Activity) hVar.f()).isChangingConfigurations();
        }
        if ((z && !this.c.mBeingSaved) || z2) {
            this.b.p().g(this.c);
        }
        this.c.performDestroy();
        this.a.d(this.c, false);
        for (m mVar : this.b.k()) {
            if (mVar != null) {
                Fragment k = mVar.k();
                if (this.c.mWho.equals(k.mTargetWho)) {
                    k.mTarget = this.c;
                    k.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.b.f(str2);
        }
        this.b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.n(null);
        this.c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.performDetach();
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((fragment.mRemoving && !fragment.isInBackStack()) || this.b.p().r(this.c)) {
            if (FragmentManager.M0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.c);
            }
            this.c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.M0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(sy8.a, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                j jVar = this.a;
                Fragment fragment5 = this.c;
                jVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Fragment k() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int d = d();
                Fragment fragment = this.c;
                int i = fragment.mState;
                if (d != i) {
                    if (d > i) {
                        switch (i + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    v.n(viewGroup3, fragment.getParentFragmentManager()).b(v.e.c.i(this.c.mView.getVisibility()), this);
                                }
                                this.c.mState = 4;
                                continue;
                            case 5:
                                v();
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                if (fragment.mBeingSaved && this.b.q(fragment.mWho) == null) {
                                    s();
                                }
                                g();
                                continue;
                            case 1:
                                h();
                                this.c.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.M0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                                }
                                Fragment fragment2 = this.c;
                                if (fragment2.mBeingSaved) {
                                    s();
                                } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                    t();
                                }
                                Fragment fragment3 = this.c;
                                if (fragment3.mView != null && (viewGroup2 = fragment3.mContainer) != null) {
                                    v.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                }
                                this.c.mState = 3;
                                continue;
                            case 4:
                                w();
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z = true;
                } else {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.c.mBeingSaved) {
                        if (FragmentManager.M0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.c);
                        }
                        this.b.p().g(this.c);
                        this.b.s(this);
                        if (FragmentManager.M0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.c);
                        }
                        this.c.initState();
                    }
                    Fragment fragment4 = this.c;
                    if (fragment4.mHiddenChanged) {
                        if (fragment4.mView != null && (viewGroup = fragment4.mContainer) != null) {
                            v n = v.n(viewGroup, fragment4.getParentFragmentManager());
                            if (this.c.mHidden) {
                                n.c(this);
                            } else {
                                n.e(this);
                            }
                        }
                        Fragment fragment5 = this.c;
                        FragmentManager fragmentManager = fragment5.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.K0(fragment5);
                        }
                        Fragment fragment6 = this.c;
                        fragment6.mHiddenChanged = false;
                        fragment6.onHiddenChanged(fragment6.mHidden);
                        this.c.mChildFragmentManager.L();
                    }
                    this.d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (!fragment6.mUserVisibleHint) {
            fragment6.mDeferStart = true;
        }
    }

    void p() {
        String str;
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment.SavedState r() {
        Bundle q;
        if (this.c.mState <= -1 || (q = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        FragmentState fragmentState = new FragmentState(this.c);
        Fragment fragment = this.c;
        if (fragment.mState > -1 && fragmentState.m == null) {
            Bundle q = q();
            fragmentState.m = q;
            if (this.c.mTargetWho != null) {
                if (q == null) {
                    fragmentState.m = new Bundle();
                }
                fragmentState.m.putString("android:target_state", this.c.mTargetWho);
                int i = this.c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.m.putInt("android:target_req_state", i);
                }
            }
        } else {
            fragmentState.m = fragment.mSavedFragmentState;
        }
        this.b.B(this.c.mWho, fragmentState);
    }

    void t() {
        if (this.c.mView == null) {
            return;
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.c + " with view " + this.c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.mViewLifecycleOwner.e(bundle);
        if (!bundle.isEmpty()) {
            this.c.mSavedViewRegistryState = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i) {
        this.e = i;
    }

    void v() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    void w() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@NonNull j jVar, @NonNull o oVar, @NonNull ClassLoader classLoader, @NonNull g gVar, @NonNull FragmentState fragmentState) {
        this.a = jVar;
        this.b = oVar;
        Fragment a2 = fragmentState.a(gVar, classLoader);
        this.c = a2;
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@NonNull j jVar, @NonNull o oVar, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.a = jVar;
        this.b = oVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            syb.r0(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
