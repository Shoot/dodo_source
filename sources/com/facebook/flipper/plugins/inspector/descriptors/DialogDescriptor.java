package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.Window;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class DialogDescriptor extends NodeDescriptor<Dialog> {
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(Dialog dialog) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(Dialog dialog) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(Dialog dialog, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(Dialog dialog) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(Dialog dialog, int i) {
        return dialog.getWindow();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(Dialog dialog) {
        return dialog.getWindow() == null ? 0 : 1;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(Dialog dialog) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(Dialog dialog) {
        return Integer.toString(System.identityHashCode(dialog));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(Dialog dialog) {
        return dialog.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(Dialog dialog, boolean z) throws Exception {
        return descriptorForClass(Window.class).getSnapshot(dialog.getWindow(), z);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(Dialog dialog, Touch touch) {
        touch.continueWithOffset(0, 0, 0);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, Dialog dialog) throws Exception {
        return descriptorForClass(Object.class).matches(str, dialog);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Dialog dialog, boolean z, boolean z2) throws Exception {
        descriptorForClass(Window.class).setHighlighted(dialog.getWindow(), z, z2);
    }
}
