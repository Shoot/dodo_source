package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean b5;
    private CharSequence c5;
    private CharSequence d5;
    private boolean e5;
    private boolean f5;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean L0() {
        if (!this.f5 ? this.b5 : !this.b5) {
            if (!super.L0()) {
                return false;
            }
        }
        return true;
    }

    public boolean Q0() {
        return this.b5;
    }

    public void R0(boolean z) {
        boolean z2;
        if (this.b5 != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.e5) {
            this.b5 = z;
            this.e5 = true;
            q0(z);
            if (z2) {
                W(L0());
                V();
            }
        }
    }

    public void S0(boolean z) {
        this.f5 = z;
    }

    public void T0(CharSequence charSequence) {
        this.d5 = charSequence;
        if (!Q0()) {
            V();
        }
    }

    public void U0(CharSequence charSequence) {
        this.c5 = charSequence;
        if (Q0()) {
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.b5
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.c5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.c5
            r5.setText(r0)
        L19:
            r0 = 0
            goto L2e
        L1b:
            boolean r0 = r4.b5
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.d5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.d5
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.K()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = 0
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.V0(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W0(PreferenceViewHolder preferenceViewHolder) {
        V0(preferenceViewHolder.findViewById(16908304));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void d0() {
        super.d0();
        boolean z = !Q0();
        if (g(Boolean.valueOf(z))) {
            R0(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void k0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.k0(savedState.getSuperState());
            R0(savedState.a);
            return;
        }
        super.k0(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable l0() {
        Parcelable l0 = super.l0();
        if (R()) {
            return l0;
        }
        SavedState savedState = new SavedState(l0);
        savedState.a = Q0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        R0(D(((Boolean) obj).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean a;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
