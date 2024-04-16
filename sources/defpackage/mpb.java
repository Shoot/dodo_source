package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.widget.Toast;
/* compiled from: UIUtils.java */
/* renamed from: mpb  reason: default package */
/* loaded from: classes.dex */
public class mpb {
    public static int a(float f, Context context) {
        return (int) (f * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static int b(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float c(float f, Context context) {
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static void d(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    public static int e(float f, Context context) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
