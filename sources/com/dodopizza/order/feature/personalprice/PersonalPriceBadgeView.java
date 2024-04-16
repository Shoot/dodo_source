package com.dodopizza.order.feature.personalprice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PersonalPriceBadgeView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001a¨\u0006%"}, d2 = {"Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "Landroid/widget/LinearLayout;", "", "text", "", "setDiscountText", CrashHianalyticsData.TIME, "setTimeRemain", "a", "", "enabled", "setEnabled", "Landroid/widget/TextView;", "Lk79;", "getDiscount", "()Landroid/widget/TextView;", "discount", "b", "getDot", "dot", c.a, "getTimeRemainText", "timeRemainText", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "getLeftEdge", "()Landroid/widget/ImageView;", "leftEdge", e.a, "getRightEdge", "rightEdge", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PersonalPriceBadgeView extends LinearLayout {
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(PersonalPriceBadgeView.class, "discount", "getDiscount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalPriceBadgeView.class, "dot", "getDot()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalPriceBadgeView.class, "timeRemainText", "getTimeRemainText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PersonalPriceBadgeView.class, "leftEdge", "getLeftEdge()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PersonalPriceBadgeView.class, "rightEdge", "getRightEdge()Landroid/widget/ImageView;", 0))};
    public static final int g = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;

    public PersonalPriceBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = kb0.d(this, gy8.discount);
        this.b = kb0.d(this, gy8.divider);
        this.c = kb0.d(this, gy8.time_remain);
        this.d = kb0.d(this, gy8.left_edge);
        this.e = kb0.d(this, gy8.right_edge);
        View.inflate(getContext(), gz8.personal_price_badge_view, this);
        un3.e(getDot());
        un3.e(getTimeRemainText());
    }

    private final TextView getDiscount() {
        return (TextView) this.a.a(this, f[0]);
    }

    private final TextView getDot() {
        return (TextView) this.b.a(this, f[1]);
    }

    private final ImageView getLeftEdge() {
        return (ImageView) this.d.a(this, f[3]);
    }

    private final ImageView getRightEdge() {
        return (ImageView) this.e.a(this, f[4]);
    }

    private final TextView getTimeRemainText() {
        return (TextView) this.c.a(this, f[2]);
    }

    public final void a() {
        un3.e(getDot());
        un3.e(getTimeRemainText());
    }

    public final void setDiscountText(String str) {
        z65.h(str, "text");
        getDiscount().setText(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getDot().setEnabled(z);
        getDiscount().setEnabled(z);
        getTimeRemainText().setEnabled(z);
        getLeftEdge().setEnabled(z);
        getRightEdge().setEnabled(z);
    }

    public final void setTimeRemain(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        un3.k(getDot());
        un3.k(getTimeRemainText());
        getTimeRemainText().setText(str);
    }
}
