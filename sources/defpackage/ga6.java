package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: MaterialShapeUtils.java */
/* renamed from: ga6  reason: default package */
/* loaded from: classes2.dex */
public class ga6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static gx1 a(int i) {
        if (i != 0) {
            if (i != 1) {
                return b();
            }
            return new h62();
        }
        return new lo9();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static gx1 b() {
        return new lo9();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static zc3 c() {
        return new zc3();
    }

    public static void d(@NonNull View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof fa6) {
            ((fa6) background).a0(f);
        }
    }

    public static void e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof fa6) {
            f(view, (fa6) background);
        }
    }

    public static void f(@NonNull View view, @NonNull fa6 fa6Var) {
        if (fa6Var.S()) {
            fa6Var.e0(z0c.h(view));
        }
    }
}
