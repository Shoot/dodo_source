package defpackage;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: PhoneNumberLoginView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u0004H'J\b\u0010\u000e\u001a\u00020\u0004H'J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bH&J\b\u0010\u0014\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H&¨\u0006\u001a"}, d2 = {"La48;", "Lmoxy/MvpView;", "", "phonePrefix", "", "D", "phoneNumber", "A", "", "shouldBeEnabled", "Tg", "isSending", "Hg", e.a, "t2", "callCenterPhone", "siteUrl", "Bf", "isLoading", "l", "Fe", "fa", "qb", "termsOfUseLink", "personalDataLink", "j2", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a48  reason: default package */
/* loaded from: classes4.dex */
public interface a48 extends MvpView {
    void A(String str);

    void Bf(String str, String str2);

    void D(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Fe();

    void Hg(boolean z);

    void Tg(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void e();

    void fa();

    void j2(String str, String str2);

    void l(boolean z);

    void qb();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void t2();
}
