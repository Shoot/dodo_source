package com.dodopizza.order.feature.product.card.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BottomFadingNestedScrollView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/view/BottomFadingNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getTopFadingEdgeStrength", "", "order_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomFadingNestedScrollView extends NestedScrollView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomFadingNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public /* synthetic */ BottomFadingNestedScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomFadingNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }
}
