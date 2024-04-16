package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: ProfileSettingsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H'J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006H&J\b\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0004H'J\b\u0010\u0019\u001a\u00020\u0004H'J\b\u0010\u001a\u001a\u00020\u0004H'J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\b\u0010\u001e\u001a\u00020\u0004H&J\b\u0010\u001f\u001a\u00020\u0004H'J\b\u0010 \u001a\u00020\u0004H&J\b\u0010!\u001a\u00020\u0004H&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H&J\b\u0010%\u001a\u00020\u0004H&J\b\u0010&\u001a\u00020\u0004H&J\b\u0010'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0004H&J\b\u0010)\u001a\u00020\u0004H&J\b\u0010*\u001a\u00020\u0004H&J\b\u0010+\u001a\u00020\u0004H&J\b\u0010,\u001a\u00020\u0004H&J\b\u0010-\u001a\u00020\u0004H&J0\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u0002H&¨\u00065"}, d2 = {"Lqo8;", "Lmoxy/MvpView;", "", "isSms", "", "t6", "", Action.NAME_ATTRIBUTE, "v4", "phoneNumber", "t3", "email", "Ba", "J4", "g5", "i5", "aa", "birthdayString", "F7", "birthday", "P3", "notFullBirthday", "b6", "ya", "o5", "ed", "u7", "ef", "x2", "g7", "l7", "X1", "k1", "Y1", "", "deletingDateUtcMillis", "ue", "Cb", "m9", "Oc", "h6", "Z5", "y4", "Qe", "Jd", "k0", "versionName", "", "versionCode", "buildType", "rcVersion", "isDebug", "qa", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qo8  reason: default package */
/* loaded from: classes2.dex */
public interface qo8 extends MvpView {
    void Ba(String str);

    void Cb();

    @StateStrategyType(SkipStrategy.class)
    void F7(String str);

    void J4();

    void Jd();

    void Oc();

    void P3(String str);

    void Qe();

    @StateStrategyType(SkipStrategy.class)
    void X1();

    void Y1();

    void Z5();

    void aa();

    void b6(String str);

    @StateStrategyType(SkipStrategy.class)
    void ed();

    void ef();

    void g5();

    void g7();

    void h6();

    void i5();

    void k0();

    void k1();

    void l7();

    void m9();

    @StateStrategyType(SkipStrategy.class)
    void o5();

    void qa(String str, int i, String str2, int i2, boolean z);

    void t3(String str);

    void t6(boolean z);

    @StateStrategyType(SkipStrategy.class)
    void u7();

    void ue(long j);

    void v4(String str);

    void x2();

    void y4();

    void ya();
}
