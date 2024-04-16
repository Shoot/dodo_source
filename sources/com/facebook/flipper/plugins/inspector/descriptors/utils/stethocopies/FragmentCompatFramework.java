package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.view.View;
import com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat;
@TargetApi(11)
/* loaded from: classes2.dex */
final class FragmentCompatFramework extends FragmentCompat<Fragment, DialogFragment, FragmentManager, Activity> {
    private static final DialogFragmentAccessorFramework sDialogFragmentAccessor;
    private static final FragmentAccessorFrameworkHoneycomb sFragmentAccessor;
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorFramework sFragmentActivityAccessor = new FragmentActivityAccessorFramework();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class DialogFragmentAccessorFramework implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> {
        private final FragmentAccessor<Fragment, FragmentManager> mFragmentAccessor;

        public DialogFragmentAccessorFramework(FragmentAccessor<Fragment, FragmentManager> fragmentAccessor) {
            this.mFragmentAccessor = fragmentAccessor;
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return this.mFragmentAccessor.getChildFragmentManager(fragment);
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.DialogFragmentAccessor
        public Dialog getDialog(DialogFragment dialogFragment) {
            return dialogFragment.getDialog();
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public FragmentManager getFragmentManager(Fragment fragment) {
            return this.mFragmentAccessor.getFragmentManager(fragment);
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public int getId(Fragment fragment) {
            return this.mFragmentAccessor.getId(fragment);
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public Resources getResources(Fragment fragment) {
            return this.mFragmentAccessor.getResources(fragment);
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public String getTag(Fragment fragment) {
            return this.mFragmentAccessor.getTag(fragment);
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public View getView(Fragment fragment) {
            return this.mFragmentAccessor.getView(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class FragmentAccessorFrameworkHoneycomb implements FragmentAccessor<Fragment, FragmentManager> {
        private FragmentAccessorFrameworkHoneycomb() {
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return null;
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public FragmentManager getFragmentManager(Fragment fragment) {
            return fragment.getFragmentManager();
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public int getId(Fragment fragment) {
            return fragment.getId();
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public Resources getResources(Fragment fragment) {
            return fragment.getResources();
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public String getTag(Fragment fragment) {
            return fragment.getTag();
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public View getView(Fragment fragment) {
            return fragment.getView();
        }
    }

    @TargetApi(17)
    /* loaded from: classes2.dex */
    private static class FragmentAccessorFrameworkJellyBean extends FragmentAccessorFrameworkHoneycomb {
        private FragmentAccessorFrameworkJellyBean() {
            super();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompatFramework.FragmentAccessorFrameworkHoneycomb, com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return fragment.getChildFragmentManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class FragmentActivityAccessorFramework implements FragmentActivityAccessor<Activity, FragmentManager> {
        private FragmentActivityAccessorFramework() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentActivityAccessor
        public FragmentManager getFragmentManager(Activity activity) {
            return activity.getFragmentManager();
        }
    }

    static {
        FragmentAccessorFrameworkJellyBean fragmentAccessorFrameworkJellyBean = new FragmentAccessorFrameworkJellyBean();
        sFragmentAccessor = fragmentAccessorFrameworkJellyBean;
        sDialogFragmentAccessor = new DialogFragmentAccessorFramework(fragmentAccessorFrameworkJellyBean);
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public FragmentAccessor<Fragment, FragmentManager> forFragment() {
        return sFragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public FragmentActivityAccessor<Activity, FragmentManager> forFragmentActivity() {
        return sFragmentActivityAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    /* renamed from: forFragmentManager */
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager2() {
        return sFragmentManagerAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public Class<DialogFragment> getDialogFragmentClass() {
        return DialogFragment.class;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public Class<Activity> getFragmentActivityClass() {
        return Activity.class;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }
}
