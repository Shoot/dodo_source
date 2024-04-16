package defpackage;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: ViewGroupCompat.java */
/* renamed from: czb  reason: default package */
/* loaded from: classes.dex */
public final class czb {

    /* compiled from: ViewGroupCompat.java */
    /* renamed from: czb$a */
    /* loaded from: classes.dex */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static boolean a(@NonNull ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
