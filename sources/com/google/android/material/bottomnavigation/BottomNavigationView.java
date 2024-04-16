package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.e0;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.z0c;
/* loaded from: classes2.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements z0c.d {
        a() {
        }

        @Override // defpackage.z0c.d
        @NonNull
        public c5c a(View view, @NonNull c5c c5cVar, @NonNull z0c.e eVar) {
            int i;
            eVar.d += c5cVar.i();
            boolean z = true;
            if (syb.E(view) != 1) {
                z = false;
            }
            int j = c5cVar.j();
            int k = c5cVar.k();
            int i2 = eVar.a;
            if (z) {
                i = k;
            } else {
                i = j;
            }
            eVar.a = i2 + i;
            int i3 = eVar.c;
            if (!z) {
                j = k;
            }
            eVar.c = i3 + j;
            eVar.a(view);
            return c5cVar;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface b extends NavigationBarView.b {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c extends NavigationBarView.c {
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.bottomNavigationStyle);
    }

    private void h(@NonNull Context context) {
        View view = new View(context);
        view.setBackgroundColor(iu1.c(context, gw8.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(ww8.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void i() {
        z0c.b(this, new a());
    }

    private int j(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumHeight > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        return i;
    }

    private boolean k() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    protected com.google.android.material.navigation.b d(@NonNull Context context) {
        return new xe0(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, j(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        xe0 xe0Var = (xe0) getMenuView();
        if (xe0Var.r() != z) {
            xe0Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, i19.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        e0 i3 = sdb.i(context2, attributeSet, b29.a0, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(i3.a(b29.c0, true));
        int i4 = b29.b0;
        if (i3.s(i4)) {
            setMinimumHeight(i3.f(i4, 0));
        }
        i3.w();
        if (k()) {
            h(context2);
        }
        i();
    }
}
