package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: SearchView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lqy9;", "Lmoxy/MvpView;", "", "Lye6;", "results", "Lb78;", "pizzaConcept", "", "X3", "J2", "qc", "", "hint", "X9", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qy9  reason: default package */
/* loaded from: classes4.dex */
public interface qy9 extends MvpView {
    void J2();

    void X3(List<? extends ye6> list, b78 b78Var);

    void X9(String str);

    void qc();
}
