package com.facebook.flipper.plugins.inspector;

import android.graphics.Rect;
import android.view.View;
/* loaded from: classes2.dex */
public class HighlightedOverlay {
    private static final boolean VIEW_OVERLAY_SUPPORT = true;

    private static Rect enclose(Rect rect, Rect rect2) {
        return new Rect(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
    }

    public static void removeHighlight(View view) {
        if (!VIEW_OVERLAY_SUPPORT) {
            return;
        }
        float f = view.getContext().getResources().getDisplayMetrics().density;
        BoundsDrawable boundsDrawable = BoundsDrawable.getInstance(view, f);
        view.getRootView().getOverlay().remove(LinesDrawable.getInstance(view, f));
        view.getOverlay().remove(boundsDrawable);
    }

    public static void setHighlighted(View view, Rect rect, Rect rect2, Rect rect3, boolean z) {
        if (!VIEW_OVERLAY_SUPPORT) {
            return;
        }
        rect3.set(rect3.left + rect2.left, rect3.top + rect2.top, rect3.right - rect2.right, rect3.bottom - rect2.bottom);
        Rect enclose = enclose(rect2, rect3);
        Rect enclose2 = enclose(rect, enclose);
        float f = view.getContext().getResources().getDisplayMetrics().density;
        view.getOverlay().add(BoundsDrawable.getInstance(view, f, enclose2, enclose, rect3));
        if (z) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            LinesDrawable linesDrawable = LinesDrawable.getInstance(view, f, enclose2, enclose, new Rect(rect3.left + i, rect3.top + i2, i + rect3.right, i2 + rect3.bottom));
            view.setLayerType(1, null);
            view.getRootView().getOverlay().add(linesDrawable);
        }
    }
}
