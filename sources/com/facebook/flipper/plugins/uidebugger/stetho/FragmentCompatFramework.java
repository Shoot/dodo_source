package com.facebook.flipper.plugins.uidebugger.stetho;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.view.View;
import com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FragmentCompatFramework.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \"2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005\"#$%&B\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006'"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;", "Landroid/app/Fragment;", "Landroid/app/DialogFragment;", "Landroid/app/FragmentManager;", "Landroid/app/Activity;", "()V", "dialogFragmentClass", "Ljava/lang/Class;", "getDialogFragmentClass", "()Ljava/lang/Class;", "fragmentActivityClass", "getFragmentActivityClass", "fragmentClass", "getFragmentClass", "findFragmentForViewInActivity", "", "activity", "view", "Landroid/view/View;", "findFragmentForViewInFragment", "fragment", "findFragmentForViewInFragmentManager", "fragmentManager", "forDialogFragment", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$DialogFragmentAccessorFramework;", "forFragment", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb;", "forFragmentActivity", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentActivityAccessorFramework;", "forFragmentManager", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat$FragmentManagerAccessorViaReflection;", "getFragments", "", "Companion", "DialogFragmentAccessorFramework", "FragmentAccessorFrameworkHoneycomb", "FragmentAccessorFrameworkJellyBean", "FragmentActivityAccessorFramework", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentCompatFramework extends FragmentCompat<Fragment, DialogFragment, FragmentManager, Activity> {
    private static DialogFragmentAccessorFramework dialogFragmentAccessor;
    private static FragmentAccessorFrameworkHoneycomb fragmentAccessor;
    public static final Companion Companion = new Companion(null);
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> fragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorFramework fragmentActivityAccessor = new FragmentActivityAccessorFramework();

    /* compiled from: FragmentCompatFramework.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$Companion;", "", "()V", "dialogFragmentAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$DialogFragmentAccessorFramework;", "fragmentAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb;", "fragmentActivityAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentActivityAccessorFramework;", "fragmentManagerAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat$FragmentManagerAccessorViaReflection;", "Landroid/app/FragmentManager;", "Landroid/app/Fragment;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FragmentCompatFramework.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$DialogFragmentAccessorFramework;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/DialogFragmentAccessor;", "Landroid/app/DialogFragment;", "Landroid/app/Fragment;", "Landroid/app/FragmentManager;", "fragmentAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "(Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;)V", "getFragmentAccessor", "()Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "getChildFragmentManager", "fragment", "getDialog", "Landroid/app/Dialog;", "dialogFragment", "getFragmentManager", "getId", "", "getResources", "Landroid/content/res/Resources;", "getTag", "", "getView", "Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DialogFragmentAccessorFramework implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> {
        private final FragmentAccessor<Fragment, FragmentManager> fragmentAccessor;

        public DialogFragmentAccessorFramework(FragmentAccessor<Fragment, FragmentManager> fragmentAccessor) {
            z65.h(fragmentAccessor, "fragmentAccessor");
            this.fragmentAccessor = fragmentAccessor;
        }

        public final FragmentAccessor<Fragment, FragmentManager> getFragmentAccessor() {
            return this.fragmentAccessor;
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return this.fragmentAccessor.getChildFragmentManager(fragment);
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.DialogFragmentAccessor
        public Dialog getDialog(DialogFragment dialogFragment) {
            z65.h(dialogFragment, "dialogFragment");
            Dialog dialog = dialogFragment.getDialog();
            z65.g(dialog, "dialogFragment.dialog");
            return dialog;
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return this.fragmentAccessor.getFragmentManager(fragment);
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public int getId(Fragment fragment) {
            z65.h(fragment, "fragment");
            return this.fragmentAccessor.getId(fragment);
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public Resources getResources(Fragment fragment) {
            z65.h(fragment, "fragment");
            return this.fragmentAccessor.getResources(fragment);
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public String getTag(Fragment fragment) {
            z65.h(fragment, "fragment");
            return this.fragmentAccessor.getTag(fragment);
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public View getView(Fragment fragment) {
            z65.h(fragment, "fragment");
            return this.fragmentAccessor.getView(fragment);
        }
    }

    /* compiled from: FragmentCompatFramework.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "Landroid/app/Fragment;", "Landroid/app/FragmentManager;", "()V", "getChildFragmentManager", "fragment", "getFragmentManager", "getId", "", "getResources", "Landroid/content/res/Resources;", "getTag", "", "getView", "Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static class FragmentAccessorFrameworkHoneycomb implements FragmentAccessor<Fragment, FragmentManager> {
        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return null;
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getFragmentManager();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public int getId(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getId();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public Resources getResources(Fragment fragment) {
            z65.h(fragment, "fragment");
            Resources resources = fragment.getResources();
            z65.g(resources, "fragment.resources");
            return resources;
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public String getTag(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getTag();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public View getView(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getView();
        }
    }

    /* compiled from: FragmentCompatFramework.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentAccessorFrameworkJellyBean;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb;", "()V", "getChildFragmentManager", "Landroid/app/FragmentManager;", "fragment", "Landroid/app/Fragment;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @TargetApi(17)
    /* loaded from: classes2.dex */
    public static final class FragmentAccessorFrameworkJellyBean extends FragmentAccessorFrameworkHoneycomb {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompatFramework.FragmentAccessorFrameworkHoneycomb, com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getChildFragmentManager();
        }
    }

    /* compiled from: FragmentCompatFramework.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatFramework$FragmentActivityAccessorFramework;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentActivityAccessor;", "Landroid/app/Activity;", "Landroid/app/FragmentManager;", "()V", "getFragmentManager", "activity", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FragmentActivityAccessorFramework implements FragmentActivityAccessor<Activity, FragmentManager> {
        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentActivityAccessor
        public FragmentManager getFragmentManager(Activity activity) {
            z65.h(activity, "activity");
            return activity.getFragmentManager();
        }
    }

    static {
        FragmentAccessorFrameworkJellyBean fragmentAccessorFrameworkJellyBean = new FragmentAccessorFrameworkJellyBean();
        fragmentAccessor = fragmentAccessorFrameworkJellyBean;
        dialogFragmentAccessor = new DialogFragmentAccessorFramework(fragmentAccessorFrameworkJellyBean);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object findFragmentForViewInFragmentManager(android.app.FragmentManager r6, android.view.View r7) {
        /*
            r5 = this;
            com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat$FragmentManagerAccessorViaReflection r0 = r5.forFragmentManager2()
            r1 = 0
            if (r0 != 0) goto L8
            goto Le
        L8:
            java.util.List r6 = r0.getAddedFragments(r6)     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
        Le:
            r6 = r1
        Lf:
            if (r6 == 0) goto L2c
            int r0 = r6.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2c
            r2 = 0
        L1a:
            int r3 = r2 + 1
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r4 = r5.findFragmentForViewInFragment(r4, r7)
            if (r4 == 0) goto L27
            return r4
        L27:
            if (r2 != r0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L1a
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompatFramework.findFragmentForViewInFragmentManager(android.app.FragmentManager, android.view.View):java.lang.Object");
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Object findFragmentForViewInActivity(Activity activity, View view) {
        FragmentManager fragmentManager;
        z65.h(activity, "activity");
        z65.h(view, "view");
        if (!getFragmentActivityClass().isInstance(activity)) {
            return null;
        }
        FragmentActivityAccessor<Activity, FragmentManager> forFragmentActivity = forFragmentActivity();
        if (forFragmentActivity == null) {
            fragmentManager = null;
        } else {
            fragmentManager = forFragmentActivity.getFragmentManager(activity);
        }
        if (fragmentManager == null) {
            return null;
        }
        return findFragmentForViewInFragmentManager(fragmentManager, view);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb] */
    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Object findFragmentForViewInFragment(Object obj, View view) {
        ?? forFragment;
        z65.h(obj, "fragment");
        z65.h(view, "view");
        if (!getFragmentClass().isInstance(obj) || (forFragment = forFragment()) == 0) {
            return null;
        }
        Fragment fragment = (Fragment) obj;
        if (forFragment.getView(fragment) == view) {
            return obj;
        }
        FragmentManager childFragmentManager = forFragment.getChildFragmentManager(fragment);
        if (childFragmentManager == null) {
            return null;
        }
        return findFragmentForViewInFragmentManager(childFragmentManager, view);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment() {
        return dialogFragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public FragmentAccessor<Fragment, FragmentManager> forFragment() {
        return fragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public FragmentActivityAccessor<Activity, FragmentManager> forFragmentActivity() {
        return fragmentActivityAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    /* renamed from: forFragmentManager */
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager2() {
        return fragmentManagerAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Class<DialogFragment> getDialogFragmentClass() {
        return DialogFragment.class;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Class<Activity> getFragmentActivityClass() {
        return Activity.class;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public List<Object> getFragments(Activity activity) {
        List<Object> l;
        List<Object> l2;
        List<Object> l3;
        z65.h(activity, "activity");
        if (!getFragmentActivityClass().isInstance(activity)) {
            l3 = kc1.l();
            return l3;
        }
        FragmentManager fragmentManager = forFragmentActivity().getFragmentManager(activity);
        if (fragmentManager == null) {
            l2 = kc1.l();
            return l2;
        }
        FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager2 = forFragmentManager2();
        List<Fragment> list = null;
        if (forFragmentManager2 != null) {
            try {
                list = forFragmentManager2.getAddedFragments(fragmentManager);
            } catch (Exception unused) {
            }
        }
        if (list == null) {
            l = kc1.l();
            return l;
        }
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Fragment fragment = list.get(i);
                Class<DialogFragment> dialogFragmentClass = getDialogFragmentClass();
                if (dialogFragmentClass != null) {
                    arrayList.add(Boolean.valueOf(dialogFragmentClass.isInstance(fragment)));
                }
                if (i == size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}
