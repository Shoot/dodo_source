package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.util.Log;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
public final class ReflectionUtil {
    private ReflectionUtil() {
    }

    public static Object getFieldValue(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Class<?> tryGetClassForName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Field tryGetDeclaredField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Log.e(ReflectionUtil.class.getCanonicalName(), String.format("Could not retrieve %s field from %s", str, cls), e);
            return null;
        }
    }
}
