package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: OrderDetailsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\rH&J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H&J\u001c\u0010\u001a\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H&J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rH&J\b\u0010\"\u001a\u00020\u0004H&J\b\u0010#\u001a\u00020\u0004H&¨\u0006$"}, d2 = {"Lpd7;", "Lmoxy/MvpView;", "", "num", "", "setTitle", "", "Lhd7;", "goods", "A3", "Ljd7;", "sauces", "Nb", "Lhn6;", "total", "L0", "", "addressText", "D7", "cost", "eh", "saucesCount", "freeSaucesCount", "v2", "timeFrom", "timeTo", "I8", "exactTime", "Oa", "Ljk7;", "orderType", "zf", "deliveryFee", "D0", "r0", "J", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pd7  reason: default package */
/* loaded from: classes.dex */
public interface pd7 extends MvpView {
    void A3(List<hd7> list);

    void D0(hn6 hn6Var);

    void D7(String str);

    void I8(String str, String str2);

    void J();

    void L0(hn6 hn6Var);

    void Nb(List<jd7> list);

    void Oa(String str);

    void eh(hn6 hn6Var);

    void r0();

    void setTitle(int i);

    void v2(int i, int i2);

    void zf(jk7 jk7Var);
}
