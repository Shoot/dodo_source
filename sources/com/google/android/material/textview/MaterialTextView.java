package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void c(@NonNull Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, b29.L4);
        int h = h(getContext(), obtainStyledAttributes, b29.N4, b29.O4);
        obtainStyledAttributes.recycle();
        if (h >= 0) {
            setLineHeight(h);
        }
    }

    private static boolean e(Context context) {
        return x96.b(context, qv8.textAppearanceLineHeightEnabled, true);
    }

    private static int g(@NonNull Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, b29.P4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(b29.Q4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int h(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = ea6.d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static boolean i(@NonNull Context context, @NonNull Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, b29.P4, i, i2);
        int h = h(context, obtainStyledAttributes, b29.R4, b29.S4);
        obtainStyledAttributes.recycle();
        if (h != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (e(context)) {
            c(context.getTheme(), i);
        }
    }

    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(ia6.c(context, attributeSet, i, i2), attributeSet, i);
        int g;
        Context context2 = getContext();
        if (e(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (i(context2, theme, attributeSet, i, i2) || (g = g(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            c(theme, g);
        }
    }
}
