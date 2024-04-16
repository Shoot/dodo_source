package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
/* compiled from: MaterialThemeOverlay.java */
/* renamed from: ia6  reason: default package */
/* loaded from: classes2.dex */
public class ia6 {
    private static final int[] a = {16842752, qv8.X};
    private static final int[] b = {qv8.materialThemeOverlay};

    private static int a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    private static int b(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context c(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int b2 = b(context, attributeSet, i, i2);
        if ((context instanceof yu1) && ((yu1) context).c() == b2) {
            z = true;
        } else {
            z = false;
        }
        if (b2 != 0 && !z) {
            yu1 yu1Var = new yu1(context, b2);
            int a2 = a(context, attributeSet);
            if (a2 != 0) {
                yu1Var.getTheme().applyStyle(a2, true);
            }
            return yu1Var;
        }
        return context;
    }
}
