package com.facebook.flipper.plugins.inspector.descriptors.utils;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.facebook.flipper.plugins.inspector.InspectorValue;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityRoleUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.d4;
/* loaded from: classes2.dex */
public final class AccessibilityUtil {
    private static final int SYSTEM_ACTION_MAX = 33554431;
    private static final String delimiter = ", ";
    private static final int delimiterLength = 2;
    public static final EnumMapping<Integer> sAccessibilityActionMapping = new EnumMapping<Integer>(GrsBaseInfo.CountryCodeSource.UNKNOWN) { // from class: com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityUtil.1
        {
            put("FOCUS", 1);
            put("CLEAR_FOCUS", 2);
            put("SELECT", 4);
            put("CLEAR_SELECTION", 8);
            put("CLICK", 16);
            put("LONG_CLICK", 32);
            put("ACCESSIBILITY_FOCUS", 64);
            put("CLEAR_ACCESSIBILITY_FOCUS", 128);
            put("NEXT_AT_MOVEMENT_GRANULARITY", 256);
            put("PREVIOUS_AT_MOVEMENT_GRANULARITY", 512);
            put("NEXT_HTML_ELEMENT", 1024);
            put("PREVIOUS_HTML_ELEMENT", 2048);
            put("SCROLL_FORWARD", 4096);
            put("SCROLL_BACKWARD", 8192);
            put("CUT", 65536);
            put("COPY", 16384);
            put("PASTE", 32768);
            put("SET_SELECTION", 131072);
            put("SET_SELECTION", 131072);
            put("EXPAND", 262144);
            put("COLLAPSE", 524288);
            put("DISMISS", 1048576);
            put("SET_TEXT", 2097152);
        }
    };
    public static final EnumMapping<Integer> sImportantForAccessibilityMapping = new EnumMapping<Integer>("AUTO") { // from class: com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityUtil.2
        {
            put("AUTO", 0);
            put("NO", 2);
            put("YES", 1);
            put("NO_HIDE_DESCENDANTS", 4);
        }
    };

    private AccessibilityUtil() {
    }

