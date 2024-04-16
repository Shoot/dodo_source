package com.dodopizza.order.feature.product.card.presentation.shoppingitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: ShoppingItemNavigationBar.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function0;", "", "listener", "setOnBackButtonClick", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "a", "Lk79;", "getBackButton", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "backButton", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ShoppingItemNavigationBar extends RelativeLayout {
    static final /* synthetic */ je5<Object>[] b = {bc9.f(new ar8(ShoppingItemNavigationBar.class, "backButton", "getBackButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0))};
    public static final int c = 8;
    private final k79 a;

    /* compiled from: ShoppingItemNavigationBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public ShoppingItemNavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(gz8.shopping_item_navigation_bar, this);
        this.a = kb0.d(this, gy8.m);
    }

    private final FloatingActionButton getBackButton() {
        return (FloatingActionButton) this.a.a(this, b[0]);
    }

    public final void setOnBackButtonClick(Function0<Unit> function0) {
        z65.h(function0, "listener");
        oma.a(getBackButton(), new a(function0));
    }
}
