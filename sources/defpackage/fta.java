package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: StackGameView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0019\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0006H&J\b\u0010\u0015\u001a\u00020\u0006H&J\b\u0010\u0016\u001a\u00020\u0006H&J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH&J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\fH&J\b\u0010\u001d\u001a\u00020\u0006H&J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0002H&J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H&J\b\u0010#\u001a\u00020\u0006H&J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0002H&J\b\u0010&\u001a\u00020\u0006H&J\b\u0010'\u001a\u00020\u0006H&¨\u0006("}, d2 = {"Lfta;", "Lmoxy/MvpView;", "", RemoteMessageConst.Notification.URL, "Lnc4;", "environmentSettings", "", "Z3", "q6", "Lpc4;", "gameSettings", "te", "", "newPointCount", "S6", "", "newCounter", "maxCount", "Ra", "j6", "vf", "b", "C", "pointsRatio", "coinsRatio", "A7", "finalAmountCount", "finalPointsCount", "wg", "o7", "claimedRewardAmount", "rewardAnimationUrl", "de", "animationUrl", "O4", "F2", "errorMessage", "Hd", "n2", "jb", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fta  reason: default package */
/* loaded from: classes2.dex */
public interface fta extends MvpView {
    void A7(int i, int i2);

    void C();

    void F2();

    void Hd(String str);

    void O4(String str);

    void Ra(double d, double d2);

    void S6(int i);

    void Z3(String str, nc4 nc4Var);

    void b();

    void de(double d, String str);

    void j6(double d);

    void jb();

    void n2();

    void o7();

    void q6();

    void te(pc4 pc4Var);

    void vf();

    void wg(double d, int i);
}
