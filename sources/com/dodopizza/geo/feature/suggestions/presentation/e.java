package com.dodopizza.geo.feature.suggestions.presentation;

import com.dodopizza.geo.feature.suggestions.presentation.g;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: DeliveryLocationSuggestionsView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H'J\b\u0010\n\u001a\u00020\u0007H'J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0007H&J\b\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0007H&J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u001d\u001a\u00020\u0007H&J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005H&J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H&J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020 H'J\b\u0010%\u001a\u00020\u0007H'¨\u0006&"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/e;", "Lmoxy/MvpView;", "", "Le2b;", "suggestions", "", "isShowDistance", "", "b7", "I7", "b9", "u8", "Tf", "V", "g2", "ma", "Sa", "Ka", "a", "isVisible", "c8", "", "formattedAddress", "m6", "B7", "j1", "Nd", "hint", "Jf", "Ma", "isShouldBeVisible", "Rc", "Lcom/dodopizza/geo/feature/suggestions/presentation/g$a;", "deliveryLocation", "W6", "location", "E4", "k", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface e extends MvpView {
    void B7();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void E4(g.a aVar);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void I7();

    void Jf(String str);

    void Ka();

    void Ma();

    void Nd();

    void Rc(boolean z);

    void Sa();

    void Tf();

    void V();

    void W6(g.a aVar);

    void a();

    void b7(List<e2b> list, boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void b9();

    void c8(boolean z);

    void g2();

    void j1();

    @StateStrategyType(SkipStrategy.class)
    void k();

    void m6(String str);

    void ma();

    void u8();
}
