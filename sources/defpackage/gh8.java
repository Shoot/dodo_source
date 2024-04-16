package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: gh8  reason: default package */
/* loaded from: classes2.dex */
public final class gh8 {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void c(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void d(@NonNull Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + ".");
        }
    }

    public static void e(@NonNull String str) {
        if (rqc.a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @NonNull
    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @NonNull
    public static String g(String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void h() {
        i("Must not be called on the main application thread");
    }

    public static void i(@NonNull String str) {
        if (!rqc.a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @NonNull
    public static <T> T j(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @NonNull
    public static <T> T k(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int l(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void m(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void n(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
