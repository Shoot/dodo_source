package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonInclude.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: cb5  reason: default package */
/* loaded from: classes2.dex */
public @interface cb5 {

    /* compiled from: JsonInclude.java */
    /* renamed from: cb5$a */
    /* loaded from: classes2.dex */
    public enum a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    /* compiled from: JsonInclude.java */
    /* renamed from: cb5$b */
    /* loaded from: classes2.dex */
    public static class b implements Serializable {
        protected static final b e;
        protected final a a;
        protected final a b;
        protected final Class<?> c;
        protected final Class<?> d;

        static {
            a aVar = a.USE_DEFAULTS;
            e = new b(aVar, aVar, null, null);
        }

        protected b(a aVar, a aVar2, Class<?> cls, Class<?> cls2) {
            this.a = aVar == null ? a.USE_DEFAULTS : aVar;
            this.b = aVar2 == null ? a.USE_DEFAULTS : aVar2;
            this.c = cls == Void.class ? null : cls;
            this.d = cls2 == Void.class ? null : cls2;
        }

        public static b a(a aVar, a aVar2) {
            a aVar3 = a.USE_DEFAULTS;
            if ((aVar != aVar3 && aVar != null) || (aVar2 != aVar3 && aVar2 != null)) {
                return new b(aVar, aVar2, null, null);
            }
            return e;
        }

        public static b b(a aVar, a aVar2, Class<?> cls, Class<?> cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            a aVar3 = a.USE_DEFAULTS;
            if ((aVar == aVar3 || aVar == null) && ((aVar2 == aVar3 || aVar2 == null) && cls == null && cls2 == null)) {
                return e;
            }
            return new b(aVar, aVar2, cls, cls2);
        }

        public static b c() {
            return e;
        }

        public static b d(cb5 cb5Var) {
            if (cb5Var == null) {
                return e;
            }
            a value = cb5Var.value();
            a content = cb5Var.content();
            a aVar = a.USE_DEFAULTS;
            if (value == aVar && content == aVar) {
                return e;
            }
            Class<?> valueFilter = cb5Var.valueFilter();
            Class<?> cls = null;
            if (valueFilter == Void.class) {
                valueFilter = null;
            }
            Class<?> contentFilter = cb5Var.contentFilter();
            if (contentFilter != Void.class) {
                cls = contentFilter;
            }
            return new b(value, content, valueFilter, cls);
        }

        public static b k(b bVar, b bVar2) {
            if (bVar != null) {
                return bVar.o(bVar2);
            }
            return bVar2;
        }

        public static b l(b... bVarArr) {
            b bVar = null;
            for (b bVar2 : bVarArr) {
                if (bVar2 != null) {
                    if (bVar != null) {
                        bVar2 = bVar.o(bVar2);
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        public Class<?> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.a == this.a && bVar.b == this.b && bVar.c == this.c && bVar.d == this.d) {
                return true;
            }
            return false;
        }

        public a f() {
            return this.b;
        }

        public int hashCode() {
            return (this.a.hashCode() << 2) + this.b.hashCode();
        }

        public Class<?> i() {
            return this.c;
        }

        public a j() {
            return this.a;
        }

        public b m(Class<?> cls) {
            a aVar;
            if (cls != null && cls != Void.class) {
                aVar = a.CUSTOM;
            } else {
                aVar = a.USE_DEFAULTS;
                cls = null;
            }
            return b(this.a, aVar, this.c, cls);
        }

        public b n(a aVar) {
            if (aVar == this.b) {
                return this;
            }
            return new b(this.a, aVar, this.c, this.d);
        }

        public b o(b bVar) {
            boolean z;
            boolean z2;
            if (bVar != null && bVar != e) {
                a aVar = bVar.a;
                a aVar2 = bVar.b;
                Class<?> cls = bVar.c;
                Class<?> cls2 = bVar.d;
                a aVar3 = this.a;
                boolean z3 = false;
                if (aVar != aVar3 && aVar != a.USE_DEFAULTS) {
                    z = true;
                } else {
                    z = false;
                }
                a aVar4 = this.b;
                if (aVar2 != aVar4 && aVar2 != a.USE_DEFAULTS) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Class<?> cls3 = this.c;
                z3 = (cls == cls3 && cls2 == cls3) ? true : true;
                if (z) {
                    if (z2) {
                        return new b(aVar, aVar2, cls, cls2);
                    }
                    return new b(aVar, aVar4, cls, cls2);
                } else if (z2) {
                    return new b(aVar3, aVar2, cls, cls2);
                } else {
                    if (z3) {
                        return new b(aVar3, aVar4, cls, cls2);
                    }
                }
            }
            return this;
        }

        public b q(a aVar) {
            if (aVar == this.a) {
                return this;
            }
            return new b(aVar, this.b, this.c, this.d);
        }

        protected Object readResolve() {
            a aVar = this.a;
            a aVar2 = a.USE_DEFAULTS;
            if (aVar == aVar2 && this.b == aVar2 && this.c == null && this.d == null) {
                return e;
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(80);
            sb.append("JsonInclude.Value(value=");
            sb.append(this.a);
            sb.append(",content=");
            sb.append(this.b);
            if (this.c != null) {
                sb.append(",valueFilter=");
                sb.append(this.c.getName());
                sb.append(".class");
            }
            if (this.d != null) {
                sb.append(",contentFilter=");
                sb.append(this.d.getName());
                sb.append(".class");
            }
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }
    }

    a content() default a.ALWAYS;

    Class<?> contentFilter() default Void.class;

    a value() default a.ALWAYS;

    Class<?> valueFilter() default Void.class;
}
