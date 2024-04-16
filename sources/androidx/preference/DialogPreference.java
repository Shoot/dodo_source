package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence b5;
    private CharSequence c5;
    private Drawable d5;
    private CharSequence e5;
    private CharSequence f5;
    private int g5;

    /* loaded from: classes.dex */
    public interface a {
        <T extends Preference> T sa(@NonNull CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k29.D, i, i2);
        String o = fob.o(obtainStyledAttributes, k29.N, k29.E);
        this.b5 = o;
        if (o == null) {
            this.b5 = M();
        }
        this.c5 = fob.o(obtainStyledAttributes, k29.M, k29.F);
        this.d5 = fob.c(obtainStyledAttributes, k29.K, k29.G);
        this.e5 = fob.o(obtainStyledAttributes, k29.P, k29.H);
        this.f5 = fob.o(obtainStyledAttributes, k29.O, k29.I);
        this.g5 = fob.n(obtainStyledAttributes, k29.L, k29.J, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable Q0() {
        return this.d5;
    }

    public int R0() {
        return this.g5;
    }

    public CharSequence S0() {
        return this.c5;
    }

    public CharSequence T0() {
        return this.b5;
    }

    public CharSequence U0() {
        return this.f5;
    }

    public CharSequence V0() {
        return this.e5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void d0() {
        I().u(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fob.a(context, vv8.dialogPreferenceStyle, 16842897));
    }
}
