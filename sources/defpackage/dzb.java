package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u0000H\u0086\u0002\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "a", "", c.a, "Lkotlin/sequences/Sequence;", "b", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: dzb  reason: default package */
/* loaded from: classes.dex */
public final class dzb {

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"dzb$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: dzb$a */
    /* loaded from: classes.dex */
    public static final class a implements Sequence<View> {
        final /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return dzb.c(this.a);
        }
    }

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"dzb$b", "", "Landroid/view/View;", "", "hasNext", "b", "", CartQueueItemEntity.OPERATION_REMOVE, "", "a", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: dzb$b */
    /* loaded from: classes.dex */
    public static final class b implements Iterator<View>, be5 {
        private int a;
        final /* synthetic */ ViewGroup b;

        b(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.b;
            int i = this.a;
            this.a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a < this.b.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.b;
            int i = this.a - 1;
            this.a = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final View a(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final Sequence<View> b(ViewGroup viewGroup) {
        z65.h(viewGroup, "<this>");
        return new a(viewGroup);
    }

    public static final Iterator<View> c(ViewGroup viewGroup) {
        z65.h(viewGroup, "<this>");
        return new b(viewGroup);
    }
}
