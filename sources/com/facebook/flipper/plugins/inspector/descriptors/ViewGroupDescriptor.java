package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.flipper.R;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.facebook.flipper.plugins.inspector.HiddenNode;
import com.facebook.flipper.plugins.inspector.InspectorValue;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.FragmentCompatUtil;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ViewGroupDescriptor extends NodeDescriptor<ViewGroup> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class NodeKey {
        private int[] mKey;

        private NodeKey() {
        }

        boolean set(ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            int[] iArr = new int[childCount];
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                iArr[i] = System.identityHashCode(viewGroup.getChildAt(i));
            }
            int[] iArr2 = this.mKey;
            if (iArr2 != null && iArr2.length == childCount) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (this.mKey[i2] == iArr[i2]) {
                    }
                }
                this.mKey = iArr;
                return z;
            }
            z = true;
            this.mKey = iArr;
            return z;
        }
    }

    private static Object getAttachedFragmentForView(View view) {
        boolean isAdded;
        try {
            Object findFragmentForView = FragmentCompatUtil.findFragmentForView(view);
            if (findFragmentForView instanceof Fragment) {
                isAdded = ((Fragment) findFragmentForView).isAdded();
            } else if (!(findFragmentForView instanceof androidx.fragment.app.Fragment)) {
                return null;
            } else {
                isAdded = ((androidx.fragment.app.Fragment) findFragmentForView).isAdded();
            }
            if (!isAdded) {
                return null;
            }
            return findFragmentForView;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static boolean hasTag(View view, int i) {
        Object tag = view.getTag(i);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            return true;
        }
        return false;
    }

    private static boolean hasVisibleChildren(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    private void runHitTest(ViewGroup viewGroup, Touch touch) {
        boolean z = true;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (!(childAt instanceof HiddenNode) && childAt.getVisibility() == 0 && !shouldSkip(childAt)) {
                int scrollX = viewGroup.getScrollX();
                int scrollY = viewGroup.getScrollY();
                int left = (childAt.getLeft() + ((int) childAt.getTranslationX())) - scrollX;
                int top = (childAt.getTop() + ((int) childAt.getTranslationY())) - scrollY;
                if (touch.containedIn(left, top, (childAt.getRight() + ((int) childAt.getTranslationX())) - scrollX, (childAt.getBottom() + ((int) childAt.getTranslationY())) - scrollY)) {
                    touch.continueWithOffset(childCount, left, top);
                    z = false;
                }
            }
        }
        if (z) {
            touch.finish();
        }
    }

    private static boolean shouldSkip(View view) {
        if (hasTag(view, R.id.flipper_skip_view_traversal)) {
            return true;
        }
        if ((view instanceof ViewGroup) && hasTag(view, R.id.flipper_skip_empty_view_group_traversal) && !hasVisibleChildren((ViewGroup) view)) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(ViewGroup viewGroup) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void axHitTest(ViewGroup viewGroup, Touch touch) {
        runHitTest(viewGroup, touch);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAXAttributes(ViewGroup viewGroup) throws Exception {
        return descriptorForClass(View.class).getAXAttributes(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getAXChildAt(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof HiddenNode) && i2 >= i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getAXData(ViewGroup viewGroup) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(descriptorForClass(View.class).getAXData(viewGroup));
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXDecoration(ViewGroup viewGroup) throws Exception {
        return descriptorForClass(View.class).getAXDecoration(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXName(ViewGroup viewGroup) throws Exception {
        return descriptorForClass(View.class).getAXName(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(ViewGroup viewGroup) throws Exception {
        return descriptorForClass(View.class).getAttributes(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof HiddenNode) && i2 >= i) {
                Object attachedFragmentForView = getAttachedFragmentForView(childAt);
                return (attachedFragmentForView == null || FragmentCompatUtil.isDialogFragment(attachedFragmentForView)) ? childAt : attachedFragmentForView;
            }
        }
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (!(viewGroup.getChildAt(i2) instanceof HiddenNode)) {
                i++;
            }
        }
        return i;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(ViewGroup viewGroup) throws Exception {
        ArrayList arrayList = new ArrayList();
        NodeDescriptor<?> descriptorForClass = descriptorForClass(View.class);
        FlipperObject.Builder builder = new FlipperObject.Builder();
        FlipperObject.Builder put = builder.put("layoutMode", (FlipperValue) InspectorValue.mutable(InspectorValue.Type.Enum, viewGroup.getLayoutMode() == 0 ? "LAYOUT_MODE_CLIP_BOUNDS" : "LAYOUT_MODE_OPTICAL_BOUNDS"));
        InspectorValue.Type<Boolean> type = InspectorValue.Type.Boolean;
        put.put("clipChildren", (FlipperValue) InspectorValue.mutable(type, Boolean.valueOf(viewGroup.getClipChildren())));
        builder.put("clipToPadding", (FlipperValue) InspectorValue.mutable(type, Boolean.valueOf(viewGroup.getClipToPadding())));
        arrayList.add(0, new Named("ViewGroup", builder.build()));
        arrayList.addAll(descriptorForClass.getData(viewGroup));
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(ViewGroup viewGroup) {
        return descriptorForClass(View.class).getExtraInfo(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(ViewGroup viewGroup) throws Exception {
        return descriptorForClass(View.class).getId(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(ViewGroup viewGroup) throws Exception {
        return descriptorForClass(View.class).getName(viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(ViewGroup viewGroup, boolean z) throws Exception {
        return descriptorForClass(View.class).getSnapshot(viewGroup, true);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(ViewGroup viewGroup, Touch touch) {
        runHitTest(viewGroup, touch);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(final ViewGroup viewGroup) {
        final NodeKey nodeKey = new NodeKey();
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection != null) {
            viewGroup.postDelayed(new ErrorReportingRunnable(flipperConnection) { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewGroupDescriptor.1
                @Override // com.facebook.flipper.core.ErrorReportingRunnable
                public void runOrThrow() throws Exception {
                    if (ViewGroupDescriptor.this.connected()) {
                        if (nodeKey.set(viewGroup)) {
                            NodeDescriptor descriptorForClass = ViewGroupDescriptor.this.descriptorForClass(viewGroup.getClass());
                            if (descriptorForClass != null) {
                                descriptorForClass.invalidate(viewGroup);
                            }
                            ViewGroupDescriptor.this.invalidateAX(viewGroup);
                        }
                        if (viewGroup.isAttachedToWindow()) {
                            viewGroup.postDelayed(this, 1000L);
                        }
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, ViewGroup viewGroup) throws Exception {
        return descriptorForClass(Object.class).matches(str, viewGroup);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(ViewGroup viewGroup, boolean z, boolean z2) throws Exception {
        descriptorForClass(View.class).setHighlighted(viewGroup, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(ViewGroup viewGroup, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) throws Exception {
        char c;
        String str = strArr[0];
        str.hashCode();
        if (!str.equals("ViewGroup")) {
            descriptorForClass(View.class).setValue(viewGroup, strArr, flipperValueHint, flipperDynamic);
        } else {
            String str2 = strArr[1];
            str2.hashCode();
            switch (str2.hashCode()) {
                case 341443565:
                    if (str2.equals("layoutMode")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1090721135:
                    if (str2.equals("clipChildren")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1372310438:
                    if (str2.equals("clipToPadding")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String asString = flipperDynamic.asString();
                    asString.hashCode();
                    if (!asString.equals("LAYOUT_MODE_CLIP_BOUNDS")) {
                        if (!asString.equals("LAYOUT_MODE_OPTICAL_BOUNDS")) {
                            viewGroup.setLayoutMode(-1);
                            break;
                        } else {
                            viewGroup.setLayoutMode(1);
                            break;
                        }
                    } else {
                        viewGroup.setLayoutMode(0);
                        break;
                    }
                case 1:
                    viewGroup.setClipChildren(flipperDynamic.asBoolean());
                    break;
                case 2:
                    viewGroup.setClipToPadding(flipperDynamic.asBoolean());
                    break;
            }
        }
        invalidate(viewGroup);
    }
}
