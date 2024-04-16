package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.BigDividerVH;
/* compiled from: PaymentMethodItemDecoration.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Ljt7;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "a", "Landroid/graphics/Canvas;", c.a, "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "onDrawOver", "", "I", "paddingStart", "b", "dividerHeight", "dividerColor", "Landroid/graphics/Rect;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Rect;", "viewBounds", "Landroid/graphics/Paint;", e.a, "Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: jt7  reason: default package */
/* loaded from: classes4.dex */
public final class jt7 extends RecyclerView.o {
    private final int a;
    private final int b;
    private final int c;
    private final Rect d;
    private final Paint e;

    public jt7(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        jx9 jx9Var = jx9.a;
        this.a = jx9Var.a(16);
        this.b = jx9Var.a(1);
        this.c = iu1.c(context, R.color.strokeSecondaryColor);
        this.d = new Rect();
        this.e = new Paint();
    }

    private final boolean a(View view, RecyclerView recyclerView) {
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (childAdapterPosition == i - 1) {
            return false;
        }
        RecyclerView.d0 findContainingViewHolder = recyclerView.findContainingViewHolder(view);
        RecyclerView.d0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(childAdapterPosition + 1);
        if ((findContainingViewHolder instanceof BigDividerVH) || (findViewHolderForAdapterPosition instanceof BigDividerVH)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int c;
        int i;
        int width;
        z65.h(canvas, c.a);
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            z65.e(childAt);
            if (a(childAt, recyclerView)) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.d);
                int i3 = this.d.bottom;
                c = la6.c(childAt.getTranslationY());
                int i4 = i3 + c;
                if (recyclerView.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = this.a;
                }
                if (recyclerView.getLayoutDirection() == 1) {
                    width = this.d.width() - this.a;
                } else {
                    width = this.d.width();
                }
                this.e.setColor(this.c);
                this.e.setStrokeWidth(this.b);
                float f = i4;
                canvas.drawLine(i, f, width, f, this.e);
            }
        }
    }
}
