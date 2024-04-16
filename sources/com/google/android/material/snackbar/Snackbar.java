package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] A;
    private static final int[] z;
    private final AccessibilityManager x;
    private boolean y;

    /* loaded from: classes2.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.t {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        final /* synthetic */ View.OnClickListener a;

        a(View.OnClickListener onClickListener) {
            this.a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.onClick(view);
            Snackbar.this.t(1);
        }
    }

    static {
        int i = qv8.snackbarButtonStyle;
        z = new int[]{i};
        A = new int[]{i, qv8.snackbarTextViewStyle};
    }

    private Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull eu1 eu1Var) {
        super(context, viewGroup, view, eu1Var);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup c0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button d0() {
        return e0().getActionView();
    }

    private SnackbarContentLayout e0() {
        return (SnackbarContentLayout) this.c.getChildAt(0);
    }

    private TextView f0() {
        return e0().getMessageView();
    }

    private static boolean g0(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    @NonNull
    public static Snackbar h0(@NonNull View view, int i, int i2) {
        return i0(view, view.getResources().getText(i), i2);
    }

    @NonNull
    public static Snackbar i0(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        return j0(null, view, charSequence, i);
    }

    @NonNull
    private static Snackbar j0(Context context, @NonNull View view, @NonNull CharSequence charSequence, int i) {
        int i2;
        ViewGroup c0 = c0(view);
        if (c0 != null) {
            if (context == null) {
                context = c0.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (g0(context)) {
                i2 = kz8.mtrl_layout_snackbar_include;
            } else {
                i2 = kz8.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, c0, false);
            Snackbar snackbar = new Snackbar(context, c0, snackbarContentLayout, snackbarContentLayout);
            snackbar.m0(charSequence);
            snackbar.Q(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void U() {
        super.U();
    }

    @NonNull
    public Snackbar k0(int i, View.OnClickListener onClickListener) {
        return l0(w().getText(i), onClickListener);
    }

    @NonNull
    public Snackbar l0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button d0 = d0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.y = true;
            d0.setVisibility(0);
            d0.setText(charSequence);
            d0.setOnClickListener(new a(onClickListener));
        } else {
            d0.setVisibility(8);
            d0.setOnClickListener(null);
            this.y = false;
        }
        return this;
    }

    @NonNull
    public Snackbar m0(@NonNull CharSequence charSequence) {
        f0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void s() {
        super.s();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int x() {
        int i;
        int recommendedTimeoutMillis;
        int x = super.x();
        if (x == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.y) {
                i = 4;
            } else {
                i = 0;
            }
            recommendedTimeoutMillis = this.x.getRecommendedTimeoutMillis(x, i | 3);
            return recommendedTimeoutMillis;
        } else if (this.y && this.x.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return x;
        }
    }
}
