package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: StickyHeaderItemDecoration.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010!\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\f\u0012\u0006\u0010*\u001a\u00020$¢\u0006\u0004\b+\u0010,J4\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J$\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J \u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lhxa;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/view/View;", "previousHeaderView", "stickItemView", "Landroid/graphics/Canvas;", "canvas", "nextHeaderView", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", c.a, "", "first", "firstHeader", DateTokenConverter.CONVERTER_KEY, "view", "", "f", "itemPosition", "g", "header", "yPos", "a", "Landroid/view/ViewGroup;", e.a, "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "getItemOffsets", "I", "headerLayoutResId", "b", "headerOffset", "Lhxa$a;", "Lhxa$a;", "getListener", "()Lhxa$a;", "setListener", "(Lhxa$a;)V", "listener", "<init>", "(IILhxa$a;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hxa  reason: default package */
/* loaded from: classes.dex */
public final class hxa extends RecyclerView.o {
    private final int a;
    private final int b;
    private a c;

    /* compiled from: StickyHeaderItemDecoration.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lhxa$a;", "", "", "itemPosition", "b", "Landroid/view/View;", "header", "headerPosition", "", "a", "currentHeaderPosition", c.a, "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hxa$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(View view, int i);

        int b(int i);

        int c(int i);
    }

    public hxa(int i, int i2, a aVar) {
        z65.h(aVar, "listener");
        this.a = i;
        this.b = i2;
        this.c = aVar;
    }

    private final void a(Canvas canvas, View view, float f) {
        if (view != null) {
            canvas.save();
            canvas.translate(f, 0.0f);
            view.draw(canvas);
            canvas.restore();
        }
    }

    static /* synthetic */ void b(hxa hxaVar, Canvas canvas, View view, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        hxaVar.a(canvas, view, f);
    }

    private final void c(View view, View view2, Canvas canvas, View view3, RecyclerView recyclerView) {
        if (view != null) {
            if (view2.getLeft() > view.getRight()) {
                b(this, canvas, view, 0.0f, 4, null);
                return;
            }
            float left = view2.getLeft() - view.getRight();
            if (Math.abs(left) < view.getWidth()) {
                a(canvas, view, left);
                a(canvas, view3, Math.max(recyclerView.getWidth() + left, f(recyclerView, view3)));
            }
        }
    }

    private final void d(int i, RecyclerView recyclerView, int i2, Canvas canvas) {
        View g = g(i, recyclerView);
        View g2 = g(this.c.c(i2), recyclerView);
        b(this, canvas, g, 0.0f, 4, null);
        a(canvas, g2, f(recyclerView, g2));
    }

    private final void e(ViewGroup viewGroup, View view) {
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0), viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final float f(RecyclerView recyclerView, View view) {
        if (view == null) {
            return 0.0f;
        }
        return recyclerView.getWidth() - (view.getWidth() / 2.0f);
    }

    private final View g(int i, RecyclerView recyclerView) {
        int b = this.c.b(i);
        if (b == -1) {
            return null;
        }
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(this.a, (ViewGroup) recyclerView, false);
        a aVar = this.c;
        z65.e(inflate);
        aVar.a(inflate, b);
        e(recyclerView, inflate);
        return inflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        z65.h(rect, "outRect");
        z65.h(recyclerView, "parent");
        super.getItemOffsets(rect, i, recyclerView);
        rect.top = (int) kx9.a(this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        z65.h(canvas, "canvas");
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        super.onDrawOver(canvas, recyclerView, a0Var);
        if (recyclerView.getChildAt(0) == null) {
            return;
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        z65.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int h2 = linearLayoutManager.h2();
        int k2 = linearLayoutManager.k2();
        int b = this.c.b(h2);
        int b2 = this.c.b(k2);
        if (b == b2) {
            d(h2, recyclerView, b, canvas);
            return;
        }
        int c = this.c.c(b);
        if (h2 <= c && c <= k2) {
            View g = g(c, recyclerView);
            View g2 = g(h2, recyclerView);
            View g3 = g(this.c.c(b2), recyclerView);
            View M = linearLayoutManager.M(c);
            if (M != null && M.getLeft() < f(recyclerView, g)) {
                a(canvas, g, M.getLeft());
                c(g2, M, canvas, g3, recyclerView);
                return;
            }
            a(canvas, g, f(recyclerView, g));
            b(this, canvas, g2, 0.0f, 4, null);
        }
    }
}
