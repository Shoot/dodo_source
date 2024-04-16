package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.er8;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
/* compiled from: StdKeySerializers.java */
/* renamed from: axa  reason: default package */
/* loaded from: classes2.dex */
public abstract class axa {
    protected static final gc5<Object> a = new zwa();
    protected static final gc5<Object> b = new d();

    /* compiled from: StdKeySerializers.java */
    /* renamed from: axa$a */
    /* loaded from: classes2.dex */
    public static class a extends cxa<Object> {
        protected final int c;

        public a(int i, Class<?> cls) {
            super(cls, false);
            this.c = i;
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            String name;
            switch (this.c) {
                case 1:
                    bdaVar.y((Date) obj, ua5Var);
                    return;
                case 2:
                    bdaVar.x(((Calendar) obj).getTimeInMillis(), ua5Var);
                    return;
                case 3:
                    ua5Var.j0(((Class) obj).getName());
                    return;
                case 4:
                    if (bdaVar.M0(qca.WRITE_ENUMS_USING_TO_STRING)) {
                        name = obj.toString();
                    } else {
                        Enum r3 = (Enum) obj;
                        if (bdaVar.M0(qca.WRITE_ENUM_KEYS_USING_INDEX)) {
                            name = String.valueOf(r3.ordinal());
                        } else {
                            name = r3.name();
                        }
                    }
                    ua5Var.j0(name);
                    return;
                case 5:
                case 6:
                    ua5Var.e0(((Number) obj).longValue());
                    return;
                case 7:
                    ua5Var.j0(bdaVar.f().j().a((byte[]) obj));
                    return;
                default:
                    ua5Var.j0(obj.toString());
                    return;
            }
        }
    }

    /* compiled from: StdKeySerializers.java */
    /* renamed from: axa$b */
    /* loaded from: classes2.dex */
    public static class b extends cxa<Object> {
        protected transient er8 c;

        public b() {
            super(String.class, false);
            this.c = er8.c();
        }

        protected gc5<Object> G(er8 er8Var, Class<?> cls, bda bdaVar) throws JsonMappingException {
            if (cls == Object.class) {
                a aVar = new a(8, cls);
                this.c = er8Var.i(cls, aVar);
                return aVar;
            }
            er8.d d = er8Var.d(cls, bdaVar, null);
            er8 er8Var2 = d.b;
            if (er8Var != er8Var2) {
                this.c = er8Var2;
            }
            return d.a;
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            Class<?> cls = obj.getClass();
            er8 er8Var = this.c;
            gc5<Object> j = er8Var.j(cls);
            if (j == null) {
                j = G(er8Var, cls, bdaVar);
            }
            j.f(obj, ua5Var, bdaVar);
        }

        Object readResolve() {
            this.c = er8.c();
            return this;
        }
    }

    /* compiled from: StdKeySerializers.java */
    /* renamed from: axa$c */
    /* loaded from: classes2.dex */
    public static class c extends cxa<Object> {
        protected final qj3 c;

        protected c(Class<?> cls, qj3 qj3Var) {
            super(cls, false);
            this.c = qj3Var;
        }

        public static c G(Class<?> cls, qj3 qj3Var) {
            return new c(cls, qj3Var);
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            if (bdaVar.M0(qca.WRITE_ENUMS_USING_TO_STRING)) {
                ua5Var.j0(obj.toString());
                return;
            }
            Enum<?> r2 = (Enum) obj;
            if (bdaVar.M0(qca.WRITE_ENUM_KEYS_USING_INDEX)) {
                ua5Var.j0(String.valueOf(r2.ordinal()));
            } else {
                ua5Var.f0(this.c.d(r2));
            }
        }
    }

    /* compiled from: StdKeySerializers.java */
    /* renamed from: axa$d */
    /* loaded from: classes2.dex */
    public static class d extends cxa<Object> {
        public d() {
            super(String.class, false);
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.j0((String) obj);
        }
    }

    public static gc5<Object> a(pca pcaVar, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new b();
            }
            if (q81.H(cls)) {
                return c.G(cls, qj3.b(pcaVar, cls));
            }
        }
        return new a(8, cls);
    }

    public static gc5<Object> b(pca pcaVar, Class<?> cls, boolean z) {
        if (cls != null && cls != Object.class) {
            if (cls == String.class) {
                return b;
            }
            if (cls.isPrimitive()) {
                cls = q81.a0(cls);
            }
            if (cls == Integer.class) {
                return new a(5, cls);
            }
            if (cls == Long.class) {
                return new a(6, cls);
            }
            if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls)) {
                if (cls == Class.class) {
                    return new a(3, cls);
                }
                if (Date.class.isAssignableFrom(cls)) {
                    return new a(1, cls);
                }
                if (Calendar.class.isAssignableFrom(cls)) {
                    return new a(2, cls);
                }
                if (cls == UUID.class) {
                    return new a(8, cls);
                }
                if (cls == byte[].class) {
                    return new a(7, cls);
                }
                if (z) {
                    return new a(8, cls);
                }
                return null;
            }
            return new a(8, cls);
        }
        return new b();
    }
}
