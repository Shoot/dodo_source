package defpackage;

import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderHistoryDetailsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0004H'J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H'J\u0016\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019H&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H&J\b\u0010\"\u001a\u00020\u0004H&J\b\u0010#\u001a\u00020\u0004H&¨\u0006$"}, d2 = {"Lse7;", "Lmoxy/MvpView;", "", "title", "", "r", "Lhn6;", "price", "J0", "Ljk7;", MessageAttributes.TYPE, "M1", "address", "A0", "date", "p8", "b", "w", "U", "", "isVisible", "j5", "uc", "Od", "ic", "", "Lz21;", "checks", "s3", "Lxf7;", "orderItems", "n9", "deliveryFee", "D0", "r0", "J", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: se7  reason: default package */
/* loaded from: classes2.dex */
public interface se7 extends MvpView {
    void A0(String str);

    void D0(hn6 hn6Var);

    void J();

    void J0(hn6 hn6Var);

    void M1(jk7 jk7Var);

    void Od();

    @StateStrategyType(SkipStrategy.class)
    void U();

    void b();

    @StateStrategyType(SkipStrategy.class)
    void ic();

    void j5(boolean z);

    void n9(List<? extends xf7> list);

    void p8(String str);

    void r(String str);

    void r0();

    @StateStrategyType(SkipStrategy.class)
    void s3(List<z21> list);

    void uc();

    void w();
}
