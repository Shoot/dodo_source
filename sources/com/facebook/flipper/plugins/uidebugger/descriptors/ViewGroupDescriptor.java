package com.facebook.flipper.plugins.uidebugger.descriptors;

import android.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.flipper.plugins.uidebugger.common.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ViewGroupDescriptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ViewGroupDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/AbstractChainedDescriptor;", "Landroid/view/ViewGroup;", "()V", "init", "", "onGetChildren", "viewGroup", "children", "", "", "onGetData", "builder", "", "", "onGetId", "onGetName", "Companion", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewGroupDescriptor extends AbstractChainedDescriptor<ViewGroup> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: ViewGroupDescriptor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ViewGroupDescriptor$Companion;", "", "()V", "getAttachedFragmentForView", "v", "Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAttachedFragmentForView(View view) {
            boolean isAdded;
            try {
                Object findFragmentForView = FragmentCompat.Companion.findFragmentForView(view);
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
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(ViewGroup viewGroup, List list) {
        onGetChildren2(viewGroup, (List<Object>) list);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetData(ViewGroup viewGroup, Map map) {
        onGetData2(viewGroup, (Map<String, Object>) map);
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(ViewGroup viewGroup, List<Object> list) {
        z65.h(viewGroup, "viewGroup");
        z65.h(list, "children");
        int childCount = viewGroup.getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            z65.g(childAt, "viewGroup.getChildAt(i)");
            Object attachedFragmentForView = Companion.getAttachedFragmentForView(childAt);
            if (attachedFragmentForView != null && !FragmentCompat.Companion.isDialogFragment(attachedFragmentForView)) {
                list.add(attachedFragmentForView);
            } else {
                list.add(childAt);
            }
            if (i == childCount) {
                return;
            }
            i = i2;
        }
    }

    /* renamed from: onGetData  reason: avoid collision after fix types in other method */
    public void onGetData2(ViewGroup viewGroup, Map<String, Object> map) {
        z65.h(viewGroup, "viewGroup");
        z65.h(map, "builder");
        Log.d("FLIPPER_LAYOUT", "[viewgroup] onGetData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InspectableValue.Companion companion = InspectableValue.Companion;
        InspectableValue.Type.Companion companion2 = InspectableValue.Type.Companion;
        linkedHashMap.put("LayoutMode", companion.mutable(companion2.getEnum(), viewGroup.getLayoutMode() == 0 ? "LAYOUT_MODE_CLIP_BOUNDS" : "LAYOUT_MODE_OPTICAL_BOUNDS"));
        linkedHashMap.put("ClipChildren", companion.mutable(companion2.getBoolean(), Boolean.valueOf(viewGroup.getClipChildren())));
        linkedHashMap.put("ClipToPadding", companion.mutable(companion2.getBoolean(), Boolean.valueOf(viewGroup.getClipToPadding())));
        map.put("ViewGroup", linkedHashMap);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetId(ViewGroup viewGroup) {
        z65.h(viewGroup, "viewGroup");
        String num = Integer.toString(System.identityHashCode(viewGroup));
        z65.g(num, "toString(System.identityHashCode(viewGroup))");
        return num;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetName(ViewGroup viewGroup) {
        z65.h(viewGroup, "viewGroup");
        String simpleName = viewGroup.getClass().getSimpleName();
        z65.g(simpleName, "viewGroup.javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor, com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void init() {
    }
}
