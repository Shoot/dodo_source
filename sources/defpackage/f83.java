package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: DrawableCompat.java */
/* renamed from: f83  reason: default package */
/* loaded from: classes.dex */
public final class f83 {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableCompat.java */
    /* renamed from: f83$a */
    /* loaded from: classes.dex */
    public static class a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* compiled from: DrawableCompat.java */
    /* renamed from: f83$b */
    /* loaded from: classes.dex */
    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        static void f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        static void g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat.java */
    /* renamed from: f83$c */
    /* loaded from: classes.dex */
    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    public static void a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(@NonNull Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            c(a.c((InsetDrawable) drawable));
        } else if (drawable instanceof h8c) {
            c(((h8c) drawable).a());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable b2 = a.b(drawableContainerState, i);
                if (b2 != null) {
                    c(b2);
                }
            }
        }
    }

    public static int d(@NonNull Drawable drawable) {
        return a.a(drawable);
    }

    public static ColorFilter e(@NonNull Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                c = null;
            }
        }
        return 0;
    }

    public static void g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@NonNull Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void i(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@NonNull Drawable drawable, boolean z) {
        a.e(drawable, z);
    }

    public static void k(@NonNull Drawable drawable, float f, float f2) {
        b.e(drawable, f, f2);
    }

    public static void l(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        b.f(drawable, i, i2, i3, i4);
    }

    public static boolean m(@NonNull Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i);
        }
        if (!b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                a = null;
            }
        }
        return false;
    }

    public static void n(@NonNull Drawable drawable, int i) {
        b.g(drawable, i);
    }

    public static void o(@NonNull Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(@NonNull Drawable drawable, @NonNull PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@NonNull Drawable drawable) {
        if (drawable instanceof h8c) {
            return (T) ((h8c) drawable).a();
        }
        return drawable;
    }

    @NonNull
    public static Drawable r(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof ghb)) {
            return new j8c(drawable);
        }
        return drawable;
    }
}
