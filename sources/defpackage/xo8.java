package defpackage;

import com.dodopizza.profile.feature.profilesettings.presentation.a;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: ProfileView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\u0004H'J\b\u0010\b\u001a\u00020\u0004H'J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H'J\b\u0010\u0011\u001a\u00020\u0004H'J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\tH&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\b\u0010\u001e\u001a\u00020\u0004H&J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0012H'J\b\u0010!\u001a\u00020\u0004H&J\b\u0010\"\u001a\u00020\u0004H&J\b\u0010#\u001a\u00020\u0004H&J\b\u0010$\u001a\u00020\u0004H&J\b\u0010%\u001a\u00020\u0004H&J\b\u0010&\u001a\u00020\u0004H'J\b\u0010'\u001a\u00020\u0004H'J\b\u0010(\u001a\u00020\u0004H'J\u0016\u0010+\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\tH'J\b\u0010,\u001a\u00020\u0004H&J\b\u0010-\u001a\u00020\u0004H&J\b\u0010.\u001a\u00020\u0004H&J\b\u0010/\u001a\u00020\u0004H&J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0012H'J \u00107\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H'J0\u0010=\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u000204H&J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0002H&J\b\u0010@\u001a\u00020\u0004H&¨\u0006A"}, d2 = {"Lxo8;", "Lmoxy/MvpView;", "", "orderNumber", "", "N2", "S", "o0", "nc", "", "Lwl7;", "activeOrders", "C1", "F1", "la", "b5", "b0", "Q1", "", "aboutMissionUrl", "We", "nb", "Lul6;", "loyaltyMissions", "ne", "q3", "kd", "T3", "H3", "k6", "t8", "infoStoryId", "F", "F5", "gb", "ca", "Xg", "D6", "d7", "A2", "Lb", "Lq4c;", "widgets", "ng", "k0", "U3", "j7", "Kb", "phone", "a0", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "", "isNativeChatEnabled", "isAuth", "hg", "versionName", "versionCode", "buildType", "rcVersion", "isDebug", "id", "count", Image.TYPE_HIGH, "i", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xo8  reason: default package */
/* loaded from: classes4.dex */
public interface xo8 extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void A2();

    void C1(List<wl7> list);

    void D6();

    @StateStrategyType(SkipStrategy.class)
    void F(String str);

    void F1();

    void F5();

    void H3();

    void Kb();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Lb();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void N2(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Q1();

    @StateStrategyType(SkipStrategy.class)
    void S();

    void T3();

    void U3();

    void We(String str);

    void Xg();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void a0(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void b0();

    void b5();

    void ca();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void d7();

    void gb();

    void h(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void hg(a aVar, boolean z, boolean z2);

    void i();

    void id(String str, int i, String str2, int i2, boolean z);

    void j7();

    void k0();

    void k6();

    void kd();

    void la();

    void nb();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void nc();

    void ne(List<ul6> list);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void ng(List<? extends q4c> list);

    @StateStrategyType(SkipStrategy.class)
    void o0();

    void q3();

    void t8();
}
