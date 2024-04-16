package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Dialog;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import java.util.List;
/* loaded from: classes2.dex */
public class SupportDialogFragmentDescriptor extends NodeDescriptor<c> {
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(c cVar) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(c cVar) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(c cVar) throws Exception {
        return descriptorForClass(Fragment.class).getAttributes(cVar);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(c cVar, int i) {
        return cVar.getDialog();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(c cVar) {
        return cVar.getDialog() == null ? 0 : 1;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(c cVar) throws Exception {
        return descriptorForClass(Fragment.class).getData(cVar);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(c cVar) {
        return descriptorForClass(Fragment.class).getExtraInfo(cVar);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(c cVar) throws Exception {
        return descriptorForClass(Fragment.class).getId(cVar);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(c cVar) throws Exception {
        return descriptorForClass(Fragment.class).getName(cVar);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(c cVar, boolean z) throws Exception {
        NodeDescriptor<?> descriptorForClass = descriptorForClass(Dialog.class);
        if (cVar.getDialog() != null) {
            return descriptorForClass.getSnapshot(cVar.getDialog(), z);
        }
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(c cVar, Touch touch) {
        touch.continueWithOffset(0, 0, 0);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, c cVar) throws Exception {
        return descriptorForClass(Object.class).matches(str, cVar);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(c cVar, boolean z, boolean z2) throws Exception {
        NodeDescriptor<?> descriptorForClass = descriptorForClass(Dialog.class);
        if (cVar.getDialog() != null) {
            descriptorForClass.setHighlighted(cVar.getDialog(), z, z2);
        }
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(c cVar, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) throws Exception {
        descriptorForClass(Fragment.class).setValue(cVar, strArr, flipperValueHint, flipperDynamic);
    }
}
