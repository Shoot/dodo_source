package defpackage;
/* compiled from: Objects.java */
/* renamed from: o57  reason: default package */
/* loaded from: classes.dex */
public final class o57 {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T c(T t) {
        t.getClass();
        return t;
    }
}
