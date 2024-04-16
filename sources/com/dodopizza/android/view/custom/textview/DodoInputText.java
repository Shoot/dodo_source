package com.dodopizza.android.view.custom.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.dodopizza.android.view.custom.textview.DodoInputText;
import com.google.android.material.textfield.TextInputLayout;
@Deprecated
/* loaded from: classes.dex */
public class DodoInputText extends LinearLayout {
    private final Context a;
    private EditText b;
    private TextInputLayout c;
    private View.OnClickListener d;

    public DodoInputText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
        this.a = context;
    }

    private void b(Context context, AttributeSet attributeSet) {
        View inflate = View.inflate(context, sz8.dodo_edit_text_input_layout, this);
        this.b = (EditText) inflate.findViewById(vx8.edit_text);
        this.c = (TextInputLayout) inflate.findViewById(vx8.text_input_layout);
        d(context, attributeSet);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: b63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DodoInputText.this.c(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        gg5.d(this.b);
        View.OnClickListener onClickListener = this.d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.p0, 0, 0);
        int i = w19.w0;
        if (obtainStyledAttributes.hasValue(i)) {
            this.b.setText(obtainStyledAttributes.getString(i));
        }
        int i2 = w19.t0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.c.setHelperText(obtainStyledAttributes.getString(i2));
        }
        int i3 = w19.u0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.c.setHelperTextColor(obtainStyledAttributes.getColorStateList(i3));
        }
        int i4 = w19.v0;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.c.setHint(obtainStyledAttributes.getString(i4));
        }
        int i5 = w19.r0;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.c.setError(obtainStyledAttributes.getString(i5));
        }
        int i6 = w19.q0;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.b.setEnabled(obtainStyledAttributes.getBoolean(i6, true));
        }
        if (obtainStyledAttributes.hasValue(w19.m0)) {
            EditText editText = this.b;
            int i7 = w19.s0;
            editText.setFocusable(obtainStyledAttributes.getBoolean(i7, true));
            this.b.setFocusableInTouchMode(obtainStyledAttributes.getBoolean(i7, true));
        }
        obtainStyledAttributes.recycle();
    }

    public EditText getEditText() {
        return this.b;
    }

    public String getText() {
        return this.b.getText().toString();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setInputType(0);
    }

    public void setError(String str) {
        this.c.setError(str);
    }

    public void setHelperText(CharSequence charSequence) {
        this.c.setHelperText(charSequence);
    }

    public void setHint(String str) {
        this.c.setHint(str);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
        this.b.setOnClickListener(onClickListener);
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
