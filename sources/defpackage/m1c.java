package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewUtilsBase.java */
/* renamed from: m1c  reason: default package */
/* loaded from: classes.dex */
class m1c {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    @SuppressLint({"PrivateApi"})
    private void b() {
        if (!b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            b = true;
        }
    }

    public void a(@NonNull View view) {
        throw null;
    }

    public float c(@NonNull View view) {
        throw null;
    }

    public void d(@NonNull View view) {
        throw null;
    }

    public void e(@NonNull View view, int i, int i2, int i3, int i4) {
        b();
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void f(@NonNull View view, float f) {
        throw null;
    }

    public void g(@NonNull View view, int i) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }

    public void i(@NonNull View view, @NonNull Matrix matrix) {
        throw null;
    }
}
