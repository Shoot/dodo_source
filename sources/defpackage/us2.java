package defpackage;

import androidx.recyclerview.widget.e;
import defpackage.sx6;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DeferredTimeDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lus2;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lsx6$a;", "a", "Ljava/util/List;", "oldItems", "b", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: us2  reason: default package */
/* loaded from: classes4.dex */
public final class us2 extends e.b {
    private final List<sx6.a> a;
    private final List<sx6.a> b;

    /* JADX WARN: Multi-variable type inference failed */
    public us2(List<? extends sx6.a> list, List<? extends sx6.a> list2) {
        z65.h(list, "oldItems");
        z65.h(list2, "newItems");
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areContentsTheSame(int i, int i2) {
        sx6.a aVar = this.a.get(i);
        sx6.a aVar2 = this.b.get(i2);
        if (!(aVar instanceof sx6.a.b) || !(aVar2 instanceof sx6.a.b)) {
            return true;
        }
        sx6.a.b bVar = (sx6.a.b) aVar;
        sx6.a.b bVar2 = (sx6.a.b) aVar2;
        if (bVar.g() == bVar2.g() && bVar.b() == bVar2.b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areItemsTheSame(int i, int i2) {
        sx6.a aVar = this.a.get(i);
        sx6.a aVar2 = this.b.get(i2);
        if ((aVar instanceof sx6.a.b) && (aVar2 instanceof sx6.a.b)) {
            return z65.c(((sx6.a.b) aVar).a(), ((sx6.a.b) aVar2).a());
        }
        if ((aVar instanceof sx6.a.C0671a) && (aVar2 instanceof sx6.a.C0671a)) {
            return true;
        }
        return false;
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
