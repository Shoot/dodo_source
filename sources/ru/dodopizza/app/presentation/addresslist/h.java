package ru.dodopizza.app.presentation.addresslist;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/h;", "Lmoxy/MvpView;", "", "A8", "L4", "Lou2;", "deliverablePlace", "bg", "Lru/dodopizza/app/presentation/addresslist/i$b;", "request", "q7", "r7", "Ye", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface h extends MvpView {
    void A8();

    void L4();

    void Ye();

    void bg(ou2 ou2Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void q7(i.b bVar);

    void r7(ou2 ou2Var);
}
