package defpackage;

import androidx.annotation.NonNull;
import java.util.Locale;
/* compiled from: Preconditions.java */
/* renamed from: kh8  reason: default package */
/* loaded from: classes.dex */
public final class kh8 {
    public static void a(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static int b(int i, int i2, int i3, @NonNull String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static int c(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static int d(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int e(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    @NonNull
    public static <T> T f(T t) {
        t.getClass();
        return t;
    }

    @NonNull
    public static <T> T g(T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void h(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
