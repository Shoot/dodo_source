package defpackage;

import java.io.Serializable;
/* compiled from: NotificationLite.java */
/* renamed from: q27  reason: default package */
/* loaded from: classes3.dex */
public enum q27 {
    COMPLETE;

    /* compiled from: NotificationLite.java */
    /* renamed from: q27$a */
    /* loaded from: classes3.dex */
    static final class a implements Serializable {
        final Throwable a;

        a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return x47.c(this.a, ((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.a + "]";
        }
    }

    /* compiled from: NotificationLite.java */
    /* renamed from: q27$b */
    /* loaded from: classes3.dex */
    static final class b implements Serializable {
        final k1b a;

        public String toString() {
            return "NotificationLite.Subscription[" + this.a + "]";
        }
    }

    public static <T> boolean a(Object obj, h67<? super T> h67Var) {
        if (obj == COMPLETE) {
            h67Var.b();
            return true;
        } else if (obj instanceof a) {
            h67Var.onError(((a) obj).a);
            return true;
        } else {
            h67Var.d(obj);
            return false;
        }
    }

    public static <T> boolean i(Object obj, i1b<? super T> i1bVar) {
        if (obj == COMPLETE) {
            i1bVar.b();
            return true;
        } else if (obj instanceof a) {
            i1bVar.onError(((a) obj).a);
            return true;
        } else if (obj instanceof b) {
            i1bVar.c(((b) obj).a);
            return false;
        } else {
            i1bVar.d(obj);
            return false;
        }
    }

    public static Object k() {
        return COMPLETE;
    }

    public static Object o(Throwable th) {
        return new a(th);
    }

    public static Throwable q(Object obj) {
        return ((a) obj).a;
    }

    public static boolean u(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static boolean w(Object obj) {
        return obj instanceof a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T s(Object obj) {
        return obj;
    }

    public static <T> Object x(T t) {
        return t;
    }
}
