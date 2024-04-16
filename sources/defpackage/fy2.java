package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a;
/* compiled from: DeliveryLocationDetailsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0005H'J\b\u0010\u0015\u001a\u00020\u0005H'¨\u0006\u0016"}, d2 = {"Lfy2;", "Lmoxy/MvpView;", "", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "fields", "", "m5", "", "mainAddress", "bc", "fc", "Ng", "ia", "w", "targetView", "Sf", "a", "", "visible", "P8", "o2", "y0", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fy2  reason: default package */
/* loaded from: classes4.dex */
public interface fy2 extends MvpView {
    void Ng();

    void P8(boolean z);

    void Sf(a aVar);

    void a();

    void bc(String str);

    void fc(String str);

    void ia();

    void m5(List<? extends a> list);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void o2();

    void w();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void y0();
}
