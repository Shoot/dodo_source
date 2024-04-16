package com.dodopizza.activeorder.feature.orderstate.presentation;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.compositeprogressbar.CompositeProgressBar;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: OrderStateView.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u001b\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00100\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010-R\u001b\u00102\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b1\u0010-R\u001b\u00106\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010<¨\u0006D"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "j", "", CrashHianalyticsData.TIME, "k", DateTokenConverter.CONVERTER_KEY, "timeRemaining", Image.TYPE_HIGH, "timeRemain", "setTimer", "", "title", "setTitle", "subTitle", "setSubTitle", "i", e.a, "g", "", "current", "total", "f", "onDetachedFromWindow", "Lahb;", "a", "Lahb;", "getTimerFormatter", "()Lahb;", "setTimerFormatter", "(Lahb;)V", "timerFormatter", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;", "b", "Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;", "getTimerCallback", "()Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;", "setTimerCallback", "(Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;)V", "timerCallback", "Landroid/widget/TextView;", c.a, "Lk79;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "getSubTitleView", "subTitleView", "getTimerView", "timerView", "Landroid/view/View;", "getCheckMarkView", "()Landroid/view/View;", "checkMarkView", "Lcom/dodopizza/android/view/custom/compositeprogressbar/CompositeProgressBar;", "getProgressView", "()Lcom/dodopizza/android/view/custom/compositeprogressbar/CompositeProgressBar;", "progressView", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "timer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderStateView extends ConstraintLayout {
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(OrderStateView.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderStateView.class, "subTitleView", "getSubTitleView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderStateView.class, "timerView", "getTimerView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(OrderStateView.class, "checkMarkView", "getCheckMarkView()Landroid/view/View;", 0)), bc9.f(new ar8(OrderStateView.class, "progressView", "getProgressView()Lcom/dodopizza/android/view/custom/compositeprogressbar/CompositeProgressBar;", 0))};
    private ahb a;
    private a b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private CountDownTimer h;

    /* compiled from: OrderStateView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$a;", "", "", "Jc", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface a {
        void Jc();
    }

    /* compiled from: OrderStateView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/dodopizza/activeorder/feature/orderstate/presentation/OrderStateView$b", "Landroid/os/CountDownTimer;", "", "timeRemaining", "", "onTick", "onFinish", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b extends CountDownTimer {
        final /* synthetic */ OrderStateView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j, OrderStateView orderStateView, long j2) {
            super(j, j2);
            this.a = orderStateView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.a.d();
            a timerCallback = this.a.getTimerCallback();
            if (timerCallback != null) {
                timerCallback.Jc();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            if (j >= TimeUnit.MINUTES.toMillis(1L)) {
                this.a.h(j);
            } else {
                this.a.i();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = new kp4();
        this.c = kb0.d(this, ux8.n0);
        this.d = kb0.d(this, ux8.sub_title);
        this.e = kb0.d(this, ux8.timer);
        this.f = kb0.d(this, ux8.check_mark);
        this.g = kb0.d(this, ux8.d0);
        View.inflate(getContext(), rz8.view_order_state, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.h = null;
    }

    private final View getCheckMarkView() {
        return (View) this.f.a(this, i[3]);
    }

    private final CompositeProgressBar getProgressView() {
        return (CompositeProgressBar) this.g.a(this, i[4]);
    }

    private final TextView getSubTitleView() {
        return (TextView) this.d.a(this, i[1]);
    }

    private final TextView getTimerView() {
        return (TextView) this.e.a(this, i[2]);
    }

    private final TextView getTitleView() {
        return (TextView) this.c.a(this, i[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(long j) {
        getTimerView().setText(this.a.a(j));
    }

    private final void j() {
        un3.k(getTimerView());
        un3.e(getCheckMarkView());
        un3.e(getSubTitleView());
    }

    private final void k(long j) {
        d();
        this.h = new b(j, this, TimeUnit.SECONDS.toMillis(1L)).start();
    }

    public final void e() {
        un3.e(getTimerView());
        d();
        un3.e(getCheckMarkView());
        un3.e(getSubTitleView());
    }

    public final void f(int i2, int i3) {
        if (i3 > 0) {
            un3.k(getProgressView());
            getProgressView().a(i3, i2);
            return;
        }
        un3.e(getProgressView());
    }

    public final void g() {
        un3.e(getTimerView());
        d();
        un3.e(getSubTitleView());
        un3.k(getCheckMarkView());
    }

    public final a getTimerCallback() {
        return this.b;
    }

    public final ahb getTimerFormatter() {
        return this.a;
    }

    public final void i() {
        un3.k(getSubTitleView());
        d();
        un3.e(getTimerView());
        un3.e(getCheckMarkView());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public final void setSubTitle(String str) {
        z65.h(str, "subTitle");
        getSubTitleView().setText(str);
    }

    public final void setTimer(long j) {
        if (j <= 0) {
            i();
            return;
        }
        k(j);
        j();
    }

    public final void setTimerCallback(a aVar) {
        this.b = aVar;
    }

    public final void setTimerFormatter(ahb ahbVar) {
        z65.h(ahbVar, "<set-?>");
        this.a = ahbVar;
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        getTitleView().setText(str);
    }
}
