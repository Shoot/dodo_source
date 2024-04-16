package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.c;
/* compiled from: PaymentMethodListView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lxt7;", "Lmoxy/MvpView;", "", "vb", "Og", "", "isVisible", "Ce", "", "cardsToRemoveCount", "H4", "U8", "P", "Z8", "isLoading", "ra", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/c;", "error", "o6", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xt7  reason: default package */
/* loaded from: classes4.dex */
public interface xt7 extends MvpView {
    void Ce(boolean z);

    void H4(int i);

    void Og();

    void P();

    void U8();

    void Z8(boolean z);

    void o6(c cVar);

    void ra(boolean z);

    void vb();
}
