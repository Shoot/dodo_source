package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* renamed from: a1c  reason: default package */
/* loaded from: classes.dex */
public class a1c {
    private static final m1c a;
    static final Property<View, Float> b;
    static final Property<View, Rect> c;

    /* compiled from: ViewUtils.java */
    /* renamed from: a1c$a */
    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(a1c.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            a1c.g(view, f.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: a1c$b */
    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return syb.w(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            syb.B0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new l1c();
        } else if (i >= 23) {
            a = new k1c();
        } else if (i >= 22) {
            a = new i1c();
        } else {
            a = new g1c();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull View view) {
        a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0c b(@NonNull View view) {
        return new yzb(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(@NonNull View view) {
        return a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z4c d(@NonNull View view) {
        return new y4c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(@NonNull View view) {
        a.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(@NonNull View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(@NonNull View view, float f) {
        a.f(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(@NonNull View view, int i) {
        a.g(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(@NonNull View view, @NonNull Matrix matrix) {
        a.h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(@NonNull View view, @NonNull Matrix matrix) {
        a.i(view, matrix);
    }
}
