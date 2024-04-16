package com.facebook.flipper.plugins.inspector.descriptors.utils;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityRoleUtil;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AndroidRootResolver;
import defpackage.d4;
import java.util.List;
/* loaded from: classes2.dex */
public class AccessibilityEvaluationUtil {
    private AccessibilityEvaluationUtil() {
    }

    public static boolean hasEqualBoundsToViewRoot(d4 d4Var, View view) {
        List<AndroidRootResolver.Root> listActiveRoots = new AndroidRootResolver().listActiveRoots();
        if (listActiveRoots != null) {
            for (AndroidRootResolver.Root root : listActiveRoots) {
                View view2 = root.view;
                if (view == view2) {
                    return true;
                }
                if (viewIsDescendant(view, view2)) {
                    Rect rect = new Rect();
                    d4Var.n(rect);
                    Rect rect2 = new Rect();
                    WindowManager.LayoutParams layoutParams = root.param;
                    int i = layoutParams.x;
                    int i2 = layoutParams.y;
                    rect2.set(i, i2, layoutParams.width + i, layoutParams.height + i2);
                    return rect.equals(rect2);
                }
            }
            return false;
        }
        return false;
    }

    public static boolean hasFocusableAncestor(d4 d4Var, View view) {
        if (d4Var == null || view == null) {
            return false;
        }
        ViewParent K = syb.K(view);
        if (!(K instanceof View)) {
            return false;
        }
        d4 Z = d4.Z();
        try {
            syb.h0((View) K, Z);
            if (Z == null) {
                return false;
            }
            if (hasEqualBoundsToViewRoot(Z, (View) K) && Z.o() > 0) {
                return false;
            }
            if (isAccessibilityFocusable(Z, (View) K)) {
                return true;
            }
            if (!hasFocusableAncestor(Z, (View) K)) {
                return false;
            }
            return true;
        } finally {
            Z.d0();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(d4 d4Var, View view) {
        if (d4Var != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    d4 Z = d4.Z();
                    try {
                        syb.h0(childAt, Z);
                        if (Z.Y() && !isAccessibilityFocusable(Z, childAt) && isSpeakingNode(Z, childAt)) {
                            Z.d0();
                            return true;
                        }
                        Z.d0();
                    } catch (Throwable th) {
                        if (Z != null) {
                            Z.d0();
                        }
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(d4 d4Var) {
        if (d4Var != null && d4Var.r() == null && (!TextUtils.isEmpty(d4Var.B()) || !TextUtils.isEmpty(d4Var.t()))) {
            return true;
        }
        return false;
    }

    public static boolean isAccessibilityFocusable(d4 d4Var, View view) {
        if (d4Var == null || view == null || !d4Var.Y()) {
            return false;
        }
        if (isActionableForAccessibility(d4Var)) {
            return true;
        }
        if (!isTopLevelScrollItem(d4Var, view) || !isSpeakingNode(d4Var, view)) {
            return false;
        }
        return true;
    }

    public static boolean isActionableForAccessibility(d4 d4Var) {
        if (d4Var == null) {
            return false;
        }
        if (d4Var.I() || d4Var.R() || d4Var.O()) {
            return true;
        }
        List<d4.a> i = d4Var.i();
        if (!i.contains(16) && !i.contains(32) && !i.contains(1)) {
            return false;
        }
        return true;
    }

    public static boolean isSpeakingNode(d4 d4Var, View view) {
        int C;
        if (d4Var == null || view == null || (C = syb.C(view)) == 4) {
            return false;
        }
        if (C == 2 && d4Var.o() <= 0) {
            return false;
        }
        if (!d4Var.G() && !hasText(d4Var) && !hasNonActionableSpeakingDescendants(d4Var, view)) {
            return false;
        }
        return true;
    }

    public static boolean isTalkbackFocusable(View view) {
        int C;
        if (view == null || (C = syb.C(view)) == 2 || C == 4) {
            return false;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (syb.C((View) parent) == 4) {
                return false;
            }
        }
        d4 createNodeInfoFromView = ViewAccessibilityHelper.createNodeInfoFromView(view);
        if (createNodeInfoFromView == null) {
            return false;
        }
        if (hasEqualBoundsToViewRoot(createNodeInfoFromView, view) && createNodeInfoFromView.o() > 0) {
            return false;
        }
        try {
            if (!createNodeInfoFromView.Y()) {
                return false;
            }
            if (isAccessibilityFocusable(createNodeInfoFromView, view)) {
                if (createNodeInfoFromView.o() <= 0) {
                    return true;
                }
                if (!isSpeakingNode(createNodeInfoFromView, view)) {
                    return false;
                }
                return true;
            } else if (!hasText(createNodeInfoFromView)) {
                return false;
            } else {
                if (hasFocusableAncestor(createNodeInfoFromView, view)) {
                    return false;
                }
                return true;
            }
        } finally {
            createNodeInfoFromView.d0();
        }
    }

    public static boolean isTopLevelScrollItem(d4 d4Var, View view) {
        View view2;
        AccessibilityRoleUtil.AccessibilityRole role;
        if (d4Var == null || view == null || (view2 = (View) syb.K(view)) == null) {
            return false;
        }
        if (d4Var.V()) {
            return true;
        }
        List<d4.a> i = d4Var.i();
        if (i.contains(4096) || i.contains(8192)) {
            return true;
        }
        View view3 = (View) syb.K(view2);
        if ((view3 == null || AccessibilityRoleUtil.getRole(view3) != AccessibilityRoleUtil.AccessibilityRole.PAGER) && (role = AccessibilityRoleUtil.getRole(view2)) != AccessibilityRoleUtil.AccessibilityRole.LIST && role != AccessibilityRoleUtil.AccessibilityRole.GRID && role != AccessibilityRoleUtil.AccessibilityRole.SCROLL_VIEW && role != AccessibilityRoleUtil.AccessibilityRole.HORIZONTAL_SCROLL_VIEW) {
            return false;
        }
        return true;
    }

    private static boolean viewIsDescendant(View view, View view2) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view2) {
                return true;
            }
        }
        return false;
    }
}
