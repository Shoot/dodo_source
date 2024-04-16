package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
/* compiled from: GravityCompat.java */
/* renamed from: ii4  reason: default package */
/* loaded from: classes.dex */
public final class ii4 {

    /* compiled from: GravityCompat.java */
    /* renamed from: ii4$a */
    /* loaded from: classes.dex */
    static class a {
        static void a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        static void b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        static void c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    public static void a(int i, int i2, int i3, @NonNull Rect rect, @NonNull Rect rect2, int i4) {
        a.b(i, i2, i3, rect, rect2, i4);
    }

    public static int b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
