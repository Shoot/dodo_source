package defpackage;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
/* compiled from: JsonAutoDetect.java */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: da5  reason: default package */
/* loaded from: classes2.dex */
public @interface da5 {

    /* compiled from: JsonAutoDetect.java */
    /* renamed from: da5$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[qq8.values().length];
            b = iArr;
            try {
                iArr[qq8.CREATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[qq8.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[qq8.GETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[qq8.IS_GETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[qq8.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[qq8.SETTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[qq8.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            a = iArr2;
            try {
                iArr2[c.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.NON_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.PROTECTED_AND_PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.PUBLIC_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: JsonAutoDetect.java */
    /* renamed from: da5$b */
    /* loaded from: classes2.dex */
    public static class b implements Serializable {
        private static final c f;
        protected static final b g;
        protected static final b h;
        protected final c a;
        protected final c b;
        protected final c c;
        protected final c d;
        protected final c e;

        static {
            c cVar = c.PUBLIC_ONLY;
            f = cVar;
            g = new b(cVar, cVar, cVar, c.ANY, cVar);
            c cVar2 = c.DEFAULT;
            h = new b(cVar2, cVar2, cVar2, cVar2, cVar2);
        }

        private b(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
            this.a = cVar;
            this.b = cVar2;
            this.c = cVar3;
            this.d = cVar4;
            this.e = cVar5;
        }

        private static boolean a(b bVar, b bVar2) {
            if (bVar.a == bVar2.a && bVar.b == bVar2.b && bVar.c == bVar2.c && bVar.d == bVar2.d && bVar.e == bVar2.e) {
                return true;
            }
            return false;
        }

        private static b b(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
            if (cVar == f) {
                b bVar = g;
                if (cVar2 == bVar.b && cVar3 == bVar.c && cVar4 == bVar.d && cVar5 == bVar.e) {
                    return bVar;
                }
                return null;
            }
            c cVar6 = c.DEFAULT;
            if (cVar == cVar6 && cVar2 == cVar6 && cVar3 == cVar6 && cVar4 == cVar6 && cVar5 == cVar6) {
                return h;
            }
            return null;
        }

        public c c() {
            return this.e;
        }

        public c d() {
            return this.a;
        }

        public c e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass() && a(this, (b) obj)) {
                return true;
            }
            return false;
        }

        public c f() {
            return this.c;
        }

        public int hashCode() {
            return ((this.a.ordinal() + 1) ^ (((this.b.ordinal() * 3) - (this.c.ordinal() * 7)) + (this.d.ordinal() * 11))) ^ (this.e.ordinal() * 13);
        }

        public c i() {
            return this.d;
        }

        protected Object readResolve() {
            b b = b(this.a, this.b, this.c, this.d, this.e);
            if (b == null) {
                return this;
            }
            return b;
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: JsonAutoDetect.java */
    /* renamed from: da5$c */
    /* loaded from: classes2.dex */
    public enum c {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean a(Member member) {
            int i = a.a[ordinal()];
            if (i == 1) {
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                } else if (Modifier.isProtected(member.getModifiers())) {
                    return true;
                }
                return Modifier.isPublic(member.getModifiers());
            }
            return !Modifier.isPrivate(member.getModifiers());
        }
    }

    c creatorVisibility() default c.DEFAULT;

    c fieldVisibility() default c.DEFAULT;

    c getterVisibility() default c.DEFAULT;

    c isGetterVisibility() default c.DEFAULT;

    c setterVisibility() default c.DEFAULT;
}
