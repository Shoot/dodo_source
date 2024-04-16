package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a g5;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.R0(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void X0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.b5);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.g5);
        }
    }

    private void Y0(View view) {
        if (!((AccessibilityManager) s().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        X0(view.findViewById(16908289));
        V0(view.findViewById(16908304));
    }

    @Override // androidx.preference.Preference
    public void c0(PreferenceViewHolder preferenceViewHolder) {
        super.c0(preferenceViewHolder);
        X0(preferenceViewHolder.findViewById(16908289));
        W0(preferenceViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void p0(View view) {
        super.p0(view);
        Y0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g5 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.s, i, i2);
        U0(fob.o(obtainStyledAttributes, k29.y, k29.t));
        T0(fob.o(obtainStyledAttributes, k29.x, k29.u));
        S0(fob.b(obtainStyledAttributes, k29.w, k29.v, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.checkBoxPreferenceStyle, 16842895));
    }
}
