package com.facebook.flipper.plugins.uidebugger.descriptors;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.flipper.plugins.uidebugger.common.EnumMapping;
import com.facebook.flipper.plugins.uidebugger.common.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.stetho.ResourcesUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ViewDescriptor.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\u0006J\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0015\u001a\u00020\u0002J\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\u0006\u0010\u0015\u001a\u00020\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ViewDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/AbstractChainedDescriptor;", "Landroid/view/View;", "()V", "GravityMapping", "Lcom/facebook/flipper/plugins/uidebugger/common/EnumMapping;", "", "LayoutDirectionMapping", "TextAlignmentMapping", "TextDirectionMapping", "VisibilityMapping", "fromDrawable", "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/drawable/Drawable;", "fromSize", "size", "getLayoutParams", "", "", "", "node", "getTags", "init", "", "onGetChildren", "view", "children", "", "onGetData", "builder", "onGetId", "onGetName", "Companion", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewDescriptor extends AbstractChainedDescriptor<View> {
    public static final Companion Companion = new Companion(null);
    private static Field KeyedTagsField;
    private static Field ListenerInfoField;
    private static Field OnClickListenerField;
    private final EnumMapping<Integer> VisibilityMapping = new EnumMapping<Integer>() { // from class: com.facebook.flipper.plugins.uidebugger.descriptors.ViewDescriptor$VisibilityMapping$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            put("VISIBLE", 0);
            put("INVISIBLE", 4);
            put("GONE", 8);
        }
    };
    private final EnumMapping<Integer> LayoutDirectionMapping = new EnumMapping<Integer>() { // from class: com.facebook.flipper.plugins.uidebugger.descriptors.ViewDescriptor$LayoutDirectionMapping$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            put("LAYOUT_DIRECTION_INHERIT", 2);
            put("LAYOUT_DIRECTION_LOCALE", 3);
            put("LAYOUT_DIRECTION_LTR", 0);
            put("LAYOUT_DIRECTION_RTL", 1);
        }
    };
    private final EnumMapping<Integer> TextDirectionMapping = new EnumMapping<Integer>() { // from class: com.facebook.flipper.plugins.uidebugger.descriptors.ViewDescriptor$TextDirectionMapping$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            put("TEXT_DIRECTION_INHERIT", 0);
            put("TEXT_DIRECTION_FIRST_STRONG", 1);
            put("TEXT_DIRECTION_ANY_RTL", 2);
            put("TEXT_DIRECTION_LTR", 3);
            put("TEXT_DIRECTION_RTL", 4);
            put("TEXT_DIRECTION_LOCALE", 5);
            put("TEXT_DIRECTION_FIRST_STRONG_LTR", 6);
            put("TEXT_DIRECTION_FIRST_STRONG_RTL", 7);
        }
    };
    private final EnumMapping<Integer> TextAlignmentMapping = new EnumMapping<Integer>() { // from class: com.facebook.flipper.plugins.uidebugger.descriptors.ViewDescriptor$TextAlignmentMapping$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            put("TEXT_ALIGNMENT_INHERIT", 0);
            put("TEXT_ALIGNMENT_GRAVITY", 1);
            put("TEXT_ALIGNMENT_TEXT_START", 2);
            put("TEXT_ALIGNMENT_TEXT_END", 3);
            put("TEXT_ALIGNMENT_CENTER", 4);
            put("TEXT_ALIGNMENT_VIEW_START", 5);
            put("TEXT_ALIGNMENT_VIEW_END", 6);
        }
    };
    private final EnumMapping<Integer> GravityMapping = new EnumMapping<Integer>() { // from class: com.facebook.flipper.plugins.uidebugger.descriptors.ViewDescriptor$GravityMapping$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            put("NO_GRAVITY", 0);
            put("LEFT", 3);
            put("TOP", 48);
            put("RIGHT", 5);
            put("BOTTOM", 80);
            put("CENTER", 17);
            put("CENTER_VERTICAL", 16);
            put("FILL_VERTICAL", 112);
            put("CENTER_HORIZONTAL", 1);
            put("FILL_HORIZONTAL", 7);
        }
    };

    /* compiled from: ViewDescriptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ViewDescriptor$Companion;", "", "()V", "KeyedTagsField", "Ljava/lang/reflect/Field;", "ListenerInfoField", "OnClickListenerField", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            KeyedTagsField = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = View.class.getDeclaredField("mListenerInfo");
            ListenerInfoField = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Field declaredField3 = Class.forName(z65.q(View.class.getName(), "$ListenerInfo")).getDeclaredField("mOnClickListener");
            OnClickListenerField = declaredField3;
            if (declaredField3 != null) {
                declaredField3.setAccessible(true);
            }
        } catch (Exception unused) {
        }
    }

    public final InspectableValue<?> fromDrawable(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return InspectableValue.Companion.mutable(InspectableValue.Type.Companion.getColor(), Integer.valueOf(((ColorDrawable) drawable).getColor()));
        }
        return InspectableValue.Companion.mutable(InspectableValue.Type.Companion.getColor(), 0);
    }

    public final InspectableValue<?> fromSize(int i) {
        if (i != -2) {
            if (i != -1) {
                InspectableValue.Companion companion = InspectableValue.Companion;
                InspectableValue.Type<String> type = InspectableValue.Type.Companion.getEnum();
                String num = Integer.toString(i);
                z65.g(num, "toString(size)");
                return companion.mutable(type, num);
            }
            return InspectableValue.Companion.mutable(InspectableValue.Type.Companion.getEnum(), "MATCH_PARENT");
        }
        return InspectableValue.Companion.mutable(InspectableValue.Type.Companion.getEnum(), "WRAP_CONTENT");
    }

    public final Map<String, Object> getLayoutParams(View view) {
        Map k;
        z65.h(view, "node");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("width", fromSize(layoutParams.width));
        linkedHashMap.put("height", fromSize(layoutParams.height));
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            InspectableValue.Companion companion = InspectableValue.Companion;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            k = g86.k(lnb.a(ElementGenerator.TEXT_ALIGN_LEFT, companion.mutable(Integer.valueOf(marginLayoutParams.leftMargin))), lnb.a("top", companion.mutable(Integer.valueOf(marginLayoutParams.topMargin))), lnb.a(ElementGenerator.TEXT_ALIGN_RIGHT, companion.mutable(Integer.valueOf(marginLayoutParams.rightMargin))), lnb.a("bottom", companion.mutable(Integer.valueOf(marginLayoutParams.bottomMargin))));
            linkedHashMap.put("margin", k);
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            linkedHashMap.put("gravity", EnumMapping.toPicker$default(this.GravityMapping, Integer.valueOf(((FrameLayout.LayoutParams) layoutParams).gravity), false, 2, null));
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            linkedHashMap.put("weight", InspectableValue.Companion.mutable(Float.valueOf(layoutParams2.weight)));
            linkedHashMap.put("gravity", EnumMapping.toPicker$default(this.GravityMapping, Integer.valueOf(layoutParams2.gravity), false, 2, null));
        }
        return linkedHashMap;
    }

    public final Map<String, Object> getTags(View view) {
        z65.h(view, "node");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field field = KeyedTagsField;
        if (field != null) {
            Object obj = field.get(view);
            if (obj != null) {
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ResourcesUtil resourcesUtil = ResourcesUtil.INSTANCE;
                    Context context = view.getContext();
                    z65.g(context, "node.context");
                    linkedHashMap.put(resourcesUtil.getIdStringQuietly(context, view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
            }
        }
        return linkedHashMap;
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(View view, List<Object> list) {
        z65.h(view, "view");
        z65.h(list, "children");
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetData(View view, Map map) {
        onGetData2(view, (Map<String, Object>) map);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(View view, List list) {
        onGetChildren2(view, (List<Object>) list);
    }

    /* renamed from: onGetData  reason: avoid collision after fix types in other method */
    public void onGetData2(View view, Map<String, Object> map) {
        Map k;
        Map k2;
        Map k3;
        Map k4;
        Map k5;
        Map k6;
        z65.h(view, "view");
        z65.h(map, "builder");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InspectableValue.Companion companion = InspectableValue.Companion;
        linkedHashMap.put("height", companion.mutable(Integer.valueOf(view.getHeight())));
        linkedHashMap.put("width", companion.mutable(Integer.valueOf(view.getWidth())));
        linkedHashMap.put("alpha", companion.mutable(Float.valueOf(view.getAlpha())));
        linkedHashMap.put(RemoteMessageConst.Notification.VISIBILITY, EnumMapping.toPicker$default(this.VisibilityMapping, Integer.valueOf(view.getVisibility()), false, 2, null));
        linkedHashMap.put("background", fromDrawable(view.getBackground()));
        linkedHashMap.put("layoutParams", getLayoutParams(view));
        k = g86.k(lnb.a("enabled", companion.mutable(Boolean.valueOf(view.isEnabled()))), lnb.a("activated", companion.mutable(Boolean.valueOf(view.isActivated()))), lnb.a("focused", Boolean.valueOf(view.isFocused())), lnb.a("selected", companion.mutable(Boolean.valueOf(view.isSelected()))));
        linkedHashMap.put("state", k);
        k2 = g86.k(lnb.a(ElementGenerator.TEXT_ALIGN_LEFT, companion.mutable(Integer.valueOf(view.getLeft()))), lnb.a(ElementGenerator.TEXT_ALIGN_RIGHT, companion.mutable(Integer.valueOf(view.getRight()))), lnb.a("top", companion.mutable(Integer.valueOf(view.getTop()))), lnb.a("bottom", companion.mutable(Integer.valueOf(view.getBottom()))));
        linkedHashMap.put("bounds", k2);
        k3 = g86.k(lnb.a(ElementGenerator.TEXT_ALIGN_LEFT, companion.mutable(Integer.valueOf(view.getPaddingLeft()))), lnb.a("top", companion.mutable(Integer.valueOf(view.getPaddingTop()))), lnb.a(ElementGenerator.TEXT_ALIGN_RIGHT, companion.mutable(Integer.valueOf(view.getPaddingRight()))), lnb.a("bottom", companion.mutable(Integer.valueOf(view.getPaddingBottom()))));
        linkedHashMap.put("padding", k3);
        k4 = g86.k(lnb.a("x", companion.mutable(Float.valueOf(view.getRotationX()))), lnb.a("y", companion.mutable(Float.valueOf(view.getRotationY()))), lnb.a("z", companion.mutable(Float.valueOf(view.getRotation()))));
        linkedHashMap.put("rotation", k4);
        k5 = g86.k(lnb.a("x", companion.mutable(Float.valueOf(view.getScaleX()))), lnb.a("y", companion.mutable(Float.valueOf(view.getScaleY()))));
        linkedHashMap.put("scale", k5);
        k6 = g86.k(lnb.a("x", companion.mutable(Float.valueOf(view.getPivotX()))), lnb.a("y", companion.mutable(Float.valueOf(view.getPivotY()))));
        linkedHashMap.put("pivot", k6);
        linkedHashMap.put("positionOnScreenX", Integer.valueOf(iArr[0]));
        linkedHashMap.put("positionOnScreenY", Integer.valueOf(iArr[1]));
        map.put("View", linkedHashMap);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetId(View view) {
        z65.h(view, "view");
        String binaryString = Integer.toBinaryString(System.identityHashCode(view));
        z65.g(binaryString, "toBinaryString(System.identityHashCode(view))");
        return binaryString;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetName(View view) {
        z65.h(view, "view");
        String simpleName = view.getClass().getSimpleName();
        z65.g(simpleName, "view.javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor, com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void init() {
    }
}
