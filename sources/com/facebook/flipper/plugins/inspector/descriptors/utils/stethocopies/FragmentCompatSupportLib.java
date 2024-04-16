package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat;
/* loaded from: classes2.dex */
final class FragmentCompatSupportLib extends FragmentCompat<Fragment, c, FragmentManager, d> {
    private static final FragmentAccessorSupportLib sFragmentAccessor = new FragmentAccessorSupportLib();
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<c, Fragment, FragmentManager> {
        private DialogFragmentAccessorSupportLib() {
            super();
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.DialogFragmentAccessor
        public Dialog getDialog(c cVar) {
            return cVar.getDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, FragmentManager> {
        private FragmentAccessorSupportLib() {
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return fragment.getChildFragmentManager();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<d, FragmentManager> {
        private FragmentActivityAccessorSupportLib() {
        }

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentActivityAccessor
        public FragmentManager getFragmentManager(d dVar) {
            return dVar.getSupportFragmentManager();
        }
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public DialogFragmentAccessor<c, Fragment, FragmentManager> forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public FragmentAccessor<Fragment, FragmentManager> forFragment() {
        return sFragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public FragmentActivityAccessor<d, FragmentManager> forFragmentActivity() {
        return sFragmentActivityAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager() {
        return sFragmentManagerAccessor;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public Class<c> getDialogFragmentClass() {
        return c.class;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public Class<d> getFragmentActivityClass() {
        return d.class;
    }

    @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }
}
