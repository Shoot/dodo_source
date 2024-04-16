package defpackage;

import androidx.recyclerview.widget.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PersonalWidgetDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lb28;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lq4c;", "a", "Ljava/util/List;", "oldItems", "b", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b28  reason: default package */
/* loaded from: classes4.dex */
public final class b28 extends e.b {
    private final List<q4c> a;
    private final List<q4c> b;

    /* JADX WARN: Multi-variable type inference failed */
    public b28(List<? extends q4c> list, List<? extends q4c> list2) {
        z65.h(list, "oldItems");
        z65.h(list2, "newItems");
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areContentsTheSame(int i, int i2) {
        q4c q4cVar = this.a.get(i);
        q4c q4cVar2 = this.b.get(i2);
        if (q4cVar instanceof c36) {
            z65.f(q4cVar2, "null cannot be cast to non-null type ru.dodopizza.app.presentation.profile.model.widgets.LoyaltyWidgetDataVO");
            c36 c36Var = (c36) q4cVar2;
            c36 c36Var2 = (c36) q4cVar;
            if (!z65.c(c36Var2.b(), c36Var.b()) || !z65.c(c36Var2.d(), c36Var.d()) || c36Var2.g() != c36Var.g()) {
                return false;
            }
        } else if (q4cVar instanceof a28) {
            z65.f(q4cVar2, "null cannot be cast to non-null type ru.dodopizza.app.presentation.profile.model.widgets.PersonalWidgetDataVO");
            a28 a28Var = (a28) q4cVar2;
            a28 a28Var2 = (a28) q4cVar;
            if (!z65.c(a28Var2.c(), a28Var.c()) || !z65.c(a28Var2.b(), a28Var.b())) {
                return false;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areItemsTheSame(int i, int i2) {
        q4c q4cVar = this.a.get(i);
        q4c q4cVar2 = this.b.get(i2);
        if (z65.c(q4cVar.a(), q4cVar2.a()) && z65.c(q4cVar.a().getId(), q4cVar2.a().getId())) {
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
