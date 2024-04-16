package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.graphics.Bitmap;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import java.util.List;
/* loaded from: classes2.dex */
public class DialogFragmentDescriptor extends NodeDescriptor<DialogFragment> {
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(DialogFragment dialogFragment) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(DialogFragment dialogFragment) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(DialogFragment dialogFragment) throws Exception {
        return descriptorForClass(Fragment.class).getAttributes(dialogFragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(DialogFragment dialogFragment, int i) {
        return dialogFragment.getDialog();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(DialogFragment dialogFragment) {
        return dialogFragment.getDialog() == null ? 0 : 1;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(DialogFragment dialogFragment) throws Exception {
        return descriptorForClass(Fragment.class).getData(dialogFragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(DialogFragment dialogFragment) {
        return descriptorForClass(Fragment.class).getExtraInfo(dialogFragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(DialogFragment dialogFragment) throws Exception {
        return descriptorForClass(Fragment.class).getId(dialogFragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(DialogFragment dialogFragment) throws Exception {
        return descriptorForClass(Fragment.class).getName(dialogFragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(DialogFragment dialogFragment, boolean z) throws Exception {
        NodeDescriptor<?> descriptorForClass = descriptorForClass(Dialog.class);
        if (dialogFragment.getDialog() != null) {
            return descriptorForClass.getSnapshot(dialogFragment.getDialog(), z);
        }
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(DialogFragment dialogFragment, Touch touch) {
        touch.continueWithOffset(0, 0, 0);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, DialogFragment dialogFragment) throws Exception {
        return descriptorForClass(Object.class).matches(str, dialogFragment);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(DialogFragment dialogFragment, boolean z, boolean z2) throws Exception {
        NodeDescriptor<?> descriptorForClass = descriptorForClass(Dialog.class);
        if (dialogFragment.getDialog() != null) {
            descriptorForClass.setHighlighted(dialogFragment.getDialog(), z, z2);
        }
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(DialogFragment dialogFragment, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) throws Exception {
        descriptorForClass(Fragment.class).setValue(dialogFragment, strArr, flipperValueHint, flipperDynamic);
    }
}
