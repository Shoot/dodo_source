package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: AnnotationCollector.java */
/* renamed from: pl  reason: default package */
/* loaded from: classes2.dex */
public abstract class pl {
    protected static final tl b = new c();
    protected final Object a;

    /* compiled from: AnnotationCollector.java */
    /* renamed from: pl$a */
    /* loaded from: classes2.dex */
    static class a extends pl {
        public static final a c = new a(null);

        a(Object obj) {
            super(obj);
        }

        @Override // defpackage.pl
        public pl a(Annotation annotation) {
            return new e(this.a, annotation.annotationType(), annotation);
        }

        @Override // defpackage.pl
        public rl b() {
            return new rl();
        }

        @Override // defpackage.pl
        public tl c() {
            return pl.b;
        }

        @Override // defpackage.pl
        public boolean f(Annotation annotation) {
            return false;
        }
    }

    /* compiled from: AnnotationCollector.java */
    /* renamed from: pl$b */
    /* loaded from: classes2.dex */
    static class b extends pl {
        protected final HashMap<Class<?>, Annotation> c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        @Override // defpackage.pl
        public pl a(Annotation annotation) {
            this.c.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // defpackage.pl
        public rl b() {
            rl rlVar = new rl();
            for (Annotation annotation : this.c.values()) {
                rlVar.e(annotation);
            }
            return rlVar;
        }

        @Override // defpackage.pl
        public tl c() {
            if (this.c.size() == 2) {
                Iterator<Map.Entry<Class<?>, Annotation>> it = this.c.entrySet().iterator();
                Map.Entry<Class<?>, Annotation> next = it.next();
                Map.Entry<Class<?>, Annotation> next2 = it.next();
                return new f(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
            }
            return new rl(this.c);
        }

        @Override // defpackage.pl
        public boolean f(Annotation annotation) {
            return this.c.containsKey(annotation.annotationType());
        }
    }

    /* compiled from: AnnotationCollector.java */
    /* renamed from: pl$c */
    /* loaded from: classes2.dex */
    public static class c implements tl, Serializable {
        c() {
        }

        @Override // defpackage.tl
        public <A extends Annotation> A a(Class<A> cls) {
            return null;
        }

        @Override // defpackage.tl
        public boolean b(Class<?> cls) {
            return false;
        }

        @Override // defpackage.tl
        public boolean c(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // defpackage.tl
        public int size() {
            return 0;
        }
    }

    /* compiled from: AnnotationCollector.java */
    /* renamed from: pl$d */
    /* loaded from: classes2.dex */
    public static class d implements tl, Serializable {
        private final Class<?> a;
        private final Annotation b;

        public d(Class<?> cls, Annotation annotation) {
            this.a = cls;
            this.b = annotation;
        }

        @Override // defpackage.tl
        public <A extends Annotation> A a(Class<A> cls) {
            if (this.a == cls) {
                return (A) this.b;
            }
            return null;
        }

        @Override // defpackage.tl
        public boolean b(Class<?> cls) {
            if (this.a == cls) {
                return true;
            }
            return false;
        }

        @Override // defpackage.tl
        public boolean c(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.a) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.tl
        public int size() {
            return 1;
        }
    }

    /* compiled from: AnnotationCollector.java */
    /* renamed from: pl$e */
    /* loaded from: classes2.dex */
    static class e extends pl {
        private Class<?> c;
        private Annotation d;

        public e(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.c = cls;
            this.d = annotation;
        }

        @Override // defpackage.pl
        public pl a(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.c;
            if (cls == annotationType) {
                this.d = annotation;
                return this;
            }
            return new b(this.a, cls, this.d, annotationType, annotation);
        }

        @Override // defpackage.pl
        public rl b() {
            return rl.g(this.c, this.d);
        }

        @Override // defpackage.pl
        public tl c() {
            return new d(this.c, this.d);
        }

        @Override // defpackage.pl
        public boolean f(Annotation annotation) {
            if (annotation.annotationType() == this.c) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AnnotationCollector.java */
    /* renamed from: pl$f */
    /* loaded from: classes2.dex */
    public static class f implements tl, Serializable {
        private final Class<?> a;
        private final Class<?> b;
        private final Annotation c;
        private final Annotation d;

        public f(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.a = cls;
            this.c = annotation;
            this.b = cls2;
            this.d = annotation2;
        }

        @Override // defpackage.tl
        public <A extends Annotation> A a(Class<A> cls) {
            if (this.a == cls) {
                return (A) this.c;
            }
            if (this.b == cls) {
                return (A) this.d;
            }
            return null;
        }

        @Override // defpackage.tl
        public boolean b(Class<?> cls) {
            if (this.a != cls && this.b != cls) {
                return false;
            }
            return true;
        }

        @Override // defpackage.tl
        public boolean c(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.a || cls == this.b) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.tl
        public int size() {
            return 2;
        }
    }

    protected pl(Object obj) {
        this.a = obj;
    }

    public static tl d() {
        return b;
    }

    public static pl e() {
        return a.c;
    }

    public abstract pl a(Annotation annotation);

    public abstract rl b();

    public abstract tl c();

    public abstract boolean f(Annotation annotation);
}
