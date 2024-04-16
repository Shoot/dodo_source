package com.dodopizza.order.feature.shoppingcart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartPersonalPriceBadgeView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/view/CartPersonalPriceBadgeView;", "Landroid/widget/LinearLayout;", "", "timeRemain", "", "setTimeRemain", "", "enabled", "setEnabled", "Landroid/widget/ImageView;", "a", "Lk79;", "getIcon", "()Landroid/widget/ImageView;", RemoteMessageConst.Notification.ICON, "Landroid/widget/TextView;", "b", "getTimeRemainText", "()Landroid/widget/TextView;", "timeRemainText", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CartPersonalPriceBadgeView extends LinearLayout {
    static final /* synthetic */ je5<Object>[] c = {bc9.f(new ar8(CartPersonalPriceBadgeView.class, RemoteMessageConst.Notification.ICON, "getIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(CartPersonalPriceBadgeView.class, "timeRemainText", "getTimeRemainText()Landroid/widget/TextView;", 0))};
    public static final int d = 8;
    private final k79 a;
    private final k79 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartPersonalPriceBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    private final ImageView getIcon() {
        return (ImageView) this.a.a(this, c[0]);
    }

    private final TextView getTimeRemainText() {
        return (TextView) this.b.a(this, c[1]);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getIcon().setEnabled(z);
        getTimeRemainText().setEnabled(z);
    }

    public final void setTimeRemain(String str) {
        z65.h(str, "timeRemain");
        getTimeRemainText().setText(str);
    }

    public /* synthetic */ CartPersonalPriceBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartPersonalPriceBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kb0.d(this, gy8.personal_price_icon);
        this.b = kb0.d(this, gy8.personal_price_time_remain);
        setOrientation(0);
        View.inflate(context, gz8.personal_price_badge_in_cart_view, this);
    }
}
