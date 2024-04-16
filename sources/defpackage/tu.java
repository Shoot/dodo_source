package defpackage;

import androidx.recyclerview.widget.e;
import defpackage.ku;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantMoodItemVODiffCallback.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Ltu;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "getChangePayload", "", "Lsu;", "a", "Ljava/util/List;", "oldVOs", "b", "newVOs", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tu  reason: default package */
/* loaded from: classes2.dex */
public final class tu extends e.b {
    private final List<su> a;
    private final List<su> b;

    public tu(List<su> list, List<su> list2) {
        z65.h(list, "oldVOs");
        z65.h(list2, "newVOs");
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
    public Object getChangePayload(int i, int i2) {
        if (this.a.get(i).b() != this.b.get(i2).b()) {
            return ku.a.a;
        }
        return null;
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
