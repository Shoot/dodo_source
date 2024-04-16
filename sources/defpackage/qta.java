package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: StartPaddingDividerItemDecoration.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010!\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006%"}, d2 = {"Lqta;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "a", c.a, "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "", "I", "startPadding", "", "b", "Z", "drawCompletion", "bottomMarginSize", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Rect;", "mBounds", "Landroid/graphics/Paint;", e.a, "Lrn5;", "()Landroid/graphics/Paint;", "paint", "dividerColor", "dividerHeight", "<init>", "(IIIZI)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qta  reason: default package */
/* loaded from: classes.dex */
public final class qta extends RecyclerView.o {
    private final int a;
    private final boolean b;
    private final int c;
    private final Rect d = new Rect();
    private final rn5 e;

    /* compiled from: StartPaddingDividerItemDecoration.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Paint;", "a", "()Landroid/graphics/Paint;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qta$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Paint> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Paint invoke() {
            Paint paint = new Paint();
            int i = this.a;
            int i2 = this.b;
            paint.setColor(i);
            paint.setStrokeWidth(i2);
            return paint;
        }
    }

    public qta(int i, int i2, int i3, boolean z, int i4) {
        rn5 b;
        this.a = i;
        this.b = z;
        this.c = i4;
        b = yn5.b(new a(i2, i3));
        this.e = b;
    }

    private final void a(Canvas canvas, RecyclerView recyclerView) {
        int c;
        boolean b;
        Number valueOf;
        int width;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.d);
            int i2 = this.d.bottom;
            c = la6.c(childAt.getTranslationY());
            int i3 = i2 + c;
            if (i == childCount - 1) {
                if (this.b) {
                    float f = i3;
                    canvas.drawLine(0.0f, f, recyclerView.getWidth(), f, b());
                }
            } else {
                RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(childAt);
                z65.g(childViewHolder, "getChildViewHolder(...)");
                b = rta.b(childViewHolder);
                if (!b) {
                    if (recyclerView.getLayoutDirection() == 1) {
                        valueOf = Float.valueOf(0.0f);
                    } else {
                        valueOf = Integer.valueOf(this.a);
                    }
                    if (recyclerView.getLayoutDirection() == 1) {
                        width = recyclerView.getWidth() - this.a;
                    } else {
                        width = recyclerView.getWidth();
                    }
                    float f2 = i3;
                    canvas.drawLine(valueOf.floatValue(), f2, width, f2, b());
                }
            }
        }
    }

    private final Paint b() {
        return (Paint) this.e.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean b;
        int i;
        z65.h(rect, "outRect");
        z65.h(view, "view");
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(view);
        z65.g(childViewHolder, "getChildViewHolder(...)");
        b = rta.b(childViewHolder);
        if (b) {
            i = this.c;
        } else {
            i = 0;
        }
        rect.set(0, 0, 0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        z65.h(canvas, c.a);
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        super.onDrawOver(canvas, recyclerView, a0Var);
        a(canvas, recyclerView);
    }
}
