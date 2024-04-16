package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
/* compiled from: WindowCompat.java */
/* renamed from: w4c  reason: default package */
/* loaded from: classes.dex */
public final class w4c {

    /* compiled from: WindowCompat.java */
    /* renamed from: w4c$a */
    /* loaded from: classes.dex */
    static class a {
        static void a(@NonNull Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* compiled from: WindowCompat.java */
    /* renamed from: w4c$b */
    /* loaded from: classes.dex */
    static class b {
        static void a(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @NonNull
    public static z5c a(@NonNull Window window, @NonNull View view) {
        return new z5c(window, view);
    }

    public static void b(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
