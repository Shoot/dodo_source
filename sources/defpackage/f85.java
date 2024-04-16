package defpackage;

import java.lang.reflect.Method;
/* compiled from: JDK14Util.java */
/* renamed from: f85  reason: default package */
/* loaded from: classes2.dex */
public class f85 {

    /* compiled from: JDK14Util.java */
    /* renamed from: f85$a */
    /* loaded from: classes2.dex */
    static class a {
        private static final a d;
        private static final RuntimeException e;
        private final Method a;
        private final Method b;
        private final Method c;

        static {
            a aVar = null;
            try {
                e = null;
                aVar = new a();
            } catch (RuntimeException e2) {
                e = e2;
            }
            d = aVar;
            e = e;
        }

        private a() throws RuntimeException {
            try {
                this.a = Class.class.getMethod("getRecordComponents", new Class[0]);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.b = cls.getMethod("getName", new Class[0]);
                this.c = cls.getMethod("getType", new Class[0]);
            } catch (Exception e2) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e2.getClass().getName(), e2.getMessage()), e2);
            }
        }

        public static a b() {
            RuntimeException runtimeException = e;
            if (runtimeException == null) {
                return d;
            }
            throw runtimeException;
        }

        public String[] a(Class<?> cls) throws IllegalArgumentException {
            Object[] c = c(cls);
            String[] strArr = new String[c.length];
            for (int i = 0; i < c.length; i++) {
                try {
                    strArr[i] = (String) this.b.invoke(c[i], new Object[0]);
                } catch (Exception e2) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(c.length), q81.R(cls)), e2);
                }
            }
            return strArr;
        }

        protected Object[] c(Class<?> cls) throws IllegalArgumentException {
            try {
                return (Object[]) this.a.invoke(cls, new Object[0]);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + q81.R(cls));
            }
        }
    }

    public static String[] a(Class<?> cls) {
        return a.b().a(cls);
    }
}
