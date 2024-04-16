package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.h;
import com.google.android.material.textview.MaterialTextView;
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends f {
    @Override // androidx.appcompat.app.f
    @NonNull
    protected d c(@NonNull Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    @NonNull
    protected AppCompatButton d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    @NonNull
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new z96(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    @NonNull
    protected o k(Context context, AttributeSet attributeSet) {
        return new da6(context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    @NonNull
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
