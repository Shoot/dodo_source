package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: TogglesView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H'¨\u0006\t"}, d2 = {"Ljib;", "Lmoxy/MvpView;", "Ll6;", "Lbib;", "toggles", "", "H2", "y", "finish", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jib  reason: default package */
/* loaded from: classes.dex */
public interface jib extends MvpView {
    void H2(l6<bib> l6Var);

    @StateStrategyType(SkipStrategy.class)
    void finish();

    void y();
}
