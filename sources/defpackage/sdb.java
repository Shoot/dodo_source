package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.e0;
/* compiled from: ThemeEnforcement.java */
/* renamed from: sdb  reason: default package */
/* loaded from: classes2.dex */
public final class sdb {
    private static final int[] a = {qv8.o};
    private static final int[] b = {qv8.colorPrimaryVariant};

    public static void a(@NonNull Context context) {
        e(context, a, "Theme.AppCompat");
    }

    private static void b(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.R9, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(b29.T9, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(qv8.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@NonNull Context context) {
        e(context, b, "Theme.MaterialComponents");
    }

    private static void d(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b29.R9, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(b29.U9, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = f(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(b29.S9, -1) != -1) {
                z2 = true;
            }
            z = z2;
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    private static void e(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i2, @NonNull int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean g(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray h(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i2, int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static e0 i(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i2, int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return e0.v(context, attributeSet, iArr, i, i2);
    }
}
