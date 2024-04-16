package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ToppingSpanListener.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lhjb;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hjb  reason: default package */
/* loaded from: classes2.dex */
public final class hjb implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final a b = new a(null);
    public static final int c = 8;
    private final RecyclerView a;

    /* compiled from: ToppingSpanListener.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lhjb$a;", "", "", "MAX_CELLS_COUNT", "I", "MIN_CELLS_COUNT", "", "MIN_ITEM_WIDTH", "F", "MIN_SPACING_SIZE", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hjb$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public hjb(RecyclerView recyclerView) {
        z65.h(recyclerView, "recyclerView");
        this.a = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        RecyclerView.p layoutManager = this.a.getLayoutManager();
        z65.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int a2 = mpb.a(100.0f, this.a.getContext());
        int a3 = mpb.a(8.0f, this.a.getContext());
        int width = this.a.getWidth();
        int i = 4;
        while (true) {
            if (i <= 0) {
                break;
            }
            if (width / (((i - 1) * a3) + (a2 * i)) >= 1.0f) {
                gridLayoutManager.l3(i);
                break;
            }
            i--;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
