package defpackage;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: TooltipCompat.java */
/* renamed from: yib  reason: default package */
/* loaded from: classes.dex */
public class yib {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TooltipCompat.java */
    /* renamed from: yib$a */
    /* loaded from: classes.dex */
    public static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(@NonNull View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            bjb.h(view, charSequence);
        }
    }
}
