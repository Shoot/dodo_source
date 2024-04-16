package com.facebook.flipper.plugins.uidebugger.stetho;

import java.lang.reflect.Field;
import kotlin.Metadata;
/* compiled from: ReflectionUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0086\bJ\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086\bJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\nH\u0086\b¨\u0006\u000e"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/ReflectionUtil;", "", "()V", "getFieldValue", "field", "Ljava/lang/reflect/Field;", "target", "tryGetClassForName", "Ljava/lang/Class;", "className", "", "tryGetDeclaredField", "theClass", "fieldName", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReflectionUtil {
    public static final ReflectionUtil INSTANCE = new ReflectionUtil();

    private ReflectionUtil() {
    }

    public final Object getFieldValue(Field field, Object obj) {
        z65.h(field, "field");
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public final Class<?> tryGetClassForName(String str) {
        z65.h(str, "className");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final Field tryGetDeclaredField(Class<?> cls, String str) {
        z65.h(cls, "theClass");
        z65.h(str, "fieldName");
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
