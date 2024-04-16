package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: RatingAppliedView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH'J\b\u0010\u0010\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&¨\u0006\u0012"}, d2 = {"Ll59;", "Lmoxy/MvpView;", "", "Ud", "Lvm9;", "data", Image.TYPE_SMALL, "", "visible", "H", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "uf", "", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "Z", "ua", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l59  reason: default package */
/* loaded from: classes.dex */
public interface l59 extends MvpView {
    void H(boolean z);

    void Ud();

    void Z();

    @StateStrategyType(SkipStrategy.class)
    void d(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void s(vm9 vm9Var);

    void ua();

    void uf(ay1 ay1Var);
}
