package defpackage;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: JsonIgnoreProperties.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ab5  reason: default package */
/* loaded from: classes2.dex */
public @interface ab5 {

    /* compiled from: JsonIgnoreProperties.java */
    /* renamed from: ab5$a */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        protected static final a f = new a(Collections.emptySet(), false, false, false, true);
        protected final Set<String> a;
        protected final boolean b;
        protected final boolean c;
        protected final boolean d;
        protected final boolean e;

        protected a(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (set == null) {
                this.a = Collections.emptySet();
            } else {
                this.a = set;
            }
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
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

        private static boolean b(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            a aVar = f;
            if (z != aVar.b || z2 != aVar.c || z3 != aVar.d || z4 != aVar.e) {
                return false;
            }
            if (set != null && set.size() != 0) {
                return false;
            }
            return true;
        }

        private static boolean c(a aVar, a aVar2) {
            if (aVar.b == aVar2.b && aVar.e == aVar2.e && aVar.c == aVar2.c && aVar.d == aVar2.d && aVar.a.equals(aVar2.a)) {
                return true;
            }
            return false;
        }

        private static Set<String> d(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static a e(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (b(set, z, z2, z3, z4)) {
                return f;
            }
            return new a(set, z, z2, z3, z4);
        }

        public static a f() {
            return f;
        }

        public static a j(ab5 ab5Var) {
            if (ab5Var == null) {
                return f;
            }
            return e(a(ab5Var.value()), ab5Var.ignoreUnknown(), ab5Var.allowGetters(), ab5Var.allowSetters(), false);
        }

        public static a k(a aVar, a aVar2) {
            if (aVar != null) {
                return aVar.l(aVar2);
            }
            return aVar2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass() && c(this, (a) obj)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int size = this.a.size();
            if (this.b) {
                i = 1;
            } else {
                i = -3;
            }
            int i5 = size + i;
            if (this.c) {
                i2 = 3;
            } else {
                i2 = -7;
            }
            int i6 = i5 + i2;
            if (this.d) {
                i3 = 7;
            } else {
                i3 = -11;
            }
            int i7 = i6 + i3;
            if (this.e) {
                i4 = 11;
            } else {
                i4 = -13;
            }
            return i7 + i4;
        }

        public Set<String> i() {
            if (this.c) {
                return Collections.emptySet();
            }
            return this.a;
        }

        public a l(a aVar) {
            boolean z;
            boolean z2;
            if (aVar != null && aVar != f) {
                if (!aVar.e) {
                    return aVar;
                }
                if (c(this, aVar)) {
                    return this;
                }
                Set<String> d = d(this.a, aVar.a);
                boolean z3 = false;
                if (!this.b && !aVar.b) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.c && !aVar.c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                return e(d, z, z2, (this.d || aVar.d) ? true : true, true);
            }
            return this;
        }

        protected Object readResolve() {
            if (b(this.a, this.b, this.c, this.d, this.e)) {
                return f;
            }
            return this;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
