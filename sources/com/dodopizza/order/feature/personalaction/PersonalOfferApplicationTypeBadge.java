package com.dodopizza.order.feature.personalaction;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PersonalOfferApplicationTypeBadge.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/dodopizza/order/feature/personalaction/PersonalOfferApplicationTypeBadge;", "Landroidx/cardview/widget/CardView;", "", "label", "", "setLabel", "iconResource", "setIcon", "", "showIcon", e.a, "Landroid/widget/TextView;", "j", "Lk79;", "getBadgeLabel", "()Landroid/widget/TextView;", "badgeLabel", "Landroid/widget/ImageView;", "k", "getBadgeIcon", "()Landroid/widget/ImageView;", "badgeIcon", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PersonalOfferApplicationTypeBadge extends CardView {
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(PersonalOfferApplicationTypeBadge.class, "badgeLabel", "getBadgeLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalOfferApplicationTypeBadge.class, "badgeIcon", "getBadgeIcon()Landroid/widget/ImageView;", 0))};
    public static final int m = 8;
    private final k79 j;
    private final k79 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalOfferApplicationTypeBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.j = kb0.d(this, gy8.personal_offer_order_type_badge_label);
        this.k = kb0.d(this, gy8.personal_offer_order_type_badge_icon);
        View.inflate(getContext(), gz8.item_personal_offer_order_type_badge, this);
    }

    private final ImageView getBadgeIcon() {
        return (ImageView) this.k.a(this, l[1]);
    }

    private final TextView getBadgeLabel() {
        return (TextView) this.j.a(this, l[0]);
    }

    public final void e(boolean z) {
        if (z) {
            un3.k(getBadgeIcon());
        } else {
            un3.e(getBadgeIcon());
        }
    }

    public final void setIcon(int i) {
        getBadgeIcon().setImageResource(i);
    }

    public final void setLabel(int i) {
        getBadgeLabel().setText(getResources().getText(i));
    }
}
