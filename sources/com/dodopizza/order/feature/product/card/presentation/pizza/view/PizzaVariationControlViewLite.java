package com.dodopizza.order.feature.product.card.presentation.pizza.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.PizzaVariationControlViewLite;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.t39;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: PizzaVariationControlViewLite.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010e\u001a\u0004\u0018\u00010d\u0012\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bh\u0010iJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ \u0010\u0019\u001a\u00020\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016J\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0017J\u001a\u0010)\u001a\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060'J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u000e\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0017J\u001a\u00102\u001a\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060'J\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u00020\u0006J\u000e\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0004J\u001c\u00108\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u0017072\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b@\u0010AR\u001b\u0010D\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\bC\u0010=R\u001b\u0010F\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010;\u001a\u0004\bE\u0010AR\u001b\u0010H\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\bG\u0010=R\u001b\u0010J\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\bI\u0010=R\u001b\u0010L\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\bK\u0010AR\u001b\u0010N\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\bM\u0010=R\u001b\u0010P\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\bO\u0010AR\u001b\u0010S\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=R\u001b\u0010U\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\bT\u0010AR\u001b\u0010W\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\bV\u0010=R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010YR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010YR\"\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\\R\"\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\\R(\u0010`\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010_R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010b¨\u0006j"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/PizzaVariationControlViewLite;", "Landroid/widget/LinearLayout;", "", "isVisible", "", "sizes", "", "x", "isEnable", "t", "doughs", "w", Image.TYPE_SMALL, "u", "v", "", "text", "setSmallSizeText", "setMediumSizeText", "setLargeSizeText", "setTraditionalDoughText", "setThinDoughText", "Lkotlin/Function2;", "", "variationChangeListener", "setOnVariationChangeListener", "l", "size", "dough", "n", "setSizeControlVisible", "r", "i", "o", "g", "f", DateTokenConverter.CONVERTER_KEY, "currentSize", "setSelectedSize", "Lkotlin/Function1;", "sizeChangeListener", "setOnSizeChangeListener", "setDoughControlVisible", "q", Image.TYPE_HIGH, com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "currentDough", "setSelectedDough", "doughChangeListener", "setOnDoughChangeListener", "k", Image.TYPE_MEDIUM, "discountForDough", "p", "", "b", "Landroid/view/View;", "a", "Lk79;", "getGroupTypeDough", "()Landroid/view/View;", "groupTypeDough", "Landroid/widget/RadioButton;", "getTraditionalDoughBtn", "()Landroid/widget/RadioButton;", "traditionalDoughBtn", "getTraditionalDiscount", "traditionalDiscount", "getThinDoughBtn", "thinDoughBtn", "getThinDiscount", "thinDiscount", "getGroupSizePizza", "groupSizePizza", "getSmallSizeBtn", "smallSizeBtn", "getSmallDiscount", "smallDiscount", "getMediumSizeBtn", "mediumSizeBtn", "j", "getMediumDiscount", "mediumDiscount", "getLargeSizeBtn", "largeSizeBtn", "getLargeDiscount", "largeDiscount", "Lt39;", "Lt39;", "sizeButtonsHelper", "doughButtonHelper", "Lkotlin/jvm/functions/Function1;", "onSizeChangeListener", "onDoughChangeListener", "Lkotlin/jvm/functions/Function2;", "onVariationChangeListener", "Lt39$b;", "Lt39$b;", "onCheckListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PizzaVariationControlViewLite extends LinearLayout {
    static final /* synthetic */ je5<Object>[] s = {bc9.f(new ar8(PizzaVariationControlViewLite.class, "groupTypeDough", "getGroupTypeDough()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "traditionalDoughBtn", "getTraditionalDoughBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "traditionalDiscount", "getTraditionalDiscount()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "thinDoughBtn", "getThinDoughBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "thinDiscount", "getThinDiscount()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "groupSizePizza", "getGroupSizePizza()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "smallSizeBtn", "getSmallSizeBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "smallDiscount", "getSmallDiscount()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "mediumSizeBtn", "getMediumSizeBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "mediumDiscount", "getMediumDiscount()Landroid/view/View;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "largeSizeBtn", "getLargeSizeBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(PizzaVariationControlViewLite.class, "largeDiscount", "getLargeDiscount()Landroid/view/View;", 0))};
    public static final int t = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final t39 m;
    private final t39 n;
    private Function1<? super Integer, Unit> o;
    private Function1<? super Integer, Unit> p;
    private Function2<? super Integer, ? super Integer, Unit> q;
    private final t39.b r;

    /* compiled from: PizzaVariationControlViewLite.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<Integer, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void invoke(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }
    }

    public PizzaVariationControlViewLite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = kb0.d(this, gy8.group_type_dough);
        this.b = kb0.d(this, gy8.traditional_dough);
        this.c = kb0.d(this, gy8.traditional_discount_view);
        this.d = kb0.d(this, gy8.thin_dough);
        this.e = kb0.d(this, gy8.thin_discount_view);
        this.f = kb0.d(this, gy8.group_size_pizza);
        this.g = kb0.d(this, gy8.small_size);
        this.h = kb0.d(this, gy8.small_discount_view);
        this.i = kb0.d(this, gy8.medium_size);
        this.j = kb0.d(this, gy8.medium_discount_view);
        this.k = kb0.d(this, gy8.large_size);
        this.l = kb0.d(this, gy8.large_discount_view);
        t39 t39Var = new t39();
        this.m = t39Var;
        t39 t39Var2 = new t39();
        this.n = t39Var2;
        this.o = com.dodopizza.order.feature.product.card.presentation.pizza.view.b.a;
        this.p = com.dodopizza.order.feature.product.card.presentation.pizza.view.a.a;
        this.q = c.a;
        t39.b bVar = new t39.b() { // from class: c88
            @Override // defpackage.t39.b
            public final void a(int i) {
                PizzaVariationControlViewLite.j(PizzaVariationControlViewLite.this, i);
            }
        };
        this.r = bVar;
        View.inflate(getContext(), gz8.view_pizza_variation_control_lite, this);
        t39Var.f(getSmallSizeBtn());
        t39Var.f(getMediumSizeBtn());
        t39Var.f(getLargeSizeBtn());
        t39Var.j(bVar);
        t39Var2.f(getTraditionalDoughBtn());
        t39Var2.f(getThinDoughBtn());
        t39Var2.j(bVar);
    }

    private final View getGroupSizePizza() {
        return (View) this.f.a(this, s[5]);
    }

    private final View getGroupTypeDough() {
        return (View) this.a.a(this, s[0]);
    }

    private final View getLargeDiscount() {
        return (View) this.l.a(this, s[11]);
    }

    private final RadioButton getLargeSizeBtn() {
        return (RadioButton) this.k.a(this, s[10]);
    }

    private final View getMediumDiscount() {
        return (View) this.j.a(this, s[9]);
    }

    private final RadioButton getMediumSizeBtn() {
        return (RadioButton) this.i.a(this, s[8]);
    }

    private final View getSmallDiscount() {
        return (View) this.h.a(this, s[7]);
    }

    private final RadioButton getSmallSizeBtn() {
        return (RadioButton) this.g.a(this, s[6]);
    }

    private final View getThinDiscount() {
        return (View) this.e.a(this, s[4]);
    }

    private final RadioButton getThinDoughBtn() {
        return (RadioButton) this.d.a(this, s[3]);
    }

    private final View getTraditionalDiscount() {
        return (View) this.c.a(this, s[2]);
    }

    private final RadioButton getTraditionalDoughBtn() {
        return (RadioButton) this.b.a(this, s[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PizzaVariationControlViewLite pizzaVariationControlViewLite, int i) {
        int i2;
        z65.h(pizzaVariationControlViewLite, "this$0");
        int g = pizzaVariationControlViewLite.m.g();
        int i3 = 2;
        if (g == gy8.small_size) {
            i2 = 1;
        } else if (g == gy8.medium_size || g != gy8.large_size) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        if (pizzaVariationControlViewLite.n.g() != gy8.thin_dough) {
            i3 = 1;
        }
        pizzaVariationControlViewLite.q.invoke(Integer.valueOf(i2), Integer.valueOf(i3));
        pizzaVariationControlViewLite.o.invoke(Integer.valueOf(i2));
        pizzaVariationControlViewLite.p.invoke(Integer.valueOf(i3));
    }

    private final void s(boolean z, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i == 2) {
                    getThinDoughBtn().setEnabled(z);
                }
            } else {
                getTraditionalDoughBtn().setEnabled(z);
            }
        }
    }

    private final void t(boolean z, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        getLargeSizeBtn().setEnabled(z);
                    }
                } else {
                    getMediumSizeBtn().setEnabled(z);
                }
            } else {
                getSmallSizeBtn().setEnabled(z);
            }
        }
    }

    private final void u(boolean z, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        un3.o(getLargeDiscount(), z);
                    }
                } else {
                    un3.o(getMediumDiscount(), z);
                }
            } else {
                un3.o(getSmallDiscount(), z);
            }
        }
    }

    private final void v(boolean z, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i == 2) {
                    un3.o(getThinDiscount(), z);
                }
            } else {
                un3.o(getTraditionalDiscount(), z);
            }
        }
    }

    private final void w(boolean z, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i == 2) {
                    un3.o(getThinDoughBtn(), z);
                }
            } else {
                un3.o(getTraditionalDoughBtn(), z);
            }
        }
    }

    private final void x(boolean z, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        un3.o(getLargeSizeBtn(), z);
                    }
                } else {
                    un3.o(getMediumSizeBtn(), z);
                }
            } else {
                un3.o(getSmallSizeBtn(), z);
            }
        }
    }

    public final void b(List<Integer> list, boolean z) {
        z65.h(list, "sizes");
        for (Number number : list) {
            int intValue = number.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        getLargeDiscount().setActivated(z);
                    }
                } else {
                    getMediumDiscount().setActivated(z);
                }
            } else {
                getSmallDiscount().setActivated(z);
            }
        }
    }

    public final void c(int[] iArr) {
        z65.h(iArr, "doughs");
        s(false, iArr);
    }

    public final void d(int[] iArr) {
        z65.h(iArr, "sizes");
        t(false, iArr);
    }

    public final void e(int[] iArr) {
        z65.h(iArr, "doughs");
        s(true, iArr);
    }

    public final void f(int[] iArr) {
        z65.h(iArr, "sizes");
        t(true, iArr);
    }

    public final void g() {
        u(false, new int[]{1, 2, 3});
        v(false, new int[]{2, 1});
    }

    public final void h(int[] iArr) {
        z65.h(iArr, "doughs");
        w(false, iArr);
    }

    public final void i(int[] iArr) {
        z65.h(iArr, "sizes");
        x(false, iArr);
    }

    public final void k() {
        this.p = a.a;
    }

    public final void l() {
        this.q = b.a;
    }

    public final void m() {
        un3.o(getTraditionalDoughBtn(), false);
        un3.o(getThinDoughBtn(), false);
        un3.o(getThinDiscount(), false);
        un3.o(getTraditionalDiscount(), false);
        getTraditionalDoughBtn().setEnabled(true);
        getThinDoughBtn().setEnabled(true);
    }

    public final void n(int i, int i2) {
        this.m.j(null);
        this.n.j(null);
        if (i2 != 1) {
            if (i2 == 2) {
                getThinDoughBtn().setChecked(true);
            }
        } else {
            getTraditionalDoughBtn().setChecked(true);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    getLargeSizeBtn().setChecked(true);
                }
            } else {
                getMediumSizeBtn().setChecked(true);
            }
        } else {
            getSmallSizeBtn().setChecked(true);
        }
        this.m.j(this.r);
        this.n.j(this.r);
    }

    public final void o(int[] iArr) {
        z65.h(iArr, "sizes");
        u(true, iArr);
    }

    public final void p(int[] iArr) {
        z65.h(iArr, "discountForDough");
        v(true, iArr);
    }

    public final void q(int[] iArr) {
        z65.h(iArr, "doughs");
        w(true, iArr);
    }

    public final void r(int[] iArr) {
        z65.h(iArr, "sizes");
        x(true, iArr);
    }

    public final void setDoughControlVisible(boolean z) {
        int i;
        View groupTypeDough = getGroupTypeDough();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        groupTypeDough.setVisibility(i);
    }

    public final void setLargeSizeText(String str) {
        z65.h(str, "text");
        getLargeSizeBtn().setText(str);
    }

    public final void setMediumSizeText(String str) {
        z65.h(str, "text");
        getMediumSizeBtn().setText(str);
    }

    public final void setOnDoughChangeListener(Function1<? super Integer, Unit> function1) {
        z65.h(function1, "doughChangeListener");
        this.p = function1;
    }

    public final void setOnSizeChangeListener(Function1<? super Integer, Unit> function1) {
        z65.h(function1, "sizeChangeListener");
        this.o = function1;
    }

    public final void setOnVariationChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        z65.h(function2, "variationChangeListener");
        this.q = function2;
    }

    public final void setSelectedDough(int i) {
        this.n.j(null);
        if (i != 1) {
            if (i == 2) {
                getThinDoughBtn().setChecked(true);
            }
        } else {
            getTraditionalDoughBtn().setChecked(true);
        }
        this.n.j(this.r);
    }

    public final void setSelectedSize(int i) {
        this.m.j(null);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    getLargeSizeBtn().setChecked(true);
                }
            } else {
                getMediumSizeBtn().setChecked(true);
            }
        } else {
            getSmallSizeBtn().setChecked(true);
        }
        this.m.j(this.r);
    }

    public final void setSizeControlVisible(boolean z) {
        int i;
        View groupSizePizza = getGroupSizePizza();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        groupSizePizza.setVisibility(i);
    }

    public final void setSmallSizeText(String str) {
        z65.h(str, "text");
        getSmallSizeBtn().setText(str);
    }

    public final void setThinDoughText(String str) {
        z65.h(str, "text");
        getThinDoughBtn().setText(str);
    }

    public final void setTraditionalDoughText(String str) {
        z65.h(str, "text");
        getTraditionalDoughBtn().setText(str);
    }

    /* compiled from: PizzaVariationControlViewLite.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function2<Integer, Integer, Unit> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }

        public final void a(int i, int i2) {
        }
    }
}
