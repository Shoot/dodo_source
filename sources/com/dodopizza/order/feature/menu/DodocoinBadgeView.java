package com.dodopizza.order.feature.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DodocoinBadgeView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/order/feature/menu/DodocoinBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "b", "", "balance", "setBalance", "colorIdRes", "setBadgeColor", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DodocoinBadgeView extends ConstraintLayout {
    public static final a a = new a(null);

    /* compiled from: DodocoinBadgeView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/menu/DodocoinBadgeView$a;", "", "", "MINIMUM_WIDTH", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DodocoinBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        b(context, attributeSet, 0);
    }

    private final void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y19.k0, i, 0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = obtainStyledAttributes.getBoolean(y19.l0, false);
        obtainStyledAttributes.recycle();
        if (z) {
            View.inflate(context, gz8.dodocoin_badge_violet, this);
        } else {
            View.inflate(context, gz8.dodocoin_badge, this);
        }
        setMinimumWidth(jx9.a.a(52));
    }

    public final void setBadgeColor(int i) {
        findViewById(gy8.dodo_badge_background).setBackgroundTintList(iu1.d(getContext(), i));
    }

    public final void setBalance(CharSequence charSequence) {
        z65.h(charSequence, "balance");
        ((TextView) findViewById(gy8.dodo_badge_value)).setText(charSequence);
    }
}
