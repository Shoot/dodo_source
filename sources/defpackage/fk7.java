package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderSummaryView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0011H&J'\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H&J\u0012\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u0007H'J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H&J\b\u0010&\u001a\u00020\u0005H&J\b\u0010'\u001a\u00020\u0005H'J\b\u0010(\u001a\u00020\u0005H'J\b\u0010)\u001a\u00020\u0005H&J\b\u0010*\u001a\u00020\u0005H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H&J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H&J\b\u0010/\u001a\u00020\u0005H&J\b\u00100\u001a\u00020\u0005H&J\b\u00101\u001a\u00020\u0005H'J\b\u00102\u001a\u00020\u0005H'J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0011H'J\u0010\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0011H&J\b\u00107\u001a\u00020\u0005H&J\u0010\u00109\u001a\u00020\u00052\u0006\u0010$\u001a\u000208H'J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u00020+H'J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H'J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0011H'J\b\u0010?\u001a\u00020\u0005H&J\b\u0010@\u001a\u00020\u0005H&J\b\u0010A\u001a\u00020\u0005H&J\b\u0010B\u001a\u00020\u0005H&J\u0018\u0010D\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0011H&J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0007H&J\b\u0010G\u001a\u00020\u0005H&J\b\u0010H\u001a\u00020\u0005H&J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010J\u001a\u00020IH&J\b\u0010L\u001a\u00020\u0005H&J\b\u0010M\u001a\u00020\u0005H&J\b\u0010N\u001a\u00020\u0005H&J\u001a\u0010S\u001a\u00020\u00052\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH&J\u001a\u0010T\u001a\u00020\u00052\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH&J\u001a\u0010V\u001a\u00020\u00052\u0006\u0010U\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH&J\u001a\u0010X\u001a\u00020\u00052\u0006\u0010P\u001a\u00020W2\b\u0010R\u001a\u0004\u0018\u00010QH&J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020+H&J\u0010\u0010]\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H'J\u0010\u0010`\u001a\u00020\u00052\u0006\u0010_\u001a\u00020^H&J\b\u0010a\u001a\u00020\u0005H&J\b\u0010b\u001a\u00020\u0005H'¨\u0006c"}, d2 = {"Lfk7;", "Lmoxy/MvpView;", "", "Leg7;", "goods", "", "Vg", "", "numGoods", "Lhn6;", "costOrder", "T5", "", "timeRemain", "Cc", "x4", "s6", "", RemoteMessageConst.Notification.URL, "Ga", "he", "p1", "orderType", "address", "C4", "titleRes", "", "timeArgs", "G4", "(I[Ljava/lang/String;)V", "value", "total", "V7", "error", "dd", "Lpq3;", "data", "K6", "Md", "wa", "zc", "P7", "G2", "", "available", "u4", "Hc", "s5", "H1", "Xf", "Z4", "phoneNumber", "ec", CrashHianalyticsData.TIME, "H6", "ce", "Lsr6;", "Y4", "visible", "l1", DateTokenConverter.CONVERTER_KEY, "orderNumber", "G7", "Ag", "a3", "J7", "V5", "orderCreatedTimeTitle", "Ob", "tableNumber", "r3", "Ja", "e6", "Lik8;", "levelInfo", "Yb", "Y2", "Ff", "v9", "Lgg7;", "location", "Ltv5;", "icons", "T7", "Xd", "unitLocation", "d8", "Lxf8;", "w2", "isAnimateMove", "Xc", "Lqd;", "sender", "K8", "Loc4;", "gameEntryIcons", "f3", "B1", "B6", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fk7  reason: default package */
/* loaded from: classes.dex */
public interface fk7 extends MvpView {
    void Ag();

    void B1();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void B6();

    void C4(int i, String str);

    void Cc(long j);

    void Ff();

    void G2();

    void G4(int i, String[] strArr);

    @StateStrategyType(SkipStrategy.class)
    void G7(String str);

    void Ga(String str);

    void H1();

    void H6(String str);

    void Hc(boolean z);

    void J7();

    void Ja();

    void K6(pq3 pq3Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void K8(qd qdVar);

    void Md();

    void Ob(int i, String str);

    void P7();

    void T5(int i, hn6 hn6Var);

    void T7(gg7 gg7Var, tv5 tv5Var);

    void V5();

    void V7(int i, int i2);

    void Vg(List<eg7> list);

    void Xc(boolean z);

    void Xd(gg7 gg7Var, tv5 tv5Var);

    @StateStrategyType(SkipStrategy.class)
    void Xf();

    void Y2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Y4(sr6 sr6Var);

    void Yb(ik8 ik8Var);

    @StateStrategyType(SkipStrategy.class)
    void Z4();

    void a3();

    void ce();

    @StateStrategyType(SkipStrategy.class)
    void d(String str);

    void d8(gg7 gg7Var, tv5 tv5Var);

    @StateStrategyType(SkipStrategy.class)
    void dd(int i);

    void e6();

    @StateStrategyType(SkipStrategy.class)
    void ec(String str);

    void f3(oc4 oc4Var);

    void he();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void l1(boolean z);

    void p1();

    void r3(int i);

    void s5();

    void s6();

    void u4(boolean z);

    void v9();

    void w2(xf8 xf8Var, tv5 tv5Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void wa();

    void x4();

    @StateStrategyType(SkipStrategy.class)
    void zc();
}
