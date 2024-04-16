package defpackage;

import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: RecyclerToListViewScrollListener.java */
/* renamed from: w99  reason: default package */
/* loaded from: classes.dex */
public final class w99 extends RecyclerView.u {
    private final AbsListView.OnScrollListener a;
    private int b = -1;
    private int c = -1;
    private int d = -1;

    public w99(@NonNull AbsListView.OnScrollListener onScrollListener) {
        this.a = onScrollListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = Integer.MIN_VALUE;
                }
            }
        } else {
            i2 = 0;
        }
        this.a.onScrollStateChanged(null, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int h2 = linearLayoutManager.h2();
        int abs = Math.abs(h2 - linearLayoutManager.k2());
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (h2 != this.b || abs != this.c || itemCount != this.d) {
            this.a.onScroll(null, h2, abs, itemCount);
            this.b = h2;
            this.c = abs;
            this.d = itemCount;
        }
    }
}
