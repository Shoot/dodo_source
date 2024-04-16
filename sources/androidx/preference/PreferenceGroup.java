package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final wka<String, Long> b5;
    private final Handler c5;
    private List<Preference> d5;
    private boolean e5;
    private int f5;
    private boolean g5;
    private int h5;
    private final Runnable i5;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.b5.clear();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b5 = new wka<>();
        this.c5 = new Handler();
        this.e5 = true;
        this.f5 = 0;
        this.g5 = false;
        this.h5 = Integer.MAX_VALUE;
        this.i5 = new a();
        this.d5 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.j1, i, i2);
        int i3 = k29.l1;
        this.e5 = fob.b(obtainStyledAttributes, i3, i3, true);
        int i4 = k29.k1;
        if (obtainStyledAttributes.hasValue(i4)) {
            Z0(fob.d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public void Q0(Preference preference) {
        R0(preference);
    }

    public boolean R0(Preference preference) {
        long f;
        if (this.d5.contains(preference)) {
            return true;
        }
        if (preference.z() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.C() != null) {
                preferenceGroup = preferenceGroup.C();
            }
            String z = preference.z();
            if (preferenceGroup.S0(z) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + z + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.B() == Integer.MAX_VALUE) {
            if (this.e5) {
                int i = this.f5;
                this.f5 = i + 1;
                preference.G0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).a1(this.e5);
            }
        }
        int binarySearch = Collections.binarySearch(this.d5, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!Y0(preference)) {
            return false;
        }
        synchronized (this) {
            this.d5.add(binarySearch, preference);
        }
        g I = I();
        String z2 = preference.z();
        if (z2 != null && this.b5.containsKey(z2)) {
            f = this.b5.get(z2).longValue();
            this.b5.remove(z2);
        } else {
            f = I.f();
        }
        preference.b0(I, f);
        preference.a(this);
        if (this.g5) {
            preference.Y();
        }
        X();
        return true;
    }

    public <T extends Preference> T S0(@NonNull CharSequence charSequence) {
        T t;
        if (charSequence != null) {
            if (TextUtils.equals(z(), charSequence)) {
                return this;
            }
            int W0 = W0();
            for (int i = 0; i < W0; i++) {
                T t2 = (T) V0(i);
                if (TextUtils.equals(t2.z(), charSequence)) {
                    return t2;
                }
                if ((t2 instanceof PreferenceGroup) && (t = (T) ((PreferenceGroup) t2).S0(charSequence)) != null) {
                    return t;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int T0() {
        return this.h5;
    }

    public b U0() {
        return null;
    }

    public Preference V0(int i) {
        return this.d5.get(i);
    }

    @Override // androidx.preference.Preference
    public void W(boolean z) {
        super.W(z);
        int W0 = W0();
        for (int i = 0; i < W0; i++) {
            V0(i).i0(this, z);
        }
    }

    public int W0() {
        return this.d5.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean X0() {
        return true;
    }

    @Override // androidx.preference.Preference
    public void Y() {
        super.Y();
        this.g5 = true;
        int W0 = W0();
        for (int i = 0; i < W0; i++) {
            V0(i).Y();
        }
    }

    protected boolean Y0(Preference preference) {
        preference.i0(this, L0());
        return true;
    }

    public void Z0(int i) {
        if (i != Integer.MAX_VALUE && !O()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.h5 = i;
    }

    public void a1(boolean z) {
        this.e5 = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1() {
        synchronized (this) {
            Collections.sort(this.d5);
        }
    }

    @Override // androidx.preference.Preference
    public void f0() {
        super.f0();
        this.g5 = false;
        int W0 = W0();
        for (int i = 0; i < W0; i++) {
            V0(i).f0();
        }
    }

    @Override // androidx.preference.Preference
    protected void k(Bundle bundle) {
        super.k(bundle);
        int W0 = W0();
        for (int i = 0; i < W0; i++) {
            V0(i).k(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.h5 = savedState.a;
            super.k0(savedState.getSuperState());
            return;
        }
        super.k0(parcelable);
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        return new SavedState(super.l0(), this.h5);
    }

    @Override // androidx.preference.Preference
    protected void o(Bundle bundle) {
        super.o(bundle);
        int W0 = W0();
        for (int i = 0; i < W0; i++) {
            V0(i).o(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;

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
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
