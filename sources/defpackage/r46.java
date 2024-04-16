package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: MainActivityView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0003H'J\b\u0010\f\u001a\u00020\u0003H'J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H&¨\u0006\u0019"}, d2 = {"Lr46;", "Lmoxy/MvpView;", "Ly60;", "", "Q4", "", "phoneNumber", "siteUrl", "wd", "P1", "fh", "gc", "fe", "cb", "Ha", "c6", "b", "b0", "deepLink", "i1", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "Lqd;", "sender", "X", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: r46  reason: default package */
/* loaded from: classes4.dex */
public interface r46 extends MvpView, y60 {
    void Ha();

    void P1();

    void Q4();

    void X(qd qdVar);

    void b();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void b0();

    void c6();

    void cb();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void d(String str);

    @StateStrategyType(SkipStrategy.class)
    void fe();

    @StateStrategyType(SkipStrategy.class)
    void fh();

    @StateStrategyType(SkipStrategy.class)
    void gc();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void i1(String str);

    void wd(String str, String str2);
}
