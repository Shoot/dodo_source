package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;
/* compiled from: BuildCompat.java */
/* renamed from: gh0  reason: default package */
/* loaded from: classes.dex */
public class gh0 {
    protected static boolean a(@NonNull String str, @NonNull String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && (i < 30 || !a("S", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 32 || !a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }
}
