package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: DebugView.kt */
@StateStrategyType(SkipStrategy.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J+\u0010\f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H'¨\u0006\u0014"}, d2 = {"Lno2;", "Lmoxy/MvpView;", "", RemoteMessageConst.Notification.URL, "", "Zd", "", "isChecked", "oc", "", "environmentsName", "environmentsUrl", "N6", "([Ljava/lang/String;[Ljava/lang/String;)V", "I4", "token", "K1", "zg", "Bc", "y", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: no2  reason: default package */
/* loaded from: classes4.dex */
public interface no2 extends MvpView {
    void Bc();

    void I4(String[] strArr, String[] strArr2);

    void K1(String str);

    void N6(String[] strArr, String[] strArr2);

    void Zd(String str);

    void oc(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void y();

    void zg();
}
