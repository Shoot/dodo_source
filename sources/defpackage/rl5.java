package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: LandingView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H'J\b\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lrl5;", "Lmoxy/MvpView;", "", "title", "", "r", "subtitle", "F3", "y6", Action.NAME_ATTRIBUTE, "F0", "p7", RemoteMessageConst.Notification.URL, "M5", "S2", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rl5  reason: default package */
/* loaded from: classes4.dex */
public interface rl5 extends MvpView {
    void F0(String str);

    void F3(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void M5(String str);

    void S2();

    void p7();

    void r(String str);

    void y6();
}
