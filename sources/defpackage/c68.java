package defpackage;

import androidx.recyclerview.widget.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PickupPizzeriaVODiffUtilCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lc68;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lb68;", "a", "Ljava/util/List;", "oldItems", "b", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c68  reason: default package */
/* loaded from: classes4.dex */
public final class c68 extends e.b {
    private final List<b68> a;
    private final List<b68> b;

    public c68(List<b68> list, List<b68> list2) {
        z65.h(list, "oldItems");
        z65.h(list2, "newItems");
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areContentsTheSame(int i, int i2) {
        b68 b68Var = this.a.get(i);
        b68 b68Var2 = this.b.get(i2);
        if (b68Var.i() == b68Var2.i() && z65.c(b68Var.h(), b68Var2.h()) && z65.c(b68Var.c(), b68Var2.c()) && b68Var.j() == b68Var2.j()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areItemsTheSame(int i, int i2) {
        return z65.c(this.a.get(i).d(), this.b.get(i2).d());
    }

    @Override // androidx.recyclerview.widget.e.b
    public int getNewListSize() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.e.b
    public int getOldListSize() {
        return this.a.size();
    }
}
