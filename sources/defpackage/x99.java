package defpackage;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.h;
import defpackage.fr5;
/* compiled from: RecyclerViewPreloader.java */
/* renamed from: x99  reason: default package */
/* loaded from: classes.dex */
public final class x99<T> extends RecyclerView.u {
    private final w99 a;

    public x99(@NonNull h hVar, @NonNull fr5.a<T> aVar, @NonNull fr5.b<T> bVar, int i) {
        this.a = new w99(new fr5(hVar, aVar, bVar, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.onScrolled(recyclerView, i, i2);
    }
}
