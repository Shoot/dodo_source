package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JacksonException;
import defpackage.ua5;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: ClassUtil.java */
/* renamed from: q81  reason: default package */
/* loaded from: classes2.dex */
public final class q81 {
    private static final Class<?> a = Object.class;
    private static final Annotation[] b = new Annotation[0];
    private static final a[] c = new a[0];
    private static final Iterator<?> d = Collections.emptyIterator();

    /* compiled from: ClassUtil.java */
    /* renamed from: q81$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final Constructor<?> a;
        private transient Annotation[] b;
        private transient Annotation[][] c;
        private int d = -1;

        public a(Constructor<?> constructor) {
            this.a = constructor;
        }

        public Constructor<?> a() {
            return this.a;
        }

        public Annotation[] b() {
            Annotation[] annotationArr = this.b;
            if (annotationArr == null) {
                Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
                this.b = declaredAnnotations;
                return declaredAnnotations;
            }
            return annotationArr;
        }

        public Class<?> c() {
            return this.a.getDeclaringClass();
        }

        public int d() {
            int i = this.d;
            if (i < 0) {
                int length = this.a.getParameterTypes().length;
                this.d = length;
                return length;
            }
            return i;
        }

        public Annotation[][] e() {
            Annotation[][] annotationArr = this.c;
            if (annotationArr == null) {
                Annotation[][] parameterAnnotations = this.a.getParameterAnnotations();
                this.c = parameterAnnotations;
                return parameterAnnotations;
            }
            return annotationArr;
        }
    }

    /* compiled from: ClassUtil.java */
    /* renamed from: q81$b */
    /* loaded from: classes2.dex */
    private static class b {
        static final b e = new b();
        private final Field a;
        private final Field b;
        private final String c;
        private final String d;

        private b() {
            String obj;
            Field field;
            String obj2;
            Field field2 = null;
            try {
                field = d(EnumSet.class, "elementType", Class.class);
                obj = null;
            } catch (Exception e2) {
                obj = e2.toString();
                field = null;
            }
            this.a = field;
            this.c = obj;
            try {
                field2 = d(EnumMap.class, "keyType", Class.class);
                obj2 = null;
            } catch (Exception e3) {
                obj2 = e3.toString();
            }
            this.b = field2;
            this.d = obj2;
        }

