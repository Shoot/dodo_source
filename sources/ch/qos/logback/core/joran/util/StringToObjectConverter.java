package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAware;
import defpackage.tmb;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
/* loaded from: classes.dex */
public class StringToObjectConverter {
    private static final Class<?>[] STRING_CLASS_PARAMETER = {String.class};

    public static boolean canBeBuiltFromSimpleString(Class<?> cls) {
        Package r0 = cls.getPackage();
        if (cls.isPrimitive()) {
            return true;
        }
        if ((r0 != null && "java.lang".equals(r0.getName())) || followsTheValueOfConvention(cls) || cls.isEnum() || isOfTypeCharset(cls)) {
            return true;
        }
        return false;
    }

    public static Object convertArg(ContextAware contextAware, String str, Class<?> cls) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (String.class.isAssignableFrom(cls)) {
            return trim;
        }
        if (Integer.TYPE.isAssignableFrom(cls)) {
            return Integer.valueOf(trim);
        }
        if (Long.TYPE.isAssignableFrom(cls)) {
            return Long.valueOf(trim);
        }
        if (Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(trim);
        }
        if (Double.TYPE.isAssignableFrom(cls)) {
            return Double.valueOf(trim);
        }
        if (Boolean.TYPE.isAssignableFrom(cls)) {
            if (tmb.h.TRUE_JSON_NAME.equalsIgnoreCase(trim)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return Boolean.FALSE;
            }
        } else if (cls.isEnum()) {
            return convertToEnum(contextAware, trim, cls);
        } else {
            if (followsTheValueOfConvention(cls)) {
                return convertByValueOfMethod(contextAware, cls, trim);
            }
            if (isOfTypeCharset(cls)) {
                return convertToCharset(contextAware, str);
            }
        }
        return null;
    }

    private static Object convertByValueOfMethod(ContextAware contextAware, Class<?> cls, String str) {
        try {
            return cls.getMethod(CoreConstants.VALUE_OF, STRING_CLASS_PARAMETER).invoke(null, str);
        } catch (Exception unused) {
            contextAware.addError("Failed to invoke valueOf{} method in class [" + cls.getName() + "] with value [" + str + "]");
            return null;
        }
    }

    private static Charset convertToCharset(ContextAware contextAware, String str) {
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException e) {
            contextAware.addError("Failed to get charset [" + str + "]", e);
            return null;
        }
    }

    private static Object convertToEnum(ContextAware contextAware, String str, Class<? extends Enum> cls) {
        return Enum.valueOf(cls, str);
    }

    private static boolean followsTheValueOfConvention(Class<?> cls) {
        Method valueOfMethod = getValueOfMethod(cls);
        if (valueOfMethod == null) {
            return false;
        }
        return Modifier.isStatic(valueOfMethod.getModifiers());
    }

    public static Method getValueOfMethod(Class<?> cls) {
        try {
            return cls.getMethod(CoreConstants.VALUE_OF, STRING_CLASS_PARAMETER);
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    private static boolean isOfTypeCharset(Class<?> cls) {
        return Charset.class.isAssignableFrom(cls);
    }

    boolean isBuildableFromSimpleString() {
        return false;
    }
}
