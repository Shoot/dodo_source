package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collection;
/* compiled from: Preconditions.java */
/* renamed from: eh8  reason: default package */
/* loaded from: classes.dex */
public final class eh8 {
    public static void a(boolean z, @NonNull String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    @NonNull
    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    public static <T extends Collection<Y>, Y> T c(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @NonNull
    public static <T> T d(T t) {
        return (T) e(t, "Argument must not be null");
    }

    @NonNull
    public static <T> T e(T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
