package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
/* compiled from: ImageViewCompat.java */
/* renamed from: cw4  reason: default package */
/* loaded from: classes.dex */
public class cw4 {

    /* compiled from: ImageViewCompat.java */
    /* renamed from: cw4$a */
    /* loaded from: classes.dex */
    static class a {
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static ColorStateList a(@NonNull ImageView imageView) {
        return a.a(imageView);
    }

    public static PorterDuff.Mode b(@NonNull ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@NonNull ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        a.c(imageView, colorStateList);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && a.a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void d(@NonNull ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        a.d(imageView, mode);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && a.a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
