package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import ru.dodopizza.mindbox.model.MindboxProperties;
/* compiled from: MainScreenView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H'J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H'J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0016H'J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H'J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000fH'J\b\u0010\u001d\u001a\u00020\u0004H'J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH'J\b\u0010!\u001a\u00020\u0004H'J\b\u0010\"\u001a\u00020\u0004H'¨\u0006#"}, d2 = {"Lp56;", "Lmoxy/MvpView;", "Ln56;", "nextTab", "", "f8", "", "messagesCount", Image.TYPE_HIGH, "i", "goodsCount", "Pa", "yg", "menuTab", "C7", "Lce0;", "specialOffer", "Lcq8;", "sender", "yb", "Lp67;", "personalOffer", "Lh18;", "X5", "Lrb1;", "collaborationPromo", "g4", "promoCodeOffer", "A6", "ad", "Lru/dodopizza/mindbox/model/MindboxProperties;", "mindboxProps", "Kc", "hd", "g6", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p56  reason: default package */
/* loaded from: classes4.dex */
public interface p56 extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void A6(cq8 cq8Var, ce0 ce0Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void C7(n56 n56Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Kc(MindboxProperties mindboxProperties);

    void Pa(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void X5(p67 p67Var, h18 h18Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void ad();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void f8(n56 n56Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void g4(rb1 rb1Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void g6();

    void h(int i);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void hd();

    void i();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void yb(ce0 ce0Var, cq8 cq8Var);

    void yg();
}
