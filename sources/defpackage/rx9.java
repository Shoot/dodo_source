package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
/* compiled from: ScrollUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lrx9;", "", "Landroidx/recyclerview/widget/RecyclerView$p;", "layoutManager", "", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "loadingTriggerThreshold", "", "b", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rx9  reason: default package */
/* loaded from: classes.dex */
public final class rx9 {
    public static final rx9 a = new rx9();

    private rx9() {
    }

    private final int a(RecyclerView.p pVar) {
        if (pVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) pVar).h2();
        }
        if (pVar instanceof StaggeredGridLayoutManager) {
            if (pVar.T() > 0) {
                return ((StaggeredGridLayoutManager) pVar).o2(null)[0];
            }
            return 0;
        }
        throw new IllegalStateException("LayoutManager needs to subclass LinearLayoutManager or StaggeredGridLayoutManager".toString());
    }

    public final boolean b(RecyclerView recyclerView, int i) {
        z65.h(recyclerView, "recyclerView");
        Object b = mh5.b(recyclerView.getLayoutManager(), "LayoutManager cannot be null");
        z65.g(b, "notNullOrError(...)");
        RecyclerView.p pVar = (RecyclerView.p) b;
        int childCount = recyclerView.getChildCount();
        int i0 = pVar.i0();
        int a2 = a(pVar);
        if (i0 - childCount > i + a2 && i0 != 0 && a2 != -1) {
            return false;
        }
        return true;
    }
}
