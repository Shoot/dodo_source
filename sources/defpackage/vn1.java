package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: CompositeAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&0\u0007¢\u0006\u0004\b(\u0010)J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J&\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\nH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$¨\u0006*"}, d2 = {"Lvn1;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lm6;", "holder", "", "position", "", "", "payloads", "", "i", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "onViewRecycled", "onBindViewHolder", "", "Landroidx/recyclerview/widget/e$e;", "diffResult", Image.TYPE_HIGH, "index", e.a, "payload", c.a, "itemCount", "b", "f", "a", "Ljava/util/List;", "adapterList", "Ly75;", "viewBinders", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vn1  reason: default package */
/* loaded from: classes.dex */
public final class vn1 extends RecyclerView.h<RecyclerView.d0> implements m6 {
    private final List<Object> a;
    private final List<y75<?, ?>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public vn1(List<? extends Object> list, List<? extends y75<?, ?>> list2) {
        z65.h(list, "adapterList");
        z65.h(list2, "viewBinders");
        this.a = list;
        this.b = list2;
    }

    private final void i(RecyclerView.d0 d0Var, int i, List<? extends Object> list) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            y75 y75Var = (y75) it.next();
            if (y75Var.c().invoke(this.a.get(i)).booleanValue()) {
                y75Var.b().c(d0Var, this.a.get(i), i, list);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.m6
    public void a() {
        notifyDataSetChanged();
    }

    @Override // defpackage.m6
    public void b(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    @Override // defpackage.m6
    public void c(int i, Object obj) {
        z65.h(obj, "payload");
        notifyItemChanged(i, obj);
    }

    @Override // defpackage.m6
    public void e(int i) {
        notifyItemChanged(i);
    }

    @Override // defpackage.m6
    public void f(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        Iterator<y75<?, ?>> it = this.b.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().c().invoke(this.a.get(i)).booleanValue()) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        Object obj = this.a.get(i);
        throw new IllegalStateException("ItemAdapter on item (" + obj + ") not registered");
    }

    @Override // defpackage.m6
    public void h(e.C0047e c0047e) {
        z65.h(c0047e, "diffResult");
        c0047e.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        z65.h(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        List<Object> list = this.a;
        if (list instanceof l6) {
            ((l6) list).d(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        List<? extends Object> l;
        z65.h(d0Var, "holder");
        l = kc1.l();
        i(d0Var, i, l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "parent");
        return this.b.get(i).a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        z65.h(recyclerView, "recyclerView");
        List<Object> list = this.a;
        if (list instanceof l6) {
            ((l6) list).G();
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.d0 d0Var) {
        z65.h(d0Var, "holder");
        int absoluteAdapterPosition = d0Var.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            Iterator<T> it = this.b.iterator();
            while (it.hasNext()) {
                y75 y75Var = (y75) it.next();
                if (y75Var.c().invoke(this.a.get(absoluteAdapterPosition)).booleanValue()) {
                    y75Var.b().e(d0Var);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i, List<Object> list) {
        z65.h(d0Var, "holder");
        z65.h(list, "payloads");
        i(d0Var, i, list);
    }
}
