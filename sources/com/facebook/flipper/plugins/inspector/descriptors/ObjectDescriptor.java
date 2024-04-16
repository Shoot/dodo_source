package com.facebook.flipper.plugins.inspector.descriptors;

import android.graphics.Bitmap;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ObjectDescriptor extends NodeDescriptor<Object> {
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(Object obj) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(Object obj, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(Object obj) {
        return 0;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(Object obj) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(Object obj) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(Object obj) {
        return Integer.toString(System.identityHashCode(obj));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(Object obj) {
        return obj.getClass().getName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(Object obj, boolean z) throws Exception {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(Object obj, Touch touch) {
        touch.finish();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, Object obj) throws Exception {
        List<Named<String>> attributes;
        NodeDescriptor<?> descriptorForClass = descriptorForClass(obj.getClass());
        if (descriptorForClass == null) {
            attributes = Collections.emptyList();
        } else {
            attributes = descriptorForClass.getAttributes(obj);
        }
        for (Named<String> named : attributes) {
            if (named.getName().equals("id") && named.getValue().toLowerCase().contains(str)) {
                return true;
            }
        }
        if (descriptorForClass == null) {
            return false;
        }
        return descriptorForClass.getName(obj).toLowerCase().contains(str);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(Object obj) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Object obj, boolean z, boolean z2) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(Object obj, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
    }
}