    private static void addStateSegments(StringBuilder sb, d4 d4Var, AccessibilityRoleUtil.AccessibilityRole accessibilityRole) {
        String str;
        if (d4Var.W()) {
            sb.append("selected, ");
        }
        if (supportsAction(d4Var, 262144)) {
            sb.append("collapsed, ");
        }
        if (supportsAction(d4Var, 524288)) {
            sb.append("expanded, ");
        }
        String roleString = accessibilityRole.getRoleString();
        String str2 = "not checked";
        if (d4Var.G() && !roleString.equals("Switch") && (!accessibilityRole.equals(AccessibilityRoleUtil.AccessibilityRole.CHECKED_TEXT_VIEW) || d4Var.H())) {
            StringBuilder sb2 = new StringBuilder();
            if (!d4Var.H()) {
                str = "not checked";
            } else {
                str = "checked";
            }
            sb2.append(str);
            sb2.append(delimiter);
            sb.append(sb2.toString());
        }
        if (roleString.equals("Switch")) {
            CharSequence B = d4Var.B();
            if (!TextUtils.isEmpty(B) && accessibilityRole != AccessibilityRoleUtil.AccessibilityRole.TOGGLE_BUTTON) {
                sb.append(((Object) B) + delimiter);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            if (d4Var.H()) {
                str2 = "checked";
            }
            sb3.append(str2);
            sb3.append(delimiter);
            sb.append(sb3.toString());
        }
    }

    public static void addTalkbackProperties(FlipperObject.Builder builder, View view) {
        if (!AccessibilityEvaluationUtil.isTalkbackFocusable(view)) {
            builder.put("talkback-focusable", Boolean.FALSE).put("talkback-ignored-reasons", getTalkbackIgnoredReasons(view));
        } else {
            builder.put("talkback-focusable", Boolean.TRUE).put("talkback-focusable-reasons", getTalkbackFocusableReasons(view)).put("talkback-output", getTalkbackDescription(view)).put("talkback-hint", getTalkbackHint(view));
        }
    }

    public static FlipperObject getAccessibilityNodeInfoData(View view) {
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return null;
        }
        FlipperObject.Builder builder = new FlipperObject.Builder();
        Rect rect = new Rect();
        FlipperArray.Builder builder2 = new FlipperArray.Builder();
        for (d4.a aVar : createNodeInfoFromView.i()) {
            String str = (String) aVar.c();
            if (str != null) {
                builder2.put(str);
            } else {
                builder2.put(sAccessibilityActionMapping.toPicker(Integer.valueOf(aVar.b()), false));
            }
        }
        builder.put("actions", builder2.build());
        builder.put("accessibility-focused", Boolean.valueOf(createNodeInfoFromView.F())).put("checkable", Boolean.valueOf(createNodeInfoFromView.G())).put("checked", Boolean.valueOf(createNodeInfoFromView.H())).put("class-name", createNodeInfoFromView.p()).put("clickable", Boolean.valueOf(createNodeInfoFromView.I())).put("content-description", createNodeInfoFromView.t()).put("content-invalid", Boolean.valueOf(createNodeInfoFromView.J())).put("context-clickable", Boolean.valueOf(createNodeInfoFromView.K())).put("dismissable", Boolean.valueOf(createNodeInfoFromView.L())).put("drawing-order", Integer.valueOf(createNodeInfoFromView.u())).put("editable", Boolean.valueOf(createNodeInfoFromView.M())).put("enabled", Boolean.valueOf(createNodeInfoFromView.N())).put("important-for-accessibility", Boolean.valueOf(createNodeInfoFromView.Q())).put("focusable", Boolean.valueOf(createNodeInfoFromView.O())).put("focused", Boolean.valueOf(createNodeInfoFromView.P())).put("long-clickable", Boolean.valueOf(createNodeInfoFromView.R())).put("multiline", Boolean.valueOf(createNodeInfoFromView.S())).put("password", Boolean.valueOf(createNodeInfoFromView.T())).put("screenreader-focusable", Boolean.valueOf(createNodeInfoFromView.U())).put("scrollable", Boolean.valueOf(createNodeInfoFromView.V())).put("selected", Boolean.valueOf(createNodeInfoFromView.W())).put("text", createNodeInfoFromView.B()).put("visible-to-user", Boolean.valueOf(createNodeInfoFromView.Y())).put("role-description", getRoleDescription(createNodeInfoFromView));
        createNodeInfoFromView.m(rect);
        builder.put("parent-bounds", new FlipperObject.Builder().put("width", Integer.valueOf(rect.width())).put("height", Integer.valueOf(rect.height())).put("top", Integer.valueOf(rect.top)).put(ElementGenerator.TEXT_ALIGN_LEFT, Integer.valueOf(rect.left)).put("bottom", Integer.valueOf(rect.bottom)).put(ElementGenerator.TEXT_ALIGN_RIGHT, Integer.valueOf(rect.right)));
        createNodeInfoFromView.n(rect);
        builder.put("screen-bounds", new FlipperObject.Builder().put("width", Integer.valueOf(rect.width())).put("height", Integer.valueOf(rect.height())).put("top", Integer.valueOf(rect.top)).put(ElementGenerator.TEXT_ALIGN_LEFT, Integer.valueOf(rect.left)).put("bottom", Integer.valueOf(rect.bottom)).put(ElementGenerator.TEXT_ALIGN_RIGHT, Integer.valueOf(rect.right)));
        createNodeInfoFromView.d0();
        return builder.build();
    }

    private static String getHintForActions(d4 d4Var) {
        StringBuilder sb = new StringBuilder();
        for (d4.a aVar : d4Var.i()) {
            int b = aVar.b();
            CharSequence c = aVar.c();
            if (b != 16 && b != 32 && !TextUtils.isEmpty(c) && b <= SYSTEM_ACTION_MAX) {
                sb.append(((Object) c) + delimiter);
            }
        }
        return removeFinalDelimiter(sb);
    }

    private static String getHintForClick(d4 d4Var) {
        for (d4.a aVar : d4Var.i()) {
            int b = aVar.b();
            CharSequence c = aVar.c();
            if (b == 16 && !TextUtils.isEmpty(c)) {
                return "Double tap to " + ((Object) c);
            }
        }
        if (d4Var.G()) {
            return "Double tap to toggle";
        }
        if (d4Var.I()) {
            return "Double tap to activate";
        }
        return "";
    }

    private static String getHintForCustomActions(d4 d4Var) {
        StringBuilder sb = new StringBuilder();
        for (d4.a aVar : d4Var.i()) {
            int b = aVar.b();
            CharSequence c = aVar.c();
            if (b > SYSTEM_ACTION_MAX) {
                if (!TextUtils.isEmpty(c)) {
                    sb.append(((Object) c) + delimiter);
                }
            } else if (b == 1048576) {
                sb.append("Dismiss, ");
            } else if (b == 262144) {
                sb.append("Expand, ");
            } else if (b == 524288) {
                sb.append("Collapse, ");
            }
        }
        String removeFinalDelimiter = removeFinalDelimiter(sb);
        if (removeFinalDelimiter.length() > 0) {
            return "Actions: " + removeFinalDelimiter;
        }
        return "";
    }

    private static String getHintForLongClick(d4 d4Var) {
        for (d4.a aVar : d4Var.i()) {
            int b = aVar.b();
            CharSequence c = aVar.c();
            if (b == 32 && !TextUtils.isEmpty(c)) {
                return "Double tap and hold to " + ((Object) c);
            }
        }
        if (d4Var.R()) {
            return "Double tap and hold to long press";
        }
        return "";
    }

