package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] h5;
    private CharSequence[] i5;
    private String j5;
    private String k5;
    private boolean l5;

    /* loaded from: classes.dex */
    public static final class a implements Preference.f<ListPreference> {
        private static a a;

        private a() {
        }

        public static a b() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.Y0())) {
                return listPreference.s().getString(a19.not_set);
            }
            return listPreference.Y0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.c0, i, i2);
        this.h5 = fob.q(obtainStyledAttributes, k29.f0, k29.d0);
        this.i5 = fob.q(obtainStyledAttributes, k29.g0, k29.e0);
        int i3 = k29.h0;
        if (fob.b(obtainStyledAttributes, i3, i3, false)) {
            I0(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k29.s0, i, i2);
        this.k5 = fob.o(obtainStyledAttributes2, k29.a1, k29.A0);
        obtainStyledAttributes2.recycle();
    }

    private int b1() {
        return W0(this.j5);
    }

    @Override // androidx.preference.Preference
    public void H0(CharSequence charSequence) {
        super.H0(charSequence);
        if (charSequence == null && this.k5 != null) {
            this.k5 = null;
        } else if (charSequence != null && !charSequence.equals(this.k5)) {
            this.k5 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence K() {
        if (L() != null) {
            return L().a(this);
        }
        CharSequence Y0 = Y0();
        CharSequence K = super.K();
        String str = this.k5;
        if (str == null) {
            return K;
        }
        Object[] objArr = new Object[1];
        if (Y0 == null) {
            Y0 = "";
        }
        objArr[0] = Y0;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, K)) {
            return K;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public int W0(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.i5) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (this.i5[length].equals(str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public CharSequence[] X0() {
        return this.h5;
    }

    public CharSequence Y0() {
        CharSequence[] charSequenceArr;
        int b1 = b1();
        if (b1 >= 0 && (charSequenceArr = this.h5) != null) {
            return charSequenceArr[b1];
        }
        return null;
    }

    public CharSequence[] Z0() {
        return this.i5;
    }

    public String a1() {
        return this.j5;
    }

    public void c1(CharSequence[] charSequenceArr) {
        this.h5 = charSequenceArr;
    }

    public void d1(CharSequence[] charSequenceArr) {
        this.i5 = charSequenceArr;
    }

    public void e1(String str) {
        boolean z = !TextUtils.equals(this.j5, str);
        if (z || !this.l5) {
            this.j5 = str;
            this.l5 = true;
            s0(str);
            if (z) {
                V();
            }
        }
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
            e1(savedState.a);
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
        savedState.a = a1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        e1(F((String) obj));
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
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.dialogPreferenceStyle, 16842897));
    }
}
