package com.dodopizza.android.recyclerview.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
/* compiled from: SelfInflatingViewHolder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkzb;", "viewInflater", "", "viewLayoutId", "<init>", "(Lkzb;I)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class SelfInflatingViewHolder extends RecyclerView.d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfInflatingViewHolder(kzb kzbVar, int i) {
        super(kzbVar.a(i));
        z65.h(kzbVar, "viewInflater");
    }
}
