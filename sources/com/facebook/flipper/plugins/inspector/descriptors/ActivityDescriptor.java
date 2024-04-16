package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Window;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import com.facebook.flipper.plugins.inspector.descriptors.utils.ContextDescriptorUtils;
import com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ActivityDescriptor extends NodeDescriptor<Activity> {
    private static final String TAG = "ActivityDescriptor";

    private static List<Object> getDialogFragments(FragmentCompat fragmentCompat, Activity activity) {
        List list;
        if (fragmentCompat != null && fragmentCompat.getFragmentActivityClass().isInstance(activity)) {
            Object fragmentManager = fragmentCompat.forFragmentActivity().getFragmentManager(activity);
            if (fragmentManager == null) {
                return Collections.EMPTY_LIST;
            }
            try {
                list = fragmentCompat.forFragmentManager().getAddedFragments(fragmentManager);
            } catch (Exception e) {
                Log.e(TAG, "Failed to obtain list of fragments.", e);
                list = null;
            }
            if (list == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (fragmentCompat.getDialogFragmentClass().isInstance(obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(Activity activity) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(Activity activity) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(Activity activity, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) throws Exception {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(Activity activity) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(Activity activity, int i) {
        if (activity.getWindow() != null) {
            if (i == 0) {
                return activity.getWindow();
            }
            i--;
        }
        List<Object> dialogFragments = getDialogFragments(FragmentCompat.getSupportLibInstance(), activity);
        if (i < dialogFragments.size()) {
            return dialogFragments.get(i);
        }
        return getDialogFragments(FragmentCompat.getFrameworkInstance(), activity).get(i - dialogFragments.size());
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(Activity activity) {
        return (activity.getWindow() != null ? 1 : 0) + getDialogFragments(FragmentCompat.getSupportLibInstance(), activity).size() + getDialogFragments(FragmentCompat.getFrameworkInstance(), activity).size();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(Activity activity) {
        return Collections.singletonList(new Named("Theme", ContextDescriptorUtils.themeData(activity)));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(Activity activity) {
        return Integer.toString(System.identityHashCode(activity));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(Activity activity, boolean z) throws Exception {
        return descriptorForClass(Window.class).getSnapshot(activity.getWindow(), z);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(Activity activity, Touch touch) {
        touch.continueWithOffset(0, 0, 0);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, Activity activity) throws Exception {
        return descriptorForClass(Object.class).matches(str, activity);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Activity activity, boolean z, boolean z2) throws Exception {
        descriptorForClass(Window.class).setHighlighted(activity.getWindow(), z, z2);
    }
}
