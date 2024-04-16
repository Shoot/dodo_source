package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.e0;
/* compiled from: MaterialResources.java */
/* renamed from: ea6  reason: default package */
/* loaded from: classes2.dex */
public class ea6 {
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a = on.a(context, resourceId)) != null) {
            return a;
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList b(@NonNull Context context, @NonNull e0 e0Var, int i) {
        int n;
        ColorStateList a;
        if (e0Var.s(i) && (n = e0Var.n(i, 0)) != 0 && (a = on.a(context, n)) != null) {
            return a;
        }
        return e0Var.c(i);
    }

    private static int c(TypedValue typedValue) {
        int complexUnit;
        if (Build.VERSION.SDK_INT >= 22) {
            complexUnit = typedValue.getComplexUnit();
            return complexUnit;
        }
        return typedValue.data & 15;
    }

    public static int d(@NonNull Context context, @NonNull TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static Drawable e(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (b = on.b(context, resourceId)) != null) {
            return b;
        }
        return typedArray.getDrawable(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(@NonNull TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            return i;
        }
        return i2;
    }

    public static fab g(@NonNull Context context, @NonNull TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return new fab(context, resourceId);
        }
        return null;
    }

    public static int h(@NonNull Context context, int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b29.n8);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(b29.o8, typedValue);
        obtainStyledAttributes.recycle();
        if (!value) {
            return i2;
        }
        if (c(typedValue) == 2) {
            return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean i(@NonNull Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean j(@NonNull Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
