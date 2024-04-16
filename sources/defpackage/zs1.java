package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: ContactsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH&J\u0012\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0004H&¨\u0006\u0015"}, d2 = {"Lzs1;", "Lmoxy/MvpView;", "", "phone", "", "a0", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "", "isError", "L", "Las1;", "contactInfoVO", "isSupportInProfile", "G9", "", "text", "Ec", "count", Image.TYPE_HIGH, "i", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: zs1  reason: default package */
/* loaded from: classes4.dex */
public interface zs1 extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void Ec(int i);

    void G9(as1 as1Var, boolean z);

    @StateStrategyType(SkipStrategy.class)
    void L(boolean z);

    @StateStrategyType(SkipStrategy.class)
    void a0(String str);

    @StateStrategyType(SkipStrategy.class)
    void d(String str);

    void h(int i);

    void i();
}
