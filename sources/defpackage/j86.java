package defpackage;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: MarginLayoutParamsCompat.java */
/* renamed from: j86  reason: default package */
/* loaded from: classes.dex */
public final class j86 {

    /* compiled from: MarginLayoutParamsCompat.java */
    /* renamed from: j86$a */
    /* loaded from: classes.dex */
    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    public static int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static void c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        a.g(marginLayoutParams, i);
    }

    public static void d(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        a.h(marginLayoutParams, i);
    }
}
