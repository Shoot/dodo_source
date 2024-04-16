package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] h5;
    private CharSequence[] i5;
    private Set<String> j5;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j5 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.l0, i, i2);
        this.h5 = fob.q(obtainStyledAttributes, k29.o0, k29.m0);
        this.i5 = fob.q(obtainStyledAttributes, k29.p0, k29.n0);
        obtainStyledAttributes.recycle();
    }

    public CharSequence[] W0() {
        return this.h5;
    }

    public CharSequence[] X0() {
        return this.i5;
    }

    public Set<String> Y0() {
        return this.j5;
    }

    public void Z0(CharSequence[] charSequenceArr) {
        this.h5 = charSequenceArr;
    }

    public void a1(CharSequence[] charSequenceArr) {
        this.i5 = charSequenceArr;
    }

    public void b1(Set<String> set) {
        this.j5.clear();
        this.j5.addAll(set);
        t0(set);
        V();
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void k0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.k0(savedState.getSuperState());
            b1(savedState.a);
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
        savedState.a = Y0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        b1(G((Set) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Set<String> a;

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
            int readInt = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            Set<String> set = this.a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.dialogPreferenceStyle, 16842897));
    }
}
