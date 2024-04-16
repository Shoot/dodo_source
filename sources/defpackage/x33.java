package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import java.util.List;
/* compiled from: DisplayCutoutCompat.java */
/* renamed from: x33  reason: default package */
/* loaded from: classes.dex */
public final class x33 {
    private final DisplayCutout a;

    /* compiled from: DisplayCutoutCompat.java */
    /* renamed from: x33$a */
    /* loaded from: classes.dex */
    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private x33(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x33 e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new x33(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x33.class == obj.getClass()) {
            return p57.a(this.a, ((x33) obj).a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
