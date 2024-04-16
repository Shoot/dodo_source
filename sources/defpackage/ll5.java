package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: LandingSMSInputView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0002H&¨\u0006\u0015"}, d2 = {"Lll5;", "Lmoxy/MvpView;", "", "R", "h0", e.a, "", CrashHianalyticsData.TIME, "F9", "", "addressText", "setAddress", "E8", "delayTime", "f0", "", "isLoading", "l", "Fb", "i2", "Q8", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ll5  reason: default package */
/* loaded from: classes4.dex */
public interface ll5 extends MvpView {
    void E8();

    void F9(long j);

    void Fb();

    void Q8();

    void R();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void e();

    void f0(long j);

    void h0();

    void i2();

    void l(boolean z);

    void setAddress(String str);
}
