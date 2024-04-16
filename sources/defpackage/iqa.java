package defpackage;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: SoftwareKeyboardControllerCompat.java */
/* renamed from: iqa  reason: default package */
/* loaded from: classes.dex */
public final class iqa {
    private final c a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: iqa$a */
    /* loaded from: classes.dex */
    private static class a extends c {
        private final View a;

        a(View view) {
            this.a = view;
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: iqa$b */
    /* loaded from: classes.dex */
    private static class b extends a {
        private View b;

        b(@NonNull View view) {
            super(view);
            this.b = view;
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: iqa$c */
    /* loaded from: classes.dex */
    private static class c {
        c() {
        }
    }

    public iqa(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
        } else {
            this.a = new a(view);
        }
    }
}
