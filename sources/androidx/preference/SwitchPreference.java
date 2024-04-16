package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a g5;
    private CharSequence h5;
    private CharSequence i5;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.R0(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g5 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.E1, i, i2);
        U0(fob.o(obtainStyledAttributes, k29.M1, k29.F1));
        T0(fob.o(obtainStyledAttributes, k29.L1, k29.G1));
        Y0(fob.o(obtainStyledAttributes, k29.O1, k29.I1));
        X0(fob.o(obtainStyledAttributes, k29.N1, k29.J1));
        S0(fob.b(obtainStyledAttributes, k29.K1, k29.H1, false));
        obtainStyledAttributes.recycle();
    }

    private void Z0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.b5);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.h5);
            r4.setTextOff(this.i5);
            r4.setOnCheckedChangeListener(this.g5);
        }
    }

    private void a1(View view) {
        if (!((AccessibilityManager) s().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        Z0(view.findViewById(16908352));
        V0(view.findViewById(16908304));
    }

    public void X0(CharSequence charSequence) {
        this.i5 = charSequence;
        V();
    }

    public void Y0(CharSequence charSequence) {
        this.h5 = charSequence;
        V();
    }

    @Override // androidx.preference.Preference
    public void c0(PreferenceViewHolder preferenceViewHolder) {
        super.c0(preferenceViewHolder);
        Z0(preferenceViewHolder.findViewById(16908352));
        W0(preferenceViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void p0(View view) {
        super.p0(view);
        a1(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.switchPreferenceStyle, 16843629));
    }
}
