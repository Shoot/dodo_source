package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends b54 implements k.a {
    private static final int[] U4 = {16842912};
    private g A;
    private ColorStateList B;
    private boolean I;
    private Drawable S4;
    private final s2 T4;
    private int v;
    private boolean w;
    boolean x;
    private final CheckedTextView y;
    private FrameLayout z;

    /* loaded from: classes2.dex */
    class a extends s2 {
        a() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            d4Var.l0(NavigationMenuItemView.this.x);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (E()) {
            this.y.setVisibility(8);
            FrameLayout frameLayout = this.z;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.y.setVisibility(0);
        FrameLayout frameLayout2 = this.z;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.z.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(aw8.x, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(U4, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean E() {
        if (this.A.getTitle() == null && this.A.getIcon() == null && this.A.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.z == null) {
                this.z = (FrameLayout) ((ViewStub) findViewById(ky8.design_menu_item_action_area_stub)).inflate();
            }
            this.z.removeAllViews();
            this.z.addView(view);
        }
    }

    public void D() {
        FrameLayout frameLayout = this.z;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.y.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(@NonNull g gVar, int i) {
        int i2;
        this.A = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            syb.y0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        yib.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.A;
        if (gVar != null && gVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, U4);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.T4.l(this.y, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.y.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = f83.r(drawable).mutate();
                f83.o(drawable, this.B);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.S4 == null) {
                Drawable f = ek9.f(getResources(), dx8.navigation_empty_icon, getContext().getTheme());
                this.S4 = f;
                if (f != null) {
                    int i2 = this.v;
                    f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.S4;
        }
        edb.j(this.y, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.y.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.B = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.I = z;
        g gVar = this.A;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.y.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        edb.o(this.y, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y.setText(charSequence);
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.T4 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(kz8.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ww8.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ky8.design_menu_item_text);
        this.y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        syb.u0(checkedTextView, aVar);
    }
}
