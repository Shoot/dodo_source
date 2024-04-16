package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: LoyaltyView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H&J\b\u0010$\u001a\u00020\u0004H&J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020!H&¨\u0006'"}, d2 = {"La36;", "Lmoxy/MvpView;", "", "balance", "", "h2", "Dg", "p2", "n5", "lb", "", "addedProductsCount", "B3", "", "Lb26;", "categoriesVO", "qd", "M3", "M7", "Nf", "Kd", "Q9", "", "operations", "R7", "b4", "Ea", "t5", "Sb", "z6", "expirationPeriodInDays", "extraExpirationPeriodInDays", "td", "Lxa1;", "coinsExpirations", "Sd", "cc", "coinsExpirationsMore", "Se", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a36  reason: default package */
/* loaded from: classes2.dex */
public interface a36 extends MvpView {
    void B3(int i);

    void Dg();

    void Ea();

    void Kd();

    void M3();

    void M7();

    void Nf();

    void Q9();

    void R7(List<? extends Object> list);

    void Sb();

    void Sd(xa1 xa1Var);

    void Se(xa1 xa1Var, xa1 xa1Var2);

    void b4();

    void cc();

    void h2(double d);

    void lb();

    void n5();

    void p2();

    void qd(List<b26> list);

    void t5();

    void td(int i, int i2);

    void z6();
}
