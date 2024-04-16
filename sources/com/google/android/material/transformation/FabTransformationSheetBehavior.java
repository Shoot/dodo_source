package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> i;

    public FabTransformationSheetBehavior() {
    }

    private void C(@NonNull View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            this.i = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (childAt != view && !z2) {
                if (!z) {
                    Map<View, Integer> map = this.i;
                    if (map != null && map.containsKey(childAt)) {
                        syb.F0(childAt, this.i.get(childAt).intValue());
                    }
                } else {
                    this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    syb.F0(childAt, 4);
                }
            }
        }
        if (!z) {
            this.i = null;
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    protected FabTransformationBehavior.e A(Context context, boolean z) {
        int i;
        if (z) {
            i = mv8.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = mv8.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.a = bp6.c(context, i);
        eVar.b = new yf8(17, 0.0f, 0.0f);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean d(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        C(view2, z);
        return super.d(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
