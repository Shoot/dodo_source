package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: UnsafeAllocator.java */
/* renamed from: hrb  reason: default package */
/* loaded from: classes2.dex */
public abstract class hrb {

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: hrb$a */
    /* loaded from: classes2.dex */
    class a extends hrb {
        final /* synthetic */ Method a;
        final /* synthetic */ Object b;

        a(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }

        @Override // defpackage.hrb
        public <T> T c(Class<T> cls) throws Exception {
            hrb.a(cls);
            return (T) this.a.invoke(this.b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: hrb$b */
    /* loaded from: classes2.dex */
    class b extends hrb {
        final /* synthetic */ Method a;
        final /* synthetic */ int b;

        b(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.hrb
        public <T> T c(Class<T> cls) throws Exception {
            hrb.a(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: hrb$c */
    /* loaded from: classes2.dex */
    class c extends hrb {
        final /* synthetic */ Method a;

        c(Method method) {
            this.a = method;
        }

        @Override // defpackage.hrb
        public <T> T c(Class<T> cls) throws Exception {
            hrb.a(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: hrb$d */
    /* loaded from: classes2.dex */
    class d extends hrb {
        d() {
        }

        @Override // defpackage.hrb
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static hrb b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
