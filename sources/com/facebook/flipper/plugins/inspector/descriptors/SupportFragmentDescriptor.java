package com.facebook.flipper.plugins.inspector.descriptors;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
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
public class SupportFragmentDescriptor extends NodeDescriptor<Fragment> {
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
        int id = fragment.getId();
        if (id != -1 && fragment.getHost() != null) {
            return Arrays.asList(new Named("id", ResourcesUtil.getIdStringQuietly(fragment.getContext(), fragment.getResources(), id)));
        }
        return Collections.EMPTY_LIST;
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
        return new FlipperObject.Builder().put("nonAXWithAXChild", Boolean.TRUE).build();
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
        return descriptorForClass(Object.class).matches(str, fragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Fragment fragment, boolean z, boolean z2) throws Exception {
        if (fragment.getView() == null) {
            return;
        }
        descriptorForClass(View.class).setHighlighted(fragment.getView(), z, z2);
    }
}
