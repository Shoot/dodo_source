package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: CashChargeView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0002H&¨\u0006\u0017"}, d2 = {"Lys0;", "Lmoxy/MvpView;", "", "P", "a", "Lhn6;", "money", "Cd", "Vf", "b3", "Fc", "H8", "Z", "", "isEnabled", "C5", "", "currencySymbol", "h3", "D3", "amount", "rg", "u0", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ys0  reason: default package */
/* loaded from: classes4.dex */
public interface ys0 extends MvpView {
    void C5(boolean z);

    void Cd(hn6 hn6Var);

    void D3(String str);

    void Fc();

    void H8();

    void P();

    void Vf();

    void Z();

    void a();

    void b3();

    void h3(String str);

    void rg(String str);

    void u0();
}
