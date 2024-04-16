package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class BadgeState {
    private final State a;
    private final State b;
    final float c;
    final float d;
    final float e;

    /* loaded from: classes2.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        private int a;
        private Integer b;
        private Integer c;
        private int d;
        private int e;
        private int f;
        private Locale g;
        private CharSequence h;
        private int i;
        private int j;
        private Integer k;
        private Boolean l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Integer p;
        private Integer q;
        private Integer r;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<State> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a */
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.d = 255;
            this.e = -2;
            this.f = -2;
            this.l = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            String charSequence;
            parcel.writeInt(this.a);
            parcel.writeSerializable(this.b);
            parcel.writeSerializable(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            CharSequence charSequence2 = this.h;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.i);
            parcel.writeSerializable(this.k);
            parcel.writeSerializable(this.m);
            parcel.writeSerializable(this.n);
            parcel.writeSerializable(this.o);
            parcel.writeSerializable(this.p);
            parcel.writeSerializable(this.q);
            parcel.writeSerializable(this.r);
            parcel.writeSerializable(this.l);
            parcel.writeSerializable(this.g);
        }

        State(@NonNull Parcel parcel) {
            this.d = 255;
            this.e = -2;
            this.f = -2;
            this.l = Boolean.TRUE;
            this.a = parcel.readInt();
            this.b = (Integer) parcel.readSerializable();
            this.c = (Integer) parcel.readSerializable();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readInt();
            this.k = (Integer) parcel.readSerializable();
            this.m = (Integer) parcel.readSerializable();
            this.n = (Integer) parcel.readSerializable();
            this.o = (Integer) parcel.readSerializable();
            this.p = (Integer) parcel.readSerializable();
            this.q = (Integer) parcel.readSerializable();
            this.r = (Integer) parcel.readSerializable();
            this.l = (Boolean) parcel.readSerializable();
            this.g = (Locale) parcel.readSerializable();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeState(Context context, int i, int i2, int i3, State state) {
        CharSequence charSequence;
        int i4;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        Locale locale;
        Locale.Category category;
        State state2 = new State();
        this.b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.a = i;
        }
        TypedArray b = b(context, state.a, i2, i3);
        Resources resources = context.getResources();
        this.c = b.getDimensionPixelSize(b29.G, resources.getDimensionPixelSize(ww8.mtrl_badge_radius));
        this.e = b.getDimensionPixelSize(b29.I, resources.getDimensionPixelSize(ww8.mtrl_badge_long_text_horizontal_padding));
        this.d = b.getDimensionPixelSize(b29.J, resources.getDimensionPixelSize(ww8.mtrl_badge_with_text_radius));
        state2.d = state.d == -2 ? 255 : state.d;
        if (state.h != null) {
            charSequence = state.h;
        } else {
            charSequence = context.getString(w09.mtrl_badge_numberless_content_description);
        }
        state2.h = charSequence;
        state2.i = state.i == 0 ? g09.mtrl_badge_content_description : state.i;
        state2.j = state.j == 0 ? w09.mtrl_exceed_max_badge_number_content_description : state.j;
        state2.l = Boolean.valueOf(state.l == null || state.l.booleanValue());
        if (state.f != -2) {
            i4 = state.f;
        } else {
            i4 = b.getInt(b29.M, 4);
        }
        state2.f = i4;
        if (state.e != -2) {
            state2.e = state.e;
        } else {
            int i5 = b29.N;
            if (b.hasValue(i5)) {
                state2.e = b.getInt(i5, 0);
            } else {
                state2.e = -1;
            }
        }
        if (state.b != null) {
            intValue = state.b.intValue();
        } else {
            intValue = v(context, b, b29.E);
        }
        state2.b = Integer.valueOf(intValue);
        if (state.c != null) {
            state2.c = state.c;
        } else {
            int i6 = b29.H;
            if (b.hasValue(i6)) {
                state2.c = Integer.valueOf(v(context, b, i6));
            } else {
                state2.c = Integer.valueOf(new fab(context, i19.TextAppearance_MaterialComponents_Badge).i().getDefaultColor());
            }
        }
        if (state.k != null) {
            intValue2 = state.k.intValue();
        } else {
            intValue2 = b.getInt(b29.F, 8388661);
        }
        state2.k = Integer.valueOf(intValue2);
        if (state.m != null) {
            intValue3 = state.m.intValue();
        } else {
            intValue3 = b.getDimensionPixelOffset(b29.K, 0);
        }
        state2.m = Integer.valueOf(intValue3);
        if (state.m != null) {
            intValue4 = state.n.intValue();
        } else {
            intValue4 = b.getDimensionPixelOffset(b29.O, 0);
        }
        state2.n = Integer.valueOf(intValue4);
        if (state.o != null) {
            intValue5 = state.o.intValue();
        } else {
            intValue5 = b.getDimensionPixelOffset(b29.L, state2.m.intValue());
        }
        state2.o = Integer.valueOf(intValue5);
        if (state.p != null) {
            intValue6 = state.p.intValue();
        } else {
            intValue6 = b.getDimensionPixelOffset(b29.P, state2.n.intValue());
        }
        state2.p = Integer.valueOf(intValue6);
        state2.q = Integer.valueOf(state.q == null ? 0 : state.q.intValue());
        state2.r = Integer.valueOf(state.r != null ? state.r.intValue() : 0);
        b.recycle();
        if (state.g == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            state2.g = locale;
        } else {
            state2.g = state.g;
        }
        this.a = state;
    }

    private TypedArray b(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            AttributeSet a = v83.a(context, i, "badge");
            i4 = a.getStyleAttribute();
            attributeSet = a;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return sdb.h(context, attributeSet, b29.D, i2, i5, new int[0]);
    }

    private static int v(Context context, @NonNull TypedArray typedArray, int i) {
        return ea6.a(context, typedArray, i).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i) {
        this.a.f = i;
        this.b.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i) {
        this.a.e = i;
        this.b.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int i) {
        this.a.p = Integer.valueOf(i);
        this.b.p = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(int i) {
        this.a.n = Integer.valueOf(i);
        this.b.n = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(boolean z) {
        this.a.l = Boolean.valueOf(z);
        this.b.l = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        B(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.b.q.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.b.r.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.b.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.b.b.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.b.k.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.b.c.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.b.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence j() {
        return this.b.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.b.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.b.o.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.b.m.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.b.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.b.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale p() {
        return this.b.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State q() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.b.p.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.b.n.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        if (this.b.e != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        return this.b.l.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i) {
        this.a.d = i;
        this.b.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(int i) {
        this.a.b = Integer.valueOf(i);
        this.b.b = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i) {
        this.a.o = Integer.valueOf(i);
        this.b.o = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(int i) {
        this.a.m = Integer.valueOf(i);
        this.b.m = Integer.valueOf(i);
    }
}
