package defpackage;

import java.io.Serializable;
import java.util.Objects;
/* compiled from: Suppliers.java */
/* renamed from: m2b  reason: default package */
/* loaded from: classes2.dex */
public final class m2b {

    /* compiled from: Suppliers.java */
    /* renamed from: m2b$a */
    /* loaded from: classes2.dex */
    static class a<T> implements l2b<T>, Serializable {
        final l2b<T> a;
        volatile transient boolean b;
        transient T c;

        a(l2b<T> l2bVar) {
            this.a = (l2b) hh8.i(l2bVar);
        }

        @Override // defpackage.l2b
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            T t = this.a.get();
                            this.c = t;
                            this.b = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) v37.a(this.c);
        }

        public String toString() {
            Object obj;
            if (this.b) {
                String valueOf = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.a;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: Suppliers.java */
    /* renamed from: m2b$b */
    /* loaded from: classes2.dex */
    static class b<T> implements l2b<T> {
        volatile l2b<T> a;
        volatile boolean b;
        T c;

        b(l2b<T> l2bVar) {
            this.a = (l2b) hh8.i(l2bVar);
        }

        @Override // defpackage.l2b
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            l2b<T> l2bVar = this.a;
                            Objects.requireNonNull(l2bVar);
                            T t = l2bVar.get();
                            this.c = t;
                            this.b = true;
                            this.a = null;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) v37.a(this.c);
        }

        public String toString() {
            Object obj = this.a;
            if (obj == null) {
                String valueOf = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: Suppliers.java */
    /* renamed from: m2b$c */
    /* loaded from: classes2.dex */
    private static class c<T> implements l2b<T>, Serializable {
        final T a;

        c(T t) {
            this.a = t;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return n57.a(this.a, ((c) obj).a);
            }
            return false;
        }

        @Override // defpackage.l2b
        public T get() {
            return this.a;
        }

        public int hashCode() {
            return n57.b(this.a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> l2b<T> a(l2b<T> l2bVar) {
        if (!(l2bVar instanceof b) && !(l2bVar instanceof a)) {
            if (l2bVar instanceof Serializable) {
                return new a(l2bVar);
            }
            return new b(l2bVar);
        }
        return l2bVar;
    }

    public static <T> l2b<T> b(T t) {
        return new c(t);
    }
}
