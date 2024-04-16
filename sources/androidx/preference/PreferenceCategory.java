package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.d4;
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean L0() {
        return !super.Q();
    }

    @Override // androidx.preference.Preference
    public boolean Q() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void c0(PreferenceViewHolder preferenceViewHolder) {
        super.c0(preferenceViewHolder);
        if (Build.VERSION.SDK_INT >= 28) {
            preferenceViewHolder.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    public void h0(d4 d4Var) {
        d4.c s;
        super.h0(d4Var);
        if (Build.VERSION.SDK_INT >= 28 || (s = d4Var.s()) == null) {
            return;
        }
        d4Var.q0(d4.c.f(s.c(), s.d(), s.a(), s.b(), true, s.e()));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.preferenceCategoryStyle, 16842892));
    }
}
