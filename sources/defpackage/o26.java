package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: LoyaltyProductsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\nH&J\b\u0010\u0015\u001a\u00020\u0005H&¨\u0006\u0016"}, d2 = {"Lo26;", "Lmoxy/MvpView;", "", "", "items", "", "u", "", "points", "re", "", "title", "r", "pointsPrice", "V4", "minLegalPrice", "De", "neededPointPrice", "mf", "productName", "D2", "u0", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o26  reason: default package */
/* loaded from: classes2.dex */
public interface o26 extends MvpView {
    void D2(String str);

    void De(double d, String str);

    void V4(double d);

    void mf(double d);

    void r(String str);

    void re(double d);

    void u(List<? extends Object> list);

    void u0();
}
