package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: MaterialAttributes.java */
/* renamed from: x96  reason: default package */
/* loaded from: classes2.dex */
public class x96 {
    public static TypedValue a(@NonNull Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@NonNull Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        if (a != null && a.type == 18) {
            if (a.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static int c(@NonNull Context context, int i, int i2) {
        TypedValue a = a(context, i);
        if (a != null && a.type == 16) {
            return a.data;
        }
        return i2;
    }

    public static int d(@NonNull Context context, int i, @NonNull String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int e(@NonNull View view, int i) {
        return d(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
