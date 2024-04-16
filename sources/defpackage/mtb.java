package defpackage;

import androidx.recyclerview.widget.e;
import defpackage.atb;
import java.util.List;
import kotlin.Metadata;
/* compiled from: UpsellDiffCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lmtb;", "Landroidx/recyclerview/widget/e$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Latb;", "a", "Ljava/util/List;", "oldItems", "b", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mtb  reason: default package */
/* loaded from: classes2.dex */
public final class mtb extends e.b {
    private final List<atb> a;
    private final List<atb> b;

    /* JADX WARN: Multi-variable type inference failed */
    public mtb(List<? extends atb> list, List<? extends atb> list2) {
        z65.h(list, "oldItems");
        z65.h(list2, "newItems");
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areContentsTheSame(int i, int i2) {
        atb.a aVar;
        atb.a aVar2;
        String str;
        atb atbVar = this.a.get(i);
        String str2 = null;
        if (atbVar instanceof atb.a) {
            aVar = (atb.a) atbVar;
        } else {
            aVar = null;
        }
        atb atbVar2 = this.b.get(i2);
        if (atbVar2 instanceof atb.a) {
            aVar2 = (atb.a) atbVar2;
        } else {
            aVar2 = null;
        }
        if (aVar != null) {
            str = aVar.b();
        } else {
            str = null;
        }
        if (aVar2 != null) {
            str2 = aVar2.b();
        }
        return z65.c(str, str2);
    }

    @Override // androidx.recyclerview.widget.e.b
    public boolean areItemsTheSame(int i, int i2) {
        atb.a aVar;
        atb atbVar = this.a.get(i);
        atb.a aVar2 = null;
        if (atbVar instanceof atb.a) {
            aVar = (atb.a) atbVar;
        } else {
            aVar = null;
        }
        atb atbVar2 = this.b.get(i2);
        if (atbVar2 instanceof atb.a) {
            aVar2 = (atb.a) atbVar2;
        }
        return z65.c(aVar, aVar2);
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
