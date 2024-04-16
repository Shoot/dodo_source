package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: DodoInputAutocompleteText.java */
/* renamed from: a63  reason: default package */
/* loaded from: classes.dex */
public class a63 extends FrameLayout {
    private final Context a;
    private AutoCompleteTextView b;
    private TextInputLayout c;
    private View.OnClickListener d;
    private boolean e;

    public a63(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        c(context, attributeSet);
        this.a = context;
    }

    private void c(Context context, AttributeSet attributeSet) {
        View inflate = View.inflate(context, sz8.dodo_edit_text_input_layout_autocomplete, this);
        this.b = (AutoCompleteTextView) inflate.findViewById(vx8.edit_text);
        this.c = (TextInputLayout) inflate.findViewById(vx8.text_input_layout);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: y53
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean d;
                d = a63.d(view);
                return d;
            }
        });
        f(context, attributeSet);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: z53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a63.this.e(view);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.setImportantForAutofill(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        gg5.d(this.b);
        View.OnClickListener onClickListener = this.d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.i0, 0, 0);
        int i = w19.o0;
        if (obtainStyledAttributes.hasValue(i)) {
            this.b.setText(obtainStyledAttributes.getString(i));
        }
        int i2 = w19.n0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.c.setHint(obtainStyledAttributes.getString(i2));
        }
        int i3 = w19.l0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.c.setError(obtainStyledAttributes.getString(i3));
        }
        int i4 = w19.k0;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.b.setEnabled(obtainStyledAttributes.getBoolean(i4, true));
        }
        int i5 = w19.j0;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.e = obtainStyledAttributes.getBoolean(i5, false);
        } else {
            this.e = false;
        }
        obtainStyledAttributes.recycle();
    }

    public AutoCompleteTextView getEditText() {
        return this.b;
    }

    public String getText() {
        return this.b.getText().toString();
    }

    public void setAdapter(ArrayAdapter arrayAdapter) {
        this.b.setAdapter(arrayAdapter);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.b.setFocusableInTouchMode(z);
        this.b.setFocusable(z);
        setClickable(z);
        if (z) {
            this.b.setInputType(1);
        } else {
            this.b.setInputType(0);
        }
    }

    public void setError(String str) {
        this.c.setError(str);
    }

    public void setHint(String str) {
        this.c.setHint(str);
    }

    public void setIsShowClearButton(boolean z) {
        this.e = z;
    }

    public void setOnClearListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
        this.c.setEndIconOnClickListener(onClickListener);
    }

    public void setText(String str) {
        this.c.setHintAnimationEnabled(false);
        this.b.setText(str);
        this.c.setHintAnimationEnabled(true);
    }

    public void setError(int i) {
        String string = this.a.getString(i);
        if (!string.isEmpty()) {
            this.c.setError(string);
        } else {
            this.c.setError(null);
        }
    }
}
