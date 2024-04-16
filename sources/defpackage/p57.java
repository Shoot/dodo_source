package defpackage;

import androidx.annotation.NonNull;
import java.util.Objects;
/* compiled from: ObjectsCompat.java */
/* renamed from: p57  reason: default package */
/* loaded from: classes.dex */
public class p57 {

    /* compiled from: ObjectsCompat.java */
    /* renamed from: p57$a */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(Object... objArr) {
        return a.b(objArr);
    }

    @NonNull
    public static <T> T c(T t) {
        t.getClass();
        return t;
    }

    @NonNull
    public static <T> T d(T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String e(Object obj, String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }
}
