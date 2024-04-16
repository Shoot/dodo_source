package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: LinePagerIndicatorDecoration.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020%¢\u0006\u0004\b>\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J8\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J \u0010!\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J(\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00102¨\u0006?"}, d2 = {"Lbq5;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", e.a, "Landroid/graphics/Canvas;", "canvas", "", "indicatorStartX", "indicatorPosY", "itemCount", "inactiveColor", "", c.a, DateTokenConverter.CONVERTER_KEY, "highlightPosition", "progress", "activeColor", "b", "", Image.TYPE_HIGH, "neededWidth", "actualWidth", "a", "coefficient", "j", "Landroid/view/View;", "view", "f", "g", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "getItemOffsets", "Lt05;", "Lt05;", "getParams", "()Lt05;", "i", "(Lt05;)V", "params", "F", "strokeWidth", "trackerItemLength", "trackerItemPadding", "scrollRadius", "trackerHeight", "I", "lastIndicatorColor", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "k", "lastIndicatorPaint", "l", "currentItemCount", "<init>", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bq5  reason: default package */
/* loaded from: classes.dex */
public final class bq5 extends RecyclerView.o {
    private t05 a;
    private final float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;
    private final Interpolator i;
    private final Paint j;
    private final Paint k;
    private int l;

    public bq5(t05 t05Var) {
        z65.h(t05Var, "params");
        this.a = t05Var;
        float a = kx9.a(2);
        this.b = a;
        this.c = this.a.f();
        this.d = this.a.e();
        this.e = kx9.a(4);
        this.f = kx9.a(4);
        this.g = kx9.a(0);
        this.i = new AccelerateDecelerateInterpolator();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(a);
        paint.setAntiAlias(true);
        this.j = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(a);
        paint2.setAntiAlias(true);
        this.k = paint2;
    }

    private final void a(float f, float f2) {
        if (f > f2) {
            j(f2 / f);
        }
    }

    private final void b(Canvas canvas, float f, float f2, int i, float f3, int i2) {
        this.j.setColor(i2);
        float f4 = this.c;
        float f5 = this.d + f4;
        if (f3 == 0.0f) {
            float f6 = f + (f5 * i);
            float d = d(f2);
            float f7 = this.e;
            canvas.drawRoundRect(f6, f2, f6 + f4, d, f7, f7, this.j);
            return;
        }
        float f8 = f + (i * f5);
        float f9 = f3 * f4;
        float d2 = d(f2);
        float f10 = this.e;
        canvas.drawRoundRect(f8 + f9, f2, f8 + f4, d2, f10, f10, this.j);
        if (i < this.l - 1) {
            float f11 = f8 + f5;
            float d3 = d(f2);
            float f12 = this.e;
            canvas.drawRoundRect(f11, f2, f11 + f9, d3, f12, f12, this.j);
        }
    }

    private final void c(Canvas canvas, float f, float f2, int i, int i2) {
        this.j.setColor(i2);
        this.k.setColor(this.h);
        float f3 = this.c + this.d;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.a.i() && this.a.k() && i3 == i - 1) {
                float d = d(f2);
                float f4 = this.e;
                canvas.drawRoundRect(f, f2, f + this.c, d, f4, f4, this.k);
            } else {
                float d2 = d(f2);
                float f5 = this.e;
                canvas.drawRoundRect(f, f2, f + this.c, d2, f5, f5, this.j);
            }
            f += f3;
        }
    }

    private final float d(float f) {
        return f + this.f;
    }

    private final int e(RecyclerView recyclerView) {
        int i;
        Integer valueOf;
        if (this.a.i()) {
            RecyclerView.h adapter = recyclerView.getAdapter();
            if (adapter != null) {
                valueOf = Integer.valueOf(adapter.getItemCount());
            } else {
                valueOf = null;
            }
        } else {
            RecyclerView.h adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                i = adapter2.getItemCount() - 1;
            } else {
                i = 0;
            }
            valueOf = Integer.valueOf(Math.max(i, 0));
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    private final int f(View view) {
        return view.getResources().getDisplayMetrics().widthPixels - (((int) this.a.g()) * 2);
    }

    private final float g(int i) {
        return (i * this.a.f()) + ((i - 1) * this.a.e());
    }

    private final boolean h(RecyclerView recyclerView) {
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemCount() > 1) {
            return true;
        }
        return false;
    }

    private final void j(float f) {
        this.c = this.a.f() * f;
        this.d = f * this.a.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        z65.h(rect, "outRect");
        z65.h(view, "view");
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        if (h(recyclerView)) {
            rect.bottom = ((int) this.a.j()) + ((int) this.f);
        }
    }

    public final void i(t05 t05Var) {
        z65.h(t05Var, "<set-?>");
        this.a = t05Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View M;
        int f;
        z65.h(canvas, "canvas");
        z65.h(recyclerView, "parent");
        z65.h(a0Var, "state");
        super.onDrawOver(canvas, recyclerView, a0Var);
        int e = e(recyclerView);
        if (h(recyclerView)) {
            if (this.l != e && (f = f(recyclerView)) != 0) {
                a(g(e), f);
            }
            this.l = e;
            float width = (recyclerView.getWidth() - ((this.c * e) + (Math.max(0, e - 1) * this.d))) / 2.0f;
            if (this.g == 0.0f) {
                this.g = recyclerView.getHeight() - this.f;
            }
            int c = iu1.c(recyclerView.getContext(), this.a.d());
            this.h = iu1.c(recyclerView.getContext(), this.a.h());
            c(canvas, width, this.g, e, c);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            z65.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int h2 = linearLayoutManager.h2();
            if (h2 != -1 && (M = linearLayoutManager.M(h2)) != null) {
                b(canvas, width, this.g, h2, this.i.getInterpolation((M.getLeft() * (-1)) / M.getWidth()), iu1.c(recyclerView.getContext(), this.a.c()));
            }
        }
    }
}
