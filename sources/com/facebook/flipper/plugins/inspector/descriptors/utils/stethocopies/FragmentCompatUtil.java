package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FragmentCompatUtil {
    private static final String TAG = "FragmentCompatUtil";

    private FragmentCompatUtil() {
    }

    public static Object findFragmentForView(View view) {
        Activity tryGetActivity = ViewUtil.tryGetActivity(view);
        if (tryGetActivity == null) {
            return null;
        }
        return findFragmentForViewInActivity(tryGetActivity, view);
    }

    private static Object findFragmentForViewInActivity(Activity activity, View view) {
        Object findFragmentForViewInActivity;
        Object findFragmentForViewInActivity2;
        FragmentCompat supportLibInstance = FragmentCompat.getSupportLibInstance();
        if (supportLibInstance == null || !supportLibInstance.getFragmentActivityClass().isInstance(activity) || (findFragmentForViewInActivity2 = findFragmentForViewInActivity(supportLibInstance, activity, view)) == null) {
            FragmentCompat frameworkInstance = FragmentCompat.getFrameworkInstance();
            if (frameworkInstance == null || (findFragmentForViewInActivity = findFragmentForViewInActivity(frameworkInstance, activity, view)) == null) {
                return null;
            }
            return findFragmentForViewInActivity;
        }
        return findFragmentForViewInActivity2;
    }

    private static Object findFragmentForViewInFragment(FragmentCompat fragmentCompat, Object obj, View view) {
        FragmentAccessor forFragment = fragmentCompat.forFragment();
        if (forFragment.getView(obj) == view) {
            return obj;
        }
        Object childFragmentManager = forFragment.getChildFragmentManager(obj);
        if (childFragmentManager != null) {
            return findFragmentForViewInFragmentManager(fragmentCompat, childFragmentManager, view);
        }
        return null;
    }

    private static Object findFragmentForViewInFragmentManager(FragmentCompat fragmentCompat, Object obj, View view) {
        List list;
        try {
            list = fragmentCompat.forFragmentManager().getAddedFragments(obj);
        } catch (Exception e) {
            List emptyList = Collections.emptyList();
            Log.e(TAG, "Failed to obtain list of fragments.", e);
            list = emptyList;
        }
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object findFragmentForViewInFragment = findFragmentForViewInFragment(fragmentCompat, list.get(i), view);
                if (findFragmentForViewInFragment != null) {
                    return findFragmentForViewInFragment;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean isDialogFragment(Object obj) {
        FragmentCompat supportLibInstance = FragmentCompat.getSupportLibInstance();
        if (supportLibInstance != null && supportLibInstance.getDialogFragmentClass().isInstance(obj)) {
            return true;
        }
        FragmentCompat frameworkInstance = FragmentCompat.getFrameworkInstance();
        if (frameworkInstance != null && frameworkInstance.getDialogFragmentClass().isInstance(obj)) {
            return true;
        }
        return false;
    }

    private static Object findFragmentForViewInActivity(FragmentCompat fragmentCompat, Activity activity, View view) {
        Object fragmentManager = fragmentCompat.forFragmentActivity().getFragmentManager(activity);
        if (fragmentManager != null) {
            return findFragmentForViewInFragmentManager(fragmentCompat, fragmentManager, view);
        }
        return null;
    }
}
