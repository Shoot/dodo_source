package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: PagerMarginItemDecoration.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lep7;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "", "a", "I", "marginBetweenItems", "b", "adjacentVisibleSize", c.a, "firstItemMargin", DateTokenConverter.CONVERTER_KEY, "lastItemMargin", "<init>", "(IIII)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ep7  reason: default package */
/* loaded from: classes.dex */
public final class ep7 extends RecyclerView.o {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ep7$a */
    /* loaded from: classes.dex */
    public static final class a implements View.OnLayoutChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ RecyclerView b;
        final /* synthetic */ int c;

        public a(View view, RecyclerView recyclerView, int i) {
            this.a = view;
            this.b = recyclerView;
            this.c = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            z65.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            View view2 = this.a;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.b.getWidth() - this.c;
                view2.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public ep7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z;
        int i;
        z65.h(rect, "outRect");
        z65.h(view, "view");
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        int b = mpb.b(this.a, recyclerView.getContext());
        int b2 = mpb.b(this.c, recyclerView.getContext());
        int b3 = mpb.b(this.d, recyclerView.getContext());
        int b4 = mpb.b(this.b, recyclerView.getContext());
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z2 = false;
        if (childAdapterPosition == 0) {
            z = true;
        } else {
            z = false;
        }
        if (childAdapterPosition == a0Var.b() - 1) {
            z2 = true;
        }
        if (a0Var.b() > 1) {
            i = (b * 2) + (b4 * 2);
        } else {
            i = b2 + b3;
        }
        if (syb.Y(recyclerView) && !recyclerView.isLayoutRequested()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = recyclerView.getWidth() - i;
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            recyclerView.addOnLayoutChangeListener(new a(view, recyclerView, i));
        }
        int i2 = b / 2;
        rect.left = i2;
        rect.right = i2;
        if (z) {
            int layoutDirection = recyclerView.getLayoutDirection();
            if (layoutDirection != 0) {
                if (layoutDirection == 1) {
                    rect.right = b2;
                }
            } else {
                rect.left = b2;
            }
        }
        if (z2) {
            int layoutDirection2 = recyclerView.getLayoutDirection();
            if (layoutDirection2 != 0) {
                if (layoutDirection2 == 1) {
                    rect.left = b3;
                    return;
                }
                return;
            }
            rect.right = b3;
        }
    }
}
