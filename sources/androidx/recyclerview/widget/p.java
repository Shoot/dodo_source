package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
class p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.a0 a0Var, m mVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.T() != 0 && a0Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1;
            }
            return Math.min(mVar.n(), mVar.d(view2) - mVar.g(view));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.a0 a0Var, m mVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        int max;
        if (pVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.n0(view), pVar.n0(view2));
        int max2 = Math.max(pVar.n0(view), pVar.n0(view2));
        if (z2) {
            max = Math.max(0, (a0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(mVar.d(view2) - mVar.g(view)) / (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1))) + (mVar.m() - mVar.g(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.a0 a0Var, m mVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.T() != 0 && a0Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return a0Var.b();
            }
            return (int) (((mVar.d(view2) - mVar.g(view)) / (Math.abs(pVar.n0(view) - pVar.n0(view2)) + 1)) * a0Var.b());
        }
        return 0;
    }
}
