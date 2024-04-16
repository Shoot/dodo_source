package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
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
            if (!SwitchPreferenceCompat.this.g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.R0(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g5 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.P1, i, i2);
        U0(fob.o(obtainStyledAttributes, k29.X1, k29.Q1));
        T0(fob.o(obtainStyledAttributes, k29.W1, k29.R1));
        Y0(fob.o(obtainStyledAttributes, k29.Z1, k29.T1));
        X0(fob.o(obtainStyledAttributes, k29.Y1, k29.U1));
        S0(fob.b(obtainStyledAttributes, k29.V1, k29.S1, false));
        obtainStyledAttributes.recycle();
    }

    private void Z0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.b5);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.h5);
            switchCompat.setTextOff(this.i5);
            switchCompat.setOnCheckedChangeListener(this.g5);
        }
    }

    private void a1(View view) {
        if (!((AccessibilityManager) s().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        Z0(view.findViewById(vy8.switchWidget));
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
        Z0(preferenceViewHolder.findViewById(vy8.switchWidget));
        W0(preferenceViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void p0(View view) {
        super.p0(view);
        a1(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vv8.switchPreferenceCompatStyle);
    }
}
