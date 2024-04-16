package com.facebook.flipper.plugins.uidebugger.stetho;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import defpackage.d4;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AccessibilityUtil.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/AccessibilityUtil;", "", "Ld4;", "node", "", "hasText", "Landroid/view/View;", "view", "isSpeakingNode", "hasNonActionableSpeakingDescendants", "isAccessibilityFocusable", "isTopLevelScrollItem", "isActionableForAccessibility", "hasFocusableAncestor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AccessibilityUtil {
    public static final AccessibilityUtil INSTANCE = new AccessibilityUtil();

    private AccessibilityUtil() {
    }

    public final boolean hasFocusableAncestor(d4 d4Var, View view) {
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
            if (isAccessibilityFocusable(Z, (View) K)) {
                Z.d0();
                return true;
            } else if (hasFocusableAncestor(Z, (View) K)) {
                Z.d0();
                return true;
            } else {
                Z.d0();
                return false;
            }
        } finally {
            z65.e(Z);
            Z.d0();
        }
    }

    public final boolean hasNonActionableSpeakingDescendants(d4 d4Var, View view) {
        if (d4Var != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount() - 1;
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        d4 Z = d4.Z();
                        try {
                            syb.h0(childAt, Z);
                            if (!isAccessibilityFocusable(Z, childAt) && isSpeakingNode(Z, childAt)) {
                                return true;
                            }
                        } finally {
                            Z.d0();
                        }
                    }
                    if (i == childCount) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return false;
    }

    public final boolean hasText(d4 d4Var) {
        if (d4Var == null) {
            return false;
        }
        if (TextUtils.isEmpty(d4Var.B()) && TextUtils.isEmpty(d4Var.t())) {
            return false;
        }
        return true;
    }

    public final boolean isAccessibilityFocusable(d4 d4Var, View view) {
        if (d4Var == null || view == null || !d4Var.Y()) {
            return false;
        }
        if (!isActionableForAccessibility(d4Var) && (!isTopLevelScrollItem(d4Var, view) || !isSpeakingNode(d4Var, view))) {
            return false;
        }
        return true;
    }

    public final boolean isActionableForAccessibility(d4 d4Var) {
        boolean Q;
        boolean Q2;
        boolean Q3;
        if (d4Var == null) {
            return false;
        }
        if (d4Var.I() || d4Var.R() || d4Var.O()) {
            return true;
        }
        List<d4.a> i = d4Var.i();
        z65.g(i, "node.actionList");
        List<d4.a> list = i;
        Q = sc1.Q(list, 16);
        if (!Q) {
            Q2 = sc1.Q(list, 32);
            if (!Q2) {
                Q3 = sc1.Q(list, 1);
                if (!Q3) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isSpeakingNode(d4 d4Var, View view) {
        int C;
        if (d4Var == null || view == null || !d4Var.Y() || (C = syb.C(view)) == 4) {
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

    public final boolean isTopLevelScrollItem(d4 d4Var, View view) {
        View view2;
        boolean Q;
        boolean Q2;
        if (d4Var == null || view == null || (view2 = (View) syb.K(view)) == null) {
            return false;
        }
        if (d4Var.V()) {
            return true;
        }
        List<d4.a> i = d4Var.i();
        z65.g(i, "node.actionList");
        List<d4.a> list = i;
        Q = sc1.Q(list, 4096);
        if (!Q) {
            Q2 = sc1.Q(list, 8192);
            if (!Q2) {
                if (view2 instanceof Spinner) {
                    return false;
                }
                if (!(view2 instanceof AdapterView) && !(view2 instanceof ScrollView) && !(view2 instanceof HorizontalScrollView)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
