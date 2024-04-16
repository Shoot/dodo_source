package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: HorizontalMarginDecoration.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lzo4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "", "a", "I", "marginBetweenItems", "b", "firstItemMargin", c.a, "lastItemMargin", "<init>", "(III)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zo4  reason: default package */
/* loaded from: classes.dex */
public final class zo4 extends RecyclerView.o {
    private final int a;
    private final int b;
    private final int c;

    public zo4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        z65.h(rect, "outRect");
        z65.h(view, "view");
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        int b = mpb.b(this.a, recyclerView.getContext());
        int b2 = mpb.b(this.b, recyclerView.getContext());
        int b3 = mpb.b(this.c, recyclerView.getContext());
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        z65.e(adapter);
        int itemCount = adapter.getItemCount() - 1;
        int i = b / 2;
        rect.left = i;
        rect.right = i;
        if (childLayoutPosition == 0) {
            int layoutDirection = recyclerView.getLayoutDirection();
            if (layoutDirection != 0) {
                if (layoutDirection == 1) {
                    rect.right = b2;
                }
            } else {
                rect.left = b2;
            }
        }
        if (childLayoutPosition == itemCount) {
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
