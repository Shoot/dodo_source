package im.threads.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public final class ColorsHelper {
    public static ColorStateList getColorStateList(Context context, int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}, new int[]{-16842910}}, new int[]{iu1.c(context, i3), iu1.c(context, i2), iu1.c(context, i)});
    }

    public static void setBackgroundColor(Context context, View view, int i) {
        if (i != 0 && view != null && context != null) {
            view.setBackgroundColor(iu1.c(context, i));
        }
    }

    public static void setDrawableColor(Context context, Drawable drawable, int i) {
        if (drawable != null && context != null) {
            if (i == 0) {
                f83.c(drawable);
            } else {
                f83.n(drawable, iu1.c(context, i));
            }
        }
    }

    public static void setHintTextColor(Context context, TextView textView, int i) {
        if (i != 0 && textView != null && context != null) {
            textView.setHintTextColor(iu1.c(context, i));
        }
    }

    public static void setStatusBarColor(WeakReference<Activity> weakReference, int i, int i2) {
        if (i != 0 && weakReference.get() != null) {
            Window window = weakReference.get().getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(iu1.c(weakReference.get().getApplicationContext(), i));
            if (weakReference.get().getApplicationContext().getResources().getBoolean(i2) && Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(8192);
            }
        }
    }

    public static void setTextColor(@NonNull TextView textView, int i) {
        setTextColor(textView.getContext(), textView, i);
    }

    public static void setTint(Context context, ImageView imageView, int i) {
        if (imageView != null && context != null) {
            if (i == 0) {
                imageView.clearColorFilter();
            } else {
                imageView.setColorFilter(iu1.c(context, i));
            }
        }
    }

    public static void setTintColorStateList(ImageView imageView, ColorStateList colorStateList) {
        cw4.c(imageView, colorStateList);
    }

    public static void setTextColor(Context context, TextView textView, int i) {
        if (i == 0 || textView == null || context == null) {
            return;
        }
        textView.setTextColor(iu1.c(context, i));
    }
}
