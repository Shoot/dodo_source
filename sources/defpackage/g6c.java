package defpackage;

import android.os.Build;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: WindowUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0003J\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0003J\u0014\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0003J\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0003J\n\u0010\r\u001a\u00020\u0005*\u00020\u0002R\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0016"}, d2 = {"Lg6c;", "", "Landroid/view/Window;", "", "newColor", "", "f", c.a, RemoteMessageConst.Notification.COLOR, e.a, DateTokenConverter.CONVERTER_KEY, "b", "a", "g", "I", "getSTATUS_BAR_COLOR_COMPAT$annotations", "()V", "STATUS_BAR_COLOR_COMPAT", "NAVIGATION_BAR_COLOR_COMPAT", "DEFAULT_BACKGROUND_COLOR", "TRANSPARENT_COLOR", "<init>", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g6c  reason: default package */
/* loaded from: classes.dex */
public final class g6c {
    public static final g6c a = new g6c();
    private static final int b = jw8.c;
    private static final int c = jw8.d;
    private static final int d = jw8.a;
    private static final int e = jw8.q;

    private g6c() {
    }

    private final void c(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            w4c.a(window, window.getDecorView()).a(!of1.a(i));
        }
    }

    private final void f(Window window, int i) {
        boolean a2 = of1.a(i);
        if (i == iu1.c(window.getContext(), e)) {
            a2 = of1.a(iu1.c(window.getContext(), d));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            w4c.a(window, window.getDecorView()).b(!a2);
        }
    }

    public final void a(Window window, int i) {
        z65.h(window, "<this>");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        if (i2 < 26) {
            i = iu1.c(window.getContext(), c);
        }
        if (window.getNavigationBarColor() != i) {
            c(window, i);
            window.setNavigationBarColor(i);
        }
    }

    public final void b(Window window, int i) {
        z65.h(window, "<this>");
        a(window, iu1.c(window.getContext(), i));
    }

    public final void d(Window window, int i) {
        z65.h(window, "<this>");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            window.setStatusBarContrastEnforced(false);
        }
        if (i2 < 23) {
            i = iu1.c(window.getContext(), b);
        }
        if (window.getStatusBarColor() != i) {
            f(window, i);
            window.setStatusBarColor(i);
        }
    }

    public final void e(Window window, int i) {
        z65.h(window, "<this>");
        d(window, iu1.c(window.getContext(), i));
    }

    public final void g(Window window) {
        z65.h(window, "<this>");
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
    }
}
