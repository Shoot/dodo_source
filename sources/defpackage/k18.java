package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: PersonalOffersView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H'J\b\u0010\f\u001a\u00020\u0002H'J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH'J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H'J\b\u0010\u0013\u001a\u00020\u0002H'J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H'J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H'J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH&J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H'J\u0016\u0010%\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140#H&J\b\u0010&\u001a\u00020\u0002H'J\b\u0010'\u001a\u00020\u0002H&J\b\u0010(\u001a\u00020\u0002H&J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0016H'J\b\u0010+\u001a\u00020\u0002H&¨\u0006,"}, d2 = {"Lk18;", "Lmoxy/MvpView;", "", "Nc", "L2", "W5", "le", "Pd", "vd", "q8", "Y9", "Me", "ub", "", "message", "j0", "", "messageResId", "R0", "I9", "Lp67;", "personalOffer", "Lcq8;", "sender", "l3", "Lrb1;", "collaborationPromo", "Gg", "blockTitle", "A4", "textAppearance", "z3", "", "visible", "D8", "", "personalOffersVO", "F8", "I0", "i9", "K4", "Lt2a;", "Re", "V2", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k18  reason: default package */
/* loaded from: classes2.dex */
public interface k18 extends MvpView {
    void A4(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void D8(boolean z);

    void F8(List<? extends p67> list);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Gg(rb1 rb1Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void I0();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void I9();

    void K4();

    void L2();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Me();

    void Nc();

    void Pd();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void R0(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Re(t2a t2aVar, cq8 cq8Var);

    void V2();

    void W5();

    void Y9();

    void i9();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void j0(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void l3(p67 p67Var, cq8 cq8Var);

    void le();

    void q8();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void ub();

    void vd();

    void z3(int i);
}
