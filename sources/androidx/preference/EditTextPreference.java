package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String h5;
    private a i5;

    /* loaded from: classes.dex */
    public interface a {
        void a(@NonNull EditText editText);
    }

    /* loaded from: classes.dex */
    public static final class b implements Preference.f<EditTextPreference> {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.X0())) {
                return editTextPreference.s().getString(a19.not_set);
            }
            return editTextPreference.X0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.R, i, i2);
        int i3 = k29.S;
        if (fob.b(obtainStyledAttributes, i3, i3, false)) {
            I0(b.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean L0() {
        if (!TextUtils.isEmpty(this.h5) && !super.L0()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a W0() {
        return this.i5;
    }

    public String X0() {
        return this.h5;
    }

    public void Y0(a aVar) {
        this.i5 = aVar;
    }

    public void Z0(String str) {
        boolean L0 = L0();
        this.h5 = str;
        s0(str);
        boolean L02 = L0();
        if (L02 != L0) {
            W(L02);
        }
        V();
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void k0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.k0(savedState.getSuperState());
            Z0(savedState.a);
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
        savedState.a = X0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        Z0(F((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String a;

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
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.editTextPreferenceStyle, 16842898));
    }
}
