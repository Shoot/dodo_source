package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.h;
import com.dodopizza.activeorder.feature.orderdetails.presentation.GoodViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderGoodListAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lzd7;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/GoodViewHolder;", "", "getItemCount", "", "Lhd7;", "items", "", "l", "position", "", "getItemId", "viewHolder", "i", "Landroid/view/ViewGroup;", "parent", "viewType", "j", "holder", "k", "Lcom/bumptech/glide/h;", "a", "Lcom/bumptech/glide/h;", "glide", "b", "Ljava/util/List;", "<init>", "(Lcom/bumptech/glide/h;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zd7  reason: default package */
/* loaded from: classes.dex */
public final class zd7 extends RecyclerView.h<GoodViewHolder> {
    private final h a;
    private List<hd7> b;

    public zd7(h hVar) {
        List<hd7> l;
        z65.h(hVar, "glide");
        this.a = hVar;
        l = kc1.l();
        this.b = l;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        return this.b.get(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i */
    public void onBindViewHolder(GoodViewHolder goodViewHolder, int i) {
        z65.h(goodViewHolder, "viewHolder");
        goodViewHolder.bindData(this.b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j */
    public GoodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(rz8.g, viewGroup, false);
        z65.e(inflate);
        return new GoodViewHolder(inflate, this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k */
    public void onViewRecycled(GoodViewHolder goodViewHolder) {
        z65.h(goodViewHolder, "holder");
        super.onViewRecycled(goodViewHolder);
        this.a.n(goodViewHolder.getImageView().getSingleImageView());
    }

    public final void l(List<hd7> list) {
        z65.h(list, "items");
        this.b = new ArrayList(list);
        notifyDataSetChanged();
    }
}
