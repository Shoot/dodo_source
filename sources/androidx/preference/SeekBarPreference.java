package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int b5;
    int c5;
    private int d5;
    private int e5;
    boolean f5;
    SeekBar g5;
    private TextView h5;
    boolean i5;
    private boolean j5;
    boolean k5;
    private SeekBar.OnSeekBarChangeListener l5;
    private View.OnKeyListener m5;

    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.k5 || !seekBarPreference.f5) {
                    seekBarPreference.U0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.V0(i + seekBarPreference2.c5);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.c5 != seekBarPreference.b5) {
                seekBarPreference.U0(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.i5 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.g5;
            if (seekBar == null) {
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.l5 = new a();
        this.m5 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.t1, i, i2);
        this.c5 = obtainStyledAttributes.getInt(k29.w1, 0);
        Q0(obtainStyledAttributes.getInt(k29.u1, 100));
        R0(obtainStyledAttributes.getInt(k29.x1, 0));
        this.i5 = obtainStyledAttributes.getBoolean(k29.v1, true);
        this.j5 = obtainStyledAttributes.getBoolean(k29.y1, false);
        this.k5 = obtainStyledAttributes.getBoolean(k29.z1, false);
        obtainStyledAttributes.recycle();
    }

    private void T0(int i, boolean z) {
        int i2 = this.c5;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.d5;
        if (i > i3) {
            i = i3;
        }
        if (i != this.b5) {
            this.b5 = i;
            V0(i);
            r0(i);
            if (z) {
                V();
            }
        }
    }

    public final void Q0(int i) {
        int i2 = this.c5;
        if (i < i2) {
            i = i2;
        }
        if (i != this.d5) {
            this.d5 = i;
            V();
        }
    }

    public final void R0(int i) {
        if (i != this.e5) {
            this.e5 = Math.min(this.d5 - this.c5, Math.abs(i));
            V();
        }
    }

    public void S0(int i) {
        T0(i, true);
    }

    void U0(SeekBar seekBar) {
        int progress = this.c5 + seekBar.getProgress();
        if (progress != this.b5) {
            if (g(Integer.valueOf(progress))) {
                T0(progress, false);
                return;
            }
            seekBar.setProgress(this.b5 - this.c5);
            V0(this.b5);
        }
    }

    void V0(int i) {
        TextView textView = this.h5;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public void c0(PreferenceViewHolder preferenceViewHolder) {
        super.c0(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.m5);
        this.g5 = (SeekBar) preferenceViewHolder.findViewById(vy8.seekbar);
        TextView textView = (TextView) preferenceViewHolder.findViewById(vy8.seekbar_value);
        this.h5 = textView;
        if (this.j5) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h5 = null;
        }
        SeekBar seekBar = this.g5;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.l5);
        this.g5.setMax(this.d5 - this.c5);
        int i = this.e5;
        if (i != 0) {
            this.g5.setKeyProgressIncrement(i);
        } else {
            this.e5 = this.g5.getKeyProgressIncrement();
        }
        this.g5.setProgress(this.b5 - this.c5);
        V0(this.b5);
        this.g5.setEnabled(Q());
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void k0(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.k0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.k0(savedState.getSuperState());
        this.b5 = savedState.a;
        this.c5 = savedState.b;
        this.d5 = savedState.c;
        V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable l0() {
        Parcelable l0 = super.l0();
        if (R()) {
            return l0;
        }
        SavedState savedState = new SavedState(l0);
        savedState.a = this.b5;
        savedState.b = this.c5;
        savedState.c = this.d5;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        S0(E(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;
        int c;

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
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vv8.seekBarPreferenceStyle);
    }
}