    public static String getRoleDescription(View view) {
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        String roleDescription = getRoleDescription(createNodeInfoFromView);
        createNodeInfoFromView.d0();
        return (roleDescription == null || roleDescription == "") ? AccessibilityRoleUtil.getRole(view).getRoleString() : roleDescription;
    }

    public static FlipperObject getTalkbackData(View view) {
        if (!AccessibilityEvaluationUtil.isTalkbackFocusable(view)) {
            String talkbackIgnoredReasons = getTalkbackIgnoredReasons(view);
            FlipperObject.Builder put = new FlipperObject.Builder().put("talkback-focusable", Boolean.FALSE);
            if (talkbackIgnoredReasons == null) {
                talkbackIgnoredReasons = "";
            }
            return put.put("talkback-ignored-reasons", talkbackIgnoredReasons).build();
        }
        String talkbackFocusableReasons = getTalkbackFocusableReasons(view);
        CharSequence talkbackDescription = getTalkbackDescription(view);
        return new FlipperObject.Builder().put("talkback-focusable", Boolean.TRUE).put("talkback-focusable-reasons", talkbackFocusableReasons).put("talkback-output", talkbackDescription).put("talkback-hint", getTalkbackHint(view)).build();
    }

    public static CharSequence getTalkbackDescription(View view) {
        CharSequence B;
        CharSequence talkbackDescription;
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return null;
        }
        try {
            CharSequence t = createNodeInfoFromView.t();
            boolean z = true;
            boolean z2 = !TextUtils.isEmpty(createNodeInfoFromView.B());
            boolean z3 = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            AccessibilityRoleUtil.AccessibilityRole role = AccessibilityRoleUtil.getRole(view);
            String roleDescription = getRoleDescription(view);
            if (!AccessibilityEvaluationUtil.isActionableForAccessibility(createNodeInfoFromView) || createNodeInfoFromView.N()) {
                z = false;
            }
            if (!TextUtils.isEmpty(t) && (!z3 || !z2)) {
                addStateSegments(sb, createNodeInfoFromView, role);
                sb.append(((Object) t) + delimiter);
                if (roleDescription.length() > 0) {
                    sb.append(roleDescription + delimiter);
                }
                if (z) {
                    sb.append("disabled, ");
                }
                String removeFinalDelimiter = removeFinalDelimiter(sb);
                createNodeInfoFromView.d0();
                return removeFinalDelimiter;
            } else if (z2) {
                if (createNodeInfoFromView.T()) {
                    sb.append("password, ");
                }
                sb.append(((Object) B) + delimiter);
                if (roleDescription.length() > 0) {
                    sb.append(roleDescription + delimiter);
                }
                if (z) {
                    sb.append("disabled, ");
                }
                String removeFinalDelimiter2 = removeFinalDelimiter(sb);
                createNodeInfoFromView.d0();
                return removeFinalDelimiter2;
            } else if (view instanceof ViewGroup) {
                StringBuilder sb2 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    d4 Z = d4.Z();
                    syb.h0(childAt, Z);
                    if (AccessibilityEvaluationUtil.isSpeakingNode(Z, childAt) && !AccessibilityEvaluationUtil.isAccessibilityFocusable(Z, childAt)) {
                        if (!TextUtils.isEmpty(getTalkbackDescription(childAt))) {
                            sb2.append(((Object) talkbackDescription) + delimiter);
                        }
                    }
                    Z.d0();
                }
                String removeFinalDelimiter3 = removeFinalDelimiter(sb2);
                createNodeInfoFromView.d0();
                return removeFinalDelimiter3;
            } else {
                createNodeInfoFromView.d0();
                return null;
            }
        } catch (Throwable th) {
            createNodeInfoFromView.d0();
            throw th;
        }
    }

    public static String getTalkbackFocusableReasons(View view) {
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return null;
        }
        try {
            boolean hasText = AccessibilityEvaluationUtil.hasText(createNodeInfoFromView);
            boolean G = createNodeInfoFromView.G();
            boolean hasNonActionableSpeakingDescendants = AccessibilityEvaluationUtil.hasNonActionableSpeakingDescendants(createNodeInfoFromView, view);
            if (AccessibilityEvaluationUtil.isActionableForAccessibility(createNodeInfoFromView)) {
                if (createNodeInfoFromView.o() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    return "View is actionable and has a description.";
                }
                if (G) {
                    return "View is actionable and checkable.";
                }
                if (hasNonActionableSpeakingDescendants) {
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityEvaluationUtil.isTopLevelScrollItem(createNodeInfoFromView, view)) {
                if (hasText) {
                    return "View is a direct child of a scrollable container and has a description.";
                }
                if (G) {
                    return "View is a direct child of a scrollable container and is checkable.";
                }
                if (hasNonActionableSpeakingDescendants) {
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (!hasText) {
                return null;
            }
            return "View has a description and is not actionable, but has no actionable ancestor.";
        } finally {
            createNodeInfoFromView.d0();
        }
    }

    public static CharSequence getTalkbackHint(View view) {
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (createNodeInfoFromView.N()) {
            AccessibilityRoleUtil.AccessibilityRole role = AccessibilityRoleUtil.getRole(view);
            if (role == AccessibilityRoleUtil.AccessibilityRole.DROP_DOWN_LIST) {
                return "Double tap to change";
            }
            if (role == AccessibilityRoleUtil.AccessibilityRole.PAGER) {
                if (!supportsAction(createNodeInfoFromView, 4096) && !supportsAction(createNodeInfoFromView, 8192)) {
                    return "No more pages";
                }
                return "Swipe with two fingers to switch pages";
            } else if (role == AccessibilityRoleUtil.AccessibilityRole.SEEK_CONTROL && (supportsAction(createNodeInfoFromView, 4096) || supportsAction(createNodeInfoFromView, 8192))) {
                return "Use volume keys to adjust";
            } else {
                String hintForCustomActions = getHintForCustomActions(createNodeInfoFromView);
                if (hintForCustomActions.length() > 0) {
                    sb.append(hintForCustomActions + delimiter);
                }
                if (role == AccessibilityRoleUtil.AccessibilityRole.EDIT_TEXT) {
                    if (!createNodeInfoFromView.P()) {
                        sb.append("Double tap to enter text, ");
                    }
                } else {
                    String hintForClick = getHintForClick(createNodeInfoFromView);
                    if (hintForClick.length() > 0) {
                        sb.append(hintForClick + delimiter);
                    }
                }
                String hintForLongClick = getHintForLongClick(createNodeInfoFromView);
                if (hintForLongClick.length() > 0) {
                    sb.append(hintForLongClick + delimiter);
                }
            }
        }
        createNodeInfoFromView.d0();
        return removeFinalDelimiter(sb);
    }

    public static String getTalkbackIgnoredReasons(View view) {
        int C = syb.C(view);
        if (C == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (C == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (syb.C((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return "AccessibilityNodeInfo cannot be found.";
        }
        try {
            if (AccessibilityEvaluationUtil.hasEqualBoundsToViewRoot(createNodeInfoFromView, view)) {
                return "View has the same dimensions as the View Root.";
            }
            if (!createNodeInfoFromView.Y()) {
                return "View is not visible.";
            }
            if (AccessibilityEvaluationUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                return "View is actionable, but has no description.";
            }
            if (AccessibilityEvaluationUtil.hasText(createNodeInfoFromView)) {
                return "View is not actionable, and an ancestor View has co-opted its description.";
            }
            return "View is not actionable and has no description.";
        } finally {
            createNodeInfoFromView.d0();
        }
    }

    public static FlipperObject getViewData(View view) {
        CharSequence charSequence;
        FlipperObject.Builder builder = new FlipperObject.Builder();
        if (view.getContentDescription() != null) {
            charSequence = view.getContentDescription();
        } else {
            charSequence = "";
        }
        builder.put("role", AccessibilityRoleUtil.getRole(view).toString()).put("role-description", (FlipperValue) InspectorValue.mutable(getRoleDescription(view))).put("content-description", (FlipperValue) InspectorValue.mutable(charSequence)).put("focusable", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isFocusable()))).put("selected", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isSelected()))).put("enabled", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isEnabled()))).put("long-clickable", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isLongClickable()))).put("clickable", (FlipperValue) InspectorValue.mutable(Boolean.valueOf(view.isClickable()))).put("focused", Boolean.valueOf(view.isFocused()));
        builder.put("accessibility-focused", Boolean.valueOf(view.isAccessibilityFocused()));
        builder.put("important-for-accessibility", (FlipperValue) sImportantForAccessibilityMapping.toPicker((EnumMapping<Integer>) Integer.valueOf(view.getImportantForAccessibility())));
        return builder.build();
    }

    public static boolean isAXFocused(View view) {
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return false;
        }
        boolean F = createNodeInfoFromView.F();
        createNodeInfoFromView.d0();
        return F;
    }

    public static boolean isAccessibilityEnabled(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean isTalkbackEnabled(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    private static String removeFinalDelimiter(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - delimiterLength, length);
        }
        return sb.toString();
    }

    private static boolean supportsAction(d4 d4Var, int i) {
        if (d4Var != null && (d4Var.k() & i) == i) {
            return true;
        }
        return false;
    }

    public static String getRoleDescription(d4 d4Var) {
        if (d4Var == null) {
            return null;
        }
        try {
            return (String) d4Var.z();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
