package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.app.Activity;
import android.app.FragmentManager;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class FragmentCompat<FRAGMENT, DIALOG_FRAGMENT, FRAGMENT_MANAGER, FRAGMENT_ACTIVITY extends Activity> {
    private static FragmentCompat sFrameworkInstance;
    private static final boolean sHasSupportFragment;
    private static FragmentCompat sSupportInstance;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class FragmentManagerAccessorViaReflection<FRAGMENT_MANAGER, FRAGMENT> implements FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
        private Field mFieldMAdded;

        @Override // com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentManagerAccessor
        public List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragment_manager) {
            Field tryGetDeclaredField;
            if (fragment_manager instanceof FragmentManager) {
                if (this.mFieldMAdded == null && (tryGetDeclaredField = ReflectionUtil.tryGetDeclaredField(fragment_manager.getClass(), "mAdded")) != null) {
                    tryGetDeclaredField.setAccessible(true);
                    this.mFieldMAdded = tryGetDeclaredField;
                }
            } else if (fragment_manager instanceof androidx.fragment.app.FragmentManager) {
                return (List<FRAGMENT>) ((androidx.fragment.app.FragmentManager) fragment_manager).y0();
            }
            return Collections.emptyList();
        }
    }

    static {
        boolean z;
        if (ReflectionUtil.tryGetClassForName("androidx.fragment.app.Fragment") != null) {
            z = true;
        } else {
            z = false;
        }
        sHasSupportFragment = z;
    }

    public static FragmentCompat getFrameworkInstance() {
        if (sFrameworkInstance == null) {
            sFrameworkInstance = new FragmentCompatFramework();
        }
        return sFrameworkInstance;
    }

    public static FragmentCompat getSupportLibInstance() {
        if (sSupportInstance == null && sHasSupportFragment) {
            sSupportInstance = new FragmentCompatSupportLib();
        }
        return sSupportInstance;
    }

    public abstract DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> forDialogFragment();

    public abstract FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> forFragment();

    public abstract FragmentActivityAccessor<FRAGMENT_ACTIVITY, FRAGMENT_MANAGER> forFragmentActivity();

    public abstract FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> forFragmentManager();

    public abstract Class<DIALOG_FRAGMENT> getDialogFragmentClass();

    public abstract Class<FRAGMENT_ACTIVITY> getFragmentActivityClass();

    public abstract Class<FRAGMENT> getFragmentClass();
}
