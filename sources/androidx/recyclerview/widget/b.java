package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class b implements gr5 {
    @NonNull
    private final RecyclerView.h a;

    public b(@NonNull RecyclerView.h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.gr5
    public void onChanged(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.gr5
    public void onInserted(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    @Override // defpackage.gr5
    public void onMoved(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    @Override // defpackage.gr5
    public void onRemoved(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }
}
