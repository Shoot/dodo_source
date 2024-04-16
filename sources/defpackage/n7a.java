package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.app.presentation.selectpizzeria.combined.a;
/* compiled from: SelectPizzeriaCombinedView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\b\u0010\t\u001a\u00020\u0004H'J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H&J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H'J\b\u0010\u0018\u001a\u00020\u0004H'J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H&J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&¨\u0006\""}, d2 = {"Ln7a;", "Lmoxy/MvpView;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "vo", "", "V0", "", "focusOnUser", "o", c.a, "Ld88;", "selectedPizzeria", "showNearbyRestaurantView", "U0", "pizzeria", "Ljb7;", "operationalTypeVo", "Lgn3;", "pizzeriaType", "isShortStreetNameEnabled", "G", "", "phoneNumber", "K", "j", "Lov5;", "location", "X0", "isEnabled", "S0", "Lif0;", "boundingBox", "Y", "M0", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: n7a  reason: default package */
/* loaded from: classes4.dex */
public interface n7a extends MvpView {
    void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z);

    @StateStrategyType(SkipStrategy.class)
    void K(String str);

    void M0(ov5 ov5Var);

    void S0(boolean z);

    void U0(d88 d88Var, boolean z);

    void V0(a aVar);

    void X0(ov5 ov5Var);

    void Y(if0 if0Var);

    @StateStrategyType(SkipStrategy.class)
    void c();

    @StateStrategyType(SkipStrategy.class)
    void j();

    @StateStrategyType(SkipStrategy.class)
    void o(boolean z);
}
