package defpackage;

import android.os.Build;
import android.view.ViewStructure;
import androidx.annotation.NonNull;
/* compiled from: ViewStructureCompat.java */
/* renamed from: q0c  reason: default package */
/* loaded from: classes.dex */
public class q0c {
    private final Object a;

    /* compiled from: ViewStructureCompat.java */
    /* renamed from: q0c$a */
    /* loaded from: classes.dex */
    private static class a {
        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private q0c(@NonNull ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    @NonNull
    public static q0c f(@NonNull ViewStructure viewStructure) {
        return new q0c(viewStructure);
    }

    public void a(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(ft1.a(this.a), str);
        }
    }

    public void b(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(ft1.a(this.a), charSequence);
        }
    }

    public void c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.c(ft1.a(this.a), i, i2, i3, i4, i5, i6);
        }
    }

    public void d(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.d(ft1.a(this.a), charSequence);
        }
    }

    @NonNull
    public ViewStructure e() {
        return ft1.a(this.a);
    }
}
