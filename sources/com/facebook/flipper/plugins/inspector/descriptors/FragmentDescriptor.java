package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.ResourcesUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class FragmentDescriptor extends NodeDescriptor<Fragment> {
    private static String getResourceId(Fragment fragment) {
        Object host;
        Context context;
        int id = fragment.getId();
        if (id != -1) {
            host = fragment.getHost();
            if (host != null) {
                context = fragment.getContext();
                return ResourcesUtil.getIdStringQuietly(context, fragment.getResources(), id);
            }
            return null;
        }
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(Fragment fragment) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(Fragment fragment) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(Fragment fragment, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(Fragment fragment) {
        String resourceId = getResourceId(fragment);
        return resourceId == null ? Collections.EMPTY_LIST : Arrays.asList(new Named("id", resourceId));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(Fragment fragment, int i) {
        return fragment.getView();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(Fragment fragment) {
        return fragment.getView() == null ? 0 : 1;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null && !arguments.isEmpty()) {
            FlipperObject.Builder builder = new FlipperObject.Builder();
            for (String str : arguments.keySet()) {
                builder.put(str, arguments.get(str));
            }
            return Arrays.asList(new Named("Arguments", builder.build()));
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(Fragment fragment) {
        return new FlipperObject.Builder().put("expandWithParent", Boolean.TRUE).build();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(Fragment fragment) {
        return Integer.toString(System.identityHashCode(fragment));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(Fragment fragment) {
        return fragment.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(Fragment fragment, boolean z) throws Exception {
        if (fragment.getView() == null) {
            return null;
        }
        return descriptorForClass(View.class).getSnapshot(fragment.getView(), z);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(Fragment fragment, Touch touch) {
        touch.continueWithOffset(0, 0, 0);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, Fragment fragment) throws Exception {
        String resourceId = getResourceId(fragment);
        if (resourceId == null || !resourceId.toLowerCase().contains(str)) {
            return descriptorForClass(Object.class).matches(str, fragment);
        }
        return true;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Fragment fragment, boolean z, boolean z2) throws Exception {
        if (fragment.getView() == null) {
            return;
        }
        descriptorForClass(View.class).setHighlighted(fragment.getView(), z, z2);
    }
}
