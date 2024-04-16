package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderCompletedView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000bH'J\b\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000eH'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0011H'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H'¨\u0006\u0017"}, d2 = {"Lxc7;", "Lmoxy/MvpView;", "Lll1;", "data", "", "w4", "Lsr6;", "h7", "", "visible", "wc", "Lpq3;", "V6", "B8", "Lez1;", "t0", "q0", "Lvm9;", Image.TYPE_SMALL, "H", "", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xc7  reason: default package */
/* loaded from: classes.dex */
public interface xc7 extends MvpView {
    void B8();

    void H(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void V6(pq3 pq3Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void d(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void h7(sr6 sr6Var);

    void q0(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void s(vm9 vm9Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void t0(ez1 ez1Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void w4(ll1 ll1Var);

    void wc(boolean z);
}
