package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import com.google.android.material.navigation.a;
import com.google.android.material.navigation.b;
/* compiled from: BottomNavigationMenuView.java */
/* renamed from: xe0  reason: default package */
/* loaded from: classes2.dex */
public class xe0 extends b {
    private final int T4;
    private final int U4;
    private final int V4;
    private final int W4;
    private boolean X4;
    private int[] Y4;

    public xe0(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.T4 = resources.getDimensionPixelSize(ww8.design_bottom_navigation_item_max_width);
        this.U4 = resources.getDimensionPixelSize(ww8.design_bottom_navigation_item_min_width);
        this.V4 = resources.getDimensionPixelSize(ww8.design_bottom_navigation_active_item_max_width);
        this.W4 = resources.getDimensionPixelSize(ww8.design_bottom_navigation_active_item_min_width);
        this.Y4 = new int[5];
    }

    @Override // com.google.android.material.navigation.b
    @NonNull
    protected a g(@NonNull Context context) {
        return new we0(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (syb.E(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.G().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i6 = 1;
        if (k(getLabelVisibilityMode(), size2) && r()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i7 = this.W4;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.V4, Integer.MIN_VALUE), makeMeasureSpec);
                i7 = Math.max(i7, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i8 = size2 - i3;
            int min = Math.min(size - (this.U4 * i8), Math.min(i7, this.V4));
            int i9 = size - min;
            if (i8 == 0) {
                i4 = 1;
            } else {
                i4 = i8;
            }
            int min2 = Math.min(i9 / i4, this.T4);
            int i10 = i9 - (i8 * min2);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getVisibility() != 8) {
                    int[] iArr = this.Y4;
                    if (i11 == getSelectedItemPosition()) {
                        i5 = min;
                    } else {
                        i5 = min2;
                    }
                    iArr[i11] = i5;
                    if (i10 > 0) {
                        int[] iArr2 = this.Y4;
                        iArr2[i11] = iArr2[i11] + 1;
                        i10--;
                    }
                } else {
                    this.Y4[i11] = 0;
                }
            }
        } else {
            if (size2 != 0) {
                i6 = size2;
            }
            int min3 = Math.min(size / i6, this.V4);
            int i12 = size - (size2 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr3 = this.Y4;
                    iArr3[i13] = min3;
                    if (i12 > 0) {
                        iArr3[i13] = min3 + 1;
                        i12--;
                    }
                } else {
                    this.Y4[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.Y4[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public boolean r() {
        return this.X4;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.X4 = z;
    }
}
