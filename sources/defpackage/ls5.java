package defpackage;

import androidx.recyclerview.widget.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LocaleDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lls5;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lct5;", "a", "Ljava/util/List;", "oldItems", "b", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ls5  reason: default package */
/* loaded from: classes2.dex */
public final class ls5 extends e.b {
    private final List<ct5> a;
    private final List<ct5> b;

    public ls5(List<ct5> list, List<ct5> list2) {
        z65.h(list, "oldItems");
        z65.h(list2, "newItems");
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areContentsTheSame(int i, int i2) {
        return z65.c(this.a.get(i), this.b.get(i2));
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areItemsTheSame(int i, int i2) {
        return z65.c(this.a.get(i).a(), this.b.get(i2).a());
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