        private Object c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e2) {
                throw new IllegalArgumentException(e2);
            }
        }

        private static Field d(Class<?> cls, String str, Class<?> cls2) throws Exception {
            Field[] declaredFields;
            String typeName;
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            typeName = cls.getTypeName();
            throw new IllegalStateException(String.format("No field named '%s' in class '%s'", str, typeName));
        }

        public Class<? extends Enum<?>> a(EnumMap<?, ?> enumMap) {
            Field field = this.b;
            if (field != null) {
                return (Class) c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.d);
        }

        public Class<? extends Enum<?>> b(EnumSet<?> enumSet) {
            Field field = this.a;
            if (field != null) {
                return (Class) c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.c);
        }
    }

    public static Type A(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> B(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (F(cls)) {
                    return null;
                }
                return y(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable C(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String D(y85 y85Var) {
        if (y85Var == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(y85Var.e());
        sb.append('`');
        return sb.toString();
    }

    public static boolean E(Object obj, Class<?> cls) {
        if (obj != null && obj.getClass() == cls) {
            return true;
        }
        return false;
    }

    public static boolean F(Class<?> cls) {
        if (!M(cls) && cls.getEnclosingMethod() != null) {
            return true;
        }
        return false;
    }

    public static boolean G(Class<?> cls) {
        if (cls != Void.class && cls != Void.TYPE && cls != zy6.class) {
            return false;
        }
        return true;
    }

    public static boolean H(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean I(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("java.") && !name.startsWith("javax.")) {
            return false;
        }
        return true;
    }

    public static boolean J(Class<?> cls) {
        if (cls.getAnnotation(o85.class) != null) {
            return true;
        }
        return false;
    }

    public static boolean K(Object obj) {
        if (obj != null && !J(obj.getClass())) {
            return false;
        }
        return true;
    }

    public static boolean L(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers()) && y(cls) != null) {
            return true;
        }
        return false;
    }

    public static boolean M(Class<?> cls) {
        if (cls != a && !cls.isPrimitive()) {
            return false;
        }
        return true;
    }

    public static boolean N(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("net.sf.cglib.proxy.") && !name.startsWith("org.hibernate.proxy.")) {
            return false;
        }
        return true;
    }

    public static boolean O(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && "java.lang.Record".equals(superclass.getName())) {
            return true;
        }
        return false;
    }

    public static String P(vq8 vq8Var) {
        if (vq8Var == null) {
            return "[null]";
        }
        return d(vq8Var.c());
    }

    public static String Q(String str) {
        if (str == null) {
            return "[null]";
        }
        return d(str);
    }

    public static String R(Class<?> cls) {
        String name;
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            name = cls.getSimpleName();
        } else {
            name = cls.getName();
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(name);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            name = sb.toString();
        }
        return e(name);
    }

    public static String S(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static Class<?> T(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void U(Throwable th, String str) {
        X(th);
        V(th);
        throw new IllegalArgumentException(str, th);
    }

    public static Throwable V(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    public static Throwable W(Throwable th) throws IOException {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    public static Throwable X(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    public static void Y(Throwable th, String str) {
        U(C(th), str);
    }

    public static void Z(Class<?> cls, Object obj, String str) {
        if (obj.getClass() == cls) {
            return;
        }
        throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
    }

    private static void a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (collection.contains(cls)) {
                    return;
                }
                collection.add(cls);
            }
            for (Class<?> cls3 : c(cls)) {
                a(cls3, cls2, collection, true);
            }
            a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    public static Class<?> a0(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    private static Method[] b(Class<?> cls, Throwable th) throws IllegalArgumentException {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th.getClass().getName(), th.getMessage()), th);
    }

    private static Class<?>[] c(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static String d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sb.append(str);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        return sb.toString();
    }

    public static String e(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static String f(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void g(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || I(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            Class<?> declaringClass2 = member.getDeclaringClass();
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass2.getName() + "; failed to set access: " + e.getMessage());
        } catch (RuntimeException e2) {
            if ("InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", member.getClass().getSimpleName(), member.getName(), R(member.getDeclaringClass()), e2.getClass().getName(), e2.getMessage()), e2);
            }
            throw e2;
        }
    }

    public static String h(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "[null]";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return R(cls);
    }

    public static void i(ua5 ua5Var, Closeable closeable, Exception exc) throws IOException {
        if (ua5Var != null) {
            ua5Var.l(ua5.b.AUTO_CLOSE_JSON_CONTENT);
            try {
                ua5Var.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        W(exc);
        X(exc);
        throw new RuntimeException(exc);
    }

    public static void j(ua5 ua5Var, Exception exc) throws IOException {
        ua5Var.l(ua5.b.AUTO_CLOSE_JSON_CONTENT);
        try {
            ua5Var.close();
        } catch (Exception e) {
            exc.addSuppressed(e);
        }
        W(exc);
        X(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T k(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor p = p(cls, z);
        if (p != null) {
            try {
                return (T) p.newInstance(new Object[0]);
            } catch (Exception e) {
                Y(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
                return null;
            }
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
    }

    public static Object l(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static <T> Iterator<T> m() {
        return (Iterator<T>) d;
    }

    public static String n(Throwable th) {
        if (th instanceof JacksonException) {
            return ((JacksonException) th).b();
        }
        if ((th instanceof InvocationTargetException) && th.getCause() != null) {
            return th.getCause().getMessage();
        }
        return th.getMessage();
    }

    public static Annotation[] o(Class<?> cls) {
        if (M(cls)) {
            return b;
        }
        return cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> p(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                g(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            Y(e, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> q(Class<?> cls) {
        if (cls.getSuperclass() != Enum.class) {
            return cls.getSuperclass();
        }
        return cls;
    }

    public static Class<? extends Enum<?>> r(Enum<?> r0) {
        return r0.getDeclaringClass();
    }

    public static Class<? extends Enum<?>> s(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return r((Enum) enumMap.keySet().iterator().next());
        }
        return b.e.a(enumMap);
    }

    public static Class<? extends Enum<?>> t(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return r((Enum) enumSet.iterator().next());
        }
        return b.e.b(enumSet);
    }

    public static List<Class<?>> u(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls != null && cls != cls2 && cls != Object.class) {
            ArrayList arrayList = new ArrayList(8);
            a(cls, cls2, arrayList, z);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static List<Class<?>> v(Class<?> cls, Class<?> cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static Method[] w(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return b(cls, e);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th) {
                    return b(cls, th);
                }
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                return b(cls, e);
            }
        } catch (Throwable th2) {
            return b(cls, th2);
        }
    }

    public static a[] x(Class<?> cls) {
        if (!cls.isInterface() && !M(cls)) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            a[] aVarArr = new a[length];
            for (int i = 0; i < length; i++) {
                aVarArr[i] = new a(declaredConstructors[i]);
            }
            return aVarArr;
        }
        return c;
    }

    public static Class<?> y(Class<?> cls) {
        if (M(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] z(Class<?> cls) {
        return cls.getGenericInterfaces();
    }
}
