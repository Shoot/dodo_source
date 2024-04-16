package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderRatingView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0016\u0010\u001a\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\b\u0010\u001e\u001a\u00020\u0004H&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH&J\b\u0010&\u001a\u00020\u0004H&J\b\u0010'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0004H&J\b\u0010)\u001a\u00020\u0004H&J\b\u0010*\u001a\u00020\u0004H&J\b\u0010+\u001a\u00020\u0004H&J\b\u0010,\u001a\u00020\u0004H&J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H'J\u0010\u00100\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J\u0010\u00102\u001a\u00020\u00042\u0006\u0010.\u001a\u000201H'J\u0010\u00103\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J\u0010\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u000eH'J\b\u00106\u001a\u00020\u0004H'¨\u00067"}, d2 = {"Lci7;", "Lmoxy/MvpView;", "", "ratingValue", "", "W0", "v0", "N5", "s8", "g0", "B0", "p3", "pg", "g1", "", "productsName", "N4", "Rd", "commentText", "Bd", "oa", "O6", "ba", "", "Lr69;", "tags", "d3", "ka", "cd", "v6", "Aa", "", "visible", "sg", "Les1;", MessageAttributes.TYPE, "checked", "Ze", "Ue", "Vb", "zd", "Gd", "Q3", "N7", "if", "Lez1;", "data", "t0", "q0", "Lvm9;", Image.TYPE_SMALL, "H", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "e5", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ci7  reason: default package */
/* loaded from: classes.dex */
public interface ci7 extends MvpView {
    void Aa();

    void B0();

    void Bd(String str);

    void Gd();

    void H(boolean z);

    void N4(String str);

    void N5();

    void N7();

    void O6();

    void Q3();

    void Rd();

    void Ue();

    void Vb();

    void W0(int i);

    void Ze(es1 es1Var, boolean z);

    void ba();

    void cd();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void d(String str);

    void d3(List<r69> list);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void e5();

    void g0();

    void g1();

    /* renamed from: if */
    void mo0if();

    void ka();

    void oa();

    void p3();

    void pg(int i);

    void q0(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void s(vm9 vm9Var);

    void s8();

    void sg(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void t0(ez1 ez1Var);

    void v0();

    void v6();

    void zd();
}
