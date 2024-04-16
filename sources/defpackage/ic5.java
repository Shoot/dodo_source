package defpackage;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: JsonSetter.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ic5  reason: default package */
/* loaded from: classes2.dex */
public @interface ic5 {

    /* compiled from: JsonSetter.java */
    /* renamed from: ic5$a */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        protected static final a c;
        private final w37 a;
        private final w37 b;

        static {
            w37 w37Var = w37.DEFAULT;
            c = new a(w37Var, w37Var);
        }

        protected a(w37 w37Var, w37 w37Var2) {
            this.a = w37Var;
            this.b = w37Var2;
        }

        private static boolean a(w37 w37Var, w37 w37Var2) {
            w37 w37Var3 = w37.DEFAULT;
            if (w37Var == w37Var3 && w37Var2 == w37Var3) {
                return true;
            }
            return false;
        }

        public static a b(w37 w37Var, w37 w37Var2) {
            if (w37Var == null) {
                w37Var = w37.DEFAULT;
            }
            if (w37Var2 == null) {
                w37Var2 = w37.DEFAULT;
            }
            if (a(w37Var, w37Var2)) {
                return c;
            }
            return new a(w37Var, w37Var2);
        }

        public static a c() {
            return c;
        }

        public static a d(ic5 ic5Var) {
            if (ic5Var == null) {
                return c;
            }
            return b(ic5Var.nulls(), ic5Var.contentNulls());
        }

        public w37 e() {
            w37 w37Var = this.b;
            if (w37Var == w37.DEFAULT) {
                return null;
            }
            return w37Var;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a == this.a && aVar.b == this.b) {
                return true;
            }
            return false;
        }

        public w37 f() {
            w37 w37Var = this.a;
            if (w37Var == w37.DEFAULT) {
                return null;
            }
            return w37Var;
        }

        public int hashCode() {
            return this.a.ordinal() + (this.b.ordinal() << 2);
        }

        protected Object readResolve() {
            if (a(this.a, this.b)) {
                return c;
            }
            return this;
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this.a, this.b);
        }
    }

    w37 contentNulls() default w37.DEFAULT;

    w37 nulls() default w37.DEFAULT;

    String value() default "";
}
