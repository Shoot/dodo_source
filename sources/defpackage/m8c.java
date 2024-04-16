package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WrapperAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001d\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lm8c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "k", "j", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "", "onBindViewHolder", "getItemCount", "getItemViewType", "", "getItemId", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "displayLoadingRow", "i", "a", "Landroidx/recyclerview/widget/RecyclerView$h;", "originalAdapter", "Las5;", "b", "Las5;", "loadingItemCreator", c.a, "Z", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$h;Las5;)V", DateTokenConverter.CONVERTER_KEY, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m8c  reason: default package */
/* loaded from: classes.dex */
public final class m8c extends RecyclerView.h<RecyclerView.d0> {
    private static final a d = new a(null);
    private final RecyclerView.h<RecyclerView.d0> a;
    private final as5 b;
    private volatile boolean c;

    /* compiled from: WrapperAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm8c$a;", "", "", "ITEM_VIEW_TYPE_LOADING", "I", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: m8c$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public m8c(RecyclerView.h<RecyclerView.d0> hVar, as5 as5Var) {
        z65.h(hVar, "originalAdapter");
        z65.h(as5Var, "loadingItemCreator");
        this.a = hVar;
        this.b = as5Var;
        setHasStableIds(hVar.hasStableIds());
    }

    private final int j() {
        if (this.c) {
            return getItemCount() - 1;
        }
        return -1;
    }

    private final boolean k(int i) {
        if (this.c && i == j()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        if (this.c) {
            return this.a.getItemCount() + 1;
        }
        return this.a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        if (k(i)) {
            return -1L;
        }
        return this.a.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        if (k(i)) {
            return 2147483597;
        }
        return this.a.getItemViewType(i);
    }

    public final void i(boolean z) {
        if (this.c != z) {
            this.c = z;
            if (this.c) {
                notifyItemInserted(this.a.getItemCount());
            } else {
                notifyItemRemoved(this.a.getItemCount());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        z65.h(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        z65.h(d0Var, "holder");
        if (k(i)) {
            this.b.b(d0Var, i);
        } else {
            this.a.onBindViewHolder(d0Var, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "parent");
        if (i == 2147483597) {
            return this.b.a(viewGroup, i);
        }
        RecyclerView.d0 onCreateViewHolder = this.a.onCreateViewHolder(viewGroup, i);
        z65.g(onCreateViewHolder, "onCreateViewHolder(...)");
        return onCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        z65.h(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.a.onDetachedFromRecyclerView(recyclerView);
    }
}
