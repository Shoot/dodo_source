package com.facebook.flipper.plugins.inspector.descriptors;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.facebook.flipper.plugins.inspector.HighlightedOverlay;
import com.facebook.flipper.plugins.inspector.InspectorValue;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityEvaluationUtil;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityRoleUtil;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityUtil;
import com.facebook.flipper.plugins.inspector.descriptors.utils.ContextDescriptorUtils;
import com.facebook.flipper.plugins.inspector.descriptors.utils.EnumMapping;
import com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies.ResourcesUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class ViewDescriptor extends NodeDescriptor<View> {
    private static final String axNodeInfoPropsTitle = "AccessibilityNodeInfo";
    private static final String axTalkbackPropsTitle = "Talkback";
    private static final String axViewPropsTitle = "Accessibility";
    private static final EnumMapping<Integer> sGravityMapping;
    private static Field sKeyedTagsField;
    private static final EnumMapping<Integer> sLayoutDirectionMapping;
    private static Field sListenerInfoField;
    private static Field sOnClickListenerField;
    private static final EnumMapping<Integer> sTextAlignmentMapping;
    private static final EnumMapping<Integer> sTextDirectionMapping;
    private static final EnumMapping<Integer> sVisibilityMapping;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            sKeyedTagsField = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = View.class.getDeclaredField("mListenerInfo");
            sListenerInfoField = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = Class.forName(View.class.getName() + "$ListenerInfo").getDeclaredField("mOnClickListener");
            sOnClickListenerField = declaredField3;
            declaredField3.setAccessible(true);
        } catch (Exception unused) {
        }
        sVisibilityMapping = new EnumMapping<Integer>("VISIBLE") { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.2
            {
                put("VISIBLE", 0);
                put("INVISIBLE", 4);
                put("GONE", 8);
            }
        };
        sLayoutDirectionMapping = new EnumMapping<Integer>("LAYOUT_DIRECTION_INHERIT") { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.3
            {
                put("LAYOUT_DIRECTION_INHERIT", 2);
                put("LAYOUT_DIRECTION_LOCALE", 3);
                put("LAYOUT_DIRECTION_LTR", 0);
                put("LAYOUT_DIRECTION_RTL", 1);
            }
        };
        sTextDirectionMapping = new EnumMapping<Integer>("TEXT_DIRECTION_INHERIT") { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.4
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
        sTextAlignmentMapping = new EnumMapping<Integer>("TEXT_ALIGNMENT_INHERIT") { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.5
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
        sGravityMapping = new EnumMapping<Integer>("NO_GRAVITY") { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.6
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
    }

    private static InspectorValue fromDrawable(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return InspectorValue.mutable(InspectorValue.Type.Color, Integer.valueOf(((ColorDrawable) drawable).getColor()));
        }
        return InspectorValue.mutable(InspectorValue.Type.Color, 0);
    }

    private static InspectorValue fromSize(int i) {
        if (i != -2) {
            if (i != -1) {
                return InspectorValue.mutable(InspectorValue.Type.Enum, Integer.toString(i));
            }
            return InspectorValue.mutable(InspectorValue.Type.Enum, "MATCH_PARENT");
        }
        return InspectorValue.mutable(InspectorValue.Type.Enum, "WRAP_CONTENT");
    }

    private static FlipperObject getLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FlipperObject.Builder builder = new FlipperObject.Builder();
        builder.put("width", (FlipperValue) fromSize(layoutParams.width));
        builder.put("height", (FlipperValue) fromSize(layoutParams.height));
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            builder.put("margin", new FlipperObject.Builder().put(ElementGenerator.TEXT_ALIGN_LEFT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(marginLayoutParams.leftMargin))).put("top", (FlipperValue) InspectorValue.mutable(Integer.valueOf(marginLayoutParams.topMargin))).put(ElementGenerator.TEXT_ALIGN_RIGHT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(marginLayoutParams.rightMargin))).put("bottom", (FlipperValue) InspectorValue.mutable(Integer.valueOf(marginLayoutParams.bottomMargin))));
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            builder.put("gravity", (FlipperValue) sGravityMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(((FrameLayout.LayoutParams) layoutParams).gravity)));
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            builder.put("weight", (FlipperValue) InspectorValue.mutable(Float.valueOf(layoutParams2.weight))).put("gravity", (FlipperValue) sGravityMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(layoutParams2.gravity)));
        }
        return builder.build();
    }

    private static String getResourceId(View view) {
        int id = view.getId();
        if (id == -1) {
            return null;
        }
        return ResourcesUtil.getIdStringQuietly(view.getContext(), view.getResources(), id);
    }

    private FlipperObject getTags(final View view) {
        final FlipperObject.Builder builder = new FlipperObject.Builder();
        if (sKeyedTagsField == null) {
            return builder.build();
        }
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection != null) {
            new ErrorReportingRunnable(flipperConnection) { // from class: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.1
                @Override // com.facebook.flipper.core.ErrorReportingRunnable
                protected void runOrThrow() throws Exception {
                    SparseArray sparseArray = (SparseArray) ViewDescriptor.sKeyedTagsField.get(view);
                    if (sparseArray != null) {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            builder.put(ResourcesUtil.getIdStringQuietly(view.getContext(), view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                        }
                    }
                }
            }.run();
        }
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r5.equals("enabled") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setAccessibilityValue(android.view.View r4, java.lang.String[] r5, com.facebook.flipper.core.FlipperDynamic r6) {
        /*
            r3 = this;
            r0 = 1
            r5 = r5[r0]
            r5.hashCode()
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case -1964681502: goto L50;
                case -1609594047: goto L47;
                case 227085919: goto L3c;
                case 719772840: goto L31;
                case 1191572123: goto L26;
                case 1629011506: goto L1b;
                case 1720194257: goto L10;
                default: goto Le;
            }
        Le:
            r0 = -1
            goto L5a
        L10:
            java.lang.String r0 = "long-clickable"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L19
            goto Le
        L19:
            r0 = 6
            goto L5a
        L1b:
            java.lang.String r0 = "focusable"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L24
            goto Le
        L24:
            r0 = 5
            goto L5a
        L26:
            java.lang.String r0 = "selected"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2f
            goto Le
        L2f:
            r0 = 4
            goto L5a
        L31:
            java.lang.String r0 = "content-description"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3a
            goto Le
        L3a:
            r0 = 3
            goto L5a
        L3c:
            java.lang.String r0 = "important-for-accessibility"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L45
            goto Le
        L45:
            r0 = 2
            goto L5a
        L47:
            java.lang.String r1 = "enabled"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L5a
            goto Le
        L50:
            java.lang.String r0 = "clickable"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L59
            goto Le
        L59:
            r0 = 0
        L5a:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L92;
                case 2: goto L7e;
                case 3: goto L76;
                case 4: goto L6e;
                case 5: goto L66;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto La1
        L5e:
            boolean r5 = r6.asBoolean()
            r4.setLongClickable(r5)
            goto La1
        L66:
            boolean r5 = r6.asBoolean()
            r4.setFocusable(r5)
            goto La1
        L6e:
            boolean r5 = r6.asBoolean()
            r4.setSelected(r5)
            goto La1
        L76:
            java.lang.String r5 = r6.asString()
            r4.setContentDescription(r5)
            goto La1
        L7e:
            com.facebook.flipper.plugins.inspector.descriptors.utils.EnumMapping<java.lang.Integer> r5 = com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityUtil.sImportantForAccessibilityMapping
            java.lang.String r6 = r6.asString()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setImportantForAccessibility(r5)
            goto La1
        L92:
            boolean r5 = r6.asBoolean()
            r4.setEnabled(r5)
            goto La1
        L9a:
            boolean r5 = r6.asBoolean()
            r4.setClickable(r5)
        La1:
            r3.invalidateAX(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.setAccessibilityValue(android.view.View, java.lang.String[], com.facebook.flipper.core.FlipperDynamic):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r3.equals(com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator.TEXT_ALIGN_LEFT) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setLayoutParams(android.view.View r10, java.lang.String[] r11, com.facebook.flipper.core.FlipperDynamic r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor.setLayoutParams(android.view.View, java.lang.String[], com.facebook.flipper.core.FlipperDynamic):void");
    }

    private static int toSize(String str) {
        str.hashCode();
        if (!str.equals("WRAP_CONTENT")) {
            if (!str.equals("MATCH_PARENT")) {
                return Integer.parseInt(str);
            }
            return -1;
        }
        return -2;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(View view, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(View view) {
        return 0;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(View view) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(View view) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void axHitTest(View view, Touch touch) {
        touch.finish();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAXAttributes(View view) throws Exception {
        ArrayList arrayList = new ArrayList();
        String obj = AccessibilityRoleUtil.getRole(view).toString();
        if (!obj.equals("NONE")) {
            arrayList.add(new Named("role", obj));
        }
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getAXData(View view) {
        return Arrays.asList(new Named(axNodeInfoPropsTitle, AccessibilityUtil.getAccessibilityNodeInfoData(view)), new Named(axTalkbackPropsTitle, AccessibilityUtil.getTalkbackData(view)), new Named(axViewPropsTitle, AccessibilityUtil.getViewData(view)));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXDecoration(View view) {
        return AccessibilityEvaluationUtil.isTalkbackFocusable(view) ? "accessibility" : "";
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXName(View view) throws Exception {
        return view.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(View view) throws Exception {
        Object obj;
        View.OnClickListener onClickListener;
        ArrayList arrayList = new ArrayList();
        String resourceId = getResourceId(view);
        if (resourceId != null) {
            arrayList.add(new Named("id", resourceId));
        }
        Field field = sListenerInfoField;
        if (field != null && sOnClickListenerField != null && (obj = field.get(view)) != null && (onClickListener = (View.OnClickListener) sOnClickListenerField.get(obj)) != null) {
            arrayList.add(new Named("onClick", onClickListener.getClass().getName()));
        }
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(View view) {
        Drawable foreground;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        FlipperObject.Builder put = new FlipperObject.Builder().put("height", (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getHeight()))).put("width", (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getWidth()))).put("alpha", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getAlpha()))).put(RemoteMessageConst.Notification.VISIBILITY, (FlipperValue) sVisibilityMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(view.getVisibility()))).put("background", (FlipperValue) fromDrawable(view.getBackground())).put(RemoteMessageConst.Notification.TAG, (FlipperValue) InspectorValue.mutable(view.getTag())).put("keyedTags", getTags(view)).put("layoutParams", getLayoutParams(view)).put("state", new FlipperObject.Builder().put("enabled", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isEnabled()))).put("activated", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isActivated()))).put("focused", Boolean.valueOf(view.isFocused())).put("selected", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isSelected())))).put("bounds", new FlipperObject.Builder().put(ElementGenerator.TEXT_ALIGN_LEFT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getLeft()))).put(ElementGenerator.TEXT_ALIGN_RIGHT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getRight()))).put("top", (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getTop()))).put("bottom", (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getBottom())))).put("padding", new FlipperObject.Builder().put(ElementGenerator.TEXT_ALIGN_LEFT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getPaddingLeft()))).put("top", (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getPaddingTop()))).put(ElementGenerator.TEXT_ALIGN_RIGHT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getPaddingRight()))).put("bottom", (FlipperValue) InspectorValue.mutable(Integer.valueOf(view.getPaddingBottom())))).put("rotation", new FlipperObject.Builder().put("x", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getRotationX()))).put("y", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getRotationY()))).put("z", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getRotation())))).put("scale", new FlipperObject.Builder().put("x", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getScaleX()))).put("y", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getScaleY())))).put("pivot", new FlipperObject.Builder().put("x", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getPivotX()))).put("y", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getPivotY())))).put("positionOnScreenX", Integer.valueOf(iArr[0])).put("positionOnScreenY", Integer.valueOf(iArr[1]));
        int i = Build.VERSION.SDK_INT;
        put.put("layoutDirection", (FlipperValue) sLayoutDirectionMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(view.getLayoutDirection()))).put("textDirection", (FlipperValue) sTextDirectionMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(view.getTextDirection()))).put("textAlignment", (FlipperValue) sTextAlignmentMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(view.getTextAlignment())));
        put.put("elevation", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getElevation())));
        FlipperObject.Builder put2 = new FlipperObject.Builder().put("x", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getTranslationX()))).put("y", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getTranslationY())));
        put2.put("z", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getTranslationZ())));
        put.put("translation", put2);
        FlipperObject.Builder put3 = new FlipperObject.Builder().put("x", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getX()))).put("y", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getY())));
        if (i >= 22) {
            put3.put("z", (FlipperValue) InspectorValue.mutable(Float.valueOf(view.getZ())));
        }
        put.put("position", put3);
        if (i >= 23) {
            foreground = view.getForeground();
            put.put("foreground", (FlipperValue) fromDrawable(foreground));
        }
        return Arrays.asList(new Named("View", put.build()), new Named("Theme", ContextDescriptorUtils.themeData(view.getContext())));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(View view) {
        return new FlipperObject.Builder().put("linkedNode", getId(view)).build();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(View view) {
        return Integer.toString(System.identityHashCode(view));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(View view) {
        return view.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(View view, boolean z) throws Exception {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(View view, Touch touch) {
        touch.finish();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, View view) throws Exception {
        String resourceId = getResourceId(view);
        if (resourceId == null || !resourceId.toLowerCase().contains(str)) {
            return descriptorForClass(Object.class).matches(str, view);
        }
        return true;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(View view, boolean z, boolean z2) {
        Rect rect;
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : view;
        if (!z) {
            HighlightedOverlay.removeHighlight(view2);
            return;
        }
        Rect rect2 = new Rect(syb.J(view), view.getPaddingTop(), syb.I(view), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect = new Rect(j86.b(marginLayoutParams), marginLayoutParams.topMargin, j86.a(marginLayoutParams), marginLayoutParams.bottomMargin);
        } else {
            rect = new Rect();
        }
        int left = view.getLeft();
        int top = view.getTop();
        Rect rect3 = new Rect(left, top, view.getWidth() + left, view.getHeight() + top);
        if (view2 == view) {
            rect3.offset(-left, -top);
        }
        HighlightedOverlay.setHighlighted(view2, rect, rect2, rect3, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    @TargetApi(17)
    public void setValue(View view, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        if (!strArr[0].equals(axViewPropsTitle) && !strArr[0].equals(axNodeInfoPropsTitle) && !strArr[0].equals(axTalkbackPropsTitle)) {
            if (strArr[0].equals("View")) {
                String str = strArr[1];
                str.hashCode();
                switch (str.hashCode()) {
                    case -1955718283:
                        if (str.equals("layoutDirection")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1840647503:
                        if (str.equals("translation")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1383205195:
                        if (str.equals("bounds")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1332194002:
                        if (str.equals("background")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1221029593:
                        if (str.equals("height")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -806339567:
                        if (str.equals("padding")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -687708974:
                        if (str.equals("textDirection")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 106679362:
                        if (str.equals("pivot")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 109250890:
                        if (str.equals("scale")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757585:
                        if (str.equals("state")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 113126854:
                        if (str.equals("width")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 747804969:
                        if (str.equals("position")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1783126352:
                        if (str.equals("layoutParams")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1941332754:
                        if (str.equals(RemoteMessageConst.Notification.VISIBILITY)) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1984457027:
                        if (str.equals("foreground")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2042756918:
                        if (str.equals("textAlignment")) {
                            c = 18;
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
                        view.setLayoutDirection(sLayoutDirectionMapping.get(flipperDynamic.asString()).intValue());
                        break;
                    case 1:
                        String str2 = strArr[2];
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 120:
                                if (str2.equals("x")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 121:
                                if (str2.equals("y")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 122:
                                if (str2.equals("z")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                view.setTranslationX(flipperDynamic.asFloat());
                                break;
                            case 1:
                                view.setTranslationY(flipperDynamic.asFloat());
                                break;
                            case 2:
                                view.setTranslationZ(flipperDynamic.asFloat());
                                break;
                        }
                    case 2:
                        String str3 = strArr[2];
                        str3.hashCode();
                        switch (str3.hashCode()) {
                            case -1383228885:
                                if (str3.equals("bottom")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 115029:
                                if (str3.equals("top")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3317767:
                                if (str3.equals(ElementGenerator.TEXT_ALIGN_LEFT)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 108511772:
                                if (str3.equals(ElementGenerator.TEXT_ALIGN_RIGHT)) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                view.setBottom(flipperDynamic.asInt());
                                break;
                            case 1:
                                view.setTop(flipperDynamic.asInt());
                                break;
                            case 2:
                                view.setLeft(flipperDynamic.asInt());
                                break;
                            case 3:
                                view.setRight(flipperDynamic.asInt());
                                break;
                        }
                    case 3:
                        view.setBackground(new ColorDrawable(flipperDynamic.asInt()));
                        break;
                    case 4:
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = flipperDynamic.asInt();
                        view.setLayoutParams(layoutParams);
                        break;
                    case 5:
                        String str4 = strArr[2];
                        str4.hashCode();
                        switch (str4.hashCode()) {
                            case -1383228885:
                                if (str4.equals("bottom")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 115029:
                                if (str4.equals("top")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3317767:
                                if (str4.equals(ElementGenerator.TEXT_ALIGN_LEFT)) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 108511772:
                                if (str4.equals(ElementGenerator.TEXT_ALIGN_RIGHT)) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), flipperDynamic.asInt());
                                break;
                            case 1:
                                view.setPadding(view.getPaddingLeft(), flipperDynamic.asInt(), view.getPaddingRight(), view.getPaddingBottom());
                                break;
                            case 2:
                                view.setPadding(flipperDynamic.asInt(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                                break;
                            case 3:
                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), flipperDynamic.asInt(), view.getPaddingBottom());
                                break;
                        }
                    case 6:
                        view.setTextDirection(sTextDirectionMapping.get(flipperDynamic.asString()).intValue());
                        break;
                    case 7:
                        String str5 = strArr[2];
                        str5.hashCode();
                        switch (str5.hashCode()) {
                            case 120:
                                if (str5.equals("x")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 121:
                                if (str5.equals("y")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 122:
                                if (str5.equals("z")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                                view.setRotationX(flipperDynamic.asFloat());
                                break;
                            case 1:
                                view.setRotationY(flipperDynamic.asFloat());
                                break;
                            case 2:
                                view.setRotation(flipperDynamic.asFloat());
                                break;
                        }
                    case '\b':
                        view.setElevation(flipperDynamic.asFloat());
                        break;
                    case '\t':
                        view.setAlpha(flipperDynamic.asFloat());
                        break;
                    case '\n':
                        String str6 = strArr[2];
                        str6.hashCode();
                        if (!str6.equals("x")) {
                            if (str6.equals("y")) {
                                view.setPivotX(flipperDynamic.asFloat());
                                break;
                            }
                        } else {
                            view.setPivotY(flipperDynamic.asFloat());
                            break;
                        }
                        break;
                    case 11:
                        String str7 = strArr[2];
                        str7.hashCode();
                        if (!str7.equals("x")) {
                            if (str7.equals("y")) {
                                view.setScaleY(flipperDynamic.asFloat());
                                break;
                            }
                        } else {
                            view.setScaleX(flipperDynamic.asFloat());
                            break;
                        }
                        break;
                    case '\f':
                        String str8 = strArr[2];
                        str8.hashCode();
                        switch (str8.hashCode()) {
                            case -1609594047:
                                if (str8.equals("enabled")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 204392913:
                                if (str8.equals("activated")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1191572123:
                                if (str8.equals("selected")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                view.setEnabled(flipperDynamic.asBoolean());
                                break;
                            case 1:
                                view.setActivated(flipperDynamic.asBoolean());
                                break;
                            case 2:
                                view.setSelected(flipperDynamic.asBoolean());
                                break;
                        }
                    case '\r':
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        layoutParams2.width = flipperDynamic.asInt();
                        view.setLayoutParams(layoutParams2);
                        break;
                    case 14:
                        String str9 = strArr[2];
                        str9.hashCode();
                        switch (str9.hashCode()) {
                            case 120:
                                if (str9.equals("x")) {
                                    c7 = 0;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            case 121:
                                if (str9.equals("y")) {
                                    c7 = 1;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            case 122:
                                if (str9.equals("z")) {
                                    c7 = 2;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            default:
                                c7 = 65535;
                                break;
                        }
                        switch (c7) {
                            case 0:
                                view.setX(flipperDynamic.asFloat());
                                break;
                            case 1:
                                view.setY(flipperDynamic.asFloat());
                                break;
                            case 2:
                                view.setZ(flipperDynamic.asFloat());
                                break;
                        }
                    case 15:
                        if (strArr.length > 2) {
                            setLayoutParams(view, (String[]) Arrays.copyOfRange(strArr, 2, strArr.length), flipperDynamic);
                            break;
                        }
                        break;
                    case 16:
                        view.setVisibility(sVisibilityMapping.get(flipperDynamic.asString()).intValue());
                        break;
                    case 17:
                        view.setForeground(new ColorDrawable(flipperDynamic.asInt()));
                        break;
                    case 18:
                        view.setTextAlignment(sTextAlignmentMapping.get(flipperDynamic.asString()).intValue());
                        break;
                }
                invalidate(view);
                return;
            }
            return;
        }
        setAccessibilityValue(view, strArr, flipperDynamic);
    }
}
