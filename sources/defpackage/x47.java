package defpackage;
/* compiled from: ObjectHelper.java */
/* renamed from: x47  reason: default package */
/* loaded from: classes3.dex */
public final class x47 {
    static final za0<Object, Object> a = new a();

    /* compiled from: ObjectHelper.java */
    /* renamed from: x47$a */
    /* loaded from: classes3.dex */
    static final class a implements za0<Object, Object> {
        a() {
        }

        @Override // defpackage.za0
        public boolean a(Object obj, Object obj2) {
            return x47.c(obj, obj2);
        }
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public static int b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <T> za0<T, T> d() {
        return (za0<T, T>) a;
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int f(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
