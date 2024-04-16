package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: ViewGroupUtils.java */
/* renamed from: hzb  reason: default package */
/* loaded from: classes.dex */
class hzb {
    private static boolean a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fzb a(@NonNull ViewGroup viewGroup) {
        return new ezb(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void b(@NonNull ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }
}
