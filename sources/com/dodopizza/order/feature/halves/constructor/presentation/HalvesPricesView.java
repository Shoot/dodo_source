package com.dodopizza.order.feature.halves.constructor.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.halves.constructor.presentation.HalvesPricesView;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.google.android.flexbox.FlexboxLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: HalvesPricesView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J&\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001a\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u001c\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u001c\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u001c\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0016\u0010+\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0016\u0010-\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010/\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010'R\u0016\u00103\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010$R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006?"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesPricesView;", "Landroid/widget/LinearLayout;", "", "Llm8;", "tags", "Lcom/google/android/flexbox/FlexboxLayout;", "targetTagsContainer", "Lxj4;", ProductEntity.TYPE_PIZZA, "", "i", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, RemoteMessageConst.Notification.TAG, "Lom8;", "b", "Lkotlin/Function1;", "Lmm8;", "listener", "setOnTagClickListener", "", Action.NAME_ATTRIBUTE, "Lhn6;", "price", Image.TYPE_HIGH, "productTags", "g", "f", com.huawei.hms.push.e.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "Landroid/view/View;", "a", "Landroid/view/View;", "lContainer", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "lHalfName", "lHalfPrice", "Lcom/google/android/flexbox/FlexboxLayout;", "lHalfTagsContainer", "rContainer", "rHalfName", "rHalfPrice", "rHalfTagsContainer", "commonContainer", "j", "commonName", "k", "commonTagsContainer", "l", "originalRecipe", "", Image.TYPE_MEDIUM, "I", "tagMargin", "n", "Lkotlin/jvm/functions/Function1;", "onTagClickListener", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HalvesPricesView extends LinearLayout {
    private View a;
    private TextView b;
    private TextView c;
    private FlexboxLayout d;
    private View e;
    private TextView f;
    private TextView g;
    private FlexboxLayout h;
    private View i;
    private TextView j;
    private FlexboxLayout k;
    private TextView l;
    private int m;
    private Function1<? super mm8, Unit> n;

    public HalvesPricesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), gz8.view_halves_name_price, this);
        View findViewById = findViewById(gy8.l_container);
        z65.g(findViewById, "findViewById(...)");
        this.a = findViewById;
        View findViewById2 = findViewById(gy8.l_name);
        z65.g(findViewById2, "findViewById(...)");
        this.b = (TextView) findViewById2;
        View findViewById3 = findViewById(gy8.l_price);
        z65.g(findViewById3, "findViewById(...)");
        this.c = (TextView) findViewById3;
        View findViewById4 = findViewById(gy8.l_tags_container);
        z65.g(findViewById4, "findViewById(...)");
        this.d = (FlexboxLayout) findViewById4;
        View findViewById5 = findViewById(gy8.r_container);
        z65.g(findViewById5, "findViewById(...)");
        this.e = findViewById5;
        View findViewById6 = findViewById(gy8.r_name);
        z65.g(findViewById6, "findViewById(...)");
        this.f = (TextView) findViewById6;
        View findViewById7 = findViewById(gy8.r_price);
        z65.g(findViewById7, "findViewById(...)");
        this.g = (TextView) findViewById7;
        View findViewById8 = findViewById(gy8.r_tags_container);
        z65.g(findViewById8, "findViewById(...)");
        this.h = (FlexboxLayout) findViewById8;
        View findViewById9 = findViewById(gy8.common_container);
        z65.g(findViewById9, "findViewById(...)");
        this.i = findViewById9;
        View findViewById10 = findViewById(gy8.common_name);
        z65.g(findViewById10, "findViewById(...)");
        this.j = (TextView) findViewById10;
        View findViewById11 = findViewById(gy8.common_tags_container);
        z65.g(findViewById11, "findViewById(...)");
        this.k = (FlexboxLayout) findViewById11;
        View findViewById12 = findViewById(gy8.original_recipe_view);
        z65.g(findViewById12, "findViewById(...)");
        this.l = (TextView) findViewById12;
        this.m = getContext().getResources().getDimensionPixelSize(vw8.product_tag_margin);
    }

    private final om8 b(Context context, lm8 lm8Var) {
        om8 om8Var = new om8(context, null, 0, 6, null);
        om8Var.setContent(lm8Var);
        return om8Var;
    }

    private final void i(List<lm8> list, FlexboxLayout flexboxLayout, final xj4 xj4Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final zc zcVar;
        if (list.isEmpty()) {
            un3.e(flexboxLayout);
            return;
        }
        flexboxLayout.removeAllViews();
        un3.k(flexboxLayout);
        for (final lm8 lm8Var : list) {
            Context context = flexboxLayout.getContext();
            z65.g(context, "getContext(...)");
            om8 b = b(context, lm8Var);
            flexboxLayout.addView(b);
            ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                int i = this.m;
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.rightMargin = i;
            }
            if (z65.c(flexboxLayout, this.d)) {
                zcVar = zc.c;
            } else if (z65.c(flexboxLayout, this.h)) {
                zcVar = zc.b;
            } else if (z65.c(flexboxLayout, this.k)) {
                zcVar = zc.d;
            } else {
                zcVar = zc.e;
            }
            b.setOnClickListener(new View.OnClickListener() { // from class: kl4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalvesPricesView.j(HalvesPricesView.this, lm8Var, xj4Var, zcVar, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HalvesPricesView halvesPricesView, lm8 lm8Var, xj4 xj4Var, zc zcVar, View view) {
        z65.h(halvesPricesView, "this$0");
        z65.h(lm8Var, "$tag");
        z65.h(xj4Var, "$pizza");
        z65.h(zcVar, "$halveSide");
        Function1<? super mm8, Unit> function1 = halvesPricesView.n;
        if (function1 != null) {
            function1.invoke(new mm8(lm8Var.b(), xj4Var.b(), xj4Var.e(), String.valueOf(xj4Var.g().a()), zcVar));
        }
    }

    public final void c(xj4 xj4Var, List<lm8> list) {
        z65.h(xj4Var, ProductEntity.TYPE_PIZZA);
        z65.h(list, "productTags");
        un3.e(this.a);
        un3.e(this.e);
        un3.e(this.l);
        un3.k(this.i);
        this.j.setText(xj4Var.e());
        i(list, this.k, xj4Var);
    }

    public final void d(String str, hn6 hn6Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        this.a.setVisibility(8);
        this.e.setVisibility(8);
        this.j.setText(str);
        this.i.setVisibility(0);
    }

    public final void e(xj4 xj4Var, List<lm8> list) {
        z65.h(xj4Var, ProductEntity.TYPE_PIZZA);
        z65.h(list, "productTags");
        un3.e(this.i);
        un3.k(this.a);
        un3.e(this.c);
        this.b.setText(xj4Var.e());
        i(list, this.d, xj4Var);
    }

    public final void f(String str, hn6 hn6Var) {
        String str2;
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        this.i.setVisibility(8);
        this.b.setText(str);
        TextView textView = this.c;
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(r09.V0, un6.b(hn6Var));
        } else {
            str2 = null;
        }
        textView.setText(str2);
        this.a.setVisibility(0);
    }

    public final void g(xj4 xj4Var, List<lm8> list) {
        z65.h(xj4Var, ProductEntity.TYPE_PIZZA);
        z65.h(list, "productTags");
        un3.e(this.i);
        un3.k(this.e);
        un3.e(this.g);
        this.f.setText(xj4Var.e());
        i(list, this.h, xj4Var);
    }

    public final void h(String str, hn6 hn6Var) {
        String str2;
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        this.i.setVisibility(8);
        this.f.setText(str);
        TextView textView = this.g;
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(r09.V0, un6.b(hn6Var));
        } else {
            str2 = null;
        }
        textView.setText(str2);
        this.e.setVisibility(0);
    }

    public final void setOnTagClickListener(Function1<? super mm8, Unit> function1) {
        z65.h(function1, "listener");
        this.n = function1;
    }
}
