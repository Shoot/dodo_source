package defpackage;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JacksonInject.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: n85  reason: default package */
/* loaded from: classes2.dex */
public @interface n85 {

    /* compiled from: JacksonInject.java */
    /* renamed from: n85$a */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        protected static final a c = new a(null, null);
        protected final Object a;
        protected final Boolean b;

        protected a(Object obj, Boolean bool) {
            this.a = obj;
            this.b = bool;
        }

        private static boolean a(Object obj, Boolean bool) {
            if (obj == null && bool == null) {
                return true;
            }
            return false;
        }

        public static a b(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            if (a(obj, bool)) {
                return c;
            }
            return new a(obj, bool);
        }

        public static a c(Object obj) {
            return b(obj, null);
        }

        public static a d(n85 n85Var) {
            if (n85Var == null) {
                return c;
            }
            return b(n85Var.value(), n85Var.useInput().a());
        }

        public Object e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                a aVar = (a) obj;
                if (kb7.i(this.b, aVar.b)) {
                    Object obj2 = this.a;
                    if (obj2 == null) {
                        if (aVar.a == null) {
                            return true;
                        }
                        return false;
                    }
                    return obj2.equals(aVar.a);
                }
            }
            return false;
        }

        public boolean f() {
            if (this.a != null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.a;
            int i = 1;
            if (obj != null) {
                i = 1 + obj.hashCode();
            }
            Boolean bool = this.b;
            if (bool != null) {
                return i + bool.hashCode();
            }
            return i;
        }

        public a i(Object obj) {
            if (obj == null) {
                if (this.a == null) {
                    return this;
                }
            } else if (obj.equals(this.a)) {
                return this;
            }
            return new a(obj, this.b);
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.a, this.b);
        }
    }

    kb7 useInput() default kb7.DEFAULT;

    String value() default "";
}
