package ru.dodopizza.app.presentation.product.card.combo;

import java.util.List;
import kotlin.Metadata;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter;
/* compiled from: ComboProductCardView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0004H'J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0016\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH&¨\u0006\u0018"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/e;", "Ljl8;", "Ljh1;", "comboInfoVO", "", "l2", "", "Lru/dodopizza/app/presentation/product/card/combo/h;", "summary", "B2", "f9", "fb", "R2", "Lhn6;", "rawPrice", "price", "Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter$a;", "textOnButton", "Be", "", "toppingsNames", "N8", "k5", "gg", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface e extends jl8 {
    void B2(List<? extends h> list);

    void Be(hn6 hn6Var, hn6 hn6Var2, ComboProductCardPresenter.a aVar);

    void N8(List<String> list);

    @StateStrategyType(SkipStrategy.class)
    void R2();

    void f9(jh1 jh1Var);

    void fb(jh1 jh1Var);

    void gg(hn6 hn6Var);

    void k5(ComboProductCardPresenter.a aVar);

    void l2(jh1 jh1Var);
}
