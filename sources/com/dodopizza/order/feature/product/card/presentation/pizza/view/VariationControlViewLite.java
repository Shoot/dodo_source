package com.dodopizza.order.feature.product.card.presentation.pizza.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.product.card.presentation.pizza.view.VariationControlViewLite;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.t39;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: VariationControlViewLite.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010@\u001a\u0004\u0018\u00010?\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011J\u0010\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0011J\u001a\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b)\u0010#R\u001b\u0010-\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010'R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b.\u0010#R\u001b\u00101\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b0\u0010'R\u001b\u00103\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b2\u0010#R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00104R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/pizza/view/VariationControlViewLite;", "Landroid/widget/LinearLayout;", "", "isVisible", "", "sizes", "", "i", "isEnable", "g", Image.TYPE_HIGH, "", "text", "setSmallSizeText", "setMediumSizeText", "setLargeSizeText", "Lkotlin/Function1;", "", "variationChangeListener", "setOnVariationChangeListener", "setSizeControlVisible", "f", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "b", "currentSize", "setSelectedSize", RemoteMessageConst.Notification.COLOR, "setBackgroundAllSizes", "sizeChangeListener", "setOnSizeChangeListener", "Landroid/view/View;", "a", "Lk79;", "getGroupSize", "()Landroid/view/View;", "groupSize", "Landroid/widget/RadioButton;", "getSmallSizeBtn", "()Landroid/widget/RadioButton;", "smallSizeBtn", "getSmallDiscount", "smallDiscount", DateTokenConverter.CONVERTER_KEY, "getMediumSizeBtn", "mediumSizeBtn", "getMediumDiscount", "mediumDiscount", "getLargeSizeBtn", "largeSizeBtn", "getLargeDiscount", "largeDiscount", "Lkotlin/jvm/functions/Function1;", "onSizeChangeListener", "onVariationChangeListener", "Lt39;", "j", "Lt39;", "sizeButtonsHelper", "Lt39$b;", "k", "Lt39$b;", "onCheckListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VariationControlViewLite extends LinearLayout {
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(VariationControlViewLite.class, "groupSize", "getGroupSize()Landroid/view/View;", 0)), bc9.f(new ar8(VariationControlViewLite.class, "smallSizeBtn", "getSmallSizeBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(VariationControlViewLite.class, "smallDiscount", "getSmallDiscount()Landroid/view/View;", 0)), bc9.f(new ar8(VariationControlViewLite.class, "mediumSizeBtn", "getMediumSizeBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(VariationControlViewLite.class, "mediumDiscount", "getMediumDiscount()Landroid/view/View;", 0)), bc9.f(new ar8(VariationControlViewLite.class, "largeSizeBtn", "getLargeSizeBtn()Landroid/widget/RadioButton;", 0)), bc9.f(new ar8(VariationControlViewLite.class, "largeDiscount", "getLargeDiscount()Landroid/view/View;", 0))};
    public static final int m = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private Function1<? super Integer, Unit> h;
    private Function1<? super Integer, Unit> i;
    private final t39 j;
    private final t39.b k;

    public VariationControlViewLite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = kb0.d(this, gy8.group_size);
        this.b = kb0.d(this, gy8.small_size);
        this.c = kb0.d(this, gy8.small_discount_view);
        this.d = kb0.d(this, gy8.medium_size);
        this.e = kb0.d(this, gy8.medium_discount_view);
        this.f = kb0.d(this, gy8.large_size);
        this.g = kb0.d(this, gy8.large_discount_view);
        this.h = d.a;
        this.i = e.a;
        t39 t39Var = new t39();
        this.j = t39Var;
        t39.b bVar = new t39.b() { // from class: cxb
            @Override // defpackage.t39.b
            public final void a(int i) {
                VariationControlViewLite.d(VariationControlViewLite.this, i);
            }
        };
        this.k = bVar;
        View.inflate(getContext(), gz8.view_variation_control_lite, this);
        t39Var.f(getSmallSizeBtn());
        t39Var.f(getMediumSizeBtn());
        t39Var.f(getLargeSizeBtn());
        t39Var.j(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(VariationControlViewLite variationControlViewLite, int i) {
        int i2;
        z65.h(variationControlViewLite, "this$0");
        int g = variationControlViewLite.j.g();
        if (g == gy8.small_size) {
            i2 = 1;
        } else if (g == gy8.medium_size || g != gy8.large_size) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        variationControlViewLite.i.invoke(Integer.valueOf(i2));
        variationControlViewLite.h.invoke(Integer.valueOf(i2));
    }

    private final void g(boolean z, int[] iArr) {
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

    private final View getGroupSize() {
        return (View) this.a.a(this, l[0]);
    }

    private final View getLargeDiscount() {
        return (View) this.g.a(this, l[6]);
    }

    private final RadioButton getLargeSizeBtn() {
        return (RadioButton) this.f.a(this, l[5]);
    }

    private final View getMediumDiscount() {
        return (View) this.e.a(this, l[4]);
    }

    private final RadioButton getMediumSizeBtn() {
        return (RadioButton) this.d.a(this, l[3]);
    }

    private final View getSmallDiscount() {
        return (View) this.c.a(this, l[2]);
    }

    private final RadioButton getSmallSizeBtn() {
        return (RadioButton) this.b.a(this, l[1]);
    }

    private final void h(boolean z, int[] iArr) {
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

    private final void i(boolean z, int[] iArr) {
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

    public final void b(int[] iArr) {
        z65.h(iArr, "sizes");
        g(false, iArr);
    }

    public final void c() {
        h(false, new int[]{1, 2, 3});
    }

    public final void e(int[] iArr) {
        z65.h(iArr, "sizes");
        h(true, iArr);
    }

    public final void f(int[] iArr) {
        z65.h(iArr, "sizes");
        i(true, iArr);
    }

    public final void setBackgroundAllSizes(int i) {
        getSmallSizeBtn().setBackground(new ColorDrawable(iu1.c(getContext(), i)));
        getMediumSizeBtn().setBackground(new ColorDrawable(iu1.c(getContext(), i)));
        getLargeSizeBtn().setBackground(new ColorDrawable(iu1.c(getContext(), i)));
    }

    public final void setLargeSizeText(String str) {
        z65.h(str, "text");
        getLargeSizeBtn().setText(str);
    }

    public final void setMediumSizeText(String str) {
        z65.h(str, "text");
        getMediumSizeBtn().setText(str);
    }

    public final void setOnSizeChangeListener(Function1<? super Integer, Unit> function1) {
        z65.h(function1, "sizeChangeListener");
        this.h = function1;
    }

    public final void setOnVariationChangeListener(Function1<? super Integer, Unit> function1) {
        z65.h(function1, "variationChangeListener");
        this.i = function1;
    }

    public final void setSelectedSize(int i) {
        this.j.j(null);
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
        this.j.j(this.k);
    }

    public final void setSizeControlVisible(boolean z) {
        int i;
        View groupSize = getGroupSize();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        groupSize.setVisibility(i);
    }

    public final void setSmallSizeText(String str) {
        z65.h(str, "text");
        getSmallSizeBtn().setText(str);
    }
}
