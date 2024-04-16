package defpackage;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: JsonIncludeProperties.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: db5  reason: default package */
/* loaded from: classes2.dex */
public @interface db5 {

    /* compiled from: JsonIncludeProperties.java */
    /* renamed from: db5$a */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        protected static final a b = new a(null);
        protected final Set<String> a;

        protected a(Set<String> set) {
            this.a = set;
        }

        private static Set<String> a(String[] strArr) {
            if (strArr != null && strArr.length != 0) {
                HashSet hashSet = new HashSet(strArr.length);
                for (String str : strArr) {
                    hashSet.add(str);
                }
                return hashSet;
            }
            return Collections.emptySet();
        }

        private static boolean b(Set<String> set, Set<String> set2) {
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
                return false;
            }
            return set.equals(set2);
        }

        public static a c() {
            return b;
        }

        public static a d(db5 db5Var) {
            if (db5Var == null) {
                return b;
            }
            return new a(a(db5Var.value()));
        }

        public Set<String> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass() && b(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Set<String> set = this.a;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.a);
        }
    }

    String[] value() default {};
}
