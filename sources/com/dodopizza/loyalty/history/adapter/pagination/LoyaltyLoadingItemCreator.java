package com.dodopizza.loyalty.history.adapter.pagination;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
/* compiled from: LoyaltyLoadingItemCreator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/loyalty/history/adapter/pagination/LoyaltyLoadingItemCreator;", "Las5;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "holder", "position", "", "b", "I", "framePadding", "progressSize", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LoyaltyLoadingItemCreator implements as5 {
    private final int a = (int) kx9.a(12);
    private final int b = (int) kx9.a(48);

    @Override // defpackage.as5
    public RecyclerView.d0 a(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "parent");
        final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int i2 = this.a;
        frameLayout.setPadding(i2, i2, i2, i2);
        ProgressBar progressBar = new ProgressBar(frameLayout.getContext());
        progressBar.setIndeterminateTintList(iu1.d(progressBar.getContext(), ow8.e));
        frameLayout.addView(progressBar);
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i3 = this.b;
        layoutParams2.height = i3;
        layoutParams2.width = i3;
        layoutParams2.gravity = 17;
        return new RecyclerView.d0(frameLayout) { // from class: com.dodopizza.loyalty.history.adapter.pagination.LoyaltyLoadingItemCreator$onCreateViewHolder$1
        };
    }

    @Override // defpackage.as5
    public void b(RecyclerView.d0 d0Var, int i) {
        z65.h(d0Var, "holder");
    }
}
