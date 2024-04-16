package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public class u {
    private static final int[] a = {16842912};
    private static final int[] b = new int[0];
    public static final Rect c = new Rect();

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    static class a {
        private static final boolean a;
        private static final Method b;
        private static final Field c;
        private static final Field d;
        private static final Field e;
        private static final Field f;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4c java.lang.NoSuchMethodException -> L50
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4c java.lang.NoSuchMethodException -> L50
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4c java.lang.NoSuchMethodException -> L50
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3c java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L44
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.ClassNotFoundException -> L36 java.lang.NoSuchMethodException -> L39
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2d
                r8 = 1
                goto L56
            L2d:
                goto L54
            L2f:
                r7 = r1
                goto L54
            L32:
                r6 = r1
            L34:
                r7 = r6
                goto L54
            L36:
                r6 = r1
                goto L34
            L39:
                r6 = r1
                goto L34
            L3c:
                r5 = r1
            L3e:
                r6 = r5
                goto L34
            L40:
                r5 = r1
            L42:
                r6 = r5
                goto L34
            L44:
                r5 = r1
            L46:
                r6 = r5
                goto L34
            L48:
                r4 = r1
                r5 = r4
                goto L3e
            L4c:
                r4 = r1
                r5 = r4
                goto L42
            L50:
                r4 = r1
                r5 = r4
                goto L46
            L54:
                r3 = r1
                r8 = 0
            L56:
                if (r8 == 0) goto L65
                androidx.appcompat.widget.u.a.b = r4
                androidx.appcompat.widget.u.a.c = r5
                androidx.appcompat.widget.u.a.d = r6
                androidx.appcompat.widget.u.a.e = r7
                androidx.appcompat.widget.u.a.f = r3
                androidx.appcompat.widget.u.a.a = r0
                goto L71
            L65:
                androidx.appcompat.widget.u.a.b = r1
                androidx.appcompat.widget.u.a.c = r1
                androidx.appcompat.widget.u.a.d = r1
                androidx.appcompat.widget.u.a.e = r1
                androidx.appcompat.widget.u.a.f = r1
                androidx.appcompat.widget.u.a.a = r2
            L71:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u.a.<clinit>():void");
        }

        @NonNull
        static Rect a(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && a) {
                try {
                    Object invoke = b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(c.getInt(invoke), d.getInt(invoke), e.getInt(invoke), f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return u.c;
        }
    }

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(@NonNull Drawable drawable) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            c(drawable);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(b);
        } else {
            drawable.setState(a);
        }
        drawable.setState(state);
    }

    @NonNull
    public static Rect d(@NonNull Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets a2 = b.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        return a.a(f83.q(drawable));
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
