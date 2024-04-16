package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: DeferredTimeView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0014J\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001b\u0010*\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b(\u0010)R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b+\u0010)R\u001b\u0010.\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b-\u0010\u001fR\u001b\u00100\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b/\u0010\u001f¨\u00067"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/DeferredTimeView;", "Lbm7;", "", RemoteMessageConst.Notification.CONTENT, "", e.a, CrashHianalyticsData.TIME, "setPizzeriaDeferredTime", "", "getLayoutId", DateTokenConverter.CONVERTER_KEY, "minutes", "", "isWorkload", "g", c.a, "setCarryoutDeferredTime", "setRestaurantDeferredTime", "setDeliveryDeferredTime", Image.TYPE_HIGH, "description", "f", "Landroid/widget/ImageView;", "a", "Lk79;", "getDeferredTimeClockIcon", "()Landroid/widget/ImageView;", "deferredTimeClockIcon", "Landroid/widget/TextView;", "b", "getDeferredTimeLabel", "()Landroid/widget/TextView;", "deferredTimeLabel", "Landroid/view/ViewGroup;", "getIconsContainer", "()Landroid/view/ViewGroup;", "iconsContainer", "getArrowIcon", "arrowIcon", "Landroid/view/View;", "getProgress", "()Landroid/view/View;", "progress", "getErrorIcon", "errorIcon", "getExpectedMinutesToReceiveForASAP", "expectedMinutesToReceiveForASAP", "getErrorLabel", "errorLabel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeferredTimeView extends bm7 {
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(DeferredTimeView.class, "deferredTimeClockIcon", "getDeferredTimeClockIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(DeferredTimeView.class, "deferredTimeLabel", "getDeferredTimeLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeferredTimeView.class, "iconsContainer", "getIconsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(DeferredTimeView.class, "arrowIcon", "getArrowIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(DeferredTimeView.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(DeferredTimeView.class, "errorIcon", "getErrorIcon()Landroid/view/View;", 0)), bc9.f(new ar8(DeferredTimeView.class, "expectedMinutesToReceiveForASAP", "getExpectedMinutesToReceiveForASAP()Landroid/widget/TextView;", 0)), bc9.f(new ar8(DeferredTimeView.class, "errorLabel", "getErrorLabel()Landroid/widget/TextView;", 0))};
    public static final int j = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;

    public DeferredTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = kb0.d(this, gy8.deferred_time_clock_icon);
        this.b = kb0.d(this, gy8.deferred_time_label);
        this.c = kb0.d(this, gy8.icons_container);
        this.d = kb0.d(this, gy8.arrow_icon);
        this.e = kb0.d(this, gy8.g3);
        this.f = kb0.d(this, gy8.u0);
        this.g = kb0.d(this, gy8.expected_minutes_to_receive_for_asap);
        this.h = kb0.d(this, gy8.error_label);
    }

    private final void e(String str) {
        un3.e(getErrorLabel());
        n1c.e(getIconsContainer(), getArrowIcon());
        getDeferredTimeLabel().setText(str);
        getDeferredTimeLabel().setTextColor(iu1.c(getContext(), ew8.A));
        getDeferredTimeClockIcon().clearColorFilter();
        getArrowIcon().clearColorFilter();
    }

    private final ImageView getArrowIcon() {
        return (ImageView) this.d.a(this, i[3]);
    }

    private final ImageView getDeferredTimeClockIcon() {
        return (ImageView) this.a.a(this, i[0]);
    }

    private final TextView getDeferredTimeLabel() {
        return (TextView) this.b.a(this, i[1]);
    }

    private final View getErrorIcon() {
        return (View) this.f.a(this, i[5]);
    }

    private final TextView getErrorLabel() {
        return (TextView) this.h.a(this, i[7]);
    }

    private final TextView getExpectedMinutesToReceiveForASAP() {
        return (TextView) this.g.a(this, i[6]);
    }

    private final ViewGroup getIconsContainer() {
        return (ViewGroup) this.c.a(this, i[2]);
    }

    private final View getProgress() {
        return (View) this.e.a(this, i[4]);
    }

    private final void setPizzeriaDeferredTime(String str) {
        String string = getResources().getString(r09.checkout_deferred_time_carryout_format, str);
        z65.g(string, "getString(...)");
        e(string);
    }

    public final void c() {
        un3.e(getExpectedMinutesToReceiveForASAP());
    }

    public final void d() {
        String string = getResources().getString(r09.checkout_deferred_time_faster);
        z65.g(string, "getString(...)");
        e(string);
    }

    public final void f(String str) {
        z65.h(str, "description");
        if (str.length() == 0) {
            str = getContext().getString(r09.invalid_deferred_time);
        }
        z65.e(str);
        getErrorLabel().setText(str);
        un3.k(getErrorLabel());
        n1c.e(getIconsContainer(), getErrorIcon());
    }

    public final void g(int i2, boolean z) {
        int i3;
        getExpectedMinutesToReceiveForASAP().setText(getResources().getQuantityString(e09.expected_minutes_to_receive_for_asap_plural, i2, Integer.valueOf(i2)));
        if (z) {
            i3 = ew8.textIconAccentColor;
        } else if (!z) {
            i3 = ew8.B;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        getExpectedMinutesToReceiveForASAP().setTextColor(iu1.c(getContext(), i3));
        un3.k(getExpectedMinutesToReceiveForASAP());
    }

    @Override // defpackage.bm7
    protected int getLayoutId() {
        return gz8.checkout_deferred_time_view;
    }

    public final void h() {
        un3.e(getErrorLabel());
        n1c.e(getIconsContainer(), getProgress());
    }

    public final void setCarryoutDeferredTime(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        setPizzeriaDeferredTime(str);
    }

    public final void setDeliveryDeferredTime(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        String string = getResources().getString(r09.checkout_deferred_time_delivery_format, str);
        z65.g(string, "getString(...)");
        e(string);
    }

    public final void setRestaurantDeferredTime(String str) {
        z65.h(str, CrashHianalyticsData.TIME);
        setPizzeriaDeferredTime(str);
    }
}
