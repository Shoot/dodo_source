package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.c5c;
import kotlin.Metadata;
/* compiled from: insets.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a*\u0010\n\u001a\u00020\u0004*\u00020\u00002\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a2\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u001a2\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u001a2\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u001a\f\u0010\u0015\u001a\u00020\u0004*\u00020\u0000H\u0002¨\u0006\u0016"}, d2 = {"Landroid/view/View;", "targetView", "", "isConsumed", "", "b", "Lkotlin/Function3;", "Lc5c;", "Landroid/graphics/Rect;", "block", DateTokenConverter.CONVERTER_KEY, "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "k", "i", "start", "end", "g", "f", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: p45 */
/* loaded from: classes.dex */
public final class p45 {

    /* compiled from: insets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Lc5c;", "insets", "Landroid/graphics/Rect;", "initialPadding", "a", "(Landroid/view/View;Lc5c;Landroid/graphics/Rect;)Lc5c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: p45$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements y84<View, c5c, Rect, c5c> {
        final /* synthetic */ View a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z) {
            super(3);
            this.a = view;
            this.b = z;
        }

        @Override // defpackage.y84
        /* renamed from: a */
        public final c5c invoke(View view, c5c c5cVar, Rect rect) {
            z65.h(view, "<anonymous parameter 0>");
            z65.h(c5cVar, "insets");
            z65.h(rect, "initialPadding");
            p45.l(this.a, 0, 0, 0, rect.bottom + c5cVar.i(), 7, null);
            if (this.b) {
                c5c a = new c5c.b(c5cVar).c(n45.b(c5cVar.j(), c5cVar.l(), c5cVar.k(), 0)).a();
                z65.e(a);
                return a;
            }
            return c5cVar;
        }
    }

    /* compiled from: insets.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"p45$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewDetachedFromWindow", "onViewAttachedToWindow", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p45$b */
    /* loaded from: classes.dex */
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            z65.h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            syb.r0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            z65.h(view, "view");
        }
    }

    public static final void b(View view, View view2, boolean z) {
        z65.h(view, "<this>");
        z65.h(view2, "targetView");
        d(view, new a(view2, z));
    }

    public static /* synthetic */ void c(View view, View view2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            view2 = view;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        b(view, view2, z);
    }

    public static final void d(View view, final y84<? super View, ? super c5c, ? super Rect, ? extends c5c> y84Var) {
        z65.h(view, "<this>");
        z65.h(y84Var, "block");
        final Rect rect = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        syb.I0(view, new h77() { // from class: o45
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c e;
                e = p45.e(y84.this, rect, view2, c5cVar);
                return e;
            }
        });
        f(view);
    }

    public static final c5c e(y84 y84Var, Rect rect, View view, c5c c5cVar) {
        z65.h(y84Var, "$block");
        z65.h(rect, "$initialViewPadding");
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        return (c5c) y84Var.invoke(view, c5cVar, rect);
    }

    private static final void f(View view) {
        if (syb.X(view)) {
            syb.r0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static final void g(View view, int i, int i2, int i3, int i4) {
        z65.h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
        view.requestLayout();
    }

    public static /* synthetic */ void h(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            z65.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            z65.f(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            z65.f(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i4 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        g(view, i, i2, i3, i4);
    }

    public static final void i(View view, int i, int i2, int i3, int i4) {
        z65.h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
        view.requestLayout();
    }

    public static /* synthetic */ void j(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            z65.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            z65.f(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            z65.f(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i4 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        i(view, i, i2, i3, i4);
    }

    public static final void k(View view, int i, int i2, int i3, int i4) {
        z65.h(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void l(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        k(view, i, i2, i3, i4);
    }
}
